package q0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;
import k0.b;
import l0.g;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f17044a;

        /* renamed from: b */
        public final TextView f17045b;

        /* renamed from: c */
        public Class<?> f17046c;

        /* renamed from: d */
        public Method f17047d;

        /* renamed from: e */
        public boolean f17048e;

        /* renamed from: f */
        public boolean f17049f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f17044a = callback;
            this.f17045b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f17044a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f17044a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f17044a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.k.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r7 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r5 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k0.b.a a(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            k0.b$a r0 = new k0.b$a
            android.text.PrecomputedText$Params r7 = q0.k.e.b(r7)
            r0.<init>(r7)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = q0.k.c.a(r7)
            int r4 = q0.k.c.d(r7)
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L75
        L2e:
            r5 = 0
            r6 = 1
            if (r0 < r1) goto L57
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L57
            java.util.Locale r7 = q0.k.b.d(r7)
            android.icu.text.DecimalFormatSymbols r7 = q0.k.d.a(r7)
            java.lang.String[] r7 = q0.k.e.a(r7)
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L6d
            r0 = 2
            if (r7 != r0) goto L2b
            goto L6d
        L57:
            int r0 = q0.k.b.b(r7)
            if (r0 != r6) goto L5e
            r5 = r6
        L5e:
            int r7 = q0.k.b.c(r7)
            switch(r7) {
                case 2: goto L70;
                case 3: goto L2b;
                case 4: goto L6d;
                case 5: goto L6a;
                case 6: goto L73;
                case 7: goto L67;
                default: goto L65;
            }
        L65:
            if (r5 == 0) goto L73
        L67:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L75
        L6a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L75
        L6d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L75
        L70:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L75
        L73:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L75:
            k0.b$a r0 = new k0.b$a
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.k.a(android.widget.TextView):k0.b$a");
    }

    public static void b(TextView textView, int i10) {
        g.c(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 <= Math.abs(i11)) {
            return;
        }
        textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
    }

    public static void c(TextView textView, int i10) {
        g.c(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void d(TextView textView, int i10) {
        g.c(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void e(TextView textView, k0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(bVar);
            textView.setText((CharSequence) null);
            return;
        }
        b.a a10 = a(textView);
        Objects.requireNonNull(bVar);
        a10.a(null);
        throw null;
    }

    public static ActionMode.Callback f(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).f17044a;
    }

    public static ActionMode.Callback g(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
