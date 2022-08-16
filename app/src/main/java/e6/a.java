package e6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.raouf.routerchef.R;
import j.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final int[] f4429a = {16842752, R.attr.theme};

    /* renamed from: b */
    public static final int[] f4430b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4430b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z10 = (context instanceof c) && ((c) context).f5319a == resourceId;
        if (resourceId == 0 || z10) {
            return context;
        }
        c cVar = new c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4429a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
