package i2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import d9.p;
import j2.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k2.a;
import k2.c;
import k2.d;
import k2.e;
import k2.g;
import k2.h;
import k2.i;

/* loaded from: classes.dex */
public abstract class f extends c {
    public final ArrayList<l2.a<?>> A0;
    public a B0;
    public int C0;
    public List<Float> D0;
    public boolean E0;
    public float F0;
    public float G0;
    public p<? super Integer, ? super Float, ? extends CharSequence> H0;
    public float I0;

    /* renamed from: l0 */
    public k2.a<?> f5227l0;

    /* renamed from: m0 */
    public final PointF f5228m0;

    /* renamed from: n0 */
    public boolean f5229n0;

    /* renamed from: o0 */
    public int f5230o0;

    /* renamed from: p0 */
    public final Paint f5231p0;

    /* renamed from: q0 */
    public final Paint f5232q0;

    /* renamed from: r0 */
    public final Paint f5233r0;

    /* renamed from: s0 */
    public final Path f5234s0;

    /* renamed from: t0 */
    public int f5235t0;

    /* renamed from: u0 */
    public float f5236u0;

    /* renamed from: v0 */
    public float f5237v0;

    /* renamed from: w0 */
    public int f5238w0;
    public int x0;

    /* renamed from: y0 */
    public int f5239y0;

    /* renamed from: z0 */
    public float f5240z0;

    /* loaded from: classes.dex */
    public enum a {
        NORMAL(0, 720, false, 1, 1),
        /* JADX INFO: Fake field, exist only in values array */
        LEFT(90, 270, true, 2, 1),
        /* JADX INFO: Fake field, exist only in values array */
        TOP(180, 360, true, 1, 2),
        RIGHT(270, 450, true, 2, 1),
        BOTTOM(0, 180, true, 1, 2),
        /* JADX INFO: Fake field, exist only in values array */
        TOP_LEFT(180, 270, false, 1, 1),
        TOP_RIGHT(270, 360, false, 1, 1),
        BOTTOM_RIGHT(0, 90, false, 1, 1),
        BOTTOM_LEFT(90, 180, false, 1, 1);
        

        /* renamed from: s */
        public final int f5243s;

        /* renamed from: t */
        public final int f5244t;

        /* renamed from: u */
        public final boolean f5245u;

        /* renamed from: v */
        public final int f5246v;

        /* renamed from: w */
        public final int f5247w;

        a(int i10, int i11, boolean z10, int i12, int i13) {
            this.f5243s = i10;
            this.f5244t = i11;
            this.f5245u = z10;
            this.f5246v = i12;
            this.f5247w = i13;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        e9.f.e(context, "context");
    }

    public final int getBackgroundCircleColor() {
        return this.f5238w0;
    }

    public final float getDegree() {
        return this.f5240z0;
    }

    public final int getEndDegree() {
        return this.f5239y0;
    }

    public final float getFulcrumX() {
        return this.f5228m0.x;
    }

    public final float getFulcrumY() {
        return this.f5228m0.y;
    }

    public final k2.a<?> getIndicator() {
        return this.f5227l0;
    }

    public final int getIndicatorLightColor() {
        return this.f5230o0;
    }

    public final float getInitTickPadding() {
        return this.F0;
    }

    public final int getMarkColor() {
        return this.f5233r0.getColor();
    }

    public final float getMarkHeight() {
        return this.f5237v0;
    }

    public final Paint getMarkPaint() {
        return this.f5233r0;
    }

    public final b getMarkStyle() {
        return this.f5233r0.getStrokeCap() == Paint.Cap.ROUND ? b.ROUND : b.BUTT;
    }

    public final float getMarkWidth() {
        return this.f5233r0.getStrokeWidth();
    }

    public final int getMarksNumber() {
        return this.f5235t0;
    }

    public final float getMarksPadding() {
        return this.f5236u0;
    }

    public final p<Integer, Float, CharSequence> getOnPrintTickLabel() {
        return this.H0;
    }

    public final int getSize() {
        a aVar = this.B0;
        return aVar == a.NORMAL ? getWidth() : aVar.f5245u ? Math.max(getWidth(), getHeight()) : (Math.max(getWidth(), getHeight()) * 2) - (this.C0 * 2);
    }

    public final int getSizePa() {
        return getSize() - (getPadding() * 2);
    }

    public final a getSpeedometerMode() {
        return this.B0;
    }

    @Override // i2.c
    public float getSpeedometerWidth() {
        return super.getSpeedometerWidth();
    }

    public final int getStartDegree() {
        return this.x0;
    }

    public final int getTickNumber() {
        return this.D0.size();
    }

