package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f786a;

    public b(ActionBarContainer actionBarContainer) {
        this.f786a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f786a;
        if (actionBarContainer.f630z) {
            Drawable drawable = actionBarContainer.y;
            if (drawable == null) {
                return;
            }
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = actionBarContainer.f628w;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f786a;
        Drawable drawable3 = actionBarContainer2.f629x;
        if (drawable3 == null || !actionBarContainer2.A) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f786a;
        if (actionBarContainer.f630z) {
            drawable = actionBarContainer.y;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f628w;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
