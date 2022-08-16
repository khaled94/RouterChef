package m4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: e */
    public final q3 f9109e;

    /* renamed from: f */
    public final y3 f9110f;

    /* renamed from: h */
    public s3 f9112h;

    /* renamed from: k */
    public final w3 f9115k;

    /* renamed from: a */
    public final AtomicInteger f9105a = new AtomicInteger();

    /* renamed from: b */
    public final Set<e4<?>> f9106b = new HashSet();

    /* renamed from: c */
    public final PriorityBlockingQueue<e4<?>> f9107c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    public final PriorityBlockingQueue<e4<?>> f9108d = new PriorityBlockingQueue<>();

    /* renamed from: i */
    public final List<g4> f9113i = new ArrayList();

    /* renamed from: j */
    public final List<f4> f9114j = new ArrayList();

    /* renamed from: g */
    public final z3[] f9111g = new z3[4];

    public h4(q3 q3Var, y3 y3Var) {
        w3 w3Var = new w3(new Handler(Looper.getMainLooper()));
        this.f9109e = q3Var;
        this.f9110f = y3Var;
        this.f9115k = w3Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<m4.e4<?>>] */
    public final <T> e4<T> a(e4<T> e4Var) {
        e4Var.f7724z = this;
        synchronized (this.f9106b) {
            this.f9106b.add(e4Var);
        }
        e4Var.y = Integer.valueOf(this.f9105a.incrementAndGet());
        e4Var.f("add-to-queue");
        b();
        this.f9107c.add(e4Var);
        return e4Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.f4>, java.util.ArrayList] */
    public final void b() {
        synchronized (this.f9114j) {
            Iterator it = this.f9114j.iterator();
            while (it.hasNext()) {
                ((f4) it.next()).zza();
            }
        }
    }

    public final void c() {
        s3 s3Var = this.f9112h;
        if (s3Var != null) {
            s3Var.f13504v = true;
            s3Var.interrupt();
        }
        z3[] z3VarArr = this.f9111g;
        for (int i10 = 0; i10 < 4; i10++) {
            z3 z3Var = z3VarArr[i10];
            if (z3Var != null) {
                z3Var.f15992v = true;
                z3Var.interrupt();
            }
        }
        s3 s3Var2 = new s3(this.f9107c, this.f9108d, this.f9109e, this.f9115k);
        this.f9112h = s3Var2;
        s3Var2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            z3 z3Var2 = new z3(this.f9108d, this.f9110f, this.f9109e, this.f9115k);
            this.f9111g[i11] = z3Var2;
            z3Var2.start();
        }
    }
}
