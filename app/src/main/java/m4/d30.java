package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d30 {

    /* renamed from: a */
    public Object f7202a;

    /* renamed from: b */
    public Object f7203b;

    /* renamed from: c */
    public int f7204c;

    /* renamed from: d */
    public long f7205d;

    /* renamed from: e */
    public boolean f7206e;

    /* renamed from: f */
    public hl0 f7207f = hl0.f9372b;

    public final int a(int i10) {
        return this.f7207f.a(i10).a(-1);
    }

    public final long b(int i10, int i11) {
        c30 a10 = this.f7207f.a(i10);
        if (a10.f6715a != -1) {
            return a10.f6718d[i11];
        }
        return -9223372036854775807L;
    }

    public final void c(int i10) {
        Objects.requireNonNull(this.f7207f.a(i10));
    }

    public final void d() {
        Objects.requireNonNull(this.f7207f);
    }

    public final void e(int i10) {
        Objects.requireNonNull(this.f7207f.a(i10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d30.class.equals(obj.getClass())) {
            d30 d30Var = (d30) obj;
            if (ls1.f(this.f7202a, d30Var.f7202a) && ls1.f(this.f7203b, d30Var.f7203b) && this.f7204c == d30Var.f7204c && this.f7205d == d30Var.f7205d && this.f7206e == d30Var.f7206e && ls1.f(this.f7207f, d30Var.f7207f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7202a;
        int i10 = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f7203b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        int i11 = this.f7204c;
        long j3 = this.f7205d;
        return this.f7207f.hashCode() + ((((((((hashCode + i10) * 31) + i11) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 961) + (this.f7206e ? 1 : 0)) * 31);
    }
}
