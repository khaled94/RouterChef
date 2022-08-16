package l8;

import android.database.Cursor;
import g1.b0;
import g1.h;
import g1.i;
import g1.z;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.f;

/* loaded from: classes.dex */
public final class c implements l8.b {

    /* renamed from: a */
    public final z f5822a;

    /* renamed from: b */
    public final i<l8.a> f5823b;

    /* renamed from: c */
    public final h<l8.a> f5824c;

    /* loaded from: classes.dex */
    public class a extends i<l8.a> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR REPLACE INTO `macname` (`mac`,`name`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, l8.a aVar) {
            l8.a aVar2 = aVar;
            String str = aVar2.f5820a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            String str2 = aVar2.f5821b;
            if (str2 == null) {
                fVar.v(2);
            } else {
                fVar.o(2, str2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends h<l8.a> {
        public b(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "DELETE FROM `macname` WHERE `mac` = ?";
        }
    }

    public c(z zVar) {
        this.f5822a = zVar;
        this.f5823b = new a(zVar);
        this.f5824c = new b(zVar);
        new AtomicBoolean(false);
    }

    @Override // l8.b
    public final void a(l8.a aVar) {
        this.f5822a.b();
        this.f5822a.c();
        try {
            this.f5823b.f(aVar);
            this.f5822a.o();
        } finally {
            this.f5822a.k();
        }
    }

    @Override // l8.b
    public final l8.a b(String str) {
        b0 j3 = b0.j("SELECT * FROM macname WHERE mac = ?", 1);
        if (str == null) {
            j3.v(1);
        } else {
            j3.o(1, str);
        }
        this.f5822a.b();
        l8.a aVar = null;
        String string = null;
        Cursor n10 = this.f5822a.n(j3);
        try {
            int a10 = i1.a.a(n10, "mac");
            int a11 = i1.a.a(n10, "name");
            if (n10.moveToFirst()) {
                l8.a aVar2 = new l8.a();
                if (n10.isNull(a10)) {
                    aVar2.f5820a = null;
                } else {
                    aVar2.f5820a = n10.getString(a10);
                }
                if (!n10.isNull(a11)) {
                    string = n10.getString(a11);
                }
                aVar2.f5821b = string;
                aVar = aVar2;
            }
            return aVar;
        } finally {
            n10.close();
            j3.G();
        }
    }

    @Override // l8.b
    public final void c(l8.a aVar) {
        this.f5822a.b();
        this.f5822a.c();
        try {
            h<l8.a> hVar = this.f5824c;
            f a10 = hVar.a();
            String str = aVar.f5820a;
            if (str == null) {
                a10.v(1);
            } else {
                a10.o(1, str);
            }
            a10.s();
            hVar.d(a10);
            this.f5822a.o();
        } finally {
            this.f5822a.k();
        }
    }
}
