package p1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class b extends p1.i {
    public static final String[] P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> Q = new a(PointF.class);
    public static final Property<i, PointF> R = new C0101b(PointF.class);
    public static final Property<i, PointF> S = new c(PointF.class);
    public static final Property<View, PointF> T = new d(PointF.class);
    public static final Property<View, PointF> U = new e(PointF.class);
    public static final Property<View, PointF> V = new f(PointF.class);

    /* loaded from: classes.dex */
    public class a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f16868a = new Rect();

        public a(Class cls) {
            super(cls, "boundsOrigin");
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f16868a);
            Rect rect = this.f16868a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f16868a);
            this.f16868a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f16868a);
        }
    }

    /* renamed from: p1.b$b */
    /* loaded from: classes.dex */
    public class C0101b extends Property<i, PointF> {
        public C0101b(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f16871a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f16872b = round;
            int i10 = iVar2.f16876f + 1;
            iVar2.f16876f = i10;
            if (i10 == iVar2.f16877g) {
                u.b(iVar2.f16875e, iVar2.f16871a, round, iVar2.f16873c, iVar2.f16874d);
                iVar2.f16876f = 0;
                iVar2.f16877g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<i, PointF> {
        public c(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f16873c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f16874d = round;
            int i10 = iVar2.f16877g + 1;
            iVar2.f16877g = i10;
            if (iVar2.f16876f == i10) {
                u.b(iVar2.f16875e, iVar2.f16871a, iVar2.f16872b, iVar2.f16873c, round);
                iVar2.f16876f = 0;
                iVar2.f16877g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, PointF> {
        public d(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f(Class cls) {
            super(cls, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            u.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends l {

        /* renamed from: a */
        public boolean f16869a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f16870b;

        public h(ViewGroup viewGroup) {
            this.f16870b = viewGroup;
        }

        @Override // p1.i.d
        public final void a(p1.i iVar) {
            if (!this.f16869a) {
                s.a(this.f16870b, false);
            }
            iVar.w(this);
        }

        @Override // p1.l, p1.i.d
        public final void b() {
            s.a(this.f16870b, false);
        }

        @Override // p1.l, p1.i.d
        public final void c() {
            s.a(this.f16870b, true);
        }

        @Override // p1.l, p1.i.d
        public final void d() {
            s.a(this.f16870b, false);
            this.f16869a = true;
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public int f16871a;

        /* renamed from: b */
        public int f16872b;

        /* renamed from: c */
        public int f16873c;

        /* renamed from: d */
        public int f16874d;

        /* renamed from: e */
        public View f16875e;

        /* renamed from: f */
        public int f16876f;

        /* renamed from: g */
        public int f16877g;

        public i(View view) {
            this.f16875e = view;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void L(p pVar) {
        View view = pVar.f16933b;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        pVar.f16932a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        pVar.f16932a.put("android:changeBounds:parent", pVar.f16933b.getParent());
    }

    @Override // p1.i
    public final void d(p pVar) {
        L(pVar);
    }

    @Override // p1.i
    public final void g(p pVar) {
        L(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // p1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r19, p1.p r20, p1.p r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.l(android.view.ViewGroup, p1.p, p1.p):android.animation.Animator");
    }

    @Override // p1.i
    public final String[] q() {
        return P;
    }
}
