package c2;

import android.database.Cursor;
import g1.b0;
import g1.i;
import g1.z;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a */
    public final z f2618a;

    /* renamed from: b */
    public final i<d> f2619b;

    /* loaded from: classes.dex */
    public class a extends i<d> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(k1.f fVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.f2616a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            Long l10 = dVar2.f2617b;
            if (l10 == null) {
                fVar.v(2);
            } else {
                fVar.P(2, l10.longValue());
            }
        }
    }

    public f(z zVar) {
        this.f2618a = zVar;
        this.f2619b = new a(zVar);
    }

    public final Long a(String str) {
        b0 j3 = b0.j("SELECT long_value FROM Preference where `key`=?", 1);
        j3.o(1, str);
        this.f2618a.b();
        Long l10 = null;
        Cursor n10 = this.f2618a.n(j3);
        try {
            if (n10.moveToFirst() && !n10.isNull(0)) {
                l10 = Long.valueOf(n10.getLong(0));
            }
            return l10;
        } finally {
            n10.close();
            j3.G();
        }
    }

    public final void b(d dVar) {
        this.f2618a.b();
        this.f2618a.c();
        try {
            this.f2619b.f(dVar);
            this.f2618a.o();
        } finally {
            this.f2618a.k();
        }
    }
}
