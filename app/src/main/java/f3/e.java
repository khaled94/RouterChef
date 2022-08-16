package f3;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.activity.k;
import androidx.annotation.RecentlyNonNull;
import m4.g90;
import m4.io;
import m4.on;

/* loaded from: classes.dex */
public final class e {
    @RecentlyNonNull

    /* renamed from: h */
    public static final e f4492h = new e(320, 50, "320x50_mb");
    @RecentlyNonNull

    /* renamed from: i */
    public static final e f4493i = new e(468, 60, "468x60_as");
    @RecentlyNonNull

    /* renamed from: j */
    public static final e f4494j = new e(320, 100, "320x100_as");
    @RecentlyNonNull

    /* renamed from: k */
    public static final e f4495k = new e(728, 90, "728x90_as");
    @RecentlyNonNull

    /* renamed from: l */
    public static final e f4496l = new e(300, 250, "300x250_as");
    @RecentlyNonNull

    /* renamed from: m */
    public static final e f4497m = new e(160, 600, "160x600_as");
    @RecentlyNonNull
    @Deprecated

    /* renamed from: n */
    public static final e f4498n = new e(-1, -2, "smart_banner");
    @RecentlyNonNull

    /* renamed from: o */
    public static final e f4499o = new e(-3, -4, "fluid");
    @RecentlyNonNull
    public static final e p = new e(0, 0, "invalid");
    @RecentlyNonNull

    /* renamed from: q */
    public static final e f4500q = new e(50, 50, "50x50_mb");

    /* renamed from: a */
    public final int f4501a;

    /* renamed from: b */
    public final int f4502b;

    /* renamed from: c */
    public final String f4503c;

    /* renamed from: d */
    public boolean f4504d;

    /* renamed from: e */
    public int f4505e;

    /* renamed from: f */
    public boolean f4506f;

    /* renamed from: g */
    public int f4507g;

    static {
        new e(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "x"
            java.lang.String r3 = "_as"
            java.lang.String r0 = i0.b.a(r4, r0, r2, r1, r3)
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.e.<init>(int, int):void");
    }

    public final int a(@RecentlyNonNull Context context) {
        int i10 = this.f4502b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 != -2) {
            g90 g90Var = io.f9708f.f9709a;
            return g90.j(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (on.u(displayMetrics) * displayMetrics.density);
    }

    public final int b(@RecentlyNonNull Context context) {
        int i10 = this.f4501a;
        if (i10 != -3) {
            if (i10 == -1) {
                return context.getResources().getDisplayMetrics().widthPixels;
            }
            g90 g90Var = io.f9708f.f9709a;
            return g90.j(context, i10);
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4501a == eVar.f4501a && this.f4502b == eVar.f4502b && this.f4503c.equals(eVar.f4503c);
    }

    public final int hashCode() {
        return this.f4503c.hashCode();
    }

    @RecentlyNonNull
    public final String toString() {
        return this.f4503c;
    }

    public e(int i10, int i11, String str) {
        if (i10 >= 0 || i10 == -1 || i10 == -3) {
            if (i11 < 0 && i11 != -2 && i11 != -4) {
                throw new IllegalArgumentException(k.a(38, "Invalid height for AdSize: ", i11));
            }
            this.f4501a = i10;
            this.f4502b = i11;
            this.f4503c = str;
            return;
        }
        throw new IllegalArgumentException(k.a(37, "Invalid width for AdSize: ", i10));
    }
}
