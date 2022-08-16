package m4;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class zw implements lx<vd0> {
    @Override // m4.lx
    public final void a(vd0 vd0Var, Map map) {
        vd0 vd0Var2 = vd0Var;
        s1 s1Var = s.B.f5789c;
        DisplayMetrics O = s1.O((WindowManager) vd0Var2.getContext().getSystemService("window"));
        int i10 = O.widthPixels;
        int i11 = O.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) vd0Var2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        vd0Var2.a("locationReady", hashMap);
        g1.j("GET LOCATION COMPILED");
    }
}
