package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.raouf.routerchef.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m0.b0;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class k1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static k1 B;
    public static k1 C;
    public boolean A;

    /* renamed from: s */
    public final View f921s;

    /* renamed from: t */
    public final CharSequence f922t;

    /* renamed from: u */
    public final int f923u;

    /* renamed from: v */
    public final a f924v = new a();

    /* renamed from: w */
    public final b f925w = new b();

    /* renamed from: x */
    public int f926x;
    public int y;

    /* renamed from: z */
    public l1 f927z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            k1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k1.this.d(false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            k1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k1.this.b();
        }
    }

    public k1(View view, CharSequence charSequence) {
        this.f921s = view;
        this.f922t = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = b0.f5852a;
        this.f923u = Build.VERSION.SDK_INT >= 28 ? b0.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(k1 k1Var) {
        k1 k1Var2 = B;
        if (k1Var2 != null) {
            k1Var2.f921s.removeCallbacks(k1Var2.f924v);
        }
        B = k1Var;
        if (k1Var != null) {
            k1Var.f921s.postDelayed(k1Var.f924v, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f926x = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
    }

    public final void b() {
        if (C == this) {
            C = null;
            l1 l1Var = this.f927z;
            if (l1Var != null) {
                l1Var.a();
                this.f927z = null;
                a();
                this.f921s.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (B == this) {
            c(null);
        }
        this.f921s.removeCallbacks(this.f925w);
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        long j3;
        View view = this.f921s;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.b(view)) {
            return;
        }
        c(null);
        k1 k1Var = C;
        if (k1Var != null) {
            k1Var.b();
        }
        C = this;
        this.A = z10;
        l1 l1Var = new l1(this.f921s.getContext());
        this.f927z = l1Var;
        View view2 = this.f921s;
        int i12 = this.f926x;
        int i13 = this.y;
        boolean z11 = this.A;
        CharSequence charSequence = this.f922t;
        if (l1Var.f940b.getParent() != null) {
            l1Var.a();
        }
        l1Var.f941c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = l1Var.f942d;
        layoutParams.token = view2.getApplicationWindowToken();
        int dimensionPixelOffset = l1Var.f939a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view2.getWidth() < dimensionPixelOffset) {
            i12 = view2.getWidth() / 2;
        }
        if (view2.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = l1Var.f939a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            i10 = i13 + dimensionPixelOffset2;
            i11 = i13 - dimensionPixelOffset2;
        } else {
            i10 = view2.getHeight();
            i11 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = l1Var.f939a.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        View rootView = view2.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view2.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(l1Var.f943e);
            Rect rect = l1Var.f943e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = l1Var.f939a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                l1Var.f943e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(l1Var.f945g);
            view2.getLocationOnScreen(l1Var.f944f);
            int[] iArr = l1Var.f944f;
            int i14 = iArr[0];
            int[] iArr2 = l1Var.f945g;
            iArr[0] = i14 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i12) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l1Var.f940b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = l1Var.f940b.getMeasuredHeight();
            int[] iArr3 = l1Var.f944f;
            int i15 = ((iArr3[1] + i11) - dimensionPixelOffset3) - measuredHeight;
            int i16 = iArr3[1] + i10 + dimensionPixelOffset3;
            if (!z11 ? measuredHeight + i16 > l1Var.f943e.height() : i15 >= 0) {
                layoutParams.y = i15;
            } else {
                layoutParams.y = i16;
            }
        }
        ((WindowManager) l1Var.f939a.getSystemService("window")).addView(l1Var.f940b, l1Var.f942d);
        this.f921s.addOnAttachStateChangeListener(this);
        if (this.A) {
            j3 = 2500;
        } else {
            j3 = ((z.d.g(this.f921s) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
        }
        this.f921s.removeCallbacks(this.f925w);
        this.f921s.postDelayed(this.f925w, j3);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z10;
        if (this.f927z == null || !this.A) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f921s.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                    b();
                }
            } else if (this.f921s.isEnabled() && this.f927z == null) {
                int x10 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x10 - this.f926x) > this.f923u || Math.abs(y - this.y) > this.f923u) {
                    this.f926x = x10;
                    this.y = y;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f926x = view.getWidth() / 2;
        this.y = view.getHeight() / 2;
        d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
