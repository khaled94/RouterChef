package m4;

/* loaded from: classes.dex */
public final class hb1 {

    /* renamed from: a */
    public boolean f9177a = false;

    /* renamed from: b */
    public final /* synthetic */ h71 f9178b;

    /* renamed from: c */
    public final /* synthetic */ w90 f9179c;

    public hb1(h71 h71Var, w90 w90Var) {
        this.f9178b = h71Var;
        this.f9179c = w90Var;
    }

    public final void a(int i10) {
        if (this.f9177a) {
            return;
        }
        b(new cn(i10, ib1.c(this.f9178b.f9128a, i10), "undefined", null, null));
    }

    public final void b(cn cnVar) {
        int i10 = 1;
        if (true == ((Boolean) jo.f10145d.f10148c.a(es.f8184r3)).booleanValue()) {
            i10 = 3;
        }
        this.f9179c.c(new i71(i10, cnVar));
    }
}
