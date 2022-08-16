package i2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import d9.l;
import d9.p;
import d9.q;
import e9.f;
import e9.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import v8.h;
import w8.e;

/* loaded from: classes.dex */
public abstract class c extends View implements Observer {
    public float A;
    public int B;
    public boolean D;
    public ValueAnimator G;
    public ValueAnimator H;
    public boolean I;
    public q<? super c, ? super Boolean, ? super Boolean, h> J;
    public p<? super j2.a, ? super j2.a, h> K;
    public Bitmap M;
    public int O;
    public int P;
    public int Q;
    public final List<j2.a> R;
    public j2.a S;
    public boolean U;
    public boolean V;
    public float W;

    /* renamed from: a0 */
    public float f5198a0;

    /* renamed from: b0 */
    public Locale f5199b0;

    /* renamed from: h0 */
    public boolean f5205h0;

    /* renamed from: i0 */
    public Bitmap f5206i0;

    /* renamed from: j0 */
    public Canvas f5207j0;

    /* renamed from: u */
    public final TextPaint f5211u;

    /* renamed from: v */
    public final TextPaint f5212v;
    public float y;

    /* renamed from: s */
    public final Paint f5209s = new Paint(1);

    /* renamed from: t */
    public TextPaint f5210t = new TextPaint(1);

    /* renamed from: w */
    public String f5213w = "Km/h";

    /* renamed from: x */
    public boolean f5214x = true;

    /* renamed from: z */
    public float f5215z = 100.0f;
    public float C = getMinSpeed();
    public float E = 4.0f;
    public int F = 1000;
    public final b L = new b();
    public final Paint N = new Paint(1);
    public float T = j(30.0f);

    /* renamed from: c0 */
    public float f5200c0 = 0.1f;

    /* renamed from: d0 */
    public float f5201d0 = 0.1f;

    /* renamed from: e0 */
    public a f5202e0 = a.BOTTOM_CENTER;

    /* renamed from: f0 */
    public float f5203f0 = j(1.0f);

    /* renamed from: g0 */
    public float f5204g0 = j(20.0f);

    /* renamed from: k0 */
    public l<? super Float, ? extends CharSequence> f5208k0 = new C0074c();

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        TOP_LEFT(0.0f, 0.0f, 0.0f, 0.0f, 1, 1),
        /* JADX INFO: Fake field, exist only in values array */
        TOP_CENTER(0.5f, 0.0f, 0.5f, 0.0f, 0, 1),
        /* JADX INFO: Fake field, exist only in values array */
        TOP_RIGHT(1.0f, 0.0f, 1.0f, 0.0f, -1, 1),
        /* JADX INFO: Fake field, exist only in values array */
        LEFT(0.0f, 0.5f, 0.0f, 0.5f, 1, 0),
        /* JADX INFO: Fake field, exist only in values array */
        CENTER(0.5f, 0.5f, 0.5f, 0.5f, 0, 0),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT(1.0f, 0.5f, 1.0f, 0.5f, -1, 0),
        /* JADX INFO: Fake field, exist only in values array */
        BOTTOM_LEFT(0.0f, 1.0f, 0.0f, 1.0f, 1, -1),
        BOTTOM_CENTER(0.5f, 1.0f, 0.5f, 1.0f, 0, -1),
        /* JADX INFO: Fake field, exist only in values array */
        BOTTOM_RIGHT(1.0f, 1.0f, 1.0f, 1.0f, -1, -1);
        

        /* renamed from: s */
        public final float f5217s;

        /* renamed from: t */
        public final float f5218t;

        /* renamed from: u */
        public final float f5219u;

        /* renamed from: v */
        public final float f5220v;

        /* renamed from: w */
        public final int f5221w;

        /* renamed from: x */
        public final int f5222x;

