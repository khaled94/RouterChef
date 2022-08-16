package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import androidx.fragment.app.z0;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.c0;
import m0.f0;
import m0.z;
import r.f;

/* loaded from: classes.dex */
public final class e extends z0 {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ List f1379s;

        /* renamed from: t */
        public final /* synthetic */ z0.b f1380t;

        public a(List list, z0.b bVar) {
            e.this = r1;
            this.f1379s = list;
            this.f1380t = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f1379s.contains(this.f1380t)) {
                this.f1379s.remove(this.f1380t);
                e eVar = e.this;
                z0.b bVar = this.f1380t;
                Objects.requireNonNull(eVar);
                c1.a(bVar.f1618a, bVar.f1620c.W);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: c */
        public boolean f1382c;

        /* renamed from: d */
        public boolean f1383d = false;

        /* renamed from: e */
        public u.a f1384e;

        public b(z0.b bVar, i0.c cVar, boolean z10) {
            super(bVar, cVar);
            this.f1382c = z10;
        }

        public final u.a c(Context context) {
            int i10;
            int i11;
            int i12;
            if (this.f1383d) {
                return this.f1384e;
            }
            z0.b bVar = this.f1385a;
            o oVar = bVar.f1620c;
            boolean z10 = false;
            boolean z11 = bVar.f1618a == 2;
            boolean z12 = this.f1382c;
            o.c cVar = oVar.Z;
            int i13 = cVar == null ? 0 : cVar.f1530f;
            if (z12) {
                i10 = z11 ? oVar.r() : oVar.s();
            } else {
                i10 = z11 ? oVar.m() : oVar.o();
            }
            oVar.Z(0, 0, 0, 0);
            ViewGroup viewGroup = oVar.V;
            u.a aVar = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                oVar.V.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = oVar.V;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                if (i10 == 0 && i13 != 0) {
                    if (i13 == 4097) {
                        i11 = z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    } else if (i13 != 8194) {
                        if (i13 == 8197) {
                            i12 = z11 ? 16842938 : 16842939;
                        } else if (i13 == 4099) {
                            i11 = z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (i13 != 4100) {
                            i11 = -1;
                        } else {
                            i12 = z11 ? 16842936 : 16842937;
                        }
                        i11 = u.a(context, i12);
                    } else {
                        i11 = z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                    }
                    i10 = i11;
                }
                if (i10 != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i10));
                    if (equals) {
                        try {
                            Animation loadAnimation = AnimationUtils.loadAnimation(context, i10);
                            if (loadAnimation != null) {
                                aVar = new u.a(loadAnimation);
                            } else {
                                z10 = true;
                            }
                        } catch (Resources.NotFoundException e10) {
                            throw e10;
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!z10) {
                        try {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
                            if (loadAnimator != null) {
                                aVar = new u.a(loadAnimator);
                            }
                        } catch (RuntimeException e11) {
                            if (equals) {
                                throw e11;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i10);
                            if (loadAnimation2 != null) {
                                aVar = new u.a(loadAnimation2);
                            }
                        }
                    }
                }
            }
            this.f1384e = aVar;
            this.f1383d = true;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final z0.b f1385a;

        /* renamed from: b */
        public final i0.c f1386b;

        public c(z0.b bVar, i0.c cVar) {
            this.f1385a = bVar;
            this.f1386b = cVar;
        }

        public final void a() {
            z0.b bVar = this.f1385a;
            if (!bVar.f1622e.remove(this.f1386b) || !bVar.f1622e.isEmpty()) {
                return;
            }
            bVar.c();
        }

        public final boolean b() {
            int c10 = c1.c(this.f1385a.f1620c.W);
            int i10 = this.f1385a.f1618a;
            return c10 == i10 || !(c10 == 2 || i10 == 2);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: c */
        public final Object f1387c;

        /* renamed from: d */
        public final boolean f1388d;

        /* renamed from: e */
        public final Object f1389e;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
            if (r4 == androidx.fragment.app.o.f1504l0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            if (r4 == androidx.fragment.app.o.f1504l0) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(androidx.fragment.app.z0.b r3, i0.c r4, boolean r5, boolean r6) {
            /*
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.f1618a
                r0 = 2
                r1 = 0
                if (r4 != r0) goto L2c
                if (r5 == 0) goto L19
                androidx.fragment.app.o r4 = r3.f1620c
                androidx.fragment.app.o$c r4 = r4.Z
                if (r4 != 0) goto L12
                goto L1d
            L12:
                java.lang.Object r4 = r4.f1534j
                java.lang.Object r0 = androidx.fragment.app.o.f1504l0
                if (r4 != r0) goto L1e
                goto L1d
            L19:
                androidx.fragment.app.o r4 = r3.f1620c
                androidx.fragment.app.o$c r4 = r4.Z
            L1d:
                r4 = r1
            L1e:
                r2.f1387c = r4
                if (r5 == 0) goto L27
                androidx.fragment.app.o r4 = r3.f1620c
                androidx.fragment.app.o$c r4 = r4.Z
                goto L43
            L27:
                androidx.fragment.app.o r4 = r3.f1620c
                androidx.fragment.app.o$c r4 = r4.Z
                goto L43
            L2c:
                if (r5 == 0) goto L3c
                androidx.fragment.app.o r4 = r3.f1620c
                androidx.fragment.app.o$c r4 = r4.Z
                if (r4 != 0) goto L35
                goto L40
            L35:
                java.lang.Object r4 = r4.f1533i
                java.lang.Object r0 = androidx.fragment.app.o.f1504l0
                if (r4 != r0) goto L41
                goto L40
            L3c:
                androidx.fragment.app.o r4 = r3.f1620c
                androidx.fragment.app.o$c r4 = r4.Z
            L40:
                r4 = r1
            L41:
                r2.f1387c = r4
            L43:
                r4 = 1
                r2.f1388d = r4
                if (r6 == 0) goto L5e
                if (r5 == 0) goto L5a
                androidx.fragment.app.o r3 = r3.f1620c
                androidx.fragment.app.o$c r3 = r3.Z
                if (r3 != 0) goto L51
                goto L5e
            L51:
                java.lang.Object r3 = r3.f1535k
                java.lang.Object r4 = androidx.fragment.app.o.f1504l0
                if (r3 != r4) goto L58
                goto L5e
            L58:
                r1 = r3
                goto L5e
            L5a:
                androidx.fragment.app.o r3 = r3.f1620c
                androidx.fragment.app.o$c r3 = r3.Z
            L5e:
                r2.f1389e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.d.<init>(androidx.fragment.app.z0$b, i0.c, boolean, boolean):void");
        }

        public final u0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            q0 q0Var = p0.f1563a;
            if (obj instanceof Transition) {
                return q0Var;
            }
            u0 u0Var = p0.f1564b;
            if (u0Var != null && u0Var.e(obj)) {
                return u0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1385a.f1620c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public e(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x087e A[LOOP:19: B:282:0x0878->B:284:0x087e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:372:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<androidx.fragment.app.z0.b> r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 2233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.b(java.util.List, boolean):void");
    }

    public final void j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (c0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                j(arrayList, childAt);
            }
        }
    }

    public final void k(Map<String, View> map, View view) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        String k10 = z.i.k(view);
        if (k10 != null) {
            map.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public final void l(r.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((f.b) aVar.entrySet()).iterator();
        while (true) {
            f.d dVar = (f.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (!collection.contains(z.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
