package m4;

import android.os.Bundle;
import c5.i;
import c5.l;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import m7.h;
import s4.aa;
import y4.d1;
import y4.e1;
import y4.f1;
import z3.c;

/* loaded from: classes.dex */
public /* synthetic */ class g7 implements ar0, h, d1, c5.h {

    /* renamed from: u */
    public static g7 f8758u;

    /* renamed from: s */
    public static final /* synthetic */ g7 f8756s = new g7();

    /* renamed from: t */
    public static final fu0 f8757t = new fu0(1);

    /* renamed from: v */
    public static final /* synthetic */ g7 f8759v = new g7();

    /* renamed from: w */
    public static final /* synthetic */ g7 f8760w = new g7();

    public static p02 b(String str) {
        ConcurrentMap<String, p02> concurrentMap;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Logger logger = i12.f9506a;
        synchronized (i12.class) {
            concurrentMap = i12.f9512g;
            unmodifiableMap = Collections.unmodifiableMap(concurrentMap);
        }
        if (!unmodifiableMap.containsKey(str)) {
            throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
        }
        synchronized (i12.class) {
            unmodifiableMap2 = Collections.unmodifiableMap(concurrentMap);
        }
        return (p02) unmodifiableMap2.get(str);
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] d(byte[]... bArr) {
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i10 > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += length;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i11, length2);
            i11 += length2;
        }
        return bArr3;
    }

    public static final byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return f(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    @Override // c5.h
    public i a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = c.f20927h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            bundle = null;
        }
        return l.e(bundle);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((zq0) obj).a();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().c());
    }
}
