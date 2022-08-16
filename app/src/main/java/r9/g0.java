package r9;

import java.io.Closeable;
import javax.annotation.Nullable;
import r9.u;
import u9.c;

/* loaded from: classes.dex */
public final class g0 implements Closeable {
    @Nullable
    public final g0 A;
    @Nullable
    public final g0 B;
    public final long C;
    public final long D;
    @Nullable
    public final c E;
    @Nullable
    public volatile e F;

    /* renamed from: s */
    public final c0 f17373s;

    /* renamed from: t */
    public final a0 f17374t;

    /* renamed from: u */
    public final int f17375u;

    /* renamed from: v */
    public final String f17376v;
    @Nullable

    /* renamed from: w */
    public final t f17377w;

    /* renamed from: x */
    public final u f17378x;
    @Nullable
    public final i0 y;
    @Nullable

    /* renamed from: z */
    public final g0 f17379z;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a */
        public c0 f17380a;
        @Nullable

        /* renamed from: b */
        public a0 f17381b;

        /* renamed from: c */
        public int f17382c;

        /* renamed from: d */
        public String f17383d;
        @Nullable

        /* renamed from: e */
        public t f17384e;

        /* renamed from: f */
        public u.a f17385f;
        @Nullable

        /* renamed from: g */
        public i0 f17386g;
        @Nullable

        /* renamed from: h */
        public g0 f17387h;
        @Nullable

        /* renamed from: i */
        public g0 f17388i;
        @Nullable

        /* renamed from: j */
        public g0 f17389j;

        /* renamed from: k */
        public long f17390k;

        /* renamed from: l */
        public long f17391l;
        @Nullable

        /* renamed from: m */
        public c f17392m;

        public a() {
            this.f17382c = -1;
            this.f17385f = new u.a();
        }

        public a(g0 g0Var) {
            this.f17382c = -1;
            this.f17380a = g0Var.f17373s;
            this.f17381b = g0Var.f17374t;
            this.f17382c = g0Var.f17375u;
            this.f17383d = g0Var.f17376v;
            this.f17384e = g0Var.f17377w;
            this.f17385f = g0Var.f17378x.e();
            this.f17386g = g0Var.y;
            this.f17387h = g0Var.f17379z;
            this.f17388i = g0Var.A;
            this.f17389j = g0Var.B;
            this.f17390k = g0Var.C;
            this.f17391l = g0Var.D;
            this.f17392m = g0Var.E;
        }

        public final g0 a() {
            if (this.f17380a != null) {
                if (this.f17381b == null) {
                    throw new IllegalStateException("protocol == null");
                }
                if (this.f17382c >= 0) {
                    if (this.f17383d == null) {
                        throw new IllegalStateException("message == null");
                    }
                    return new g0(this);
                }
                StringBuilder c10 = androidx.activity.result.a.c("code < 0: ");
                c10.append(this.f17382c);
                throw new IllegalStateException(c10.toString());
            }
            throw new IllegalStateException("request == null");
        }

        public final a b(@Nullable g0 g0Var) {
            if (g0Var != null) {
                c("cacheResponse", g0Var);
            }
            this.f17388i = g0Var;
            return this;
        }

        public final void c(String str, g0 g0Var) {
            if (g0Var.y == null) {
                if (g0Var.f17379z != null) {
                    throw new IllegalArgumentException(d7.a.c(str, ".networkResponse != null"));
                }
                if (g0Var.A != null) {
                    throw new IllegalArgumentException(d7.a.c(str, ".cacheResponse != null"));
                }
                if (g0Var.B != null) {
                    throw new IllegalArgumentException(d7.a.c(str, ".priorResponse != null"));
                }
                return;
            }
            throw new IllegalArgumentException(d7.a.c(str, ".body != null"));
        }

        public final a d(u uVar) {
            this.f17385f = uVar.e();
            return this;
        }
    }

    public g0(a aVar) {
        this.f17373s = aVar.f17380a;
        this.f17374t = aVar.f17381b;
        this.f17375u = aVar.f17382c;
        this.f17376v = aVar.f17383d;
        this.f17377w = aVar.f17384e;
        this.f17378x = new u(aVar.f17385f);
        this.y = aVar.f17386g;
        this.f17379z = aVar.f17387h;
        this.A = aVar.f17388i;
        this.B = aVar.f17389j;
        this.C = aVar.f17390k;
        this.D = aVar.f17391l;
        this.E = aVar.f17392m;
    }

    public final e b() {
        e eVar = this.F;
        if (eVar != null) {
            return eVar;
        }
        e a10 = e.a(this.f17378x);
        this.F = a10;
        return a10;
    }

    @Nullable
    public final String c(String str) {
        String c10 = this.f17378x.c(str);
        if (c10 != null) {
            return c10;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i0 i0Var = this.y;
        if (i0Var != null) {
            i0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final boolean j() {
        int i10 = this.f17375u;
        return i10 >= 200 && i10 < 300;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Response{protocol=");
        c10.append(this.f17374t);
        c10.append(", code=");
        c10.append(this.f17375u);
        c10.append(", message=");
        c10.append(this.f17376v);
        c10.append(", url=");
        c10.append(this.f17373s.f17311a);
        c10.append('}');
        return c10.toString();
    }
}
