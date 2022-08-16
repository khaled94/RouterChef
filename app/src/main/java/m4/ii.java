package m4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class ii {

    /* renamed from: b */
    public static MessageDigest f9656b;

    /* renamed from: a */
    public final Object f9657a = new Object();

    public final MessageDigest a() {
        synchronized (this.f9657a) {
            MessageDigest messageDigest = f9656b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f9656b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f9656b;
        }
    }
}
