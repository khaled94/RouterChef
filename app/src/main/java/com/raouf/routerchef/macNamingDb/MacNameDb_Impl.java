package com.raouf.routerchef.macNamingDb;

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
import k1.b;
import k1.c;
import l8.c;

/* loaded from: classes.dex */
public final class MacNameDb_Impl extends MacNameDb {

    /* renamed from: m */
    public volatile c f3655m;

    /* loaded from: classes.dex */
    public class a extends a0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(4);
            MacNameDb_Impl.this = r1;
        }

        @Override // g1.a0.a
        public final void a(b bVar) {
            l1.a aVar = (l1.a) bVar;
            aVar.n("CREATE TABLE IF NOT EXISTS `macname` (`mac` TEXT NOT NULL, `name` TEXT, PRIMARY KEY(`mac`))");
            aVar.n("CREATE UNIQUE INDEX IF NOT EXISTS `index_macname_mac` ON `macname` (`mac`)");
            aVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '28cbe0fc931447c8a8d0350329086ede')");
        }

        @Override // g1.a0.a
        public final void b(b bVar) {
            ((l1.a) bVar).n("DROP TABLE IF EXISTS `macname`");
            List<z.b> list = MacNameDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Objects.requireNonNull(MacNameDb_Impl.this.f4867f.get(i10));
                }
            }
        }

        @Override // g1.a0.a
        public final void c() {
            List<z.b> list = MacNameDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Objects.requireNonNull(MacNameDb_Impl.this.f4867f.get(i10));
                }
            }
        }

        @Override // g1.a0.a
        public final void d(b bVar) {
            MacNameDb_Impl.this.f4862a = bVar;
            MacNameDb_Impl.this.l(bVar);
            List<z.b> list = MacNameDb_Impl.this.f4867f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MacNameDb_Impl.this.f4867f.get(i10).a(bVar);
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
            hashMap.put("mac", new c.a("mac", "TEXT", true, 1, null, 1));
            hashMap.put("name", new c.a("name", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new c.d("index_macname_mac", true, Arrays.asList("mac"), Arrays.asList("ASC")));
            i1.c cVar = new i1.c("macname", hashMap, hashSet, hashSet2);
            i1.c a10 = i1.c.a(bVar, "macname");
            if (!cVar.equals(a10)) {
                return new a0.b(false, "macname(com.raouf.routerchef.macNamingDb.MacName).\n Expected:\n" + cVar + "\n Found:\n" + a10);
            }
            return new a0.b(true, null);
        }
    }

    @Override // g1.z
    public final n d() {
        return new n(this, new HashMap(0), new HashMap(0), "macname");
    }

    @Override // g1.z
    public final k1.c e(f fVar) {
        a0 a0Var = new a0(fVar, new a(), "28cbe0fc931447c8a8d0350329086ede", "6668489434859b722fecb32fd14296d4");
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
        hashMap.put(l8.b.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.raouf.routerchef.macNamingDb.MacNameDb
    public final l8.b q() {
        l8.c cVar;
        if (this.f3655m != null) {
            return this.f3655m;
        }
        synchronized (this) {
            if (this.f3655m == null) {
                this.f3655m = new l8.c(this);
            }
            cVar = this.f3655m;
        }
        return cVar;
    }
}
