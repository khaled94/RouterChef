package m4;

import java.util.HashMap;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class pc0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ uc0 C;

    /* renamed from: s */
    public final /* synthetic */ String f12470s;

    /* renamed from: t */
    public final /* synthetic */ String f12471t;

    /* renamed from: u */
    public final /* synthetic */ long f12472u;

    /* renamed from: v */
    public final /* synthetic */ long f12473v;

    /* renamed from: w */
    public final /* synthetic */ long f12474w;

    /* renamed from: x */
    public final /* synthetic */ long f12475x;
    public final /* synthetic */ long y;

    /* renamed from: z */
    public final /* synthetic */ boolean f12476z;

    public pc0(uc0 uc0Var, String str, String str2, long j3, long j10, long j11, long j12, long j13, boolean z10, int i10, int i11) {
        this.C = uc0Var;
        this.f12470s = str;
        this.f12471t = str2;
        this.f12472u = j3;
        this.f12473v = j10;
        this.f12474w = j11;
        this.f12475x = j12;
        this.y = j13;
        this.f12476z = z10;
        this.A = i10;
        this.B = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12470s);
        hashMap.put("cachedSrc", this.f12471t);
        hashMap.put("bufferedDuration", Long.toString(this.f12472u));
        hashMap.put("totalDuration", Long.toString(this.f12473v));
        if (((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f12474w));
            hashMap.put("qoeCachedBytes", Long.toString(this.f12475x));
            hashMap.put("totalBytes", Long.toString(this.y));
            Objects.requireNonNull(s.B.f5796j);
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.f12476z ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.A));
        hashMap.put("playerPreparedCount", Integer.toString(this.B));
        uc0.g(this.C, hashMap);
    }
}
