package o4;

import android.content.Context;
import android.util.Log;
import c5.j;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import v3.a;
import y4.d5;
import y4.e5;
import y4.f1;
import y4.f4;
import y4.j1;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16761s;

    /* renamed from: t */
    public final /* synthetic */ Object f16762t;

    /* renamed from: u */
    public final /* synthetic */ Object f16763u;

    public /* synthetic */ f(Object obj, Object obj2, int i10) {
        this.f16761s = i10;
        this.f16763u = obj;
        this.f16762t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16761s) {
            case 0:
                h hVar = (h) this.f16762t;
                j jVar = (j) this.f16763u;
                String string = h.c(hVar.f16765a).getString("app_set_id", null);
                long b10 = hVar.b();
                try {
                    if (string == null || System.currentTimeMillis() > b10) {
                        string = UUID.randomUUID().toString();
                        Context context = hVar.f16765a;
                        if (!h.c(context).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new g("Failed to store the app set ID.");
                        }
                        h.d(context);
                        Context context2 = hVar.f16765a;
                        if (!h.c(context2).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new g("Failed to store the app set ID creation time.");
                        }
                    } else {
                        h.d(hVar.f16765a);
                    }
                    jVar.b(new a(string, 1));
                    return;
                } catch (g e10) {
                    jVar.a(e10);
                    return;
                }
            case 1:
                synchronized (((AtomicReference) this.f16762t)) {
                    Object obj = this.f16763u;
                    ((AtomicReference) this.f16762t).set(Long.valueOf(((w2) ((f4) obj).f20505s).y.p(((w2) ((f4) obj).f20505s).p().l(), f1.M)));
                    ((AtomicReference) this.f16762t).notify();
                }
                return;
            default:
                synchronized (((d5) this.f16763u)) {
                    ((d5) this.f16763u).f20359a = false;
                    if (!((d5) this.f16763u).f20361c.m()) {
                        ((w2) ((d5) this.f16763u).f20361c.f20505s).C().E.a("Connected to remote service");
                        e5 e5Var = ((d5) this.f16763u).f20361c;
                        j1 j1Var = (j1) this.f16762t;
                        e5Var.g();
                        Objects.requireNonNull(j1Var, "null reference");
                        e5Var.f20389v = j1Var;
                        e5Var.r();
                        e5Var.q();
                    }
                }
                return;
        }
    }

    public /* synthetic */ f(h hVar, j jVar) {
        this.f16761s = 0;
        this.f16762t = hVar;
        this.f16763u = jVar;
    }
}
