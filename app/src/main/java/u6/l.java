package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class l extends a0.e.d.a {

    /* renamed from: a */
    public final a0.e.d.a.b f19368a;

    /* renamed from: b */
    public final b0<a0.c> f19369b;

    /* renamed from: c */
    public final b0<a0.c> f19370c;

    /* renamed from: d */
    public final Boolean f19371d;

    /* renamed from: e */
    public final int f19372e;

    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.AbstractC0129a {

        /* renamed from: a */
        public a0.e.d.a.b f19373a;

        /* renamed from: b */
        public b0<a0.c> f19374b;

        /* renamed from: c */
        public b0<a0.c> f19375c;

        /* renamed from: d */
        public Boolean f19376d;

        /* renamed from: e */
        public Integer f19377e;

        public b() {
        }

        public b(a0.e.d.a aVar) {
            this.f19373a = aVar.c();
            this.f19374b = aVar.b();
            this.f19375c = aVar.d();
            this.f19376d = aVar.a();
            this.f19377e = Integer.valueOf(aVar.e());
        }

        public final a0.e.d.a a() {
            String str = this.f19373a == null ? " execution" : "";
            if (this.f19377e == null) {
                str = d7.a.c(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new l(this.f19373a, this.f19374b, this.f19375c, this.f19376d, this.f19377e.intValue(), null);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        public final a0.e.d.a.AbstractC0129a b(int i10) {
            this.f19377e = Integer.valueOf(i10);
            return this;
        }
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i10, a aVar) {
        this.f19368a = bVar;
        this.f19369b = b0Var;
        this.f19370c = b0Var2;
        this.f19371d = bool;
        this.f19372e = i10;
    }

    @Override // u6.a0.e.d.a
    public final Boolean a() {
        return this.f19371d;
    }

    @Override // u6.a0.e.d.a
    public final b0<a0.c> b() {
        return this.f19369b;
    }

    @Override // u6.a0.e.d.a
    public final a0.e.d.a.b c() {
        return this.f19368a;
    }

    @Override // u6.a0.e.d.a
    public final b0<a0.c> d() {
        return this.f19370c;
    }

    @Override // u6.a0.e.d.a
    public final int e() {
        return this.f19372e;
    }

    public final boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a)) {
            return false;
        }
        a0.e.d.a aVar = (a0.e.d.a) obj;
        return this.f19368a.equals(aVar.c()) && ((b0Var = this.f19369b) != null ? b0Var.equals(aVar.b()) : aVar.b() == null) && ((b0Var2 = this.f19370c) != null ? b0Var2.equals(aVar.d()) : aVar.d() == null) && ((bool = this.f19371d) != null ? bool.equals(aVar.a()) : aVar.a() == null) && this.f19372e == aVar.e();
    }

    @Override // u6.a0.e.d.a
    public final a0.e.d.a.AbstractC0129a f() {
        return new b(this);
    }

    public final int hashCode() {
        int hashCode = (this.f19368a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f19369b;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f19370c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f19371d;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f19372e;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Application{execution=");
        c10.append(this.f19368a);
        c10.append(", customAttributes=");
        c10.append(this.f19369b);
        c10.append(", internalKeys=");
        c10.append(this.f19370c);
        c10.append(", background=");
        c10.append(this.f19371d);
        c10.append(", uiOrientation=");
        c10.append(this.f19372e);
        c10.append("}");
        return c10.toString();
    }
}
