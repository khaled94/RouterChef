package s3;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c1.c;
import java.util.Objects;
import m4.es;
import m4.jo;

/* loaded from: classes.dex */
public final class e extends FrameLayout {
    @Override // android.view.ViewGroup
    public final void addView(@RecentlyNonNull View view, int i10, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        if (view != null) {
            super.bringChildToFront(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        ((Boolean) jo.f10145d.f10148c.a(es.T1)).booleanValue();
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public a getAdChoicesView() {
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return null;
    }

    @RecentlyNullable
    public final View getBodyView() {
        return null;
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return null;
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return null;
    }

    @RecentlyNullable
    public final View getIconView() {
        return null;
    }

    @RecentlyNullable
    public final View getImageView() {
        return null;
    }

    @RecentlyNullable
    public final b getMediaView() {
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return null;
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return null;
    }

    @RecentlyNullable
    public final View getStoreView() {
        return null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@RecentlyNonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@RecentlyNonNull View view) {
        if (view == null) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
    }

    public final void setAdvertiserView(View view) {
    }

    public final void setBodyView(View view) {
    }

    public final void setCallToActionView(View view) {
    }

    public final void setClickConfirmingView(View view) {
    }

    public final void setHeadlineView(View view) {
    }

    public final void setIconView(View view) {
    }

    public final void setImageView(View view) {
    }

    public final void setMediaView(b bVar) {
        if (bVar == null) {
            return;
        }
        f fVar = new f(this, 0);
        synchronized (bVar) {
            bVar.f17686u = fVar;
            if (bVar.f17684s) {
                Objects.requireNonNull(this);
            }
        }
        c cVar = new c(this);
        synchronized (bVar) {
            bVar.f17687v = cVar;
            if (bVar.f17685t) {
                Objects.requireNonNull(this);
            }
        }
    }

    public void setNativeAd(@RecentlyNonNull c cVar) {
    }

    public final void setPriceView(View view) {
    }

    public final void setStarRatingView(View view) {
    }

    public final void setStoreView(View view) {
    }
}
