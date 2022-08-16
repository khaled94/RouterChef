package m4;

import d.a;

/* loaded from: classes.dex */
public final class ig0 implements eo0 {

    /* renamed from: a */
    public final /* synthetic */ int f9638a;

    /* renamed from: b */
    public final gh0 f9639b;

    /* renamed from: c */
    public dr0 f9640c;

    /* renamed from: d */
    public ho0 f9641d;

    /* renamed from: e */
    public il1 f9642e;

    /* renamed from: f */
    public lk1 f9643f;

    public /* synthetic */ ig0(gh0 gh0Var, int i10) {
        this.f9638a = i10;
        this.f9639b = gh0Var;
    }

    @Override // m4.eo0
    public final /* synthetic */ eo0 a(il1 il1Var) {
        switch (this.f9638a) {
            case 0:
                this.f9642e = il1Var;
                return this;
            default:
                this.f9642e = il1Var;
                return this;
        }
    }

    @Override // m4.eo0
    public final /* synthetic */ eo0 b(lk1 lk1Var) {
        switch (this.f9638a) {
            case 0:
                this.f9643f = lk1Var;
                return this;
            default:
                this.f9643f = lk1Var;
                return this;
        }
    }

    public final kz0 c() {
        a.g(this.f9640c, dr0.class);
        a.g(this.f9641d, ho0.class);
        return new dh0(this.f9639b, new o80(), new q40(), new q40(), new qi(), this.f9640c, this.f9641d, new b10(), this.f9642e, this.f9643f);
    }

    @Override // m4.eo0
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f9638a) {
            case 0:
                a.g(this.f9640c, dr0.class);
                a.g(this.f9641d, ho0.class);
                return new jg0(this.f9639b, new o80(), new q40(), new q40(), new qi(), this.f9640c, this.f9641d, new b10(), this.f9642e, this.f9643f);
            default:
                return c();
        }
    }
}
