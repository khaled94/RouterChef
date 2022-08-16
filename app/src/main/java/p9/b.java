package p9;

import android.database.Cursor;
import g1.b0;
import g1.i;
import g1.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.f;

/* loaded from: classes.dex */
public final class b implements p9.a {

    /* renamed from: a */
    public final z f16998a;

    /* renamed from: b */
    public final i<d> f16999b;

    /* loaded from: classes.dex */
    public class a extends i<d> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR ABORT INTO `LineDetailsInfo` (`id`,`routerModel`,`time`,`modType`,`lineRate`,`maxRate`,`noise`,`chanType`,`depth`,`delay`,`crc`,`fec`,`upTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, d dVar) {
            d dVar2 = dVar;
            fVar.P(1, dVar2.f17001a);
            String str = dVar2.f17002b;
            if (str == null) {
                fVar.v(2);
            } else {
                fVar.o(2, str);
            }
            fVar.P(3, dVar2.f17003c);
            String str2 = dVar2.f17004d;
            if (str2 == null) {
                fVar.v(4);
            } else {
                fVar.o(4, str2);
            }
            String str3 = dVar2.f17005e;
            if (str3 == null) {
                fVar.v(5);
            } else {
                fVar.o(5, str3);
            }
            String str4 = dVar2.f17006f;
            if (str4 == null) {
                fVar.v(6);
            } else {
                fVar.o(6, str4);
            }
            String str5 = dVar2.f17007g;
            if (str5 == null) {
                fVar.v(7);
            } else {
                fVar.o(7, str5);
            }
            String str6 = dVar2.f17008h;
            if (str6 == null) {
                fVar.v(8);
            } else {
                fVar.o(8, str6);
            }
            String str7 = dVar2.f17009i;
            if (str7 == null) {
                fVar.v(9);
            } else {
                fVar.o(9, str7);
            }
            String str8 = dVar2.f17010j;
            if (str8 == null) {
                fVar.v(10);
            } else {
                fVar.o(10, str8);
            }
            String str9 = dVar2.f17011k;
            if (str9 == null) {
                fVar.v(11);
            } else {
                fVar.o(11, str9);
            }
            String str10 = dVar2.f17012l;
            if (str10 == null) {
                fVar.v(12);
            } else {
                fVar.o(12, str10);
            }
            String str11 = dVar2.f17013m;
            if (str11 == null) {
                fVar.v(13);
            } else {
                fVar.o(13, str11);
            }
        }
    }

    public b(z zVar) {
        this.f16998a = zVar;
        this.f16999b = new a(zVar);
        new AtomicBoolean(false);
    }

    @Override // p9.a
    public final List<d> a(String str) {
        b0 b0Var;
        Throwable th;
        b0 j3 = b0.j("SELECT * FROM LineDetailsInfo WHERE routerModel = ?  ORDER BY time DESC", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f16998a.b();
        Cursor n10 = this.f16998a.n(j3);
        try {
            int a10 = i1.a.a(n10, "id");
            int a11 = i1.a.a(n10, "routerModel");
            int a12 = i1.a.a(n10, "time");
            int a13 = i1.a.a(n10, "modType");
            int a14 = i1.a.a(n10, "lineRate");
            int a15 = i1.a.a(n10, "maxRate");
            int a16 = i1.a.a(n10, "noise");
            int a17 = i1.a.a(n10, "chanType");
            int a18 = i1.a.a(n10, "depth");
            int a19 = i1.a.a(n10, "delay");
            int a20 = i1.a.a(n10, "crc");
            int a21 = i1.a.a(n10, "fec");
            int a22 = i1.a.a(n10, "upTime");
            b0Var = j3;
            try {
                ArrayList arrayList = new ArrayList(n10.getCount());
                while (n10.moveToNext()) {
                    d dVar = new d();
                    ArrayList arrayList2 = arrayList;
                    dVar.f17001a = n10.getInt(a10);
                    int i10 = a10;
                    if (n10.isNull(a11)) {
                        dVar.f17002b = null;
                    } else {
                        dVar.f17002b = n10.getString(a11);
                    }
                    dVar.f17003c = n10.getLong(a12);
                    if (n10.isNull(a13)) {
                        dVar.f17004d = null;
                    } else {
                        dVar.f17004d = n10.getString(a13);
                    }
                    if (n10.isNull(a14)) {
                        dVar.f17005e = null;
                    } else {
                        dVar.f17005e = n10.getString(a14);
                    }
                    if (n10.isNull(a15)) {
                        dVar.f17006f = null;
                    } else {
                        dVar.f17006f = n10.getString(a15);
                    }
                    if (n10.isNull(a16)) {
                        dVar.f17007g = null;
                    } else {
                        dVar.f17007g = n10.getString(a16);
                    }
                    if (n10.isNull(a17)) {
                        dVar.f17008h = null;
                    } else {
                        dVar.f17008h = n10.getString(a17);
                    }
                    if (n10.isNull(a18)) {
                        dVar.f17009i = null;
                    } else {
                        dVar.f17009i = n10.getString(a18);
                    }
                    if (n10.isNull(a19)) {
                        dVar.f17010j = null;
                    } else {
                        dVar.f17010j = n10.getString(a19);
                    }
                    if (n10.isNull(a20)) {
                        dVar.f17011k = null;
                    } else {
                        dVar.f17011k = n10.getString(a20);
                    }
                    if (n10.isNull(a21)) {
                        dVar.f17012l = null;
                    } else {
                        dVar.f17012l = n10.getString(a21);
                    }
                    if (n10.isNull(a22)) {
                        dVar.f17013m = null;
                    } else {
                        dVar.f17013m = n10.getString(a22);
                    }
                    arrayList2.add(dVar);
                    arrayList = arrayList2;
                    a10 = i10;
                }
                ArrayList arrayList3 = arrayList;
                n10.close();
                b0Var.G();
                return arrayList3;
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

    @Override // p9.a
    public final void b(d dVar) {
        this.f16998a.b();
        this.f16998a.c();
        try {
            this.f16999b.f(dVar);
            this.f16998a.o();
        } finally {
            this.f16998a.k();
        }
    }
}
