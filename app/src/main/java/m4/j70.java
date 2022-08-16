package m4;

import h4.a;
import n3.g1;
import n3.i1;

/* loaded from: classes.dex */
public final class j70 {

    /* renamed from: a */
    public final a f9860a;

    /* renamed from: b */
    public final i1 f9861b;

    /* renamed from: c */
    public final x70 f9862c;

    public j70(a aVar, i1 i1Var, x70 x70Var) {
        this.f9860a = aVar;
        this.f9861b = i1Var;
        this.f9862c = x70Var;
    }

    public final void a() {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8111i0)).booleanValue()) {
            return;
        }
        synchronized (this.f9862c.f15239l) {
        }
    }

    public final void b(int i10, long j3) {
        yr<Boolean> yrVar = es.f8103h0;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return;
        }
        if (j3 - this.f9861b.b() < 0) {
            g1.a("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) joVar.f10148c.a(es.f8111i0)).booleanValue()) {
            this.f9861b.f(-1);
        } else {
            this.f9861b.f(i10);
        }
        this.f9861b.k(j3);
        a();
    }
}
