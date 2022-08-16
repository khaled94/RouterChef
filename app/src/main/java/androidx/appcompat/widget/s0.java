package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.f;
import m0.f0;
import m0.z;
import q0.i;
import q0.j;

/* loaded from: classes.dex */
public class s0 implements f {
    public static Method R;
    public static Method S;
    public static Method T;
    public boolean A;
    public boolean B;
    public boolean C;
    public b F;
    public View G;
    public AdapterView.OnItemClickListener H;
    public final Handler M;
    public Rect O;
    public boolean P;
    public u Q;

    /* renamed from: s */
    public Context f1002s;

    /* renamed from: t */
    public ListAdapter f1003t;

    /* renamed from: u */
    public n0 f1004u;

    /* renamed from: x */
    public int f1007x;
    public int y;

    /* renamed from: v */
    public int f1005v = -2;

    /* renamed from: w */
    public int f1006w = -2;

    /* renamed from: z */
    public int f1008z = 1002;
    public int D = 0;
    public int E = Integer.MAX_VALUE;
    public final e I = new e();
    public final d J = new d();
    public final c K = new c();
    public final a L = new a();
    public final Rect N = new Rect();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            s0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n0 n0Var = s0.this.f1004u;
            if (n0Var != null) {
                n0Var.setListSelectionHidden(true);
                n0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
            s0.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (s0.this.b()) {
                s0.this.d();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            s0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
            s0.this = r1;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                if (s0.this.Q.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (z10 || s0.this.Q.getContentView() == null) {
                    return;
                }
                s0 s0Var = s0.this;
                s0Var.M.removeCallbacks(s0Var.I);
                s0.this.I.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
            s0.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            u uVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (uVar = s0.this.Q) != null && uVar.isShowing() && x10 >= 0 && x10 < s0.this.Q.getWidth() && y >= 0 && y < s0.this.Q.getHeight()) {
                s0 s0Var = s0.this;
                s0Var.M.postDelayed(s0Var.I, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                s0 s0Var2 = s0.this;
                s0Var2.M.removeCallbacks(s0Var2.I);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
            s0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n0 n0Var = s0.this.f1004u;
            if (n0Var != null) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (!z.g.b(n0Var) || s0.this.f1004u.getCount() <= s0.this.f1004u.getChildCount()) {
                    return;
                }
                int childCount = s0.this.f1004u.getChildCount();
                s0 s0Var = s0.this;
                if (childCount > s0Var.E) {
                    return;
                }
                s0Var.Q.setInputMethodMode(2);
                s0.this.d();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                R = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                T = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                S = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public s0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1002s = context;
        this.M = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a6.f.G, i10, i11);
        this.f1007x = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A = true;
        }
        obtainStyledAttributes.recycle();
        u uVar = new u(context, attributeSet, i10, i11);
        this.Q = uVar;
        uVar.setInputMethodMode(1);
    }

    @Override // k.f
    public final boolean b() {
        return this.Q.isShowing();
    }

    public final int c() {
        return this.f1007x;
    }

    @Override // k.f
    public final void d() {
        int i10;
        int i11;
        int i12;
        n0 n0Var;
        int i13;
        if (this.f1004u == null) {
            n0 q10 = q(this.f1002s, !this.P);
            this.f1004u = q10;
            q10.setAdapter(this.f1003t);
            this.f1004u.setOnItemClickListener(this.H);
            this.f1004u.setFocusable(true);
            this.f1004u.setFocusableInTouchMode(true);
            this.f1004u.setOnItemSelectedListener(new r0(this));
            this.f1004u.setOnScrollListener(this.K);
            this.Q.setContentView(this.f1004u);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.Q.getContentView();
        }
        Drawable background = this.Q.getBackground();
        int i14 = 0;
        if (background != null) {
            background.getPadding(this.N);
            Rect rect = this.N;
            int i15 = rect.top;
            i10 = rect.bottom + i15;
            if (!this.A) {
                this.y = -i15;
            }
        } else {
            this.N.setEmpty();
            i10 = 0;
        }
        boolean z10 = this.Q.getInputMethodMode() == 2;
        View view = this.G;
        int i16 = this.y;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = S;
            if (method != null) {
                try {
                    i11 = ((Integer) method.invoke(this.Q, view, Integer.valueOf(i16), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i11 = this.Q.getMaxAvailableHeight(view, i16);
        } else {
            i11 = this.Q.getMaxAvailableHeight(view, i16, z10);
        }
        if (this.f1005v == -1) {
            i12 = i11 + i10;
        } else {
            int i17 = this.f1006w;
            if (i17 != -2) {
                i13 = 1073741824;
                if (i17 == -1) {
                    int i18 = this.f1002s.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.N;
                    i17 = i18 - (rect2.left + rect2.right);
                }
            } else {
                int i19 = this.f1002s.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.N;
                i17 = i19 - (rect3.left + rect3.right);
                i13 = Integer.MIN_VALUE;
            }
            int a10 = this.f1004u.a(View.MeasureSpec.makeMeasureSpec(i17, i13), i11 + 0);
            i12 = a10 + (a10 > 0 ? this.f1004u.getPaddingBottom() + this.f1004u.getPaddingTop() + i10 + 0 : 0);
        }
        boolean z11 = this.Q.getInputMethodMode() == 2;
        j.d(this.Q, this.f1008z);
        if (this.Q.isShowing()) {
            View view2 = this.G;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (!z.g.b(view2)) {
                return;
            }
            int i20 = this.f1006w;
            if (i20 == -1) {
                i20 = -1;
            } else if (i20 == -2) {
                i20 = this.G.getWidth();
            }
            int i21 = this.f1005v;
            if (i21 == -1) {
                if (!z11) {
                    i12 = -1;
                }
                if (z11) {
                    this.Q.setWidth(this.f1006w == -1 ? -1 : 0);
                    this.Q.setHeight(0);
                } else {
                    u uVar = this.Q;
                    if (this.f1006w == -1) {
                        i14 = -1;
                    }
                    uVar.setWidth(i14);
                    this.Q.setHeight(-1);
                }
            } else if (i21 != -2) {
                i12 = i21;
            }
            this.Q.setOutsideTouchable(true);
            this.Q.update(this.G, this.f1007x, this.y, i20 < 0 ? -1 : i20, i12 < 0 ? -1 : i12);
            return;
        }
        int i22 = this.f1006w;
        if (i22 == -1) {
            i22 = -1;
        } else if (i22 == -2) {
            i22 = this.G.getWidth();
        }
        int i23 = this.f1005v;
        if (i23 == -1) {
            i12 = -1;
        } else if (i23 != -2) {
            i12 = i23;
        }
        this.Q.setWidth(i22);
        this.Q.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = R;
            if (method2 != null) {
                try {
                    method2.invoke(this.Q, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.Q.setIsClippedToScreen(true);
        }
        this.Q.setOutsideTouchable(true);
        this.Q.setTouchInterceptor(this.J);
        if (this.C) {
            j.c(this.Q, this.B);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = T;
            if (method3 != null) {
                try {
                    method3.invoke(this.Q, this.O);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.Q.setEpicenterBounds(this.O);
        }
        i.a(this.Q, this.G, this.f1007x, this.y, this.D);
        this.f1004u.setSelection(-1);
        if ((!this.P || this.f1004u.isInTouchMode()) && (n0Var = this.f1004u) != null) {
            n0Var.setListSelectionHidden(true);
            n0Var.requestLayout();
        }
        if (this.P) {
            return;
        }
        this.M.post(this.L);
    }

    @Override // k.f
    public final void dismiss() {
        this.Q.dismiss();
        this.Q.setContentView(null);
        this.f1004u = null;
        this.M.removeCallbacks(this.I);
    }

    public final Drawable f() {
        return this.Q.getBackground();
    }

    @Override // k.f
    public final ListView g() {
        return this.f1004u;
    }

    public final void i(Drawable drawable) {
        this.Q.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.y = i10;
        this.A = true;
    }

    public final void l(int i10) {
        this.f1007x = i10;
    }

    public final int n() {
        if (!this.A) {
            return 0;
        }
        return this.y;
    }

    public void p(ListAdapter listAdapter) {
        b bVar = this.F;
        if (bVar == null) {
            this.F = new b();
        } else {
            ListAdapter listAdapter2 = this.f1003t;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f1003t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.F);
        }
        n0 n0Var = this.f1004u;
        if (n0Var != null) {
            n0Var.setAdapter(this.f1003t);
        }
    }

    public n0 q(Context context, boolean z10) {
        return new n0(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.Q.getBackground();
        if (background == null) {
            this.f1006w = i10;
            return;
        }
        background.getPadding(this.N);
        Rect rect = this.N;
        this.f1006w = rect.left + rect.right + i10;
    }

    public final void s() {
        this.Q.setInputMethodMode(2);
    }

    public final void t() {
        this.P = true;
        this.Q.setFocusable(true);
    }

    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.Q.setOnDismissListener(onDismissListener);
    }
}
