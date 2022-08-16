package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes.dex */
public final class gh {

    /* renamed from: a */
    public final fh f8871a;

    /* renamed from: b */
    public final boolean f8872b;

    /* renamed from: c */
    public final long f8873c;

    /* renamed from: d */
    public final long f8874d;

    /* renamed from: e */
    public long f8875e;

    /* renamed from: f */
    public long f8876f;

    /* renamed from: g */
    public long f8877g;

    /* renamed from: h */
    public boolean f8878h;

    /* renamed from: i */
    public long f8879i;

    /* renamed from: j */
    public long f8880j;

    /* renamed from: k */
    public long f8881k;

    public gh(Context context) {
        long j3;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        double refreshRate = windowManager.getDefaultDisplay() != null ? windowManager.getDefaultDisplay().getRefreshRate() : -1.0d;
        boolean z10 = refreshRate != -1.0d;
        this.f8872b = z10;
        if (z10) {
            this.f8871a = fh.f8498w;
            long j10 = (long) (1.0E9d / refreshRate);
            this.f8873c = j10;
            j3 = (j10 * 80) / 100;
        } else {
            this.f8871a = null;
            j3 = -1;
            this.f8873c = -1L;
        }
        this.f8874d = j3;
    }

    public final boolean a(long j3, long j10) {
        return Math.abs((j10 - this.f8879i) - (j3 - this.f8880j)) > 20000000;
    }
}
