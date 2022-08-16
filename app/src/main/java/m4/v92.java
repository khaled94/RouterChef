package m4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v92 {

    /* renamed from: a */
    public static final Charset f14624a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f14625b;

    /* renamed from: c */
    public static final ByteBuffer f14626c;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14625b = bArr;
        f14626c = ByteBuffer.wrap(bArr);
        r82.g(bArr, 0, 0, false);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        a82 f10 = ((qa2) obj).f();
        qa2 qa2Var = (qa2) obj2;
        Objects.requireNonNull(f10);
        j92 j92Var = (j92) f10;
        if (j92Var.f9882s.getClass().isInstance(qa2Var)) {
            j92Var.h((m92) ((b82) qa2Var));
            return j92Var.l();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
