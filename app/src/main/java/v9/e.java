package v9;

import ca.i;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import r9.g0;
import r9.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final /* synthetic */ int f19841a = 0;

    static {
        i.h("\"\\");
        i.h("\t ,=");
    }

    public static long a(g0 g0Var) {
        String c10 = g0Var.f17378x.c("Content-Length");
        if (c10 != null) {
            try {
                return Long.parseLong(c10);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean b(g0 g0Var) {
        if (g0Var.f17373s.f17312b.equals("HEAD")) {
            return false;
        }
        int i10 = g0Var.f17375u;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && a(g0Var) == -1 && !"chunked".equalsIgnoreCase(g0Var.c("Transfer-Encoding"))) ? false : true;
    }

    public static int c(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong >= 0) {
                return (int) parseLong;
            }
            return 0;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c0, code lost:
        if (r12 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cf, code lost:
        if (r12 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d1, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02d5, code lost:
        if (r0 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02d7, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r20 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018e, code lost:
        if ((r0.equals(r4) || (r0.endsWith(r4) && r0.charAt((r0.length() - r4.length()) - 1) == '.' && !s9.e.f18406k.matcher(r0).matches())) == false) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(r9.m r33, r9.v r34, r9.u r35) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.e.d(r9.m, r9.v, r9.u):void");
    }

    public static int e(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static Set<String> f(u uVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = uVar.f17472a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            if ("Vary".equalsIgnoreCase(uVar.d(i10))) {
                String g10 = uVar.g(i10);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : g10.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }
}
