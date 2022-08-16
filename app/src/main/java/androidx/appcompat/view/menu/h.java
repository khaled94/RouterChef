package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.raouf.routerchef.R;
import java.util.WeakHashMap;
import k.d;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    public final Context f602a;

    /* renamed from: b */
    public final e f603b;

    /* renamed from: c */
    public final boolean f604c;

    /* renamed from: d */
    public final int f605d;

    /* renamed from: e */
    public final int f606e;

    /* renamed from: f */
    public View f607f;

    /* renamed from: h */
    public boolean f609h;

    /* renamed from: i */
    public i.a f610i;

    /* renamed from: j */
    public d f611j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f612k;

    /* renamed from: g */
    public int f608g = 8388611;

    /* renamed from: l */
    public final a f613l = new a();

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
            h.this = r1;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            h.this.c();
        }
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f602a = context;
        this.f603b = eVar;
        this.f607f = view;
        this.f604c = z10;
        this.f605d = i10;
        this.f606e = i11;
    }

    public final d a() {
        if (this.f611j == null) {
            Display defaultDisplay = ((WindowManager) this.f602a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            d bVar = Math.min(point.x, point.y) >= this.f602a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new b(this.f602a, this.f607f, this.f605d, this.f606e, this.f604c) : new k(this.f602a, this.f603b, this.f607f, this.f605d, this.f606e, this.f604c);
            bVar.l(this.f603b);
            bVar.r(this.f613l);
            bVar.n(this.f607f);
            bVar.j(this.f610i);
            bVar.o(this.f609h);
            bVar.p(this.f608g);
            this.f611j = bVar;
        }
        return this.f611j;
    }

    public final boolean b() {
        d dVar = this.f611j;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f611j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f612k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(i.a aVar) {
        this.f610i = aVar;
        d dVar = this.f611j;
        if (dVar != null) {
            dVar.j(aVar);
        }
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        d a10 = a();
        a10.s(z11);
        if (z10) {
            int i12 = this.f608g;
            View view = this.f607f;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if ((Gravity.getAbsoluteGravity(i12, z.e.d(view)) & 7) == 5) {
                i10 -= this.f607f.getWidth();
            }
            a10.q(i10);
            a10.t(i11);
            int i13 = (int) ((this.f602a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f5538s = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.d();
    }
}
