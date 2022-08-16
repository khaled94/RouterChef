package m4;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.k;
import n3.l;
import n3.s1;
import n3.y0;

/* loaded from: classes.dex */
public final /* synthetic */ class vz implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f14798s = 1;

    /* renamed from: t */
    public final /* synthetic */ Object f14799t;

    /* renamed from: u */
    public final /* synthetic */ Object f14800u;

    public /* synthetic */ vz(e00 e00Var, d00 d00Var) {
        this.f14799t = e00Var;
        this.f14800u = d00Var;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List<m4.ae2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List<m4.ae2>, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        boolean z10;
        long j10;
        boolean z11 = true;
        switch (this.f14798s) {
            case 0:
                e00 e00Var = (e00) this.f14799t;
                d00 d00Var = (d00) this.f14800u;
                Objects.requireNonNull(e00Var);
                try {
                    pz pzVar = new pz(e00Var.f7677b, e00Var.f7679d);
                    ((ce0) pzVar.f12652s.q0()).f6798z = new rc(new rz(e00Var, d00Var, pzVar), null);
                    pzVar.l0("/jsLoaded", new wz(e00Var, d00Var, pzVar));
                    y0 y0Var = new y0(0);
                    xz xzVar = new xz(e00Var, pzVar, y0Var);
                    y0Var.f16602t = xzVar;
                    pzVar.l0("/requestReload", xzVar);
                    if (e00Var.f7678c.endsWith(".js")) {
                        pz.g(new nz(pzVar, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", e00Var.f7678c), 0));
                    } else if (e00Var.f7678c.startsWith("<html>")) {
                        pz.g(new k(pzVar, e00Var.f7678c, 1));
                    } else {
                        pz.g(new l(pzVar, e00Var.f7678c, 1));
                    }
                    s1.f16555i.postDelayed(new yz(e00Var, d00Var, pzVar), 60000L);
                    return;
                } catch (Throwable th) {
                    g1.h("Error creating webview.", th);
                    s.B.f5793g.g(th, "SdkJavascriptFactory.loadJavascriptEngine");
                    d00Var.d();
                    return;
                }
            default:
                be2 be2Var = (be2) this.f14799t;
                he2 he2Var = (he2) this.f14800u;
                int i10 = be2Var.f6497r - he2Var.f9208c;
                be2Var.f6497r = i10;
                if (he2Var.f9209d) {
                    be2Var.f6498s = he2Var.f9210e;
                    be2Var.f6499t = true;
                }
                if (he2Var.f9211f) {
                    be2Var.f6500u = he2Var.f9212g;
                }
                if (i10 != 0) {
                    return;
                }
                z40 z40Var = he2Var.f9207b.f16165a;
                if (!be2Var.f6503x.f16165a.o() && z40Var.o()) {
                    be2Var.y = -1;
                    be2Var.f6504z = 0L;
                }
                if (!z40Var.o()) {
                    List asList = Arrays.asList(((df2) z40Var).f7361h);
                    r01.h(asList.size() == be2Var.f6491k.size());
                    for (int i11 = 0; i11 < asList.size(); i11++) {
                        ((ae2) be2Var.f6491k.get(i11)).f6134b = (z40) asList.get(i11);
                    }
                }
                if (be2Var.f6499t) {
                    if (he2Var.f9207b.f16166b.equals(be2Var.f6503x.f16166b) && he2Var.f9207b.f16168d == be2Var.f6503x.f16182s) {
                        z11 = false;
                    }
                    if (z11) {
                        if (z40Var.o() || he2Var.f9207b.f16166b.a()) {
                            j10 = he2Var.f9207b.f16168d;
                        } else {
                            ze2 ze2Var = he2Var.f9207b;
                            uj2 uj2Var = ze2Var.f16166b;
                            j10 = ze2Var.f16168d;
                            be2Var.r(z40Var, uj2Var, j10);
                        }
                        j3 = j10;
                        z10 = z11;
                        be2Var.f6499t = false;
                        be2Var.u(he2Var.f9207b, 1, be2Var.f6500u, false, z10, be2Var.f6498s, j3, -1);
                        return;
                    }
                } else {
                    z11 = false;
                }
                z10 = z11;
                j3 = -9223372036854775807L;
                be2Var.f6499t = false;
                be2Var.u(he2Var.f9207b, 1, be2Var.f6500u, false, z10, be2Var.f6498s, j3, -1);
                return;
        }
    }

    public /* synthetic */ vz(be2 be2Var, he2 he2Var) {
        this.f14799t = be2Var;
        this.f14800u = he2Var;
    }
}
