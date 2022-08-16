package com.raouf.routerchef.utils.fontAwesome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.h0;

/* loaded from: classes.dex */
public class FABrandsTextView extends h0 {
    public FABrandsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fa-brands-400.ttf"));
    }
}
