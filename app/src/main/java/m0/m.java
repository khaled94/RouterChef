package m0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public ViewParent f5910a;

    /* renamed from: b */
    public ViewParent f5911b;

    /* renamed from: c */
    public final View f5912c;

    /* renamed from: d */
    public boolean f5913d;

    /* renamed from: e */
    public int[] f5914e;

    public m(View view) {
        this.f5912c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent f12;
        if (!this.f5913d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return d0.a(f12, this.f5912c, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f5913d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return d0.b(f12, this.f5912c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f5913d || (f10 = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f5912c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i14 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f5914e == null) {
                this.f5914e = new int[2];
            }
            iArr3 = this.f5914e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f5912c;
        if (f10 instanceof n) {
            ((n) f10).j(view, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                d0.c(f10, view, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            this.f5912c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f10;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f5913d || (f10 = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f5912c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i15 = iArr[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f5914e == null) {
                this.f5914e = new int[2];
            }
            int[] iArr4 = this.f5914e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f5912c;
        if (f10 instanceof o) {
            ((o) f10).m(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f10 instanceof n) {
                ((n) f10).n(view, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    d0.d(f10, view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            this.f5912c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return this.f5911b;
            }
            return null;
        }
        return this.f5910a;
    }

    public final boolean g(int i10) {
        return f(i10) != null;
    }

    public final boolean h(int i10, int i11) {
        boolean z10;
        if (g(i11)) {
            return true;
        }
        if (this.f5913d) {
            View view = this.f5912c;
            for (ViewParent parent = this.f5912c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f5912c;
                boolean z11 = parent instanceof n;
                if (z11) {
                    z10 = ((n) parent).o(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            z10 = d0.f(parent, view, view2, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    if (i11 == 0) {
                        this.f5910a = parent;
                    } else if (i11 == 1) {
                        this.f5911b = parent;
                    }
                    View view3 = this.f5912c;
                    if (z11) {
                        ((n) parent).h(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            d0.e(parent, view, view3, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void i(int i10) {
        ViewParent f10 = f(i10);
        if (f10 != null) {
            View view = this.f5912c;
            if (f10 instanceof n) {
                ((n) f10).i(view, i10);
            } else if (i10 == 0) {
                try {
                    d0.g(f10, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f5910a = null;
            } else if (i10 != 1) {
            } else {
                this.f5911b = null;
            }
        }
    }
}
