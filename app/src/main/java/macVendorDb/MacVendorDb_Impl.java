package macVendorDb;

import android.content.Context;
import g1.a0;
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
import k1.b;
import k1.c;
import s3.f;

/* loaded from: classes.dex */
public final class MacVendorDb_Impl extends MacVendorDb {

    /* renamed from: m */
    public volatile f f16393m;

    /* loaded from: classes.dex */
    public class a extends a0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            MacVendorDb_Impl.this = r1;
        }

        @Override // g1.a0.a
        public final void a(b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("CREATE TABLE IF NOT EXISTS `macvendor` (`name` TEXT NOT NULL, `mac` TEXT NOT NULL, PRIMARY KEY(`name`, `mac`))");
            aVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5e5a95c7c1a98212abd9ef43050f8aef')");
        }

        @Override // g1.a0.a
        public final void b(b bVar) {
            ((l1.a) bVar).n("DROP TABLE IF EXISTS `macvendor`");
            List<z.b> list = MacVendorDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Objects.requireNonNull(MacVendorDb_Impl.this.f4867f.get(i10));
                }
            }
        }

        @Override // g1.a0.a
        public final void c() {
            List<z.b> list = MacVendorDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Objects.requireNonNull(MacVendorDb_Impl.this.f4867f.get(i10));
                }
            }
        }

        @Override // g1.a0.a
        public final void d(b bVar) {
            MacVendorDb_Impl.this.f4862a = bVar;
            MacVendorDb_Impl.this.l(bVar);
            List<z.b> list = MacVendorDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MacVendorDb_Impl.this.f4867f.get(i10).a(bVar);
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
            hashMap.put("name", new c.a("name", "TEXT", true, 1, null, 1));
            hashMap.put("mac", new c.a("mac", "TEXT", true, 2, null, 1));
            c cVar = new c("macvendor", hashMap, new HashSet(0), new HashSet(0));
            c a10 = c.a(bVar, "macvendor");
            if (!cVar.equals(a10)) {
                return new a0.b(false, "macvendor(macVendorDb.MacVendor).\n Expected:\n" + cVar + "\n Found:\n" + a10);
            }
            return new a0.b(true, null);
        }
    }

    @Override // g1.z
    public final n d() {
        return new n(this, new HashMap(0), new HashMap(0), "macvendor");
    }

    @Override // g1.z
    public final k1.c e(g1.f fVar) {
        a0 a0Var = new a0(fVar, new a(), "5e5a95c7c1a98212abd9ef43050f8aef", "991808a8e1d4f6c746db0cf15c9cfacf");
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
        hashMap.put(q9.a.class, Collections.emptyList());
        return hashMap;
    }

    @Override // macVendorDb.MacVendorDb
    public final q9.a q() {
        f fVar;
        if (this.f16393m != null) {
            return this.f16393m;
        }
        synchronized (this) {
            if (this.f16393m == null) {
                this.f16393m = new f(this, 6);
            }
            fVar = this.f16393m;
        }
        return fVar;
    }
}
