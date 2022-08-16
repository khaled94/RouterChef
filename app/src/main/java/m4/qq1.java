package m4;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class qq1 extends ContentObserver {

    /* renamed from: a */
    public final Context f12973a;

    /* renamed from: b */
    public final AudioManager f12974b;

    /* renamed from: c */
    public float f12975c;

    /* renamed from: d */
    public final xq1 f12976d;

    public qq1(Handler handler, Context context, xq1 xq1Var) {
        super(handler);
        this.f12973a = context;
        this.f12974b = (AudioManager) context.getSystemService("audio");
        this.f12976d = xq1Var;
    }

    public final float a() {
        int streamVolume = this.f12974b.getStreamVolume(3);
        int streamMaxVolume = this.f12974b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 <= 1.0f) {
            return f10;
        }
        return 1.0f;
    }

    public final void b() {
        xq1 xq1Var = this.f12976d;
        float f10 = this.f12975c;
        xq1Var.f15452a = f10;
        if (xq1Var.f15454c == null) {
            xq1Var.f15454c = rq1.f13418c;
        }
        for (jq1 jq1Var : xq1Var.f15454c.a()) {
            jq1Var.f10163d.e(f10);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a10 != this.f12975c) {
            this.f12975c = a10;
            b();
        }
    }
}
