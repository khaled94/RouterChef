package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a */
    public final Context f939a;

    /* renamed from: b */
    public final View f940b;

    /* renamed from: c */
    public final TextView f941c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f942d;

    /* renamed from: e */
    public final Rect f943e = new Rect();

    /* renamed from: f */
    public final int[] f944f = new int[2];

    /* renamed from: g */
    public final int[] f945g = new int[2];

    public l1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f942d = layoutParams;
        this.f939a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f940b = inflate;
        this.f941c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(l1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951621;
        layoutParams.flags = 24;
    }

    public final void a() {
        if (!(this.f940b.getParent() != null)) {
            return;
        }
        ((WindowManager) this.f939a.getSystemService("window")).removeView(this.f940b);
    }
}
