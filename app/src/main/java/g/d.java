package g;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import g.b;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class d extends b {
    public a F;
    public boolean G;

    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f4746g.length];
            }
        }

        @Override // g.b.c
        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.H;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.H = iArr2;
        }

        public final int g(int[] iArr) {
            int[][] iArr2 = this.H;
            int i10 = this.f4747h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d() {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // g.b
    public void e(b.c cVar) {
        this.f4731s = cVar;
        int i10 = this.y;
        if (i10 >= 0) {
            Drawable d5 = cVar.d(i10);
            this.f4733u = d5;
            if (d5 != null) {
                c(d5);
            }
        }
        this.f4734v = null;
        if (cVar instanceof a) {
            this.F = (a) cVar;
        }
    }

    /* renamed from: f */
    public a b() {
        return new a(this.F, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.G) {
            super.mutate();
            this.F.e();
            this.G = true;
        }
        return this;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g10 = this.F.g(iArr);
        if (g10 < 0) {
            g10 = this.F.g(StateSet.WILD_CARD);
        }
        return d(g10) || onStateChange;
    }
}
