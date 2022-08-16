package com.github.anastr.speedviewlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import d0.b;
import i2.c;
import i2.f;
import j2.a;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class SpeedView extends f {
    public final Paint J0;
    public final Paint K0;
    public final RectF L0 = new RectF();
    public float M0 = j(20.0f);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e9.f.e(context, "context");
        Paint paint = new Paint(1);
        this.J0 = paint;
        Paint paint2 = new Paint(1);
        this.K0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(-12303292);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.f3685x, 0, 0);
        e9.f.d(obtainStyledAttributes, "context.theme.obtainStyl…tyleable.SpeedView, 0, 0)");
        paint.setColor(obtainStyledAttributes.getColor(0, paint.getColor()));
        setCenterCircleRadius(obtainStyledAttributes.getDimension(1, this.M0));
        int i10 = obtainStyledAttributes.getInt(2, -1);
        if (i10 != -1) {
            for (a aVar : getSections()) {
                j2.b bVar = j2.b.values()[i10];
                Objects.requireNonNull(aVar);
                e9.f.e(bVar, "value");
                aVar.y = bVar;
                c cVar = aVar.f5439s;
                if (cVar != null) {
                    cVar.l();
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int getCenterCircleColor() {
        return this.J0.getColor();
    }

    public final float getCenterCircleRadius() {
        return this.M0;
    }

    @Override // i2.c
    public final void i() {
    }

    @Override // i2.f, i2.c, android.view.View
    public final void onDraw(Canvas canvas) {
        e9.f.e(canvas, "canvas");
        super.onDraw(canvas);
        k(canvas);
        canvas.save();
        canvas.translate((getFulcrumX() - 0.5f) * getSize(), (getFulcrumY() - 0.5f) * getSize());
        canvas.rotate(this.f5240z0 + 90.0f, getSize() * 0.5f, getSize() * 0.5f);
        if (this.f5229n0) {
            float abs = Math.abs(getPercentSpeed() - this.I0) * 30.0f;
            this.I0 = getPercentSpeed();
            float f10 = abs > 30.0f ? 30.0f : abs;
            this.f5232q0.setShader(new SweepGradient(getSize() * 0.5f, getSize() * 0.5f, new int[]{this.f5230o0, 16777215}, new float[]{0.0f, f10 / 360.0f}));
            Paint paint = this.f5232q0;
            k2.a<?> aVar = this.f5227l0;
            paint.setStrokeWidth((aVar.d() > aVar.b() ? aVar.b() : aVar.d()) - this.f5227l0.e());
            float strokeWidth = (this.f5232q0.getStrokeWidth() * 0.5f) + this.f5227l0.e();
            RectF rectF = new RectF(strokeWidth, strokeWidth, getSize() - strokeWidth, getSize() - strokeWidth);
            canvas.save();
            canvas.rotate(-90.0f, getSize() * 0.5f, getSize() * 0.5f);
            if (this.D) {
                canvas.scale(1.0f, -1.0f, getSize() * 0.5f, getSize() * 0.5f);
            }
            canvas.drawArc(rectF, 0.0f, f10, false, this.f5232q0);
            canvas.restore();
        }
        this.f5227l0.a(canvas);
        canvas.restore();
        canvas.drawCircle(getSize() * 0.5f, getSize() * 0.5f, this.M0, this.J0);
        Iterator<l2.a<?>> it = this.A0.iterator();
        if (!it.hasNext()) {
            return;
        }
        Objects.requireNonNull(it.next());
        throw null;
    }

    @Override // i2.f, i2.c, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0372  */
    @Override // i2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.anastr.speedviewlib.SpeedView.p():void");
    }

    @Override // i2.f
    public final void s() {
        Context context = getContext();
        e9.f.d(context, "context");
        setIndicator(new k2.f(context));
        super.setBackgroundCircleColor(0);
        super.setMarksNumber(8);
    }

    public final void setCenterCircleColor(int i10) {
        this.J0.setColor(i10);
        if (isAttachedToWindow()) {
            invalidate();
        }
    }

    public final void setCenterCircleRadius(float f10) {
        this.M0 = f10;
        if (isAttachedToWindow()) {
            invalidate();
        }
    }
}
