package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.a;
import androidx.fragment.app.e;
import androidx.fragment.app.z0;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1391a;

    /* renamed from: b */
    public final /* synthetic */ View f1392b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1393c;

    /* renamed from: d */
    public final /* synthetic */ z0.b f1394d;

    /* renamed from: e */
    public final /* synthetic */ e.b f1395e;

    public f(ViewGroup viewGroup, View view, boolean z10, z0.b bVar, e.b bVar2) {
        this.f1391a = viewGroup;
        this.f1392b = view;
        this.f1393c = z10;
        this.f1394d = bVar;
        this.f1395e = bVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1391a.endViewTransition(this.f1392b);
        if (this.f1393c) {
            c1.a(this.f1394d.f1618a, this.f1392b);
        }
        this.f1395e.a();
        if (g0.K(2)) {
            StringBuilder c10 = a.c("Animator from operation ");
            c10.append(this.f1394d);
            c10.append(" has ended.");
            Log.v("FragmentManager", c10.toString());
        }
    }
}
