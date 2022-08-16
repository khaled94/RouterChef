package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class qc0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ uc0 B;

    /* renamed from: s */
    public final /* synthetic */ String f12776s;

    /* renamed from: t */
    public final /* synthetic */ String f12777t;

    /* renamed from: u */
    public final /* synthetic */ int f12778u;

    /* renamed from: v */
    public final /* synthetic */ int f12779v;

    /* renamed from: w */
    public final /* synthetic */ long f12780w;

    /* renamed from: x */
    public final /* synthetic */ long f12781x;
    public final /* synthetic */ boolean y;

    /* renamed from: z */
    public final /* synthetic */ int f12782z;

    public qc0(uc0 uc0Var, String str, String str2, int i10, int i11, long j3, long j10, boolean z10, int i12, int i13) {
        this.B = uc0Var;
        this.f12776s = str;
        this.f12777t = str2;
        this.f12778u = i10;
        this.f12779v = i11;
        this.f12780w = j3;
        this.f12781x = j10;
        this.y = z10;
        this.f12782z = i12;
        this.A = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12776s);
        hashMap.put("cachedSrc", this.f12777t);
        hashMap.put("bytesLoaded", Integer.toString(this.f12778u));
        hashMap.put("totalBytes", Integer.toString(this.f12779v));
        hashMap.put("bufferedDuration", Long.toString(this.f12780w));
        hashMap.put("totalDuration", Long.toString(this.f12781x));
        hashMap.put("cacheReady", true != this.y ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f12782z));
        hashMap.put("playerPreparedCount", Integer.toString(this.A));
        uc0.g(this.B, hashMap);
    }
}
