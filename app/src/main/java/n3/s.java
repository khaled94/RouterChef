package n3;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import b5.a;
import java.util.Objects;
import m4.j21;
import m4.mh0;
import m4.ta0;
import o4.h;
import y4.d5;
import y4.e5;
import z3.m;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16553s;

    /* renamed from: t */
    public final /* synthetic */ Object f16554t;

    public /* synthetic */ s(Object obj, int i10) {
        this.f16553s = i10;
        this.f16554t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        switch (this.f16553s) {
            case 0:
                v vVar = (v) this.f16554t;
                vVar.c(vVar.f16577a);
                return;
            case 1:
                ((m) this.f16554t).a(2, "Service disconnected");
                return;
            case 2:
                int i10 = ta0.K;
                ((ta0) this.f16554t).c("surfaceCreated", new String[0]);
                return;
            case 3:
                mh0 mh0Var = (mh0) this.f16554t;
                Objects.requireNonNull(mh0Var);
                l3.s sVar = l3.s.B;
                k1 k1Var = (k1) sVar.f5793g.c();
                k1Var.u();
                synchronized (k1Var.f16496a) {
                    z10 = k1Var.f16517w;
                }
                if (!z10) {
                    return;
                }
                k1 k1Var2 = (k1) sVar.f5793g.c();
                k1Var2.u();
                synchronized (k1Var2.f16496a) {
                    str = k1Var2.f16518x;
                }
                if (sVar.f5799m.f(mh0Var.f11198s, str, mh0Var.f11199t.f12051s)) {
                    return;
                }
                ((k1) sVar.f5793g.c()).E(false);
                ((k1) sVar.f5793g.c()).D("");
                return;
            case 4:
                j21 j21Var = (j21) this.f16554t;
                synchronized (j21Var) {
                    if (!j21Var.f9810c) {
                        Objects.requireNonNull(l3.s.B.f5796j);
                        j21Var.d("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j21Var.f9811d));
                        j21Var.f9812e.c(new Exception());
                    }
                }
                return;
            case 5:
                long b10 = ((h) this.f16554t).b();
                if (b10 == -1 || System.currentTimeMillis() <= b10) {
                    return;
                }
                Context context = ((h) this.f16554t).f16765a;
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 6:
                e5 e5Var = ((d5) this.f16554t).f20361c;
                e5Var.f20389v = null;
                e5Var.q();
                return;
            default:
                a aVar = (a) this.f16554t;
                synchronized (aVar.f2574a) {
                    if (aVar.b()) {
                        Log.e("WakeLock", String.valueOf(aVar.f2583j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        aVar.d();
                        if (aVar.b()) {
                            aVar.f2576c = 1;
                            aVar.e();
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ s(h hVar) {
        this.f16553s = 5;
        this.f16554t = hVar;
    }
}
