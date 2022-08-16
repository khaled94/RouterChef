package e3;

import android.util.SparseArray;
import androidx.appcompat.widget.e0;
import java.util.HashMap;
import q2.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static SparseArray<d> f4406a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<d, Integer> f4407b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f4407b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f4407b.put(d.VERY_LOW, 1);
        f4407b.put(d.HIGHEST, 2);
        for (d dVar : f4407b.keySet()) {
            f4406a.append(f4407b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f4407b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f4406a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(e0.a("Unknown Priority for value ", i10));
    }
}
