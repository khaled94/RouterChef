package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class sc0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f13586s;

    /* renamed from: t */
    public final /* synthetic */ String f13587t;

    /* renamed from: u */
    public final /* synthetic */ long f13588u;

    /* renamed from: v */
    public final /* synthetic */ uc0 f13589v;

    public sc0(uc0 uc0Var, String str, String str2, long j3) {
        this.f13589v = uc0Var;
        this.f13586s = str;
        this.f13587t = str2;
        this.f13588u = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f13586s);
        hashMap.put("cachedSrc", this.f13587t);
        hashMap.put("totalDuration", Long.toString(this.f13588u));
        uc0.g(this.f13589v, hashMap);
    }
}
