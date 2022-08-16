package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u0 extends s0 implements t0 {
    public static Method V;
    public t0 U;

    /* loaded from: classes.dex */
    public static class a extends n0 {
        public final int F;
        public final int G;
        public t0 H;
        public g I;

        public a(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.F = 21;
                this.G = 22;
                return;
            }
            this.F = 22;
            this.G = 21;
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            int pointToPosition;
            int i11;
            if (this.H != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                d dVar = (d) adapter;
                g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    gVar = dVar.getItem(i11);
                }
                g gVar2 = this.I;
                if (gVar2 != gVar) {
                    e eVar = dVar.f545s;
                    if (gVar2 != null) {
                        this.H.e(eVar, gVar2);
                    }
                    this.I = gVar;
                    if (gVar != null) {
                        this.H.a(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.F) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.G) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((d) adapter).f545s.d(false);
                return true;
            }
        }

        public void setHoverListener(t0 t0Var) {
            this.H = t0Var;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public u0(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.t0
    public final void a(e eVar, MenuItem menuItem) {
        t0 t0Var = this.U;
        if (t0Var != null) {
            t0Var.a(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.t0
    public final void e(e eVar, MenuItem menuItem) {
        t0 t0Var = this.U;
        if (t0Var != null) {
            t0Var.e(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.s0
    public final n0 q(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }

    public final void v() {
        if (Build.VERSION.SDK_INT > 28) {
            this.Q.setTouchModal(false);
            return;
        }
        Method method = V;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this.Q, Boolean.FALSE);
        } catch (Exception unused) {
            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
        }
    }
}
