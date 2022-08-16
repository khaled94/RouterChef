package n3;

import android.content.Context;
import android.os.Handler;
import g1.x;
import g1.z;
import h2.m;
import java.util.Objects;
import m4.ac;
import m4.i4;
import m4.jb;
import m4.m4;
import macVendorDb.MacVendorDb;

/* loaded from: classes.dex */
public final class j0 implements i4 {

    /* renamed from: s */
    public Object f16489s;

    /* renamed from: t */
    public Object f16490t;

    public j0(Context context) {
        this.f16489s = context;
        if (MacVendorDb.f16392l == null) {
            z.a a10 = x.a(context.getApplicationContext(), MacVendorDb.class, "mac_devices.db");
            a10.f4885m = "mac_devices.db";
            a10.f4880h = true;
            a10.c();
            MacVendorDb.f16392l = (MacVendorDb) a10.b();
        }
        this.f16490t = MacVendorDb.f16392l.q();
    }

    public /* synthetic */ j0(Handler handler, jb jbVar) {
        Objects.requireNonNull(handler);
        this.f16489s = handler;
        this.f16490t = jbVar;
    }

    public /* synthetic */ j0(String str, l0 l0Var) {
        this.f16489s = str;
        this.f16490t = l0Var;
    }

    public final void a(ac acVar) {
        ((Handler) this.f16489s).post(new m(this, acVar, 1));
    }

    @Override // m4.i4
    public final void d(m4 m4Var) {
        String str = (String) this.f16489s;
        String obj = m4Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(obj);
        g1.j(sb.toString());
        ((l0) this.f16490t).a(null);
    }
}
