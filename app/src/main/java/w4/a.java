package w4;

import android.os.Bundle;
import android.os.SystemClock;
import d4.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import y4.d6;
import y4.f4;
import y4.h6;
import y4.l4;
import y4.m0;
import y4.q1;
import y4.v3;
import y4.w2;
import y4.w3;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a */
    public final w2 f19921a;

    /* renamed from: b */
    public final f4 f19922b;

    public a(w2 w2Var) {
        Objects.requireNonNull(w2Var, "null reference");
        this.f19921a = w2Var;
        this.f19922b = w2Var.u();
    }

    @Override // y4.g4
    public final void U(String str) {
        m0 m10 = this.f19921a.m();
        Objects.requireNonNull(this.f19921a.F);
        m10.h(str, SystemClock.elapsedRealtime());
    }

    @Override // y4.g4
    public final long a() {
        return this.f19921a.z().o0();
    }

    @Override // y4.g4
    public final int b(String str) {
        f4 f4Var = this.f19922b;
        Objects.requireNonNull(f4Var);
        m.e(str);
        Objects.requireNonNull((w2) f4Var.f20505s);
        return 25;
    }

    @Override // y4.g4
    public final void c(String str, String str2, Bundle bundle) {
        this.f19921a.u().K(str, str2, bundle);
    }

    @Override // y4.g4
    public final List<Bundle> d(String str, String str2) {
        f4 f4Var = this.f19922b;
        if (((w2) f4Var.f20505s).B().s()) {
            ((w2) f4Var.f20505s).C().f20710x.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        Objects.requireNonNull((w2) f4Var.f20505s);
        if (m3.a.b()) {
            ((w2) f4Var.f20505s).C().f20710x.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ((w2) f4Var.f20505s).B().n(atomicReference, 5000L, "get conditional user properties", new v3(f4Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return h6.s(list);
        }
        ((w2) f4Var.f20505s).C().f20710x.b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // y4.g4
    public final Map<String, Object> e(String str, String str2, boolean z10) {
        String str3;
        q1 q1Var;
        f4 f4Var = this.f19922b;
        if (((w2) f4Var.f20505s).B().s()) {
            q1Var = ((w2) f4Var.f20505s).C().f20710x;
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            Objects.requireNonNull((w2) f4Var.f20505s);
            if (!m3.a.b()) {
                AtomicReference atomicReference = new AtomicReference();
                ((w2) f4Var.f20505s).B().n(atomicReference, 5000L, "get user properties", new w3(f4Var, atomicReference, str, str2, z10));
                List<d6> list = (List) atomicReference.get();
                if (list == null) {
                    ((w2) f4Var.f20505s).C().f20710x.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                r.a aVar = new r.a(list.size());
                for (d6 d6Var : list) {
                    Object s10 = d6Var.s();
                    if (s10 != null) {
                        aVar.put(d6Var.f20363t, s10);
                    }
                }
                return aVar;
            }
            q1Var = ((w2) f4Var.f20505s).C().f20710x;
            str3 = "Cannot get user properties from main thread";
        }
        q1Var.a(str3);
        return Collections.emptyMap();
    }

    @Override // y4.g4
    public final String f() {
        return this.f19922b.H();
    }

    @Override // y4.g4
    public final void g(Bundle bundle) {
        f4 f4Var = this.f19922b;
        Objects.requireNonNull(((w2) f4Var.f20505s).F);
        f4Var.u(bundle, System.currentTimeMillis());
    }

    @Override // y4.g4
    public final String h() {
        l4 l4Var = ((w2) this.f19922b.f20505s).w().f20651u;
        if (l4Var != null) {
            return l4Var.f20552b;
        }
        return null;
    }

    @Override // y4.g4
    public final String i() {
        l4 l4Var = ((w2) this.f19922b.f20505s).w().f20651u;
        if (l4Var != null) {
            return l4Var.f20551a;
        }
        return null;
    }

    @Override // y4.g4
    public final void j(String str, String str2, Bundle bundle) {
        this.f19922b.l(str, str2, bundle);
    }

    @Override // y4.g4
    public final String n() {
        return this.f19922b.H();
    }

    @Override // y4.g4
    public final void s(String str) {
        m0 m10 = this.f19921a.m();
        Objects.requireNonNull(this.f19921a.F);
        m10.i(str, SystemClock.elapsedRealtime());
    }
}
