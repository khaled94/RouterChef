package w8;

import e9.f;
import java.util.List;

/* loaded from: classes.dex */
public class e extends d {
    public static final <T> T v(List<? extends T> list, int i10) {
        f.e(list, "<this>");
        if (i10 < 0 || i10 > list.size() - 1) {
            return null;
        }
        return list.get(i10);
    }
}
