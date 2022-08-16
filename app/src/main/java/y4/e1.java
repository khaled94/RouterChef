package y4;

import c4.a;

/* loaded from: classes.dex */
public final class e1<V> {

    /* renamed from: g */
    public static final Object f20372g = new Object();

    /* renamed from: a */
    public final String f20373a;

    /* renamed from: b */
    public final d1<V> f20374b;

    /* renamed from: c */
    public final V f20375c;

    /* renamed from: d */
    public final V f20376d;

    /* renamed from: e */
    public final Object f20377e = new Object();

    /* renamed from: f */
    public volatile V f20378f = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e1(String str, Object obj, Object obj2, d1 d1Var) {
        this.f20373a = str;
        this.f20375c = obj;
        this.f20376d = obj2;
        this.f20374b = d1Var;
    }

    public final V a(V v10) {
        synchronized (this.f20377e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (a.f2667s == null) {
            return this.f20375c;
        }
        synchronized (f20372g) {
            if (m3.a.b()) {
                return this.f20378f == null ? this.f20375c : this.f20378f;
            }
            try {
                for (e1<?> e1Var : f1.f20397a) {
                    if (m3.a.b()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v11 = null;
                    try {
                        d1<?> d1Var = e1Var.f20374b;
                        if (d1Var != null) {
                            v11 = (V) d1Var.mo14zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f20372g) {
                        e1Var.f20378f = v11;
                    }
                }
            } catch (SecurityException unused2) {
            }
            d1<V> d1Var2 = this.f20374b;
            if (d1Var2 == null) {
                return this.f20375c;
            }
            try {
                return d1Var2.mo14zza();
            } catch (IllegalStateException unused3) {
                return this.f20375c;
            } catch (SecurityException unused4) {
                return this.f20375c;
            }
        }
    }
}
