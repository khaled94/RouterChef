package m4;

import d4.b;

/* loaded from: classes.dex */
public final class sj implements b.AbstractC0056b {

    /* renamed from: a */
    public final /* synthetic */ w90 f13692a;

    /* renamed from: b */
    public final /* synthetic */ tj f13693b;

    public sj(tj tjVar, w90 w90Var) {
        this.f13693b = tjVar;
        this.f13692a = w90Var;
    }

    @Override // d4.b.AbstractC0056b
    public final void c0(a4.b bVar) {
        synchronized (this.f13693b.f14080c) {
            this.f13692a.c(new RuntimeException("Connection failed."));
        }
    }
}
