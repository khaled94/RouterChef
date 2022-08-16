package m4;

import android.os.Binder;
import d4.b;
import java.io.InputStream;
import n3.g1;

/* loaded from: classes.dex */
public abstract class g41 implements b.a, b.AbstractC0056b {

    /* renamed from: a */
    public final w90<InputStream> f8745a = new w90<>();

    /* renamed from: b */
    public final Object f8746b = new Object();

    /* renamed from: c */
    public boolean f8747c = false;

    /* renamed from: d */
    public boolean f8748d = false;

    /* renamed from: e */
    public o50 f8749e;

    /* renamed from: f */
    public a50 f8750f;

    public final void a() {
        synchronized (this.f8746b) {
            this.f8748d = true;
            if (this.f8750f.a() || this.f8750f.g()) {
                this.f8750f.p();
            }
            Binder.flushPendingCommands();
        }
    }

    public void c0(a4.b bVar) {
        g1.e("Disconnected from remote ad request service.");
        this.f8745a.c(new t41(1));
    }

    @Override // d4.b.a
    public final void w(int i10) {
        g1.e("Cannot connect to remote service, fallback to local instance.");
    }
}
