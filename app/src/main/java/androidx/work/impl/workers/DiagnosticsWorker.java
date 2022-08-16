package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c2.g;
import c2.i;
import c2.k;
import c2.l;
import c2.p;
import c2.q;
import c2.r;
import c2.t;
import c2.u;
import c2.v;
import g1.b0;
import i1.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import t1.b;
import t1.h;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String y = h.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Finally extract failed */
    public static String a(k kVar, t tVar, c2.h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (p pVar : list) {
            g a10 = ((i) hVar).a(pVar.f2635a);
            Integer num = null;
            if (a10 != null) {
                num = Integer.valueOf(a10.f2621b);
            }
            String str = pVar.f2635a;
            l lVar = (l) kVar;
            Objects.requireNonNull(lVar);
            b0 j3 = b0.j("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                j3.v(1);
            } else {
                j3.o(1, str);
            }
            lVar.f2627a.b();
            Cursor n10 = lVar.f2627a.n(j3);
            try {
                ArrayList arrayList = new ArrayList(n10.getCount());
                while (n10.moveToNext()) {
                    arrayList.add(n10.getString(0));
                }
                n10.close();
                j3.G();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f2635a, pVar.f2637c, num, pVar.f2636b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((u) tVar).a(pVar.f2635a))));
            } catch (Throwable th) {
                n10.close();
                j3.G();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        b0 b0Var;
        Throwable th;
        ArrayList arrayList;
        c2.h hVar;
        t tVar;
        k kVar;
        int i10;
        WorkDatabase workDatabase = u1.k.c(getApplicationContext()).f19025c;
        q v10 = workDatabase.v();
        k t10 = workDatabase.t();
        t w10 = workDatabase.w();
        c2.h s10 = workDatabase.s();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        r rVar = (r) v10;
        Objects.requireNonNull(rVar);
        b0 j3 = b0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        j3.P(1, currentTimeMillis);
        rVar.f2654a.b();
        Cursor n10 = rVar.f2654a.n(j3);
        try {
            int a10 = a.a(n10, "required_network_type");
            int a11 = a.a(n10, "requires_charging");
            int a12 = a.a(n10, "requires_device_idle");
            int a13 = a.a(n10, "requires_battery_not_low");
            int a14 = a.a(n10, "requires_storage_not_low");
            int a15 = a.a(n10, "trigger_content_update_delay");
            int a16 = a.a(n10, "trigger_max_content_delay");
            int a17 = a.a(n10, "content_uri_triggers");
            int a18 = a.a(n10, "id");
            int a19 = a.a(n10, "state");
            int a20 = a.a(n10, "worker_class_name");
            int a21 = a.a(n10, "input_merger_class_name");
            int a22 = a.a(n10, "input");
            int a23 = a.a(n10, "output");
            b0Var = j3;
            try {
                int a24 = a.a(n10, "initial_delay");
                int a25 = a.a(n10, "interval_duration");
                int a26 = a.a(n10, "flex_duration");
                int a27 = a.a(n10, "run_attempt_count");
                int a28 = a.a(n10, "backoff_policy");
                int a29 = a.a(n10, "backoff_delay_duration");
                int a30 = a.a(n10, "period_start_time");
                int a31 = a.a(n10, "minimum_retention_duration");
                int a32 = a.a(n10, "schedule_requested_at");
                int a33 = a.a(n10, "run_in_foreground");
                int a34 = a.a(n10, "out_of_quota_policy");
                int i11 = a23;
                ArrayList arrayList2 = new ArrayList(n10.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!n10.moveToNext()) {
                        break;
                    }
                    String string = n10.getString(a18);
                    String string2 = n10.getString(a20);
                    int i12 = a20;
                    b bVar = new b();
                    int i13 = a10;
                    bVar.f18452a = v.c(n10.getInt(a10));
                    bVar.f18453b = n10.getInt(a11) != 0;
                    bVar.f18454c = n10.getInt(a12) != 0;
                    bVar.f18455d = n10.getInt(a13) != 0;
                    bVar.f18456e = n10.getInt(a14) != 0;
                    int i14 = a11;
                    int i15 = a12;
                    bVar.f18457f = n10.getLong(a15);
                    bVar.f18458g = n10.getLong(a16);
                    bVar.f18459h = v.a(n10.getBlob(a17));
                    p pVar = new p(string, string2);
                    pVar.f2636b = v.e(n10.getInt(a19));
                    pVar.f2638d = n10.getString(a21);
                    pVar.f2639e = androidx.work.b.a(n10.getBlob(a22));
                    int i16 = i11;
                    pVar.f2640f = androidx.work.b.a(n10.getBlob(i16));
                    i11 = i16;
                    int i17 = a21;
                    int i18 = a24;
                    pVar.f2641g = n10.getLong(i18);
                    int i19 = a22;
                    int i20 = a25;
                    pVar.f2642h = n10.getLong(i20);
                    int i21 = a26;
                    pVar.f2643i = n10.getLong(i21);
                    int i22 = a27;
                    pVar.f2645k = n10.getInt(i22);
                    int i23 = a28;
                    pVar.f2646l = v.b(n10.getInt(i23));
                    a26 = i21;
                    int i24 = a29;
                    pVar.f2647m = n10.getLong(i24);
                    int i25 = a30;
                    pVar.f2648n = n10.getLong(i25);
                    a30 = i25;
                    int i26 = a31;
                    pVar.f2649o = n10.getLong(i26);
                    int i27 = a32;
                    pVar.p = n10.getLong(i27);
                    int i28 = a33;
                    pVar.f2650q = n10.getInt(i28) != 0;
                    int i29 = a34;
                    pVar.f2651r = v.d(n10.getInt(i29));
                    pVar.f2644j = bVar;
                    arrayList.add(pVar);
                    a34 = i29;
                    a22 = i19;
                    a24 = i18;
                    a25 = i20;
                    a11 = i14;
                    a28 = i23;
                    a27 = i22;
                    a32 = i27;
                    a33 = i28;
                    a31 = i26;
                    a29 = i24;
                    a21 = i17;
                    a12 = i15;
                    a10 = i13;
                    arrayList2 = arrayList;
                    a20 = i12;
                }
                n10.close();
                b0Var.G();
                List<p> d5 = rVar.d();
                List b10 = rVar.b();
                if (!arrayList.isEmpty()) {
                    h c10 = h.c();
                    String str = y;
                    i10 = 0;
                    c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = s10;
                    kVar = t10;
                    tVar = w10;
                    h.c().d(str, a(kVar, tVar, hVar, arrayList), new Throwable[0]);
                } else {
                    hVar = s10;
                    kVar = t10;
                    tVar = w10;
                    i10 = 0;
                }
                if (!((ArrayList) d5).isEmpty()) {
                    h c11 = h.c();
                    String str2 = y;
                    c11.d(str2, "Running work:\n\n", new Throwable[i10]);
                    h.c().d(str2, a(kVar, tVar, hVar, d5), new Throwable[i10]);
                }
                if (!((ArrayList) b10).isEmpty()) {
                    h c12 = h.c();
                    String str3 = y;
                    c12.d(str3, "Enqueued work:\n\n", new Throwable[i10]);
                    h.c().d(str3, a(kVar, tVar, hVar, b10), new Throwable[i10]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th2) {
                th = th2;
                n10.close();
                b0Var.G();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b0Var = j3;
        }
    }
}
