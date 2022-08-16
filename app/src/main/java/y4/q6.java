package y4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import s4.t2;
import s4.y2;

/* loaded from: classes.dex */
public abstract class q6 {

    /* renamed from: a */
    public final String f20676a;

    /* renamed from: b */
    public final int f20677b;

    /* renamed from: c */
    public Boolean f20678c;

    /* renamed from: d */
    public Boolean f20679d;

    /* renamed from: e */
    public Long f20680e;

    /* renamed from: f */
    public Long f20681f;

    public q6(String str, int i10) {
        this.f20676a = str;
        this.f20677b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (r8.compareTo(r5) <= 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean d(java.math.BigDecimal r8, s4.t2 r9, double r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.q6.d(java.math.BigDecimal, s4.t2, double):java.lang.Boolean");
    }

    public static Boolean e(String str, y2 y2Var, s1 s1Var) {
        List<String> list;
        boolean z10;
        Objects.requireNonNull(y2Var, "null reference");
        if (str == null || !y2Var.A() || y2Var.B() == 1) {
            return null;
        }
        if (y2Var.B() == 7) {
            if (y2Var.s() == 0) {
                return null;
            }
        } else if (!y2Var.z()) {
            return null;
        }
        int B = y2Var.B();
        boolean x10 = y2Var.x();
        String v10 = (x10 || B == 2 || B == 7) ? y2Var.v() : y2Var.v().toUpperCase(Locale.ENGLISH);
        if (y2Var.s() == 0) {
            list = null;
        } else {
            list = y2Var.w();
            if (!x10) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String str2 : list) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str3 = B == 2 ? v10 : null;
        if (B == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (v10 == null) {
            return null;
        }
        if (!x10 && B != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (B - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != x10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (s1Var == null) {
                        return null;
                    }
                    s1Var.A.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                z10 = str.startsWith(v10);
                break;
            case 3:
                z10 = str.endsWith(v10);
                break;
            case 4:
                z10 = str.contains(v10);
                break;
            case 5:
                z10 = str.equals(v10);
                break;
            case 6:
                if (list == null) {
                    return null;
                }
                z10 = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(z10);
    }

    public static Boolean f(long j3, t2 t2Var) {
        try {
            return d(new BigDecimal(j3), t2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean g(String str, t2 t2Var) {
        if (!c6.O(str)) {
            return null;
        }
        try {
            return d(new BigDecimal(str), t2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
