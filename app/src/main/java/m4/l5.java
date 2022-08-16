package m4;

import androidx.activity.result.a;
import java.nio.ByteBuffer;
import java.util.Date;
import k9.u;

/* loaded from: classes.dex */
public final class l5 extends bd2 {
    public int A;
    public Date B;
    public Date C;
    public long D;
    public long E;
    public double F = 1.0d;
    public float G = 1.0f;
    public id2 H = id2.f9598j;
    public long I;

    public l5() {
        super("mvhd");
    }

    @Override // m4.bd2
    public final void d(ByteBuffer byteBuffer) {
        long j3;
        int i10 = byteBuffer.get();
        if (i10 < 0) {
            i10 += 256;
        }
        this.A = i10;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f6462t) {
            e();
        }
        if (this.A == 1) {
            this.B = u.f(x90.p(byteBuffer));
            this.C = u.f(x90.p(byteBuffer));
            this.D = x90.o(byteBuffer);
            j3 = x90.p(byteBuffer);
        } else {
            this.B = u.f(x90.o(byteBuffer));
            this.C = u.f(x90.o(byteBuffer));
            this.D = x90.o(byteBuffer);
            j3 = x90.o(byteBuffer);
        }
        this.E = j3;
        this.F = x90.f(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.G = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        x90.o(byteBuffer);
        x90.o(byteBuffer);
        double f10 = x90.f(byteBuffer);
        double f11 = x90.f(byteBuffer);
        double a10 = x90.a(byteBuffer);
        this.H = new id2(f10, f11, x90.f(byteBuffer), x90.f(byteBuffer), a10, x90.a(byteBuffer), x90.a(byteBuffer), x90.f(byteBuffer), x90.f(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.I = x90.o(byteBuffer);
    }

    public final String toString() {
        StringBuilder c10 = a.c("MovieHeaderBox[creationTime=");
        c10.append(this.B);
        c10.append(";modificationTime=");
        c10.append(this.C);
        c10.append(";timescale=");
        c10.append(this.D);
        c10.append(";duration=");
        c10.append(this.E);
        c10.append(";rate=");
        c10.append(this.F);
        c10.append(";volume=");
        c10.append(this.G);
        c10.append(";matrix=");
        c10.append(this.H);
        c10.append(";nextTrackId=");
        c10.append(this.I);
        c10.append("]");
        return c10.toString();
    }
}
