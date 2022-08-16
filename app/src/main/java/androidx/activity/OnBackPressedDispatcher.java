package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f402a;

    /* renamed from: b */
    public final ArrayDeque<i> f403b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements j, androidx.activity.a {

        /* renamed from: a */
        public final g f404a;

        /* renamed from: b */
        public final i f405b;

        /* renamed from: c */
        public a f406c;

        public LifecycleOnBackPressedCancellable(g gVar, i iVar) {
            OnBackPressedDispatcher.this = r1;
            this.f404a = gVar;
            this.f405b = iVar;
            gVar.a(this);
        }

        @Override // androidx.lifecycle.j
        public final void a(l lVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                i iVar = this.f405b;
                onBackPressedDispatcher.f403b.add(iVar);
                a aVar = new a(iVar);
                iVar.f425b.add(aVar);
                this.f406c = aVar;
            } else if (bVar != g.b.ON_STOP) {
                if (bVar != g.b.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                a aVar2 = this.f406c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.cancel();
            }
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f404a.c(this);
            this.f405b.f425b.remove(this);
            a aVar = this.f406c;
            if (aVar != null) {
                aVar.cancel();
                this.f406c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a */
        public final i f408a;

        public a(i iVar) {
            OnBackPressedDispatcher.this = r1;
            this.f408a = iVar;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher.this.f403b.remove(this.f408a);
            this.f408a.f425b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f402a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public final void a(l lVar, i iVar) {
        g a10 = lVar.a();
        if (a10.b() == g.c.DESTROYED) {
            return;
        }
        iVar.f425b.add(new LifecycleOnBackPressedCancellable(a10, iVar));
    }

    public final void b() {
        Iterator<i> descendingIterator = this.f403b.descendingIterator();
        while (descendingIterator.hasNext()) {
            i next = descendingIterator.next();
            if (next.f424a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f402a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
