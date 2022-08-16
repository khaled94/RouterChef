package m4;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class v72 {

    /* renamed from: a */
    public static final ThreadLocal<SecureRandom> f14595a = new u72();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        f14595a.get().nextBytes(bArr);
        return bArr;
    }
}
