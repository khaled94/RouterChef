package x5;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import c4.a;

/* loaded from: classes.dex */
public final class g {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0) {
            return null;
        }
        return Typeface.create(typeface, a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
