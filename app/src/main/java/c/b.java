package c;

import android.content.Context;
import android.content.Intent;
import c.a;
import d.c;
import e9.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import v8.d;
import w8.h;
import w8.j;

/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // c.a
    public final Intent a(Context context, String[] strArr) {
        f.e(context, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        f.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // c.a
    public final a.C0036a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        f.e(context, "context");
        boolean z10 = true;
        if (strArr2.length == 0) {
            return new a.C0036a<>(h.f19941s);
        }
        int length = strArr2.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(c0.a.a(context, strArr2[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        int c10 = c.c(strArr2.length);
        if (c10 < 16) {
            c10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c10);
        for (String str : strArr2) {
            linkedHashMap.put(str, Boolean.TRUE);
        }
        return new a.C0036a<>(linkedHashMap);
    }

    @Override // c.a
    public final Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new d(it.next(), it2.next()));
                }
                return j.m(arrayList3);
            }
        }
        return h.f19941s;
    }
}
