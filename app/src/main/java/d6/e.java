package d6;

import a6.g;
import a6.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
public final class e extends g {
    public final RectF Q;

    public e() {
        this(null);
    }

    public e(j jVar) {
        super(jVar == null ? new j() : jVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.Q = new RectF();
    }

    @Override // a6.g
    public final void g(Canvas canvas) {
        if (this.Q.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.Q);
        } else {
            canvas.clipRect(this.Q, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    public final void x(float f10, float f11, float f12, float f13) {
        RectF rectF = this.Q;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
