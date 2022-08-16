package t8;

import android.net.NetworkInfo;
import androidx.appcompat.widget.e0;
import java.io.IOException;
import java.util.Objects;
import r9.b0;
import r9.c0;
import r9.e;
import r9.g0;
import r9.i0;
import r9.n;
import r9.z;
import t8.a0;
import t8.t;
import t8.y;
import u9.i;
import z9.f;

/* loaded from: classes.dex */
public final class r extends y {

    /* renamed from: a */
    public final j f18792a;

    /* renamed from: b */
    public final a0 f18793b;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a() {
            super("Received response with 0 content-length header.");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends IOException {

        /* renamed from: s */
        public final int f18794s;

        /* renamed from: t */
        public final int f18795t = 0;

        public b(int i10) {
            super(e0.a("HTTP ", i10));
            this.f18794s = i10;
        }
    }

    public r(j jVar, a0 a0Var) {
        this.f18792a = jVar;
        this.f18793b = a0Var;
    }

    @Override // t8.y
    public final boolean c(w wVar) {
        String scheme = wVar.f18833c.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // t8.y
    public final int e() {
        return 2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Deque<r9.b0>, java.util.ArrayDeque] */
    @Override // t8.y
    public final y.a f(w wVar, int i10) {
        e eVar;
        t.d dVar = t.d.NETWORK;
        t.d dVar2 = t.d.DISK;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                eVar = e.f17351n;
            } else {
                e.a aVar = new e.a();
                if (!((i10 & 1) == 0)) {
                    aVar.f17365a = true;
                }
                if (!((i10 & 2) == 0)) {
                    aVar.f17366b = true;
                }
                eVar = new e(aVar);
            }
        } else {
            eVar = null;
        }
        c0.a aVar2 = new c0.a();
        aVar2.g(wVar.f18833c.toString());
        if (eVar != null) {
            String eVar2 = eVar.toString();
            if (eVar2.isEmpty()) {
                aVar2.f17319c.e("Cache-Control");
            } else {
                aVar2.b("Cache-Control", eVar2);
            }
        }
        c0 a10 = aVar2.a();
        z zVar = ((s) this.f18792a).f18796a;
        Objects.requireNonNull(zVar);
        b0 b0Var = new b0(zVar, a10, false);
        b0Var.f17303t = new i(zVar, b0Var);
        synchronized (b0Var) {
            if (b0Var.f17306w) {
                throw new IllegalStateException("Already Executed");
            }
            b0Var.f17306w = true;
        }
        b0Var.f17303t.f19674e.i();
        i iVar = b0Var.f17303t;
        Objects.requireNonNull(iVar);
        iVar.f19675f = f.f21089a.k();
        Objects.requireNonNull(iVar.f19673d);
        try {
            n nVar = zVar.f17511s;
            synchronized (nVar) {
                nVar.f17458d.add(b0Var);
            }
            g0 a11 = b0Var.a();
            n nVar2 = zVar.f17511s;
            nVar2.b(nVar2.f17458d, b0Var);
            i0 i0Var = a11.y;
            if (a11.j()) {
                t.d dVar3 = a11.A == null ? dVar : dVar2;
                if (dVar3 == dVar2 && i0Var.b() == 0) {
                    i0Var.close();
                    throw new a();
                }
                if (dVar3 == dVar && i0Var.b() > 0) {
                    a0 a0Var = this.f18793b;
                    long b10 = i0Var.b();
                    a0.a aVar3 = a0Var.f18712b;
                    aVar3.sendMessage(aVar3.obtainMessage(4, Long.valueOf(b10)));
                }
                return new y.a(i0Var.j(), dVar3);
            }
            i0Var.close();
            throw new b(a11.f17375u);
        } catch (Throwable th) {
            n nVar3 = b0Var.f17302s.f17511s;
            nVar3.b(nVar3.f17458d, b0Var);
            throw th;
        }
    }

    @Override // t8.y
    public final boolean g(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
