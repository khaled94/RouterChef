package m4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ec1<T> {

    /* renamed from: a */
    public final g11 f7780a;

    /* renamed from: b */
    public final xo1 f7781b;

    /* renamed from: c */
    public final sa1<T> f7782c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<nb1<T>> f7783d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f7784e = new ArrayDeque<>();

    /* renamed from: f */
    public final ArrayDeque<Runnable> f7785f = new ArrayDeque<>();

    /* renamed from: g */
    public boolean f7786g;

    public ec1(CopyOnWriteArraySet<nb1<T>> copyOnWriteArraySet, Looper looper, g11 g11Var, sa1<T> sa1Var) {
        this.f7780a = g11Var;
        this.f7783d = copyOnWriteArraySet;
        this.f7782c = sa1Var;
        this.f7781b = (xo1) ((bn1) g11Var).a(looper, new Handler.Callback() { // from class: m4.c81
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ec1 ec1Var = ec1.this;
                Iterator it = ec1Var.f7783d.iterator();
                while (it.hasNext()) {
                    nb1 nb1Var = (nb1) it.next();
                    sa1<T> sa1Var2 = ec1Var.f7782c;
                    if (!nb1Var.f11624d && nb1Var.f11623c) {
                        io2 b10 = nb1Var.f11622b.b();
                        nb1Var.f11622b = new zm2();
                        nb1Var.f11623c = false;
                        sa1Var2.b(nb1Var.f11621a, b10);
                    }
                    if (ec1Var.f7781b.f15435a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
    }

    public final void a(T t10) {
        if (!this.f7786g) {
            Objects.requireNonNull(t10);
            this.f7783d.add(new nb1<>(t10));
        }
    }

    public final void b() {
        if (this.f7785f.isEmpty()) {
            return;
        }
        if (!this.f7781b.f15435a.hasMessages(0)) {
            xo1 xo1Var = this.f7781b;
            s61 a10 = xo1Var.a(0);
            Handler handler = xo1Var.f15435a;
            ho1 ho1Var = (ho1) a10;
            Message message = ho1Var.f9396a;
            Objects.requireNonNull(message);
            handler.sendMessageAtFrontOfQueue(message);
            ho1Var.b();
        }
        boolean isEmpty = this.f7784e.isEmpty();
        this.f7784e.addAll(this.f7785f);
        this.f7785f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.f7784e.isEmpty()) {
            this.f7784e.peekFirst().run();
            this.f7784e.removeFirst();
        }
    }

    public final void c(final int i10, final v91<T> v91Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f7783d);
        this.f7785f.add(new Runnable() { // from class: m4.x81
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i11 = i10;
                v91 v91Var2 = v91Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    nb1 nb1Var = (nb1) it.next();
                    if (!nb1Var.f11624d) {
                        if (i11 != -1) {
                            nb1Var.f11622b.a(i11);
                        }
                        nb1Var.f11623c = true;
                        v91Var2.h(nb1Var.f11621a);
                    }
                }
            }
        });
    }

    public final void d() {
        Iterator<nb1<T>> it = this.f7783d.iterator();
        while (it.hasNext()) {
            nb1<T> next = it.next();
            sa1<T> sa1Var = this.f7782c;
            next.f11624d = true;
            if (next.f11623c) {
                sa1Var.b(next.f11621a, next.f11622b.b());
            }
        }
        this.f7783d.clear();
        this.f7786g = true;
    }
}
