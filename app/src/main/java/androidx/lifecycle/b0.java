package androidx.lifecycle;

import android.os.Bundle;
import c1.a;
import e9.g;
import e9.k;
import j1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import v8.f;

/* loaded from: classes.dex */
public final class b0 implements b.AbstractC0077b {

    /* renamed from: a */
    public final b f1662a;

    /* renamed from: b */
    public boolean f1663b;

    /* renamed from: c */
    public Bundle f1664c;

    /* renamed from: d */
    public final f f1665d;

    /* loaded from: classes.dex */
    public static final class a extends g implements d9.a<c0> {

        /* renamed from: t */
        public final /* synthetic */ j0 f1666t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var) {
            super(0);
            this.f1666t = j0Var;
        }

        @Override // d9.a
        public final c0 a() {
            c1.a aVar;
            j0 j0Var = this.f1666t;
            e9.f.e(j0Var, "<this>");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c1.g(((e9.b) k.a(c0.class)).a()));
            Object[] array = arrayList.toArray(new c1.g[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            c1.g[] gVarArr = (c1.g[]) array;
            c1.b bVar = new c1.b((c1.g[]) Arrays.copyOf(gVarArr, gVarArr.length));
            i0 w10 = j0Var.w();
            e9.f.d(w10, "owner.viewModelStore");
            if (j0Var instanceof e) {
                aVar = ((e) j0Var).n();
                e9.f.d(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
            } else {
                aVar = a.C0038a.f2605b;
            }
            return (c0) new g0(w10, bVar, aVar).b("androidx.lifecycle.internal.SavedStateHandlesVM", c0.class);
        }
    }

    public b0(b bVar, j0 j0Var) {
        e9.f.e(bVar, "savedStateRegistry");
        e9.f.e(j0Var, "viewModelStoreOwner");
        this.f1662a = bVar;
        this.f1665d = new f(new a(j0Var));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, androidx.lifecycle.y>] */
    @Override // j1.b.AbstractC0077b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1664c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((c0) this.f1665d.a()).f1667c.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((y) entry.getValue()).f1733e.a();
            if (!e9.f.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f1663b = false;
        return bundle;
    }
}
