package t0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;
import n0.g;
import n0.i;
import t0.b;

/* loaded from: classes.dex */
public abstract class a extends m0.a {

    /* renamed from: n */
    public static final Rect f18410n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final b.a<f> f18411o = new C0113a();
    public static final b p = new b();

    /* renamed from: h */
    public final AccessibilityManager f18416h;

    /* renamed from: i */
    public final View f18417i;

    /* renamed from: j */
    public c f18418j;

    /* renamed from: d */
    public final Rect f18412d = new Rect();

    /* renamed from: e */
    public final Rect f18413e = new Rect();

    /* renamed from: f */
    public final Rect f18414f = new Rect();

    /* renamed from: g */
    public final int[] f18415g = new int[2];

    /* renamed from: k */
    public int f18419k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f18420l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f18421m = Integer.MIN_VALUE;

    /* renamed from: t0.a$a */
    /* loaded from: classes.dex */
    public class C0113a implements b.a<f> {
        public final void a(Object obj, Rect rect) {
            ((f) obj).e(rect);
        }
    }

    /* loaded from: classes.dex */
    public class b {
    }

    /* loaded from: classes.dex */
    public class c extends g {
        public c() {
            a.this = r1;
        }

        @Override // n0.g
        public final f a(int i10) {
            return new f(AccessibilityNodeInfo.obtain(a.this.o(i10).f16401a));
        }

        @Override // n0.g
        public final f b(int i10) {
            int i11 = i10 == 2 ? a.this.f18419k : a.this.f18420l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return new f(AccessibilityNodeInfo.obtain(a.this.o(i11).f16401a));
        }

