package m4;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f5 implements g5 {

    /* renamed from: b */
    public static final Logger f8354b = Logger.getLogger(f5.class.getName());

    /* renamed from: a */
    public final ThreadLocal<ByteBuffer> f8355a = new e5();

    public abstract i5 a(String str);

    public final i5 b(fc0 fc0Var, j5 j5Var) {
        int b10;
        long j3;
        long c10 = fc0Var.c();
        this.f8355a.get().rewind().limit(8);
        do {
            b10 = fc0Var.b(this.f8355a.get());
            if (b10 == 8) {
                this.f8355a.get().rewind();
                long o10 = x90.o(this.f8355a.get());
                if (o10 < 8 && o10 > 1) {
                    Logger logger = f8354b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(o10);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                this.f8355a.get().get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (o10 == 1) {
                        this.f8355a.get().limit(16);
                        fc0Var.b(this.f8355a.get());
                        this.f8355a.get().position(8);
                        j3 = x90.p(this.f8355a.get()) - 16;
                    } else {
                        j3 = o10 == 0 ? fc0Var.f8397s.limit() - fc0Var.c() : o10 - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.f8355a.get().limit(this.f8355a.get().limit() + 16);
                        fc0Var.b(this.f8355a.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = this.f8355a.get().position() - 16; position < this.f8355a.get().position(); position++) {
                            bArr2[position - (this.f8355a.get().position() - 16)] = this.f8355a.get().get(position);
                        }
                        j3 -= 16;
                    }
                    long j10 = j3;
                    if (j5Var instanceof i5) {
                        ((i5) j5Var).zza();
                    }
                    i5 a10 = a(str);
                    a10.c();
                    this.f8355a.get().rewind();
                    a10.b(fc0Var, this.f8355a.get(), j10, this);
                    return a10;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (b10 >= 0);
        fc0Var.G(c10);
        throw new EOFException();
    }
}
