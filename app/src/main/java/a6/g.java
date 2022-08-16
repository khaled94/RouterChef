package a6;

import a6.k;
import a6.l;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements m {
    public static final String O = g.class.getSimpleName();
    public static final Paint P;
    public final RectF A;
    public final RectF B;
    public final Region C;
    public final Region D;
    public j E;
    public final Paint F;
    public final Paint G;
    public final z5.a H;
    public final a I;
    public final k J;
    public PorterDuffColorFilter K;
    public PorterDuffColorFilter L;
    public final RectF M;
    public boolean N;

    /* renamed from: s */
    public b f191s;

    /* renamed from: t */
    public final l.g[] f192t;

    /* renamed from: u */
    public final l.g[] f193u;

    /* renamed from: v */
    public final BitSet f194v;

    /* renamed from: w */
    public boolean f195w;

    /* renamed from: x */
    public final Matrix f196x;
    public final Path y;

    /* renamed from: z */
    public final Path f197z;

    /* loaded from: classes.dex */
    public class a implements k.b {
        public a() {
            g.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        public j f199a;

        /* renamed from: b */
        public r5.a f200b;

        /* renamed from: c */
        public ColorStateList f201c;

        /* renamed from: d */
        public ColorStateList f202d;

        /* renamed from: e */
        public ColorStateList f203e;

        /* renamed from: f */
        public ColorStateList f204f;

        /* renamed from: g */
        public PorterDuff.Mode f205g;

        /* renamed from: h */
        public Rect f206h;

        /* renamed from: i */
        public float f207i;

        /* renamed from: j */
        public float f208j;

        /* renamed from: k */
        public float f209k;

        /* renamed from: l */
        public int f210l;

        /* renamed from: m */
        public float f211m;

        /* renamed from: n */
        public float f212n;

        /* renamed from: o */
        public float f213o;
        public int p;

        /* renamed from: q */
        public int f214q;

        /* renamed from: r */
        public int f215r;

        /* renamed from: s */
        public int f216s;

        /* renamed from: t */
        public boolean f217t;

        /* renamed from: u */
        public Paint.Style f218u;

        public b(b bVar) {
            this.f201c = null;
            this.f202d = null;
            this.f203e = null;
            this.f204f = null;
            this.f205g = PorterDuff.Mode.SRC_IN;
            this.f206h = null;
            this.f207i = 1.0f;
            this.f208j = 1.0f;
            this.f210l = 255;
            this.f211m = 0.0f;
            this.f212n = 0.0f;
            this.f213o = 0.0f;
            this.p = 0;
            this.f214q = 0;
            this.f215r = 0;
            this.f216s = 0;
            this.f217t = false;
            this.f218u = Paint.Style.FILL_AND_STROKE;
            this.f199a = bVar.f199a;
            this.f200b = bVar.f200b;
            this.f209k = bVar.f209k;
            this.f201c = bVar.f201c;
            this.f202d = bVar.f202d;
            this.f205g = bVar.f205g;
            this.f204f = bVar.f204f;
            this.f210l = bVar.f210l;
            this.f207i = bVar.f207i;
            this.f215r = bVar.f215r;
            this.p = bVar.p;
            this.f217t = bVar.f217t;
            this.f208j = bVar.f208j;
            this.f211m = bVar.f211m;
            this.f212n = bVar.f212n;
            this.f213o = bVar.f213o;
            this.f214q = bVar.f214q;
            this.f216s = bVar.f216s;
            this.f203e = bVar.f203e;
            this.f218u = bVar.f218u;
            if (bVar.f206h != null) {
                this.f206h = new Rect(bVar.f206h);
            }
        }

        public b(j jVar) {
            this.f201c = null;
            this.f202d = null;
            this.f203e = null;
            this.f204f = null;
            this.f205g = PorterDuff.Mode.SRC_IN;
            this.f206h = null;
            this.f207i = 1.0f;
            this.f208j = 1.0f;
            this.f210l = 255;
            this.f211m = 0.0f;
            this.f212n = 0.0f;
            this.f213o = 0.0f;
            this.p = 0;
            this.f214q = 0;
            this.f215r = 0;
            this.f216s = 0;
            this.f217t = false;
            this.f218u = Paint.Style.FILL_AND_STROKE;
            this.f199a = jVar;
            this.f200b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f195w = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public g(b bVar) {
        k kVar;
        this.f192t = new l.g[4];
        this.f193u = new l.g[4];
        this.f194v = new BitSet(8);
        this.f196x = new Matrix();
        this.y = new Path();
        this.f197z = new Path();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Region();
        this.D = new Region();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new z5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kVar = k.a.f256a;
        } else {
            kVar = new k();
        }
        this.J = kVar;
        this.M = new RectF();
        this.N = true;
        this.f191s = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.I = new a();
    }

    public g(j jVar) {
        this(new b(jVar));
    }

    public final void b(RectF rectF, Path path) {
        k kVar = this.J;
        b bVar = this.f191s;
        kVar.a(bVar.f199a, bVar.f208j, rectF, this.I, path);
        if (this.f191s.f207i != 1.0f) {
            this.f196x.reset();
            Matrix matrix = this.f196x;
            float f10 = this.f191s.f207i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f196x);
        }
        path.computeBounds(this.M, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        int color;
        int d5;
        if (colorStateList == null || mode == null) {
            return (!z10 || (d5 = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(d5, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i10) {
        int i11;
        b bVar = this.f191s;
        float f10 = bVar.f212n + bVar.f213o + bVar.f211m;
        r5.a aVar = bVar.f200b;
        if (aVar == null || !aVar.f17256a) {
            return i10;
        }
        if (!(e0.a.e(i10, 255) == aVar.f17259d)) {
            return i10;
        }
        float f11 = aVar.f17260e;
        float min = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i10);
        int f12 = h6.a.f(e0.a.e(i10, 255), aVar.f17257b, min);
        if (min > 0.0f && (i11 = aVar.f17258c) != 0) {
            f12 = e0.a.b(e0.a.e(i11, r5.a.f17255f), f12);
        }
        return e0.a.e(f12, alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if ((!r2.f199a.d(h()) && !r12.y.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f194v.cardinality() > 0) {
            Log.w(O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f191s.f215r != 0) {
            canvas.drawPath(this.y, this.H.f20983a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.g gVar = this.f192t[i10];
            z5.a aVar = this.H;
            int i11 = this.f191s.f214q;
            Matrix matrix = l.g.f281a;
            gVar.a(matrix, aVar, i11, canvas);
            this.f193u[i10].a(matrix, this.H, this.f191s.f214q, canvas);
        }
        if (this.N) {
            b bVar = this.f191s;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f216s)) * bVar.f215r);
            int j3 = j();
            canvas.translate(-sin, -j3);
            canvas.drawPath(this.y, P);
            canvas.translate(sin, j3);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a10 = jVar.f225f.a(rectF) * this.f191s.f208j;
        canvas.drawRoundRect(rectF, a10, a10, paint);
    }

    public void g(Canvas canvas) {
        f(canvas, this.G, this.f197z, this.E, i());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f191s.f210l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f191s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f191s;
        if (bVar.p == 2) {
            return;
        }
        if (bVar.f199a.d(h())) {
            outline.setRoundRect(getBounds(), k() * this.f191s.f208j);
            return;
        }
        b(h(), this.y);
        if (!this.y.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.y);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f191s.f206h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.C.set(getBounds());
        b(h(), this.y);
        this.D.setPath(this.y, this.C);
        this.C.op(this.D, Region.Op.DIFFERENCE);
        return this.C;
    }

    public final RectF h() {
        this.A.set(getBounds());
        return this.A;
    }

    public final RectF i() {
        this.B.set(h());
        float strokeWidth = l() ? this.G.getStrokeWidth() / 2.0f : 0.0f;
        this.B.inset(strokeWidth, strokeWidth);
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f195w = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f191s.f204f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f191s.f203e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f191s.f202d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f191s.f201c) != null && colorStateList4.isStateful())));
    }

    public final int j() {
        b bVar = this.f191s;
        return (int) (Math.cos(Math.toRadians(bVar.f216s)) * bVar.f215r);
    }

    public final float k() {
        return this.f191s.f199a.f224e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f191s.f218u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.G.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f191s.f200b = new r5.a(context);
        w();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f191s = new b(this.f191s);
        return this;
    }

    public final void n(float f10) {
        b bVar = this.f191s;
        if (bVar.f212n != f10) {
            bVar.f212n = f10;
            w();
        }
    }

    public final void o(ColorStateList colorStateList) {
        b bVar = this.f191s;
        if (bVar.f201c != colorStateList) {
            bVar.f201c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f195w = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10 = u(iArr) || v();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(float f10) {
        b bVar = this.f191s;
        if (bVar.f208j != f10) {
            bVar.f208j = f10;
            this.f195w = true;
            invalidateSelf();
        }
    }

    public final void q(float f10, int i10) {
        t(f10);
        s(ColorStateList.valueOf(i10));
    }

    public final void r(float f10, ColorStateList colorStateList) {
        t(f10);
        s(colorStateList);
    }

    public final void s(ColorStateList colorStateList) {
        b bVar = this.f191s;
        if (bVar.f202d != colorStateList) {
            bVar.f202d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f191s;
        if (bVar.f210l != i10) {
            bVar.f210l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Objects.requireNonNull(this.f191s);
        super.invalidateSelf();
    }

    @Override // a6.m
    public final void setShapeAppearanceModel(j jVar) {
        this.f191s.f199a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f191s.f204f = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f191s;
        if (bVar.f205g != mode) {
            bVar.f205g = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final void t(float f10) {
        this.f191s.f209k = f10;
        invalidateSelf();
    }

    public final boolean u(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f191s.f201c == null || color2 == (colorForState2 = this.f191s.f201c.getColorForState(iArr, (color2 = this.F.getColor())))) {
            z10 = false;
        } else {
            this.F.setColor(colorForState2);
            z10 = true;
        }
        if (this.f191s.f202d == null || color == (colorForState = this.f191s.f202d.getColorForState(iArr, (color = this.G.getColor())))) {
            return z10;
        }
        this.G.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.K;
        PorterDuffColorFilter porterDuffColorFilter2 = this.L;
        b bVar = this.f191s;
        this.K = c(bVar.f204f, bVar.f205g, this.F, true);
        b bVar2 = this.f191s;
        this.L = c(bVar2.f203e, bVar2.f205g, this.G, false);
        b bVar3 = this.f191s;
        if (bVar3.f217t) {
            this.H.a(bVar3.f204f.getColorForState(getState(), 0));
        }
        return !l0.b.a(porterDuffColorFilter, this.K) || !l0.b.a(porterDuffColorFilter2, this.L);
    }

    public final void w() {
        b bVar = this.f191s;
        float f10 = bVar.f212n + bVar.f213o;
        bVar.f214q = (int) Math.ceil(0.75f * f10);
        this.f191s.f215r = (int) Math.ceil(f10 * 0.25f);
        v();
        super.invalidateSelf();
    }
}
