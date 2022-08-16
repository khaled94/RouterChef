package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import f0.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final CheckedTextView f906a;

    /* renamed from: b */
    public ColorStateList f907b = null;

    /* renamed from: c */
    public PorterDuff.Mode f908c = null;

    /* renamed from: d */
    public boolean f909d = false;

    /* renamed from: e */
    public boolean f910e = false;

    /* renamed from: f */
    public boolean f911f;

    public j(CheckedTextView checkedTextView) {
        this.f906a = checkedTextView;
    }

    public final void a() {
        Drawable checkMarkDrawable = this.f906a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (!this.f909d && !this.f910e) {
                return;
            }
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f909d) {
                a.b.h(mutate, this.f907b);
            }
            if (this.f910e) {
                a.b.i(mutate, this.f908c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f906a.getDrawableState());
            }
            this.f906a.setCheckMarkDrawable(mutate);
        }
    }
}
