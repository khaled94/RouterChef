package m4;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ri extends ii {

    /* renamed from: c */
    public MessageDigest f13355c;

    /* renamed from: d */
    public final int f13356d;

    /* renamed from: e */
    public final int f13357e;

    public ri(int i10) {
        int i11 = i10 >> 3;
        this.f13356d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f13357e = i10;
    }

    public final byte[] b(String str) {
        synchronized (this.f9657a) {
            MessageDigest a10 = a();
            this.f13355c = a10;
            if (a10 == null) {
                return new byte[0];
            }
            a10.reset();
            this.f13355c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f13355c.digest();
            int length = digest.length;
            int i10 = this.f13356d;
            if (length > i10) {
                length = i10;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.f13357e & 7) > 0) {
                long j3 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (i11 > 0) {
                        j3 <<= 8;
                    }
                    j3 += bArr[i11] & 255;
                }
                long j10 = j3 >>> (8 - (this.f13357e & 7));
                int i12 = this.f13356d;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        break;
                    }
                    bArr[i12] = (byte) (255 & j10);
                    j10 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