        @Override // n0.g
        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            if (i10 == -1) {
                View view = aVar.f18417i;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                return z.d.j(view, i11, bundle);
            }
            boolean z10 = true;
            if (i11 == 1) {
                return aVar.r(i10);
            }
            if (i11 == 2) {
                return aVar.k(i10);
            }
            if (i11 != 64) {
                return i11 != 128 ? aVar.p(i10, i11) : aVar.j(i10);
            }
            if (!aVar.f18416h.isEnabled() || !aVar.f18416h.isTouchExplorationEnabled() || (i12 = aVar.f18419k) == i10) {
                z10 = false;
            } else {
                if (i12 != Integer.MIN_VALUE) {
                    aVar.j(i12);
                }
                aVar.f18419k = i10;
                aVar.f18417i.invalidate();
                aVar.s(i10, 32768);
            }
            return z10;
        }
    }

    public a(View view) {
        if (view != null) {
            this.f18417i = view;
            this.f18416h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.d.c(view) != 0) {
                return;
            }
            z.d.s(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // m0.a
    public final g b(View view) {
        if (this.f18418j == null) {
            this.f18418j = new c();
        }
        return this.f18418j;
    }

    @Override // m0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // m0.a
    public final void d(View view, f fVar) {
        this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
        Chip.b bVar = (Chip.b) this;
        fVar.m(Chip.this.f());
        fVar.f16401a.setClickable(Chip.this.isClickable());
        fVar.n(Chip.this.getAccessibilityClassName());
        fVar.y(Chip.this.getText());
    }

    public final boolean j(int i10) {
        if (this.f18419k == i10) {
            this.f18419k = Integer.MIN_VALUE;
            this.f18417i.invalidate();
            s(i10, 65536);
            return true;
        }
        return false;
    }

    public final boolean k(int i10) {
        if (this.f18420l != i10) {
            return false;
        }
        this.f18420l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.F = false;
            chip.refreshDrawableState();
        }
        s(i10, 8);
        return true;
    }

    public final f l(int i10) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        fVar.n("android.view.View");
        Rect rect = f18410n;
        fVar.l(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f18417i;
        fVar.f16402b = -1;
        obtain.setParent(view);
        q(i10, fVar);
        if (fVar.i() == null && fVar.g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        fVar.e(this.f18413e);
        if (this.f18413e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) == 0) {
            obtain.setPackageName(this.f18417i.getContext().getPackageName());
            View view2 = this.f18417i;
            fVar.f16403c = i10;
            obtain.setSource(view2, i10);
            boolean z10 = false;
            if (this.f18419k == i10) {
                obtain.setAccessibilityFocused(true);
                fVar.a(128);
            } else {
                obtain.setAccessibilityFocused(false);
                fVar.a(64);
            }
            boolean z11 = this.f18420l == i10;
            if (z11) {
                fVar.a(2);
            } else if (obtain.isFocusable()) {
                fVar.a(1);
            }
            obtain.setFocused(z11);
            this.f18417i.getLocationOnScreen(this.f18415g);
            obtain.getBoundsInScreen(this.f18412d);
            if (this.f18412d.equals(rect)) {
                fVar.e(this.f18412d);
                if (fVar.f16402b != -1) {
                    f fVar2 = new f(AccessibilityNodeInfo.obtain());
                    for (int i11 = fVar.f16402b; i11 != -1; i11 = fVar2.f16402b) {
                        View view3 = this.f18417i;
                        fVar2.f16402b = -1;
                        fVar2.f16401a.setParent(view3, -1);
                        fVar2.l(f18410n);
                        q(i11, fVar2);
                        fVar2.e(this.f18413e);
                        Rect rect2 = this.f18412d;
                        Rect rect3 = this.f18413e;
                        rect2.offset(rect3.left, rect3.top);
                    }
                    fVar2.f16401a.recycle();
                }
                this.f18412d.offset(this.f18415g[0] - this.f18417i.getScrollX(), this.f18415g[1] - this.f18417i.getScrollY());
            }
            if (this.f18417i.getLocalVisibleRect(this.f18414f)) {
                this.f18414f.offset(this.f18415g[0] - this.f18417i.getScrollX(), this.f18415g[1] - this.f18417i.getScrollY());
                if (this.f18412d.intersect(this.f18414f)) {
                    fVar.f16401a.setBoundsInScreen(this.f18412d);
                    Rect rect4 = this.f18412d;
                    if (rect4 != null && !rect4.isEmpty() && this.f18417i.getWindowVisibility() == 0) {
                        View view4 = this.f18417i;
                        while (true) {
                            ViewParent parent = view4.getParent();
                            if (parent instanceof View) {
                                view4 = (View) parent;
                                if (view4.getAlpha() <= 0.0f) {
                                    break;
                                } else if (view4.getVisibility() != 0) {
                                    break;
                                }
                            } else if (parent != null) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        fVar.f16401a.setVisibleToUser(true);
                    }
                }
            }
            return fVar;
        }
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    public abstract void m(List<Integer> list);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Type inference failed for: r15v1, types: [t0.a$a, t0.b$a<n0.f>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.n(int, android.graphics.Rect):boolean");
    }

    public final f o(int i10) {
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f18417i);
            f fVar = new f(obtain);
            View view = this.f18417i;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            m(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                fVar.f16401a.addChild(this.f18417i, ((Integer) arrayList.get(i11)).intValue());
            }
            return fVar;
        }
        return l(i10);
    }

    public abstract boolean p(int i10, int i11);

    public abstract void q(int i10, f fVar);

    public final boolean r(int i10) {
        int i11;
        if ((this.f18417i.isFocused() || this.f18417i.requestFocus()) && (i11 = this.f18420l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                k(i11);
            }
            if (i10 == Integer.MIN_VALUE) {
                return false;
            }
            this.f18420l = i10;
            Chip.b bVar = (Chip.b) this;
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.F = true;
                chip.refreshDrawableState();
            }
            s(i10, 8);
            return true;
        }
        return false;
    }

    public final boolean s(int i10, int i11) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i10 == Integer.MIN_VALUE || !this.f18416h.isEnabled() || (parent = this.f18417i.getParent()) == null) {
            return false;
        }
        if (i10 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            f o10 = o(i10);
            accessibilityEvent.getText().add(o10.i());
            accessibilityEvent.setContentDescription(o10.g());
            accessibilityEvent.setScrollable(o10.f16401a.isScrollable());
            accessibilityEvent.setPassword(o10.f16401a.isPassword());
            accessibilityEvent.setEnabled(o10.f16401a.isEnabled());
            accessibilityEvent.setChecked(o10.f16401a.isChecked());
            if (accessibilityEvent.getText().isEmpty() && accessibilityEvent.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEvent.setClassName(o10.f16401a.getClassName());
            i.a(accessibilityEvent, this.f18417i, i10);
            accessibilityEvent.setPackageName(this.f18417i.getContext().getPackageName());
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            this.f18417i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f18417i, accessibilityEvent);
    }
}
