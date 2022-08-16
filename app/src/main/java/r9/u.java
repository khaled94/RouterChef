package r9;

import e0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import s9.e;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final String[] f17472a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List<String> f17473a = new ArrayList(20);

        public final a a(String str, String str2) {
            u.a(str);
            u.b(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                c(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                c("", str.substring(1));
                return this;
            } else {
                c("", str);
                return this;
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final a c(String str, String str2) {
            this.f17473a.add(str);
            this.f17473a.add(str2.trim());
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        @Nullable
        public final String d(String str) {
            int size = this.f17473a.size();
            do {
                size -= 2;
                if (size < 0) {
                    return null;
                }
            } while (!str.equalsIgnoreCase((String) this.f17473a.get(size)));
            return (String) this.f17473a.get(size + 1);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final a e(String str) {
            int i10 = 0;
            while (i10 < this.f17473a.size()) {
                if (str.equalsIgnoreCase((String) this.f17473a.get(i10))) {
                    this.f17473a.remove(i10);
                    this.f17473a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public u(a aVar) {
        ?? r22 = aVar.f17473a;
        this.f17472a = (String[]) r22.toArray(new String[r22.size()]);
    }

    public u(String[] strArr) {
        this.f17472a = strArr;
    }

    public static void a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(e.j("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(d.a("value for name ", str2, " == null"));
    }

    public static u f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i10 = 0; i10 < strArr2.length; i10++) {
                if (strArr2[i10] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i10] = strArr2[i10].trim();
            }
            for (int i11 = 0; i11 < strArr2.length; i11 += 2) {
                String str = strArr2[i11];
                String str2 = strArr2[i11 + 1];
                a(str);
                b(str2, str);
            }
            return new u(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public final String c(String str) {
        String[] strArr = this.f17472a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String d(int i10) {
        return this.f17472a[i10 * 2];
    }

    public final a e() {
        a aVar = new a();
        Collections.addAll(aVar.f17473a, this.f17472a);
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof u) && Arrays.equals(((u) obj).f17472a, this.f17472a);
    }

    public final String g(int i10) {
        return this.f17472a[(i10 * 2) + 1];
    }

    public final List<String> h(String str) {
        int length = this.f17472a.length / 2;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equalsIgnoreCase(d(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(g(i10));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17472a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f17472a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append(d(i10));
            sb.append(": ");
            sb.append(g(i10));
            sb.append("\n");
        }
        return sb.toString();
    }
}
