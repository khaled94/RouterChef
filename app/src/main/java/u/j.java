package u;

import java.util.ArrayList;
import s.d;

/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: r0 */
    public ArrayList<d> f18988r0 = new ArrayList<>();

    @Override // u.d
    public void D() {
        this.f18988r0.clear();
        super.D();
    }

    @Override // u.d
    public final void F(d dVar) {
        super.F(dVar);
        int size = this.f18988r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18988r0.get(i10).F(dVar);
        }
    }

    public void T() {
        ArrayList<d> arrayList = this.f18988r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = this.f18988r0.get(i10);
            if (dVar instanceof j) {
                ((j) dVar).T();
            }
        }
    }
}