    public final float getTickPadding() {
        return this.G0;
    }

    public final List<Float> getTicks() {
        return this.D0;
    }

    public final float getViewBottom() {
        return (getHeight() * 0.5f) + getViewCenterY();
    }

    public final float getViewCenterX() {
        int ordinal = this.B0.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 5) {
                    if (ordinal != 6 && ordinal != 7) {
                        if (ordinal != 8) {
                            return getSize() * 0.5f;
                        }
                    }
                }
            }
            return (getSize() * 0.5f) + (getWidth() * 0.5f);
        }
        return (getSize() * 0.5f) - (getWidth() * 0.5f);
    }

    public final float getViewCenterY() {
        switch (this.B0.ordinal()) {
            case 2:
            case 5:
            case 6:
                return (getSize() * 0.5f) - (getHeight() * 0.5f);
            case 3:
            default:
                return getSize() * 0.5f;
            case 4:
            case 7:
            case 8:
                return (getHeight() * 0.5f) + (getSize() * 0.5f);
        }
    }

    public final float getViewLeft() {
        return getViewCenterX() - (getWidth() * 0.5f);
    }

    public final float getViewRight() {
        return (getWidth() * 0.5f) + getViewCenterX();
    }

    public final float getViewTop() {
        return getViewCenterY() - (getHeight() * 0.5f);
    }

    @Override // i2.c, android.view.View
    public void onDraw(Canvas canvas) {
        e9.f.e(canvas, "canvas");
        super.onDraw(canvas);
        this.f5240z0 = t(getCurrentSpeed());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int j3 = (int) j(250.0f);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            size = Math.min(size, size2);
        } else if (mode != 1073741824) {
            if (mode2 == 1073741824) {
                size = size2;
            } else {
                if ((mode == 0 && mode2 == 0) || (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE)) {
                    size = Math.min(size, size2);
                } else if (mode != Integer.MIN_VALUE) {
                    size = Math.min(j3, size2);
                }
                size = Math.min(j3, size);
            }
        }
        int max = Math.max(size, Math.max(getSuggestedMinimumWidth(), getSuggestedMinimumHeight()));
        a aVar = this.B0;
        int i12 = aVar.f5246v;
        int i13 = max / i12;
        int i14 = max / aVar.f5247w;
        if (aVar.f5245u) {
            if (i12 == 2) {
                i13 += this.C0;
            } else {
                i14 += this.C0;
            }
        }
        setMeasuredDimension(i13, i14);
    }

    @Override // i2.c, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5227l0.j();
        w();
    }

    public final void r() {
        int i10 = this.x0;
        boolean z10 = true;
        if (i10 >= 0) {
            int i11 = this.f5239y0;
            if (!(i11 >= 0)) {
                throw new IllegalArgumentException("EndDegree can't be Negative".toString());
            }
            if (!(i10 < i11)) {
                throw new IllegalArgumentException("EndDegree must be bigger than StartDegree !".toString());
            }
            if (!(i11 - i10 <= 360)) {
                throw new IllegalArgumentException("(EndDegree - StartDegree) must be smaller than 360 !".toString());
            }
            a aVar = this.B0;
            if (i10 >= aVar.f5243s) {
                if (i11 > aVar.f5244t) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                StringBuilder c10 = androidx.activity.result.a.c("EndDegree must be smaller than ");
                c10.append(getSpeedometerMode().f5244t);
                c10.append(" in ");
                c10.append(getSpeedometerMode());
                c10.append(" Mode !");
                throw new IllegalArgumentException(c10.toString().toString());
            }
            StringBuilder c11 = androidx.activity.result.a.c("StartDegree must be bigger than ");
            c11.append(getSpeedometerMode().f5243s);
            c11.append(" in ");
            c11.append(getSpeedometerMode());
            c11.append(" Mode !");
            throw new IllegalArgumentException(c11.toString().toString());
        }
        throw new IllegalArgumentException("StartDegree can't be Negative".toString());
    }

    public abstract void s();

    public final void setBackgroundCircleColor(int i10) {
        this.f5238w0 = i10;
        this.f5231p0.setColor(i10);
        l();
    }

    public final void setEndDegree(int i10) {
        v(this.x0, i10);
    }

    public void setIndicator(a.b bVar) {
        k2.a<?> aVar;
        e9.f.e(bVar, "indicator");
        a.C0084a c0084a = k2.a.f5573f;
        Context context = getContext();
        e9.f.d(context, "context");
        switch (bVar.ordinal()) {
            case 0:
                aVar = new e(context);
                break;
            case 1:
                aVar = new k2.f(context);
                break;
            case 2:
                aVar = new g(context);
                break;
            case 3:
                aVar = new i(context);
                break;
            case 4:
                aVar = new h(context);
                break;
            case 5:
                aVar = new c(context, 1.0f);
                break;
            case 6:
                aVar = new c(context, 0.5f);
                break;
            case 7:
                aVar = new c(context, 0.25f);
                break;
            case 8:
                aVar = new k2.b(context);
                break;
            case 9:
                aVar = new d(context);
                break;
            default:
                throw new v8.c();
        }
        aVar.h(this);
        setIndicator(aVar);
    }

    public final void setIndicator(k2.a<?> aVar) {
        e9.f.e(aVar, "indicator");
        this.f5227l0.deleteObservers();
        aVar.h(this);
        this.f5227l0 = aVar;
        if (isAttachedToWindow()) {
            this.f5227l0.h(this);
            invalidate();
        }
    }

    public final void setIndicatorLightColor(int i10) {
        this.f5230o0 = i10;
    }

    public final void setInitTickPadding(float f10) {
        this.F0 = f10;
    }

    public final void setMarkColor(int i10) {
        this.f5233r0.setColor(i10);
    }

    public final void setMarkHeight(float f10) {
        this.f5237v0 = f10;
        l();
    }

    public final void setMarkStyle(b bVar) {
        Paint paint;
        Paint.Cap cap;
        e9.f.e(bVar, "markStyle");
        if (bVar == b.ROUND) {
            paint = this.f5233r0;
            cap = Paint.Cap.ROUND;
        } else {
            paint = this.f5233r0;
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        l();
    }

    public final void setMarkWidth(float f10) {
        this.f5233r0.setStrokeWidth(f10);
        l();
    }

    public final void setMarksNumber(int i10) {
        this.f5235t0 = i10;
        l();
    }

    public final void setMarksPadding(float f10) {
        this.f5236u0 = f10;
        l();
    }

    public final void setOnPrintTickLabel(p<? super Integer, ? super Float, ? extends CharSequence> pVar) {
        this.H0 = pVar;
        l();
    }

    public final void setSpeedometerMode(a aVar) {
        e9.f.e(aVar, "speedometerMode");
        this.B0 = aVar;
        if (aVar != a.NORMAL) {
            this.x0 = aVar.f5243s;
            this.f5239y0 = aVar.f5244t;
        }
        w();
        c();
        this.f5240z0 = t(getSpeed());
        this.f5227l0.j();
        if (isAttachedToWindow()) {
            requestLayout();
            l();
            o();
        }
    }

    @Override // i2.c
    public void setSpeedometerWidth(float f10) {
        super.setSpeedometerWidth(f10);
        if (isAttachedToWindow()) {
            this.f5227l0.j();
        }
    }

    public final void setStartDegree(int i10) {
        v(i10, this.f5239y0);
    }

    public final void setTickNumber(int i10) {
        int i11 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = new ArrayList();
            float f10 = i10 == 1 ? 0.0f : 1.0f / (i10 - 1);
            if (i10 > 0) {
                while (true) {
                    int i12 = i11 + 1;
                    arrayList.add(Float.valueOf(i11 * f10));
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            setTicks(arrayList);
            return;
        }
        throw new IllegalArgumentException("tickNumber mustn't be negative".toString());
    }

    public final void setTickPadding(float f10) {
        this.G0 = f10;
        l();
    }

    public final void setTickRotation(boolean z10) {
        this.E0 = z10;
        l();
    }

    public final void setTicks(List<Float> list) {
        boolean z10;
        e9.f.e(list, "ticks");
        this.D0 = list;
        for (Float f10 : list) {
            float floatValue = f10.floatValue();
            if (floatValue < 0.0f || floatValue > 1.0f) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (!z10) {
                throw new IllegalArgumentException("ticks must be between [0f, 1f] !!".toString());
            }
        }
        l();
    }

    public final void setWithIndicatorLight(boolean z10) {
        this.f5229n0 = z10;
    }

    public final float t(float f10) {
        return (((f10 - getMinSpeed()) * (this.f5239y0 - this.x0)) / (getMaxSpeed() - getMinSpeed())) + this.x0;
    }

    public final float u(float f10) {
        return getMinSpeed() + (((getMaxSpeed() - getMinSpeed()) * (f10 - this.x0)) / (this.f5239y0 - this.x0));
    }

    public final void v(int i10, int i11) {
        this.x0 = i10;
        this.f5239y0 = i11;
        r();
        c();
        this.f5240z0 = t(getSpeed());
        if (isAttachedToWindow()) {
            l();
            o();
        }
    }

    public final void w() {
        a aVar = a.BOTTOM_RIGHT;
        a aVar2 = this.B0;
        Objects.requireNonNull(aVar2);
        boolean z10 = false;
        float f10 = 0.0f;
        setTranslatedDx(aVar2 == a.RIGHT || aVar2 == a.TOP_RIGHT || aVar2 == aVar ? ((-getSize()) * 0.5f) + this.C0 : 0.0f);
        a aVar3 = this.B0;
        Objects.requireNonNull(aVar3);
        if (aVar3 == a.BOTTOM || aVar3 == a.BOTTOM_LEFT || aVar3 == aVar) {
            z10 = true;
        }
        if (z10) {
            f10 = ((-getSize()) * 0.5f) + this.C0;
        }
        setTranslatedDy(f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p<? super Integer, ? super Float, ? extends CharSequence> hVar;
        e9.f.e(context, "context");
        this.f5227l0 = new e(context);
        this.f5228m0 = new PointF(0.5f, 0.5f);
        this.f5230o0 = -1140893918;
        Paint paint = new Paint(1);
        this.f5231p0 = paint;
        Paint paint2 = new Paint(1);
        this.f5232q0 = paint2;
        Paint paint3 = new Paint(1);
        this.f5233r0 = paint3;
        this.f5234s0 = new Path();
        this.f5237v0 = j(9.0f);
        this.f5238w0 = -1;
        this.x0 = 135;
        this.f5239y0 = 405;
        this.f5240z0 = 135;
        this.A0 = new ArrayList<>();
        this.B0 = a.NORMAL;
        this.D0 = w8.g.f19940s;
        this.E0 = true;
        this.G0 = j(3.0f) + getSpeedometerWidth();
        paint2.setStyle(Paint.Style.STROKE);
        paint3.setStyle(Paint.Style.STROKE);
        setMarkColor(-1);
        setMarkWidth(j(3.0f));
        setMarkStyle(b.BUTT);
        s();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d0.b.y, 0, 0);
            e9.f.d(obtainStyledAttributes, "context.theme.obtainStyl…leable.Speedometer, 0, 0)");
            int i11 = obtainStyledAttributes.getInt(13, -1);
            if (i11 != -1 && i11 != 0) {
                setSpeedometerMode(a.values()[i11]);
            }
            int i12 = obtainStyledAttributes.getInt(3, -1);
            if (i12 != -1) {
                setIndicator(a.b.values()[i12]);
            }
            setMarksNumber(obtainStyledAttributes.getInt(11, this.f5235t0));
            setMarksPadding(obtainStyledAttributes.getDimension(12, this.f5236u0));
            setMarkHeight(obtainStyledAttributes.getDimension(8, this.f5237v0));
            setMarkWidth(obtainStyledAttributes.getDimension(10, getMarkWidth()));
            setMarkColor(obtainStyledAttributes.getColor(7, getMarkColor()));
            int i13 = obtainStyledAttributes.getInt(9, -1);
            if (i13 != -1) {
                setMarkStyle(b.values()[i13]);
            }
            setBackgroundCircleColor(obtainStyledAttributes.getColor(0, this.f5238w0));
            this.x0 = obtainStyledAttributes.getInt(14, this.x0);
            this.f5239y0 = obtainStyledAttributes.getInt(2, this.f5239y0);
            k2.a<?> aVar = this.f5227l0;
            aVar.i(obtainStyledAttributes.getDimension(6, aVar.f5577d));
            this.C0 = (int) obtainStyledAttributes.getDimension(1, this.C0);
            setTickNumber(obtainStyledAttributes.getInteger(15, this.D0.size()));
            this.E0 = obtainStyledAttributes.getBoolean(17, this.E0);
            setTickPadding(obtainStyledAttributes.getDimension(16, this.G0));
            k2.a<?> aVar2 = this.f5227l0;
            aVar2.g(obtainStyledAttributes.getColor(4, aVar2.f5578e));
            this.f5229n0 = obtainStyledAttributes.getBoolean(19, this.f5229n0);
            this.f5230o0 = obtainStyledAttributes.getColor(5, this.f5230o0);
            int i14 = obtainStyledAttributes.getInt(18, -1);
            if (i14 != 0) {
                hVar = i14 == 1 ? new h(this) : hVar;
                this.f5240z0 = this.x0;
                obtainStyledAttributes.recycle();
                r();
            } else {
                hVar = new g(this);
            }
            setOnPrintTickLabel(hVar);
            this.f5240z0 = this.x0;
            obtainStyledAttributes.recycle();
            r();
        }
        paint.setColor(this.f5238w0);
    }
}
