package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import e9.f;

/* loaded from: classes.dex */
public final class b extends a<b> {

    /* renamed from: g */
    public final Path f5580g = new Path();

    /* renamed from: h */
    public float f5581h;

    public b(Context context) {
        super(context);
        i(this.f5575b * 12.0f);
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawPath(this.f5580g, this.f5574a);
    }

    @Override // k2.a
    public final float b() {
        return this.f5581h;
    }

    @Override // k2.a
    public final void j() {
        this.f5580g.reset();
        Path path = this.f5580g;
        float c10 = c();
        i2.f fVar = this.f5576c;
        f.c(fVar);
        path.moveTo(c10, fVar.getPadding());
        i2.f fVar2 = this.f5576c;
        f.c(fVar2);
        this.f5581h = (f() * 0.5f) + fVar2.getPadding();
        this.f5580g.lineTo(c() - this.f5577d, this.f5581h);
        this.f5580g.lineTo(c(), this.f5581h + this.f5577d);
        this.f5580g.lineTo(c() + this.f5577d, this.f5581h);
        this.f5574a.setColor(this.f5578e);
    }
}
