package m4;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class u9 {

    /* renamed from: a */
    public final n8 f14288a;

    /* renamed from: b */
    public final String f14289b;

    /* renamed from: c */
    public final String f14290c;

    /* renamed from: e */
    public final Class<?>[] f14292e;

    /* renamed from: d */
    public volatile Method f14291d = null;

    /* renamed from: f */
    public final CountDownLatch f14293f = new CountDownLatch(1);

    public u9(n8 n8Var, String str, String str2, Class<?>... clsArr) {
        this.f14288a = n8Var;
        this.f14289b = str;
        this.f14290c = str2;
        this.f14292e = clsArr;
        n8Var.f11551b.submit(new t9(this, 0));
    }

    public final String a(byte[] bArr, String str) {
        return new String(this.f14288a.f11553d.b(bArr, str), "UTF-8");
    }
}
