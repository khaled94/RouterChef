package d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import d0.g;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f3704a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<d, SparseArray<c>> f3705b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f3706c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final ColorStateList f3707a;

        /* renamed from: b */
        public final Configuration f3708b;

        /* renamed from: c */
        public final int f3709c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f3707a = colorStateList;
            this.f3708b = configuration;
            this.f3709c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final Resources f3710a;

        /* renamed from: b */
        public final Resources.Theme f3711b;

        public d(Resources resources, Resources.Theme theme) {
            this.f3710a = resources;
            this.f3711b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3710a.equals(dVar.f3710a) && l0.b.a(this.f3711b, dVar.f3711b);
        }

        public final int hashCode() {
            return l0.b.b(this.f3710a, this.f3711b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public static Handler c() {
            return new Handler(Looper.getMainLooper());
        }

        public final void a(final int i10) {
            c().post(new Runnable() { // from class: d0.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.e.this.d(i10);
                }
            });
        }

        public final void b(final Typeface typeface) {
            c().post(new Runnable() { // from class: d0.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.e.this.e(typeface);
                }
            });
        }

        public abstract void d(int i10);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r20 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r20.a(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r20 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, d0.g.e r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.b(android.content.Context, int, android.util.TypedValue, int, d0.g$e, boolean, boolean):android.graphics.Typeface");
    }
}
