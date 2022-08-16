package androidx.appcompat.widget;

import a6.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d0.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.z;
import p0.a;
import q0.b;
import q0.k;
import q0.m;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final TextView f830a;

    /* renamed from: b */
    public d1 f831b;

    /* renamed from: c */
    public d1 f832c;

    /* renamed from: d */
    public d1 f833d;

    /* renamed from: e */
    public d1 f834e;

    /* renamed from: f */
    public d1 f835f;

    /* renamed from: g */
    public d1 f836g;

    /* renamed from: h */
    public d1 f837h;

    /* renamed from: i */
    public final i0 f838i;

    /* renamed from: j */
    public int f839j = 0;

    /* renamed from: k */
    public int f840k = -1;

    /* renamed from: l */
    public Typeface f841l;

    /* renamed from: m */
    public boolean f842m;

    /* loaded from: classes.dex */
    public class a extends g.e {

        /* renamed from: a */
        public final /* synthetic */ int f843a;

        /* renamed from: b */
        public final /* synthetic */ int f844b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f845c;

        public a(int i10, int i11, WeakReference weakReference) {
            f0.this = r1;
            this.f843a = i10;
            this.f844b = i11;
            this.f845c = weakReference;
        }

        @Override // d0.g.e
        public final void d(int i10) {
        }

        @Override // d0.g.e
        public final void e(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f843a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f844b & 2) != 0);
            }
            f0 f0Var = f0.this;
            WeakReference weakReference = this.f845c;
            if (f0Var.f842m) {
                f0Var.f841l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView == null) {
                    return;
                }
                WeakHashMap<View, m0.f0> weakHashMap = z.f5921a;
                if (z.g.b(textView)) {
                    textView.post(new g0(textView, typeface, f0Var.f839j));
                } else {
                    textView.setTypeface(typeface, f0Var.f839j);
                }
            }
        }
    }

    public f0(TextView textView) {
        this.f830a = textView;
        this.f838i = new i0(textView);
    }

    public static d1 d(Context context, l lVar, int i10) {
        ColorStateList d5 = lVar.d(context, i10);
        if (d5 != null) {
            d1 d1Var = new d1();
            d1Var.f819d = true;
            d1Var.f816a = d5;
            return d1Var;
        }
        return null;
    }

    public final void a(Drawable drawable, d1 d1Var) {
        if (drawable == null || d1Var == null) {
            return;
        }
        l.f(drawable, d1Var, this.f830a.getDrawableState());
    }

    public final void b() {
        if (this.f831b != null || this.f832c != null || this.f833d != null || this.f834e != null) {
            Drawable[] compoundDrawables = this.f830a.getCompoundDrawables();
            a(compoundDrawables[0], this.f831b);
            a(compoundDrawables[1], this.f832c);
            a(compoundDrawables[2], this.f833d);
            a(compoundDrawables[3], this.f834e);
        }
        if (this.f835f == null && this.f836g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f830a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f835f);
        a(compoundDrawablesRelative[2], this.f836g);
    }

    public final void c() {
        this.f838i.a();
    }

    public final boolean e() {
        i0 i0Var = this.f838i;
        return i0Var.i() && i0Var.f877a != 0;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i10) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        int i11;
        int resourceId;
        Context context = this.f830a.getContext();
        l a10 = l.a();
        int[] iArr = f.f190z;
        f1 q10 = f1.q(context, attributeSet, iArr, i10);
        TextView textView = this.f830a;
        z.o(textView, textView.getContext(), iArr, attributeSet, q10.f848b, i10);
        int l10 = q10.l(0, -1);
        if (q10.o(3)) {
            this.f831b = d(context, a10, q10.l(3, 0));
        }
        if (q10.o(1)) {
            this.f832c = d(context, a10, q10.l(1, 0));
        }
        if (q10.o(4)) {
            this.f833d = d(context, a10, q10.l(4, 0));
        }
        if (q10.o(2)) {
            this.f834e = d(context, a10, q10.l(2, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (q10.o(5)) {
            this.f835f = d(context, a10, q10.l(5, 0));
        }
        if (q10.o(6)) {
            this.f836g = d(context, a10, q10.l(6, 0));
        }
        q10.r();
        boolean z12 = this.f830a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (l10 != -1) {
            f1 f1Var = new f1(context, context.obtainStyledAttributes(l10, f.P));
            if (z12 || !f1Var.o(14)) {
                z11 = false;
                z10 = false;
            } else {
                z11 = f1Var.a(14, false);
                z10 = true;
            }
            o(context, f1Var);
            str2 = f1Var.o(15) ? f1Var.m(15) : null;
            str = (i12 < 26 || !f1Var.o(13)) ? null : f1Var.m(13);
            f1Var.r();
        } else {
            z11 = false;
            z10 = false;
            str2 = null;
            str = null;
        }
        f1 f1Var2 = new f1(context, context.obtainStyledAttributes(attributeSet, f.P, i10, 0));
        if (!z12 && f1Var2.o(14)) {
            z11 = f1Var2.a(14, false);
            z10 = true;
        }
        if (f1Var2.o(15)) {
            str2 = f1Var2.m(15);
        }
        String str3 = str2;
        if (i12 >= 26 && f1Var2.o(13)) {
            str = f1Var2.m(13);
        }
        String str4 = str;
        if (i12 >= 28 && f1Var2.o(0) && f1Var2.f(0, -1) == 0) {
            this.f830a.setTextSize(0, 0.0f);
        }
        o(context, f1Var2);
        f1Var2.r();
        if (!z12 && z10) {
            i(z11);
        }
        Typeface typeface = this.f841l;
        if (typeface != null) {
            if (this.f840k == -1) {
                this.f830a.setTypeface(typeface, this.f839j);
            } else {
                this.f830a.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            this.f830a.setFontVariationSettings(str4);
        }
        if (str3 != null) {
            if (i12 >= 24) {
                this.f830a.setTextLocales(LocaleList.forLanguageTags(str3));
            } else {
                this.f830a.setTextLocale(Locale.forLanguageTag(str3.substring(0, str3.indexOf(44))));
            }
        }
        i0 i0Var = this.f838i;
        Context context2 = i0Var.f886j;
        int[] iArr2 = f.A;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        TextView textView2 = i0Var.f885i;
        z.o(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            i0Var.f877a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr3[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                i0Var.f882f = i0Var.b(iArr3);
                i0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!i0Var.i()) {
            i0Var.f877a = 0;
        } else if (i0Var.f877a == 1) {
            if (!i0Var.f883g) {
                DisplayMetrics displayMetrics = i0Var.f886j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i11 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i11 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                i0Var.j(dimension2, dimension3, dimension);
            }
            i0Var.g();
        }
        if (b.f17043g) {
            i0 i0Var2 = this.f838i;
            if (i0Var2.f877a != 0) {
                int[] iArr4 = i0Var2.f882f;
                if (iArr4.length > 0) {
                    if (this.f830a.getAutoSizeStepGranularity() != -1.0f) {
                        this.f830a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f838i.f880d), Math.round(this.f838i.f881e), Math.round(this.f838i.f879c), 0);
                    } else {
                        this.f830a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                    }
                }
            }
        }
        f1 f1Var3 = new f1(context, context.obtainStyledAttributes(attributeSet, f.A));
        int l11 = f1Var3.l(8, -1);
        Drawable b10 = l11 != -1 ? a10.b(context, l11) : null;
        int l12 = f1Var3.l(13, -1);
        Drawable b11 = l12 != -1 ? a10.b(context, l12) : null;
        int l13 = f1Var3.l(9, -1);
        Drawable b12 = l13 != -1 ? a10.b(context, l13) : null;
        int l14 = f1Var3.l(6, -1);
        Drawable b13 = l14 != -1 ? a10.b(context, l14) : null;
        int l15 = f1Var3.l(10, -1);
        Drawable b14 = l15 != -1 ? a10.b(context, l15) : null;
        int l16 = f1Var3.l(7, -1);
        Drawable b15 = l16 != -1 ? a10.b(context, l16) : null;
        if (b14 != null || b15 != null) {
            Drawable[] compoundDrawablesRelative = this.f830a.getCompoundDrawablesRelative();
            TextView textView3 = this.f830a;
            if (b14 == null) {
                b14 = compoundDrawablesRelative[0];
            }
            if (b11 == null) {
                b11 = compoundDrawablesRelative[1];
            }
            if (b15 == null) {
                b15 = compoundDrawablesRelative[2];
            }
            if (b13 == null) {
                b13 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(b14, b11, b15, b13);
        } else if (b10 != null || b11 != null || b12 != null || b13 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f830a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f830a.getCompoundDrawables();
                TextView textView4 = this.f830a;
                if (b10 == null) {
                    b10 = compoundDrawables[0];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[2];
                }
                if (b13 == null) {
                    b13 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, b13);
            } else {
                TextView textView5 = this.f830a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (b11 == null) {
                    b11 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b13 == null) {
                    b13 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b11, drawable2, b13);
            }
        }
        if (f1Var3.o(11)) {
            ColorStateList c10 = f1Var3.c(11);
            TextView textView6 = this.f830a;
            Objects.requireNonNull(textView6);
            if (Build.VERSION.SDK_INT >= 24) {
                k.c.f(textView6, c10);
            } else if (textView6 instanceof m) {
                ((m) textView6).setSupportCompoundDrawablesTintList(c10);
            }
        }
        if (f1Var3.o(12)) {
            PorterDuff.Mode e10 = m0.e(f1Var3.j(12, -1), null);
            TextView textView7 = this.f830a;
            Objects.requireNonNull(textView7);
            if (Build.VERSION.SDK_INT >= 24) {
                k.c.g(textView7, e10);
            } else if (textView7 instanceof m) {
                ((m) textView7).setSupportCompoundDrawablesTintMode(e10);
            }
        }
        int f10 = f1Var3.f(15, -1);
        int f11 = f1Var3.f(18, -1);
        int f12 = f1Var3.f(19, -1);
        f1Var3.r();
        if (f10 != -1) {
            k.b(this.f830a, f10);
        }
        if (f11 != -1) {
            k.c(this.f830a, f11);
        }
        if (f12 != -1) {
            k.d(this.f830a, f12);
        }
    }

    public final void g(Context context, int i10) {
        String m10;
        f1 f1Var = new f1(context, context.obtainStyledAttributes(i10, f.P));
        if (f1Var.o(14)) {
            i(f1Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (f1Var.o(0) && f1Var.f(0, -1) == 0) {
            this.f830a.setTextSize(0, 0.0f);
        }
        o(context, f1Var);
        if (i11 >= 26 && f1Var.o(13) && (m10 = f1Var.m(13)) != null) {
            this.f830a.setFontVariationSettings(m10);
        }
        f1Var.r();
        Typeface typeface = this.f841l;
        if (typeface != null) {
            this.f830a.setTypeface(typeface, this.f839j);
        }
    }

    public final void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            a.C0100a.a(editorInfo, text);
            return;
        }
        Objects.requireNonNull(text);
        if (i10 >= 30) {
            a.C0100a.a(editorInfo, text);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 + 0 : i11 + 0;
        int i14 = i11 > i12 ? i11 - 0 : i12 + 0;
        int length = text.length();
        if (i13 >= 0 && i14 <= length) {
            int i15 = editorInfo.inputType & 4095;
            if (!(i15 == 129 || i15 == 225 || i15 == 18)) {
                if (length <= 2048) {
                    p0.a.d(editorInfo, text, i13, i14);
                    return;
                }
                int i16 = i14 - i13;
                int i17 = i16 > 1024 ? 0 : i16;
                int i18 = 2048 - i17;
                int min = Math.min(text.length() - i14, i18 - Math.min(i13, (int) (i18 * 0.8d)));
                int min2 = Math.min(i13, i18 - min);
                int i19 = i13 - min2;
                if (p0.a.b(text, i19, 0)) {
                    i19++;
                    min2--;
                }
                if (p0.a.b(text, (i14 + min) - 1, 1)) {
                    min--;
                }
                CharSequence concat = i17 != i16 ? TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i14, min + i14)) : text.subSequence(i19, min2 + i17 + min + i19);
                int i20 = min2 + 0;
                p0.a.d(editorInfo, concat, i20, i17 + i20);
                return;
            }
        }
        p0.a.d(editorInfo, null, 0, 0);
    }

    public final void i(boolean z10) {
        this.f830a.setAllCaps(z10);
    }

    public final void j(int i10, int i11, int i12, int i13) {
        i0 i0Var = this.f838i;
        if (i0Var.i()) {
            DisplayMetrics displayMetrics = i0Var.f886j.getResources().getDisplayMetrics();
            i0Var.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (!i0Var.g()) {
                return;
            }
            i0Var.a();
        }
    }

    public final void k(int[] iArr, int i10) {
        i0 i0Var = this.f838i;
        if (i0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = i0Var.f886j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                i0Var.f882f = i0Var.b(iArr2);
                if (!i0Var.h()) {
                    StringBuilder c10 = androidx.activity.result.a.c("None of the preset sizes is valid: ");
                    c10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(c10.toString());
                }
            } else {
                i0Var.f883g = false;
            }
            if (!i0Var.g()) {
                return;
            }
            i0Var.a();
        }
    }

    public final void l(int i10) {
        i0 i0Var = this.f838i;
        if (i0Var.i()) {
            if (i10 == 0) {
                i0Var.f877a = 0;
                i0Var.f880d = -1.0f;
                i0Var.f881e = -1.0f;
                i0Var.f879c = -1.0f;
                i0Var.f882f = new int[0];
                i0Var.f878b = false;
            } else if (i10 != 1) {
                throw new IllegalArgumentException(e0.a("Unknown auto-size text type: ", i10));
            } else {
                DisplayMetrics displayMetrics = i0Var.f886j.getResources().getDisplayMetrics();
                i0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (!i0Var.g()) {
                    return;
                }
                i0Var.a();
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        if (this.f837h == null) {
            this.f837h = new d1();
        }
        d1 d1Var = this.f837h;
        d1Var.f816a = colorStateList;
        d1Var.f819d = colorStateList != null;
        this.f831b = d1Var;
        this.f832c = d1Var;
        this.f833d = d1Var;
        this.f834e = d1Var;
        this.f835f = d1Var;
        this.f836g = d1Var;
    }

    public final void n(PorterDuff.Mode mode) {
        if (this.f837h == null) {
            this.f837h = new d1();
        }
        d1 d1Var = this.f837h;
        d1Var.f817b = mode;
        d1Var.f818c = mode != null;
        this.f831b = d1Var;
        this.f832c = d1Var;
        this.f833d = d1Var;
        this.f834e = d1Var;
        this.f835f = d1Var;
        this.f836g = d1Var;
    }

    public final void o(Context context, f1 f1Var) {
        String m10;
        Typeface typeface;
        Typeface typeface2;
        this.f839j = f1Var.j(2, this.f839j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int j3 = f1Var.j(11, -1);
            this.f840k = j3;
            if (j3 != -1) {
                this.f839j = (this.f839j & 2) | 0;
            }
        }
        int i11 = 10;
        if (!f1Var.o(10) && !f1Var.o(12)) {
            if (!f1Var.o(1)) {
                return;
            }
            this.f842m = false;
            int j10 = f1Var.j(1, 1);
            if (j10 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j10 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j10 != 3) {
                return;
            } else {
                typeface2 = Typeface.MONOSPACE;
            }
            this.f841l = typeface2;
            return;
        }
        this.f841l = null;
        if (f1Var.o(12)) {
            i11 = 12;
        }
        int i12 = this.f840k;
        int i13 = this.f839j;
        if (!context.isRestricted()) {
            try {
                Typeface i14 = f1Var.i(i11, this.f839j, new a(i12, i13, new WeakReference(this.f830a)));
                if (i14 != null) {
                    if (i10 >= 28 && this.f840k != -1) {
                        i14 = Typeface.create(Typeface.create(i14, 0), this.f840k, (this.f839j & 2) != 0);
                    }
                    this.f841l = i14;
                }
                this.f842m = this.f841l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f841l != null || (m10 = f1Var.m(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f840k == -1) {
            typeface = Typeface.create(m10, this.f839j);
        } else {
            Typeface create = Typeface.create(m10, 0);
            int i15 = this.f840k;
            if ((this.f839j & 2) != 0) {
                z10 = true;
            }
            typeface = Typeface.create(create, i15, z10);
        }
        this.f841l = typeface;
    }
}
