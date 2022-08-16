package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import v0.f;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public final TextView f973a;

    /* renamed from: b */
    public final f f974b;

    public o(TextView textView) {
        this.f973a = textView;
        this.f974b = new f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f974b.f19759a.a(inputFilterArr);
    }

    /* JADX WARN: Finally extract failed */
    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f973a.getContext().obtainStyledAttributes(attributeSet, a6.f.A, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        this.f974b.f19759a.c(z10);
    }

    public final void d(boolean z10) {
        this.f974b.f19759a.d(z10);
    }
}
