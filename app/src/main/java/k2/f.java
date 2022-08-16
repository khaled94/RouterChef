package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class f extends a<f> {

    /* renamed from: g */
    public final Path f5588g = new Path();

    /* renamed from: h */
    public float f5589h;

    public f(Context context) {
        super(context);
        i(this.f5575b * 12.0f);
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        e9.f.e(canvas, "canvas");
        canvas.drawPath(this.f5588g, this.f5574a);
    }

    @Override // k2.a
    public final float b() {
        return this.f5589h;
    }

    @Override // k2.a
    public final void j() {
        this.f5588g.reset();
        Path path = this.f5588g;
        float c10 = c();
        i2.f fVar = this.f5576c;
        e9.f.c(fVar);
        path.moveTo(c10, fVar.getPadding());
        i2.f fVar2 = this.f5576c;
        e9.f.c(fVar2);
        this.f5589h = ((f() * 2.0f) / 3.0f) + fVar2.getPadding();
        this.f5588g.lineTo(c() - this.f5577d, this.f5589h);
        this.f5588g.lineTo(c() + this.f5577d, this.f5589h);
        float c11 = c();
        float f10 = this.f5577d;
        float f11 = c11 - f10;
        float f12 = this.f5589h - f10;
        float c12 = c();
        float f13 = this.f5577d;
        this.f5588g.addArc(new RectF(f11, f12, c12 + f13, this.f5589h + f13), 0.0f, 180.0f);
        this.f5574a.setColor(this.f5578e);
    }
}
