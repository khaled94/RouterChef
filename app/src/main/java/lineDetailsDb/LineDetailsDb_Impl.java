package lineDetailsDb;

import android.content.Context;
import g1.a0;
import g1.f;
import g1.n;
import g1.z;
import i1.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k1.c;
import p9.b;

/* loaded from: classes.dex */
public final class LineDetailsDb_Impl extends LineDetailsDb {

    /* renamed from: m */
    public volatile b f5830m;

    /* loaded from: classes.dex */
    public class a extends a0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(4);
            LineDetailsDb_Impl.this = r1;
        }

        @Override // g1.a0.a
        public final void a(k1.b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("CREATE TABLE IF NOT EXISTS `LineDetailsInfo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `routerModel` TEXT, `time` INTEGER NOT NULL, `modType` TEXT, `lineRate` TEXT, `maxRate` TEXT, `noise` TEXT, `chanType` TEXT, `depth` TEXT, `delay` TEXT, `crc` TEXT, `fec` TEXT, `upTime` TEXT)");
            aVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '69e641b31ffcd1a382ddda90da437860')");
        }

        @Override // g1.a0.a
        public final void b(k1.b bVar) {
            ((l1.a) bVar).n("DROP TABLE IF EXISTS `LineDetailsInfo`");
            List<z.b> list = LineDetailsDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Objects.requireNonNull(LineDetailsDb_Impl.this.f4867f.get(i10));
                }
            }
        }

        @Override // g1.a0.a
        public final void c() {
            List<z.b> list = LineDetailsDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Objects.requireNonNull(LineDetailsDb_Impl.this.f4867f.get(i10));
                }
            }
        }

        @Override // g1.a0.a
        public final void d(k1.b bVar) {
            LineDetailsDb_Impl.this.f4862a = bVar;
            LineDetailsDb_Impl.this.l(bVar);
            List<z.b> list = LineDetailsDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LineDetailsDb_Impl.this.f4867f.get(i10).a(bVar);
                }
            }
        }

        @Override // g1.a0.a
        public final void e() {
        }

        @Override // g1.a0.a
        public final void f(k1.b bVar) {
            i1.b.a(bVar);
        }

        @Override // g1.a0.a
        public final a0.b g(k1.b bVar) {
            HashMap hashMap = new HashMap(13);
            hashMap.put("id", new c.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("routerModel", new c.a("routerModel", "TEXT", false, 0, null, 1));
            hashMap.put("time", new c.a("time", "INTEGER", true, 0, null, 1));
            hashMap.put("modType", new c.a("modType", "TEXT", false, 0, null, 1));
            hashMap.put("lineRate", new c.a("lineRate", "TEXT", false, 0, null, 1));
            hashMap.put("maxRate", new c.a("maxRate", "TEXT", false, 0, null, 1));
            hashMap.put("noise", new c.a("noise", "TEXT", false, 0, null, 1));
            hashMap.put("chanType", new c.a("chanType", "TEXT", false, 0, null, 1));
            hashMap.put("depth", new c.a("depth", "TEXT", false, 0, null, 1));
            hashMap.put("delay", new c.a("delay", "TEXT", false, 0, null, 1));
            hashMap.put("crc", new c.a("crc", "TEXT", false, 0, null, 1));
            hashMap.put("fec", new c.a("fec", "TEXT", false, 0, null, 1));
            hashMap.put("upTime", new c.a("upTime", "TEXT", false, 0, null, 1));
            c cVar = new c("LineDetailsInfo", hashMap, new HashSet(0), new HashSet(0));
            c a10 = c.a(bVar, "LineDetailsInfo");
            if (!cVar.equals(a10)) {
                return new a0.b(false, "LineDetailsInfo(lineDetailsDb.LineDetailsInfo).\n Expected:\n" + cVar + "\n Found:\n" + a10);
            }
            return new a0.b(true, null);
        }
    }

    @Override // g1.z
    public final n d() {
        return new n(this, new HashMap(0), new HashMap(0), "LineDetailsInfo");
    }

    @Override // g1.z
    public final k1.c e(f fVar) {
        a0 a0Var = new a0(fVar, new a(), "69e641b31ffcd1a382ddda90da437860", "2933307a8b7cb4ea3e77831f7ed75401");
        Context context = fVar.f4803b;
        String str = fVar.f4804c;
        if (context != null) {
            return fVar.f4802a.a(new c.b(context, str, a0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // g1.z
    public final List f() {
        return Arrays.asList(new h1.b[0]);
    }

    @Override // g1.z
    public final Set<Class<? extends h1.a>> g() {
        return new HashSet();
    }

    @Override // g1.z
    public final Map<Class<?>, List<Class<?>>> h() {
        HashMap hashMap = new HashMap();
        hashMap.put(p9.a.class, Collections.emptyList());
        return hashMap;
    }

    @Override // lineDetailsDb.LineDetailsDb
    public final p9.a q() {
        b bVar;
        if (this.f5830m != null) {
            return this.f5830m;
        }
        synchronized (this) {
            if (this.f5830m == null) {
                this.f5830m = new b(this);
            }
            bVar = this.f5830m;
        }
        return bVar;
    }
}
