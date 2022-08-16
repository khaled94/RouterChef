package androidx.lifecycle;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.fragment.app.n;
import androidx.lifecycle.g;
import e0.d;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f1631k = new Object();

    /* renamed from: d */
    public boolean f1635d;

    /* renamed from: e */
    public volatile Object f1636e;

    /* renamed from: f */
    public volatile Object f1637f;

    /* renamed from: h */
    public boolean f1639h;

    /* renamed from: i */
    public boolean f1640i;

    /* renamed from: a */
    public final Object f1632a = new Object();

    /* renamed from: b */
    public m.b<s<? super T>, LiveData<T>.c> f1633b = new m.b<>();

    /* renamed from: c */
    public int f1634c = 0;

    /* renamed from: j */
    public final a f1641j = new a();

    /* renamed from: g */
    public int f1638g = -1;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements j {

        /* renamed from: e */
        public final l f1642e;

        /* renamed from: f */
        public final /* synthetic */ LiveData f1643f;

        @Override // androidx.lifecycle.j
        public final void a(l lVar, g.b bVar) {
            g.c b10 = this.f1642e.a().b();
            if (b10 == g.c.DESTROYED) {
                this.f1643f.g(this.f1645a);
                return;
            }
            g.c cVar = null;
            while (cVar != b10) {
                e(this.f1642e.a().b().b(g.c.STARTED));
                cVar = b10;
                b10 = this.f1642e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void f() {
            this.f1642e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g() {
            return this.f1642e.a().b().b(g.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            LiveData.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f1632a) {
                obj = LiveData.this.f1637f;
                LiveData.this.f1637f = LiveData.f1631k;
            }
            LiveData.this.h(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, s<? super T> sVar) {
            super(sVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a */
        public final s<? super T> f1645a;

        /* renamed from: b */
        public boolean f1646b;

        /* renamed from: c */
        public int f1647c = -1;

        public c(s<? super T> sVar) {
            LiveData.this = r1;
            this.f1645a = sVar;
        }

        public final void e(boolean z10) {
            if (z10 == this.f1646b) {
                return;
            }
            this.f1646b = z10;
            LiveData liveData = LiveData.this;
            int i10 = z10 ? 1 : -1;
            int i11 = liveData.f1634c;
            liveData.f1634c = i10 + i11;
            if (!liveData.f1635d) {
                liveData.f1635d = true;
                while (true) {
                    try {
                        int i12 = liveData.f1634c;
                        if (i11 == i12) {
                            break;
                        }
                        boolean z11 = i11 == 0 && i12 > 0;
                        boolean z12 = i11 > 0 && i12 == 0;
                        if (z11) {
                            liveData.e();
                        } else if (z12) {
                            liveData.f();
                        }
                        i11 = i12;
                    } finally {
                        liveData.f1635d = false;
                    }
                }
            }
            if (!this.f1646b) {
                return;
            }
            LiveData.this.c(this);
        }

        public void f() {
        }

        public abstract boolean g();
    }

    public LiveData() {
        Object obj = f1631k;
        this.f1637f = obj;
        this.f1636e = obj;
    }

    public static void a(String str) {
        if (l.a.h().i()) {
            return;
        }
        throw new IllegalStateException(d.a("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.c cVar) {
        if (!cVar.f1646b) {
            return;
        }
        if (!cVar.g()) {
            cVar.e(false);
            return;
        }
        int i10 = cVar.f1647c;
        int i11 = this.f1638g;
        if (i10 >= i11) {
            return;
        }
        cVar.f1647c = i11;
        s<? super T> sVar = cVar.f1645a;
        Object obj = this.f1636e;
        n.d dVar = (n.d) sVar;
        Objects.requireNonNull(dVar);
        if (((l) obj) == null) {
            return;
        }
        n nVar = n.this;
        if (!nVar.f1488t0) {
            return;
        }
        View X = nVar.X();
        if (X.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (n.this.x0 == null) {
            return;
        }
        if (g0.K(3)) {
            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + n.this.x0);
        }
        n.this.x0.setContentView(X);
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f1639h) {
            this.f1640i = true;
            return;
        }
        this.f1639h = true;
        do {
            this.f1640i = false;
            if (cVar == null) {
                m.b<s<? super T>, LiveData<T>.c>.d e10 = this.f1633b.e();
                while (e10.hasNext()) {
                    b((c) ((Map.Entry) e10.next()).getValue());
                    if (this.f1640i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f1640i);
        this.f1639h = false;
    }

    public final void d(s<? super T> sVar) {
        a("observeForever");
        b bVar = new b(this, sVar);
        LiveData<T>.c h10 = this.f1633b.h(sVar, bVar);
        if (!(h10 instanceof LifecycleBoundObserver)) {
            if (h10 != null) {
                return;
            }
            bVar.e(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void e() {
    }

    public void f() {
    }

    public void g(s<? super T> sVar) {
        a("removeObserver");
        LiveData<T>.c i10 = this.f1633b.i(sVar);
        if (i10 == null) {
            return;
        }
        i10.f();
        i10.e(false);
    }

    public abstract void h(T t10);
}
