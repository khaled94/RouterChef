package m4;

import a4.f;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rh1 implements eh1<sh1> {

    /* renamed from: a */
    public final Context f13330a;

    /* renamed from: b */
    public final ScheduledExecutorService f13331b;

    /* renamed from: c */
    public final Executor f13332c;

    /* renamed from: d */
    public final s80 f13333d;

    public rh1(s80 s80Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10) {
        this.f13333d = s80Var;
        this.f13330a = context;
        this.f13331b = scheduledExecutorService;
        this.f13332c = executor;
    }

    @Override // m4.eh1
    public final tz1<sh1> a() {
        yr<Boolean> yrVar = es.B0;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            s80 s80Var = this.f13333d;
            Context context = this.f13330a;
            Objects.requireNonNull(s80Var);
            w90 w90Var = new w90();
            g90 g90Var = io.f9708f.f9709a;
            int c10 = f.f133b.c(context, 12451000);
            if (c10 == 0 || c10 == 2) {
                u90.f14294a.execute(new r80(context, w90Var));
            }
            return mz1.i((gz1) mz1.q(mz1.o(gz1.r(w90Var), qh1.f12869a, this.f13332c), ((Long) joVar.f10148c.a(es.C0)).longValue(), TimeUnit.MILLISECONDS, this.f13331b), Throwable.class, new cu1() { // from class: m4.ph1
                @Override // m4.cu1
                public final Object a(Object obj) {
                    rh1 rh1Var = rh1.this;
                    Throwable th = (Throwable) obj;
                    Objects.requireNonNull(rh1Var);
                    g90 g90Var2 = io.f9708f.f9709a;
                    ContentResolver contentResolver = rh1Var.f13330a.getContentResolver();
                    return new sh1(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
                }
            }, this.f13332c);
        }
        return new nz1(new Exception("Did not ad Ad ID into query param."));
    }
}
