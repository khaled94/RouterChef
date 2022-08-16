package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fg2 {

    /* renamed from: a */
    public final long f8488a;

    /* renamed from: b */
    public final z40 f8489b;

    /* renamed from: c */
    public final int f8490c;

    /* renamed from: d */
    public final uj2 f8491d;

    /* renamed from: e */
    public final long f8492e;

    /* renamed from: f */
    public final z40 f8493f;

    /* renamed from: g */
    public final int f8494g;

    /* renamed from: h */
    public final uj2 f8495h;

    /* renamed from: i */
    public final long f8496i;

    /* renamed from: j */
    public final long f8497j;

    public fg2(long j3, z40 z40Var, int i10, uj2 uj2Var, long j10, z40 z40Var2, int i11, uj2 uj2Var2, long j11, long j12) {
        this.f8488a = j3;
        this.f8489b = z40Var;
        this.f8490c = i10;
        this.f8491d = uj2Var;
        this.f8492e = j10;
        this.f8493f = z40Var2;
        this.f8494g = i11;
        this.f8495h = uj2Var2;
        this.f8496i = j11;
        this.f8497j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fg2.class == obj.getClass()) {
            fg2 fg2Var = (fg2) obj;
            if (this.f8488a == fg2Var.f8488a && this.f8490c == fg2Var.f8490c && this.f8492e == fg2Var.f8492e && this.f8494g == fg2Var.f8494g && this.f8496i == fg2Var.f8496i && this.f8497j == fg2Var.f8497j && js.a(this.f8489b, fg2Var.f8489b) && js.a(this.f8491d, fg2Var.f8491d) && js.a(this.f8493f, fg2Var.f8493f) && js.a(this.f8495h, fg2Var.f8495h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8488a), this.f8489b, Integer.valueOf(this.f8490c), this.f8491d, Long.valueOf(this.f8492e), this.f8493f, Integer.valueOf(this.f8494g), this.f8495h, Long.valueOf(this.f8496i), Long.valueOf(this.f8497j)});
    }
}
