package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import g.b;
import g.d;
import r.h;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a extends g.d {
    public b H;
    public f I;
    public int J;
    public int K;
    public boolean L;

    /* renamed from: g.a$a */
    /* loaded from: classes.dex */
    public static class C0069a extends f {

        /* renamed from: a */
        public final Animatable f4724a;

        public C0069a(Animatable animatable) {
            this.f4724a = animatable;
        }

        @Override // g.a.f
        public final void c() {
            this.f4724a.start();
        }

        @Override // g.a.f
        public final void d() {
            this.f4724a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d.a {
        public r.d<Long> I;
        public h<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            h<Integer> hVar;
            if (bVar != null) {
                this.I = bVar.I;
                hVar = bVar.J;
            } else {
                this.I = new r.d<>();
                hVar = new h<>();
            }
            this.J = hVar;
        }

        public static long h(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        @Override // g.d.a, g.b.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        public final int i(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.J.c(i10, 0).intValue();
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: a */
        public final q1.b f4725a;

        public c(q1.b bVar) {
            this.f4725a = bVar;
        }

        @Override // g.a.f
        public final void c() {
            this.f4725a.start();
        }

        @Override // g.a.f
        public final void d() {
            this.f4725a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: a */
        public final ObjectAnimator f4726a;

        /* renamed from: b */
        public final boolean f4727b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            h.a.a(ofInt, true);
            ofInt.setDuration(eVar.f4730c);
            ofInt.setInterpolator(eVar);
            this.f4727b = z11;
            this.f4726a = ofInt;
        }

        @Override // g.a.f
        public final boolean a() {
            return this.f4727b;
        }

        @Override // g.a.f
        public final void b() {
            this.f4726a.reverse();
        }

        @Override // g.a.f
        public final void c() {
            this.f4726a.start();
        }

        @Override // g.a.f
        public final void d() {
            this.f4726a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements TimeInterpolator {

        /* renamed from: a */
        public int[] f4728a;

        /* renamed from: b */
        public int f4729b;

        /* renamed from: c */
        public int f4730c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f4729b = numberOfFrames;
            int[] iArr = this.f4728a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f4728a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f4728a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f4730c = i10;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f4730c) + 0.5f);
            int i11 = this.f4729b;
            int[] iArr = this.f4728a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f4730c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(b bVar, Resources resources) {
        this.J = -1;
        this.K = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0224, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r23.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g.a g(android.content.Context r21, android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):g.a");
    }

    @Override // g.d, g.b
    public final b.c b() {
        return new b(this.H, this, null);
    }

    @Override // g.d, g.b
    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.H = (b) cVar;
        }
    }

    @Override // g.d
    public final d.a f() {
        return new b(this.H, this, null);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.I;
        if (fVar != null) {
            fVar.d();
            this.I = null;
            d(this.J);
            this.J = -1;
            this.K = -1;
        }
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.L) {
            super.mutate();
            this.H.e();
            this.L = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
        if (d(r1) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // g.d, g.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.onStateChange(int[]):boolean");
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.I;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
