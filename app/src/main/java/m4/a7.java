package m4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class a7 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            b7.f6402b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            b7.f6405e.countDown();
            throw th;
        }
        b7.f6405e.countDown();
    }
}
