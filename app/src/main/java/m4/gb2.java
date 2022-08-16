package m4;

import androidx.lifecycle.f0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class gb2 extends mb2 {
    public gb2(int i10) {
        super(i10);
    }

    @Override // m4.mb2
    public final void a() {
        if (!this.f11142v) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry d5 = d(i10);
                if (((d92) d5.getKey()).c()) {
                    d5.setValue(Collections.unmodifiableList((List) d5.getValue()));
                }
            }
            for (Map.Entry entry : this.f11141u.isEmpty() ? f0.f1680w : this.f11141u.entrySet()) {
                if (((d92) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
