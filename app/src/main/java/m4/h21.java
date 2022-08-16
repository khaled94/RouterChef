package m4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;
import java.util.Objects;
import k9.u;
import l3.s;

/* loaded from: classes.dex */
public final class h21 implements ko1 {

    /* renamed from: s */
    public boolean f9086s;

    /* renamed from: t */
    public final Object f9087t;

    public /* synthetic */ h21() {
        this.f9087t = g11.f8705a;
    }

    public /* synthetic */ h21(r61 r61Var, boolean z10) {
        this.f9087t = r61Var;
        this.f9086s = z10;
    }

    public final synchronized boolean a() {
        boolean z10;
        z10 = this.f9086s;
        this.f9086s = false;
        return z10;
    }

    public final synchronized boolean b() {
        if (this.f9086s) {
            return false;
        }
        this.f9086s = true;
        notifyAll();
        return true;
    }

    @Override // m4.ko1
    /* renamed from: h */
    public final Object mo30h(Object obj) {
        r61 r61Var = (r61) this.f9087t;
        boolean z10 = this.f9086s;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(r61Var);
        if (z10) {
            r61Var.f13175b.deleteDatabase("OfflineUpload.db");
        } else {
            int i10 = 2;
            if (((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue()) {
                dp1 b10 = dp1.b("oa_upload");
                b10.a("oa_failed_reqs", String.valueOf(u.d(sQLiteDatabase, 0)));
                b10.a("oa_total_reqs", String.valueOf(u.d(sQLiteDatabase, 1)));
                Objects.requireNonNull(s.B.f5796j);
                b10.a("oa_upload_time", String.valueOf(System.currentTimeMillis()));
                b10.a("oa_last_successful_time", String.valueOf(u.g(sQLiteDatabase)));
                b10.a("oa_session_id", r61Var.f13179f.J() ? "" : r61Var.f13177d);
                r61Var.f13178e.a(b10);
                ArrayList j3 = u.j(sQLiteDatabase);
                r61.a(sQLiteDatabase, j3);
                int size = j3.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sl slVar = (sl) j3.get(i11);
                    dp1 b11 = dp1.b("oa_signals");
                    b11.a("oa_session_id", r61Var.f13179f.J() ? "" : r61Var.f13177d);
                    nl B = slVar.B();
                    String valueOf = B.z() ? String.valueOf(B.B() - 1) : "-1";
                    String obj2 = new tw1(slVar.G()).toString();
                    b11.a("oa_sig_ts", String.valueOf(slVar.A()));
                    b11.a("oa_sig_status", String.valueOf(slVar.R() - 1));
                    b11.a("oa_sig_resp_lat", String.valueOf(slVar.z()));
                    b11.a("oa_sig_render_lat", String.valueOf(slVar.y()));
                    b11.a("oa_sig_formats", obj2);
                    b11.a("oa_sig_nw_type", valueOf);
                    b11.a("oa_sig_wifi", String.valueOf(slVar.S() - 1));
                    b11.a("oa_sig_airplane", String.valueOf(slVar.O() - 1));
                    b11.a("oa_sig_data", String.valueOf(slVar.P() - 1));
                    b11.a("oa_sig_nw_resp", String.valueOf(slVar.x()));
                    b11.a("oa_sig_offline", String.valueOf(slVar.Q() - 1));
                    b11.a("oa_sig_nw_state", String.valueOf(slVar.F().f14723s));
                    if (B.y() && B.z() && B.B() == 2) {
                        b11.a("oa_sig_cell_type", String.valueOf(B.A() - 1));
                    }
                    r61Var.f13178e.a(b11);
                }
            } else {
                ArrayList j10 = u.j(sQLiteDatabase);
                tl v10 = wl.v();
                String packageName = r61Var.f13175b.getPackageName();
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.B((wl) v10.f9883t, packageName);
                String str = Build.MODEL;
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.C((wl) v10.f9883t);
                int d5 = u.d(sQLiteDatabase, 0);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.y((wl) v10.f9883t, d5);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.x((wl) v10.f9883t, j10);
                int d10 = u.d(sQLiteDatabase, 1);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.z((wl) v10.f9883t, d10);
                Objects.requireNonNull(s.B.f5796j);
                long currentTimeMillis = System.currentTimeMillis();
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.A((wl) v10.f9883t, currentTimeMillis);
                long g10 = u.g(sQLiteDatabase);
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                wl.D((wl) v10.f9883t, g10);
                wl k10 = v10.k();
                r61.a(sQLiteDatabase, j10);
                wj wjVar = r61Var.f13174a;
                synchronized (wjVar) {
                    if (wjVar.f15033c) {
                        try {
                            cl clVar = wjVar.f15032b;
                            if (clVar.f9884u) {
                                clVar.m();
                                clVar.f9884u = false;
                            }
                            dl.F((dl) clVar.f9883t, k10);
                        } catch (NullPointerException e10) {
                            s.B.f5793g.g(e10, "AdMobClearcutLogger.modify");
                        }
                    }
                }
                hm v11 = im.v();
                int i12 = r61Var.f13176c.f12052t;
                if (v11.f9884u) {
                    v11.m();
                    v11.f9884u = false;
                }
                im.x((im) v11.f9883t, i12);
                int i13 = r61Var.f13176c.f12053u;
                if (v11.f9884u) {
                    v11.m();
                    v11.f9884u = false;
                }
                im.y((im) v11.f9883t, i13);
                if (true == r61Var.f13176c.f12054v) {
                    i10 = 0;
                }
                if (v11.f9884u) {
                    v11.m();
                    v11.f9884u = false;
                }
                im.z((im) v11.f9883t, i10);
                r61Var.f13174a.a(new e7(v11.k(), 5));
                r61Var.f13174a.b(10004);
            }
            sQLiteDatabase.delete("offline_signal_contents", null, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("value", (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        }
        return null;
    }
}
