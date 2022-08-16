package t0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: v */
    public static final a f18427v = new a();

    /* renamed from: a */
    public int f18428a;

    /* renamed from: b */
    public int f18429b;

    /* renamed from: d */
    public float[] f18431d;

    /* renamed from: e */
    public float[] f18432e;

    /* renamed from: f */
    public float[] f18433f;

    /* renamed from: g */
    public float[] f18434g;

    /* renamed from: h */
    public int[] f18435h;

    /* renamed from: i */
    public int[] f18436i;

    /* renamed from: j */
    public int[] f18437j;

    /* renamed from: k */
    public int f18438k;

    /* renamed from: l */
    public VelocityTracker f18439l;

    /* renamed from: m */
    public float f18440m;

    /* renamed from: n */
    public float f18441n;

    /* renamed from: o */
    public int f18442o;
    public OverScroller p;

    /* renamed from: q */
    public final AbstractC0115c f18443q;

    /* renamed from: r */
    public View f18444r;

    /* renamed from: s */
    public boolean f18445s;

    /* renamed from: t */
    public final ViewGroup f18446t;

    /* renamed from: c */
    public int f18430c = -1;

    /* renamed from: u */
    public final b f18447u = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.r(0);
        }
    }

    /* renamed from: t0.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0115c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i10) {
        }

        public abstract void f(int i10);

        public abstract void g(View view, int i10, int i11);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0115c abstractC0115c) {
        if (viewGroup != null) {
            if (abstractC0115c == null) {
                throw new IllegalArgumentException("Callback may not be null");
            }
            this.f18446t = viewGroup;
            this.f18443q = abstractC0115c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f18442o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f18429b = viewConfiguration.getScaledTouchSlop();
            this.f18440m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f18441n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, f18427v);
            return;
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f18430c = -1;
        float[] fArr = this.f18431d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f18432e, 0.0f);
            Arrays.fill(this.f18433f, 0.0f);
            Arrays.fill(this.f18434g, 0.0f);
            Arrays.fill(this.f18435h, 0);
            Arrays.fill(this.f18436i, 0);
            Arrays.fill(this.f18437j, 0);
            this.f18438k = 0;
        }
        VelocityTracker velocityTracker = this.f18439l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18439l = null;
        }
    }

    public final void b(View view, int i10) {
        if (view.getParent() != this.f18446t) {
            StringBuilder c10 = androidx.activity.result.a.c("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            c10.append(this.f18446t);
            c10.append(")");
            throw new IllegalArgumentException(c10.toString());
        }
        this.f18444r = view;
        this.f18430c = i10;
        this.f18443q.e(view, i10);
        r(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f18435h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f18437j[i10] & i11) == i11 || (this.f18436i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f18429b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.f18443q);
        }
        return (this.f18436i[i10] & i11) == 0 && abs > ((float) this.f18429b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f18443q.c(view) > 0;
        boolean z11 = this.f18443q.d() > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f18429b) : z11 && Math.abs(f11) > ((float) this.f18429b);
        }
        float f12 = f11 * f11;
        int i10 = this.f18429b;
        return f12 + (f10 * f10) > ((float) (i10 * i10));
    }

    public final float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final void f(int i10) {
        float[] fArr = this.f18431d;
        if (fArr != null) {
            int i11 = this.f18438k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            fArr[i10] = 0.0f;
            this.f18432e[i10] = 0.0f;
            this.f18433f[i10] = 0.0f;
            this.f18434g[i10] = 0.0f;
            this.f18435h[i10] = 0;
            this.f18436i[i10] = 0;
            this.f18437j[i10] = 0;
            this.f18438k = (~i12) & i11;
        }
    }

    public final int g(int i10, int i11, int i12) {
        int width;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f18446t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f18428a == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.f18444r.getLeft();
            int top = currY - this.f18444r.getTop();
            if (left != 0) {
                View view = this.f18444r;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f18444r;
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f18443q.g(this.f18444r, currX, currY);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f18446t.post(this.f18447u);
            }
        }
        return this.f18428a == 2;
    }

    public final void i(float f10, float f11) {
        this.f18445s = true;
        this.f18443q.h(this.f18444r, f10, f11);
        this.f18445s = false;
        if (this.f18428a == 1) {
            r(0);
        }
    }

    public final View j(int i10, int i11) {
        for (int childCount = this.f18446t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f18446t;
            Objects.requireNonNull(this.f18443q);
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean k(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f18444r.getLeft();
        int top = this.f18444r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.p.abortAnimation();
            r(0);
            return false;
        }
        View view = this.f18444r;
        int i16 = (int) this.f18441n;
        int i17 = (int) this.f18440m;
        int abs = Math.abs(i12);
        if (abs < i16) {
            i12 = 0;
        } else if (abs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int i18 = (int) this.f18441n;
        int i19 = (int) this.f18440m;
        int abs2 = Math.abs(i13);
        if (abs2 < i18) {
            i13 = 0;
        } else if (abs2 > i19) {
            i13 = i13 > 0 ? i19 : -i19;
        }
        int abs3 = Math.abs(i14);
        int abs4 = Math.abs(i15);
        int abs5 = Math.abs(i12);
        int abs6 = Math.abs(i13);
        int i20 = abs5 + abs6;
        int i21 = abs3 + abs4;
        if (i12 != 0) {
            f10 = abs5;
            f11 = i20;
        } else {
            f10 = abs3;
            f11 = i21;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f13 = abs6;
            f12 = i20;
        } else {
            f13 = abs4;
            f12 = i21;
        }
        this.p.startScroll(left, top, i14, i15, (int) ((g(i15, i13, this.f18443q.d()) * (f13 / f12)) + (g(i14, i12, this.f18443q.c(view)) * f14)));
        r(2);
        return true;
    }

    public final boolean l(int i10) {
        if (!((this.f18438k & (1 << i10)) != 0)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public final void m(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f18439l == null) {
            this.f18439l = VelocityTracker.obtain();
        }
        this.f18439l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f18428a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i11 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i11);
                            if (l(pointerId)) {
                                float x10 = motionEvent.getX(i11);
                                float y = motionEvent.getY(i11);
                                float f10 = x10 - this.f18431d[pointerId];
                                float f11 = y - this.f18432e[pointerId];
                                o(f10, f11, pointerId);
                                if (this.f18428a != 1) {
                                    View j3 = j((int) x10, (int) y);
                                    if (d(j3, f10, f11) && u(j3, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else if (!l(this.f18430c)) {
                        return;
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f18430c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f18433f;
                        int i12 = this.f18430c;
                        int i13 = (int) (x11 - fArr[i12]);
                        int i14 = (int) (y3 - this.f18434g[i12]);
                        int left = this.f18444r.getLeft() + i13;
                        int top = this.f18444r.getTop() + i14;
                        int left2 = this.f18444r.getLeft();
                        int top2 = this.f18444r.getTop();
                        if (i13 != 0) {
                            left = this.f18443q.a(this.f18444r, left);
                            WeakHashMap<View, f0> weakHashMap = z.f5921a;
                            this.f18444r.offsetLeftAndRight(left - left2);
                        }
                        if (i14 != 0) {
                            top = this.f18443q.b(this.f18444r, top);
                            WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                            this.f18444r.offsetTopAndBottom(top - top2);
                        }
                        if (i13 != 0 || i14 != 0) {
                            this.f18443q.g(this.f18444r, left, top);
                        }
                    }
                    q(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.f18428a == 1 && pointerId2 == this.f18430c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i11 >= pointerCount2) {
                                    i10 = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i11);
                                if (pointerId3 != this.f18430c) {
                                    View j10 = j((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                    View view = this.f18444r;
                                    if (j10 == view && u(view, pointerId3)) {
                                        i10 = this.f18430c;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (i10 == -1) {
                                n();
                            }
                        }
                        f(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x12 = motionEvent.getX(actionIndex);
                    float y10 = motionEvent.getY(actionIndex);
                    p(x12, y10, pointerId4);
                    if (this.f18428a != 0) {
                        int i15 = (int) x12;
                        int i16 = (int) y10;
                        View view2 = this.f18444r;
                        if (view2 != null && i15 >= view2.getLeft() && i15 < view2.getRight() && i16 >= view2.getTop() && i16 < view2.getBottom()) {
                            i11 = 1;
                        }
                        if (i11 == 0) {
                            return;
                        }
                        u(this.f18444r, pointerId4);
                        return;
                    }
                    u(j((int) x12, (int) y10), pointerId4);
                    if ((this.f18435h[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.f18428a == 1) {
                    i(0.0f, 0.0f);
                }
            } else if (this.f18428a == 1) {
                n();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View j11 = j((int) x13, (int) y11);
        p(x13, y11, pointerId5);
        u(j11, pointerId5);
        if ((this.f18435h[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.f18443q);
    }

    public final void n() {
        this.f18439l.computeCurrentVelocity(1000, this.f18440m);
        i(e(this.f18439l.getXVelocity(this.f18430c), this.f18441n, this.f18440m), e(this.f18439l.getYVelocity(this.f18430c), this.f18441n, this.f18440m));
    }

    public final void o(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f18436i;
            iArr[i10] = iArr[i10] | c10;
            Objects.requireNonNull(this.f18443q);
        }
    }

    public final void p(float f10, float f11, int i10) {
        float[] fArr = this.f18431d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f18432e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f18433f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f18434g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f18435h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f18436i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f18437j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f18431d = fArr2;
            this.f18432e = fArr3;
            this.f18433f = fArr4;
            this.f18434g = fArr5;
            this.f18435h = iArr;
            this.f18436i = iArr2;
            this.f18437j = iArr3;
        }
        float[] fArr9 = this.f18431d;
        this.f18433f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f18432e;
        this.f18434g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f18435h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (i13 < this.f18446t.getLeft() + this.f18442o) {
            i11 = 1;
        }
        if (i14 < this.f18446t.getTop() + this.f18442o) {
            i11 |= 4;
        }
        if (i13 > this.f18446t.getRight() - this.f18442o) {
            i11 |= 2;
        }
        if (i14 > this.f18446t.getBottom() - this.f18442o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f18438k |= 1 << i10;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (l(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y = motionEvent.getY(i10);
                this.f18433f[pointerId] = x10;
                this.f18434g[pointerId] = y;
            }
        }
    }

    public final void r(int i10) {
        this.f18446t.removeCallbacks(this.f18447u);
        if (this.f18428a != i10) {
            this.f18428a = i10;
            this.f18443q.f(i10);
            if (this.f18428a != 0) {
                return;
            }
            this.f18444r = null;
        }
    }

    public final boolean s(int i10, int i11) {
        if (this.f18445s) {
            return k(i10, i11, (int) this.f18439l.getXVelocity(this.f18430c), (int) this.f18439l.getYVelocity(this.f18430c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
        if (r12 != r11) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.t(android.view.MotionEvent):boolean");
    }

    public final boolean u(View view, int i10) {
        if (view == this.f18444r && this.f18430c == i10) {
            return true;
        }
        if (view == null || !this.f18443q.i(view, i10)) {
            return false;
        }
        this.f18430c = i10;
        b(view, i10);
        return true;
    }
}
