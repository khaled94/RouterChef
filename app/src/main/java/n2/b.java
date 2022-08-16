package n2;

import androidx.annotation.RecentlyNonNull;
import f3.e;

@Deprecated
/* loaded from: classes.dex */
public final class b {
    @RecentlyNonNull

    /* renamed from: b */
    public static final b f16428b = new b(-1, -2);
    @RecentlyNonNull

    /* renamed from: c */
    public static final b f16429c = new b(320, 50);
    @RecentlyNonNull

    /* renamed from: d */
    public static final b f16430d = new b(300, 250);
    @RecentlyNonNull

    /* renamed from: e */
    public static final b f16431e = new b(468, 60);
    @RecentlyNonNull

    /* renamed from: f */
    public static final b f16432f = new b(728, 90);
    @RecentlyNonNull

    /* renamed from: g */
    public static final b f16433g = new b(160, 600);

    /* renamed from: a */
    public final e f16434a;

    public b(int i10, int i11) {
        this.f16434a = new e(i10, i11);
    }

    public b(@RecentlyNonNull e eVar) {
        this.f16434a = eVar;
    }

    public final boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f16434a.equals(((b) obj).f16434a);
    }

    public final int hashCode() {
        return this.f16434a.hashCode();
    }

    @RecentlyNonNull
    public final String toString() {
        return this.f16434a.f4503c;
    }
}
