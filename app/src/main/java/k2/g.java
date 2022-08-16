package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import e9.f;

/* loaded from: classes.dex */
public final class g extends a<g> {

    /* renamed from: g */
    public final Path f5590g = new Path();

    /* renamed from: h */
    public float f5591h;

    public g(Context context) {
        super(context);
        i(this.f5575b * 12.0f);
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawPath(this.f5590g, this.f5574a);
    }

    @Override // k2.a
    public final float b() {
        return this.f5591h;
    }

    @Override // k2.a
    public final float e() {
        i2.f fVar = this.f5576c;
        f.c(fVar);
        return (f() / 5.0f) + fVar.getPadding();
    }

    @Override // k2.a
    public final void j() {
        this.f5590g.reset();
        Path path = this.f5590g;
        float c10 = c();
        i2.f fVar = this.f5576c;
        f.c(fVar);
        path.moveTo(c10, (f() / 5.0f) + fVar.getPadding());
        i2.f fVar2 = this.f5576c;
        f.c(fVar2);
        this.f5591h = ((f() * 3.0f) / 5.0f) + fVar2.getPadding();
        this.f5590g.lineTo(c() - this.f5577d, this.f5591h);
        this.f5590g.lineTo(c() + this.f5577d, this.f5591h);
        float c11 = c();
        float f10 = this.f5577d;
        float f11 = c11 - f10;
        float f12 = this.f5591h - f10;
        float c12 = c();
        float f13 = this.f5577d;
        this.f5590g.addArc(new RectF(f11, f12, c12 + f13, this.f5591h + f13), 0.0f, 180.0f);
        this.f5574a.setColor(this.f5578e);
    }
}
