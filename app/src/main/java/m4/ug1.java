package m4;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ug1 implements eh1<vg1> {

    /* renamed from: a */
    public final x70 f14409a;

    /* renamed from: b */
    public final uz1 f14410b;

    /* renamed from: c */
    public final Context f14411c;

    public ug1(x70 x70Var, uz1 uz1Var, Context context) {
        this.f14409a = x70Var;
        this.f14410b = uz1Var;
        this.f14411c = context;
    }

    @Override // m4.eh1
    public final tz1<vg1> a() {
        return this.f14410b.Z(new Callable() { // from class: m4.tg1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ug1 ug1Var = ug1.this;
                if (!ug1Var.f14409a.l(ug1Var.f14411c)) {
                    return new vg1(null, null, null, null, null);
                }
                String h10 = ug1Var.f14409a.h(ug1Var.f14411c);
                if (h10 == null) {
                    h10 = "";
                }
                String str2 = h10;
                String g10 = ug1Var.f14409a.g(ug1Var.f14411c);
                if (g10 == null) {
                    g10 = "";
                }
                String str3 = g10;
                String f10 = ug1Var.f14409a.f(ug1Var.f14411c);
                if (f10 == null) {
                    f10 = "";
                }
                String str4 = f10;
                x70 x70Var = ug1Var.f14409a;
                Context context = ug1Var.f14411c;
                if (!x70Var.l(context)) {
                    str = null;
                } else {
                    synchronized (x70Var.f15229b) {
                        str = x70Var.f15231d;
                        if (str == null) {
                            if (x70.m(context)) {
                                String str5 = x70Var.f15231d;
                                synchronized (x70Var.f15237j) {
                                    if (x70Var.f15237j.get() != null) {
                                        try {
                                            str5 = x70Var.f15237j.get().b();
                                        } catch (Exception unused) {
                                            x70Var.c("getAppIdOrigin", false);
                                        }
                                    }
                                }
                                x70Var.f15231d = str5;
                            } else {
                                x70Var.f15231d = "fa";
                            }
                            str = x70Var.f15231d;
                        }
                    }
                }
                return new vg1(str2, str3, str4, str == null ? "" : str, "TIME_OUT".equals(str3) ? (Long) jo.f10145d.f10148c.a(es.X) : null);
            }
        });
    }
}
