package s9;

import androidx.activity.result.a;
import ca.f;
import ca.r;
import ca.y;
import ca.z;
import e0.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import r9.h0;
import r9.u;
import r9.v;
import r9.z;
import s.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final byte[] f18396a;

    /* renamed from: b */
    public static final String[] f18397b = new String[0];

    /* renamed from: c */
    public static final u f18398c = u.f(new String[0]);

    /* renamed from: d */
    public static final h0 f18399d;

    /* renamed from: e */
    public static final r f18400e;

    /* renamed from: f */
    public static final Charset f18401f;

    /* renamed from: g */
    public static final Charset f18402g;

    /* renamed from: h */
    public static final TimeZone f18403h;

    /* renamed from: i */
    public static final Comparator<String> f18404i;

    /* renamed from: j */
    public static final Method f18405j;

    /* renamed from: k */
    public static final Pattern f18406k;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.e.<clinit>():void");
    }

    public static String a(String str) {
        int i10 = -1;
        int i11 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                for (int i12 = 0; i12 < lowerCase.length(); i12++) {
                    char charAt = lowerCase.charAt(i12);
                    if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                    }
                    i11 = 1;
                }
                if (i11 == 0) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress f10 = (!str.startsWith("[") || !str.endsWith("]")) ? f(str, 0, str.length()) : f(str, 1, str.length() - 1);
        if (f10 == null) {
            return null;
        }
        byte[] address = f10.getAddress();
        if (address.length == 16) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < address.length) {
                int i15 = i13;
                while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                    i15 += 2;
                }
                int i16 = i15 - i13;
                if (i16 > i14 && i16 >= 4) {
                    i10 = i13;
                    i14 = i16;
                }
                i13 = i15 + 2;
            }
            f fVar = new f();
            while (i11 < address.length) {
                if (i11 == i10) {
                    fVar.B0(58);
                    i11 += i14;
                    if (i11 == 16) {
                        fVar.B0(58);
                    }
                } else {
                    if (i11 > 0) {
                        fVar.B0(58);
                    }
                    fVar.l(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                    i11 += 2;
                }
            }
            return fVar.t0();
        } else if (address.length == 4) {
            return f10.getHostAddress();
        } else {
            throw new AssertionError(d.a("Invalid IPv6 address: '", str, "'"));
        }
    }

    public static void b(long j3, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j3 || j3 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!p(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                c11 = 'A';
                if (c10 < 'A' || c10 > 'F') {
                    return -1;
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00db, code lost:
        if (r7 == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
        if (r8 != (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress f(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.e.f(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int g(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int h(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean i(y yVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            return s(yVar, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String k(v vVar, boolean z10) {
        String str;
        if (vVar.f17478d.contains(":")) {
            str = b.b(a.c("["), vVar.f17478d, "]");
        } else {
            str = vVar.f17478d;
        }
        if (z10 || vVar.f17479e != v.d(vVar.f17475a)) {
            StringBuilder c10 = androidx.fragment.app.a.c(str, ":");
            c10.append(vVar.f17479e);
            return c10.toString();
        }
        return str;
    }

    public static <T> List<T> l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int n(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    public static String[] o(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean p(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean q(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean r(v vVar, v vVar2) {
        return vVar.f17478d.equals(vVar2.f17478d) && vVar.f17479e == vVar2.f17479e && vVar.f17475a.equals(vVar2.f17475a);
    }

    public static boolean s(y yVar, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanoTime = System.nanoTime();
        long c10 = yVar.d().e() ? yVar.d().c() - nanoTime : Long.MAX_VALUE;
        yVar.d().d(Math.min(c10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            f fVar = new f();
            while (yVar.D(fVar, 8192L) != -1) {
                fVar.b();
            }
            int i11 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            z d5 = yVar.d();
            if (i11 == 0) {
                d5.a();
            } else {
                d5.d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i12 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            z d10 = yVar.d();
            if (i12 == 0) {
                d10.a();
            } else {
                d10.d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            int i13 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            z d11 = yVar.d();
            if (i13 == 0) {
                d11.a();
            } else {
                d11.d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static int t(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int u(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static u v(List<x9.b> list) {
        u.a aVar = new u.a();
        for (x9.b bVar : list) {
            z.a aVar2 = a.f18391a;
            String q10 = bVar.f20111a.q();
            String q11 = bVar.f20112b.q();
            Objects.requireNonNull(aVar2);
            aVar.c(q10, q11);
        }
        return new u(aVar);
    }

    public static String w(String str, int i10, int i11) {
        int t10 = t(str, i10, i11);
        return str.substring(t10, u(str, t10, i11));
    }
}
