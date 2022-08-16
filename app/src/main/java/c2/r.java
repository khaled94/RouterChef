package c2;

import android.database.Cursor;
import c2.p;
import g1.b0;
import g1.e0;
import g1.i;
import g1.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import t1.n;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a */
    public final z f2654a;

    /* renamed from: b */
    public final i<p> f2655b;

    /* renamed from: c */
    public final b f2656c;

    /* renamed from: d */
    public final c f2657d;

    /* renamed from: e */
    public final d f2658e;

    /* renamed from: f */
    public final e f2659f;

    /* renamed from: g */
    public final f f2660g;

    /* renamed from: h */
    public final g f2661h;

    /* renamed from: i */
    public final h f2662i;

    /* loaded from: classes.dex */
    public class a extends i<p> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:57|98|93|58|(5:105|59|(2:62|60)|107|63)|97|103|75|78) */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01bd, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01be, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.HashSet, java.util.Set<t1.c$a>] */
        @Override // g1.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(k1.f r17, c2.p r18) {
            /*
                Method dump skipped, instructions count: 515
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.r.a.e(k1.f, java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public class b extends e0 {
        public b(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends e0 {
        public c(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class d extends e0 {
        public d(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class e extends e0 {
        public e(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class f extends e0 {
        public f(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class g extends e0 {
        public g(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class h extends e0 {
        public h(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public r(z zVar) {
        this.f2654a = zVar;
        this.f2655b = new a(zVar);
        this.f2656c = new b(zVar);
        this.f2657d = new c(zVar);
        this.f2658e = new d(zVar);
        this.f2659f = new e(zVar);
        this.f2660g = new f(zVar);
        this.f2661h = new g(zVar);
        this.f2662i = new h(zVar);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        this.f2654a.b();
        k1.f a10 = this.f2656c.a();
        if (str == null) {
            a10.v(1);
        } else {
            a10.o(1, str);
        }
        this.f2654a.c();
        try {
            a10.s();
            this.f2654a.o();
        } finally {
            this.f2654a.k();
            this.f2656c.d(a10);
        }
    }

    public final List b() {
        b0 b0Var;
        Throwable th;
        b0 j3 = b0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        j3.P(1, 200);
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            int a10 = i1.a.a(n10, "required_network_type");
            int a11 = i1.a.a(n10, "requires_charging");
            int a12 = i1.a.a(n10, "requires_device_idle");
            int a13 = i1.a.a(n10, "requires_battery_not_low");
            int a14 = i1.a.a(n10, "requires_storage_not_low");
            int a15 = i1.a.a(n10, "trigger_content_update_delay");
            int a16 = i1.a.a(n10, "trigger_max_content_delay");
            int a17 = i1.a.a(n10, "content_uri_triggers");
            int a18 = i1.a.a(n10, "id");
            int a19 = i1.a.a(n10, "state");
            int a20 = i1.a.a(n10, "worker_class_name");
            int a21 = i1.a.a(n10, "input_merger_class_name");
            int a22 = i1.a.a(n10, "input");
            int a23 = i1.a.a(n10, "output");
            b0Var = j3;
            try {
                int a24 = i1.a.a(n10, "initial_delay");
                int a25 = i1.a.a(n10, "interval_duration");
                int a26 = i1.a.a(n10, "flex_duration");
                int a27 = i1.a.a(n10, "run_attempt_count");
                int a28 = i1.a.a(n10, "backoff_policy");
                int a29 = i1.a.a(n10, "backoff_delay_duration");
                int a30 = i1.a.a(n10, "period_start_time");
                int a31 = i1.a.a(n10, "minimum_retention_duration");
                int a32 = i1.a.a(n10, "schedule_requested_at");
                int a33 = i1.a.a(n10, "run_in_foreground");
                int a34 = i1.a.a(n10, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(n10.getCount());
                while (n10.moveToNext()) {
                    String string = n10.getString(a18);
                    int i11 = a18;
                    String string2 = n10.getString(a20);
                    int i12 = a20;
                    t1.b bVar = new t1.b();
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
                    int i16 = i10;
                    pVar.f2640f = androidx.work.b.a(n10.getBlob(i16));
                    i10 = i16;
                    int i17 = a24;
                    pVar.f2641g = n10.getLong(i17);
                    int i18 = a22;
                    int i19 = a25;
                    pVar.f2642h = n10.getLong(i19);
                    int i20 = a13;
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
                    a11 = i14;
                    a22 = i18;
                    a24 = i17;
                    a25 = i19;
                    a27 = i22;
                    a32 = i27;
                    a18 = i11;
                    a20 = i12;
                    a10 = i13;
                    a33 = i28;
                    a31 = i26;
                    a12 = i15;
                    a29 = i24;
                    a13 = i20;
                    a28 = i23;
                }
                n10.close();
                b0Var.G();
                return arrayList;
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

    public final List<p> c(int i10) {
        b0 b0Var;
        Throwable th;
        b0 j3 = b0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        j3.P(1, i10);
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            int a10 = i1.a.a(n10, "required_network_type");
            int a11 = i1.a.a(n10, "requires_charging");
            int a12 = i1.a.a(n10, "requires_device_idle");
            int a13 = i1.a.a(n10, "requires_battery_not_low");
            int a14 = i1.a.a(n10, "requires_storage_not_low");
            int a15 = i1.a.a(n10, "trigger_content_update_delay");
            int a16 = i1.a.a(n10, "trigger_max_content_delay");
            int a17 = i1.a.a(n10, "content_uri_triggers");
            int a18 = i1.a.a(n10, "id");
            int a19 = i1.a.a(n10, "state");
            int a20 = i1.a.a(n10, "worker_class_name");
            int a21 = i1.a.a(n10, "input_merger_class_name");
            int a22 = i1.a.a(n10, "input");
            int a23 = i1.a.a(n10, "output");
            b0Var = j3;
            try {
                int a24 = i1.a.a(n10, "initial_delay");
                int a25 = i1.a.a(n10, "interval_duration");
                int a26 = i1.a.a(n10, "flex_duration");
                int a27 = i1.a.a(n10, "run_attempt_count");
                int a28 = i1.a.a(n10, "backoff_policy");
                int a29 = i1.a.a(n10, "backoff_delay_duration");
                int a30 = i1.a.a(n10, "period_start_time");
                int a31 = i1.a.a(n10, "minimum_retention_duration");
                int a32 = i1.a.a(n10, "schedule_requested_at");
                int a33 = i1.a.a(n10, "run_in_foreground");
                int a34 = i1.a.a(n10, "out_of_quota_policy");
                int i11 = a23;
                ArrayList arrayList = new ArrayList(n10.getCount());
                while (n10.moveToNext()) {
                    String string = n10.getString(a18);
                    int i12 = a18;
                    String string2 = n10.getString(a20);
                    int i13 = a20;
                    t1.b bVar = new t1.b();
                    int i14 = a10;
                    bVar.f18452a = v.c(n10.getInt(a10));
                    bVar.f18453b = n10.getInt(a11) != 0;
                    bVar.f18454c = n10.getInt(a12) != 0;
                    bVar.f18455d = n10.getInt(a13) != 0;
                    bVar.f18456e = n10.getInt(a14) != 0;
                    int i15 = a11;
                    int i16 = a12;
                    bVar.f18457f = n10.getLong(a15);
                    bVar.f18458g = n10.getLong(a16);
                    bVar.f18459h = v.a(n10.getBlob(a17));
                    p pVar = new p(string, string2);
                    pVar.f2636b = v.e(n10.getInt(a19));
                    pVar.f2638d = n10.getString(a21);
                    pVar.f2639e = androidx.work.b.a(n10.getBlob(a22));
                    int i17 = i11;
                    pVar.f2640f = androidx.work.b.a(n10.getBlob(i17));
                    int i18 = a24;
                    i11 = i17;
                    pVar.f2641g = n10.getLong(i18);
                    int i19 = a22;
                    int i20 = a25;
                    pVar.f2642h = n10.getLong(i20);
                    int i21 = a13;
                    int i22 = a26;
                    pVar.f2643i = n10.getLong(i22);
                    int i23 = a27;
                    pVar.f2645k = n10.getInt(i23);
                    int i24 = a28;
                    pVar.f2646l = v.b(n10.getInt(i24));
                    a26 = i22;
                    int i25 = a29;
                    pVar.f2647m = n10.getLong(i25);
                    int i26 = a30;
                    pVar.f2648n = n10.getLong(i26);
                    a30 = i26;
                    int i27 = a31;
                    pVar.f2649o = n10.getLong(i27);
                    int i28 = a32;
                    pVar.p = n10.getLong(i28);
                    int i29 = a33;
                    pVar.f2650q = n10.getInt(i29) != 0;
                    int i30 = a34;
                    pVar.f2651r = v.d(n10.getInt(i30));
                    pVar.f2644j = bVar;
                    arrayList.add(pVar);
                    a11 = i15;
                    a34 = i30;
                    a22 = i19;
                    a24 = i18;
                    a25 = i20;
                    a27 = i23;
                    a32 = i28;
                    a18 = i12;
                    a20 = i13;
                    a10 = i14;
                    a33 = i29;
                    a31 = i27;
                    a12 = i16;
                    a29 = i25;
                    a13 = i21;
                    a28 = i24;
                }
                n10.close();
                b0Var.G();
                return arrayList;
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

    public final List<p> d() {
        b0 b0Var;
        Throwable th;
        b0 j3 = b0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            int a10 = i1.a.a(n10, "required_network_type");
            int a11 = i1.a.a(n10, "requires_charging");
            int a12 = i1.a.a(n10, "requires_device_idle");
            int a13 = i1.a.a(n10, "requires_battery_not_low");
            int a14 = i1.a.a(n10, "requires_storage_not_low");
            int a15 = i1.a.a(n10, "trigger_content_update_delay");
            int a16 = i1.a.a(n10, "trigger_max_content_delay");
            int a17 = i1.a.a(n10, "content_uri_triggers");
            int a18 = i1.a.a(n10, "id");
            int a19 = i1.a.a(n10, "state");
            int a20 = i1.a.a(n10, "worker_class_name");
            int a21 = i1.a.a(n10, "input_merger_class_name");
            int a22 = i1.a.a(n10, "input");
            int a23 = i1.a.a(n10, "output");
            b0Var = j3;
            try {
                int a24 = i1.a.a(n10, "initial_delay");
                int a25 = i1.a.a(n10, "interval_duration");
                int a26 = i1.a.a(n10, "flex_duration");
                int a27 = i1.a.a(n10, "run_attempt_count");
                int a28 = i1.a.a(n10, "backoff_policy");
                int a29 = i1.a.a(n10, "backoff_delay_duration");
                int a30 = i1.a.a(n10, "period_start_time");
                int a31 = i1.a.a(n10, "minimum_retention_duration");
                int a32 = i1.a.a(n10, "schedule_requested_at");
                int a33 = i1.a.a(n10, "run_in_foreground");
                int a34 = i1.a.a(n10, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(n10.getCount());
                while (n10.moveToNext()) {
                    String string = n10.getString(a18);
                    int i11 = a18;
                    String string2 = n10.getString(a20);
                    int i12 = a20;
                    t1.b bVar = new t1.b();
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
                    int i16 = i10;
                    pVar.f2640f = androidx.work.b.a(n10.getBlob(i16));
                    i10 = i16;
                    int i17 = a24;
                    pVar.f2641g = n10.getLong(i17);
                    int i18 = a22;
                    int i19 = a25;
                    pVar.f2642h = n10.getLong(i19);
                    int i20 = a13;
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
                    a11 = i14;
                    a22 = i18;
                    a24 = i17;
                    a25 = i19;
                    a27 = i22;
                    a32 = i27;
                    a18 = i11;
                    a20 = i12;
                    a10 = i13;
                    a33 = i28;
                    a31 = i26;
                    a12 = i15;
                    a29 = i24;
                    a13 = i20;
                    a28 = i23;
                }
                n10.close();
                b0Var.G();
                return arrayList;
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

    public final List<p> e() {
        b0 b0Var;
        Throwable th;
        b0 j3 = b0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            int a10 = i1.a.a(n10, "required_network_type");
            int a11 = i1.a.a(n10, "requires_charging");
            int a12 = i1.a.a(n10, "requires_device_idle");
            int a13 = i1.a.a(n10, "requires_battery_not_low");
            int a14 = i1.a.a(n10, "requires_storage_not_low");
            int a15 = i1.a.a(n10, "trigger_content_update_delay");
            int a16 = i1.a.a(n10, "trigger_max_content_delay");
            int a17 = i1.a.a(n10, "content_uri_triggers");
            int a18 = i1.a.a(n10, "id");
            int a19 = i1.a.a(n10, "state");
            int a20 = i1.a.a(n10, "worker_class_name");
            int a21 = i1.a.a(n10, "input_merger_class_name");
            int a22 = i1.a.a(n10, "input");
            int a23 = i1.a.a(n10, "output");
            b0Var = j3;
            try {
                int a24 = i1.a.a(n10, "initial_delay");
                int a25 = i1.a.a(n10, "interval_duration");
                int a26 = i1.a.a(n10, "flex_duration");
                int a27 = i1.a.a(n10, "run_attempt_count");
                int a28 = i1.a.a(n10, "backoff_policy");
                int a29 = i1.a.a(n10, "backoff_delay_duration");
                int a30 = i1.a.a(n10, "period_start_time");
                int a31 = i1.a.a(n10, "minimum_retention_duration");
                int a32 = i1.a.a(n10, "schedule_requested_at");
                int a33 = i1.a.a(n10, "run_in_foreground");
                int a34 = i1.a.a(n10, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(n10.getCount());
                while (n10.moveToNext()) {
                    String string = n10.getString(a18);
                    int i11 = a18;
                    String string2 = n10.getString(a20);
                    int i12 = a20;
                    t1.b bVar = new t1.b();
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
                    int i16 = i10;
                    pVar.f2640f = androidx.work.b.a(n10.getBlob(i16));
                    i10 = i16;
                    int i17 = a24;
                    pVar.f2641g = n10.getLong(i17);
                    int i18 = a22;
                    int i19 = a25;
                    pVar.f2642h = n10.getLong(i19);
                    int i20 = a13;
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
                    a11 = i14;
                    a22 = i18;
                    a24 = i17;
                    a25 = i19;
                    a27 = i22;
                    a32 = i27;
                    a18 = i11;
                    a20 = i12;
                    a10 = i13;
                    a33 = i28;
                    a31 = i26;
                    a12 = i15;
                    a29 = i24;
                    a13 = i20;
                    a28 = i23;
                }
                n10.close();
                b0Var.G();
                return arrayList;
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

    public final n f(String str) {
        b0 j3 = b0.j("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2654a.b();
        n nVar = null;
        Cursor n10 = this.f2654a.n(j3);
        try {
            if (n10.moveToFirst()) {
                nVar = v.e(n10.getInt(0));
            }
            return nVar;
        } finally {
            n10.close();
            j3.G();
        }
    }

    public final List<String> g(String str) {
        b0 j3 = b0.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            ArrayList arrayList = new ArrayList(n10.getCount());
            while (n10.moveToNext()) {
                arrayList.add(n10.getString(0));
            }
            return arrayList;
        } finally {
            n10.close();
            j3.G();
        }
    }

    public final List<String> h(String str) {
        b0 j3 = b0.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            ArrayList arrayList = new ArrayList(n10.getCount());
            while (n10.moveToNext()) {
                arrayList.add(n10.getString(0));
            }
            return arrayList;
        } finally {
            n10.close();
            j3.G();
        }
    }

    public final p i(String str) {
        b0 b0Var;
        Throwable th;
        p pVar;
        b0 j3 = b0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            int a10 = i1.a.a(n10, "required_network_type");
            int a11 = i1.a.a(n10, "requires_charging");
            int a12 = i1.a.a(n10, "requires_device_idle");
            int a13 = i1.a.a(n10, "requires_battery_not_low");
            int a14 = i1.a.a(n10, "requires_storage_not_low");
            int a15 = i1.a.a(n10, "trigger_content_update_delay");
            int a16 = i1.a.a(n10, "trigger_max_content_delay");
            int a17 = i1.a.a(n10, "content_uri_triggers");
            int a18 = i1.a.a(n10, "id");
            int a19 = i1.a.a(n10, "state");
            int a20 = i1.a.a(n10, "worker_class_name");
            int a21 = i1.a.a(n10, "input_merger_class_name");
            int a22 = i1.a.a(n10, "input");
            int a23 = i1.a.a(n10, "output");
            b0Var = j3;
            try {
                int a24 = i1.a.a(n10, "initial_delay");
                int a25 = i1.a.a(n10, "interval_duration");
                int a26 = i1.a.a(n10, "flex_duration");
                int a27 = i1.a.a(n10, "run_attempt_count");
                int a28 = i1.a.a(n10, "backoff_policy");
                int a29 = i1.a.a(n10, "backoff_delay_duration");
                int a30 = i1.a.a(n10, "period_start_time");
                int a31 = i1.a.a(n10, "minimum_retention_duration");
                int a32 = i1.a.a(n10, "schedule_requested_at");
                int a33 = i1.a.a(n10, "run_in_foreground");
                int a34 = i1.a.a(n10, "out_of_quota_policy");
                if (n10.moveToFirst()) {
                    String string = n10.getString(a18);
                    String string2 = n10.getString(a20);
                    t1.b bVar = new t1.b();
                    bVar.f18452a = v.c(n10.getInt(a10));
                    bVar.f18453b = n10.getInt(a11) != 0;
                    bVar.f18454c = n10.getInt(a12) != 0;
                    bVar.f18455d = n10.getInt(a13) != 0;
                    bVar.f18456e = n10.getInt(a14) != 0;
                    bVar.f18457f = n10.getLong(a15);
                    bVar.f18458g = n10.getLong(a16);
                    bVar.f18459h = v.a(n10.getBlob(a17));
                    pVar = new p(string, string2);
                    pVar.f2636b = v.e(n10.getInt(a19));
                    pVar.f2638d = n10.getString(a21);
                    pVar.f2639e = androidx.work.b.a(n10.getBlob(a22));
                    pVar.f2640f = androidx.work.b.a(n10.getBlob(a23));
                    pVar.f2641g = n10.getLong(a24);
                    pVar.f2642h = n10.getLong(a25);
                    pVar.f2643i = n10.getLong(a26);
                    pVar.f2645k = n10.getInt(a27);
                    pVar.f2646l = v.b(n10.getInt(a28));
                    pVar.f2647m = n10.getLong(a29);
                    pVar.f2648n = n10.getLong(a30);
                    pVar.f2649o = n10.getLong(a31);
                    pVar.p = n10.getLong(a32);
                    pVar.f2650q = n10.getInt(a33) != 0;
                    pVar.f2651r = v.d(n10.getInt(a34));
                    pVar.f2644j = bVar;
                } else {
                    pVar = null;
                }
                n10.close();
                b0Var.G();
                return pVar;
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

    public final List<p.a> j(String str) {
        b0 j3 = b0.j("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2654a.b();
        Cursor n10 = this.f2654a.n(j3);
        try {
            int a10 = i1.a.a(n10, "id");
            int a11 = i1.a.a(n10, "state");
            ArrayList arrayList = new ArrayList(n10.getCount());
            while (n10.moveToNext()) {
                p.a aVar = new p.a();
                aVar.f2652a = n10.getString(a10);
                aVar.f2653b = v.e(n10.getInt(a11));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            n10.close();
            j3.G();
        }
    }

    public final int k(String str) {
        this.f2654a.b();
        k1.f a10 = this.f2659f.a();
        if (str == null) {
            a10.v(1);
        } else {
            a10.o(1, str);
        }
        this.f2654a.c();
        try {
            int s10 = a10.s();
            this.f2654a.o();
            return s10;
        } finally {
            this.f2654a.k();
            this.f2659f.d(a10);
        }
    }

    public final int l(String str, long j3) {
        this.f2654a.b();
        k1.f a10 = this.f2661h.a();
        a10.P(1, j3);
        if (str == null) {
            a10.v(2);
        } else {
            a10.o(2, str);
        }
        this.f2654a.c();
        try {
            int s10 = a10.s();
            this.f2654a.o();
            return s10;
        } finally {
            this.f2654a.k();
            this.f2661h.d(a10);
        }
    }

    public final int m(String str) {
        this.f2654a.b();
        k1.f a10 = this.f2660g.a();
        if (str == null) {
            a10.v(1);
        } else {
            a10.o(1, str);
        }
        this.f2654a.c();
        try {
            int s10 = a10.s();
            this.f2654a.o();
            return s10;
        } finally {
            this.f2654a.k();
            this.f2660g.d(a10);
        }
    }

    public final void n(String str, androidx.work.b bVar) {
        this.f2654a.b();
        k1.f a10 = this.f2657d.a();
        byte[] c10 = androidx.work.b.c(bVar);
        if (c10 == null) {
            a10.v(1);
        } else {
            a10.a0(1, c10);
        }
        if (str == null) {
            a10.v(2);
        } else {
            a10.o(2, str);
        }
        this.f2654a.c();
        try {
            a10.s();
            this.f2654a.o();
        } finally {
            this.f2654a.k();
            this.f2657d.d(a10);
        }
    }

    public final void o(String str, long j3) {
        this.f2654a.b();
        k1.f a10 = this.f2658e.a();
        a10.P(1, j3);
        if (str == null) {
            a10.v(2);
        } else {
            a10.o(2, str);
        }
        this.f2654a.c();
        try {
            a10.s();
            this.f2654a.o();
        } finally {
            this.f2654a.k();
            this.f2658e.d(a10);
        }
    }

    public final int p(n nVar, String... strArr) {
        this.f2654a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append("?");
            if (i10 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        z zVar = this.f2654a;
        zVar.a();
        zVar.b();
        k1.f t10 = zVar.f4864c.h0().t(sb2);
        t10.P(1, v.f(nVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                t10.v(i11);
            } else {
                t10.o(i11, str);
            }
            i11++;
        }
        this.f2654a.c();
        try {
            int s10 = t10.s();
            this.f2654a.o();
            return s10;
        } finally {
            this.f2654a.k();
        }
    }
}
