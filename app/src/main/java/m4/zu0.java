package m4;

/* loaded from: classes.dex */
public final class zu0 implements rh {

    /* renamed from: s */
    public final /* synthetic */ String f16332s;

    /* renamed from: t */
    public final /* synthetic */ av0 f16333t;

    public zu0(av0 av0Var, String str) {
        this.f16333t = av0Var;
        this.f16332s = str;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    @Override // m4.rh
    public final void x(qh qhVar) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8074d1)).booleanValue()) {
            if (!qhVar.f12866j) {
                return;
            }
            this.f16333t.D.put(this.f16332s, Boolean.TRUE);
            av0 av0Var = this.f16333t;
            av0Var.l(av0Var.f6270t.d(), this.f16333t.f6270t.l(), this.f16333t.f6270t.o(), true);
            return;
        }
        synchronized (this) {
            if (qhVar.f12866j) {
                av0 av0Var2 = this.f16333t;
                if (av0Var2.f6270t == null) {
                    return;
                }
                av0Var2.D.put(this.f16332s, Boolean.TRUE);
                av0 av0Var3 = this.f16333t;
                av0Var3.l(av0Var3.f6270t.d(), this.f16333t.f6270t.l(), this.f16333t.f6270t.o(), true);
            }
        }
    }
}
