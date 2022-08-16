package e1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import m4.dc0;
import m4.ic;
import m4.jc;
import m4.md;
import m4.pq0;
import m4.rx;
import m4.s22;
import m4.uc;
import m4.v91;
import m4.w40;
import s4.va;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class i implements w40, jc, v91, d1 {

    /* renamed from: s */
    public static final /* synthetic */ i f4364s = new i();

    /* renamed from: t */
    public static final pq0 f4365t = new pq0();

    /* renamed from: u */
    public static final /* synthetic */ i f4366u = new i();

    /* renamed from: v */
    public static final int[] f4367v = {1, 2, 3, 6};

    /* renamed from: w */
    public static final int[] f4368w = {48000, 44100, 32000};

    /* renamed from: x */
    public static final int[] f4369x = {24000, 22050, 16000};
    public static final int[] y = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: z */
    public static final int[] f4370z = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] A = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final /* synthetic */ i B = new i();

    public static List c(byte[] bArr) {
        byte b10 = bArr[11];
        byte b11 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(g(((((b10 & 255) << 8) | (b11 & 255)) * 1000000000) / 48000));
        arrayList.add(g(80000000L));
        return arrayList;
    }

    public static boolean d(int i10) {
        Boolean bool;
        if (i10 - 1 == 0) {
            return !s22.a();
        }
        if (s22.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                s22.f13499a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static byte[] e(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] f(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                byte b10 = bArr[i10];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i10] = b11;
                if (i10 < 15) {
                    bArr2[i10] = (byte) (((bArr[i10 + 1] >> 7) & 1) | b11);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static byte[] g(long j3) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array();
    }

    public static int i(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f4368w[i10];
        if (i13 == 44100) {
            int i14 = A[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f4370z[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }

    @Override // m4.w40
    public void a(Throwable th, String str) {
    }

    @Override // m4.w40
    public void b(Throwable th, String str, float f10) {
    }

    @Override // m4.v91
    public void h(Object obj) {
        ((rx) obj).o();
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(va.f18158t.zza().c());
    }

    @Override // m4.jc, y4.d1
    /* renamed from: zza */
    public ic[] mo14zza() {
        int i10 = dc0.O;
        return new ic[]{new md(), new uc()};
    }
}
