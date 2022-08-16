package d0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final Shader f3688a;

    /* renamed from: b */
    public final ColorStateList f3689b;

    /* renamed from: c */
    public int f3690c;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f3688a = shader;
        this.f3689b = colorStateList;
        this.f3690c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0164, code lost:
        if (r7.size() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0166, code lost:
        r0 = new d0.f((java.util.List<java.lang.Integer>) r7, (java.util.List<java.lang.Float>) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016c, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016d, code lost:
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0172, code lost:
        if (r19 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0174, code lost:
        r0 = new d0.f(r5, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
        r0 = new d0.f(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017c, code lost:
        if (r11 == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017f, code lost:
        if (r11 == 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0181, code lost:
        r4 = r0.f3702a;
        r0 = r0.f3703b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0187, code lost:
        if (r6 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0189, code lost:
        if (r6 == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018e, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0191, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r25, (float) r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a4, code lost:
        r3 = new android.graphics.SweepGradient((float) r7, (float) r9, r0.f3702a, r0.f3703b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b9, code lost:
        if (r7 <= 0.0f) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bb, code lost:
        r1 = r0.f3702a;
        r0 = r0.f3703b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c2, code lost:
        if (r6 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c5, code lost:
        if (r6 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c7, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ca, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cf, code lost:
        r3 = new android.graphics.RadialGradient((float) r7, (float) r9, (float) r7, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e7, code lost:
        return new d0.d(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ef, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List, float, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List, float, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d0.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):d0.d");
    }

    public final boolean b() {
        return this.f3688a != null;
    }

    public final boolean c() {
        ColorStateList colorStateList;
        return this.f3688a == null && (colorStateList = this.f3689b) != null && colorStateList.isStateful();
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.f3689b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3690c) {
                this.f3690c = colorForState;
                return true;
            }
        }
        return false;
    }
}
