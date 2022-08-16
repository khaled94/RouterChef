package m4;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import h4.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import y4.a6;
import y4.c2;
import y4.i;
import y4.u1;
import y4.w2;
import y4.x1;

/* loaded from: classes.dex */
public final class v0 implements v91, u1 {

    /* renamed from: s */
    public final Object f14544s;

    /* renamed from: t */
    public final Object f14545t;

    public /* synthetic */ v0(Map map, Map map2) {
        this.f14544s = map;
        this.f14545t = map2;
    }

    public /* synthetic */ v0(UUID uuid, byte[] bArr) {
        this.f14544s = uuid;
        this.f14545t = bArr;
    }

    public /* synthetic */ v0(fg2 fg2Var, String str) {
        this.f14544s = fg2Var;
        this.f14545t = str;
    }

    public /* synthetic */ v0(a6 a6Var, String str) {
        this.f14545t = a6Var;
        this.f14544s = str;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.List<java.lang.Long>, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    @Override // y4.u1
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        i iVar;
        long longValue;
        a6 a6Var = (a6) this.f14545t;
        a6Var.B().g();
        a6Var.e();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                a6Var.L = false;
                a6Var.y();
            }
        }
        ?? r02 = a6Var.P;
        Objects.requireNonNull(r02, "null reference");
        a6Var.P = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            a6Var.C().F.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            c2 c2Var = a6Var.A.B;
            Objects.requireNonNull((c) a6Var.c());
            c2Var.b(System.currentTimeMillis());
            if (i10 != 503 || i10 == 429) {
                c2 c2Var2 = a6Var.A.f20455z;
                Objects.requireNonNull((c) a6Var.c());
                c2Var2.b(System.currentTimeMillis());
            }
            i iVar2 = a6Var.f20294u;
            a6.I(iVar2);
            iVar2.U(r02);
            a6Var.D();
        }
        if (th == null) {
            try {
                c2 c2Var3 = a6Var.A.A;
                Objects.requireNonNull((c) a6Var.c());
                c2Var3.b(System.currentTimeMillis());
                a6Var.A.B.b(0L);
                a6Var.D();
                a6Var.C().F.c("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                i iVar3 = a6Var.f20294u;
                a6.I(iVar3);
                iVar3.R();
                try {
                    Iterator it = r02.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        try {
                            iVar = a6Var.f20294u;
                            a6.I(iVar);
                            longValue = l10.longValue();
                            iVar.g();
                            iVar.h();
                        } catch (SQLiteException e10) {
                            ?? r03 = a6Var.Q;
                            if (r03 == 0 || !r03.contains(l10)) {
                                throw e10;
                            }
                        }
                        try {
                            if (iVar.D().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                                break;
                            }
                        } catch (SQLiteException e11) {
                            ((w2) iVar.f20505s).C().f20710x.b("Failed to delete a bundle in a queue table", e11);
                            throw e11;
                            break;
                        }
                    }
                    i iVar4 = a6Var.f20294u;
                    a6.I(iVar4);
                    iVar4.m();
                    i iVar5 = a6Var.f20294u;
                    a6.I(iVar5);
                    iVar5.T();
                    a6Var.Q = null;
                    x1 x1Var = a6Var.f20293t;
                    a6.I(x1Var);
                    if (!x1Var.l() || !a6Var.G()) {
                        a6Var.R = -1L;
                        a6Var.D();
                    } else {
                        a6Var.r();
                    }
                    a6Var.G = 0L;
                } catch (Throwable th2) {
                    i iVar6 = a6Var.f20294u;
                    a6.I(iVar6);
                    iVar6.T();
                    throw th2;
                }
            } catch (SQLiteException e12) {
                a6Var.C().f20710x.b("Database error while trying to delete uploaded bundles", e12);
                Objects.requireNonNull((c) a6Var.c());
                a6Var.G = SystemClock.elapsedRealtime();
                a6Var.C().F.b("Disable upload, time", Long.valueOf(a6Var.G));
            }
        }
        a6Var.C().F.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
        c2 c2Var4 = a6Var.A.B;
        Objects.requireNonNull((c) a6Var.c());
        c2Var4.b(System.currentTimeMillis());
        if (i10 != 503) {
        }
        c2 c2Var22 = a6Var.A.f20455z;
        Objects.requireNonNull((c) a6Var.c());
        c2Var22.b(System.currentTimeMillis());
        i iVar22 = a6Var.f20294u;
        a6.I(iVar22);
        iVar22.U(r02);
        a6Var.D();
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }
}
