package m4;

import androidx.activity.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a */
    public long f13914a;

    /* renamed from: b */
    public final String f13915b;

    /* renamed from: c */
    public final String f13916c;

    /* renamed from: d */
    public final long f13917d;

    /* renamed from: e */
    public final long f13918e;

    /* renamed from: f */
    public final long f13919f;

    /* renamed from: g */
    public final long f13920g;

    /* renamed from: h */
    public final List<x3> f13921h;

    public t4(String str, String str2, long j3, long j10, long j11, long j12, List<x3> list) {
        this.f13915b = str;
        this.f13916c = true == "".equals(str2) ? null : str2;
        this.f13917d = j3;
        this.f13918e = j10;
        this.f13919f = j11;
        this.f13920g = j12;
        this.f13921h = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.x3>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t4(java.lang.String r14, m4.p3 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f12394b
            long r3 = r15.f12395c
            long r5 = r15.f12396d
            long r7 = r15.f12397e
            long r9 = r15.f12398f
            java.util.List<m4.x3> r0 = r15.f12400h
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f12399g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            m4.x3 r11 = new m4.x3
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.t4.<init>(java.lang.String, m4.p3):void");
    }

    public static t4 a(u4 u4Var) {
        if (w4.d(u4Var) == 538247942) {
            String g10 = w4.g(u4Var);
            String g11 = w4.g(u4Var);
            long e10 = w4.e(u4Var);
            long e11 = w4.e(u4Var);
            long e12 = w4.e(u4Var);
            long e13 = w4.e(u4Var);
            int d5 = w4.d(u4Var);
            if (d5 < 0) {
                throw new IOException(k.a(31, "readHeaderList size=", d5));
            }
            List emptyList = d5 == 0 ? Collections.emptyList() : new ArrayList();
            for (int i10 = 0; i10 < d5; i10++) {
                emptyList.add(new x3(w4.g(u4Var).intern(), w4.g(u4Var).intern()));
            }
            return new t4(g10, g11, e10, e11, e12, e13, emptyList);
        }
        throw new IOException();
    }
}
