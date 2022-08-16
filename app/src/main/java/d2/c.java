package d2;

import androidx.work.impl.WorkDatabase;
import c2.r;
import java.util.ArrayList;
import java.util.Iterator;
import u1.k;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: t */
    public final /* synthetic */ k f3738t;

    /* renamed from: u */
    public final /* synthetic */ String f3739u;

    /* renamed from: v */
    public final /* synthetic */ boolean f3740v = false;

    public c(k kVar, String str) {
        this.f3738t = kVar;
        this.f3739u = str;
    }

    /* JADX WARN: Finally extract failed */
    @Override // d2.d
    public final void c() {
        WorkDatabase workDatabase = this.f3738t.f19025c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((r) workDatabase.v()).g(this.f3739u)).iterator();
            while (it.hasNext()) {
                a(this.f3738t, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
            if (!this.f3740v) {
                return;
            }
            b(this.f3738t);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
