package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class m extends a0.e.d.a.b {

    /* renamed from: a */
    public final b0<a0.e.d.a.b.AbstractC0135d> f19378a;

    /* renamed from: b */
    public final a0.e.d.a.b.AbstractC0132b f19379b;

    /* renamed from: c */
    public final a0.a f19380c;

    /* renamed from: d */
    public final a0.e.d.a.b.c f19381d;

    /* renamed from: e */
    public final b0<a0.e.d.a.b.AbstractC0130a> f19382e;

    public m(b0 b0Var, a0.e.d.a.b.AbstractC0132b abstractC0132b, a0.a aVar, a0.e.d.a.b.c cVar, b0 b0Var2, a aVar2) {
        this.f19378a = b0Var;
        this.f19379b = abstractC0132b;
        this.f19380c = aVar;
        this.f19381d = cVar;
        this.f19382e = b0Var2;
    }

    @Override // u6.a0.e.d.a.b
    public final a0.a a() {
        return this.f19380c;
    }

    @Override // u6.a0.e.d.a.b
    public final b0<a0.e.d.a.b.AbstractC0130a> b() {
        return this.f19382e;
    }

    @Override // u6.a0.e.d.a.b
    public final a0.e.d.a.b.AbstractC0132b c() {
        return this.f19379b;
    }

    @Override // u6.a0.e.d.a.b
    public final a0.e.d.a.b.c d() {
        return this.f19381d;
    }

    @Override // u6.a0.e.d.a.b
    public final b0<a0.e.d.a.b.AbstractC0135d> e() {
        return this.f19378a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b)) {
            return false;
        }
        a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
        b0<a0.e.d.a.b.AbstractC0135d> b0Var = this.f19378a;
        if (b0Var != null ? b0Var.equals(bVar.e()) : bVar.e() == null) {
            a0.e.d.a.b.AbstractC0132b abstractC0132b = this.f19379b;
            if (abstractC0132b != null ? abstractC0132b.equals(bVar.c()) : bVar.c() == null) {
                a0.a aVar = this.f19380c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f19381d.equals(bVar.d()) && this.f19382e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        b0<a0.e.d.a.b.AbstractC0135d> b0Var = this.f19378a;
        int i10 = 0;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.AbstractC0132b abstractC0132b = this.f19379b;
        int hashCode2 = (hashCode ^ (abstractC0132b == null ? 0 : abstractC0132b.hashCode())) * 1000003;
        a0.a aVar = this.f19380c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((hashCode2 ^ i10) * 1000003) ^ this.f19381d.hashCode()) * 1000003) ^ this.f19382e.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Execution{threads=");
        c10.append(this.f19378a);
        c10.append(", exception=");
        c10.append(this.f19379b);
        c10.append(", appExitInfo=");
        c10.append(this.f19380c);
        c10.append(", signal=");
        c10.append(this.f19381d);
        c10.append(", binaries=");
        c10.append(this.f19382e);
        c10.append("}");
        return c10.toString();
    }
}
