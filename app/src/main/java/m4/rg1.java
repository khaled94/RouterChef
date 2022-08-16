package m4;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class rg1 implements eh1<fd1> {

    /* renamed from: a */
    public final String f13323a;

    /* renamed from: b */
    public final uz1 f13324b;

    /* renamed from: c */
    public final ScheduledExecutorService f13325c;

    /* renamed from: d */
    public final Context f13326d;

    /* renamed from: e */
    public final om1 f13327e;

    /* renamed from: f */
    public final if0 f13328f;

    public rg1(uz1 uz1Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, om1 om1Var, if0 if0Var) {
        this.f13324b = uz1Var;
        this.f13325c = scheduledExecutorService;
        this.f13323a = str;
        this.f13326d = context;
        this.f13327e = om1Var;
        this.f13328f = if0Var;
    }

    @Override // m4.eh1
    public final tz1<fd1> a() {
        return (!((Boolean) jo.f10145d.f10148c.a(es.O4)).booleanValue() || "adUnitId".equals(this.f13327e.f12205f)) ? this.f13324b.Z(qg1.f12856a) : mz1.n(new oz0(this), this.f13324b);
    }
}
