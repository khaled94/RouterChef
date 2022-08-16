package m4;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class dl2<V> {

    /* renamed from: b */
    public final SparseArray<V> f7546b = new SparseArray<>();

    /* renamed from: a */
    public int f7545a = -1;

    public final V a(int i10) {
        if (this.f7545a == -1) {
            this.f7545a = 0;
        }
        while (true) {
            int i11 = this.f7545a;
            if (i11 > 0 && i10 < this.f7546b.keyAt(i11)) {
                this.f7545a--;
            }
        }
        while (this.f7545a < this.f7546b.size() - 1 && i10 >= this.f7546b.keyAt(this.f7545a + 1)) {
            this.f7545a++;
        }
        return this.f7546b.valueAt(this.f7545a);
    }

    public final V b() {
        SparseArray<V> sparseArray = this.f7546b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void c(int i10, V v10) {
        SparseArray<V> sparseArray;
        SparseArray<V> sparseArray2;
        boolean z10 = true;
        if (this.f7545a == -1) {
            r01.h(this.f7546b.size() == 0);
            this.f7545a = 0;
        }
        if (this.f7546b.size() > 0) {
            int keyAt = this.f7546b.keyAt(sparseArray.size() - 1);
            if (i10 < keyAt) {
                z10 = false;
            }
            r01.f(z10);
            if (keyAt == i10) {
                zh2 zh2Var = ((wk2) this.f7546b.valueAt(sparseArray2.size() - 1)).f15040b;
                int i11 = yh2.f15787a;
            }
        }
        this.f7546b.append(i10, v10);
    }
}
