package m4;

import android.os.SystemClock;
import h2.n;
import java.util.Objects;
import javax.annotation.Nullable;
import l3.s;

/* loaded from: classes.dex */
public final class g21 implements kz1<String> {

    /* renamed from: s */
    public final /* synthetic */ j21 f8718s;

    public g21(j21 j21Var) {
        this.f8718s = j21Var;
    }

    @Override // m4.kz1
    public final void a(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            j21 j21Var = this.f8718s;
            j21Var.f9810c = true;
            Objects.requireNonNull(s.B.f5796j);
            j21Var.d("com.google.android.gms.ads.MobileAds", true, "", (int) (SystemClock.elapsedRealtime() - this.f8718s.f9811d));
            this.f8718s.f9816i.execute(new n(this, str, 3));
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        synchronized (this) {
            j21 j21Var = this.f8718s;
            j21Var.f9810c = true;
            Objects.requireNonNull(s.B.f5796j);
            j21Var.d("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (SystemClock.elapsedRealtime() - this.f8718s.f9811d));
            this.f8718s.f9812e.c(new Exception());
        }
    }
}
