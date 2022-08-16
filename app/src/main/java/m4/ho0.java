package m4;

import android.content.Context;
import android.os.Bundle;
import b7.d;

/* loaded from: classes.dex */
public final class ho0 {

    /* renamed from: a */
    public final Object f9392a;

    /* renamed from: b */
    public final Object f9393b;

    /* renamed from: c */
    public final Object f9394c;

    /* renamed from: d */
    public final Object f9395d;

    public /* synthetic */ ho0(Throwable th, d dVar) {
        this.f9392a = th.getLocalizedMessage();
        this.f9393b = th.getClass().getName();
        this.f9394c = dVar.b(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f9395d = cause != null ? new ho0(cause, dVar) : null;
    }

    public /* synthetic */ ho0(go0 go0Var) {
        this.f9392a = go0Var.f8988a;
        this.f9393b = go0Var.f8989b;
        this.f9394c = go0Var.f8990c;
        this.f9395d = go0Var.f8991d;
    }

    public final go0 a() {
        go0 go0Var = new go0();
        go0Var.f8988a = (Context) this.f9392a;
        go0Var.f8989b = (om1) this.f9393b;
        go0Var.f8990c = (Bundle) this.f9394c;
        return go0Var;
    }
}
