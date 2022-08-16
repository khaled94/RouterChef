package m4;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class na {

    /* renamed from: a */
    public final ya[] f11581a;

    /* renamed from: b */
    public final uf f11582b;

    /* renamed from: c */
    public final vf f11583c;

    /* renamed from: d */
    public final ma f11584d;

    /* renamed from: e */
    public final sa f11585e;

    /* renamed from: i */
    public boolean f11589i;

    /* renamed from: l */
    public int f11592l;

    /* renamed from: m */
    public int f11593m;

    /* renamed from: n */
    public boolean f11594n;
    public Object p;

    /* renamed from: r */
    public vf f11597r;

    /* renamed from: t */
    public pa f11599t;

    /* renamed from: u */
    public long f11600u;

    /* renamed from: j */
    public boolean f11590j = false;

    /* renamed from: k */
    public int f11591k = 1;

    /* renamed from: f */
    public final CopyOnWriteArraySet<ka> f11586f = new CopyOnWriteArraySet<>();

    /* renamed from: o */
    public db f11595o = db.f7278a;

    /* renamed from: g */
    public final cb f11587g = new cb();

    /* renamed from: h */
    public final bb f11588h = new bb();

    /* renamed from: q */
    public lf f11596q = lf.f10745d;

    /* renamed from: s */
    public xa f11598s = xa.f15258c;

    @SuppressLint({"HandlerLeak"})
    public na(ya[] yaVarArr, uf ufVar, yb0 yb0Var) {
        String str = wg.f14962e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.f11581a = yaVarArr;
        this.f11582b = ufVar;
        vf vfVar = new vf(new of[2]);
        this.f11583c = vfVar;
        this.f11597r = vfVar;
        ma maVar = new ma(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f11584d = maVar;
        pa paVar = new pa(0, 0L);
        this.f11599t = paVar;
        this.f11585e = new sa(yaVarArr, ufVar, yb0Var, this.f11590j, maVar, paVar, this);
    }

    public final void a(la... laVarArr) {
        sa saVar = this.f11585e;
        synchronized (saVar) {
            if (saVar.I) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            } else {
                int i10 = saVar.O;
                saVar.O = i10 + 1;
                saVar.f13565w.obtainMessage(11, laVarArr).sendToTarget();
                while (saVar.P <= i10) {
                    try {
                        saVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public final void b(la... laVarArr) {
        sa saVar = this.f11585e;
        if (saVar.I) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        saVar.O++;
        saVar.f13565w.obtainMessage(11, laVarArr).sendToTarget();
    }

    public final void c() {
        if (this.f11595o.h() || this.f11592l > 0) {
            return;
        }
        this.f11595o.d(this.f11599t.f12451a, this.f11588h, false);
    }
}
