package d2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import u1.k;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: t */
    public final /* synthetic */ k f3734t;

    /* renamed from: u */
    public final /* synthetic */ UUID f3735u;

    public a(k kVar, UUID uuid) {
        this.f3734t = kVar;
        this.f3735u = uuid;
    }

    /* JADX WARN: Finally extract failed */
    @Override // d2.d
    public final void c() {
        WorkDatabase workDatabase = this.f3734t.f19025c;
        workDatabase.c();
        try {
            a(this.f3734t, this.f3735u.toString());
            workDatabase.o();
            workDatabase.k();
            b(this.f3734t);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
