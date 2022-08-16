package u1;

import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import c2.p;
import c2.q;
import c2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t1.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final String f19006a = h.e("Schedulers");

    /* JADX WARN: Finally extract failed */
    public static void a(a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q v10 = workDatabase.v();
        workDatabase.c();
        try {
            r rVar = (r) v10;
            List<p> c10 = rVar.c(Build.VERSION.SDK_INT == 23 ? aVar.f2303h / 2 : aVar.f2303h);
            List b10 = rVar.b();
            if (((ArrayList) c10).size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) c10).iterator();
                while (it.hasNext()) {
                    rVar.l(((p) it.next()).f2635a, currentTimeMillis);
                }
            }
            workDatabase.o();
            workDatabase.k();
            ArrayList arrayList = (ArrayList) c10;
            if (arrayList.size() > 0) {
                p[] pVarArr = (p[]) arrayList.toArray(new p[arrayList.size()]);
                for (e eVar : list) {
                    if (eVar.f()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) b10;
            if (arrayList2.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) arrayList2.toArray(new p[arrayList2.size()]);
            for (e eVar2 : list) {
                if (!eVar2.f()) {
                    eVar2.e(pVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
