package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p1.d;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public static final q0 f1563a = new q0();

    /* renamed from: b */
    public static final u0 f1564b;

    static {
        u0 u0Var;
        try {
            u0Var = (u0) d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            u0Var = null;
        }
        f1564b = u0Var;
    }

    public static void a(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
