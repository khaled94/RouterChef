package m4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import m3.a;

/* loaded from: classes.dex */
public final class j40 {

    /* renamed from: n */
    public static final Object f9833n = new Object();

    /* renamed from: o */
    public static final gi f9834o;

    /* renamed from: a */
    public Object f9835a = f9833n;

    /* renamed from: b */
    public gi f9836b = f9834o;

    /* renamed from: c */
    public long f9837c;

    /* renamed from: d */
    public long f9838d;

    /* renamed from: e */
    public long f9839e;

    /* renamed from: f */
    public boolean f9840f;

    /* renamed from: g */
    public boolean f9841g;
    @Deprecated

    /* renamed from: h */
    public boolean f9842h;

    /* renamed from: i */
    public sc f9843i;

    /* renamed from: j */
    public boolean f9844j;

    /* renamed from: k */
    public long f9845k;

    /* renamed from: l */
    public int f9846l;

    /* renamed from: m */
    public int f9847m;

    static {
        a aVar = new a();
        pu1 pu1Var = gw1.f9058t;
        gw1<Object> gw1Var = gx1.f9060w;
        List emptyList = Collections.emptyList();
        Uri uri = Uri.EMPTY;
        fg fgVar = uri != null ? new fg(uri, emptyList, gw1Var) : null;
        j7 j7Var = new j7(aVar, null);
        sc scVar = new sc();
        lm lmVar = lm.f10918s;
        f9834o = new gi("androidx.media3.common.Timeline", j7Var, fgVar, scVar);
    }

    public final j40 a(gi giVar, boolean z10, boolean z11, sc scVar, long j3) {
        this.f9835a = f9833n;
        if (giVar == null) {
            giVar = f9834o;
        }
        this.f9836b = giVar;
        this.f9837c = -9223372036854775807L;
        this.f9838d = -9223372036854775807L;
        this.f9839e = -9223372036854775807L;
        this.f9840f = z10;
        this.f9841g = z11;
        this.f9842h = scVar != null;
        this.f9843i = scVar;
        this.f9845k = j3;
        this.f9846l = 0;
        this.f9847m = 0;
        this.f9844j = false;
        return this;
    }

    public final boolean b() {
        r01.h(this.f9842h == (this.f9843i != null));
        return this.f9843i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j40.class.equals(obj.getClass())) {
            j40 j40Var = (j40) obj;
            if (ls1.f(this.f9835a, j40Var.f9835a) && ls1.f(this.f9836b, j40Var.f9836b) && ls1.f(null, null) && ls1.f(this.f9843i, j40Var.f9843i) && this.f9837c == j40Var.f9837c && this.f9838d == j40Var.f9838d && this.f9839e == j40Var.f9839e && this.f9840f == j40Var.f9840f && this.f9841g == j40Var.f9841g && this.f9844j == j40Var.f9844j && this.f9845k == j40Var.f9845k && this.f9846l == j40Var.f9846l && this.f9847m == j40Var.f9847m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f9836b.hashCode() + ((this.f9835a.hashCode() + 217) * 31)) * 961;
        sc scVar = this.f9843i;
        int hashCode2 = scVar == null ? 0 : scVar.hashCode();
        long j3 = this.f9837c;
        long j10 = this.f9838d;
        long j11 = this.f9839e;
        boolean z10 = this.f9840f;
        boolean z11 = this.f9841g;
        boolean z12 = this.f9844j;
        long j12 = this.f9845k;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 961) + ((int) ((j12 >>> 32) ^ j12))) * 31) + this.f9846l) * 31) + this.f9847m) * 31;
    }
}
