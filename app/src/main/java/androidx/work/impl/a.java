package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static C0028a f2318a = new C0028a();

    /* renamed from: b */
    public static b f2319b = new b();

    /* renamed from: c */
    public static c f2320c = new c();

    /* renamed from: d */
    public static d f2321d = new d();

    /* renamed from: e */
    public static e f2322e = new e();

    /* renamed from: f */
    public static f f2323f = new f();

    /* renamed from: g */
    public static g f2324g = new g();

    /* renamed from: androidx.work.impl.a$a */
    /* loaded from: classes.dex */
    public class C0028a extends h1.b {
        public C0028a() {
            super(1, 2);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.n("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.n("DROP TABLE IF EXISTS alarmInfo");
            aVar.n("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class b extends h1.b {
        public b() {
            super(3, 4);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            ((l1.a) bVar).n("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* loaded from: classes.dex */
    public class c extends h1.b {
        public c() {
            super(4, 5);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    public class d extends h1.b {
        public d() {
            super(6, 7);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            ((l1.a) bVar).n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    public class e extends h1.b {
        public e() {
            super(7, 8);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            ((l1.a) bVar).n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    public class f extends h1.b {
        public f() {
            super(8, 9);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            ((l1.a) bVar).n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public class g extends h1.b {
        public g() {
            super(11, 12);
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            ((l1.a) bVar).n("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends h1.b {

        /* renamed from: c */
        public final Context f2325c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f2325c = context;
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            if (this.f4954b >= 10) {
                ((l1.a) bVar).T("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f2325c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h1.b {

        /* renamed from: c */
        public final Context f2326c;

        public i(Context context) {
            super(9, 10);
            this.f2326c = context;
        }

        @Override // h1.b
        public final void a(k1.b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f2326c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j3 = 0;
                long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j3 = 1;
                }
                aVar.h();
                try {
                    aVar.T("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                    aVar.T("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                    sharedPreferences.edit().clear().apply();
                    aVar.Q();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = this.f2326c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.h();
                try {
                    aVar.T("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                    aVar.T("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.Q();
                } finally {
                }
            }
        }
    }
}
