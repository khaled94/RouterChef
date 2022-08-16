package n3;

import java.util.ArrayList;
import java.util.List;
import s6.f0;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a */
    public ArrayList f16479a;

    /* renamed from: b */
    public final Object f16480b;

    /* renamed from: c */
    public final Object f16481c;

    public h0(int i10) {
        if (i10 != 1) {
            this.f16479a = new ArrayList();
            this.f16480b = new ArrayList();
            this.f16481c = new ArrayList();
            return;
        }
        this.f16479a = null;
        this.f16480b = new f0(1024);
        this.f16481c = new f0(8192);
    }

    public final h0 a(String str, double d5, double d10) {
        int i10 = 0;
        while (i10 < this.f16479a.size()) {
            double doubleValue = ((Double) ((List) this.f16481c).get(i10)).doubleValue();
            double doubleValue2 = ((Double) ((List) this.f16480b).get(i10)).doubleValue();
            if (d5 < doubleValue || (doubleValue == d5 && d10 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f16479a.add(i10, str);
        ((List) this.f16481c).add(i10, Double.valueOf(d5));
        ((List) this.f16480b).add(i10, Double.valueOf(d10));
        return this;
    }
}
