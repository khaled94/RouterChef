package k6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n9.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final Set<String> f5598a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    public static final List<String> f5599b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final List<String> f5600c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    public static final List<String> f5601d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    public static final List<String> f5602e;

    /* renamed from: f */
    public static final List<String> f5603f;

    static {
        String[][] strArr = {g.f16699u, g.f16700v};
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            i10 += strArr[i11].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i10);
        int length = strArr[0].length;
        for (int i12 = 1; i12 < 2; i12++) {
            String[] strArr2 = strArr[i12];
            int length2 = strArr2.length;
            System.arraycopy(strArr2, 0, copyOf, length, length2);
            length += length2;
        }
        f5602e = Arrays.asList((String[]) copyOf);
        f5603f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !f5600c.contains(str);
    }
}
