package j0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p<T> implements Runnable {

    /* renamed from: s */
    public Callable<T> f5424s;

    /* renamed from: t */
    public l0.a<T> f5425t;

    /* renamed from: u */
    public Handler f5426u;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ l0.a f5427s;

        /* renamed from: t */
        public final /* synthetic */ Object f5428t;

        public a(l0.a aVar, Object obj) {
            this.f5427s = aVar;
            this.f5428t = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f5427s.a(this.f5428t);
        }
    }

    public p(Handler handler, Callable<T> callable, l0.a<T> aVar) {
        this.f5424s = callable;
        this.f5425t = aVar;
        this.f5426u = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t10;
        try {
            t10 = this.f5424s.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f5426u.post(new a(this.f5425t, t10));
    }
}
