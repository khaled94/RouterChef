package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class rc0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f13245s;

    /* renamed from: t */
    public final /* synthetic */ String f13246t;

    /* renamed from: u */
    public final /* synthetic */ int f13247u;

    /* renamed from: v */
    public final /* synthetic */ uc0 f13248v;

    public rc0(uc0 uc0Var, String str, String str2, int i10) {
        this.f13248v = uc0Var;
        this.f13245s = str;
        this.f13246t = str2;
        this.f13247u = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f13245s);
        hashMap.put("cachedSrc", this.f13246t);
        hashMap.put("totalBytes", Integer.toString(this.f13247u));
        uc0.g(this.f13248v, hashMap);
    }
}
