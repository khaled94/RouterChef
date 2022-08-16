package m4;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import d.b;
import h2.i;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.crypto.Cipher;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class is implements ar0, o72, aj2 {

    /* renamed from: s */
    public static final /* synthetic */ is f9738s = new is();

    /* renamed from: t */
    public static final /* synthetic */ is f9739t = new is();

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.ns>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.ns>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.ns>] */
    public static final void b(hs hsVar, gs gsVar) {
        File externalStorageDirectory;
        if (gsVar.f9015c != null) {
            if (!TextUtils.isEmpty(gsVar.f9016d)) {
                Context context = gsVar.f9015c;
                String str = gsVar.f9016d;
                String str2 = gsVar.f9013a;
                ?? r42 = gsVar.f9014b;
                hsVar.f9438e = context;
                hsVar.f9439f = str;
                hsVar.f9437d = str2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                hsVar.f9441h = atomicBoolean;
                atomicBoolean.set(it.f9744c.e().booleanValue());
                if (hsVar.f9441h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                    hsVar.f9442i = new File(externalStorageDirectory, "sdk_csi_data.txt");
                }
                for (Map.Entry entry : r42.entrySet()) {
                    hsVar.f9435b.put((String) entry.getKey(), (String) entry.getValue());
                }
                u90.f14294a.execute(new i(hsVar, 1));
                ?? r43 = hsVar.f9436c;
                ls lsVar = ns.f11910b;
                r43.put("action", lsVar);
                hsVar.f9436c.put("ad_format", lsVar);
                hsVar.f9436c.put("e", ns.f11911c);
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }

    public static final String d(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!(b10 >= 0)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (b11 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 >= i12) {
                            break;
                        }
                        byte b12 = byteBuffer.get(i10);
                        if (!(b12 >= 0)) {
                            break;
                        }
                        i10++;
                        i16 = i14 + 1;
                        cArr[i14] = (char) b12;
                    }
                } else {
                    if (!(b11 < -32)) {
                        if (b11 < -16) {
                            if (i15 >= i12 - 1) {
                                throw x92.d();
                            }
                            int i17 = i15 + 1;
                            b.k(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else if (i15 >= i12 - 2) {
                            throw x92.d();
                        } else {
                            int i18 = i15 + 1;
                            int i19 = i18 + 1;
                            b.g(b11, byteBuffer.get(i15), byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                            i14 += 2;
                            i10 = i19 + 1;
                        }
                    } else if (i15 >= i12) {
                        throw x92.d();
                    } else {
                        b.m(b11, byteBuffer.get(i15), cArr, i14);
                        i10 = i15 + 1;
                        i14++;
                    }
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r18[r0] <= (-65)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        if (r18[r0] <= (-65)) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(int r17, byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.is.a(int, byte[], int, int):int");
    }

    public String c(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!(b10 >= 0)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            while (i10 < i12) {
                int i14 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 >= 0) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    i10 = i14;
                    while (true) {
                        i13 = i15;
                        if (i10 >= i12) {
                            break;
                        }
                        byte b12 = bArr[i10];
                        if (!(b12 >= 0)) {
                            break;
                        }
                        i10++;
                        i15 = i13 + 1;
                        cArr[i13] = (char) b12;
                    }
                } else {
                    if (!(b11 < -32)) {
                        if (b11 < -16) {
                            if (i14 >= i12 - 1) {
                                throw x92.d();
                            }
                            int i16 = i14 + 1;
                            b.k(b11, bArr[i14], bArr[i16], cArr, i13);
                            i10 = i16 + 1;
                            i13++;
                        } else if (i14 >= i12 - 2) {
                            throw x92.d();
                        } else {
                            int i17 = i14 + 1;
                            int i18 = i17 + 1;
                            b.g(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i13);
                            i13 += 2;
                            i10 = i18 + 1;
                        }
                    } else if (i14 >= i12) {
                        throw x92.d();
                    } else {
                        b.m(b11, bArr[i14], cArr, i13);
                        i10 = i14 + 1;
                        i13++;
                    }
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public int mo30h(Object obj) {
        Pattern pattern = bj2.f6548a;
        String str = ((qi2) obj).f12883a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ls1.f10971a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((to0) obj).k();
    }
}
