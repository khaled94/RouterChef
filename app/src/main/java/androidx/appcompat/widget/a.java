package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e;
import com.raouf.routerchef.R;
import m0.f0;
import m0.g0;
import m0.z;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: s */
    public final C0007a f763s;

    /* renamed from: t */
    public final Context f764t;

    /* renamed from: u */
    public ActionMenuView f765u;

    /* renamed from: v */
    public c f766v;

    /* renamed from: w */
    public int f767w;

    /* renamed from: x */
    public f0 f768x;
    public boolean y;

    /* renamed from: z */
    public boolean f769z;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0007a implements g0 {

        /* renamed from: s */
        public boolean f770s = false;

        /* renamed from: t */
        public int f771t;

        public C0007a() {
            a.this = r1;
        }

        @Override // m0.g0
        public final void a() {
            if (this.f770s) {
                return;
            }
            a aVar = a.this;
            aVar.f768x = null;
            a.super.setVisibility(this.f771t);
        }

        @Override // m0.g0
        public final void b(View view) {
            this.f770s = true;
        }

        @Override // m0.g0
        public final void d() {
            a.super.setVisibility(0);
            this.f770s = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f763s = new C0007a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f764t = context;
        } else {
            this.f764t = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public final int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public final int d(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final f0 e(int i10, long j3) {
        f0 f0Var = this.f768x;
        if (f0Var != null) {
            f0Var.b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            f0 b10 = z.b(this);
            b10.a(1.0f);
            b10.c(j3);
            C0007a c0007a = this.f763s;
            a.this.f768x = b10;
            c0007a.f771t = i10;
            b10.d(c0007a);
            return b10;
        }
        f0 b11 = z.b(this);
        b11.a(0.0f);
        b11.c(j3);
        C0007a c0007a2 = this.f763s;
        a.this.f768x = b11;
        c0007a2.f771t = i10;
        b11.d(c0007a2);
        return b11;
    }

    public int getAnimatedVisibility() {
        return this.f768x != null ? this.f763s.f771t : getVisibility();
    }

    public int getContentHeight() {
        return this.f767w;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.f184s, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f766v;
        if (cVar != null) {
            Configuration configuration2 = cVar.f515t.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            cVar.H = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            e eVar = cVar.f516u;
            if (eVar == null) {
                return;
            }
            eVar.r(true);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f769z = false;
        }
        if (!this.f769z) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f769z = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f769z = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y = false;
        }
        if (!this.y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.y = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.y = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f767w = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            f0 f0Var = this.f768x;
            if (f0Var != null) {
                f0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
