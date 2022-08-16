package m4;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class hh1<T> {

    /* renamed from: a */
    public final Set<eh1<? extends dh1<T>>> f9337a;

    /* renamed from: b */
    public final Executor f9338b;

    public hh1(Executor executor, Set<eh1<? extends dh1<T>>> set) {
        this.f9338b = executor;
        this.f9337a = set;
    }

    public final tz1<T> a(final T t10) {
        final ArrayList arrayList = new ArrayList(this.f9337a.size());
        for (final eh1<? extends dh1<T>> eh1Var : this.f9337a) {
            tz1<? extends dh1<T>> a10 = eh1Var.a();
            if (ot.f12288a.e().booleanValue()) {
                Objects.requireNonNull(s.B.f5796j);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                a10.b(new Runnable() { // from class: m4.fh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        eh1 eh1Var2 = eh1.this;
                        long j3 = elapsedRealtime;
                        String canonicalName = eh1Var2.getClass().getCanonicalName();
                        Objects.requireNonNull(s.B.f5796j);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(elapsedRealtime2 - j3);
                        g1.a(sb.toString());
                    }
                }, u90.f14299f);
            }
            arrayList.add(a10);
        }
        return mz1.e(arrayList).a(new Callable() { // from class: m4.gh1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<tz1> list = arrayList;
                Object obj = t10;
                for (tz1 tz1Var : list) {
                    dh1 dh1Var = (dh1) tz1Var.get();
                    if (dh1Var != null) {
                        dh1Var.h(obj);
                    }
                }
                return obj;
            }
        }, this.f9338b);
    }
}
