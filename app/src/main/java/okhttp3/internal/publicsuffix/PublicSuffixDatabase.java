package okhttp3.internal.publicsuffix;

import ca.m;
import ca.o;
import ca.t;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f16848e = {42};

    /* renamed from: f */
    public static final String[] f16849f = new String[0];

    /* renamed from: g */
    public static final String[] f16850g = {"*"};

    /* renamed from: h */
    public static final PublicSuffixDatabase f16851h = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f16852a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f16853b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f16854c;

    /* renamed from: d */
    public byte[] f16855d;

    public static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    } else if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else if (i19 == bArr2.length - 1) {
                        break;
                    } else {
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, StandardCharsets.UTF_8);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i16 - 1;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        t tVar = new t(new m(o.f(resourceAsStream)));
        try {
            byte[] bArr = new byte[tVar.readInt()];
            tVar.G(bArr);
            byte[] bArr2 = new byte[tVar.readInt()];
            tVar.G(bArr2);
            tVar.close();
            synchronized (this) {
                this.f16854c = bArr;
                this.f16855d = bArr2;
            }
            this.f16853b.countDown();
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
                try {
                    tVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }
}
