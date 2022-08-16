package t8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import t8.t;

/* loaded from: classes.dex */
public final class u extends BitmapDrawable {

    /* renamed from: h */
    public static final Paint f18821h = new Paint();

    /* renamed from: a */
    public final boolean f18822a;

    /* renamed from: b */
    public final float f18823b;

    /* renamed from: c */
    public final t.d f18824c;

    /* renamed from: d */
    public Drawable f18825d;

    /* renamed from: e */
    public long f18826e;

    /* renamed from: f */
    public boolean f18827f;

    /* renamed from: g */
    public int f18828g = 255;

    public u(Context context, Bitmap bitmap, Drawable drawable, t.d dVar, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f18822a = z11;
        this.f18823b = context.getResources().getDisplayMetrics().density;
        this.f18824c = dVar;
        if (dVar != t.d.MEMORY && !z10) {
            this.f18825d = drawable;
            this.f18827f = true;
            this.f18826e = SystemClock.uptimeMillis();
        }
    }

    public static Path a(int i10) {
        Path path = new Path();
        float f10 = 0;
        path.moveTo(f10, f10);
        float f11 = i10 + 0;
        path.lineTo(f11, f10);
        path.lineTo(f10, f11);
        return path;
    }

    public static void b(ImageView imageView, Context context, Bitmap bitmap, t.d dVar, boolean z10, boolean z11) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, dVar, z10, z11));
    }

    public static void c(ImageView imageView) {
        imageView.setImageDrawable(null);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f18827f
            if (r0 != 0) goto L5
            goto L1c
        L5:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f18826e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L20
            r0 = 0
            r4.f18827f = r0
            r0 = 0
            r4.f18825d = r0
        L1c:
            super.draw(r5)
            goto L37
        L20:
            android.graphics.drawable.Drawable r1 = r4.f18825d
            if (r1 == 0) goto L27
            r1.draw(r5)
        L27:
            int r1 = r4.f18828g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f18828g
            super.setAlpha(r0)
        L37:
            boolean r0 = r4.f18822a
            if (r0 == 0) goto L62
            android.graphics.Paint r0 = t8.u.f18821h
            r1 = -1
            r0.setColor(r1)
            float r1 = r4.f18823b
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Path r1 = a(r1)
            r5.drawPath(r1, r0)
            t8.t$d r1 = r4.f18824c
            int r1 = r1.f18819s
            r0.setColor(r1)
            float r1 = r4.f18823b
            r2 = 1097859072(0x41700000, float:15.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Path r1 = a(r1)
            r5.drawPath(r1, r0)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.u.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18825d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f18828g = i10;
        Drawable drawable = this.f18825d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18825d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
