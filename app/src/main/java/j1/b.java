package j1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import e9.f;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    public boolean f5431b;

    /* renamed from: c */
    public Bundle f5432c;

    /* renamed from: d */
    public boolean f5433d;

    /* renamed from: e */
    public Recreator.a f5434e;

    /* renamed from: a */
    public final m.b<String, AbstractC0077b> f5430a = new m.b<>();

    /* renamed from: f */
    public boolean f5435f = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);
    }

    /* renamed from: j1.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0077b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f5433d) {
            Bundle bundle = this.f5432c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f5432c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f5432c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f5432c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void b(String str, AbstractC0077b abstractC0077b) {
        f.e(abstractC0077b, "provider");
        if (this.f5430a.h(str, abstractC0077b) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void c() {
        if (this.f5435f) {
            Recreator.a aVar = this.f5434e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f5434e = aVar;
            try {
                androidx.lifecycle.f.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f5434e;
                if (aVar2 == null) {
                    return;
                }
                aVar2.f2230a.add(androidx.lifecycle.f.class.getName());
                return;
            } catch (NoSuchMethodException e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Class ");
                c10.append(androidx.lifecycle.f.class.getSimpleName());
                c10.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(c10.toString(), e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
