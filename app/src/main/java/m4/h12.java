package m4;

import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class h12 {

    /* renamed from: a */
    public final String f9076a;

    /* renamed from: b */
    public final t f9077b;

    /* renamed from: c */
    public final t f9078c;

    /* renamed from: d */
    public final int f9079d;

    /* renamed from: e */
    public final int f9080e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h12(java.lang.String r3, m4.t r4, m4.t r5, int r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto La
            if (r7 != 0) goto Lb
            r7 = r0
        La:
            r0 = r1
        Lb:
            m4.r01.f(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L25
            r2.f9076a = r3
            java.util.Objects.requireNonNull(r4)
            r2.f9077b = r4
            java.util.Objects.requireNonNull(r5)
            r2.f9078c = r5
            r2.f9079d = r6
            r2.f9080e = r7
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.h12.<init>(java.lang.String, m4.t, m4.t, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h12.class == obj.getClass()) {
            h12 h12Var = (h12) obj;
            if (this.f9079d == h12Var.f9079d && this.f9080e == h12Var.f9080e && this.f9076a.equals(h12Var.f9076a) && this.f9077b.equals(h12Var.f9077b) && this.f9078c.equals(h12Var.f9078c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a10 = a.a(this.f9076a, (((this.f9079d + 527) * 31) + this.f9080e) * 31, 31);
        return this.f9078c.hashCode() + ((this.f9077b.hashCode() + a10) * 31);
    }
}
