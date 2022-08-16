package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.l;
import c0.a;
import com.raouf.routerchef.R;
import f0.a;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.h;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: i */
    public static v0 f1022i;

    /* renamed from: a */
    public WeakHashMap<Context, h<ColorStateList>> f1024a;

    /* renamed from: b */
    public r.g<String, e> f1025b;

    /* renamed from: c */
    public h<String> f1026c;

    /* renamed from: d */
    public final WeakHashMap<Context, r.d<WeakReference<Drawable.ConstantState>>> f1027d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1028e;

    /* renamed from: f */
    public boolean f1029f;

    /* renamed from: g */
    public f f1030g;

    /* renamed from: h */
    public static final PorterDuff.Mode f1021h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f1023j = new c();

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.v0.e
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return g.a.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.v0.e
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                q1.b bVar = new q1.b(context);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends r.e<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.v0.e
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    h.b.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.v0.e
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return q1.f.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized v0 d() {
        v0 v0Var;
        synchronized (v0.class) {
            if (f1022i == null) {
                v0 v0Var2 = new v0();
                f1022i = v0Var2;
                j(v0Var2);
            }
            v0Var = f1022i;
        }
        return v0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (v0.class) {
            c cVar = f1023j;
            Objects.requireNonNull(cVar);
            int i11 = (i10 + 31) * 31;
            b10 = cVar.b(Integer.valueOf(mode.hashCode() + i11));
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                Objects.requireNonNull(cVar);
                cVar.c(Integer.valueOf(mode.hashCode() + i11), b10);
            }
        }
        return b10;
    }

    public static void j(v0 v0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            v0Var.a("vector", new g());
            v0Var.a("animated-vector", new b());
            v0Var.a("animated-selector", new a());
            v0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1025b == null) {
            this.f1025b = new r.g<>();
        }
        this.f1025b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j3, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            r.d<WeakReference<Drawable.ConstantState>> dVar = this.f1027d.get(context);
            if (dVar == null) {
                dVar = new r.d<>();
                this.f1027d.put(context, dVar);
            }
            dVar.f(j3, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final Drawable c(Context context, int i10) {
        int i11;
        if (this.f1028e == null) {
            this.f1028e = new TypedValue();
        }
        TypedValue typedValue = this.f1028e;
        context.getResources().getValue(i10, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j3);
        if (e10 != null) {
            return e10;
        }
        f fVar = this.f1030g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            l.a aVar = (l.a) fVar;
            Objects.requireNonNull(aVar);
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230751)});
            } else {
                if (i10 == R.drawable.abc_ratingbar_material) {
                    i11 = R.dimen.abc_star_big;
                } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                    i11 = R.dimen.abc_star_medium;
                } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                    i11 = R.dimen.abc_star_small;
                }
                layerDrawable = aVar.c(this, context, i11);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j3) {
        r.d<WeakReference<Drawable.ConstantState>> dVar = this.f1027d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e10 = dVar.e(j3, null);
        if (e10 != null) {
            Drawable.ConstantState constantState = e10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int d5 = l4.b.d(dVar.f17173t, dVar.f17175v, j3);
            if (d5 >= 0) {
                Object[] objArr = dVar.f17174u;
                Object obj = objArr[d5];
                Object obj2 = r.d.f17171w;
                if (obj != obj2) {
                    objArr[d5] = obj2;
                    dVar.f17172s = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    public final synchronized Drawable g(Context context, int i10, boolean z10) {
        Drawable k10;
        if (!this.f1029f) {
            boolean z11 = true;
            this.f1029f = true;
            Drawable f10 = f(context, R.drawable.abc_vector_test);
            if (f10 != null) {
                if (!(f10 instanceof q1.f) && !"android.graphics.drawable.VectorDrawable".equals(f10.getClass().getName())) {
                    z11 = false;
                }
            }
            this.f1029f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        k10 = k(context, i10);
        if (k10 == null) {
            k10 = c(context, i10);
        }
        if (k10 == null) {
            Object obj = c0.a.f2602a;
            k10 = a.b.b(context, i10);
        }
        if (k10 != null) {
            k10 = l(context, i10, z10, k10);
        }
        if (k10 != null) {
            m0.b(k10);
        }
        return k10;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList c10;
        h<ColorStateList> hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f1024a;
        ColorStateList colorStateList = null;
        c10 = (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) ? null : hVar.c(i10, null);
        if (c10 == null) {
            f fVar = this.f1030g;
            if (fVar != null) {
                colorStateList = ((l.a) fVar).d(context, i10);
            }
            if (colorStateList != null) {
                if (this.f1024a == null) {
                    this.f1024a = new WeakHashMap<>();
                }
                h<ColorStateList> hVar2 = this.f1024a.get(context);
                if (hVar2 == null) {
                    hVar2 = new h<>();
                    this.f1024a.put(context, hVar2);
                }
                hVar2.a(i10, colorStateList);
            }
            c10 = colorStateList;
        }
        return c10;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        r.g<String, e> gVar = this.f1025b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        h<String> hVar = this.f1026c;
        if (hVar != null) {
            String c10 = hVar.c(i10, null);
            if ("appcompat_skip_skip".equals(c10) || (c10 != null && this.f1025b.getOrDefault(c10, null) == null)) {
                return null;
            }
        } else {
            this.f1026c = new h<>();
        }
        if (this.f1028e == null) {
            this.f1028e = new TypedValue();
        }
        TypedValue typedValue = this.f1028e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j3);
        if (e10 != null) {
            return e10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1026c.a(i10, name);
                e orDefault = this.f1025b.getOrDefault(name, null);
                if (orDefault != null) {
                    e10 = orDefault.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e10 != null) {
                    e10.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j3, e10);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (e10 == null) {
            this.f1026c.a(i10, "appcompat_skip_skip");
        }
        return e10;
    }

    public final Drawable l(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList i11 = i(context, i10);
        PorterDuff.Mode mode = null;
        if (i11 != null) {
            if (m0.a(drawable)) {
                drawable = drawable.mutate();
            }
            a.b.h(drawable, i11);
            if (this.f1030g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            a.b.i(drawable, mode);
            return drawable;
        }
        f fVar = this.f1030g;
        if (fVar != null) {
            l.a aVar = (l.a) fVar;
            boolean z11 = true;
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c10 = a1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = l.f930b;
                aVar.e(findDrawableByLayerId, c10, mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(16908303), a1.c(context, R.attr.colorControlNormal), mode2);
                aVar.e(layerDrawable.findDrawableByLayerId(16908301), a1.c(context, R.attr.colorControlActivated), mode2);
            } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b10 = a1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = l.f930b;
                aVar.e(findDrawableByLayerId2, b10, mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908303), a1.c(context, R.attr.colorControlActivated), mode3);
                aVar.e(layerDrawable2.findDrawableByLayerId(16908301), a1.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z11 = false;
            }
            if (z11) {
                return drawable;
            }
        }
        if (!m(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.v0$f r0 = r7.f1030g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6f
            androidx.appcompat.widget.l$a r0 = (androidx.appcompat.widget.l.a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.l.f930b
            int[] r4 = r0.f933a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1a
            r5 = 2130968817(0x7f0400f1, float:1.7546298E38)
            goto L46
        L1a:
            int[] r4 = r0.f935c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L26
            r5 = 2130968815(0x7f0400ef, float:1.7546294E38)
            goto L46
        L26:
            int[] r4 = r0.f936d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L31
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L46
        L31:
            r0 = 2131230771(0x7f080033, float:1.8077604E38)
            if (r9 != r0) goto L41
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L48
        L41:
            r0 = 2131230753(0x7f080021, float:1.8077568E38)
            if (r9 != r0) goto L4a
        L46:
            r9 = r5
            r0 = r6
        L48:
            r4 = r1
            goto L4d
        L4a:
            r9 = r2
            r4 = r9
            r0 = r6
        L4d:
            if (r4 == 0) goto L6b
            boolean r4 = androidx.appcompat.widget.m0.a(r10)
            if (r4 == 0) goto L59
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L59:
            int r8 = androidx.appcompat.widget.a1.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.l.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L69
            r10.setAlpha(r0)
        L69:
            r8 = r1
            goto L6c
        L6b:
            r8 = r2
        L6c:
            if (r8 == 0) goto L6f
            goto L70
        L6f:
            r1 = r2
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
