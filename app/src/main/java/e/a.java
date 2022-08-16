package e;

import a6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e.a$a */
    /* loaded from: classes.dex */
    public static class C0061a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f4176a;

        public C0061a() {
            super(-2, -2);
            this.f4176a = 8388627;
        }

        public C0061a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4176a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f185t);
            this.f4176a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0061a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4176a = 0;
        }

        public C0061a(C0061a c0061a) {
            super((ViewGroup.MarginLayoutParams) c0061a);
            this.f4176a = 0;
            this.f4176a = c0061a.f4176a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    public abstract int a();

    public abstract void b();
}
