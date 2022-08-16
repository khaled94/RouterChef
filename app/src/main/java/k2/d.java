package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import e9.f;

/* loaded from: classes.dex */
public final class d extends a<d> {

    /* renamed from: g */
    public final Path f5584g = new Path();

    /* renamed from: h */
    public final Path f5585h = new Path();

    /* renamed from: i */
    public final Paint f5586i;

    /* renamed from: j */
    public float f5587j;

    public d(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5586i = paint;
        i(this.f5575b * 12.0f);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawPath(this.f5584g, this.f5574a);
        canvas.drawPath(this.f5585h, this.f5586i);
    }

    @Override // k2.a
    public final float b() {
        return this.f5587j;
    }

    @Override // k2.a
    public final void j() {
        this.f5584g.reset();
        this.f5585h.reset();
        Path path = this.f5584g;
        float c10 = c();
        i2.f fVar = this.f5576c;
        f.c(fVar);
        path.moveTo(c10, fVar.getPadding());
        double sin = Math.sin(Math.toRadians(260.0d));
        float f10 = (f() * 0.5f) + ((float) (sin * this.f5577d));
        i2.f fVar2 = this.f5576c;
        f.c(fVar2);
        this.f5587j = f10 + fVar2.getPadding();
        double cos = Math.cos(Math.toRadians(260.0d));
        float f11 = (f() * 0.5f) + ((float) (cos * this.f5577d));
        i2.f fVar3 = this.f5576c;
        f.c(fVar3);
        this.f5584g.lineTo(f11 + fVar3.getPadding(), this.f5587j);
        this.f5584g.arcTo(new RectF(c() - this.f5577d, d() - this.f5577d, c() + this.f5577d, d() + this.f5577d), 260.0f, 20.0f);
        float f12 = this.f5577d * 0.25f;
        this.f5585h.addCircle(c(), d(), (this.f5577d - (0.5f * f12)) + 0.6f, Path.Direction.CW);
        this.f5574a.setColor(this.f5578e);
        this.f5586i.setColor(this.f5578e);
        this.f5586i.setStrokeWidth(f12);
    }
}
