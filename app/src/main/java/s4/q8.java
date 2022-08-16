package s4;

import j0.d;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q8 extends x8 {
    public q8(int i10) {
        super(i10);
    }

    @Override // s4.x8
    public final void a() {
        if (!this.f18190v) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry d5 = d(i10);
                if (((s6) d5.getKey()).c()) {
                    d5.setValue(Collections.unmodifiableList((List) d5.getValue()));
                }
            }
            for (Map.Entry entry : this.f18189u.isEmpty() ? d.A : this.f18189u.entrySet()) {
                if (((s6) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
