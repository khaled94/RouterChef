package m4;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ar1 implements zq1 {

    /* renamed from: s */
    public final int[] f6245s = new int[2];

    @Override // m4.zq1
    public final void c(View view, JSONObject jSONObject, yq1 yq1Var, boolean z10) {
        int i10;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (!z10) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                ((nr1) yq1Var).a(viewGroup.getChildAt(i11), this, jSONObject);
            }
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            View childAt = viewGroup.getChildAt(i12);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i13));
            int size2 = arrayList3.size();
            int i14 = 0;
            while (true) {
                i10 = i13 + 1;
                if (i14 < size2) {
                    ((nr1) yq1Var).a((View) arrayList3.get(i14), this, jSONObject);
                    i14++;
                }
            }
            i13 = i10;
        }
    }

    @Override // m4.zq1
    public final JSONObject d(View view) {
        if (view == null) {
            return er1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f6245s);
        int[] iArr = this.f6245s;
        return er1.a(iArr[0], iArr[1], width, height);
    }
}
