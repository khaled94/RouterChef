package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import d4.m;
import f3.g;

/* loaded from: classes.dex */
public final class AdView extends g {
    public AdView(@RecentlyNonNull Context context) {
        super(context);
        m.i(context, "Context cannot be null");
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
