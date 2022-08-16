package c2;

import android.database.Cursor;
import g1.b0;
import g1.e0;
import g1.z;
import k1.f;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a */
    public final z f2622a;

    /* renamed from: b */
    public final g1.i<g> f2623b;

    /* renamed from: c */
    public final b f2624c;

    /* loaded from: classes.dex */
    public class a extends g1.i<g> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, g gVar) {
            g gVar2 = gVar;
            String str = gVar2.f2620a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            fVar.P(2, gVar2.f2621b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends e0 {
        public b(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(z zVar) {
        this.f2622a = zVar;
        this.f2623b = new a(zVar);
        this.f2624c = new b(zVar);
    }

    public final g a(String str) {
        b0 j3 = b0.j("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f2622a.b();
        g gVar = null;
        Cursor n10 = this.f2622a.n(j3);
        try {
            int a10 = i1.a.a(n10, "work_spec_id");
            int a11 = i1.a.a(n10, "system_id");
            if (n10.moveToFirst()) {
                gVar = new g(n10.getString(a10), n10.getInt(a11));
            }
            return gVar;
        } finally {
            n10.close();
            j3.G();
        }
    }

    public final void b(g gVar) {
        this.f2622a.b();
        this.f2622a.c();
        try {
            this.f2623b.f(gVar);
            this.f2622a.o();
        } finally {
            this.f2622a.k();
        }
    }

    public final void c(String str) {
        this.f2622a.b();
        f a10 = this.f2624c.a();
        if (str == null) {
            a10.v(1);
        } else {
            a10.o(1, str);
        }
        this.f2622a.c();
        try {
            a10.s();
            this.f2622a.o();
        } finally {
            this.f2622a.k();
            this.f2624c.d(a10);
        }
    }
}
