package z3;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import c5.d;
import c5.i;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import m4.hc;
import m4.ic;
import m4.ko1;
import m4.mf;
import m4.n90;
import m4.se;
import m4.t61;
import m4.v61;
import m4.wg;
import s4.a;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements d, ko1 {

    /* renamed from: s */
    public final /* synthetic */ int f20971s;

    /* renamed from: t */
    public Object f20972t;

    /* renamed from: u */
    public Object f20973u;

    /* renamed from: v */
    public Object f20974v;

    public v() {
        this.f20971s = 3;
        this.f20972t = new a("", 0L, null);
        this.f20973u = new a("", 0L, null);
        this.f20974v = new ArrayList();
    }

    public final ic a(hc hcVar, Uri uri) {
        ic icVar = (ic) this.f20974v;
        if (icVar != null) {
            return icVar;
        }
        ic[] icVarArr = (ic[]) this.f20972t;
        int length = icVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            ic icVar2 = icVarArr[i11];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                hcVar.f9185e = 0;
                throw th;
            }
            if (icVar2.e(hcVar)) {
                this.f20974v = icVar2;
                hcVar.f9185e = 0;
                break;
            }
            continue;
            hcVar.f9185e = 0;
            i11++;
        }
        ic icVar3 = (ic) this.f20974v;
        if (icVar3 != null) {
            icVar3.d((se) this.f20973u);
            return (ic) this.f20974v;
        }
        ic[] icVarArr2 = (ic[]) this.f20972t;
        int i12 = wg.f14958a;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int length2 = icVarArr2.length;
            if (i10 >= length2) {
                break;
            }
            sb.append(icVarArr2[i10].getClass().getSimpleName());
            if (i10 < length2 - 1) {
                sb.append(", ");
            }
            i10++;
        }
        String sb2 = sb.toString();
        throw new mf(androidx.fragment.app.a.b(new StringBuilder(sb2.length() + 58), "None of the available extractors (", sb2, ") could read the stream."));
    }

    @Override // c5.d
    public final void c(i iVar) {
        c cVar = (c) this.f20972t;
        String str = (String) this.f20973u;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f20974v;
        synchronized (cVar.f20930a) {
            cVar.f20930a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        switch (this.f20971s) {
            case 3:
                v vVar = new v(((a) this.f20972t).clone());
                for (a aVar : (List) this.f20974v) {
                    ((List) vVar.f20974v).add(aVar.clone());
                }
                return vVar;
            default:
                return super.clone();
        }
    }

    @Override // m4.ko1
    /* renamed from: h */
    public final Object mo30h(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ((v61) this.f20972t).f14591t.execute(new t61(sQLiteDatabase, (String) this.f20973u, (n90) this.f20974v));
        return null;
    }

    public /* synthetic */ v(v61 v61Var, n90 n90Var, String str) {
        this.f20971s = 2;
        this.f20972t = v61Var;
        this.f20974v = n90Var;
        this.f20973u = str;
    }

    public v(a aVar) {
        this.f20971s = 3;
        this.f20972t = aVar;
        this.f20973u = aVar.clone();
        this.f20974v = new ArrayList();
    }

    public /* synthetic */ v(c cVar, String str, ScheduledFuture scheduledFuture) {
        this.f20971s = 0;
        this.f20972t = cVar;
        this.f20973u = str;
        this.f20974v = scheduledFuture;
    }

    public v(ic[] icVarArr, se seVar) {
        this.f20971s = 1;
        this.f20972t = icVarArr;
        this.f20973u = seVar;
    }
}
