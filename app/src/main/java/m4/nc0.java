package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class nc0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f11625s;

    /* renamed from: t */
    public final /* synthetic */ String f11626t;

    /* renamed from: u */
    public final /* synthetic */ int f11627u;

    /* renamed from: v */
    public final /* synthetic */ int f11628v;

    /* renamed from: w */
    public final /* synthetic */ uc0 f11629w;

    public nc0(uc0 uc0Var, String str, String str2, int i10, int i11) {
        this.f11629w = uc0Var;
        this.f11625s = str;
        this.f11626t = str2;
        this.f11627u = i10;
        this.f11628v = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f11625s);
        hashMap.put("cachedSrc", this.f11626t);
        hashMap.put("bytesLoaded", Integer.toString(this.f11627u));
        hashMap.put("totalBytes", Integer.toString(this.f11628v));
        hashMap.put("cacheReady", "0");
        uc0.g(this.f11629w, hashMap);
    }
}
