package m4;

import j0.d;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import n.a;

/* loaded from: classes.dex */
public final class b7 {

    /* renamed from: a */
    public static boolean f6401a = false;

    /* renamed from: b */
    public static MessageDigest f6402b;

    /* renamed from: c */
    public static final Object f6403c = new Object();

    /* renamed from: d */
    public static final Object f6404d = new Object();

    /* renamed from: e */
    public static final CountDownLatch f6405e = new CountDownLatch(1);

    public static String a(k6 k6Var, String str) {
        byte[] bArr;
        x6 x6Var;
        byte[] b10 = k6Var.b();
        if (((Boolean) jo.f10145d.f10148c.a(es.M1)).booleanValue()) {
            Vector vector = null;
            int length = b10.length;
            if (length > 0) {
                int i10 = (length + 254) / 255;
                Vector vector2 = new Vector();
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = i11 * 255;
                    try {
                        int length2 = b10.length;
                        if (length2 - i12 > 255) {
                            length2 = i12 + 255;
                        }
                        vector2.add(Arrays.copyOfRange(b10, i12, length2));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                vector = vector2;
            }
            if (vector != null && vector.size() != 0) {
                w6 v10 = x6.v();
                int size = vector.size();
                for (int i13 = 0; i13 < size; i13++) {
                    v10.n(n82.D(d((byte[]) vector.get(i13), str, false), 0, 256));
                }
                n82 C = n82.C(c(b10));
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                x6.y((x6) v10.f9883t, C);
                x6Var = v10.k();
            } else {
                v5 V = k6.V();
                V.q(4096L);
                bArr = d(V.k().b(), str, true);
                return a.d(bArr, true);
            }
        } else if (d.y == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] b11 = d.y.b(b10, str != null ? str.getBytes() : new byte[0]);
            w6 v11 = x6.v();
            v11.n(n82.C(b11));
            if (v11.f9884u) {
                v11.m();
                v11.f9884u = false;
            }
            x6.z((x6) v11.f9883t, 3);
            x6Var = v11.k();
        }
        bArr = x6Var.b();
        return a.d(bArr, true);
    }

    public static void b() {
        synchronized (f6404d) {
            if (!f6401a) {
                f6401a = true;
                new Thread(new a7()).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = m4.b7.f6402b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] c(byte[] r6) {
        /*
            java.lang.Object r0 = m4.b7.f6403c
            monitor-enter(r0)
            b()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = m4.b7.f6405e     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = m4.b7.f6402b     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = m4.b7.f6402b     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b7.c(byte[]):byte[]");
    }

    public static byte[] d(byte[] bArr, String str, boolean z10) {
        ByteBuffer byteBuffer;
        int i10 = true != z10 ? 255 : 239;
        if (bArr.length > i10) {
            v5 V = k6.V();
            V.q(4096L);
            bArr = V.k().b();
        }
        int length = bArr.length;
        if (length < i10) {
            byte[] bArr2 = new byte[i10 - length];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z10) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        c7[] c7VarArr = new n7().G2;
        int length2 = c7VarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            c7VarArr[i11].b(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            z72 z72Var = new z72(str.getBytes("UTF-8"));
            int i12 = z72Var.f16033b;
            int i13 = z72Var.f16034c;
            for (int i14 = 0; i14 < 256; i14++) {
                i12 = (i12 + 1) & 255;
                byte[] bArr4 = z72Var.f16032a;
                byte b10 = bArr4[i12];
                i13 = (i13 + b10) & 255;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b10;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b10) & 255] ^ bArr3[i14]);
            }
            z72Var.f16033b = i12;
            z72Var.f16034c = i13;
        }
        return bArr3;
    }
}
