package m4;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class u72 extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
