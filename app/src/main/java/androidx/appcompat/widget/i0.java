package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: l */
    public static final RectF f874l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f875m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    public static ConcurrentHashMap<String, Field> f876n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f877a = 0;

    /* renamed from: b */
    public boolean f878b = false;

    /* renamed from: c */
    public float f879c = -1.0f;

    /* renamed from: d */
    public float f880d = -1.0f;

    /* renamed from: e */
    public float f881e = -1.0f;

    /* renamed from: f */
    public int[] f882f = new int[0];

    /* renamed from: g */
    public boolean f883g = false;

    /* renamed from: h */
    public TextPaint f884h;

    /* renamed from: i */
    public final TextView f885i;

    /* renamed from: j */
    public final Context f886j;

    /* renamed from: k */
    public final a f887k;

    /* loaded from: classes.dex */
    public static class a extends c {
        public void b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) i0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.appcompat.widget.i0.c
        public boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // androidx.appcompat.widget.i0.a
        public void b(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a(TextView textView) {
            return ((Boolean) i0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public i0(TextView textView) {
        this.f885i = textView;
        this.f886j = textView.getContext();
        this.f887k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static Method d(String str) {
        try {
            Method method = f875m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f875m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    public final void a() {
        if (!(i() && this.f877a != 0)) {
            return;
        }
        if (this.f878b) {
            if (this.f885i.getMeasuredHeight() <= 0 || this.f885i.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f887k.a(this.f885i) ? 1048576 : (this.f885i.getMeasuredWidth() - this.f885i.getTotalPaddingLeft()) - this.f885i.getTotalPaddingRight();
            int height = (this.f885i.getHeight() - this.f885i.getCompoundPaddingBottom()) - this.f885i.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f874l;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = measuredWidth;
                rectF.bottom = height;
                float c10 = c(rectF);
                if (c10 != this.f885i.getTextSize()) {
                    f(0, c10);
                }
            }
        }
        this.f878b = true;
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f882f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f882f[i13];
                CharSequence text = this.f885i.getText();
                TransformationMethod transformationMethod = this.f885i.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f885i)) != null) {
                    text = transformation;
                }
                int maxLines = this.f885i.getMaxLines();
                TextPaint textPaint = this.f884h;
                if (textPaint == null) {
                    this.f884h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f884h.set(this.f885i.getPaint());
                this.f884h.setTextSize(i14);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f884h, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) e(this.f885i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f885i.getLineSpacingExtra(), this.f885i.getLineSpacingMultiplier()).setIncludePad(this.f885i.getIncludeFontPadding()).setBreakStrategy(this.f885i.getBreakStrategy()).setHyphenationFrequency(this.f885i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f887k.b(obtain, this.f885i);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f882f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i10, float f10) {
        Context context = this.f886j;
        float applyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f885i.getPaint().getTextSize()) {
            this.f885i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f885i.isInLayout();
            if (this.f885i.getLayout() == null) {
                return;
            }
            this.f878b = false;
            try {
                Method d5 = d("nullLayouts");
                if (d5 != null) {
                    d5.invoke(this.f885i, new Object[0]);
                }
            } catch (Exception e10) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
            }
            if (!isInLayout) {
                this.f885i.requestLayout();
            } else {
                this.f885i.forceLayout();
            }
            this.f885i.invalidate();
        }
    }

    public final boolean g() {
        if (!i() || this.f877a != 1) {
            this.f878b = false;
        } else {
            if (!this.f883g || this.f882f.length == 0) {
                int floor = ((int) Math.floor((this.f881e - this.f880d) / this.f879c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f879c) + this.f880d);
                }
                this.f882f = b(iArr);
            }
            this.f878b = true;
        }
        return this.f878b;
    }

    public final boolean h() {
        int[] iArr = this.f882f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f883g = z10;
        if (z10) {
            this.f877a = 1;
            this.f880d = iArr[0];
            this.f881e = iArr[length - 1];
            this.f879c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f885i instanceof m);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f877a = 1;
            this.f880d = f10;
            this.f881e = f11;
            this.f879c = f12;
            this.f883g = false;
        }
    }
}
