package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import e9.f;
import j1.b;
import j1.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Recreator implements j {

    /* renamed from: a */
    public final d f2229a;

    /* loaded from: classes.dex */
    public static final class a implements b.AbstractC0077b {

        /* renamed from: a */
        public final Set<String> f2230a = new LinkedHashSet();

        public a(b bVar) {
            f.e(bVar, "registry");
            bVar.b("androidx.savedstate.Restarter", this);
        }

        @Override // j1.b.AbstractC0077b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2230a));
            return bundle;
        }
    }

    public Recreator(d dVar) {
        f.e(dVar, "owner");
        this.f2229a = dVar;
    }

    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        if (bVar == g.b.ON_CREATE) {
            lVar.a().c(this);
            Bundle a10 = this.f2229a.c().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList == null) {
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            for (String str : stringArrayList) {
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.a.class);
                    f.d(asSubclass, "{\n                Class.…class.java)\n            }");
                    try {
                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            Object newInstance = declaredConstructor.newInstance(new Object[0]);
                            f.d(newInstance, "{\n                constr…wInstance()\n            }");
                            ((b.a) newInstance).a(this.f2229a);
                        } catch (Exception e10) {
                            throw new RuntimeException(d7.a.c("Failed to instantiate ", str), e10);
                        }
                    } catch (NoSuchMethodException e11) {
                        StringBuilder c10 = androidx.activity.result.a.c("Class ");
                        c10.append(asSubclass.getSimpleName());
                        c10.append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(c10.toString(), e11);
                    }
                } catch (ClassNotFoundException e12) {
                    throw new RuntimeException(e0.d.a("Class ", str, " wasn't found"), e12);
                }
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
