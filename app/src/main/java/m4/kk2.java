package m4;

import d.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import m3.a;

/* loaded from: classes.dex */
public final class kk2 extends jj2<Integer> {

    /* renamed from: q */
    public static final gi f10467q;

    /* renamed from: j */
    public final xj2[] f10468j;

    /* renamed from: k */
    public final z40[] f10469k;

    /* renamed from: l */
    public final ArrayList<xj2> f10470l;

    /* renamed from: m */
    public int f10471m = -1;

    /* renamed from: n */
    public long[][] f10472n = new long[0];

    /* renamed from: o */
    public lg f10473o;
    public final d p;

    static {
        a aVar = new a();
        pu1 pu1Var = gw1.f9058t;
        gw1<Object> gw1Var = gx1.f9060w;
        Collections.emptyList();
        j7 j7Var = new j7(aVar, null);
        sc scVar = new sc();
        lm lmVar = lm.f10918s;
        f10467q = new gi("MergingMediaSource", j7Var, null, scVar);
    }

    public kk2(xj2... xj2VarArr) {
        d dVar = new d();
        this.f10468j = xj2VarArr;
        this.p = dVar;
        this.f10470l = new ArrayList<>(Arrays.asList(xj2VarArr));
        this.f10469k = new z40[xj2VarArr.length];
        new HashMap();
        if (new tv1(8).isEmpty()) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.xj2
    public final void d(tj2 tj2Var) {
        jk2 jk2Var = (jk2) tj2Var;
        int i10 = 0;
        while (true) {
            xj2[] xj2VarArr = this.f10468j;
            if (i10 < xj2VarArr.length) {
                xj2 xj2Var = xj2VarArr[i10];
                tj2 tj2Var2 = jk2Var.f10111s[i10];
                if (tj2Var2 instanceof hk2) {
                    tj2Var2 = ((hk2) tj2Var2).f9369s;
                }
                xj2Var.d(tj2Var2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // m4.xj2
    public final tj2 i(uj2 uj2Var, pm2 pm2Var, long j3) {
        int length = this.f10468j.length;
        tj2[] tj2VarArr = new tj2[length];
        int a10 = this.f10469k[0].a(uj2Var.f8973a);
        for (int i10 = 0; i10 < length; i10++) {
            tj2VarArr[i10] = this.f10468j[i10].i(uj2Var.b(this.f10469k[i10].f(a10)), pm2Var, j3 - this.f10472n[a10][i10]);
        }
        return new jk2(this.f10472n[a10], tj2VarArr);
    }

    @Override // m4.ej2
    public final void m(i01 i01Var) {
        this.f10103i = i01Var;
        this.f10102h = ls1.x();
        for (int i10 = 0; i10 < this.f10468j.length; i10++) {
            v(Integer.valueOf(i10), this.f10468j[i10]);
        }
    }

    @Override // m4.jj2, m4.ej2
    public final void o() {
        super.o();
        Arrays.fill(this.f10469k, (Object) null);
        this.f10471m = -1;
        this.f10473o = null;
        this.f10470l.clear();
        Collections.addAll(this.f10470l, this.f10468j);
    }

    @Override // m4.jj2
    public final /* bridge */ /* synthetic */ uj2 p(Integer num, uj2 uj2Var) {
        if (num.intValue() == 0) {
            return uj2Var;
        }
        return null;
    }

    @Override // m4.xj2
    public final void q() {
        lg lgVar = this.f10473o;
        if (lgVar == null) {
            for (ij2 ij2Var : this.f10101g.values()) {
                ij2Var.f9674a.q();
            }
            return;
        }
        throw lgVar;
    }

    @Override // m4.jj2
    public final /* bridge */ /* synthetic */ void s(Integer num, xj2 xj2Var, z40 z40Var) {
        int i10;
        if (this.f10473o != null) {
            return;
        }
        if (this.f10471m == -1) {
            i10 = z40Var.b();
            this.f10471m = i10;
        } else {
            int b10 = z40Var.b();
            int i11 = this.f10471m;
            if (b10 != i11) {
                this.f10473o = new lg();
                return;
            }
            i10 = i11;
        }
        if (this.f10472n.length == 0) {
            this.f10472n = (long[][]) Array.newInstance(long.class, i10, this.f10469k.length);
        }
        this.f10470l.remove(xj2Var);
        this.f10469k[num.intValue()] = z40Var;
        if (!this.f10470l.isEmpty()) {
            return;
        }
        n(this.f10469k[0]);
    }

    @Override // m4.xj2
    public final gi u() {
        xj2[] xj2VarArr = this.f10468j;
        return xj2VarArr.length > 0 ? xj2VarArr[0].u() : f10467q;
    }
}
