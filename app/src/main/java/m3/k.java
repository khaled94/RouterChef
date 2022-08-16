package m3;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import m4.vd0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final int f5964a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f5965b;

    /* renamed from: c */
    public final ViewGroup f5966c;

    /* renamed from: d */
    public final Context f5967d;

    public k(vd0 vd0Var) {
        this.f5965b = vd0Var.getLayoutParams();
        ViewParent parent = vd0Var.getParent();
        this.f5967d = vd0Var.H();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new i("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f5966c = viewGroup;
        this.f5964a = viewGroup.indexOfChild(vd0Var.A());
        viewGroup.removeView(vd0Var.A());
        vd0Var.U(true);
    }
}
