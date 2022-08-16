package m4;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;
import n3.o1;

/* loaded from: classes.dex */
public final class k30 extends o1 {
    public final String A;

    /* renamed from: u */
    public final Map<String, String> f10261u;

    /* renamed from: v */
    public final Activity f10262v;

    /* renamed from: x */
    public final long f10264x;
    public final long y;

    /* renamed from: w */
    public final String f10263w = g("description");

    /* renamed from: z */
    public final String f10265z = g("summary");

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k30(m4.vd0 r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "createCalendarEvent"
            r2.<init>(r3, r0)
            r2.f10261u = r4
            android.app.Activity r3 = r3.n()
            r2.f10262v = r3
            java.lang.String r3 = "description"
            java.lang.String r3 = r2.g(r3)
            r2.f10263w = r3
            java.lang.String r3 = "summary"
            java.lang.String r3 = r2.g(r3)
            r2.f10265z = r3
            java.lang.String r3 = "start_ticks"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0 = -1
            if (r3 != 0) goto L2a
            goto L2f
        L2a:
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L2f
            goto L30
        L2f:
            r3 = r0
        L30:
            r2.f10264x = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.f10261u
            java.lang.String r4 = "end_ticks"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L3f
            goto L43
        L3f:
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L43
        L43:
            r2.y = r0
            java.lang.String r3 = "location"
            java.lang.String r3 = r2.g(r3)
            r2.A = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.k30.<init>(m4.vd0, java.util.Map):void");
    }

    public final String g(String str) {
        return TextUtils.isEmpty(this.f10261u.get(str)) ? "" : this.f10261u.get(str);
    }
}
