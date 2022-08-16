package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.f;

/* loaded from: classes.dex */
public abstract class p0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int[] A = new int[2];

    /* renamed from: s */
    public final float f976s;

    /* renamed from: t */
    public final int f977t;

    /* renamed from: u */
    public final int f978u;

    /* renamed from: v */
    public final View f979v;

    /* renamed from: w */
    public a f980w;

    /* renamed from: x */
    public b f981x;
    public boolean y;

    /* renamed from: z */
    public int f982z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            p0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = p0.this.f979v.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            p0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p0 p0Var = p0.this;
            p0Var.a();
            View view = p0Var.f979v;
            if (!view.isEnabled() || view.isLongClickable() || !p0Var.c()) {
                return;
            }
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            p0Var.y = true;
        }
    }

    public p0(View view) {
        this.f979v = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f976s = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f977t = tapTimeout;
        this.f978u = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f981x;
        if (bVar != null) {
            this.f979v.removeCallbacks(bVar);
        }
        a aVar = this.f980w;
        if (aVar != null) {
            this.f979v.removeCallbacks(aVar);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean e() {
        f b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r4 != 3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.y = false;
        this.f982z = -1;
        a aVar = this.f980w;
        if (aVar != null) {
            this.f979v.removeCallbacks(aVar);
        }
    }
}
