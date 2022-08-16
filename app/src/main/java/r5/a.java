package r5;

import android.content.Context;
import android.util.TypedValue;
import com.raouf.routerchef.R;
import x5.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f */
    public static final int f17255f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f17256a;

    /* renamed from: b */
    public final int f17257b;

    /* renamed from: c */
    public final int f17258c;

    /* renamed from: d */
    public final int f17259d;

    /* renamed from: e */
    public final float f17260e;

    public a(Context context) {
        TypedValue a10 = b.a(context, R.attr.elevationOverlayEnabled);
        boolean z10 = (a10 == null || a10.type != 18 || a10.data == 0) ? false : true;
        int a11 = h6.a.a(context, R.attr.elevationOverlayColor, 0);
        int a12 = h6.a.a(context, R.attr.elevationOverlayAccentColor, 0);
        int a13 = h6.a.a(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f17256a = z10;
        this.f17257b = a11;
        this.f17258c = a12;
        this.f17259d = a13;
        this.f17260e = f10;
    }
}
