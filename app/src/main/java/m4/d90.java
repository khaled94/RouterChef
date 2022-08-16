package m4;

import java.util.HashSet;
import java.util.Objects;
import l3.s;
import n3.i1;

/* loaded from: classes.dex */
public final class d90 implements ai {

    /* renamed from: b */
    public final i1 f7265b;

    /* renamed from: d */
    public final a90 f7267d;

    /* renamed from: a */
    public final Object f7264a = new Object();

    /* renamed from: e */
    public final HashSet<u80> f7268e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<c90> f7269f = new HashSet<>();

    /* renamed from: g */
    public boolean f7270g = false;

    /* renamed from: c */
    public final b90 f7266c = new b90();

    public d90(String str, i1 i1Var) {
        this.f7267d = new a90(str, i1Var);
        this.f7265b = i1Var;
    }

    @Override // m4.ai
    public final void J(boolean z10) {
        a90 a90Var;
        int i10;
        Objects.requireNonNull(s.B.f5796j);
        long currentTimeMillis = System.currentTimeMillis();
        if (!z10) {
            this.f7265b.h(currentTimeMillis);
            this.f7265b.p(this.f7267d.f6077d);
            return;
        }
        if (currentTimeMillis - this.f7265b.c() > ((Long) jo.f10145d.f10148c.a(es.A0)).longValue()) {
            a90Var = this.f7267d;
            i10 = -1;
        } else {
            a90Var = this.f7267d;
            i10 = this.f7265b.a();
        }
        a90Var.f6077d = i10;
        this.f7270g = true;
    }

    public final void a(u80 u80Var) {
        synchronized (this.f7264a) {
            this.f7268e.add(u80Var);
        }
    }
}
