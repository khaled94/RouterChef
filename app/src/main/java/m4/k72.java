package m4;

import e1.i;
import h6.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k72 implements j02 {

    /* renamed from: a */
    public final i72 f10292a;

    /* renamed from: b */
    public final i72 f10293b;

    public k72(byte[] bArr) {
        if (i.d(1)) {
            this.f10292a = a(bArr, 1);
            this.f10293b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract i72 a(byte[] bArr, int i10);

    @Override // m4.j02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= (Integer.MAX_VALUE - this.f10292a.b()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f10292a.b() + length + 16);
            if (allocate.remaining() < this.f10292a.b() + length + 16) {
                throw new IllegalArgumentException("Given ByteBuffer output is too small");
            }
            int position = allocate.position();
            this.f10292a.e(allocate, bArr);
            allocate.position(position);
            byte[] bArr3 = new byte[this.f10292a.b()];
            allocate.get(bArr3);
            allocate.limit(allocate.limit() - 16);
            byte[] bArr4 = new byte[32];
            this.f10293b.d(bArr3, 0).get(bArr4);
            int remaining = allocate.remaining();
            int i10 = remaining % 16;
            int i11 = i10 == 0 ? remaining : (remaining + 16) - i10;
            ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(0);
            order.put(allocate);
            order.position(i11);
            order.putLong(0L);
            order.putLong(remaining);
            byte[] array = order.array();
            long i12 = (a.i(bArr4, 0) >> 0) & 67108863;
            long i13 = (a.i(bArr4, 3) >> 2) & 67108863 & 67108611;
            long i14 = (a.i(bArr4, 6) >> 4) & 67108863 & 67092735;
            long i15 = (a.i(bArr4, 9) >> 6) & 67108863 & 66076671;
            long i16 = (a.i(bArr4, 12) >> 8) & 67108863 & 1048575;
            long j3 = i13 * 5;
            long j10 = i14 * 5;
            long j11 = i15 * 5;
            long j12 = i16 * 5;
            int i17 = 17;
            byte[] bArr5 = new byte[17];
            int i18 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            while (true) {
                int length2 = array.length;
                if (i18 < length2) {
                    int min = Math.min(16, length2 - i18);
                    System.arraycopy(array, i18, bArr5, 0, min);
                    bArr5[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr5, min + 1, i17, (byte) 0);
                    }
                    long i19 = j17 + ((a.i(bArr5, 0) >> 0) & 67108863);
                    long i20 = j13 + ((a.i(bArr5, 3) >> 2) & 67108863);
                    long i21 = j14 + ((a.i(bArr5, 6) >> 4) & 67108863);
                    long i22 = j15 + ((a.i(bArr5, 9) >> 6) & 67108863);
                    long i23 = j16 + (((a.i(bArr5, 12) >> 8) & 67108863) | (bArr5[16] << 24));
                    long j18 = (i23 * j3) + (i22 * j10) + (i21 * j11) + (i20 * j12) + (i19 * i12);
                    long j19 = (i23 * j10) + (i22 * j11) + (i21 * j12) + (i20 * i12) + (i19 * i13) + (j18 >> 26);
                    long j20 = (i23 * j11) + (i22 * j12) + (i21 * i12) + (i20 * i13) + (i19 * i14) + (j19 >> 26);
                    long j21 = (i23 * j12) + (i22 * i12) + (i21 * i13) + (i20 * i14) + (i19 * i15) + (j20 >> 26);
                    long j22 = i23 * i12;
                    long j23 = j22 + (i22 * i13) + (i21 * i14) + (i20 * i15) + (i19 * i16) + (j21 >> 26);
                    long j24 = ((j23 >> 26) * 5) + (j18 & 67108863);
                    j17 = j24 & 67108863;
                    long j25 = (j19 & 67108863) + (j24 >> 26);
                    i18 += 16;
                    j16 = j23 & 67108863;
                    j15 = j21 & 67108863;
                    j14 = j20 & 67108863;
                    i17 = 17;
                    j13 = j25;
                } else {
                    long j26 = j14 + (j13 >> 26);
                    long j27 = j26 & 67108863;
                    long j28 = j15 + (j26 >> 26);
                    long j29 = j28 & 67108863;
                    long j30 = j16 + (j28 >> 26);
                    long j31 = j30 & 67108863;
                    long j32 = ((j30 >> 26) * 5) + j17;
                    long j33 = j32 & 67108863;
                    long j34 = (j13 & 67108863) + (j32 >> 26);
                    long j35 = j33 + 5;
                    long j36 = (j35 >> 26) + j34;
                    long j37 = j27 + (j36 >> 26);
                    long j38 = j29 + (j37 >> 26);
                    long j39 = (j31 + (j38 >> 26)) - 67108864;
                    long j40 = j39 >> 63;
                    long j41 = ~j40;
                    long j42 = (j36 & 67108863 & j41) | (j34 & j40);
                    long j43 = (j27 & j40) | (j37 & 67108863 & j41);
                    long j44 = (j29 & j40) | (j38 & 67108863 & j41);
                    long i24 = a.i(bArr4, 16) + (((j33 & j40) | (j35 & 67108863 & j41) | (j42 << 26)) & 4294967295L);
                    long i25 = a.i(bArr4, 20) + (((j42 >> 6) | (j43 << 20)) & 4294967295L) + (i24 >> 32);
                    long i26 = a.i(bArr4, 24) + (((j43 >> 12) | (j44 << 14)) & 4294967295L) + (i25 >> 32);
                    long i27 = a.i(bArr4, 28);
                    byte[] bArr6 = new byte[16];
                    a.j(bArr6, i24 & 4294967295L, 0);
                    a.j(bArr6, i25 & 4294967295L, 4);
                    a.j(bArr6, i26 & 4294967295L, 8);
                    a.j(bArr6, ((((j44 >> 18) | (((j31 & j40) | (j39 & j41)) << 8)) & 4294967295L) + i27 + (i26 >> 32)) & 4294967295L, 12);
                    allocate.limit(allocate.limit() + 16);
                    allocate.put(bArr6);
                    return allocate.array();
                }
            }
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }
}
