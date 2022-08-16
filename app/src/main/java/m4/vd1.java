package m4;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class vd1 implements cu1 {

    /* renamed from: a */
    public static final /* synthetic */ vd1 f14663a = new vd1();

    @Override // m4.cu1
    public final Object a(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new dh1() { // from class: m4.ud1
            @Override // m4.dh1
            public final void h(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
            }
        };
    }
}
