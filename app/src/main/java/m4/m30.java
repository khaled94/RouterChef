package m4;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import h4.e;
import java.util.Collections;
import java.util.Set;
import n3.o1;

/* loaded from: classes.dex */
public final class m30 extends o1 {
    public final vd0 D;
    public final Activity E;
    public cf0 F;
    public ImageView G;
    public LinearLayout H;
    public final e7 I;
    public PopupWindow J;
    public RelativeLayout K;
    public ViewGroup L;

    /* renamed from: u */
    public String f11077u = "top-right";

    /* renamed from: v */
    public boolean f11078v = true;

    /* renamed from: w */
    public int f11079w = 0;

    /* renamed from: x */
    public int f11080x = 0;
    public int y = -1;

    /* renamed from: z */
    public int f11081z = 0;
    public int A = 0;
    public int B = -1;
    public final Object C = new Object();

    static {
        Set c10 = e.c(7);
        Collections.addAll(c10, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(c10);
    }

    public m30(vd0 vd0Var, e7 e7Var) {
        super(vd0Var, "resize");
        this.D = vd0Var;
        this.E = vd0Var.n();
        this.I = e7Var;
    }

    public final void g(boolean z10) {
        synchronized (this.C) {
            try {
                PopupWindow popupWindow = this.J;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    this.K.removeView((View) this.D);
                    ViewGroup viewGroup = this.L;
                    if (viewGroup != null) {
                        viewGroup.removeView(this.G);
                        this.L.addView((View) this.D);
                        this.D.J0(this.F);
                    }
                    if (z10) {
                        f("default");
                        e7 e7Var = this.I;
                        if (e7Var != null) {
                            ((xz0) e7Var.f7729t).f15501c.M0(k2.f10244t);
                        }
                    }
                    this.J = null;
                    this.K = null;
                    this.L = null;
                    this.H = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
