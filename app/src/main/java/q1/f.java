package q1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import e0.e;
import f0.a;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends q1.e {
    public static final PorterDuff.Mode B = PorterDuff.Mode.SRC_IN;
    public final Rect A;

    /* renamed from: t */
    public g f17076t;

    /* renamed from: u */
    public PorterDuffColorFilter f17077u;

    /* renamed from: v */
    public ColorFilter f17078v;

    /* renamed from: w */
    public boolean f17079w;

    /* renamed from: x */
    public boolean f17080x;
    public final float[] y;

    /* renamed from: z */
    public final Matrix f17081z;

    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e */
        public d0.d f17082e;

        /* renamed from: f */
        public float f17083f;

        /* renamed from: g */
        public d0.d f17084g;

        /* renamed from: h */
        public float f17085h;

        /* renamed from: i */
        public float f17086i;

        /* renamed from: j */
        public float f17087j;

        /* renamed from: k */
        public float f17088k;

        /* renamed from: l */
        public float f17089l;

        /* renamed from: m */
        public Paint.Cap f17090m;

        /* renamed from: n */
        public Paint.Join f17091n;

        /* renamed from: o */
        public float f17092o;

        public b() {
            this.f17083f = 0.0f;
            this.f17085h = 1.0f;
            this.f17086i = 1.0f;
            this.f17087j = 0.0f;
            this.f17088k = 1.0f;
            this.f17089l = 0.0f;
            this.f17090m = Paint.Cap.BUTT;
            this.f17091n = Paint.Join.MITER;
            this.f17092o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f17083f = 0.0f;
            this.f17085h = 1.0f;
            this.f17086i = 1.0f;
            this.f17087j = 0.0f;
            this.f17088k = 1.0f;
            this.f17089l = 0.0f;
            this.f17090m = Paint.Cap.BUTT;
            this.f17091n = Paint.Join.MITER;
            this.f17092o = 4.0f;
            this.f17082e = bVar.f17082e;
            this.f17083f = bVar.f17083f;
            this.f17085h = bVar.f17085h;
            this.f17084g = bVar.f17084g;
            this.f17107c = bVar.f17107c;
            this.f17086i = bVar.f17086i;
            this.f17087j = bVar.f17087j;
            this.f17088k = bVar.f17088k;
            this.f17089l = bVar.f17089l;
            this.f17090m = bVar.f17090m;
            this.f17091n = bVar.f17091n;
            this.f17092o = bVar.f17092o;
        }

        @Override // q1.f.d
        public final boolean a() {
            return this.f17084g.c() || this.f17082e.c();
        }

        @Override // q1.f.d
        public final boolean b(int[] iArr) {
            return this.f17082e.d(iArr) | this.f17084g.d(iArr);
        }

        public float getFillAlpha() {
            return this.f17086i;
        }

        public int getFillColor() {
            return this.f17084g.f3690c;
        }

        public float getStrokeAlpha() {
            return this.f17085h;
        }

        public int getStrokeColor() {
            return this.f17082e.f3690c;
        }

        public float getStrokeWidth() {
            return this.f17083f;
        }

        public float getTrimPathEnd() {
            return this.f17088k;
        }

        public float getTrimPathOffset() {
            return this.f17089l;
        }

        public float getTrimPathStart() {
            return this.f17087j;
        }

        public void setFillAlpha(float f10) {
            this.f17086i = f10;
        }

        public void setFillColor(int i10) {
            this.f17084g.f3690c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f17085h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f17082e.f3690c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f17083f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f17088k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f17089l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f17087j = f10;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: q1.f$f */
    /* loaded from: classes.dex */
    public static class C0105f {
        public static final Matrix p = new Matrix();

        /* renamed from: a */
        public final Path f17109a;

        /* renamed from: b */
        public final Path f17110b;

        /* renamed from: c */
        public final Matrix f17111c;

        /* renamed from: d */
        public Paint f17112d;

        /* renamed from: e */
        public Paint f17113e;

        /* renamed from: f */
        public PathMeasure f17114f;

        /* renamed from: g */
        public final c f17115g;

        /* renamed from: h */
        public float f17116h;

        /* renamed from: i */
        public float f17117i;

        /* renamed from: j */
        public float f17118j;

        /* renamed from: k */
        public float f17119k;

        /* renamed from: l */
        public int f17120l;

        /* renamed from: m */
        public String f17121m;

        /* renamed from: n */
        public Boolean f17122n;

        /* renamed from: o */
        public final r.a<String, Object> f17123o;

        public C0105f() {
            this.f17111c = new Matrix();
            this.f17116h = 0.0f;
            this.f17117i = 0.0f;
            this.f17118j = 0.0f;
            this.f17119k = 0.0f;
            this.f17120l = 255;
            this.f17121m = null;
            this.f17122n = null;
            this.f17123o = new r.a<>();
            this.f17115g = new c();
            this.f17109a = new Path();
            this.f17110b = new Path();
        }

        public C0105f(C0105f c0105f) {
            this.f17111c = new Matrix();
            this.f17116h = 0.0f;
            this.f17117i = 0.0f;
            this.f17118j = 0.0f;
            this.f17119k = 0.0f;
            this.f17120l = 255;
            this.f17121m = null;
            this.f17122n = null;
            r.a<String, Object> aVar = new r.a<>();
            this.f17123o = aVar;
            this.f17115g = new c(c0105f.f17115g, aVar);
            this.f17109a = new Path(c0105f.f17109a);
            this.f17110b = new Path(c0105f.f17110b);
            this.f17116h = c0105f.f17116h;
            this.f17117i = c0105f.f17117i;
            this.f17118j = c0105f.f17118j;
            this.f17119k = c0105f.f17119k;
            this.f17120l = c0105f.f17120l;
            this.f17121m = c0105f.f17121m;
            String str = c0105f.f17121m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f17122n = c0105f.f17122n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v2 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            boolean z10;
            cVar.f17093a.set(matrix);
            cVar.f17093a.preConcat(cVar.f17102j);
            canvas.save();
            ?? r92 = 0;
            C0105f c0105f = this;
            int i12 = 0;
            while (i12 < cVar.f17094b.size()) {
                d dVar = cVar.f17094b.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.f17093a, canvas, i10, i11);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f10 = i10 / c0105f.f17118j;
                    float f11 = i11 / c0105f.f17119k;
                    float min = Math.min(f10, f11);
                    Matrix matrix2 = cVar.f17093a;
                    c0105f.f17111c.set(matrix2);
                    c0105f.f17111c.postScale(f10, f11);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    char c10 = r92 == true ? 1 : 0;
                    char c11 = r92 == true ? 1 : 0;
                    float f12 = (fArr[r92] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[c10], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                    if (abs != 0.0f) {
                        Path path = this.f17109a;
                        Objects.requireNonNull(eVar);
                        path.reset();
                        e.a[] aVarArr = eVar.f17105a;
                        if (aVarArr != null) {
                            e.a.b(aVarArr, path);
                        }
                        Path path2 = this.f17109a;
                        this.f17110b.reset();
                        if (eVar instanceof a) {
                            this.f17110b.setFillType(eVar.f17107c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            this.f17110b.addPath(path2, this.f17111c);
                            canvas.clipPath(this.f17110b);
                        } else {
                            b bVar = (b) eVar;
                            float f13 = bVar.f17087j;
                            if (f13 != 0.0f || bVar.f17088k != 1.0f) {
                                float f14 = bVar.f17089l;
                                float f15 = (f13 + f14) % 1.0f;
                                float f16 = (bVar.f17088k + f14) % 1.0f;
                                if (this.f17114f == null) {
                                    this.f17114f = new PathMeasure();
                                }
                                this.f17114f.setPath(this.f17109a, r92);
                                float length = this.f17114f.getLength();
                                float f17 = f15 * length;
                                float f18 = f16 * length;
                                path2.reset();
                                if (f17 > f18) {
                                    this.f17114f.getSegment(f17, length, path2, true);
                                    this.f17114f.getSegment(0.0f, f18, path2, true);
                                } else {
                                    this.f17114f.getSegment(f17, f18, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f17110b.addPath(path2, this.f17111c);
                            d0.d dVar2 = bVar.f17084g;
                            if (dVar2.b() || dVar2.f3690c != 0) {
                                z10 = true;
                            } else {
                                boolean z11 = r92 == true ? 1 : 0;
                                Object[] objArr = r92 == true ? 1 : 0;
                                z10 = z11;
                            }
                            if (z10) {
                                d0.d dVar3 = bVar.f17084g;
                                if (this.f17113e == null) {
                                    Paint paint = new Paint(1);
                                    this.f17113e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f17113e;
                                if (dVar3.b()) {
                                    Shader shader = dVar3.f3688a;
                                    shader.setLocalMatrix(this.f17111c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f17086i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i13 = dVar3.f3690c;
                                    float f19 = bVar.f17086i;
                                    PorterDuff.Mode mode = f.B;
                                    paint2.setColor((i13 & 16777215) | (((int) (Color.alpha(i13) * f19)) << 24));
                                }
                                paint2.setColorFilter(null);
                                this.f17110b.setFillType(bVar.f17107c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(this.f17110b, paint2);
                            }
                            d0.d dVar4 = bVar.f17082e;
                            if (dVar4.b() || dVar4.f3690c != 0) {
                                d0.d dVar5 = bVar.f17082e;
                                if (this.f17112d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f17112d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f17112d;
                                Paint.Join join = bVar.f17091n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f17090m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f17092o);
                                if (dVar5.b()) {
                                    Shader shader2 = dVar5.f3688a;
                                    shader2.setLocalMatrix(this.f17111c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f17085h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i14 = dVar5.f3690c;
                                    float f20 = bVar.f17085h;
                                    PorterDuff.Mode mode2 = f.B;
                                    paint4.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f17083f * abs * min);
                                canvas.drawPath(this.f17110b, paint4);
                            }
                        }
                    }
                    c0105f = this;
                    i12++;
                    r92 = 0;
                }
                i12++;
                r92 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f17120l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f17120l = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f17124a;

        /* renamed from: b */
        public C0105f f17125b;

        /* renamed from: c */
        public ColorStateList f17126c;

        /* renamed from: d */
        public PorterDuff.Mode f17127d;

        /* renamed from: e */
        public boolean f17128e;

        /* renamed from: f */
        public Bitmap f17129f;

        /* renamed from: g */
        public ColorStateList f17130g;

        /* renamed from: h */
        public PorterDuff.Mode f17131h;

        /* renamed from: i */
        public int f17132i;

        /* renamed from: j */
        public boolean f17133j;

        /* renamed from: k */
        public boolean f17134k;

        /* renamed from: l */
        public Paint f17135l;

        public g() {
            this.f17126c = null;
            this.f17127d = f.B;
            this.f17125b = new C0105f();
        }

        public g(g gVar) {
            this.f17126c = null;
            this.f17127d = f.B;
            if (gVar != null) {
                this.f17124a = gVar.f17124a;
                C0105f c0105f = new C0105f(gVar.f17125b);
                this.f17125b = c0105f;
                if (gVar.f17125b.f17113e != null) {
                    c0105f.f17113e = new Paint(gVar.f17125b.f17113e);
                }
                if (gVar.f17125b.f17112d != null) {
                    this.f17125b.f17112d = new Paint(gVar.f17125b.f17112d);
                }
                this.f17126c = gVar.f17126c;
                this.f17127d = gVar.f17127d;
                this.f17128e = gVar.f17128e;
            }
        }

        public final boolean a() {
            C0105f c0105f = this.f17125b;
            if (c0105f.f17122n == null) {
                c0105f.f17122n = Boolean.valueOf(c0105f.f17115g.a());
            }
            return c0105f.f17122n.booleanValue();
        }

        public final void b(int i10, int i11) {
            this.f17129f.eraseColor(0);
            Canvas canvas = new Canvas(this.f17129f);
            C0105f c0105f = this.f17125b;
            c0105f.a(c0105f.f17115g, C0105f.p, canvas, i10, i11);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f17124a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f17136a;

        public h(Drawable.ConstantState constantState) {
            this.f17136a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f17136a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f17136a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.f17075s = (VectorDrawable) this.f17136a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f17075s = (VectorDrawable) this.f17136a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f17075s = (VectorDrawable) this.f17136a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public f() {
        this.f17080x = true;
        this.y = new float[9];
        this.f17081z = new Matrix();
        this.A = new Rect();
        this.f17076t = new g();
    }

    public f(g gVar) {
        this.f17080x = true;
        this.y = new float[9];
        this.f17081z = new Matrix();
        this.A = new Rect();
        this.f17076t = gVar;
        this.f17077u = b(gVar.f17126c, gVar.f17127d);
    }

    public static f a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f fVar = new f();
        fVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return fVar;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f17129f.getHeight()) == false) goto L38;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.C0068a.a(drawable);
        }
        return this.f17076t.f17125b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f17076t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f17078v;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17075s == null || Build.VERSION.SDK_INT < 24) {
            this.f17076t.f17124a = getChangingConfigurations();
            return this.f17076t;
        }
        return new h(this.f17075s.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f17076t.f17125b.f17117i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f17076t.f17125b.f17116h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return a.C0068a.d(drawable);
        }
        return this.f17076t.f17128e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        g gVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((gVar = this.f17076t) != null && (gVar.a() || ((colorStateList = this.f17076t.f17126c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f17079w && super.mutate() == this) {
            this.f17076t = new g(this.f17076t);
            this.f17079w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        g gVar = this.f17076t;
        ColorStateList colorStateList = gVar.f17126c;
        if (colorStateList != null && (mode = gVar.f17127d) != null) {
            this.f17077u = b(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (gVar.a()) {
            boolean b10 = gVar.f17125b.f17115g.b(iArr);
            gVar.f17134k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f17076t.f17125b.getRootAlpha() == i10) {
        } else {
            this.f17076t.f17125b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.C0068a.e(drawable, z10);
        } else {
            this.f17076t.f17128e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f17078v = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.g(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f17076t;
        if (gVar.f17126c == colorStateList) {
            return;
        }
        gVar.f17126c = colorStateList;
        this.f17077u = b(colorStateList, gVar.f17127d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.f17076t;
        if (gVar.f17127d == mode) {
            return;
        }
        gVar.f17127d = mode;
        this.f17077u = b(gVar.f17126c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f17075s;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f17075s;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a */
        public final Matrix f17093a;

        /* renamed from: b */
        public final ArrayList<d> f17094b;

        /* renamed from: c */
        public float f17095c;

        /* renamed from: d */
        public float f17096d;

        /* renamed from: e */
        public float f17097e;

        /* renamed from: f */
        public float f17098f;

        /* renamed from: g */
        public float f17099g;

        /* renamed from: h */
        public float f17100h;

        /* renamed from: i */
        public float f17101i;

        /* renamed from: j */
        public final Matrix f17102j;

        /* renamed from: k */
        public int f17103k;

        /* renamed from: l */
        public String f17104l;

        public c() {
            this.f17093a = new Matrix();
            this.f17094b = new ArrayList<>();
            this.f17095c = 0.0f;
            this.f17096d = 0.0f;
            this.f17097e = 0.0f;
            this.f17098f = 1.0f;
            this.f17099g = 1.0f;
            this.f17100h = 0.0f;
            this.f17101i = 0.0f;
            this.f17102j = new Matrix();
            this.f17104l = null;
        }

        @Override // q1.f.d
        public final boolean a() {
            for (int i10 = 0; i10 < this.f17094b.size(); i10++) {
                if (this.f17094b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // q1.f.d
        public final boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f17094b.size(); i10++) {
                z10 |= this.f17094b.get(i10).b(iArr);
            }
            return z10;
        }

        public final void c() {
            this.f17102j.reset();
            this.f17102j.postTranslate(-this.f17096d, -this.f17097e);
            this.f17102j.postScale(this.f17098f, this.f17099g);
            this.f17102j.postRotate(this.f17095c, 0.0f, 0.0f);
            this.f17102j.postTranslate(this.f17100h + this.f17096d, this.f17101i + this.f17097e);
        }

        public String getGroupName() {
            return this.f17104l;
        }

        public Matrix getLocalMatrix() {
            return this.f17102j;
        }

        public float getPivotX() {
            return this.f17096d;
        }

        public float getPivotY() {
            return this.f17097e;
        }

        public float getRotation() {
            return this.f17095c;
        }

        public float getScaleX() {
            return this.f17098f;
        }

        public float getScaleY() {
            return this.f17099g;
        }

        public float getTranslateX() {
            return this.f17100h;
        }

        public float getTranslateY() {
            return this.f17101i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f17096d) {
                this.f17096d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f17097e) {
                this.f17097e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f17095c) {
                this.f17095c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f17098f) {
                this.f17098f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f17099g) {
                this.f17099g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f17100h) {
                this.f17100h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f17101i) {
                this.f17101i = f10;
                c();
            }
        }

        public c(c cVar, r.a<String, Object> aVar) {
            e eVar;
            this.f17093a = new Matrix();
            this.f17094b = new ArrayList<>();
            this.f17095c = 0.0f;
            this.f17096d = 0.0f;
            this.f17097e = 0.0f;
            this.f17098f = 1.0f;
            this.f17099g = 1.0f;
            this.f17100h = 0.0f;
            this.f17101i = 0.0f;
            Matrix matrix = new Matrix();
            this.f17102j = matrix;
            this.f17104l = null;
            this.f17095c = cVar.f17095c;
            this.f17096d = cVar.f17096d;
            this.f17097e = cVar.f17097e;
            this.f17098f = cVar.f17098f;
            this.f17099g = cVar.f17099g;
            this.f17100h = cVar.f17100h;
            this.f17101i = cVar.f17101i;
            String str = cVar.f17104l;
            this.f17104l = str;
            this.f17103k = cVar.f17103k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f17102j);
            ArrayList<d> arrayList = cVar.f17094b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f17094b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        eVar = new b((b) dVar);
                    } else if (!(dVar instanceof a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        eVar = new a((a) dVar);
                    }
                    this.f17094b.add(eVar);
                    String str2 = eVar.f17106b;
                    if (str2 != null) {
                        aVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a */
        public e.a[] f17105a;

        /* renamed from: b */
        public String f17106b;

        /* renamed from: c */
        public int f17107c;

        /* renamed from: d */
        public int f17108d;

        public e() {
            this.f17105a = null;
            this.f17107c = 0;
        }

        public e.a[] getPathData() {
            return this.f17105a;
        }

        public String getPathName() {
            return this.f17106b;
        }

        public void setPathData(e.a[] aVarArr) {
            if (!e0.e.a(this.f17105a, aVarArr)) {
                this.f17105a = e0.e.e(aVarArr);
                return;
            }
            e.a[] aVarArr2 = this.f17105a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f4316a = aVarArr[i10].f4316a;
                for (int i11 = 0; i11 < aVarArr[i10].f4317b.length; i11++) {
                    aVarArr2[i10].f4317b[i11] = aVarArr[i10].f4317b[i11];
                }
            }
        }

        public e(e eVar) {
            this.f17105a = null;
            this.f17107c = 0;
            this.f17106b = eVar.f17106b;
            this.f17108d = eVar.f17108d;
            this.f17105a = e0.e.e(eVar.f17105a);
        }
    }
}
