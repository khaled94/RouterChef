package n3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import l3.s;
import m4.es;
import m4.g90;
import m4.io;
import m4.jo;
import m4.yr;

@TargetApi(24)
/* loaded from: classes.dex */
public class y1 extends x1 {
    @Override // n3.e
    public final boolean a(Activity activity, Configuration configuration) {
        yr<Boolean> yrVar = es.W2;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return false;
        }
        if (((Boolean) joVar.f10148c.a(es.Y2)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        g90 g90Var = io.f9708f.f9709a;
        int j3 = g90.j(activity, configuration.screenHeightDp);
        int j10 = g90.j(activity, configuration.screenWidthDp);
        s1 s1Var = s.B.f5789c;
        DisplayMetrics O = s1.O((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i10 = O.heightPixels;
        int i11 = O.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int intValue = ((Integer) joVar.f10148c.a(es.U2)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        if (!(Math.abs(i10 - (j3 + dimensionPixelSize)) <= intValue)) {
            return true;
        }
        return !(Math.abs(i11 - j10) <= intValue);
    }
}
