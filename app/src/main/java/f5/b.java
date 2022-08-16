package f5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public abstract class b<V extends View> extends d<V> {

    /* renamed from: c */
    public a f4529c;

    /* renamed from: d */
    public OverScroller f4530d;

    /* renamed from: e */
    public boolean f4531e;

    /* renamed from: g */
    public int f4533g;

    /* renamed from: i */
    public VelocityTracker f4535i;

    /* renamed from: f */
    public int f4532f = -1;

    /* renamed from: h */
    public int f4534h = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final CoordinatorLayout f4536s;

        /* renamed from: t */
        public final V f4537t;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            b.this = r1;
            this.f4536s = coordinatorLayout;
            this.f4537t = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller;
            if (this.f4537t == null || (overScroller = b.this.f4530d) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                b bVar = b.this;
                bVar.B(this.f4536s, this.f4537t, bVar.f4530d.getCurrY());
                V v10 = this.f4537t;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.d.m(v10, this);
                return;
            }
            b.this.z(this.f4536s, this.f4537t);
        }
    }

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int A(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return C(coordinatorLayout, v10, y() - i10, i11, i12);
    }

    public final int B(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return C(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int C(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int b10;
        int s10 = s();
        if (i11 == 0 || s10 < i11 || s10 > i12 || s10 == (b10 = c4.a.b(i10, i11, i12))) {
            return 0;
        }
        u(b10);
        return s10 - b10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f4534h < 0) {
            this.f4534h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4531e) {
            int i10 = this.f4532f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f4533g) > this.f4534h) {
                this.f4533g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f4532f = -1;
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            boolean z10 = v(v10) && coordinatorLayout.p(v10, x10, y3);
            this.f4531e = z10;
            if (z10) {
                this.f4533g = y3;
                this.f4532f = motionEvent.getPointerId(0);
                if (this.f4535i == null) {
                    this.f4535i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f4530d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f4530d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f4535i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean v(V v10) {
        return false;
    }

    public int w(V v10) {
        return -v10.getHeight();
    }

    public int x(V v10) {
        return v10.getHeight();
    }

    public int y() {
        return s();
    }

    public void z(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
