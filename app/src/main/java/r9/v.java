package r9;

import ca.f;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import s9.e;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: j */
    public static final char[] f17474j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f17475a;

    /* renamed from: b */
    public final String f17476b;

    /* renamed from: c */
    public final String f17477c;

    /* renamed from: d */
    public final String f17478d;

    /* renamed from: e */
    public final int f17479e;

    /* renamed from: f */
    public final List<String> f17480f;
    @Nullable

    /* renamed from: g */
    public final List<String> f17481g;
    @Nullable

    /* renamed from: h */
    public final String f17482h;

    /* renamed from: i */
    public final String f17483i;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable

        /* renamed from: a */
        public String f17484a;
        @Nullable

        /* renamed from: d */
        public String f17487d;

        /* renamed from: f */
        public final List<String> f17489f;
        @Nullable

        /* renamed from: g */
        public List<String> f17490g;
        @Nullable

        /* renamed from: h */
        public String f17491h;

        /* renamed from: b */
        public String f17485b = "";

        /* renamed from: c */
        public String f17486c = "";

        /* renamed from: e */
        public int f17488e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f17489f = arrayList;
            arrayList.add("");
        }

        public final v a() {
            if (this.f17484a != null) {
                if (this.f17487d == null) {
                    throw new IllegalStateException("host == null");
                }
                return new v(this);
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a b(@Nullable String str) {
            this.f17490g = (ArrayList) (str != null ? v.p(v.b(str, " \"'<>#", true, false, true, true)) : null);
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
            if (r1 <= 65535) goto L106;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x028a  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x01d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01b3  */
        /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v42, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v43, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v16, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v17, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v19, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0280 -> B:125:0x0287). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final r9.v.a c(@javax.annotation.Nullable r9.v r23, java.lang.String r24) {
            /*
                Method dump skipped, instructions count: 966
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.v.a.c(r9.v, java.lang.String):r9.v$a");
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.util.List<java.lang.String>, java.util.ArrayList] */
        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f17484a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f17485b.isEmpty() || !this.f17486c.isEmpty()) {
                sb.append(this.f17485b);
                if (!this.f17486c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f17486c);
                }
                sb.append('@');
            }
            String str3 = this.f17487d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f17487d);
                    sb.append(']');
                } else {
                    sb.append(this.f17487d);
                }
            }
            int i10 = this.f17488e;
            if (i10 != -1 || this.f17484a != null) {
                if (i10 == -1) {
                    i10 = v.d(this.f17484a);
                }
                String str4 = this.f17484a;
                if (str4 == null || i10 != v.d(str4)) {
                    sb.append(':');
                    sb.append(i10);
                }
            }
            ?? r12 = this.f17489f;
            int size = r12.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb.append('/');
                sb.append((String) r12.get(i11));
            }
            if (this.f17490g != null) {
                sb.append('?');
                v.j(sb, this.f17490g);
            }
            if (this.f17491h != null) {
                sb.append('#');
                sb.append(this.f17491h);
            }
            return sb.toString();
        }
    }

    public v(a aVar) {
        this.f17475a = aVar.f17484a;
        this.f17476b = l(aVar.f17485b);
        this.f17477c = l(aVar.f17486c);
        this.f17478d = aVar.f17487d;
        int i10 = aVar.f17488e;
        this.f17479e = i10 == -1 ? d(aVar.f17484a) : i10;
        this.f17480f = n(aVar.f17489f, false);
        List<String> list = aVar.f17490g;
        String str = null;
        this.f17481g = list != null ? n(list, true) : null;
        String str2 = aVar.f17491h;
        this.f17482h = str2 != null ? m(str2, 0, str2.length(), false) : str;
        this.f17483i = aVar.toString();
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z10 || (z11 && !o(str, i12, i11)))) || (codePointAt == 43 && z12)))) {
                f fVar = new f();
                fVar.H0(str, i10, i12);
                f fVar2 = null;
                while (i12 < i11) {
                    int codePointAt2 = str.codePointAt(i12);
                    if (!z10 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z12) {
                            String str3 = z10 ? "+" : "%2B";
                            fVar.H0(str3, 0, str3.length());
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z13) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z10 || (z11 && !o(str, i12, i11)))))) {
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.I0(codePointAt2);
                            while (!fVar2.y()) {
                                int readByte = fVar2.readByte() & 255;
                                fVar.B0(37);
                                char[] cArr = f17474j;
                                fVar.B0(cArr[(readByte >> 4) & 15]);
                                fVar.B0(cArr[readByte & 15]);
                            }
                        } else {
                            fVar.I0(codePointAt2);
                        }
                    }
                    i12 += Character.charCount(codePointAt2);
                }
                return fVar.t0();
            }
            i12 += Character.charCount(codePointAt);
        }
        return str.substring(i10, i11);
    }

    public static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13);
    }

    public static String c(String str, boolean z10) {
        return a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z10, false, true, true);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String l(String str) {
        return m(str, 0, str.length(), false);
    }

    public static String m(String str, int i10, int i11, boolean z10) {
        int i12;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z10)) {
                f fVar = new f();
                fVar.H0(str, i10, i13);
                while (i13 < i11) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt != 37 || (i12 = i13 + 2) >= i11) {
                        if (codePointAt == 43 && z10) {
                            fVar.B0(32);
                            i13 += Character.charCount(codePointAt);
                        }
                        fVar.I0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        int e10 = e.e(str.charAt(i13 + 1));
                        int e11 = e.e(str.charAt(i12));
                        if (e10 != -1 && e11 != -1) {
                            fVar.B0((e10 << 4) + e11);
                            i13 = i12;
                            i13 += Character.charCount(codePointAt);
                        }
                        fVar.I0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return fVar.t0();
            }
            i13++;
        }
        return str.substring(i10, i11);
    }

    public static boolean o(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && e.e(str.charAt(i10 + 1)) != -1 && e.e(str.charAt(i12)) != -1;
    }

    public static List<String> p(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f17477c.isEmpty()) {
            return "";
        }
        int indexOf = this.f17483i.indexOf(64);
        return this.f17483i.substring(this.f17483i.indexOf(58, this.f17475a.length() + 3) + 1, indexOf);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof v) && ((v) obj).f17483i.equals(this.f17483i);
    }

    public final String f() {
        int indexOf = this.f17483i.indexOf(47, this.f17475a.length() + 3);
        String str = this.f17483i;
        return this.f17483i.substring(indexOf, e.h(str, indexOf, str.length(), "?#"));
    }

    public final List<String> g() {
        int indexOf = this.f17483i.indexOf(47, this.f17475a.length() + 3);
        String str = this.f17483i;
        int h10 = e.h(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < h10) {
            int i10 = indexOf + 1;
            int g10 = e.g(this.f17483i, i10, h10, '/');
            arrayList.add(this.f17483i.substring(i10, g10));
            indexOf = g10;
        }
        return arrayList;
    }

    @Nullable
    public final String h() {
        if (this.f17481g == null) {
            return null;
        }
        int indexOf = this.f17483i.indexOf(63) + 1;
        String str = this.f17483i;
        return this.f17483i.substring(indexOf, e.g(str, indexOf, str.length(), '#'));
    }

    public final int hashCode() {
        return this.f17483i.hashCode();
    }

    public final String i() {
        if (this.f17476b.isEmpty()) {
            return "";
        }
        int length = this.f17475a.length() + 3;
        String str = this.f17483i;
        return this.f17483i.substring(length, e.h(str, length, str.length(), ":@"));
    }

    @Nullable
    public final a k(String str) {
        try {
            a aVar = new a();
            aVar.c(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> n(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? m(str, 0, str.length(), z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String q() {
        a k10 = k("/...");
        Objects.requireNonNull(k10);
        k10.f17485b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        k10.f17486c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return k10.a().f17483i;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final URI r() {
        a aVar = new a();
        aVar.f17484a = this.f17475a;
        aVar.f17485b = i();
        aVar.f17486c = e();
        aVar.f17487d = this.f17478d;
        aVar.f17488e = this.f17479e != d(this.f17475a) ? this.f17479e : -1;
        aVar.f17489f.clear();
        aVar.f17489f.addAll(g());
        aVar.b(h());
        aVar.f17491h = this.f17482h == null ? null : this.f17483i.substring(this.f17483i.indexOf(35) + 1);
        int size = aVar.f17489f.size();
        for (int i10 = 0; i10 < size; i10++) {
            aVar.f17489f.set(i10, b((String) aVar.f17489f.get(i10), "[]", true, true, false, true));
        }
        List<String> list = aVar.f17490g;
        if (list != null) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str = aVar.f17490g.get(i11);
                if (str != null) {
                    aVar.f17490g.set(i11, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = aVar.f17491h;
        if (str2 != null) {
            aVar.f17491h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f17483i;
    }
}
