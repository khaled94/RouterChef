package s4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i7 {

    /* renamed from: a */
    public static final Charset f17920a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f17921b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f17921b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        w5 e10 = ((d8) obj).e();
        d8 d8Var = (d8) obj2;
        Objects.requireNonNull(e10);
        y6 y6Var = (y6) e10;
        if (y6Var.f18204s.getClass().isInstance(d8Var)) {
            y6Var.k((b7) ((x5) d8Var));
            return y6Var.g();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
