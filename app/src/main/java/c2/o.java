package c2;

import g1.e0;
import g1.i;
import g1.z;
import k1.f;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a */
    public final z f2631a;

    /* renamed from: b */
    public final i<m> f2632b;

    /* renamed from: c */
    public final b f2633c;

    /* renamed from: d */
    public final c f2634d;

    /* loaded from: classes.dex */
    public class a extends i<m> {
        public a(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // g1.i
        public final void e(f fVar, m mVar) {
            m mVar2 = mVar;
            String str = mVar2.f2629a;
            if (str == null) {
                fVar.v(1);
            } else {
                fVar.o(1, str);
            }
            byte[] c10 = androidx.work.b.c(mVar2.f2630b);
            if (c10 == null) {
                fVar.v(2);
            } else {
                fVar.a0(2, c10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends e0 {
        public b(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends e0 {
        public c(z zVar) {
            super(zVar);
        }

        @Override // g1.e0
        public final String c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(z zVar) {
        this.f2631a = zVar;
        this.f2632b = new a(zVar);
        this.f2633c = new b(zVar);
        this.f2634d = new c(zVar);
    }

    public final void a(String str) {
        this.f2631a.b();
        f a10 = this.f2633c.a();
        if (str == null) {
            a10.v(1);
        } else {
            a10.o(1, str);
        }
        this.f2631a.c();
        try {
            a10.s();
            this.f2631a.o();
        } finally {
            this.f2631a.k();
            this.f2633c.d(a10);
        }
    }

    public final void b() {
        this.f2631a.b();
        f a10 = this.f2634d.a();
        this.f2631a.c();
        try {
            a10.s();
            this.f2631a.o();
        } finally {
            this.f2631a.k();
            this.f2634d.d(a10);
        }
    }
}
