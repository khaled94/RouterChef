package androidx.work.impl;

import android.content.Context;
import c2.c;
import c2.e;
import c2.f;
import c2.h;
import c2.i;
import c2.k;
import c2.l;
import c2.o;
import c2.q;
import c2.r;
import c2.t;
import c2.u;
import g1.a0;
import g1.n;
import g1.z;
import i1.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import k1.b;
import k1.c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: u */
    public static final /* synthetic */ int f2310u = 0;

    /* renamed from: n */
    public volatile r f2311n;

    /* renamed from: o */
    public volatile c f2312o;
    public volatile u p;

    /* renamed from: q */
    public volatile i f2313q;

    /* renamed from: r */
    public volatile l f2314r;

    /* renamed from: s */
    public volatile o f2315s;

    /* renamed from: t */
    public volatile f f2316t;

    /* loaded from: classes.dex */
    public class a extends a0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(12);
            WorkDatabase_Impl.this = r1;
        }

        @Override // g1.a0.a
        public final void a(b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.n("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.n("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.n("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.n("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.n("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.n("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.n("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // g1.a0.a
        public final void b(b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("DROP TABLE IF EXISTS `Dependency`");
            aVar.n("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.n("DROP TABLE IF EXISTS `WorkTag`");
            aVar.n("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.n("DROP TABLE IF EXISTS `WorkName`");
            aVar.n("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.n("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f2310u;
            List<z.b> list = workDatabase_Impl.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f4867f.get(i11));
                }
            }
        }

        @Override // g1.a0.a
        public final void c() {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f2310u;
            List<z.b> list = workDatabase_Impl.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f4867f.get(i11));
                }
            }
        }

        @Override // g1.a0.a
        public final void d(b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f2310u;
            workDatabase_Impl.f4862a = bVar;
            l1.a aVar = (l1.a) bVar;
            aVar.n("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.l(aVar);
            List<z.b> list = WorkDatabase_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.f4867f.get(i11).a(aVar);
                }
            }
        }

        @Override // g1.a0.a
        public final void e() {
        }

        @Override // g1.a0.a
        public final void f(b bVar) {
            i1.b.a(bVar);
        }

        @Override // g1.a0.a
        public final a0.b g(b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new c.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new c.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), null));
            hashSet2.add(new c.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), null));
            i1.c cVar = new i1.c("Dependency", hashMap, hashSet, hashSet2);
            i1.c a10 = i1.c.a(bVar, "Dependency");
            if (!cVar.equals(a10)) {
                return new a0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new c.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new c.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new c.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new c.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new c.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new c.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new c.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new c.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new c.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new c.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new c.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new c.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new c.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new c.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new c.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new c.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new c.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new c.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new c.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new c.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new c.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new c.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new c.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new c.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new c.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new c.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), null));
            hashSet4.add(new c.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time"), null));
            i1.c cVar2 = new i1.c("WorkSpec", hashMap2, hashSet3, hashSet4);
            i1.c a11 = i1.c.a(bVar, "WorkSpec");
            if (!cVar2.equals(a11)) {
                return new a0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new c.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new c.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), null));
            i1.c cVar3 = new i1.c("WorkTag", hashMap3, hashSet5, hashSet6);
            i1.c a12 = i1.c.a(bVar, "WorkTag");
            if (!cVar3.equals(a12)) {
                return new a0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new c.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            i1.c cVar4 = new i1.c("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            i1.c a13 = i1.c.a(bVar, "SystemIdInfo");
            if (!cVar4.equals(a13)) {
                return new a0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new c.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new c.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), null));
            i1.c cVar5 = new i1.c("WorkName", hashMap5, hashSet8, hashSet9);
            i1.c a14 = i1.c.a(bVar, "WorkName");
            if (!cVar5.equals(a14)) {
                return new a0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new c.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            i1.c cVar6 = new i1.c("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            i1.c a15 = i1.c.a(bVar, "WorkProgress");
            if (!cVar6.equals(a15)) {
                return new a0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new c.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new c.a("long_value", "INTEGER", false, 0, null, 1));
            i1.c cVar7 = new i1.c("Preference", hashMap7, new HashSet(0), new HashSet(0));
            i1.c a16 = i1.c.a(bVar, "Preference");
            if (cVar7.equals(a16)) {
                return new a0.b(true, null);
            }
            return new a0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cVar7 + "\n Found:\n" + a16);
        }
    }

    @Override // g1.z
    public final n d() {
        return new n(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // g1.z
    public final k1.c e(g1.f fVar) {
        a0 a0Var = new a0(fVar, new a(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = fVar.f4803b;
        String str = fVar.f4804c;
        if (context != null) {
            return fVar.f4802a.a(new c.b(context, str, a0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c2.b q() {
        c2.c cVar;
        if (this.f2312o != null) {
            return this.f2312o;
        }
        synchronized (this) {
            if (this.f2312o == null) {
                this.f2312o = new c2.c(this);
            }
            cVar = this.f2312o;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e r() {
        f fVar;
        if (this.f2316t != null) {
            return this.f2316t;
        }
        synchronized (this) {
            if (this.f2316t == null) {
                this.f2316t = new f(this);
            }
            fVar = this.f2316t;
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h s() {
        i iVar;
        if (this.f2313q != null) {
            return this.f2313q;
        }
        synchronized (this) {
            if (this.f2313q == null) {
                this.f2313q = new i(this);
            }
            iVar = this.f2313q;
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k t() {
        l lVar;
        if (this.f2314r != null) {
            return this.f2314r;
        }
        synchronized (this) {
            if (this.f2314r == null) {
                this.f2314r = new l(this);
            }
            lVar = this.f2314r;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c2.n u() {
        o oVar;
        if (this.f2315s != null) {
            return this.f2315s;
        }
        synchronized (this) {
            if (this.f2315s == null) {
                this.f2315s = new o(this);
            }
            oVar = this.f2315s;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q v() {
        r rVar;
        if (this.f2311n != null) {
            return this.f2311n;
        }
        synchronized (this) {
            if (this.f2311n == null) {
                this.f2311n = new r(this);
            }
            rVar = this.f2311n;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t w() {
        u uVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new u(this);
            }
            uVar = this.p;
        }
        return uVar;
    }
}
