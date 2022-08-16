package u5;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.b1;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.d;
import m0.f0;
import m0.z;
import u5.k;
import x5.a;
import x5.g;
import z0.b;

/* loaded from: classes.dex */
public final class e {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int[] J;
    public boolean K;
    public final TextPaint L;
    public final TextPaint M;
    public TimeInterpolator N;
    public TimeInterpolator O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public float V;
    public StaticLayout W;
    public float X;
    public CharSequence Y;

    /* renamed from: a */
    public final View f19084a;

    /* renamed from: b */
    public boolean f19085b;

    /* renamed from: c */
    public float f19086c;

    /* renamed from: k */
    public ColorStateList f19094k;

    /* renamed from: l */
    public ColorStateList f19095l;

    /* renamed from: m */
    public float f19096m;

    /* renamed from: n */
    public float f19097n;

    /* renamed from: o */
    public float f19098o;
    public float p;

    /* renamed from: q */
    public float f19099q;

    /* renamed from: r */
    public float f19100r;

    /* renamed from: s */
    public Typeface f19101s;

    /* renamed from: t */
    public Typeface f19102t;

    /* renamed from: u */
    public Typeface f19103u;

    /* renamed from: v */
    public Typeface f19104v;

    /* renamed from: w */
    public Typeface f19105w;

    /* renamed from: x */
    public Typeface f19106x;
    public Typeface y;

    /* renamed from: z */
    public a f19107z;

    /* renamed from: g */
    public int f19090g = 16;

    /* renamed from: h */
    public int f19091h = 16;

    /* renamed from: i */
    public float f19092i = 15.0f;

    /* renamed from: j */
    public float f19093j = 15.0f;

    /* renamed from: e */
    public final Rect f19088e = new Rect();

    /* renamed from: d */
    public final Rect f19087d = new Rect();

    /* renamed from: f */
    public final RectF f19089f = new RectF();

