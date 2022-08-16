package k0;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import k0.d;
import k0.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    public static final d.C0082d f5541d;

    /* renamed from: e */
    public static final String f5542e = Character.toString(8206);

    /* renamed from: f */
    public static final String f5543f = Character.toString(8207);

    /* renamed from: g */
    public static final a f5544g;

    /* renamed from: h */
    public static final a f5545h;

    /* renamed from: a */
    public final boolean f5546a;

    /* renamed from: b */
    public final int f5547b;

    /* renamed from: c */
    public final c f5548c;

    /* renamed from: k0.a$a */
    /* loaded from: classes.dex */
    public static class C0081a {

        /* renamed from: e */
        public static final byte[] f5549e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f5550a;

        /* renamed from: b */
        public final int f5551b;

        /* renamed from: c */
        public int f5552c;

        /* renamed from: d */
        public char f5553d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f5549e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0081a(CharSequence charSequence) {
            this.f5550a = charSequence;
            this.f5551b = charSequence.length();
        }

        public final byte a() {
            char charAt = this.f5550a.charAt(this.f5552c - 1);
            this.f5553d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f5550a, this.f5552c);
                this.f5552c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f5552c--;
            char c10 = this.f5553d;
            return c10 < 1792 ? f5549e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        d.C0082d c0082d = d.f5560c;
        f5541d = c0082d;
        f5544g = new a(false, 2, c0082d);
        f5545h = new a(true, 2, c0082d);
    }

    public a(boolean z10, int i10, c cVar) {
        this.f5546a = z10;
        this.f5547b = i10;
        this.f5548c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r3 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r4 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r0.f5552c <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L61;
            case 15: goto L61;
            case 16: goto L60;
            case 17: goto L60;
            case 18: goto L59;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r3 != r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r3 != r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            k0.a$a r0 = new k0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f5552c = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        Ld:
            int r6 = r0.f5552c
            int r7 = r0.f5551b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f5550a
            char r6 = r7.charAt(r6)
            r0.f5553d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f5550a
            int r7 = r0.f5552c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f5552c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f5552c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f5552c
            int r6 = r6 + r2
            r0.f5552c = r6
            char r6 = r0.f5553d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = k0.a.C0081a.f5549e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = r9
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = r2
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = r1
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r9 = r4
            goto L91
        L77:
            int r4 = r0.f5552c
            if (r4 <= 0) goto L91
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r9 = r2
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r9 = r1
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            k0.a$a r0 = new k0.a$a
            r0.<init>(r6)
            int r6 = r0.f5551b
            r0.f5552c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f5552c
            r4 = 1
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i10 = e.f5565a;
        boolean z10 = true;
        if (e.a.a(locale) != 1) {
            z10 = false;
        }
        return z10 ? f5545h : f5544g;
    }

    public final CharSequence d(CharSequence charSequence, c cVar) {
        if (charSequence == null) {
            return null;
        }
        boolean z10 = false;
        boolean b10 = ((d.c) cVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f5547b & 2) != 0) {
            z10 = true;
        }
        String str = "";
        if (z10) {
            boolean b11 = (b10 ? d.f5559b : d.f5558a).b(charSequence, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f5546a || (!b11 && a(charSequence) != 1)) ? (!this.f5546a || (b11 && a(charSequence) != -1)) ? str : f5543f : f5542e));
        }
        if (b10 != this.f5546a) {
            spannableStringBuilder.append(b10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b12 = (b10 ? d.f5559b : d.f5558a).b(charSequence, charSequence.length());
        if (!this.f5546a && (b12 || b(charSequence) == 1)) {
            str = f5542e;
        } else if (this.f5546a && (!b12 || b(charSequence) == -1)) {
            str = f5543f;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
