package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import f.a;
import q0.k;

/* loaded from: classes.dex */
public final class i extends CheckedTextView {

    /* renamed from: s */
    public final j f870s;

    /* renamed from: t */
    public final f f871t;

    /* renamed from: u */
    public final f0 f872u;

    /* renamed from: v */
    public o f873v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:10:0x0063, B:12:0x0069, B:14:0x006f, B:15:0x007c, B:17:0x0083, B:18:0x008c, B:20:0x0093), top: B:29:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:10:0x0063, B:12:0x0069, B:14:0x006f, B:15:0x007c, B:17:0x0083, B:18:0x008c, B:20:0x0093), top: B:29:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            androidx.appcompat.widget.c1.a(r9)
            r0 = 2130968755(0x7f0400b3, float:1.7546173E38)
            r8.<init>(r9, r10, r0)
            android.content.Context r9 = r8.getContext()
            androidx.appcompat.widget.a1.a(r8, r9)
            androidx.appcompat.widget.f0 r9 = new androidx.appcompat.widget.f0
            r9.<init>(r8)
            r8.f872u = r9
            r9.f(r10, r0)
            r9.b()
            androidx.appcompat.widget.f r9 = new androidx.appcompat.widget.f
            r9.<init>(r8)
            r8.f871t = r9
            r9.d(r10, r0)
            androidx.appcompat.widget.j r9 = new androidx.appcompat.widget.j
            r9.<init>(r8)
            r8.f870s = r9
            android.content.Context r1 = r8.getContext()
            int[] r4 = a6.f.D
            androidx.appcompat.widget.f1 r1 = androidx.appcompat.widget.f1.q(r1, r10, r4, r0)
            android.content.Context r3 = r8.getContext()
            android.content.res.TypedArray r6 = r1.f848b
            r7 = 2130968755(0x7f0400b3, float:1.7546173E38)
            r2 = r8
            r5 = r10
            m0.z.o(r2, r3, r4, r5, r6, r7)
            r2 = 1
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lad
            r4 = 0
            if (r3 == 0) goto L60
            int r3 = r1.l(r2, r4)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L60
            android.content.Context r5 = r8.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> Lad
            android.graphics.drawable.Drawable r3 = f.a.b(r5, r3)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> Lad
            r8.setCheckMarkDrawable(r3)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> Lad
            goto L61
        L60:
            r2 = r4
        L61:
            if (r2 != 0) goto L7c
            boolean r2 = r1.o(r4)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L7c
            int r2 = r1.l(r4, r4)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L7c
            android.widget.CheckedTextView r3 = r9.f906a     // Catch: java.lang.Throwable -> Lad
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> Lad
            android.graphics.drawable.Drawable r2 = f.a.b(r4, r2)     // Catch: java.lang.Throwable -> Lad
            r3.setCheckMarkDrawable(r2)     // Catch: java.lang.Throwable -> Lad
        L7c:
            r2 = 2
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L8c
            android.widget.CheckedTextView r3 = r9.f906a     // Catch: java.lang.Throwable -> Lad
            android.content.res.ColorStateList r2 = r1.c(r2)     // Catch: java.lang.Throwable -> Lad
            r3.setCheckMarkTintList(r2)     // Catch: java.lang.Throwable -> Lad
        L8c:
            r2 = 3
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto La2
            android.widget.CheckedTextView r9 = r9.f906a     // Catch: java.lang.Throwable -> Lad
            r3 = -1
            int r2 = r1.j(r2, r3)     // Catch: java.lang.Throwable -> Lad
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.m0.e(r2, r3)     // Catch: java.lang.Throwable -> Lad
            r9.setCheckMarkTintMode(r2)     // Catch: java.lang.Throwable -> Lad
        La2:
            r1.r()
            androidx.appcompat.widget.o r9 = r8.getEmojiTextViewHelper()
            r9.b(r10, r0)
            return
        Lad:
            r9 = move-exception
            r1.r()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private o getEmojiTextViewHelper() {
        if (this.f873v == null) {
            this.f873v = new o(this);
        }
        return this.f873v;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f0 f0Var = this.f872u;
        if (f0Var != null) {
            f0Var.b();
        }
        f fVar = this.f871t;
        if (fVar != null) {
            fVar.a();
        }
        j jVar = this.f870s;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f871t;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f871t;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        j jVar = this.f870s;
        if (jVar != null) {
            return jVar.f907b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        j jVar = this.f870s;
        if (jVar != null) {
            return jVar.f908c;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f871t;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        f fVar = this.f871t;
        if (fVar != null) {
            fVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(a.b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        j jVar = this.f870s;
        if (jVar != null) {
            if (jVar.f911f) {
                jVar.f911f = false;
                return;
            }
            jVar.f911f = true;
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f871t;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f871t;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        j jVar = this.f870s;
        if (jVar != null) {
            jVar.f907b = colorStateList;
            jVar.f909d = true;
            jVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        j jVar = this.f870s;
        if (jVar != null) {
            jVar.f908c = mode;
            jVar.f910e = true;
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f872u;
        if (f0Var != null) {
            f0Var.g(context, i10);
        }
    }
}
