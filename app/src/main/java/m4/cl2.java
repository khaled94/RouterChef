package m4;

import android.net.Uri;
import java.util.Collections;

/* loaded from: classes.dex */
public final class cl2 extends z40 {

    /* renamed from: g */
    public static final Object f7026g = new Object();

    /* renamed from: b */
    public final long f7027b;

    /* renamed from: c */
    public final long f7028c;

    /* renamed from: d */
    public final boolean f7029d;

    /* renamed from: e */
    public final gi f7030e;

    /* renamed from: f */
    public final sc f7031f;

    static {
        pu1 pu1Var = gw1.f9058t;
        gw1<Object> gw1Var = gx1.f9060w;
        Collections.emptyList();
        if (Uri.EMPTY != null) {
            dw1 o10 = gw1.o();
            if (gw1Var.size() > 0) {
                ug ugVar = (ug) gw1Var.get(0);
                throw null;
            }
            o10.p();
        }
        lm lmVar = lm.f10918s;
    }

    public cl2(long j3, long j10, boolean z10, gi giVar, sc scVar) {
        this.f7027b = j3;
        this.f7028c = j10;
        this.f7029d = z10;
        this.f7030e = giVar;
        this.f7031f = scVar;
    }

    @Override // m4.z40
    public final int a(Object obj) {
        return f7026g.equals(obj) ? 0 : -1;
    }

    @Override // m4.z40
    public final int b() {
        return 1;
    }

    @Override // m4.z40
    public final int c() {
        return 1;
    }

    @Override // m4.z40
    public final d30 d(int i10, d30 d30Var, boolean z10) {
        r01.b(i10, 1);
        Object obj = z10 ? f7026g : null;
        long j3 = this.f7027b;
        hl0 hl0Var = hl0.f9372b;
        d30Var.f7202a = null;
        d30Var.f7203b = obj;
        d30Var.f7204c = 0;
        d30Var.f7205d = j3;
        d30Var.f7207f = hl0Var;
        d30Var.f7206e = false;
        return d30Var;
    }

    @Override // m4.z40
    public final j40 e(int i10, j40 j40Var, long j3) {
        r01.b(i10, 1);
        Object obj = j40.f9833n;
        j40Var.a(this.f7030e, this.f7029d, false, this.f7031f, this.f7028c);
        return j40Var;
    }

    @Override // m4.z40
    public final Object f(int i10) {
        r01.b(i10, 1);
        return f7026g;
    }
}
