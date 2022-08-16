package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public final class u implements l {
    public static final u A = new u();

    /* renamed from: w */
    public Handler f1720w;

    /* renamed from: s */
    public int f1716s = 0;

    /* renamed from: t */
    public int f1717t = 0;

    /* renamed from: u */
    public boolean f1718u = true;

    /* renamed from: v */
    public boolean f1719v = true;

    /* renamed from: x */
    public final m f1721x = new m(this);
    public a y = new a();

    /* renamed from: z */
    public b f1722z = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            u.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u uVar = u.this;
            if (uVar.f1717t == 0) {
                uVar.f1718u = true;
                uVar.f1721x.f(g.b.ON_PAUSE);
            }
            u uVar2 = u.this;
            if (uVar2.f1716s != 0 || !uVar2.f1718u) {
                return;
            }
            uVar2.f1721x.f(g.b.ON_STOP);
            uVar2.f1719v = true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements w.a {
        public b() {
            u.this = r1;
        }
    }

    @Override // androidx.lifecycle.l
    public final g a() {
        return this.f1721x;
    }

    public final void d() {
        int i10 = this.f1717t + 1;
        this.f1717t = i10;
        if (i10 == 1) {
            if (!this.f1718u) {
                this.f1720w.removeCallbacks(this.y);
                return;
            }
            this.f1721x.f(g.b.ON_RESUME);
            this.f1718u = false;
        }
    }

    public final void e() {
        int i10 = this.f1716s + 1;
        this.f1716s = i10;
        if (i10 != 1 || !this.f1719v) {
            return;
        }
        this.f1721x.f(g.b.ON_START);
        this.f1719v = false;
    }
}
