package com.raouf.routerchef.utils.fontAwesome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.h0;

/* loaded from: classes.dex */
public class FATextView extends h0 {
    public FATextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fa-solid-900.ttf"));
    }
}
