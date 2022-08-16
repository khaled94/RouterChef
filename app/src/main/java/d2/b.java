package d2;

import androidx.work.impl.WorkDatabase;
import c2.r;
import java.util.ArrayList;
import java.util.Iterator;
import u1.k;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: t */
    public final /* synthetic */ k f3736t;

    /* renamed from: u */
    public final /* synthetic */ String f3737u = "offline_ping_sender_work";

    public b(k kVar) {
        this.f3736t = kVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // d2.d
    public final void c() {
        WorkDatabase workDatabase = this.f3736t.f19025c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((r) workDatabase.v()).h(this.f3737u)).iterator();
            while (it.hasNext()) {
                a(this.f3736t, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
            b(this.f3736t);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
