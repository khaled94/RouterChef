package t9;

import javax.annotation.Nullable;
import r9.g0;
import r9.w;

/* loaded from: classes.dex */
public final class b implements w {
    @Nullable

    /* renamed from: a */
    public final g f18866a;

    public b(@Nullable g gVar) {
        this.f18866a = gVar;
    }

    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static g0 d(g0 g0Var) {
        if (g0Var == null || g0Var.y == null) {
            return g0Var;
        }
        g0.a aVar = new g0.a(g0Var);
        aVar.f17386g = null;
        return aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x020d, code lost:
        if (r3 > 0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v53, types: [t9.e$e] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [r9.i0] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [r9.g0, r9.c0] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // r9.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r9.g0 a(r9.w.a r26) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b.a(r9.w$a):r9.g0");
    }
}
