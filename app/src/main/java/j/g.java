package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import m0.f0;
import m0.g0;
import m0.h0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c */
    public Interpolator f5370c;

    /* renamed from: d */
    public g0 f5371d;

    /* renamed from: e */
    public boolean f5372e;

    /* renamed from: b */
    public long f5369b = -1;

    /* renamed from: f */
    public final a f5373f = new a();

    /* renamed from: a */
    public final ArrayList<f0> f5368a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends h0 {

        /* renamed from: t */
        public boolean f5374t = false;

        /* renamed from: u */
        public int f5375u = 0;

        public a() {
            g.this = r1;
        }

        @Override // m0.g0
        public final void a() {
            int i10 = this.f5375u + 1;
            this.f5375u = i10;
            if (i10 == g.this.f5368a.size()) {
                g0 g0Var = g.this.f5371d;
                if (g0Var != null) {
                    g0Var.a();
                }
                this.f5375u = 0;
                this.f5374t = false;
                g.this.f5372e = false;
            }
        }

        @Override // m0.h0, m0.g0
        public final void d() {
            if (this.f5374t) {
                return;
            }
            this.f5374t = true;
            g0 g0Var = g.this.f5371d;
            if (g0Var == null) {
                return;
            }
            g0Var.d();
        }
    }

    public final void a() {
        if (!this.f5372e) {
            return;
        }
        Iterator<f0> it = this.f5368a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f5372e = false;
    }

    public final g b(f0 f0Var) {
        if (!this.f5372e) {
            this.f5368a.add(f0Var);
        }
        return this;
    }

    public final void c() {
        View view;
        if (this.f5372e) {
            return;
        }
        Iterator<f0> it = this.f5368a.iterator();
        while (it.hasNext()) {
            f0 next = it.next();
            long j3 = this.f5369b;
            if (j3 >= 0) {
                next.c(j3);
            }
            Interpolator interpolator = this.f5370c;
            if (interpolator != null && (view = next.f5873a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5371d != null) {
                next.d(this.f5373f);
            }
            View view2 = next.f5873a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5372e = true;
    }
}
