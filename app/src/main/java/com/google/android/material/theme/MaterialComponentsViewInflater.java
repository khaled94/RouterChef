package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.w;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import e.n;
import l5.a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends n {
    @Override // e.n
    public final e a(Context context, AttributeSet attributeSet) {
        return new d6.n(context, attributeSet);
    }

    @Override // e.n
    public final g b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // e.n
    public final h c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // e.n
    public final w d(Context context, AttributeSet attributeSet) {
        return new w5.a(context, attributeSet);
    }

    @Override // e.n
    public final h0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
