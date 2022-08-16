package t1;

import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i */
    public static final b f18451i = new b(new a());

    /* renamed from: a */
    public i f18452a;

    /* renamed from: b */
    public boolean f18453b;

    /* renamed from: c */
    public boolean f18454c;

    /* renamed from: d */
    public boolean f18455d;

    /* renamed from: e */
    public boolean f18456e;

    /* renamed from: f */
    public long f18457f;

    /* renamed from: g */
    public long f18458g;

    /* renamed from: h */
    public c f18459h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public i f18460a = i.NOT_REQUIRED;

        /* renamed from: b */
        public c f18461b = new c();
    }

    public b() {
        this.f18452a = i.NOT_REQUIRED;
        this.f18457f = -1L;
        this.f18458g = -1L;
        this.f18459h = new c();
    }

    public b(a aVar) {
        this.f18452a = i.NOT_REQUIRED;
        this.f18457f = -1L;
        this.f18458g = -1L;
        this.f18459h = new c();
        this.f18453b = false;
        int i10 = Build.VERSION.SDK_INT;
        this.f18454c = false;
        this.f18452a = aVar.f18460a;
        this.f18455d = false;
        this.f18456e = false;
        if (i10 >= 24) {
            this.f18459h = aVar.f18461b;
            this.f18457f = -1L;
            this.f18458g = -1L;
        }
    }

    public b(b bVar) {
        this.f18452a = i.NOT_REQUIRED;
        this.f18457f = -1L;
        this.f18458g = -1L;
        this.f18459h = new c();
        this.f18453b = bVar.f18453b;
        this.f18454c = bVar.f18454c;
        this.f18452a = bVar.f18452a;
        this.f18455d = bVar.f18455d;
        this.f18456e = bVar.f18456e;
        this.f18459h = bVar.f18459h;
    }

    public final boolean a() {
        return this.f18459h.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f18453b != bVar.f18453b || this.f18454c != bVar.f18454c || this.f18455d != bVar.f18455d || this.f18456e != bVar.f18456e || this.f18457f != bVar.f18457f || this.f18458g != bVar.f18458g || this.f18452a != bVar.f18452a) {
            return false;
        }
        return this.f18459h.equals(bVar.f18459h);
    }

    public final int hashCode() {
        long j3 = this.f18457f;
        long j10 = this.f18458g;
        return this.f18459h.hashCode() + (((((((((((((this.f18452a.hashCode() * 31) + (this.f18453b ? 1 : 0)) * 31) + (this.f18454c ? 1 : 0)) * 31) + (this.f18455d ? 1 : 0)) * 31) + (this.f18456e ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
