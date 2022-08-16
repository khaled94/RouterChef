package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.raouf.routerchef.R;
import p1.i;

/* loaded from: classes.dex */
public abstract class b0 extends i {
    public static final String[] Q = {"android:visibility:visibility", "android:visibility:parent"};
    public int P = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a */
        public final View f16878a;

        /* renamed from: b */
        public final int f16879b;

        /* renamed from: c */
        public final ViewGroup f16880c;

        /* renamed from: e */
        public boolean f16882e;

        /* renamed from: f */
        public boolean f16883f = false;

        /* renamed from: d */
        public final boolean f16881d = true;

        public a(View view, int i10) {
            this.f16878a = view;
            this.f16879b = i10;
            this.f16880c = (ViewGroup) view.getParent();
            g(true);
        }

        @Override // p1.i.d
        public final void a(i iVar) {
            f();
            iVar.w(this);
        }

        @Override // p1.i.d
        public final void b() {
            g(false);
        }

        @Override // p1.i.d
        public final void c() {
            g(true);
        }

        @Override // p1.i.d
        public final void d() {
        }

        @Override // p1.i.d
        public final void e(i iVar) {
        }

        public final void f() {
            if (!this.f16883f) {
                u.d(this.f16878a, this.f16879b);
                ViewGroup viewGroup = this.f16880c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f16881d || this.f16882e == z10 || (viewGroup = this.f16880c) == null) {
                return;
            }
            this.f16882e = z10;
            s.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f16883f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f16883f) {
                u.d(this.f16878a, this.f16879b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f16883f) {
                u.d(this.f16878a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public boolean f16884a;

        /* renamed from: b */
        public boolean f16885b;

        /* renamed from: c */
        public int f16886c;

        /* renamed from: d */
        public int f16887d;

        /* renamed from: e */
        public ViewGroup f16888e;

        /* renamed from: f */
        public ViewGroup f16889f;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void L(p pVar) {
        pVar.f16932a.put("android:visibility:visibility", Integer.valueOf(pVar.f16933b.getVisibility()));
        pVar.f16932a.put("android:visibility:parent", pVar.f16933b.getParent());
        int[] iArr = new int[2];
        pVar.f16933b.getLocationOnScreen(iArr);
        pVar.f16932a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r9 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r0.f16888e == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        if (r0.f16886c == 0) goto L35;
     */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p1.b0.b M(p1.p r8, p1.p r9) {
        /*
            r7 = this;
            p1.b0$b r0 = new p1.b0$b
            r0.<init>()
            r1 = 0
            r0.f16884a = r1
            r0.f16885b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f16932a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f16932a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f16886c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f16932a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f16888e = r6
            goto L37
        L33:
            r0.f16886c = r4
            r0.f16888e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f16932a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f16932a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f16887d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f16932a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f16889f = r2
            goto L5e
        L5a:
            r0.f16887d = r4
            r0.f16889f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f16886c
            int r9 = r0.f16887d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f16888e
            android.view.ViewGroup r4 = r0.f16889f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L91
        L75:
            if (r9 != 0) goto L95
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f16889f
            if (r8 != 0) goto L7d
            goto L91
        L7d:
            android.view.ViewGroup r8 = r0.f16888e
            if (r8 != 0) goto L95
            goto L88
        L82:
            if (r8 != 0) goto L8b
            int r8 = r0.f16887d
            if (r8 != 0) goto L8b
        L88:
            r0.f16885b = r2
            goto L93
        L8b:
            if (r9 != 0) goto L95
            int r8 = r0.f16886c
            if (r8 != 0) goto L95
        L91:
            r0.f16885b = r1
        L93:
            r0.f16884a = r2
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b0.M(p1.p, p1.p):p1.b0$b");
    }

    public abstract Animator N(View view, p pVar);

    @Override // p1.i
    public final void d(p pVar) {
        L(pVar);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // p1.i
    public final Animator l(ViewGroup viewGroup, p pVar, p pVar2) {
        boolean z10;
        boolean z11;
        Float f10;
        b M = M(pVar, pVar2);
        Animator animator = null;
        if (M.f16884a && (M.f16888e != null || M.f16889f != null)) {
            if (M.f16885b) {
                if ((this.P & 1) != 1 || pVar2 == null) {
                    return null;
                }
                if (pVar == null) {
                    View view = (View) pVar2.f16933b.getParent();
                    if (M(o(view, false), r(view, false)).f16884a) {
                        return null;
                    }
                }
                View view2 = pVar2.f16933b;
                c cVar = (c) this;
                float f11 = 0.0f;
                float floatValue = (pVar == null || (f10 = (Float) pVar.f16932a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
                if (floatValue != 1.0f) {
                    f11 = floatValue;
                }
                return cVar.O(view2, f11, 1.0f);
            }
            int i10 = M.f16887d;
            if ((this.P & 2) == 2 && pVar != null) {
                View view3 = pVar.f16933b;
                View view4 = pVar2 != null ? pVar2.f16933b : null;
                View view5 = (View) view3.getTag(R.id.save_overlay_view);
                if (view5 != null) {
                    view4 = null;
                    z10 = true;
                } else {
                    if (view4 == null || view4.getParent() == null) {
                        if (view4 != null) {
                            view5 = view4;
                            view4 = null;
                            z11 = false;
                        }
                        view4 = null;
                        view5 = null;
                        z11 = true;
                    } else {
                        if (i10 == 4 || view3 == view4) {
                            view5 = null;
                            z11 = false;
                        }
                        view4 = null;
                        view5 = null;
                        z11 = true;
                    }
                    if (z11) {
                        if (view3.getParent() == null) {
                            view5 = view3;
                        } else if (view3.getParent() instanceof View) {
                            View view6 = (View) view3.getParent();
                            if (!M(r(view6, true), o(view6, true)).f16884a) {
                                view5 = o.a(viewGroup, view3, view6);
                            } else {
                                int id = view6.getId();
                                if (view6.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (view5 != null) {
                    if (!z10) {
                        int[] iArr = (int[]) pVar.f16932a.get("android:visibility:screenLocation");
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view5.offsetLeftAndRight((i11 - iArr2[0]) - view5.getLeft());
                        view5.offsetTopAndBottom((i12 - iArr2[1]) - view5.getTop());
                        viewGroup.getOverlay().add(view5);
                    }
                    animator = N(view5, pVar);
                    if (!z10) {
                        if (animator == null) {
                            viewGroup.getOverlay().remove(view5);
                        } else {
                            view3.setTag(R.id.save_overlay_view, view5);
                            a(new a0(this, viewGroup, view5, view3));
                        }
                    }
                } else if (view4 != null) {
                    int visibility = view4.getVisibility();
                    u.d(view4, 0);
                    animator = N(view4, pVar);
                    if (animator != null) {
                        a aVar = new a(view4, i10);
                        animator.addListener(aVar);
                        animator.addPauseListener(aVar);
                        a(aVar);
                    } else {
                        u.d(view4, visibility);
                    }
                }
            }
        }
        return animator;
    }

    @Override // p1.i
    public final String[] q() {
        return Q;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // p1.i
    public final boolean s(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar != null && pVar2 != null && pVar2.f16932a.containsKey("android:visibility:visibility") != pVar.f16932a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b M = M(pVar, pVar2);
        if (!M.f16884a) {
            return false;
        }
        return M.f16886c == 0 || M.f16887d == 0;
    }
}
