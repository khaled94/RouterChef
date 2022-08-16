package n5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import l0.g;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0096d> {

        /* renamed from: b */
        public static final TypeEvaluator<C0096d> f16608b = new a();

        /* renamed from: a */
        public final C0096d f16609a = new C0096d();

        @Override // android.animation.TypeEvaluator
        public final C0096d evaluate(float f10, C0096d c0096d, C0096d c0096d2) {
            C0096d c0096d3 = c0096d;
            C0096d c0096d4 = c0096d2;
            C0096d c0096d5 = this.f16609a;
            float h10 = g.h(c0096d3.f16612a, c0096d4.f16612a, f10);
            float h11 = g.h(c0096d3.f16613b, c0096d4.f16613b, f10);
            float h12 = g.h(c0096d3.f16614c, c0096d4.f16614c, f10);
            c0096d5.f16612a = h10;
            c0096d5.f16613b = h11;
            c0096d5.f16614c = h12;
            return this.f16609a;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<d, C0096d> {

        /* renamed from: a */
        public static final Property<d, C0096d> f16610a = new b();

        public b() {
            super(C0096d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final C0096d get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(d dVar, C0096d c0096d) {
            dVar.setRevealInfo(c0096d);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, Integer> {

        /* renamed from: a */
        public static final Property<d, Integer> f16611a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: n5.d$d */
    /* loaded from: classes.dex */
    public static class C0096d {

        /* renamed from: a */
        public float f16612a;

        /* renamed from: b */
        public float f16613b;

        /* renamed from: c */
        public float f16614c;

        public C0096d() {
        }

        public C0096d(float f10, float f11, float f12) {
            this.f16612a = f10;
            this.f16613b = f11;
            this.f16614c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0096d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(C0096d c0096d);
}
