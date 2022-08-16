package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.Objects;

/* loaded from: classes.dex */
public class s extends ImageView {

    /* renamed from: s */
    public final f f999s;

    /* renamed from: t */
    public final r f1000t;

    /* renamed from: u */
    public boolean f1001u = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c1.a(context);
        a1.a(this, getContext());
        f fVar = new f(this);
        this.f999s = fVar;
        fVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f1000t = rVar;
        rVar.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f999s;
        if (fVar != null) {
            fVar.a();
        }
        r rVar = this.f1000t;
        if (rVar != null) {
            rVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f999s;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f999s;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        d1 d1Var;
        r rVar = this.f1000t;
        if (rVar == null || (d1Var = rVar.f996b) == null) {
            return null;
        }
        return d1Var.f816a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        d1 d1Var;
        r rVar = this.f1000t;
        if (rVar == null || (d1Var = rVar.f996b) == null) {
            return null;
        }
        return d1Var.f817b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f1000t.f995a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f999s;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f999s;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        r rVar = this.f1000t;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        r rVar = this.f1000t;
        if (rVar != null && drawable != null && !this.f1001u) {
            Objects.requireNonNull(rVar);
            rVar.f997c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        r rVar2 = this.f1000t;
        if (rVar2 != null) {
            rVar2.a();
            if (this.f1001u) {
                return;
            }
            r rVar3 = this.f1000t;
            if (rVar3.f995a.getDrawable() == null) {
                return;
            }
            rVar3.f995a.getDrawable().setLevel(rVar3.f997c);
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1001u = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        r rVar = this.f1000t;
        if (rVar != null) {
            rVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        r rVar = this.f1000t;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f999s;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f999s;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        r rVar = this.f1000t;
        if (rVar != null) {
            rVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        r rVar = this.f1000t;
        if (rVar != null) {
            rVar.e(mode);
        }
    }
}
