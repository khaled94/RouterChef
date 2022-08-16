package a2;

import android.content.Context;
import f2.b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import t1.h;

/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f */
    public static final String f16f = h.e("ConstraintTracker");

    /* renamed from: a */
    public final f2.a f17a;

    /* renamed from: b */
    public final Context f18b;

    /* renamed from: c */
    public final Object f19c = new Object();

    /* renamed from: d */
    public final Set<y1.a<T>> f20d = new LinkedHashSet();

    /* renamed from: e */
    public T f21e;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ List f22s;

        public a(List list) {
            d.this = r1;
            this.f22s = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (y1.a aVar : this.f22s) {
                aVar.a(d.this.f21e);
            }
        }
    }

    public d(Context context, f2.a aVar) {
        this.f18b = context.getApplicationContext();
        this.f17a = aVar;
    }

    public abstract T a();

    public final void b(y1.a<T> aVar) {
        synchronized (this.f19c) {
            if (this.f20d.remove(aVar) && this.f20d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(T t10) {
        synchronized (this.f19c) {
            T t11 = this.f21e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f21e = t10;
                ((b) this.f17a).f4479c.execute(new a(new ArrayList(this.f20d)));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
