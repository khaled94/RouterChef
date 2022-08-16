package m4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class oe1 implements eh1<pe1> {

    /* renamed from: a */
    public final uz1 f12126a;

    /* renamed from: b */
    public final k01 f12127b;

    /* renamed from: c */
    public final String f12128c;

    /* renamed from: d */
    public final om1 f12129d;

    public oe1(uz1 uz1Var, k01 k01Var, om1 om1Var, String str) {
        this.f12126a = uz1Var;
        this.f12127b = k01Var;
        this.f12129d = om1Var;
        this.f12128c = str;
    }

    @Override // m4.eh1
    public final tz1<pe1> a() {
        return this.f12126a.Z(new Callable() { // from class: m4.ne1
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    r8 = this;
                    m4.oe1 r0 = m4.oe1.this
                    m4.k01 r1 = r0.f12127b
                    m4.om1 r2 = r0.f12129d
                    java.lang.String r2 = r2.f12205f
                    java.lang.String r3 = r0.f12128c
                    java.util.Objects.requireNonNull(r1)
                    m4.yr<java.lang.Boolean> r4 = m4.es.f8152n2
                    m4.jo r5 = m4.jo.f10145d
                    m4.ds r6 = r5.f10148c
                    java.lang.Object r4 = r6.a(r4)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    r6 = 0
                    if (r4 != 0) goto L21
                    goto L52
                L21:
                    if (r2 == 0) goto L52
                    if (r3 != 0) goto L26
                    goto L52
                L26:
                    boolean r4 = r1.f10230d
                    if (r4 != 0) goto L2d
                    r1.a()
                L2d:
                    java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r4 = r1.f10227a
                    java.lang.Object r4 = r4.get(r3)
                    java.util.Map r4 = (java.util.Map) r4
                    if (r4 != 0) goto L38
                    goto L52
                L38:
                    java.lang.Object r7 = r4.get(r2)
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    if (r7 == 0) goto L41
                    goto L53
                L41:
                    org.json.JSONObject r1 = r1.f10231e
                    java.lang.String r1 = k9.u.e(r1, r2, r3)
                    if (r1 != 0) goto L4a
                    goto L52
                L4a:
                    java.lang.Object r1 = r4.get(r1)
                    r7 = r1
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    goto L53
                L52:
                    r7 = r6
                L53:
                    m4.k01 r0 = r0.f12127b
                    java.util.Objects.requireNonNull(r0)
                    m4.yr<java.lang.Boolean> r1 = m4.es.f8160o2
                    m4.ds r2 = r5.f10148c
                    java.lang.Object r1 = r2.a(r1)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L69
                    goto L6b
                L69:
                    org.json.JSONObject r6 = r0.f10228b
                L6b:
                    m4.pe1 r0 = new m4.pe1
                    r0.<init>(r7, r6)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.ne1.call():java.lang.Object");
            }
        });
    }
}
