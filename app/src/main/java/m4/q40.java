package m4;

import android.util.Pair;
import androidx.activity.k;
import androidx.fragment.app.b1;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import javax.annotation.concurrent.GuardedBy;
import l0.d;

/* loaded from: classes.dex */
public final class q40 implements o72, ar0 {
    @GuardedBy("InternalQueryInfoGenerator.class")

    /* renamed from: s */
    public static i80 f12691s;

    /* renamed from: t */
    public static final /* synthetic */ q40 f12692t = new q40();

    /* renamed from: u */
    public static final o01 f12693u = new o01();

    public static Object a(@CheckForNull Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(k.a(20, "at index ", i10));
    }

    public static X509Certificate[][] b(String str) {
        Pair pair;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i10 = 0;
            if (randomAccessFile.length() < 22) {
                pair = null;
            } else {
                pair = mz1.g(randomAccessFile, 0);
                if (pair == null) {
                    pair = mz1.g(randomAccessFile, 65535);
                }
            }
            if (pair == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new m3(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pair.first;
            long longValue = ((Long) pair.second).longValue();
            long j3 = (-20) + longValue;
            if (j3 >= 0) {
                randomAccessFile.seek(j3);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new m3("ZIP64 APK not supported");
                }
            }
            mz1.k(byteBuffer);
            long j10 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j10 >= longValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j10);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new m3(sb2.toString());
            }
            mz1.k(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j10 != longValue) {
                throw new m3("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j10 < 32) {
                StringBuilder sb3 = new StringBuilder(87);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j10);
                throw new m3(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j10 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new m3("No APK Signing Block before ZIP Central Directory");
            }
            long j11 = allocate.getLong(0);
            if (j11 < allocate.capacity() || j11 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(57);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j11);
                throw new m3(sb4.toString());
            }
            int i11 = (int) (8 + j11);
            long j12 = j10 - i11;
            if (j12 < 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j12);
                throw new m3(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i11);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j13 = allocate2.getLong(0);
            if (j13 != j11) {
                StringBuilder sb6 = new StringBuilder(103);
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j13);
                sb6.append(" vs ");
                sb6.append(j11);
                throw new m3(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(38);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < ");
                sb7.append(8);
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(41);
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            byteBuffer2.position(0);
            byteBuffer2.limit(capacity);
            byteBuffer2.position(8);
            ByteBuffer slice = byteBuffer2.slice();
            slice.order(byteBuffer2.order());
            byteBuffer2.position(0);
            byteBuffer2.limit(limit);
            byteBuffer2.position(position);
            while (slice.hasRemaining()) {
                i10++;
                if (slice.remaining() < 8) {
                    StringBuilder sb9 = new StringBuilder(70);
                    sb9.append("Insufficient data to read size of APK Signing Block entry #");
                    sb9.append(i10);
                    throw new m3(sb9.toString());
                }
                long j14 = slice.getLong();
                if (j14 < 4 || j14 > 2147483647L) {
                    StringBuilder sb10 = new StringBuilder(76);
                    sb10.append("APK Signing Block entry #");
                    sb10.append(i10);
                    sb10.append(" size out of range: ");
                    sb10.append(j14);
                    throw new m3(sb10.toString());
                }
                int i12 = (int) j14;
                int position2 = slice.position() + i12;
                if (i12 > slice.remaining()) {
                    int remaining = slice.remaining();
                    StringBuilder sb11 = new StringBuilder(91);
                    sb11.append("APK Signing Block entry #");
                    sb11.append(i10);
                    sb11.append(" size out of range: ");
                    sb11.append(i12);
                    sb11.append(", available: ");
                    sb11.append(remaining);
                    throw new m3(sb11.toString());
                } else if (slice.getInt() == 1896449818) {
                    X509Certificate[][] q10 = q(randomAccessFile.getChannel(), new l3(k(slice, i12 - 4), longValue2, j10, longValue, byteBuffer));
                    randomAccessFile.close();
                    return q10;
                } else {
                    slice.position(position2);
                }
            }
            throw new m3("No APK Signature Scheme v2 block in APK Signing Block");
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalArgumentException(k.a(44, "Unknown content digest algorthm: ", i10));
            }
            return 64;
        }
        return 32;
    }

    public static String d(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb3.length() != 0 ? "Exception during lenientFormat for ".concat(sb3) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 9 + name2.length());
                    b1.b(sb4, "<", sb3, " threw ", name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i11] = sb;
            i11++;
        }
        StringBuilder sb5 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i12, indexOf);
            sb5.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb5.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb5.append(", ");
                sb5.append(objArr[i13]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static Object[] f(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static int g(int i10) {
        if (i10 != 513) {
            if (i10 == 514) {
                return 2;
            }
            if (i10 == 769) {
                return 1;
            }
            switch (i10) {
                case 257:
                case 259:
                    return 1;
                case 258:
                case 260:
                    return 2;
                default:
                    String valueOf = String.valueOf(Long.toHexString(i10));
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
            }
        }
        return 1;
    }

    public static String i(@CheckForNull String str) {
        int i10 = gu1.f9052a;
        return str == null ? "" : str;
    }

    public static String j(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalArgumentException(k.a(44, "Unknown content digest algorthm: ", i10));
            }
            return "SHA-512";
        }
        return "SHA-256";
    }

    public static ByteBuffer k(ByteBuffer byteBuffer, int i10) {
        if (i10 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i11 = i10 + position;
            if (i11 < position || i11 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i11);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i11);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new IllegalArgumentException(k.a(17, "size: ", i10));
    }

    public static ByteBuffer l(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 < 0) {
                throw new IllegalArgumentException("Negative length");
            }
            if (i10 > byteBuffer.remaining()) {
                throw new IOException(d.a(101, "Length-prefixed field longer than remaining buffer. Field length: ", i10, ", remaining: ", byteBuffer.remaining()));
            }
            return k(byteBuffer, i10);
        }
        throw new IOException(k.a(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    public static void m(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static byte[] n(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 > byteBuffer.remaining()) {
                throw new IOException(d.a(90, "Underflow while reading length-prefixed value. Length: ", i10, ", available: ", byteBuffer.remaining()));
            }
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = g(r10);
        r12 = g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c A[Catch: SignatureException -> 0x024a, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024c, InvalidKeyException -> 0x024e, InvalidKeySpecException -> 0x0250, NoSuchAlgorithmException -> 0x0252, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024c, blocks: (B:66:0x0126, B:68:0x013c, B:69:0x013f), top: B:125:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[] o(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.q40.o(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static byte[][] p(int[] iArr, j3[] j3VarArr) {
        int length;
        long j3 = 0;
        int i10 = 0;
        long j10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            j10 += (j3VarArr[i11].mo22zza() + 1048575) / 1048576;
        }
        if (j10 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j10);
            throw new DigestException(sb.toString());
        }
        int i12 = (int) j10;
        byte[][] bArr = new byte[iArr.length];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            if (i13 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(c(iArr[i13]) * i12) + 5];
            bArr2[0] = 90;
            m(i12, bArr2);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String j11 = j(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(j11);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(j11.concat(" digest not supported"), e10);
            }
        }
        long j12 = 1048576;
        int i15 = 0;
        int i16 = 3;
        int i17 = 0;
        while (i10 < i16) {
            j3 j3Var = j3VarArr[i10];
            int i18 = i17;
            int i19 = i15;
            long mo22zza = j3Var.mo22zza();
            long j13 = j12;
            long j14 = j3;
            while (mo22zza > j3) {
                int min = (int) Math.min(mo22zza, j13);
                m(min, bArr3);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    j3Var.b(messageDigestArr, j14, min);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int c10 = c(i22);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr4, (i19 * c10) + 5, c10);
                        if (digest != c10) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i21++;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j15 = min;
                    j14 += j15;
                    mo22zza -= j15;
                    i19++;
                    j3 = 0;
                    j13 = 1048576;
                } catch (IOException e11) {
                    throw new DigestException(d.a(59, "Failed to digest chunk #", i19, " of section #", i18), e11);
                }
            }
            i15 = i19;
            i17 = i18 + 1;
            i10++;
            j3 = 0;
            i16 = 3;
            j12 = 1048576;
            messageDigestArr = messageDigestArr;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr7 = bArr[i23];
            String j16 = j(i24);
            try {
                bArr6[i23] = MessageDigest.getInstance(j16).digest(bArr7);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(j16.concat(" digest not supported"), e12);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] q(FileChannel fileChannel, l3 l3Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer l10 = l(l3Var.f10646a);
                int i10 = 0;
                while (l10.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(o(l(l10), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i10);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    long j3 = l3Var.f10647b;
                    long j10 = l3Var.f10648c;
                    long j11 = l3Var.f10649d;
                    ByteBuffer byteBuffer = l3Var.f10650e;
                    if (!hashMap.isEmpty()) {
                        k3 k3Var = new k3(fileChannel, 0L, j3);
                        k3 k3Var2 = new k3(fileChannel, j10, j11 - j10);
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        mz1.k(duplicate);
                        int position = duplicate.position() + 16;
                        if (j3 >= 0 && j3 <= 4294967295L) {
                            duplicate.putInt(duplicate.position() + position, (int) j3);
                            fk0 fk0Var = new fk0(duplicate);
                            int size = hashMap.size();
                            int[] iArr = new int[size];
                            int i11 = 0;
                            for (Integer num : hashMap.keySet()) {
                                iArr[i11] = num.intValue();
                                i11++;
                            }
                            try {
                                byte[][] p = p(iArr, new j3[]{k3Var, k3Var2, fk0Var});
                                for (int i12 = 0; i12 < size; i12++) {
                                    int i13 = iArr[i12];
                                    if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i13)), p[i12])) {
                                        throw new SecurityException(j(i13).concat(" digest of contents did not verify"));
                                    }
                                }
                                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                            } catch (DigestException e11) {
                                throw new SecurityException("Failed to compute digest(s) of contents", e11);
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(47);
                        sb2.append("uint32 value of out range: ");
                        sb2.append(j3);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    throw new SecurityException("No digests provided");
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((rq0) obj).zza();
    }
}
