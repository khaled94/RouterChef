package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import f0.a;
import g.d;
import java.util.Objects;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int E = 0;
    public a A;
    public long B;
    public long C;
    public C0070b D;

    /* renamed from: s */
    public c f4731s;

    /* renamed from: t */
    public Rect f4732t;

    /* renamed from: u */
    public Drawable f4733u;

    /* renamed from: v */
    public Drawable f4734v;

    /* renamed from: x */
    public boolean f4736x;

    /* renamed from: z */
    public boolean f4737z;

    /* renamed from: w */
    public int f4735w = 255;
    public int y = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: g.b$b */
    /* loaded from: classes.dex */
    public static class C0070b implements Drawable.Callback {

        /* renamed from: s */
        public Drawable.Callback f4739s;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
            Drawable.Callback callback = this.f4739s;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j3);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f4739s;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a */
        public final b f4740a;

        /* renamed from: b */
        public Resources f4741b;

        /* renamed from: c */
        public int f4742c;

        /* renamed from: d */
        public int f4743d;

        /* renamed from: e */
        public int f4744e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f4745f;

        /* renamed from: g */
        public Drawable[] f4746g;

        /* renamed from: h */
        public int f4747h;

        /* renamed from: i */
        public boolean f4748i;

        /* renamed from: j */
        public boolean f4749j;

        /* renamed from: k */
        public Rect f4750k;

        /* renamed from: l */
        public boolean f4751l;

        /* renamed from: m */
        public boolean f4752m;

        /* renamed from: n */
        public int f4753n;

        /* renamed from: o */
        public int f4754o;
        public int p;

        /* renamed from: q */
        public int f4755q;

        /* renamed from: r */
        public boolean f4756r;

        /* renamed from: s */
        public int f4757s;

        /* renamed from: t */
        public boolean f4758t;

        /* renamed from: u */
        public boolean f4759u;

        /* renamed from: v */
        public boolean f4760v;

        /* renamed from: w */
        public boolean f4761w;

        /* renamed from: x */
        public int f4762x;
        public int y;

        /* renamed from: z */
        public int f4763z;

        public c(c cVar, b bVar, Resources resources) {
            this.f4748i = false;
            this.f4751l = false;
            this.f4761w = true;
            this.y = 0;
            this.f4763z = 0;
            this.f4740a = bVar;
            Rect rect = null;
            this.f4741b = resources != null ? resources : cVar != null ? cVar.f4741b : null;
            int i10 = cVar != null ? cVar.f4742c : 0;
            int i11 = b.E;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f4742c = i10;
            if (cVar == null) {
                this.f4746g = new Drawable[10];
                this.f4747h = 0;
                return;
            }
            this.f4743d = cVar.f4743d;
            this.f4744e = cVar.f4744e;
            this.f4759u = true;
            this.f4760v = true;
            this.f4748i = cVar.f4748i;
            this.f4751l = cVar.f4751l;
            this.f4761w = cVar.f4761w;
            this.f4762x = cVar.f4762x;
            this.y = cVar.y;
            this.f4763z = cVar.f4763z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            if (cVar.f4742c == i10) {
                if (cVar.f4749j) {
                    this.f4750k = cVar.f4750k != null ? new Rect(cVar.f4750k) : rect;
                    this.f4749j = true;
                }
                if (cVar.f4752m) {
                    this.f4753n = cVar.f4753n;
                    this.f4754o = cVar.f4754o;
                    this.p = cVar.p;
                    this.f4755q = cVar.f4755q;
                    this.f4752m = true;
                }
            }
            if (cVar.f4756r) {
                this.f4757s = cVar.f4757s;
                this.f4756r = true;
            }
            if (cVar.f4758t) {
                this.f4758t = true;
            }
            Drawable[] drawableArr = cVar.f4746g;
            this.f4746g = new Drawable[drawableArr.length];
            this.f4747h = cVar.f4747h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f4745f;
            this.f4745f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f4747h);
            int i12 = this.f4747h;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    Drawable.ConstantState constantState = drawableArr[i13].getConstantState();
                    if (constantState != null) {
                        this.f4745f.put(i13, constantState);
                    } else {
                        this.f4746g[i13] = drawableArr[i13];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f4747h;
            if (i10 >= this.f4746g.length) {
                int i11 = i10 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f4746g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f4746g = drawableArr;
                int[][] iArr = new int[i11];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f4740a);
            this.f4746g[i10] = drawable;
            this.f4747h++;
            this.f4744e = drawable.getChangingConfigurations() | this.f4744e;
            this.f4756r = false;
            this.f4758t = false;
            this.f4750k = null;
            this.f4749j = false;
            this.f4752m = false;
            this.f4759u = false;
            return i10;
        }

        public final void b() {
            this.f4752m = true;
            c();
            int i10 = this.f4747h;
            Drawable[] drawableArr = this.f4746g;
            this.f4754o = -1;
            this.f4753n = -1;
            this.f4755q = 0;
            this.p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f4753n) {
                    this.f4753n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f4754o) {
                    this.f4754o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f4755q) {
                    this.f4755q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f4745f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f4745f.keyAt(i10);
                    Drawable[] drawableArr = this.f4746g;
                    Drawable newDrawable = this.f4745f.valueAt(i10).newDrawable(this.f4741b);
                    a.c.b(newDrawable, this.f4762x);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f4740a);
                    drawableArr[keyAt] = mutate;
                }
                this.f4745f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i10 = this.f4747h;
            Drawable[] drawableArr = this.f4746g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    if (a.b.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f4745f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f4746g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f4745f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f4745f.valueAt(indexOfKey).newDrawable(this.f4741b);
            a.c.b(newDrawable, this.f4762x);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f4740a);
            this.f4746g[i10] = mutate;
            this.f4745f.removeAt(indexOfKey);
            if (this.f4745f.size() == 0) {
                this.f4745f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.f4741b = resources;
                int i10 = b.E;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = this.f4742c;
                this.f4742c = i11;
                if (i12 == i11) {
                    return;
                }
                this.f4752m = false;
                this.f4749j = false;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f4743d | this.f4744e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f4736x = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f4733u
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.B
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f4735w
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            g.b$c r10 = r13.f4731s
            int r10 = r10.y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f4735w
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.B = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f4734v
            if (r9 == 0) goto L5d
            long r10 = r13.C
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f4734v = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$c r4 = r13.f4731s
            int r4 = r4.f4763z
            int r3 = r3 / r4
            int r4 = r13.f4735w
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.C = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            g.b$a r14 = r13.A
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f4731s;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f4747h;
            Drawable[] drawableArr = cVar.f4746g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null && a.b.b(drawableArr[i11])) {
                    a.b.a(drawableArr[i11], theme);
                    cVar.f4744e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.D == null) {
            this.D = new C0070b();
        }
        C0070b c0070b = this.D;
        c0070b.f4739s = drawable.getCallback();
        drawable.setCallback(c0070b);
        try {
            if (this.f4731s.y <= 0 && this.f4736x) {
                drawable.setAlpha(this.f4735w);
            }
            c cVar = this.f4731s;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.b.h(drawable, cVar.D);
                }
                c cVar2 = this.f4731s;
                if (cVar2.G) {
                    a.b.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f4731s.f4761w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            a.c.b(drawable, a.c.a(this));
            a.C0068a.e(drawable, this.f4731s.A);
            Rect rect = this.f4732t;
            if (rect != null) {
                a.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0070b c0070b2 = this.D;
            Drawable.Callback callback = c0070b2.f4739s;
            c0070b2.f4739s = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f4731s.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.y
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$c r0 = r9.f4731s
            int r0 = r0.f4763z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f4734v
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f4733u
            if (r0 == 0) goto L29
            r9.f4734v = r0
            g.b$c r0 = r9.f4731s
            int r0 = r0.f4763z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.C = r0
            goto L35
        L29:
            r9.f4734v = r4
            r9.C = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f4733u
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b$c r0 = r9.f4731s
            int r1 = r0.f4747h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f4733u = r0
            r9.y = r10
            if (r0 == 0) goto L5a
            g.b$c r10 = r9.f4731s
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.B = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f4733u = r4
            r10 = -1
            r9.y = r10
        L5a:
            long r0 = r9.B
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.C
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            g.b$a r10 = r9.A
            if (r10 != 0) goto L73
            g.b$a r10 = new g.b$a
            r10.<init>()
            r9.A = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4733u;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f4734v;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4735w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f4731s;
        return changingConfigurations | cVar.f4744e | cVar.f4743d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f4731s;
        boolean z10 = true;
        if (!cVar.f4759u) {
            cVar.c();
            cVar.f4759u = true;
            int i10 = cVar.f4747h;
            Drawable[] drawableArr = cVar.f4746g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    cVar.f4760v = true;
                    break;
                } else if (drawableArr[i11].getConstantState() == null) {
                    cVar.f4760v = false;
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            z10 = cVar.f4760v;
        }
        if (z10) {
            this.f4731s.f4743d = getChangingConfigurations();
            return this.f4731s;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f4733u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f4732t;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f4731s;
        if (cVar.f4751l) {
            if (!cVar.f4752m) {
                cVar.b();
            }
            return cVar.f4754o;
        }
        Drawable drawable = this.f4733u;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f4731s;
        if (cVar.f4751l) {
            if (!cVar.f4752m) {
                cVar.b();
            }
            return cVar.f4753n;
        }
        Drawable drawable = this.f4733u;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f4731s;
        if (cVar.f4751l) {
            if (!cVar.f4752m) {
                cVar.b();
            }
            return cVar.f4755q;
        }
        Drawable drawable = this.f4733u;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f4731s;
        if (cVar.f4751l) {
            if (!cVar.f4752m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.f4733u;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4733u;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f4731s;
        if (cVar.f4756r) {
            return cVar.f4757s;
        }
        cVar.c();
        int i11 = cVar.f4747h;
        Drawable[] drawableArr = cVar.f4746g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        cVar.f4757s = i10;
        cVar.f4756r = true;
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f4733u;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean z10;
        c cVar = this.f4731s;
        Rect rect2 = null;
        boolean z11 = false;
        if (!cVar.f4748i) {
            Rect rect3 = cVar.f4750k;
            if (rect3 != null || cVar.f4749j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f4747h;
                Drawable[] drawableArr = cVar.f4746g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f4749j = true;
                cVar.f4750k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z10 = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f4733u;
            z10 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f4731s.A && a.c.a(this) == 1) {
            z11 = true;
        }
        if (z11) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f4731s;
        if (cVar != null) {
            cVar.f4756r = false;
            cVar.f4758t = false;
        }
        if (drawable != this.f4733u || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f4731s.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f4734v;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f4734v = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f4733u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f4736x) {
                this.f4733u.setAlpha(this.f4735w);
            }
        }
        if (this.C != 0) {
            this.C = 0L;
            z10 = true;
        }
        if (this.B != 0) {
            this.B = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4737z && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f4737z = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4734v;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f4733u;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        c cVar = this.f4731s;
        int i11 = this.y;
        int i12 = cVar.f4747h;
        Drawable[] drawableArr = cVar.f4746g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            if (drawableArr[i13] != null) {
                boolean b10 = a.c.b(drawableArr[i13], i10);
                if (i13 == i11) {
                    z10 = b10;
                }
            }
        }
        cVar.f4762x = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f4734v;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f4733u;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4734v;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f4733u;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable != this.f4733u || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (!this.f4736x || this.f4735w != i10) {
            this.f4736x = true;
            this.f4735w = i10;
            Drawable drawable = this.f4733u;
            if (drawable == null) {
                return;
            }
            if (this.B == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f4731s;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f4733u;
            if (drawable == null) {
                return;
            }
            a.C0068a.e(drawable, z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f4731s;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f4733u;
            if (drawable == null) {
                return;
            }
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f4731s;
        if (cVar.f4761w != z10) {
            cVar.f4761w = z10;
            Drawable drawable = this.f4733u;
            if (drawable == null) {
                return;
            }
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f4733u;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f4732t;
        if (rect == null) {
            this.f4732t = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f4733u;
        if (drawable != null) {
            a.b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f4731s;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            a.b.h(this.f4733u, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f4731s;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            a.b.i(this.f4733u, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f4734v;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f4733u;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f4733u || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
