package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import e9.f;

/* loaded from: classes.dex */
public final class h extends a<h> {

    /* renamed from: g */
    public final Path f5592g = new Path();

    public h(Context context) {
        super(context);
        i(this.f5575b * 16.0f);
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawPath(this.f5592g, this.f5574a);
    }

    @Override // k2.a
    public final float e() {
        i2.f fVar = this.f5576c;
        f.c(fVar);
        return (f() * 0.18f) + fVar.getPadding();
    }

    @Override // k2.a
    public final void j() {
        this.f5592g.reset();
        this.f5592g.moveTo(c(), d());
        Path path = this.f5592g;
        float c10 = c() - this.f5577d;
        i2.f fVar = this.f5576c;
        f.c(fVar);
        float f10 = (f() * 0.34f) + fVar.getPadding();
        float c11 = c();
        i2.f fVar2 = this.f5576c;
        f.c(fVar2);
        path.quadTo(c10, f10, c11, (f() * 0.18f) + fVar2.getPadding());
        i2.f fVar3 = this.f5576c;
        f.c(fVar3);
        this.f5592g.quadTo(c() + this.f5577d, (f() * 0.34f) + fVar3.getPadding(), c(), d());
        this.f5574a.setColor(this.f5578e);
    }
}
