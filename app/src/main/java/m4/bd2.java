package m4;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class bd2 implements i5 {

    /* renamed from: z */
    public static final x50 f6460z = x50.e(bd2.class);

    /* renamed from: s */
    public final String f6461s;

    /* renamed from: v */
    public ByteBuffer f6464v;

    /* renamed from: w */
    public long f6465w;
    public fc0 y;

    /* renamed from: x */
    public long f6466x = -1;

    /* renamed from: u */
    public boolean f6463u = true;

    /* renamed from: t */
    public boolean f6462t = true;

    public bd2(String str) {
        this.f6461s = str;
    }

    public final synchronized void a() {
        if (!this.f6463u) {
            try {
                x50 x50Var = f6460z;
                String str = this.f6461s;
                x50Var.c(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f6464v = this.y.j(this.f6465w, this.f6466x);
                this.f6463u = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // m4.i5
    public final void b(fc0 fc0Var, ByteBuffer byteBuffer, long j3, g5 g5Var) {
        this.f6465w = fc0Var.c();
        byteBuffer.remaining();
        this.f6466x = j3;
        this.y = fc0Var;
        fc0Var.G(fc0Var.c() + j3);
        this.f6463u = false;
        this.f6462t = false;
        e();
    }

    @Override // m4.i5
    public final void c() {
    }

    public abstract void d(ByteBuffer byteBuffer);

    public final synchronized void e() {
        a();
        x50 x50Var = f6460z;
        String str = this.f6461s;
        x50Var.c(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f6464v;
        if (byteBuffer != null) {
            this.f6462t = true;
            byteBuffer.rewind();
            d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.f6464v = null;
        }
    }

    @Override // m4.i5
    public final String zza() {
        return this.f6461s;
    }
}
