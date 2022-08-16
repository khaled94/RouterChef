package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.raouf.routerchef.R;
import g.c;
import java.lang.reflect.Field;
import q0.g;

/* loaded from: classes.dex */
public class n0 extends ListView {
    public boolean A;
    public boolean B;
    public boolean C;
    public g D;
    public b E;

    /* renamed from: s */
    public final Rect f963s = new Rect();

    /* renamed from: t */
    public int f964t = 0;

    /* renamed from: u */
    public int f965u = 0;

    /* renamed from: v */
    public int f966v = 0;

    /* renamed from: w */
    public int f967w = 0;

    /* renamed from: x */
    public int f968x;
    public Field y;

    /* renamed from: z */
    public a f969z;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: t */
        public boolean f970t = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f970t) {
                super.draw(canvas);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f970t) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f970t) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f970t) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f970t) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            n0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n0 n0Var = n0.this;
            n0Var.E = null;
            n0Var.drawableStateChanged();
        }
    }

    public n0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.B = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.y = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f969z;
        if (aVar != null) {
            aVar.f970t = z10;
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector == null || !this.C || !isPressed()) {
            return;
        }
        selector.setState(getDrawableState());
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f963s.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f963s);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.E != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.B || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.B || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.B || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.B && this.A) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.E == null) {
            b bVar = new b();
            this.E = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f968x = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.E;
        if (bVar != null) {
            n0 n0Var = n0.this;
            n0Var.E = null;
            n0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.A = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f969z = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f964t = rect.left;
        this.f965u = rect.top;
        this.f966v = rect.right;
        this.f967w = rect.bottom;
    }
}
