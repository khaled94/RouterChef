package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dg2 {

    /* renamed from: a */
    public final d30 f7392a;

    /* renamed from: b */
    public gw1<uj2> f7393b = gx1.f9060w;

    /* renamed from: c */
    public kw1<uj2, z40> f7394c = lx1.y;

    /* renamed from: d */
    public uj2 f7395d;

    /* renamed from: e */
    public uj2 f7396e;

    /* renamed from: f */
    public uj2 f7397f;

    public dg2(d30 d30Var) {
        this.f7392a = d30Var;
        pu1 pu1Var = gw1.f9058t;
    }

    public static uj2 a(te2 te2Var, gw1<uj2> gw1Var, uj2 uj2Var, d30 d30Var) {
        z40 l10 = te2Var.l();
        int h10 = te2Var.h();
        Object f10 = l10.o() ? null : l10.f(h10);
        if (!te2Var.m() && !l10.o()) {
            d30 d5 = l10.d(h10, d30Var, false);
            xf2.b(te2Var.j());
            Objects.requireNonNull(d5);
        }
        for (int i10 = 0; i10 < gw1Var.size(); i10++) {
            uj2 uj2Var2 = gw1Var.get(i10);
            if (d(uj2Var2, f10, te2Var.m(), te2Var.e(), te2Var.f())) {
                return uj2Var2;
            }
        }
        if (!gw1Var.isEmpty() || uj2Var == null || !d(uj2Var, f10, te2Var.m(), te2Var.e(), te2Var.f())) {
            return null;
        }
        return uj2Var;
    }

    public static boolean d(uj2 uj2Var, Object obj, boolean z10, int i10, int i11) {
        if (!uj2Var.f8973a.equals(obj)) {
            return false;
        }
        if (z10) {
            if (uj2Var.f8974b != i10 || uj2Var.f8975c != i11) {
                return false;
            }
        } else if (uj2Var.f8974b != -1 || uj2Var.f8977e != -1) {
            return false;
        }
        return true;
    }

    public final void b(jw1<uj2, z40> jw1Var, uj2 uj2Var, z40 z40Var) {
        if (uj2Var == null) {
            return;
        }
        if (z40Var.a(uj2Var.f8973a) != -1) {
            jw1Var.a(uj2Var, z40Var);
            return;
        }
        z40 z40Var2 = this.f7394c.get(uj2Var);
        if (z40Var2 == null) {
            return;
        }
        jw1Var.a(uj2Var, z40Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (m4.js.a(r3.f7395d, r3.f7397f) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r3.f7393b.contains(r3.f7395d) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        b(r0, r3.f7395d, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(m4.z40 r4) {
        /*
            r3 = this;
            m4.jw1 r0 = new m4.jw1
            r1 = 4
            r0.<init>(r1)
            m4.gw1<m4.uj2> r1 = r3.f7393b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L37
            m4.uj2 r1 = r3.f7396e
            r3.b(r0, r1, r4)
            m4.uj2 r1 = r3.f7397f
            m4.uj2 r2 = r3.f7396e
            boolean r1 = m4.js.a(r1, r2)
            if (r1 != 0) goto L22
            m4.uj2 r1 = r3.f7397f
            r3.b(r0, r1, r4)
        L22:
            m4.uj2 r1 = r3.f7395d
            m4.uj2 r2 = r3.f7396e
            boolean r1 = m4.js.a(r1, r2)
            if (r1 != 0) goto L5d
            m4.uj2 r1 = r3.f7395d
            m4.uj2 r2 = r3.f7397f
            boolean r1 = m4.js.a(r1, r2)
            if (r1 != 0) goto L5d
            goto L58
        L37:
            r1 = 0
        L38:
            m4.gw1<m4.uj2> r2 = r3.f7393b
            int r2 = r2.size()
            if (r1 >= r2) goto L4e
            m4.gw1<m4.uj2> r2 = r3.f7393b
            java.lang.Object r2 = r2.get(r1)
            m4.uj2 r2 = (m4.uj2) r2
            r3.b(r0, r2, r4)
            int r1 = r1 + 1
            goto L38
        L4e:
            m4.gw1<m4.uj2> r1 = r3.f7393b
            m4.uj2 r2 = r3.f7395d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5d
        L58:
            m4.uj2 r1 = r3.f7395d
            r3.b(r0, r1, r4)
        L5d:
            m4.kw1 r4 = r0.b()
            m4.lx1 r4 = (m4.lx1) r4
            r3.f7394c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.dg2.c(m4.z40):void");
    }
}
