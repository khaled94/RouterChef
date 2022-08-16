package x5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import d0.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final ColorStateList f20030a;

    /* renamed from: b */
    public final String f20031b;

    /* renamed from: c */
    public final int f20032c;

    /* renamed from: d */
    public final int f20033d;

    /* renamed from: e */
    public final float f20034e;

    /* renamed from: f */
    public final float f20035f;

    /* renamed from: g */
    public final float f20036g;

    /* renamed from: h */
    public final boolean f20037h;

    /* renamed from: i */
    public final float f20038i;

    /* renamed from: j */
    public ColorStateList f20039j;

    /* renamed from: k */
    public float f20040k;

    /* renamed from: l */
    public final int f20041l;

    /* renamed from: m */
    public boolean f20042m = false;

    /* renamed from: n */
    public Typeface f20043n;

    /* loaded from: classes.dex */
    public class a extends g.e {

        /* renamed from: a */
        public final /* synthetic */ f f20044a;

        public a(f fVar) {
            d.this = r1;
            this.f20044a = fVar;
        }

        @Override // d0.g.e
        public final void d(int i10) {
            d.this.f20042m = true;
            this.f20044a.c(i10);
        }

        @Override // d0.g.e
        public final void e(Typeface typeface) {
            d dVar = d.this;
            dVar.f20043n = Typeface.create(typeface, dVar.f20032c);
            d dVar2 = d.this;
            dVar2.f20042m = true;
            this.f20044a.d(dVar2.f20043n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, h6.a.R);
        this.f20040k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f20039j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f20032c = obtainStyledAttributes.getInt(2, 0);
        this.f20033d = obtainStyledAttributes.getInt(1, 1);
        int i11 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f20041l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f20031b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f20030a = c.a(context, obtainStyledAttributes, 6);
        this.f20034e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f20035f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f20036g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, h6.a.K);
        this.f20037h = obtainStyledAttributes2.hasValue(0);
        this.f20038i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f20043n == null && (str = this.f20031b) != null) {
            this.f20043n = Typeface.create(str, this.f20032c);
        }
        if (this.f20043n == null) {
            int i10 = this.f20033d;
            this.f20043n = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f20043n = Typeface.create(this.f20043n, this.f20032c);
        }
    }

    public final Typeface b(Context context) {
        if (this.f20042m) {
            return this.f20043n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = g.a(context, this.f20041l);
                this.f20043n = a10;
                if (a10 != null) {
                    this.f20043n = Typeface.create(a10, this.f20032c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Error loading font ");
                c10.append(this.f20031b);
                Log.d("TextAppearance", c10.toString(), e10);
            }
        }
        a();
        this.f20042m = true;
        return this.f20043n;
    }

    public final void c(Context context, f fVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f20041l;
        if (i10 == 0) {
            this.f20042m = true;
        }
        if (this.f20042m) {
            fVar.d(this.f20043n, true);
            return;
        }
        try {
            a aVar = new a(fVar);
            ThreadLocal<TypedValue> threadLocal = g.f3704a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                g.b(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f20042m = true;
            fVar.c(1);
        } catch (Exception e10) {
            StringBuilder c10 = androidx.activity.result.a.c("Error loading font ");
            c10.append(this.f20031b);
            Log.d("TextAppearance", c10.toString(), e10);
            this.f20042m = true;
            fVar.c(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f20041l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = d0.g.f3704a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = d0.g.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, f fVar) {
        f(context, textPaint, fVar);
        ColorStateList colorStateList = this.f20039j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f20036g;
        float f11 = this.f20034e;
        float f12 = this.f20035f;
        ColorStateList colorStateList2 = this.f20030a;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, f fVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f20043n);
        c(context, new e(this, context, textPaint, fVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = g.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f20032c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f20040k);
        if (this.f20037h) {
            textPaint.setLetterSpacing(this.f20038i);
        }
    }
}
