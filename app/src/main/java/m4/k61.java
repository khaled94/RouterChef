package m4;

import android.os.SystemClock;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class k61 implements ap1 {

    /* renamed from: s */
    public final i61 f10285s;

    public k61(i61 i61Var) {
        this.f10285s = i61Var;
    }

    @Override // m4.ap1
    public final void a(wo1 wo1Var, String str) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.Z3)).booleanValue() || wo1.RENDERER != wo1Var || this.f10285s.a() == 0) {
            return;
        }
        i61 i61Var = this.f10285s;
        Objects.requireNonNull(s.B.f5796j);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10285s.a();
        synchronized (i61Var) {
            synchronized (i61Var.f9544h) {
                i61Var.f9540d = elapsedRealtime;
            }
        }
    }

    @Override // m4.ap1
    public final void b(wo1 wo1Var, String str) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.Z3)).booleanValue() || wo1.RENDERER != wo1Var) {
            return;
        }
        i61 i61Var = this.f10285s;
        Objects.requireNonNull(s.B.f5796j);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (i61Var) {
            synchronized (i61Var.f9543g) {
                i61Var.f9539c = elapsedRealtime;
            }
        }
    }

    @Override // m4.ap1
    public final void f(String str) {
    }

    @Override // m4.ap1
    public final void h(wo1 wo1Var, String str, Throwable th) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.Z3)).booleanValue() || wo1.RENDERER != wo1Var || this.f10285s.a() == 0) {
            return;
        }
        i61 i61Var = this.f10285s;
        Objects.requireNonNull(s.B.f5796j);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10285s.a();
        synchronized (i61Var) {
            synchronized (i61Var.f9544h) {
                i61Var.f9540d = elapsedRealtime;
            }
        }
    }
}
