package m4;

import a6.d;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.i1;
import n3.k1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class z80 {

    /* renamed from: b */
    public final k1 f16036b;

    /* renamed from: c */
    public final d90 f16037c;

    /* renamed from: e */
    public Context f16039e;

    /* renamed from: f */
    public o90 f16040f;

    /* renamed from: l */
    public tz1<ArrayList<String>> f16046l;

    /* renamed from: a */
    public final Object f16035a = new Object();

    /* renamed from: d */
    public boolean f16038d = false;

    /* renamed from: g */
    public hs f16041g = null;

    /* renamed from: h */
    public Boolean f16042h = null;

    /* renamed from: i */
    public final AtomicInteger f16043i = new AtomicInteger(0);

    /* renamed from: j */
    public final y80 f16044j = new y80();

    /* renamed from: k */
    public final Object f16045k = new Object();

    public z80() {
        k1 k1Var = new k1();
        this.f16036b = k1Var;
        this.f16037c = new d90(io.f9708f.f9711c, k1Var);
    }

    public final Resources a() {
        if (this.f16040f.f12054v) {
            return this.f16039e.getResources();
        }
        try {
            if (((Boolean) jo.f10145d.f10148c.a(es.E6)).booleanValue()) {
                try {
                    return DynamiteModule.c(this.f16039e, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).f2956a.getResources();
                } catch (Exception e10) {
                    throw new m90(e10);
                }
            }
            try {
                DynamiteModule.c(this.f16039e, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).f2956a.getResources();
                return null;
            } catch (Exception e11) {
                throw new m90(e11);
            }
        } catch (m90 e12) {
            g1.k("Cannot load resource from dynamite apk or local jar", e12);
            return null;
        }
        g1.k("Cannot load resource from dynamite apk or local jar", e12);
        return null;
    }

    public final hs b() {
        hs hsVar;
        synchronized (this.f16035a) {
            hsVar = this.f16041g;
        }
        return hsVar;
    }

    public final i1 c() {
        k1 k1Var;
        synchronized (this.f16035a) {
            k1Var = this.f16036b;
        }
        return k1Var;
    }

    public final tz1<ArrayList<String>> d() {
        if (this.f16039e != null) {
            if (!((Boolean) jo.f10145d.f10148c.a(es.I1)).booleanValue()) {
                synchronized (this.f16045k) {
                    tz1<ArrayList<String>> tz1Var = this.f16046l;
                    if (tz1Var != null) {
                        return tz1Var;
                    }
                    tz1<ArrayList<String>> Z = u90.f14294a.Z(new w80(this, 0));
                    this.f16046l = Z;
                    return Z;
                }
            }
        }
        return mz1.m(new ArrayList());
    }

    @TargetApi(23)
    public final void e(Context context, o90 o90Var) {
        hs hsVar;
        synchronized (this.f16035a) {
            if (!this.f16038d) {
                this.f16039e = context.getApplicationContext();
                this.f16040f = o90Var;
                s.B.f5792f.b(this.f16037c);
                this.f16036b.A(this.f16039e);
                v40.d(this.f16039e, this.f16040f);
                if (!ht.f9446c.e().booleanValue()) {
                    g1.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    hsVar = null;
                } else {
                    hsVar = new hs();
                }
                this.f16041g = hsVar;
                if (hsVar != null) {
                    d.e(new x80(this).b(), "AppState.registerCsiReporter");
                }
                this.f16038d = true;
                d();
            }
        }
        s.B.f5789c.D(context, o90Var.f12051s);
    }

    public final void f(Throwable th, String str) {
        v40.d(this.f16039e, this.f16040f).b(th, str, ut.f14491g.e().floatValue());
    }

    public final void g(Throwable th, String str) {
        v40.d(this.f16039e, this.f16040f).a(th, str);
    }
}
