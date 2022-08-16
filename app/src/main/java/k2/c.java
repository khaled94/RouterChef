package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import e9.f;

/* loaded from: classes.dex */
public final class c extends a<c> {

    /* renamed from: g */
    public final float f5582g;

    /* renamed from: h */
    public final Path f5583h = new Path();

    public c(Context context, float f10) {
        super(context);
        this.f5582g = f10;
        if (0.0f <= f10 && f10 <= 1.0f) {
            i(this.f5575b * 8.0f);
            return;
        }
        throw new IllegalArgumentException("Length must be between [0,1].".toString());
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawPath(this.f5583h, this.f5574a);
    }

    @Override // k2.a
    public final float b() {
        return d() * this.f5582g;
    }

    @Override // k2.a
    public final void j() {
        this.f5583h.reset();
        Path path = this.f5583h;
        float c10 = c();
        i2.f fVar = this.f5576c;
        f.c(fVar);
        path.moveTo(c10, fVar.getPadding());
        this.f5583h.lineTo(c(), d() * this.f5582g);
        this.f5574a.setStyle(Paint.Style.STROKE);
        this.f5574a.setStrokeWidth(this.f5577d);
        this.f5574a.setColor(this.f5578e);
    }
}
