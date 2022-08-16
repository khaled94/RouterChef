package m4;

import f3.k;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mn implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ mn f11250s = new mn();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List<String> list = k.f4512b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
