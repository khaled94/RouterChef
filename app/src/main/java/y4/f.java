package y4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c */
    public static final f f20393c = new f(null, null);

    /* renamed from: a */
    public final Boolean f20394a;

    /* renamed from: b */
    public final Boolean f20395b;

    public f(Boolean bool, Boolean bool2) {
        this.f20394a = bool;
        this.f20395b = bool2;
    }

    public static f a(Bundle bundle) {
        return bundle == null ? f20393c : new f(j(bundle.getString("ad_storage")), j(bundle.getString("analytics_storage")));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y4.f b(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L38
            int r1 = r7.length()
            r2 = 49
            r3 = 48
            r4 = 3
            if (r1 < r4) goto L1e
            r1 = 2
            char r1 = r7.charAt(r1)
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L18
            goto L1e
        L18:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L1f
        L1b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L1f
        L1e:
            r1 = r0
        L1f:
            int r5 = r7.length()
            r6 = 4
            if (r5 < r6) goto L35
            char r7 = r7.charAt(r4)
            if (r7 == r3) goto L32
            if (r7 == r2) goto L2f
            goto L35
        L2f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L34
        L32:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L34:
            r0 = r7
        L35:
            r7 = r0
            r0 = r1
            goto L39
        L38:
            r7 = r0
        L39:
            y4.f r1 = new y4.f
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f.b(java.lang.String):y4.f");
    }

    public static Boolean d(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z10 = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public static final int i(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean j(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final f c(f fVar) {
        return new f(d(this.f20394a, fVar.f20394a), d(this.f20395b, fVar.f20395b));
    }

    public final String e() {
        char c10;
        StringBuilder sb = new StringBuilder("G1");
        Boolean bool = this.f20394a;
        char c11 = '1';
        if (bool == null) {
            c10 = '-';
        } else {
            c10 = bool.booleanValue() ? '1' : '0';
        }
        sb.append(c10);
        Boolean bool2 = this.f20395b;
        if (bool2 == null) {
            c11 = '-';
        } else if (!bool2.booleanValue()) {
            c11 = '0';
        }
        sb.append(c11);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i(this.f20394a) == i(fVar.f20394a) && i(this.f20395b) == i(fVar.f20395b);
    }

    public final boolean f() {
        Boolean bool = this.f20394a;
        return bool == null || bool.booleanValue();
    }

    public final boolean g() {
        Boolean bool = this.f20395b;
        return bool == null || bool.booleanValue();
    }

    public final boolean h(f fVar) {
        Boolean bool = this.f20394a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || fVar.f20394a == bool2) {
            return this.f20395b == bool2 && fVar.f20395b != bool2;
        }
        return true;
    }

    public final int hashCode() {
        return i(this.f20395b) + ((i(this.f20394a) + 527) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f20394a;
        String str = "denied";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? str : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f20395b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str = "granted";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
