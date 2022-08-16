package r9;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ i f17399s = new i();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Map<String, j> map = j.f17405b;
        int min = Math.min(str.length(), str2.length());
        int i10 = 4;
        while (true) {
            if (i10 < min) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                if (charAt == charAt2) {
                    i10++;
                } else if (charAt < charAt2) {
                    return -1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                    return -1;
                }
            }
        }
        return 1;
    }
}
