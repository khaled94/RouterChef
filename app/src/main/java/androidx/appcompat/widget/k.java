package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import f0.a;
import q0.d;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final CompoundButton f915a;

    /* renamed from: b */
    public ColorStateList f916b = null;

    /* renamed from: c */
    public PorterDuff.Mode f917c = null;

    /* renamed from: d */
    public boolean f918d = false;

    /* renamed from: e */
    public boolean f919e = false;

    /* renamed from: f */
    public boolean f920f;

    public k(CompoundButton compoundButton) {
        this.f915a = compoundButton;
    }

    public final void a() {
        Drawable a10 = d.a(this.f915a);
        if (a10 != null) {
            if (!this.f918d && !this.f919e) {
                return;
            }
            Drawable mutate = a10.mutate();
            if (this.f918d) {
                a.b.h(mutate, this.f916b);
            }
            if (this.f919e) {
                a.b.i(mutate, this.f917c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f915a.getDrawableState());
            }
            this.f915a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001a, B:5:0x0021, B:7:0x0027, B:10:0x0038, B:12:0x003e, B:14:0x0044, B:15:0x0051, B:17:0x0058, B:18:0x0061, B:20:0x0068), top: B:29:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001a, B:5:0x0021, B:7:0x0027, B:10:0x0038, B:12:0x003e, B:14:0x0044, B:15:0x0051, B:17:0x0058, B:18:0x0061, B:20:0x0068), top: B:29:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.widget.CompoundButton r0 = r7.f915a
            android.content.Context r0 = r0.getContext()
            int[] r3 = a6.f.E
            androidx.appcompat.widget.f1 r0 = androidx.appcompat.widget.f1.q(r0, r8, r3, r9)
            android.widget.CompoundButton r1 = r7.f915a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f848b
            r4 = r8
            r6 = r9
            m0.z.o(r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r9 = r0.o(r8)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            if (r9 == 0) goto L35
            int r9 = r0.l(r8, r1)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L35
            android.widget.CompoundButton r2 = r7.f915a     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            android.content.Context r3 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r9 = f.a.b(r3, r9)     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            r2.setButtonDrawable(r9)     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            goto L36
        L35:
            r8 = r1
        L36:
            if (r8 != 0) goto L51
            boolean r8 = r0.o(r1)     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L51
            int r8 = r0.l(r1, r1)     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L51
            android.widget.CompoundButton r9 = r7.f915a     // Catch: java.lang.Throwable -> L7b
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r8 = f.a.b(r1, r8)     // Catch: java.lang.Throwable -> L7b
            r9.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L7b
        L51:
            r8 = 2
            boolean r9 = r0.o(r8)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L61
            android.widget.CompoundButton r9 = r7.f915a     // Catch: java.lang.Throwable -> L7b
            android.content.res.ColorStateList r8 = r0.c(r8)     // Catch: java.lang.Throwable -> L7b
            q0.c.c(r9, r8)     // Catch: java.lang.Throwable -> L7b
        L61:
            r8 = 3
            boolean r9 = r0.o(r8)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L77
            android.widget.CompoundButton r9 = r7.f915a     // Catch: java.lang.Throwable -> L7b
            r1 = -1
            int r8 = r0.j(r8, r1)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.m0.e(r8, r1)     // Catch: java.lang.Throwable -> L7b
            q0.c.d(r9, r8)     // Catch: java.lang.Throwable -> L7b
        L77:
            r0.r()
            return
        L7b:
            r8 = move-exception
            r0.r()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.b(android.util.AttributeSet, int):void");
    }
}
