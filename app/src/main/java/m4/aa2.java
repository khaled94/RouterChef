package m4;

/* loaded from: classes.dex */
public class aa2 {

    /* renamed from: a */
    public volatile qa2 f6095a;

    /* renamed from: b */
    public volatile n82 f6096b;

    static {
        z82.a();
    }

    public final int a() {
        if (this.f6096b != null) {
            return ((l82) this.f6096b).f10679u.length;
        }
        if (this.f6095a == null) {
            return 0;
        }
        return this.f6095a.e();
    }

    public final n82 b() {
        if (this.f6096b != null) {
            return this.f6096b;
        }
        synchronized (this) {
            if (this.f6096b != null) {
                return this.f6096b;
            }
            this.f6096b = this.f6095a == null ? n82.f11571t : this.f6095a.d();
            return this.f6096b;
        }
    }

    public final void c(qa2 qa2Var) {
        if (this.f6095a != null) {
            return;
        }
        synchronized (this) {
            if (this.f6095a != null) {
                return;
            }
            try {
                this.f6095a = qa2Var;
                this.f6096b = n82.f11571t;
            } catch (x92 unused) {
                this.f6095a = qa2Var;
                this.f6096b = n82.f11571t;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa2)) {
            return false;
        }
        aa2 aa2Var = (aa2) obj;
        qa2 qa2Var = this.f6095a;
        qa2 qa2Var2 = aa2Var.f6095a;
        if (qa2Var == null && qa2Var2 == null) {
            return b().equals(aa2Var.b());
        }
        if (qa2Var != null && qa2Var2 != null) {
            return qa2Var.equals(qa2Var2);
        }
        if (qa2Var != null) {
            aa2Var.c(qa2Var.a());
            return qa2Var.equals(aa2Var.f6095a);
        }
        c(qa2Var2.a());
        return this.f6095a.equals(qa2Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
