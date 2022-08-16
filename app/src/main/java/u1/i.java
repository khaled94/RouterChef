package u1;

import androidx.work.impl.WorkDatabase;
import g1.z;
import k1.b;
import l1.a;

/* loaded from: classes.dex */
public final class i extends z.b {
    @Override // g1.z.b
    public final void a(b bVar) {
        a aVar = (a) bVar;
        aVar.h();
        try {
            int i10 = WorkDatabase.f2309m;
            aVar.n("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f2308l) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.Q();
        } finally {
            aVar.g();
        }
    }
}
