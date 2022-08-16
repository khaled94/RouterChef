package s4;

/* loaded from: classes.dex */
public class m7 {

    /* renamed from: a */
    public volatile d8 f17991a;

    /* renamed from: b */
    public volatile g6 f17992b;

    static {
        o6.a();
    }

    public final int a() {
        if (this.f17992b != null) {
            return ((f6) this.f17992b).f17863u.length;
        }
        if (this.f17991a == null) {
            return 0;
        }
        return this.f17991a.b();
    }

    public final g6 b() {
        if (this.f17992b != null) {
            return this.f17992b;
        }
        synchronized (this) {
            if (this.f17992b != null) {
                return this.f17992b;
            }
            this.f17992b = this.f17991a == null ? g6.f17877t : this.f17991a.a();
            return this.f17992b;
        }
    }

    public final void c(d8 d8Var) {
        if (this.f17991a != null) {
            return;
        }
        synchronized (this) {
            if (this.f17991a != null) {
                return;
            }
            try {
                this.f17991a = d8Var;
                this.f17992b = g6.f17877t;
            } catch (k7 unused) {
                this.f17991a = d8Var;
                this.f17992b = g6.f17877t;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        d8 d8Var = this.f17991a;
        d8 d8Var2 = m7Var.f17991a;
        if (d8Var == null && d8Var2 == null) {
            return b().equals(m7Var.b());
        }
        if (d8Var != null && d8Var2 != null) {
            return d8Var.equals(d8Var2);
        }
        if (d8Var != null) {
            m7Var.c(d8Var.c());
            return d8Var.equals(m7Var.f17991a);
        }
        c(d8Var2.c());
        return this.f17991a.equals(d8Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