    public e(View view) {
        this.f19084a = view;
        TextPaint textPaint = new TextPaint(129);
        this.L = textPaint;
        this.M = new TextPaint(textPaint);
        i(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float h(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = e5.a.f4408a;
        return b1.a(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        View view = this.f19084a;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean z10 = true;
        if (z.e.d(view) != 1) {
            z10 = false;
        }
        return (z10 ? d.f5561d : d.f5560c).b(charSequence, charSequence.length());
    }

    public final void c(float f10) {
        int i10;
        TextPaint textPaint;
        this.f19089f.left = h(this.f19087d.left, this.f19088e.left, f10, this.N);
        this.f19089f.top = h(this.f19096m, this.f19097n, f10, this.N);
        this.f19089f.right = h(this.f19087d.right, this.f19088e.right, f10, this.N);
        this.f19089f.bottom = h(this.f19087d.bottom, this.f19088e.bottom, f10, this.N);
        this.f19099q = h(this.f19098o, this.p, f10, this.N);
        this.f19100r = h(this.f19096m, this.f19097n, f10, this.N);
        p(f10);
        b bVar = e5.a.f4409b;
        h(0.0f, 1.0f, 1.0f - f10, bVar);
        View view = this.f19084a;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.k(view);
        h(1.0f, 0.0f, f10, bVar);
        z.d.k(this.f19084a);
        ColorStateList colorStateList = this.f19095l;
        ColorStateList colorStateList2 = this.f19094k;
        if (colorStateList != colorStateList2) {
            textPaint = this.L;
            i10 = a(g(colorStateList2), f(), f10);
        } else {
            textPaint = this.L;
            i10 = f();
        }
        textPaint.setColor(i10);
        float f11 = this.T;
        float f12 = this.U;
        if (f11 != f12) {
            this.L.setLetterSpacing(h(f12, f11, f10, bVar));
        } else {
            this.L.setLetterSpacing(f11);
        }
        this.G = h(0.0f, this.P, f10, null);
        this.H = h(0.0f, this.Q, f10, null);
        this.I = h(0.0f, this.R, f10, null);
        this.L.setShadowLayer(this.G, this.H, this.I, a(g(null), g(this.S), f10));
        z.d.k(this.f19084a);
    }

    public final void d(float f10, boolean z10) {
        float f11;
        float f12;
        boolean z11;
        StaticLayout staticLayout;
        if (this.A == null) {
            return;
        }
        float width = this.f19088e.width();
        float width2 = this.f19087d.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f12 = this.f19093j;
            f11 = this.T;
            this.E = 1.0f;
            Typeface typeface = this.y;
            Typeface typeface2 = this.f19101s;
            if (typeface != typeface2) {
                this.y = typeface2;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            float f13 = this.f19092i;
            float f14 = this.U;
            Typeface typeface3 = this.y;
            Typeface typeface4 = this.f19104v;
            if (typeface3 != typeface4) {
                this.y = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.E = 1.0f;
            } else {
                this.E = h(this.f19092i, this.f19093j, f10, this.O) / this.f19092i;
            }
            float f15 = this.f19093j / this.f19092i;
            width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
            f12 = f13;
            f11 = f14;
        }
        if (width > 0.0f) {
            z11 = ((this.F > f12 ? 1 : (this.F == f12 ? 0 : -1)) != 0) || ((this.V > f11 ? 1 : (this.V == f11 ? 0 : -1)) != 0) || this.K || z11;
            this.F = f12;
            this.V = f11;
            this.K = false;
        }
        if (this.B != null && !z11) {
            return;
        }
        this.L.setTextSize(this.F);
        this.L.setTypeface(this.y);
        this.L.setLetterSpacing(this.V);
        this.L.setLinearText(this.E != 1.0f);
        boolean b10 = b(this.A);
        this.C = b10;
        try {
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            k kVar = new k(this.A, this.L, (int) width);
            kVar.f19132l = TextUtils.TruncateAt.END;
            kVar.f19131k = b10;
            kVar.f19125e = alignment;
            kVar.f19130j = false;
            kVar.f19126f = 1;
            kVar.f19127g = 0.0f;
            kVar.f19128h = 1.0f;
            kVar.f19129i = 1;
            staticLayout = kVar.a();
        } catch (k.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayout = null;
        }
        Objects.requireNonNull(staticLayout);
        this.W = staticLayout;
        this.B = staticLayout.getText();
    }

    public final float e() {
        TextPaint textPaint = this.M;
        textPaint.setTextSize(this.f19093j);
        textPaint.setTypeface(this.f19101s);
        textPaint.setLetterSpacing(this.T);
        return -this.M.ascent();
    }

    public final int f() {
        return g(this.f19095l);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f19103u;
            if (typeface != null) {
                this.f19102t = g.a(configuration, typeface);
            }
            Typeface typeface2 = this.f19106x;
            if (typeface2 != null) {
                this.f19105w = g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f19102t;
            if (typeface3 == null) {
                typeface3 = this.f19103u;
            }
            this.f19101s = typeface3;
            Typeface typeface4 = this.f19105w;
            if (typeface4 == null) {
                typeface4 = this.f19106x;
            }
            this.f19104v = typeface4;
            k(true);
        }
    }

    public final void j() {
        this.f19085b = this.f19088e.width() > 0 && this.f19088e.height() > 0 && this.f19087d.width() > 0 && this.f19087d.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.e.k(boolean):void");
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f19095l != colorStateList) {
            this.f19095l = colorStateList;
            k(false);
        }
    }

    public final void m(int i10) {
        if (this.f19091h != i10) {
            this.f19091h = i10;
            k(false);
        }
    }

    public final boolean n(Typeface typeface) {
        a aVar = this.f19107z;
        if (aVar != null) {
            aVar.f20029c = true;
        }
        if (this.f19103u != typeface) {
            this.f19103u = typeface;
            Typeface a10 = g.a(this.f19084a.getContext().getResources().getConfiguration(), typeface);
            this.f19102t = a10;
            if (a10 == null) {
                a10 = this.f19103u;
            }
            this.f19101s = a10;
            return true;
        }
        return false;
    }

    public final void o(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f19086c) {
            this.f19086c = f10;
            c(f10);
        }
    }

    public final void p(float f10) {
        d(f10, false);
        View view = this.f19084a;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.k(view);
    }

    public final void q(Typeface typeface) {
        boolean z10;
        boolean n10 = n(typeface);
        if (this.f19106x != typeface) {
            this.f19106x = typeface;
            Typeface a10 = g.a(this.f19084a.getContext().getResources().getConfiguration(), typeface);
            this.f19105w = a10;
            if (a10 == null) {
                a10 = this.f19106x;
            }
            this.f19104v = a10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n10 || z10) {
            k(false);
        }
    }
}
