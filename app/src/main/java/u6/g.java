package u6;

import u6.a0;

/* loaded from: classes.dex */
public final class g extends a0.e {

    /* renamed from: a */
    public final String f19311a;

    /* renamed from: b */
    public final String f19312b;

    /* renamed from: c */
    public final long f19313c;

    /* renamed from: d */
    public final Long f19314d;

    /* renamed from: e */
    public final boolean f19315e;

    /* renamed from: f */
    public final a0.e.a f19316f;

    /* renamed from: g */
    public final a0.e.f f19317g;

    /* renamed from: h */
    public final a0.e.AbstractC0140e f19318h;

    /* renamed from: i */
    public final a0.e.c f19319i;

    /* renamed from: j */
    public final b0<a0.e.d> f19320j;

    /* renamed from: k */
    public final int f19321k;

    /* loaded from: classes.dex */
    public static final class b extends a0.e.b {

        /* renamed from: a */
        public String f19322a;

        /* renamed from: b */
        public String f19323b;

        /* renamed from: c */
        public Long f19324c;

        /* renamed from: d */
        public Long f19325d;

        /* renamed from: e */
        public Boolean f19326e;

        /* renamed from: f */
        public a0.e.a f19327f;

        /* renamed from: g */
        public a0.e.f f19328g;

        /* renamed from: h */
        public a0.e.AbstractC0140e f19329h;

        /* renamed from: i */
        public a0.e.c f19330i;

        /* renamed from: j */
        public b0<a0.e.d> f19331j;

        /* renamed from: k */
        public Integer f19332k;

        public b() {
        }

        public b(a0.e eVar) {
            this.f19322a = eVar.e();
            this.f19323b = eVar.g();
            this.f19324c = Long.valueOf(eVar.i());
            this.f19325d = eVar.c();
            this.f19326e = Boolean.valueOf(eVar.k());
            this.f19327f = eVar.a();
            this.f19328g = eVar.j();
            this.f19329h = eVar.h();
            this.f19330i = eVar.b();
            this.f19331j = eVar.d();
            this.f19332k = Integer.valueOf(eVar.f());
        }

        @Override // u6.a0.e.b
        public final a0.e a() {
            String str = this.f19322a == null ? " generator" : "";
            if (this.f19323b == null) {
                str = d7.a.c(str, " identifier");
            }
            if (this.f19324c == null) {
                str = d7.a.c(str, " startedAt");
            }
            if (this.f19326e == null) {
                str = d7.a.c(str, " crashed");
            }
            if (this.f19327f == null) {
                str = d7.a.c(str, " app");
            }
            if (this.f19332k == null) {
                str = d7.a.c(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new g(this.f19322a, this.f19323b, this.f19324c.longValue(), this.f19325d, this.f19326e.booleanValue(), this.f19327f, this.f19328g, this.f19329h, this.f19330i, this.f19331j, this.f19332k.intValue(), null);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        @Override // u6.a0.e.b
        public final a0.e.b b(boolean z10) {
            this.f19326e = Boolean.valueOf(z10);
            return this;
        }
    }

    public g(String str, String str2, long j3, Long l10, boolean z10, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0140e abstractC0140e, a0.e.c cVar, b0 b0Var, int i10, a aVar2) {
        this.f19311a = str;
        this.f19312b = str2;
        this.f19313c = j3;
        this.f19314d = l10;
        this.f19315e = z10;
        this.f19316f = aVar;
        this.f19317g = fVar;
        this.f19318h = abstractC0140e;
        this.f19319i = cVar;
        this.f19320j = b0Var;
        this.f19321k = i10;
    }

    @Override // u6.a0.e
    public final a0.e.a a() {
        return this.f19316f;
    }

    @Override // u6.a0.e
    public final a0.e.c b() {
        return this.f19319i;
    }

    @Override // u6.a0.e
    public final Long c() {
        return this.f19314d;
    }

    @Override // u6.a0.e
    public final b0<a0.e.d> d() {
        return this.f19320j;
    }

    @Override // u6.a0.e
    public final String e() {
        return this.f19311a;
    }

    public final boolean equals(Object obj) {
        Long l10;
        a0.e.f fVar;
        a0.e.AbstractC0140e abstractC0140e;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e)) {
            return false;
        }
        a0.e eVar = (a0.e) obj;
        return this.f19311a.equals(eVar.e()) && this.f19312b.equals(eVar.g()) && this.f19313c == eVar.i() && ((l10 = this.f19314d) != null ? l10.equals(eVar.c()) : eVar.c() == null) && this.f19315e == eVar.k() && this.f19316f.equals(eVar.a()) && ((fVar = this.f19317g) != null ? fVar.equals(eVar.j()) : eVar.j() == null) && ((abstractC0140e = this.f19318h) != null ? abstractC0140e.equals(eVar.h()) : eVar.h() == null) && ((cVar = this.f19319i) != null ? cVar.equals(eVar.b()) : eVar.b() == null) && ((b0Var = this.f19320j) != null ? b0Var.equals(eVar.d()) : eVar.d() == null) && this.f19321k == eVar.f();
    }

    @Override // u6.a0.e
    public final int f() {
        return this.f19321k;
    }

    @Override // u6.a0.e
    public final String g() {
        return this.f19312b;
    }

    @Override // u6.a0.e
    public final a0.e.AbstractC0140e h() {
        return this.f19318h;
    }

    public final int hashCode() {
        long j3 = this.f19313c;
        int hashCode = (((((this.f19311a.hashCode() ^ 1000003) * 1000003) ^ this.f19312b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f19314d;
        int i10 = 0;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f19315e ? 1231 : 1237)) * 1000003) ^ this.f19316f.hashCode()) * 1000003;
        a0.e.f fVar = this.f19317g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0140e abstractC0140e = this.f19318h;
        int hashCode4 = (hashCode3 ^ (abstractC0140e == null ? 0 : abstractC0140e.hashCode())) * 1000003;
        a0.e.c cVar = this.f19319i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f19320j;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return ((hashCode5 ^ i10) * 1000003) ^ this.f19321k;
    }

    @Override // u6.a0.e
    public final long i() {
        return this.f19313c;
    }

    @Override // u6.a0.e
    public final a0.e.f j() {
        return this.f19317g;
    }

    @Override // u6.a0.e
    public final boolean k() {
        return this.f19315e;
    }

    @Override // u6.a0.e
    public final a0.e.b l() {
        return new b(this);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Session{generator=");
        c10.append(this.f19311a);
        c10.append(", identifier=");
        c10.append(this.f19312b);
        c10.append(", startedAt=");
        c10.append(this.f19313c);
        c10.append(", endedAt=");
        c10.append(this.f19314d);
        c10.append(", crashed=");
        c10.append(this.f19315e);
        c10.append(", app=");
        c10.append(this.f19316f);
        c10.append(", user=");
        c10.append(this.f19317g);
        c10.append(", os=");
        c10.append(this.f19318h);
        c10.append(", device=");
        c10.append(this.f19319i);
        c10.append(", events=");
        c10.append(this.f19320j);
        c10.append(", generatorType=");
        c10.append(this.f19321k);
        c10.append("}");
        return c10.toString();
    }
}
