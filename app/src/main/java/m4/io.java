package m4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* loaded from: classes.dex */
public final class io {

    /* renamed from: f */
    public static final io f9708f = new io();

    /* renamed from: a */
    public final g90 f9709a;

    /* renamed from: b */
    public final go f9710b;

    /* renamed from: c */
    public final String f9711c;

    /* renamed from: d */
    public final o90 f9712d;

    /* renamed from: e */
    public final Random f9713e;

    public io() {
        g90 g90Var = new g90();
        go goVar = new go(new in(), new hn(), new br(), new b40());
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        o90 o90Var = new o90(0, 214106000, true);
        Random random = new Random();
        this.f9709a = g90Var;
        this.f9710b = goVar;
        this.f9711c = bigInteger;
        this.f9712d = o90Var;
        this.f9713e = random;
    }
}
