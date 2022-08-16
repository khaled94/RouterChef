package m4;

import android.os.Bundle;
import android.view.View;
import f3.m;
import h3.c;
import h3.j;
import h3.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import k4.a;
import k4.b;
import o2.g;

/* loaded from: classes.dex */
public final class f20 extends s10 {

    /* renamed from: s */
    public final g f8343s;

    public f20(g gVar) {
        this.f8343s = gVar;
    }

    @Override // m4.t10
    public final boolean C() {
        return this.f8343s.f16749n;
    }

    @Override // m4.t10
    public final void L() {
        Objects.requireNonNull(this.f8343s);
    }

    @Override // m4.t10
    public final void N2(a aVar) {
        g gVar = this.f8343s;
        View view = (View) b.e0(aVar);
        Objects.requireNonNull(gVar);
    }

    @Override // m4.t10
    public final void P0(a aVar, a aVar2, a aVar3) {
        HashMap hashMap = (HashMap) b.e0(aVar2);
        HashMap hashMap2 = (HashMap) b.e0(aVar3);
        g gVar = this.f8343s;
        View view = (View) b.e0(aVar);
        Objects.requireNonNull(gVar);
        if (view instanceof l) {
            l lVar = (l) view;
            throw null;
        } else if (j.f5071a.get(view) != null) {
            throw null;
        }
    }

    @Override // m4.t10
    public final double b() {
        Double d5 = this.f8343s.f16742g;
        if (d5 != null) {
            return d5.doubleValue();
        }
        return -1.0d;
    }

    @Override // m4.t10
    public final float d() {
        Objects.requireNonNull(this.f8343s);
        return 0.0f;
    }

    @Override // m4.t10
    public final float e() {
        Objects.requireNonNull(this.f8343s);
        return 0.0f;
    }

    @Override // m4.t10
    public final float f() {
        Objects.requireNonNull(this.f8343s);
        return 0.0f;
    }

    @Override // m4.t10
    public final Bundle h() {
        return this.f8343s.f16747l;
    }

    @Override // m4.t10
    public final lq i() {
        lq lqVar;
        m mVar = this.f8343s.f16745j;
        if (mVar != null) {
            synchronized (mVar.f4516a) {
                lqVar = mVar.f4517b;
            }
            return lqVar;
        }
        return null;
    }

    @Override // m4.t10
    public final a j() {
        Objects.requireNonNull(this.f8343s);
        return null;
    }

    @Override // m4.t10
    public final a k() {
        Object obj = this.f8343s.f16746k;
        if (obj == null) {
            return null;
        }
        return new b(obj);
    }

    @Override // m4.t10
    public final vu l() {
        c cVar = this.f8343s.f16739d;
        if (cVar != null) {
            return new ju(cVar.a(), cVar.c(), cVar.b(), cVar.e(), cVar.d());
        }
        return null;
    }

    @Override // m4.t10
    public final String m() {
        return this.f8343s.f16741f;
    }

    @Override // m4.t10
    public final pu n() {
        return null;
    }

    @Override // m4.t10
    public final a o() {
        Objects.requireNonNull(this.f8343s);
        return null;
    }

    @Override // m4.t10
    public final String p() {
        return this.f8343s.f16736a;
    }

    @Override // m4.t10
    public final List q() {
        List<c> list = this.f8343s.f16737b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (c cVar : list) {
                arrayList.add(new ju(cVar.a(), cVar.c(), cVar.b(), cVar.e(), cVar.d()));
            }
        }
        return arrayList;
    }

    @Override // m4.t10
    public final String r() {
        return this.f8343s.f16744i;
    }

    @Override // m4.t10
    public final String s() {
        return this.f8343s.f16738c;
    }

    @Override // m4.t10
    public final String v() {
        return this.f8343s.f16743h;
    }

    @Override // m4.t10
    public final void w0(a aVar) {
        g gVar = this.f8343s;
        View view = (View) b.e0(aVar);
        Objects.requireNonNull(gVar);
    }

    @Override // m4.t10
    public final String x() {
        return this.f8343s.f16740e;
    }

    @Override // m4.t10
    public final boolean y() {
        return this.f8343s.f16748m;
    }
}