        a(float f10, float f11, float f12, float f13, int i10, int i11) {
            this.f5217s = f10;
            this.f5218t = f11;
            this.f5219u = f12;
            this.f5220v = f13;
            this.f5221w = i10;
            this.f5222x = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
            c.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f.e(animator, "animation");
            c cVar = c.this;
            if (!cVar.I) {
                cVar.o();
            }
        }
    }

    /* renamed from: i2.c$c */
    /* loaded from: classes.dex */
    public static final class C0074c extends g implements l<Float, String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0074c() {
            super(1);
            c.this = r1;
        }

        @Override // d9.l
        public final String c(Float f10) {
            String format = String.format(c.this.getLocale(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue())}, 1));
            f.d(format, "java.lang.String.format(locale, this, *args)");
            return format;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l<? super Float, ? extends CharSequence> eVar;
        f.e(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.f5211u = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f5212v = textPaint2;
        this.A = getMinSpeed();
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        f.d(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        this.M = createBitmap;
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        Locale locale = Locale.getDefault();
        f.d(locale, "getDefault()");
        this.f5199b0 = locale;
        Bitmap createBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        f.d(createBitmap2, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        this.f5206i0 = createBitmap2;
        this.f5210t.setColor(-16777216);
        this.f5210t.setTextSize(j(10.0f));
        this.f5210t.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(-16777216);
        textPaint.setTextSize(j(18.0f));
        textPaint2.setColor(-16777216);
        textPaint2.setTextSize(j(15.0f));
        j2.a aVar = new j2.a(0.0f, 0.6f, -16711936, getSpeedometerWidth());
        aVar.a(this);
        arrayList.add(aVar);
        j2.a aVar2 = new j2.a(0.6f, 0.87f, -256, getSpeedometerWidth());
        aVar2.a(this);
        arrayList.add(aVar2);
        j2.a aVar3 = new j2.a(0.87f, 1.0f, -65536, getSpeedometerWidth());
        aVar3.a(this);
        arrayList.add(aVar3);
        i();
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d0.b.f3684w, 0, 0);
        f.d(obtainStyledAttributes, "context.theme.obtainStyl… R.styleable.Gauge, 0, 0)");
        setMaxSpeed(obtainStyledAttributes.getFloat(2, getMaxSpeed()));
        setMinSpeed(obtainStyledAttributes.getFloat(3, getMinSpeed()));
        this.A = getMinSpeed();
        setCurrentSpeed(getMinSpeed());
        setSpeedometerWidth(obtainStyledAttributes.getDimension(10, getSpeedometerWidth()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j2.a aVar4 = (j2.a) it.next();
            aVar4.f5440t = getSpeedometerWidth();
            c cVar = aVar4.f5439s;
            if (cVar != null) {
                cVar.l();
            }
        }
        setWithTremble(obtainStyledAttributes.getBoolean(22, this.f5214x));
        TextPaint textPaint3 = this.f5210t;
        textPaint3.setColor(obtainStyledAttributes.getColor(11, textPaint3.getColor()));
        TextPaint textPaint4 = this.f5210t;
        textPaint4.setTextSize(obtainStyledAttributes.getDimension(13, textPaint4.getTextSize()));
        TextPaint textPaint5 = this.f5211u;
        textPaint5.setColor(obtainStyledAttributes.getColor(4, textPaint5.getColor()));
        TextPaint textPaint6 = this.f5211u;
        textPaint6.setTextSize(obtainStyledAttributes.getDimension(8, textPaint6.getTextSize()));
        TextPaint textPaint7 = this.f5212v;
        textPaint7.setColor(obtainStyledAttributes.getColor(19, textPaint7.getColor()));
        TextPaint textPaint8 = this.f5212v;
        textPaint8.setTextSize(obtainStyledAttributes.getDimension(20, textPaint8.getTextSize()));
        String string = obtainStyledAttributes.getString(17);
        setUnit(string == null ? this.f5213w : string);
        setTrembleDegree(obtainStyledAttributes.getFloat(15, this.E));
        setTrembleDuration(obtainStyledAttributes.getInt(16, this.F));
        setSpeedometerTextRightToLeft(obtainStyledAttributes.getBoolean(12, this.U));
        setAccelerate(obtainStyledAttributes.getFloat(0, this.f5200c0));
        setDecelerate(obtainStyledAttributes.getFloat(1, this.f5201d0));
        setUnitUnderSpeedText(obtainStyledAttributes.getBoolean(21, this.f5205h0));
        setUnitSpeedInterval(obtainStyledAttributes.getDimension(18, this.f5203f0));
        setSpeedTextPadding(obtainStyledAttributes.getDimension(6, this.f5204g0));
        String string2 = obtainStyledAttributes.getString(9);
        if (string2 != null && !isInEditMode()) {
            setSpeedTextTypeface(Typeface.createFromAsset(context.getAssets(), string2));
        }
        String string3 = obtainStyledAttributes.getString(14);
        if (string3 != null && !isInEditMode()) {
            setTextTypeface(Typeface.createFromAsset(context.getAssets(), string3));
        }
        int i11 = obtainStyledAttributes.getInt(7, -1);
        if (i11 != -1) {
            setSpeedTextPosition(a.values()[i11]);
        }
        int i12 = obtainStyledAttributes.getInt(5, -1);
        if (i12 != 0) {
            eVar = i12 == 1 ? new e(this) : eVar;
            obtainStyledAttributes.recycle();
            e();
            f();
            h();
        }
        eVar = new d(this);
        setSpeedTextListener(eVar);
        obtainStyledAttributes.recycle();
        e();
        f();
        h();
    }

    public static void a(c cVar, ValueAnimator valueAnimator) {
        f.e(cVar, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cVar.D = ((Float) animatedValue).floatValue() > cVar.getCurrentSpeed();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        cVar.setCurrentSpeed(((Float) animatedValue2).floatValue());
        cVar.postInvalidate();
    }

    public static void b(c cVar, ValueAnimator valueAnimator) {
        f.e(cVar, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cVar.setCurrentSpeed(((Float) animatedValue).floatValue());
        cVar.postInvalidate();
    }

    private final float getSpeedUnitTextHeight() {
        if (this.f5205h0) {
            return this.f5212v.getTextSize() + this.f5211u.getTextSize() + this.f5203f0;
        }
        return Math.max(this.f5211u.getTextSize(), this.f5212v.getTextSize());
    }

    private final float getSpeedUnitTextWidth() {
        if (this.f5205h0) {
            return Math.max(this.f5211u.measureText(getSpeedText().toString()), this.f5212v.measureText(this.f5213w));
        }
        return this.f5203f0 + this.f5212v.measureText(this.f5213w) + this.f5211u.measureText(getSpeedText().toString());
    }

    private final void setCurrentSpeed(float f10) {
        this.C = f10;
        int i10 = (int) f10;
        if (i10 != this.B && this.J != null) {
            ValueAnimator valueAnimator = this.H;
            boolean z10 = false;
            int i11 = 1;
            if (valueAnimator != null) {
                valueAnimator.isRunning();
            }
            if (i10 > this.B) {
                z10 = true;
            }
            if (!z10) {
                i11 = -1;
            }
            while (true) {
                int i12 = this.B;
                if (i12 == i10) {
                    break;
                }
                this.B = i12 + i11;
                q<? super c, ? super Boolean, ? super Boolean, h> qVar = this.J;
                f.c(qVar);
                qVar.a();
            }
        }
        this.B = i10;
        g();
    }

    private final void setSpeedTextPadding(float f10) {
        this.f5204g0 = f10;
        if (this.V) {
            invalidate();
        }
    }

    private final void setUnitSpeedInterval(float f10) {
        this.f5203f0 = f10;
        l();
    }

    public final void c() {
        this.I = true;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        d();
    }

    public final void d() {
        this.I = true;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.I = false;
        this.H = null;
    }

    public final void e() {
        float f10 = this.f5200c0;
        if (f10 <= 1.0f && f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException("accelerate must be between (0, 1]".toString());
    }

    public final void f() {
        float f10 = this.f5201d0;
        if (f10 <= 1.0f && f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException("decelerate must be between (0, 1]".toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<j2.a>, java.util.ArrayList] */
    public final void g() {
        j2.a aVar;
        Iterator it = this.R.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (j2.a) it.next();
            if (getMinSpeed() + ((getMaxSpeed() - getMinSpeed()) * aVar.f5442v) <= getCurrentSpeed()) {
                if (getMinSpeed() + ((getMaxSpeed() - getMinSpeed()) * aVar.f5443w) >= getCurrentSpeed()) {
                    break;
                }
            }
        }
        j2.a aVar2 = this.S;
        if (aVar2 != aVar) {
            p<? super j2.a, ? super j2.a, h> pVar = this.K;
            if (pVar != null) {
                pVar.b(aVar2, aVar);
            }
            this.S = aVar;
        }
    }

    public final float getAccelerate() {
        return this.f5200c0;
    }

    public final Bitmap getBackgroundBitmap() {
        return this.M;
    }

    public final int getCurrentIntSpeed() {
        return this.B;
    }

    public final j2.a getCurrentSection() {
        return this.S;
    }

    public final float getCurrentSpeed() {
        return this.C;
    }

    public final float getDecelerate() {
        return this.f5201d0;
    }

    public final int getHeightPa() {
        return this.Q;
    }

    public final Locale getLocale() {
        return this.f5199b0;
    }

    public final float getMaxSpeed() {
        return this.f5215z;
    }

    public final float getMinSpeed() {
        return this.y;
    }

    public final float getOffsetSpeed() {
        return (this.C - getMinSpeed()) / (getMaxSpeed() - getMinSpeed());
    }

    public final p<j2.a, j2.a, h> getOnSectionChangeListener() {
        return this.K;
    }

    public final q<c, Boolean, Boolean, h> getOnSpeedChangeListener() {
        return this.J;
    }

    public final int getPadding() {
        return this.O;
    }

    public final float getPercentSpeed() {
        return ((this.C - getMinSpeed()) * 100.0f) / (getMaxSpeed() - getMinSpeed());
    }

    public final List<j2.a> getSections() {
        return this.R;
    }

    public final float getSpeed() {
        return this.A;
    }

    public final CharSequence getSpeedText() {
        return this.f5208k0.c(Float.valueOf(this.C));
    }

    public final int getSpeedTextColor() {
        return this.f5211u.getColor();
    }

    public final l<Float, CharSequence> getSpeedTextListener() {
        return this.f5208k0;
    }

    public final a getSpeedTextPosition() {
        return this.f5202e0;
    }

    public final float getSpeedTextSize() {
        return this.f5211u.getTextSize();
    }

    public final Typeface getSpeedTextTypeface() {
        return this.f5211u.getTypeface();
    }

    public final RectF getSpeedUnitTextBounds() {
        float f10 = ((this.P * this.f5202e0.f5217s) - this.W) + this.O;
        float speedUnitTextWidth = getSpeedUnitTextWidth();
        a aVar = this.f5202e0;
        float f11 = (this.f5204g0 * aVar.f5221w) + (f10 - (speedUnitTextWidth * aVar.f5219u));
        float f12 = ((this.Q * aVar.f5218t) - this.f5198a0) + this.O;
        float speedUnitTextHeight = getSpeedUnitTextHeight();
        a aVar2 = this.f5202e0;
        float f13 = (this.f5204g0 * aVar2.f5222x) + (f12 - (speedUnitTextHeight * aVar2.f5220v));
        return new RectF(f11, f13, getSpeedUnitTextWidth() + f11, getSpeedUnitTextHeight() + f13);
    }

    public final boolean getSpeedometerTextRightToLeft() {
        return this.U;
    }

    public float getSpeedometerWidth() {
        return this.T;
    }

    public final int getTextColor() {
        return this.f5210t.getColor();
    }

    public final TextPaint getTextPaint() {
        return this.f5210t;
    }

    public final float getTextSize() {
        return this.f5210t.getTextSize();
    }

    public final Typeface getTextTypeface() {
        return this.f5210t.getTypeface();
    }

    public final float getTranslatedDx() {
        return this.W;
    }

    public final float getTranslatedDy() {
        return this.f5198a0;
    }

    public final float getTrembleDegree() {
        return this.E;
    }

    public final int getTrembleDuration() {
        return this.F;
    }

    public final String getUnit() {
        return this.f5213w;
    }

    public final int getUnitTextColor() {
        return this.f5212v.getColor();
    }

    public final float getUnitTextSize() {
        return this.f5212v.getTextSize();
    }

    public final boolean getUnitUnderSpeedText() {
        return this.f5205h0;
    }

    public final int getViewSize() {
        return Math.max(getWidth(), getHeight());
    }

    public final int getViewSizePa() {
        return Math.max(this.P, this.Q);
    }

    public final int getWidthPa() {
        return this.P;
    }

    public final boolean getWithTremble() {
        return this.f5214x;
    }

    public final void h() {
        boolean z10 = true;
        if (this.E >= 0.0f) {
            if (this.F < 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("trembleDuration  can't be Negative".toString());
            }
            return;
        }
        throw new IllegalArgumentException("trembleDegree  can't be Negative".toString());
    }

    public abstract void i();

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.V;
    }

    public final float j(float f10) {
        return f10 * getContext().getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ValueAnimator valueAnimator = this.H;
        boolean z10 = false;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            z10 = true;
        }
        if (z10) {
            d();
        }
    }

    public final void k(Canvas canvas) {
        float f10;
        float f11;
        f.e(canvas, "canvas");
        RectF speedUnitTextBounds = getSpeedUnitTextBounds();
        String obj = getSpeedText().toString();
        this.f5206i0.eraseColor(0);
        if (this.f5205h0) {
            Canvas canvas2 = this.f5207j0;
            if (canvas2 != null) {
                canvas2.drawText(obj, this.f5206i0.getWidth() * 0.5f, (this.f5206i0.getHeight() * 0.5f) - (this.f5203f0 * 0.5f), this.f5211u);
            }
            Canvas canvas3 = this.f5207j0;
            if (canvas3 != null) {
                canvas3.drawText(this.f5213w, this.f5206i0.getWidth() * 0.5f, (this.f5203f0 * 0.5f) + this.f5212v.getTextSize() + (this.f5206i0.getHeight() * 0.5f), this.f5212v);
            }
        } else {
            if (this.U) {
                f11 = (this.f5206i0.getWidth() * 0.5f) - (getSpeedUnitTextWidth() * 0.5f);
                f10 = this.f5212v.measureText(this.f5213w) + f11 + this.f5203f0;
            } else {
                f10 = (this.f5206i0.getWidth() * 0.5f) - (getSpeedUnitTextWidth() * 0.5f);
                f11 = this.f5211u.measureText(obj) + f10 + this.f5203f0;
            }
            float speedUnitTextHeight = (getSpeedUnitTextHeight() * 0.5f) + (this.f5206i0.getHeight() * 0.5f);
            Canvas canvas4 = this.f5207j0;
            if (canvas4 != null) {
                canvas4.drawText(obj, f10, speedUnitTextHeight, this.f5211u);
            }
            Canvas canvas5 = this.f5207j0;
            if (canvas5 != null) {
                canvas5.drawText(this.f5213w, f11, speedUnitTextHeight, this.f5212v);
            }
        }
        Bitmap bitmap = this.f5206i0;
        canvas.drawBitmap(bitmap, (speedUnitTextBounds.width() * 0.5f) + (speedUnitTextBounds.left - (bitmap.getWidth() * 0.5f)), (speedUnitTextBounds.height() * 0.5f) + (speedUnitTextBounds.top - (this.f5206i0.getHeight() * 0.5f)), this.f5209s);
    }

    public final void l() {
        if (this.V) {
            p();
            invalidate();
        }
    }

    public final void m(float f10, float f11) {
        if (f10 < f11) {
            c();
            this.y = f10;
            this.f5215z = f11;
            g();
            l();
            if (!this.V) {
                return;
            }
            setSpeedAt(this.A);
            return;
        }
        throw new IllegalArgumentException("minSpeed must be smaller than maxSpeed !!".toString());
    }

    public final void n(float f10, long j3) {
        if (f10 > getMaxSpeed()) {
            f10 = getMaxSpeed();
        } else if (f10 < getMinSpeed()) {
            f10 = getMinSpeed();
        }
        if (f10 == this.A) {
            return;
        }
        this.A = f10;
        this.D = f10 > this.C;
        c();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, f10);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(j3);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i2.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.b(c.this, valueAnimator);
            }
        });
        ofFloat.addListener(this.L);
        this.G = ofFloat;
        ofFloat.start();
    }

    public final void o() {
        float minSpeed;
        d();
        if (!this.f5214x) {
            return;
        }
        Random random = new Random();
        float nextFloat = random.nextFloat() * this.E * (random.nextBoolean() ? -1 : 1);
        if (this.A + nextFloat <= getMaxSpeed()) {
            if (this.A + nextFloat < getMinSpeed()) {
                minSpeed = getMinSpeed();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, this.A + nextFloat);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(getTrembleDuration());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i2.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.a(c.this, valueAnimator);
                }
            });
            ofFloat.addListener(this.L);
            this.H = ofFloat;
            ofFloat.start();
        }
        minSpeed = getMaxSpeed();
        nextFloat = minSpeed - this.A;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.C, this.A + nextFloat);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(getTrembleDuration());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i2.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.a(c.this, valueAnimator);
            }
        });
        ofFloat2.addListener(this.L);
        this.H = ofFloat2;
        ofFloat2.start();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = true;
        if (!isInEditMode()) {
            p();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        this.V = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.translate(this.W, this.f5198a0);
        canvas.drawBitmap(this.M, 0.0f, 0.0f, this.N);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int i15 = this.P;
        if (i15 > 0 && (i14 = this.Q) > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(i15, i14, Bitmap.Config.ARGB_8888);
            f.d(createBitmap, "createBitmap(widthPa, he… Bitmap.Config.ARGB_8888)");
            this.f5206i0 = createBitmap;
        }
        this.f5207j0 = new Canvas(this.f5206i0);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.isRunning();
    }

    public abstract void p();

    public final void q(int i10, int i11, int i12, int i13) {
        this.O = Math.max(Math.max(i10, i12), Math.max(i11, i13));
        this.P = getWidth() - (this.O * 2);
        this.Q = getHeight() - (this.O * 2);
    }

    public final void setAccelerate(float f10) {
        this.f5200c0 = f10;
        e();
    }

    public final void setBackgroundBitmap(Bitmap bitmap) {
        f.e(bitmap, "<set-?>");
        this.M = bitmap;
    }

    public final void setDecelerate(float f10) {
        this.f5201d0 = f10;
        f();
    }

    public final void setLocale(Locale locale) {
        f.e(locale, "locale");
        this.f5199b0 = locale;
        if (this.V) {
            invalidate();
        }
    }

    public final void setMaxSpeed(float f10) {
        m(getMinSpeed(), f10);
    }

    public final void setMinSpeed(float f10) {
        m(f10, getMaxSpeed());
    }

    public final void setOnSectionChangeListener(p<? super j2.a, ? super j2.a, h> pVar) {
        this.K = pVar;
    }

    public final void setOnSpeedChangeListener(q<? super c, ? super Boolean, ? super Boolean, h> qVar) {
        this.J = qVar;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        q(i10, i11, i12, i13);
        int i14 = this.O;
        super.setPadding(i14, i14, i14, i14);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        q(i10, i11, i12, i13);
        int i14 = this.O;
        super.setPaddingRelative(i14, i14, i14, i14);
    }

    public final void setSpeedAt(float f10) {
        if (f10 > getMaxSpeed()) {
            f10 = getMaxSpeed();
        } else if (f10 < getMinSpeed()) {
            f10 = getMinSpeed();
        }
        this.D = f10 > this.C;
        this.A = f10;
        setCurrentSpeed(f10);
        c();
        invalidate();
        o();
    }

    public final void setSpeedTextColor(int i10) {
        this.f5211u.setColor(i10);
        if (this.V) {
            invalidate();
        }
    }

    public final void setSpeedTextListener(l<? super Float, ? extends CharSequence> lVar) {
        f.e(lVar, "speedTextFormat");
        this.f5208k0 = lVar;
        l();
    }

    public final void setSpeedTextPosition(a aVar) {
        f.e(aVar, "speedTextPosition");
        this.f5202e0 = aVar;
        l();
    }

    public final void setSpeedTextSize(float f10) {
        this.f5211u.setTextSize(f10);
        if (this.V) {
            invalidate();
        }
    }

    public final void setSpeedTextTypeface(Typeface typeface) {
        this.f5211u.setTypeface(typeface);
        this.f5212v.setTypeface(typeface);
        l();
    }

    public final void setSpeedometerTextRightToLeft(boolean z10) {
        this.U = z10;
        l();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<j2.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<j2.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List<j2.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<j2.a>, java.util.ArrayList] */
    public void setSpeedometerWidth(float f10) {
        this.T = f10;
        ArrayList arrayList = new ArrayList(getSections());
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((j2.a) it.next()).f5439s = null;
        }
        this.R.clear();
        l();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j2.a aVar = (j2.a) it2.next();
            f.d(aVar, "it");
            aVar.f5440t = f10;
            c cVar = aVar.f5439s;
            if (cVar != null) {
                cVar.l();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            j2.a aVar2 = (j2.a) it3.next();
            ?? r12 = this.R;
            aVar2.a(this);
            r12.add(aVar2);
            int indexOf = this.R.indexOf(aVar2);
            boolean z10 = false;
            if (!(aVar2.f5442v < aVar2.f5443w)) {
                throw new IllegalArgumentException("endOffset must be bigger than startOffset".toString());
            }
            j2.a aVar3 = (j2.a) e.v(this.R, indexOf - 1);
            if (aVar3 != null) {
                float f11 = aVar3.f5443w;
                if (!(f11 <= aVar2.f5442v && f11 < aVar2.f5443w)) {
                    throw new IllegalArgumentException(("Section at index (" + indexOf + ") is conflicted with previous section").toString());
                }
            }
            j2.a aVar4 = (j2.a) e.v(this.R, indexOf + 1);
            if (aVar4 != null) {
                float f12 = aVar4.f5442v;
                if (f12 >= aVar2.f5443w && f12 > aVar2.f5442v) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Section at index (" + indexOf + ") is conflicted with next section").toString());
                }
            }
        }
        l();
        if (isAttachedToWindow()) {
            l();
        }
    }

    public final void setTextColor(int i10) {
        this.f5210t.setColor(i10);
        l();
    }

    public final void setTextPaint(TextPaint textPaint) {
        f.e(textPaint, "<set-?>");
        this.f5210t = textPaint;
    }

    public final void setTextSize(float f10) {
        this.f5210t.setTextSize(f10);
        if (this.V) {
            invalidate();
        }
    }

    public final void setTextTypeface(Typeface typeface) {
        this.f5210t.setTypeface(typeface);
        l();
    }

    public final void setTranslatedDx(float f10) {
        this.W = f10;
    }

    public final void setTranslatedDy(float f10) {
        this.f5198a0 = f10;
    }

    public final void setTrembleDegree(float f10) {
        this.E = f10;
        h();
    }

    public final void setTrembleDuration(int i10) {
        this.F = i10;
        h();
    }

    public final void setUnit(String str) {
        f.e(str, "unit");
        this.f5213w = str;
        if (this.V) {
            invalidate();
        }
    }

    public final void setUnitTextColor(int i10) {
        this.f5212v.setColor(i10);
        if (this.V) {
            invalidate();
        }
    }

    public final void setUnitTextSize(float f10) {
        this.f5212v.setTextSize(f10);
        l();
    }

    public final void setUnitUnderSpeedText(boolean z10) {
        TextPaint textPaint;
        Paint.Align align;
        this.f5205h0 = z10;
        if (z10) {
            this.f5211u.setTextAlign(Paint.Align.CENTER);
            textPaint = this.f5212v;
            align = Paint.Align.CENTER;
        } else {
            this.f5211u.setTextAlign(Paint.Align.LEFT);
            textPaint = this.f5212v;
            align = Paint.Align.LEFT;
        }
        textPaint.setTextAlign(align);
        l();
    }

    public final void setWithTremble(boolean z10) {
        this.f5214x = z10;
        o();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        l();
    }
}
