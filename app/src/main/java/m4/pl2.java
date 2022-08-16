package m4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: classes.dex */
public final class pl2 extends oc0 {

    /* renamed from: r */
    public static final /* synthetic */ int f12560r = 0;

    /* renamed from: k */
    public final boolean f12561k;

    /* renamed from: l */
    public final boolean f12562l;

    /* renamed from: m */
    public final boolean f12563m;

    /* renamed from: n */
    public final boolean f12564n;

    /* renamed from: o */
    public final boolean f12565o;
    public final SparseArray<Map<s70, rl2>> p;

    /* renamed from: q */
    public final SparseBooleanArray f12566q;

    static {
        pu1 pu1Var = gw1.f9058t;
        gw1<Object> gw1Var = gx1.f9060w;
        int i10 = pw1.f12646u;
        mx1<Object> mx1Var = mx1.B;
        new SparseArray();
        new SparseBooleanArray();
    }

    public pl2(ql2 ql2Var) {
        super(ql2Var);
        this.f12561k = ql2Var.f12918k;
        this.f12562l = ql2Var.f12919l;
        this.f12563m = ql2Var.f12920m;
        this.f12564n = ql2Var.f12921n;
        this.f12565o = ql2Var.f12922o;
        this.p = ql2Var.p;
        this.f12566q = ql2Var.f12923q;
    }

    @Override // m4.oc0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pl2.class == obj.getClass()) {
            pl2 pl2Var = (pl2) obj;
            if (super.equals(pl2Var) && this.f12561k == pl2Var.f12561k && this.f12562l == pl2Var.f12562l && this.f12563m == pl2Var.f12563m && this.f12564n == pl2Var.f12564n && this.f12565o == pl2Var.f12565o) {
                SparseBooleanArray sparseBooleanArray = this.f12566q;
                SparseBooleanArray sparseBooleanArray2 = pl2Var.f12566q;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray<Map<s70, rl2>> sparseArray = this.p;
                            SparseArray<Map<s70, rl2>> sparseArray2 = pl2Var.p;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map<s70, rl2> valueAt = sparseArray.valueAt(i11);
                                        Map<s70, rl2> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry<s70, rl2> entry : valueAt.entrySet()) {
                                                s70 key = entry.getKey();
                                                if (valueAt2.containsKey(key)) {
                                                    if (!ls1.f(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m4.oc0
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.f12561k ? 1 : 0)) * 961) + (this.f12562l ? 1 : 0)) * 31) + (this.f12563m ? 1 : 0)) * 28629151) + (this.f12564n ? 1 : 0)) * 961) + (this.f12565o ? 1 : 0);
    }
}
