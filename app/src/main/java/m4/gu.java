package m4;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gu extends ou {
    public static final int A = Color.rgb(204, 204, 204);
    public static final int B = Color.rgb(12, 174, 206);

    /* renamed from: s */
    public final String f9039s;

    /* renamed from: t */
    public final List<ju> f9040t = new ArrayList();

    /* renamed from: u */
    public final List<vu> f9041u = new ArrayList();

    /* renamed from: v */
    public final int f9042v;

    /* renamed from: w */
    public final int f9043w;

    /* renamed from: x */
    public final int f9044x;
    public final int y;

    /* renamed from: z */
    public final int f9045z;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<m4.ju>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.vu>, java.util.ArrayList] */
    public gu(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11) {
        this.f9039s = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ju juVar = (ju) list.get(i12);
            this.f9040t.add(juVar);
            this.f9041u.add(juVar);
        }
        this.f9042v = num != null ? num.intValue() : A;
        this.f9043w = num2 != null ? num2.intValue() : B;
        this.f9044x = num3 != null ? num3.intValue() : 12;
        this.y = i10;
        this.f9045z = i11;
    }

    @Override // m4.pu
    public final String e() {
        return this.f9039s;
    }

    @Override // m4.pu
    public final List<vu> f() {
        return this.f9041u;
    }
}
