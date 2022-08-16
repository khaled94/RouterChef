package k2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Shader;
import e9.f;

/* loaded from: classes.dex */
public final class i extends a<i> {

    /* renamed from: g */
    public Path f5593g = new Path();

    /* renamed from: h */
    public float f5594h;

    public i(Context context) {
        super(context);
        i(this.f5575b * 25.0f);
    }

    @Override // k2.a
    public final void a(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawPath(this.f5593g, this.f5574a);
    }

    @Override // k2.a
    public final float b() {
        return this.f5594h + this.f5577d;
    }

    @Override // k2.a
    public final float e() {
        return this.f5594h;
    }

    @Override // k2.a
    public final void j() {
        this.f5593g = new Path();
        i2.f fVar = this.f5576c;
        f.c(fVar);
        i2.f fVar2 = this.f5576c;
        f.c(fVar2);
        this.f5594h = (5.0f * this.f5575b) + fVar2.getSpeedometerWidth() + fVar.getPadding();
        this.f5593g.moveTo(c(), this.f5594h);
        Path path = this.f5593g;
        float c10 = c();
        float f10 = this.f5577d;
        path.lineTo(c10 - f10, this.f5594h + f10);
        Path path2 = this.f5593g;
        float c11 = c();
        float f11 = this.f5577d;
        path2.lineTo(c11 + f11, this.f5594h + f11);
        this.f5593g.moveTo(0.0f, 0.0f);
        this.f5574a.setShader(new LinearGradient(c(), this.f5594h, c(), this.f5594h + this.f5577d, this.f5578e, Color.argb(0, Color.red(this.f5578e), Color.green(this.f5578e), Color.blue(this.f5578e)), Shader.TileMode.CLAMP));
    }
}
