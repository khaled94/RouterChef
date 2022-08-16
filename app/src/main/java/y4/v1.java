package y4;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: s */
    public final u1 f20763s;

    /* renamed from: t */
    public final int f20764t;

    /* renamed from: u */
    public final Throwable f20765u;

    /* renamed from: v */
    public final byte[] f20766v;

    /* renamed from: w */
    public final String f20767w;

    /* renamed from: x */
    public final Map<String, List<String>> f20768x;

    public v1(String str, u1 u1Var, int i10, Throwable th, byte[] bArr, Map map) {
        Objects.requireNonNull(u1Var, "null reference");
        this.f20763s = u1Var;
        this.f20764t = i10;
        this.f20765u = th;
        this.f20766v = bArr;
        this.f20767w = str;
        this.f20768x = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20763s.a(this.f20767w, this.f20764t, this.f20765u, this.f20766v, this.f20768x);
    }
}
