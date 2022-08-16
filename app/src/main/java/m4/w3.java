package m4;

import a4.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import j4.c;
import java.util.concurrent.Executor;
import n3.g1;

/* loaded from: classes.dex */
public final class w3 implements nu1, kz1, v91 {

    /* renamed from: s */
    public final Object f14854s;

    public /* synthetic */ w3(Handler handler) {
        this.f14854s = new u3(handler);
    }

    public /* synthetic */ w3(Object obj) {
        this.f14854s = obj;
    }

    public /* synthetic */ w3(ko1 ko1Var) {
        this.f14854s = ko1Var;
    }

    public /* synthetic */ w3(oq0 oq0Var) {
        this.f14854s = oq0Var;
    }

    public /* synthetic */ w3(t tVar) {
        this.f14854s = tVar;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((ko1) this.f14854s).mo30h((SQLiteDatabase) obj);
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            g1.g(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    public final w3 b(lc1 lc1Var) {
        ((oq0) this.f14854s).f12265t = lc1Var;
        return this;
    }

    public final void c(e4 e4Var, m4 m4Var) {
        e4Var.f("post-error");
        ((u3) ((Executor) this.f14854s)).f14243s.post(new v3(e4Var, new j4(m4Var), null, 0));
    }

    public final void d(e4 e4Var, j4 j4Var, Runnable runnable) {
        synchronized (e4Var.f7722w) {
            e4Var.A = true;
        }
        e4Var.f("post-response");
        ((u3) ((Executor) this.f14854s)).f14243s.post(new v3(e4Var, j4Var, runnable, 0));
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        g1.g(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((rx) obj).s0((lm) this.f14854s);
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public final Object mo19zza() {
        Context context = (Context) this.f14854s;
        yr<String> yrVar = es.f8049a;
        ds dsVar = jo.f10145d.f10148c;
        if (dsVar.f7618c) {
            return null;
        }
        synchronized (dsVar.f7616a) {
            if (!dsVar.f7618c) {
                if (!dsVar.f7619d) {
                    dsVar.f7619d = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                dsVar.f7622g = applicationContext;
                try {
                    dsVar.f7621f = c.a(applicationContext).b(dsVar.f7622g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                Context a10 = i.a(context);
                if (a10 != null || (a10 = context.getApplicationContext()) != null) {
                    context = a10;
                }
                as asVar = jo.f10145d.f10147b;
                SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                dsVar.f7620e = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(dsVar);
                }
                du.f7639a.set(new cs(dsVar));
                dsVar.b();
                dsVar.f7618c = true;
                dsVar.f7619d = false;
                dsVar.f7617b.open();
            }
        }
        return null;
    }
}
