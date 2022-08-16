package j5;

import a6.g;
import a6.j;
import a6.m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.raouf.routerchef.R;
import f0.a;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final MaterialButton f5453a;

    /* renamed from: b */
    public j f5454b;

    /* renamed from: c */
    public int f5455c;

    /* renamed from: d */
    public int f5456d;

    /* renamed from: e */
    public int f5457e;

    /* renamed from: f */
    public int f5458f;

    /* renamed from: g */
    public int f5459g;

    /* renamed from: h */
    public int f5460h;

    /* renamed from: i */
    public PorterDuff.Mode f5461i;

    /* renamed from: j */
    public ColorStateList f5462j;

    /* renamed from: k */
    public ColorStateList f5463k;

    /* renamed from: l */
    public ColorStateList f5464l;

    /* renamed from: m */
    public g f5465m;

    /* renamed from: n */
    public boolean f5466n = false;

    /* renamed from: o */
    public boolean f5467o = false;
    public boolean p = false;

    /* renamed from: q */
    public boolean f5468q;

    /* renamed from: r */
    public RippleDrawable f5469r;

    /* renamed from: s */
    public int f5470s;

    public a(MaterialButton materialButton, j jVar) {
        this.f5453a = materialButton;
        this.f5454b = jVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f5469r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (m) (this.f5469r.getNumberOfLayers() > 2 ? this.f5469r.getDrawable(2) : this.f5469r.getDrawable(1));
    }

    public final g b(boolean z10) {
        RippleDrawable rippleDrawable = this.f5469r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f5469r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(j jVar) {
        this.f5454b = jVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(jVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(jVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void d(int i10, int i11) {
        MaterialButton materialButton = this.f5453a;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int f10 = z.e.f(materialButton);
        int paddingTop = this.f5453a.getPaddingTop();
        int e10 = z.e.e(this.f5453a);
        int paddingBottom = this.f5453a.getPaddingBottom();
        int i12 = this.f5457e;
        int i13 = this.f5458f;
        this.f5458f = i11;
        this.f5457e = i10;
        if (!this.f5467o) {
            e();
        }
        z.e.k(this.f5453a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        MaterialButton materialButton = this.f5453a;
        g gVar = new g(this.f5454b);
        gVar.m(this.f5453a.getContext());
        a.b.h(gVar, this.f5462j);
        PorterDuff.Mode mode = this.f5461i;
        if (mode != null) {
            a.b.i(gVar, mode);
        }
        gVar.r(this.f5460h, this.f5463k);
        g gVar2 = new g(this.f5454b);
        gVar2.setTint(0);
        gVar2.q(this.f5460h, this.f5466n ? h6.a.b(this.f5453a, R.attr.colorSurface) : 0);
        g gVar3 = new g(this.f5454b);
        this.f5465m = gVar3;
        a.b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(y5.a.a(this.f5464l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f5455c, this.f5457e, this.f5456d, this.f5458f), this.f5465m);
        this.f5469r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b10 = b(false);
        if (b10 != null) {
            b10.n(this.f5470s);
        }
    }

    public final void f() {
        int i10 = 0;
        g b10 = b(false);
        g b11 = b(true);
        if (b10 != null) {
            b10.r(this.f5460h, this.f5463k);
            if (b11 == null) {
                return;
            }
            float f10 = this.f5460h;
            if (this.f5466n) {
                i10 = h6.a.b(this.f5453a, R.attr.colorSurface);
            }
            b11.q(f10, i10);
        }
    }
}
