package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u0;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View G;
    public View H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean O;
    public i.a P;
    public ViewTreeObserver Q;
    public PopupWindow.OnDismissListener R;
    public boolean S;

    /* renamed from: t */
    public final Context f521t;

    /* renamed from: u */
    public final int f522u;

    /* renamed from: v */
    public final int f523v;

    /* renamed from: w */
    public final int f524w;

    /* renamed from: x */
    public final boolean f525x;
    public final Handler y;

    /* renamed from: z */
    public final List<e> f526z = new ArrayList();
    public final List<d> A = new ArrayList();
    public final a B = new a();
    public final View$OnAttachStateChangeListenerC0006b C = new View$OnAttachStateChangeListenerC0006b();
    public final c D = new c();
    public int E = 0;
    public int F = 0;
    public boolean N = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
            b.this = r1;
        }

        /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!b.this.b() || b.this.A.size() <= 0 || ((d) b.this.A.get(0)).f534a.P) {
                return;
            }
            View view = b.this.H;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.A.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f534a.d();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0006b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0006b() {
            b.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.Q = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.Q.removeGlobalOnLayoutListener(bVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements t0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ d f530s;

            /* renamed from: t */
            public final /* synthetic */ MenuItem f531t;

            /* renamed from: u */
            public final /* synthetic */ e f532u;

            public a(d dVar, MenuItem menuItem, e eVar) {
                c.this = r1;
                this.f530s = dVar;
                this.f531t = menuItem;
                this.f532u = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = this.f530s;
                if (dVar != null) {
                    b.this.S = true;
                    dVar.f535b.d(false);
                    b.this.S = false;
                }
                if (!this.f531t.isEnabled() || !this.f531t.hasSubMenu()) {
                    return;
                }
                this.f532u.s(this.f531t, 4);
            }
        }

        public c() {
            b.this = r1;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        @Override // androidx.appcompat.widget.t0
        public final void a(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.y.removeCallbacksAndMessages(null);
            int size = b.this.A.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.A.get(i10)).f535b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < b.this.A.size()) {
                dVar = (d) b.this.A.get(i11);
            }
            b.this.y.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.t0
        public final void e(e eVar, MenuItem menuItem) {
            b.this.y.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final u0 f534a;

        /* renamed from: b */
        public final e f535b;

        /* renamed from: c */
        public final int f536c;

        public d(u0 u0Var, e eVar, int i10) {
            this.f534a = u0Var;
            this.f535b = eVar;
            this.f536c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f521t = context;
        this.G = view;
        this.f523v = i10;
        this.f524w = i11;
        this.f525x = z10;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        this.I = z.e.d(view) != 1 ? 1 : i12;
        Resources resources = context.getResources();
        this.f522u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.y = new Handler();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // androidx.appcompat.view.menu.i
    public final void a(e eVar, boolean z10) {
        int i10;
        int size = this.A.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (eVar == ((d) this.A.get(i11)).f535b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < this.A.size()) {
            ((d) this.A.get(i12)).f535b.d(false);
        }
        d dVar = (d) this.A.remove(i11);
        dVar.f535b.v(this);
        if (this.S) {
            dVar.f534a.Q.setExitTransition(null);
            dVar.f534a.Q.setAnimationStyle(0);
        }
        dVar.f534a.dismiss();
        int size2 = this.A.size();
        if (size2 > 0) {
            i10 = ((d) this.A.get(size2 - 1)).f536c;
        } else {
            View view = this.G;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            i10 = z.e.d(view) == 1 ? 0 : 1;
        }
        this.I = i10;
        if (size2 != 0) {
            if (!z10) {
                return;
            }
            ((d) this.A.get(0)).f535b.d(false);
            return;
        }
        dismiss();
        i.a aVar = this.P;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Q.removeGlobalOnLayoutListener(this.B);
            }
            this.Q = null;
        }
        this.H.removeOnAttachStateChangeListener(this.C);
        this.R.onDismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // k.f
    public final boolean b() {
        return this.A.size() > 0 && ((d) this.A.get(0)).f534a.b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.appcompat.view.menu.e>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.e>, java.util.ArrayList] */
    @Override // k.f
    public final void d() {
        if (b()) {
            return;
        }
        Iterator it = this.f526z.iterator();
        while (it.hasNext()) {
            v((e) it.next());
        }
        this.f526z.clear();
        View view = this.G;
        this.H = view;
        if (view == null) {
            return;
        }
        boolean z10 = this.Q == null;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.Q = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.B);
        }
        this.H.addOnAttachStateChangeListener(this.C);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // k.f
    public final void dismiss() {
        int size = this.A.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.A.toArray(new d[size]);
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                d dVar = dVarArr[size];
                if (dVar.f534a.b()) {
                    dVar.f534a.dismiss();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // androidx.appcompat.view.menu.i
    public final void f() {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f534a.f1004u.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // k.f
    public final ListView g() {
        if (this.A.isEmpty()) {
            return null;
        }
        ?? r02 = this.A;
        return ((d) r02.get(r02.size() - 1)).f534a.f1004u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // androidx.appcompat.view.menu.i
    public final boolean h(l lVar) {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (lVar == dVar.f535b) {
                dVar.f534a.f1004u.requestFocus();
                return true;
            }
        }
        if (lVar.hasVisibleItems()) {
            l(lVar);
            i.a aVar = this.P;
            if (aVar != null) {
                aVar.b(lVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void j(i.a aVar) {
        this.P = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<androidx.appcompat.view.menu.e>, java.util.ArrayList] */
    @Override // k.d
    public final void l(e eVar) {
        eVar.c(this, this.f521t);
        if (b()) {
            v(eVar);
        } else {
            this.f526z.add(eVar);
        }
    }

    @Override // k.d
    public final void n(View view) {
        if (this.G != view) {
            this.G = view;
            int i10 = this.E;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            this.F = Gravity.getAbsoluteGravity(i10, z.e.d(view));
        }
    }

    @Override // k.d
    public final void o(boolean z10) {
        this.N = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        int size = this.A.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.A.get(i10);
            if (!dVar.f534a.b()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f535b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // k.d
    public final void p(int i10) {
        if (this.E != i10) {
            this.E = i10;
            View view = this.G;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            this.F = Gravity.getAbsoluteGravity(i10, z.e.d(view));
        }
    }

    @Override // k.d
    public final void q(int i10) {
        this.J = true;
        this.L = i10;
    }

    @Override // k.d
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.R = onDismissListener;
    }

    @Override // k.d
    public final void s(boolean z10) {
        this.O = z10;
    }

    @Override // k.d
    public final void t(int i10) {
        this.K = true;
        this.M = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r12.right) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0124, code lost:
        if ((r11[0] - r4) < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0128, code lost:
        r9 = 0;
     */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(androidx.appcompat.view.menu.e r17) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.v(androidx.appcompat.view.menu.e):void");
    }
}
