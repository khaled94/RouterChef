package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class ni extends ii {

    /* renamed from: c */
    public MessageDigest f11788c;

    public final byte[] b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i10 = 4;
        if (length == 1) {
            int a10 = mi.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a10);
            bArr = allocate.array();
        } else {
            if (length < 5) {
                bArr2 = new byte[length + length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int a11 = mi.a(split[i11]);
                    int i12 = (a11 >> 16) ^ ((char) a11);
                    byte[] bArr3 = {(byte) i12, (byte) (i12 >> 8)};
                    int i13 = i11 + i11;
                    bArr2[i13] = bArr3[0];
                    bArr2[i13 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    int a12 = mi.a(split[i14]);
                    bArr2[i14] = (byte) ((a12 >> 24) ^ (((a12 & 255) ^ ((a12 >> 8) & 255)) ^ ((a12 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f11788c = a();
        synchronized (this.f9657a) {
            MessageDigest messageDigest = this.f11788c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f11788c.update(bArr);
            byte[] digest = this.f11788c.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i10 = length2;
            }
            byte[] bArr4 = new byte[i10];
            System.arraycopy(digest, 0, bArr4, 0, i10);
            return bArr4;
        }
    }
}
