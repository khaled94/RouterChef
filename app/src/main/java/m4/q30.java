package m4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import l3.s;
import n3.g1;
import n3.o1;
import n3.s1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q30 extends o1 implements lx<vd0> {
    public int C;

    /* renamed from: u */
    public final vd0 f12684u;

    /* renamed from: v */
    public final Context f12685v;

    /* renamed from: w */
    public final WindowManager f12686w;

    /* renamed from: x */
    public final rr f12687x;
    public DisplayMetrics y;

    /* renamed from: z */
    public float f12688z;
    public int A = -1;
    public int B = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;

    public q30(vd0 vd0Var, Context context, rr rrVar) {
        super(vd0Var, "");
        this.f12684u = vd0Var;
        this.f12685v = context;
        this.f12687x = rrVar;
        this.f12686w = (WindowManager) context.getSystemService("window");
    }

    @Override // m4.lx
    public final void a(vd0 vd0Var, Map map) {
        int i10;
        JSONObject jSONObject;
        this.y = new DisplayMetrics();
        Display defaultDisplay = this.f12686w.getDefaultDisplay();
        defaultDisplay.getMetrics(this.y);
        this.f12688z = this.y.density;
        this.C = defaultDisplay.getRotation();
        g90 g90Var = io.f9708f.f9709a;
        DisplayMetrics displayMetrics = this.y;
        this.A = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.y;
        this.B = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity n10 = this.f12684u.n();
        if (n10 == null || n10.getWindow() == null) {
            this.D = this.A;
            i10 = this.B;
        } else {
            s1 s1Var = s.B.f5789c;
            int[] r10 = s1.r(n10);
            this.D = g90.h(this.y, r10[0]);
            i10 = g90.h(this.y, r10[1]);
        }
        this.E = i10;
        if (this.f12684u.R().d()) {
            this.F = this.A;
            this.G = this.B;
        } else {
            this.f12684u.measure(0, 0);
        }
        d(this.A, this.B, this.D, this.E, this.f12688z, this.C);
        rr rrVar = this.f12687x;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        boolean a10 = rrVar.a(intent);
        rr rrVar2 = this.f12687x;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean a11 = rrVar2.a(intent2);
        boolean b10 = this.f12687x.b();
        boolean c10 = this.f12687x.c();
        vd0 vd0Var2 = this.f12684u;
        try {
            jSONObject = new JSONObject().put("sms", a11).put("tel", a10).put("calendar", b10).put("storePicture", c10).put("inlineVideo", true);
        } catch (JSONException e10) {
            g1.h("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        vd0Var2.l("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f12684u.getLocationOnScreen(iArr);
        io ioVar = io.f9708f;
        g(ioVar.f9709a.a(this.f12685v, iArr[0]), ioVar.f9709a.a(this.f12685v, iArr[1]));
        if (g1.m(2)) {
            g1.i("Dispatching Ready Event.");
        }
        try {
            ((vd0) this.f16544t).l("onReadyEventReceived", new JSONObject().put("js", this.f12684u.m().f12051s));
        } catch (JSONException e11) {
            g1.h("Error occurred while dispatching ready Event.", e11);
        }
    }

    public final void g(int i10, int i11) {
        int i12;
        Context context = this.f12685v;
        int i13 = 0;
        if (context instanceof Activity) {
            s1 s1Var = s.B.f5789c;
            i12 = s1.s((Activity) context)[0];
        } else {
            i12 = 0;
        }
        if (this.f12684u.R() == null || !this.f12684u.R().d()) {
            int width = this.f12684u.getWidth();
            int height = this.f12684u.getHeight();
            if (((Boolean) jo.f10145d.f10148c.a(es.J)).booleanValue()) {
                if (width == 0) {
                    width = this.f12684u.R() != null ? this.f12684u.R().f6816c : 0;
                }
                if (height == 0) {
                    if (this.f12684u.R() != null) {
                        i13 = this.f12684u.R().f6815b;
                    }
                    io ioVar = io.f9708f;
                    this.F = ioVar.f9709a.a(this.f12685v, width);
                    this.G = ioVar.f9709a.a(this.f12685v, i13);
                }
            }
            i13 = height;
            io ioVar2 = io.f9708f;
            this.F = ioVar2.f9709a.a(this.f12685v, width);
            this.G = ioVar2.f9709a.a(this.f12685v, i13);
        }
        try {
            ((vd0) this.f16544t).l("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11 - i12).put("width", this.F).put("height", this.G));
        } catch (JSONException e10) {
            g1.h("Error occurred while dispatching default position.", e10);
        }
        m30 m30Var = ((ce0) this.f12684u.q0()).L;
        if (m30Var != null) {
            m30Var.f11079w = i10;
            m30Var.f11080x = i11;
        }
    }
}
