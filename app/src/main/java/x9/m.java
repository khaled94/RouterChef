package x9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import s9.b;
import x9.f;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: t */
    public final /* synthetic */ boolean f20178t = false;

    /* renamed from: u */
    public final /* synthetic */ u f20179u;

    /* renamed from: v */
    public final /* synthetic */ f.C0153f f20180v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f.C0153f c0153f, Object[] objArr, u uVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f20180v = c0153f;
        this.f20179u = uVar;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Map<java.lang.Integer, x9.q>, java.util.LinkedHashMap] */
    @Override // s9.b
    public final void a() {
        q[] qVarArr;
        long j3;
        f.C0153f c0153f = this.f20180v;
        boolean z10 = this.f20178t;
        u uVar = this.f20179u;
        synchronized (f.this.M) {
            synchronized (f.this) {
                int a10 = f.this.K.a();
                if (z10) {
                    u uVar2 = f.this.K;
                    uVar2.f20238a = 0;
                    Arrays.fill(uVar2.f20239b, 0);
                }
                u uVar3 = f.this.K;
                Objects.requireNonNull(uVar3);
                int i10 = 0;
                while (true) {
                    boolean z11 = true;
                    if (i10 >= 10) {
                        break;
                    }
                    if (((1 << i10) & uVar.f20238a) == 0) {
                        z11 = false;
                    }
                    if (z11) {
                        uVar3.b(i10, uVar.f20239b[i10]);
                    }
                    i10++;
                }
                int a11 = f.this.K.a();
                qVarArr = null;
                if (a11 == -1 || a11 == a10) {
                    j3 = 0;
                } else {
                    j3 = a11 - a10;
                    if (!f.this.f20141u.isEmpty()) {
                        qVarArr = (q[]) f.this.f20141u.values().toArray(new q[f.this.f20141u.size()]);
                    }
                }
            }
            try {
                f fVar = f.this;
                fVar.M.b(fVar.K);
            } catch (IOException e10) {
                f.this.c(2, 2, e10);
            }
        }
        if (qVarArr != null) {
            for (q qVar : qVarArr) {
                synchronized (qVar) {
                    qVar.f20202b += j3;
                    if (j3 > 0) {
                        qVar.notifyAll();
                    }
                }
            }
        }
        f.P.execute(new n(c0153f, f.this.f20142v));
    }
}
