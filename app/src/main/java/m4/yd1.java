package m4;

import android.content.Context;
import c5.i;
import o4.m;
import v3.a;

/* loaded from: classes.dex */
public final class yd1 implements eh1<zd1> {

    /* renamed from: a */
    public final m f15657a;

    public yd1(Context context) {
        this.f15657a = new m(context);
    }

    @Override // m4.eh1
    public final tz1<zd1> a() {
        if (((Boolean) jo.f10145d.f10148c.a(es.J1)).booleanValue()) {
            i<a> a10 = this.f15657a.a();
            a02 a02Var = new a02();
            a10.b(dz1.f7671s, new wq(a02Var, 5));
            return mz1.o(a02Var, xd1.f15306a, u90.f14299f);
        }
        return mz1.m(new zd1(null, -1));
    }
}
