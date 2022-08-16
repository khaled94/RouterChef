package m4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import n3.g1;
import y4.a6;
import y4.c6;
import y4.h3;
import y4.i;
import y4.l;
import y4.s1;
import y4.w2;

/* loaded from: classes.dex */
public final class v3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f14572s;

    /* renamed from: t */
    public final Object f14573t;

    /* renamed from: u */
    public final Object f14574u;

    /* renamed from: v */
    public final Object f14575v;

    public /* synthetic */ v3(Object obj, Object obj2, Object obj3, int i10) {
        this.f14572s = i10;
        this.f14573t = obj;
        this.f14574u = obj2;
        this.f14575v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i4 i4Var;
        boolean z10 = true;
        switch (this.f14572s) {
            case 0:
                ((e4) this.f14573t).n();
                j4 j4Var = (j4) this.f14574u;
                m4 m4Var = j4Var.f9831c;
                if (m4Var != null) {
                    z10 = false;
                }
                if (z10) {
                    ((e4) this.f14573t).g(j4Var.f9829a);
                } else {
                    e4 e4Var = (e4) this.f14573t;
                    synchronized (e4Var.f7722w) {
                        i4Var = e4Var.f7723x;
                    }
                    if (i4Var != null) {
                        i4Var.d(m4Var);
                    }
                }
                if (((j4) this.f14574u).f9832d) {
                    ((e4) this.f14573t).f("intermediate-response");
                } else {
                    ((e4) this.f14573t).h("done");
                }
                Runnable runnable = (Runnable) this.f14575v;
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            case 1:
                d00 d00Var = (d00) this.f14574u;
                lz lzVar = (lz) this.f14575v;
                synchronized (((e00) this.f14573t).f7676a) {
                    if (d00Var.c() != -1 && d00Var.c() != 1) {
                        d00Var.d();
                        u90.f14298e.execute(new uz(lzVar, 0));
                        g1.a("Could not receive loaded message in a timely manner. Rejecting.");
                    }
                }
                return;
            default:
                String str = (String) this.f14574u;
                Bundle bundle = (Bundle) this.f14575v;
                i iVar = ((h3) this.f14573t).f20483s.f20294u;
                a6.I(iVar);
                iVar.g();
                iVar.h();
                l lVar = new l((w2) iVar.f20505s, "", str, "dep", 0L, bundle);
                c6 c6Var = iVar.f20760t.y;
                a6.I(c6Var);
                byte[] i10 = c6Var.A(lVar).i();
                ((w2) iVar.f20505s).C().F.c("Saving default event parameters, appId, data size", ((w2) iVar.f20505s).E.d(str), Integer.valueOf(i10.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("parameters", i10);
                try {
                    if (iVar.D().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                        return;
                    }
                    ((w2) iVar.f20505s).C().f20710x.b("Failed to insert default event parameters (got -1). appId", s1.s(str));
                    return;
                } catch (SQLiteException e10) {
                    ((w2) iVar.f20505s).C().f20710x.c("Error storing default event parameters. appId", s1.s(str), e10);
                    return;
                }
        }
    }
}
