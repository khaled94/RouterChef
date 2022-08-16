package t8;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import t8.t;

/* loaded from: classes.dex */
public final class l extends a<ImageView> {

    /* renamed from: m */
    public e f18781m;

    public l(t tVar, ImageView imageView, w wVar, String str, e eVar) {
        super(tVar, imageView, wVar, str);
        this.f18781m = eVar;
    }

    @Override // t8.a
    public final void a() {
        this.f18709l = true;
        if (this.f18781m != null) {
            this.f18781m = null;
        }
    }

    @Override // t8.a
    public final void b(Bitmap bitmap, t.d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f18700c.get();
            if (imageView == null) {
                return;
            }
            t tVar = this.f18698a;
            u.b(imageView, tVar.f18802d, bitmap, dVar, this.f18701d, tVar.f18810l);
            e eVar = this.f18781m;
            if (eVar == null) {
                return;
            }
            eVar.b();
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // t8.a
    public final void c(Exception exc) {
        ImageView imageView = (ImageView) this.f18700c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i10 = this.f18704g;
        if (i10 != 0) {
            imageView.setImageResource(i10);
        } else {
            Drawable drawable2 = this.f18705h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        e eVar = this.f18781m;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }
}
