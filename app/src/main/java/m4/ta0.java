package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import d4.m;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.s1;
import z3.p;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ta0 extends FrameLayout implements oa0 {
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public long D;
    public long E;
    public String F;
    public String[] G;
    public Bitmap H;
    public final ImageView I;
    public boolean J;

    /* renamed from: s */
    public final fb0 f13969s;

    /* renamed from: t */
    public final FrameLayout f13970t;

    /* renamed from: u */
    public final View f13971u;

    /* renamed from: v */
    public final qs f13972v;

    /* renamed from: w */
    public final hb0 f13973w;

    /* renamed from: x */
    public final long f13974x;
    public final pa0 y;

    /* renamed from: z */
    public boolean f13975z;

    public ta0(Context context, fb0 fb0Var, int i10, boolean z10, qs qsVar, eb0 eb0Var) {
        super(context);
        pa0 pa0Var;
        this.f13969s = fb0Var;
        this.f13972v = qsVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13970t = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        m.h(fb0Var.o());
        qa0 qa0Var = fb0Var.o().f5743a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            gb0 gb0Var = new gb0(context, fb0Var.m(), fb0Var.v(), qsVar, fb0Var.j());
            if (i10 == 2) {
                pa0Var = new sb0(context, gb0Var, fb0Var, z10, fb0Var.R().d(), eb0Var);
            } else {
                pa0Var = new na0(context, fb0Var, z10, fb0Var.R().d(), new gb0(context, fb0Var.m(), fb0Var.v(), qsVar, fb0Var.j()));
            }
        } else {
            pa0Var = null;
        }
        this.y = pa0Var;
        View view = new View(context);
        this.f13971u = view;
        view.setBackgroundColor(0);
        if (pa0Var != null) {
            frameLayout.addView(pa0Var, new FrameLayout.LayoutParams(-1, -1, 17));
            yr<Boolean> yrVar = es.f8228x;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) joVar.f10148c.a(es.f8204u)).booleanValue()) {
                j();
            }
        }
        this.I = new ImageView(context);
        yr<Long> yrVar2 = es.f8241z;
        jo joVar2 = jo.f10145d;
        this.f13974x = ((Long) joVar2.f10148c.a(yrVar2)).longValue();
        boolean booleanValue = ((Boolean) joVar2.f10148c.a(es.f8220w)).booleanValue();
        this.C = booleanValue;
        if (qsVar != null) {
            qsVar.b("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f13973w = new hb0(this);
        if (pa0Var != null) {
            pa0Var.v(this);
        }
        if (pa0Var == null) {
            d("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (g1.c()) {
            StringBuilder a10 = p.a(75, "Set video bounds to x:", i10, ";y:", i11);
            a10.append(";w:");
            a10.append(i12);
            a10.append(";h:");
            a10.append(i13);
            g1.a(a10.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.f13970t.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void b() {
        if (this.f13969s.n() != null && this.A && !this.B) {
            this.f13969s.n().getWindow().clearFlags(128);
            this.A = false;
        }
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f13969s.a("onVideoEvent", hashMap);
    }

    public final void d(String str, String str2) {
        c("error", "what", str, "extra", str2);
    }

    public final void e() {
        c("pause", new String[0]);
        b();
        this.f13975z = false;
    }

    public final void f() {
        if (this.f13969s.n() != null && !this.A) {
            boolean z10 = (this.f13969s.n().getWindow().getAttributes().flags & 128) != 0;
            this.B = z10;
            if (!z10) {
                this.f13969s.n().getWindow().addFlags(128);
                this.A = true;
            }
        }
        this.f13975z = true;
    }

    public final void finalize() {
        try {
            this.f13973w.a();
            pa0 pa0Var = this.y;
            if (pa0Var != null) {
                u90.f14298e.execute(new uz(pa0Var, 1));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        pa0 pa0Var = this.y;
        if (pa0Var != null && this.E == 0) {
            c("canplaythrough", "duration", String.valueOf(pa0Var.k() / 1000.0f), "videoWidth", String.valueOf(this.y.m()), "videoHeight", String.valueOf(this.y.l()));
        }
    }

    public final void h() {
        if (this.J && this.H != null) {
            if (!(this.I.getParent() != null)) {
                this.I.setImageBitmap(this.H);
                this.I.invalidate();
                this.f13970t.addView(this.I, new FrameLayout.LayoutParams(-1, -1));
                this.f13970t.bringChildToFront(this.I);
            }
        }
        this.f13973w.a();
        this.E = this.D;
        s1.f16555i.post(new m8(this, 1));
    }

    public final void i(int i10, int i11) {
        if (!this.C) {
            return;
        }
        yr<Integer> yrVar = es.y;
        jo joVar = jo.f10145d;
        int max = Math.max(i10 / ((Integer) joVar.f10148c.a(yrVar)).intValue(), 1);
        int max2 = Math.max(i11 / ((Integer) joVar.f10148c.a(yrVar)).intValue(), 1);
        Bitmap bitmap = this.H;
        if (bitmap != null && bitmap.getWidth() == max && this.H.getHeight() == max2) {
            return;
        }
        this.H = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        this.J = false;
    }

    @TargetApi(14)
    public final void j() {
        pa0 pa0Var = this.y;
        if (pa0Var == null) {
            return;
        }
        TextView textView = new TextView(pa0Var.getContext());
        String valueOf = String.valueOf(this.y.r());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f13970t.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f13970t.bringChildToFront(textView);
    }

    public final void k() {
        pa0 pa0Var = this.y;
        if (pa0Var == null) {
            return;
        }
        long h10 = pa0Var.h();
        if (this.D == h10 || h10 <= 0) {
            return;
        }
        float f10 = ((float) h10) / 1000.0f;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue()) {
            Objects.requireNonNull(s.B.f5796j);
            c("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.y.p()), "qoeCachedBytes", String.valueOf(this.y.n()), "qoeLoadedBytes", String.valueOf(this.y.o()), "droppedFrames", String.valueOf(this.y.i()), "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f10));
        }
        this.D = h10;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        hb0 hb0Var = this.f13973w;
        if (z10) {
            hb0Var.b();
        } else {
            hb0Var.a();
            this.E = this.D;
        }
        s1.f16555i.post(new Runnable() { // from class: m4.ra0
            @Override // java.lang.Runnable
            public final void run() {
                ta0 ta0Var = ta0.this;
                boolean z11 = z10;
                Objects.requireNonNull(ta0Var);
                ta0Var.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z11));
            }
        });
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.f13973w.b();
            z10 = true;
        } else {
            this.f13973w.a();
            this.E = this.D;
            z10 = false;
        }
        s1.f16555i.post(new sa0(this, z10));
    }
}
