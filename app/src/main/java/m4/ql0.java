package m4;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l3.s;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ql0 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: s */
    public final Context f12915s;

    /* renamed from: t */
    public View f12916t;

    public ql0(Context context) {
        super(context);
        this.f12915s = context;
    }

    public static ql0 a(Context context, View view, cm1 cm1Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        ql0 ql0Var = new ql0(context);
        if (!cm1Var.f7063v.isEmpty() && (resources = ql0Var.f12915s.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            dm1 dm1Var = cm1Var.f7063v.get(0);
            float f10 = displayMetrics.density;
            ql0Var.setLayoutParams(new FrameLayout.LayoutParams((int) (dm1Var.f7549a * f10), (int) (dm1Var.f7550b * f10)));
        }
        ql0Var.f12916t = view;
        ql0Var.addView(view);
        s sVar = s.B;
        ba0 ba0Var = sVar.A;
        ba0.b(ql0Var, ql0Var);
        ba0 ba0Var2 = sVar.A;
        ba0.a(ql0Var, ql0Var);
        JSONObject jSONObject = cm1Var.f7043f0;
        RelativeLayout relativeLayout = new RelativeLayout(ql0Var.f12915s);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            ql0Var.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            ql0Var.b(optJSONObject2, relativeLayout, 12);
        }
        ql0Var.addView(relativeLayout);
        return ql0Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.f12915s);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        g90 g90Var = io.f9708f.f9709a;
        int j3 = g90.j(this.f12915s, (int) optDouble);
        textView.setPadding(0, j3, 0, j3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, g90.j(this.f12915s, (int) jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f12916t.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f12916t.setY(-iArr[1]);
    }
}
