package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class l extends RecyclerView.l implements RecyclerView.p {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public final b C;

    /* renamed from: a */
    public final int f2149a;

    /* renamed from: b */
    public final int f2150b;

    /* renamed from: c */
    public final StateListDrawable f2151c;

    /* renamed from: d */
    public final Drawable f2152d;

    /* renamed from: e */
    public final int f2153e;

    /* renamed from: f */
    public final int f2154f;

    /* renamed from: g */
    public final StateListDrawable f2155g;

    /* renamed from: h */
    public final Drawable f2156h;

    /* renamed from: i */
    public final int f2157i;

    /* renamed from: j */
    public final int f2158j;

    /* renamed from: k */
    public int f2159k;

    /* renamed from: l */
    public int f2160l;

    /* renamed from: m */
    public float f2161m;

    /* renamed from: n */
    public int f2162n;

    /* renamed from: o */
    public int f2163o;
    public float p;

    /* renamed from: s */
    public RecyclerView f2166s;

    /* renamed from: z */
    public final ValueAnimator f2172z;

    /* renamed from: q */
    public int f2164q = 0;

    /* renamed from: r */
    public int f2165r = 0;

    /* renamed from: t */
    public boolean f2167t = false;

    /* renamed from: u */
    public boolean f2168u = false;

    /* renamed from: v */
    public int f2169v = 0;

    /* renamed from: w */
    public int f2170w = 0;

    /* renamed from: x */
    public final int[] f2171x = new int[2];
    public final int[] y = new int[2];
    public int A = 0;
    public final a B = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            l.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            int i10 = lVar.A;
            if (i10 == 1) {
                lVar.f2172z.cancel();
            } else if (i10 != 2) {
                return;
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.f2172z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            lVar.f2172z.setDuration(500);
            lVar.f2172z.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.q {
        public b() {
            l.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.f2166s.computeVerticalScrollRange();
            int i12 = lVar.f2165r;
            lVar.f2167t = computeVerticalScrollRange - i12 > 0 && i12 >= lVar.f2149a;
            int computeHorizontalScrollRange = lVar.f2166s.computeHorizontalScrollRange();
            int i13 = lVar.f2164q;
            boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= lVar.f2149a;
            lVar.f2168u = z10;
            boolean z11 = lVar.f2167t;
            if (!z11 && !z10) {
                if (lVar.f2169v == 0) {
                    return;
                }
                lVar.l(0);
                return;
            }
            if (z11) {
                float f10 = i12;
                lVar.f2160l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                lVar.f2159k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (lVar.f2168u) {
                float f11 = computeHorizontalScrollOffset;
                float f12 = i13;
                lVar.f2163o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
                lVar.f2162n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = lVar.f2169v;
            if (i14 != 0 && i14 != 1) {
                return;
            }
            lVar.l(1);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f2175a = false;

        public c() {
            l.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2175a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2175a) {
                this.f2175a = false;
            } else if (((Float) l.this.f2172z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.l(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.j();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
            l.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f2151c.setAlpha(floatValue);
            l.this.f2152d.setAlpha(floatValue);
            l.this.j();
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2172z = ofFloat;
        b bVar = new b();
        this.C = bVar;
        this.f2151c = stateListDrawable;
        this.f2152d = drawable;
        this.f2155g = stateListDrawable2;
        this.f2156h = drawable2;
        this.f2153e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2154f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2157i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2158j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2149a = i11;
        this.f2150b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2166s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.m mVar = recyclerView2.E;
            if (mVar != null) {
                mVar.d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.G.remove(this);
            if (recyclerView2.G.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2166s;
            recyclerView3.H.remove(this);
            if (recyclerView3.I == this) {
                recyclerView3.I = null;
            }
            ?? r72 = this.f2166s.f1921z0;
            if (r72 != 0) {
                r72.remove(bVar);
            }
            g();
        }
        this.f2166s = recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.g(this);
        this.f2166s.H.add(this);
        this.f2166s.h(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void a(MotionEvent motionEvent) {
        if (this.f2169v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean i10 = i(motionEvent.getX(), motionEvent.getY());
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            if (!i10 && !h10) {
                return;
            }
            if (h10) {
                this.f2170w = 1;
                this.p = (int) motionEvent.getX();
            } else if (i10) {
                this.f2170w = 2;
                this.f2161m = (int) motionEvent.getY();
            }
            l(2);
        } else if (motionEvent.getAction() == 1 && this.f2169v == 2) {
            this.f2161m = 0.0f;
            this.p = 0.0f;
            l(1);
            this.f2170w = 0;
        } else if (motionEvent.getAction() != 2 || this.f2169v != 2) {
        } else {
            m();
            if (this.f2170w == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.y;
                int i11 = this.f2150b;
                iArr[0] = i11;
                iArr[1] = this.f2164q - i11;
                float max = Math.max(iArr[0], Math.min(iArr[1], x10));
                if (Math.abs(this.f2163o - max) >= 2.0f) {
                    int k10 = k(this.p, max, iArr, this.f2166s.computeHorizontalScrollRange(), this.f2166s.computeHorizontalScrollOffset(), this.f2164q);
                    if (k10 != 0) {
                        this.f2166s.scrollBy(k10, 0);
                    }
                    this.p = max;
                }
            }
            if (this.f2170w != 2) {
                return;
            }
            float y = motionEvent.getY();
            int[] iArr2 = this.f2171x;
            int i12 = this.f2150b;
            iArr2[0] = i12;
            iArr2[1] = this.f2165r - i12;
            float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
            if (Math.abs(this.f2160l - max2) < 2.0f) {
                return;
            }
            int k11 = k(this.f2161m, max2, iArr2, this.f2166s.computeVerticalScrollRange(), this.f2166s.computeVerticalScrollOffset(), this.f2165r);
            if (k11 != 0) {
                this.f2166s.scrollBy(0, k11);
            }
            this.f2161m = max2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean b(MotionEvent motionEvent) {
        int i10 = this.f2169v;
        if (i10 == 1) {
            boolean i11 = i(motionEvent.getX(), motionEvent.getY());
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (i11 || h10)) {
                if (h10) {
                    this.f2170w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (i11) {
                    this.f2170w = 2;
                    this.f2161m = (int) motionEvent.getY();
                }
                l(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void c() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        if (this.f2164q != this.f2166s.getWidth() || this.f2165r != this.f2166s.getHeight()) {
            this.f2164q = this.f2166s.getWidth();
            this.f2165r = this.f2166s.getHeight();
            l(0);
        } else if (this.A == 0) {
        } else {
            if (this.f2167t) {
                int i12 = this.f2164q;
                int i13 = this.f2153e;
                int i14 = i12 - i13;
                int i15 = this.f2160l;
                int i16 = this.f2159k;
                int i17 = i15 - (i16 / 2);
                this.f2151c.setBounds(0, 0, i13, i16);
                this.f2152d.setBounds(0, 0, this.f2154f, this.f2165r);
                RecyclerView recyclerView2 = this.f2166s;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                boolean z10 = true;
                if (z.e.d(recyclerView2) != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f2152d.draw(canvas);
                    canvas.translate(this.f2153e, i17);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2151c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i14 = this.f2153e;
                } else {
                    canvas.translate(i14, 0.0f);
                    this.f2152d.draw(canvas);
                    canvas.translate(0.0f, i17);
                    this.f2151c.draw(canvas);
                }
                canvas.translate(-i14, -i17);
            }
            if (!this.f2168u) {
                return;
            }
            int i18 = this.f2165r;
            int i19 = this.f2157i;
            int i20 = this.f2163o;
            int i21 = this.f2162n;
            this.f2155g.setBounds(0, 0, i21, i19);
            this.f2156h.setBounds(0, 0, this.f2164q, this.f2158j);
            canvas.translate(0.0f, i18 - i19);
            this.f2156h.draw(canvas);
            canvas.translate(i20 - (i21 / 2), 0.0f);
            this.f2155g.draw(canvas);
            canvas.translate(-i11, -i10);
        }
    }

    public final void g() {
        this.f2166s.removeCallbacks(this.B);
    }

    public final boolean h(float f10, float f11) {
        if (f11 >= this.f2165r - this.f2157i) {
            int i10 = this.f2163o;
            int i11 = this.f2162n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(float f10, float f11) {
        RecyclerView recyclerView = this.f2166s;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.e.d(recyclerView) == 1) {
            if (f10 > this.f2153e / 2) {
                return false;
            }
        } else if (f10 < this.f2164q - this.f2153e) {
            return false;
        }
        int i10 = this.f2160l;
        int i11 = this.f2159k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) ((i11 / 2) + i10));
    }

    public final void j() {
        this.f2166s.invalidate();
    }

    public final int k(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 < i14 && i16 >= 0) {
            return i15;
        }
        return 0;
    }

    public final void l(int i10) {
        int i11;
        if (i10 == 2 && this.f2169v != 2) {
            this.f2151c.setState(D);
            g();
        }
        if (i10 == 0) {
            j();
        } else {
            m();
        }
        if (this.f2169v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f2169v = i10;
        }
        this.f2151c.setState(E);
        i11 = 1200;
        g();
        this.f2166s.postDelayed(this.B, i11);
        this.f2169v = i10;
    }

    public final void m() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            this.f2172z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f2172z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2172z.setDuration(500L);
        this.f2172z.setStartDelay(0L);
        this.f2172z.start();
    }
}
