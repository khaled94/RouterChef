package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e;
import androidx.fragment.app.z0;

/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ z0.b f1436a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f1437b;

    /* renamed from: c */
    public final /* synthetic */ View f1438c;

    /* renamed from: d */
    public final /* synthetic */ e.b f1439d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            hVar.f1437b.endViewTransition(hVar.f1438c);
            h.this.f1439d.a();
        }
    }

    public h(z0.b bVar, ViewGroup viewGroup, View view, e.b bVar2) {
        this.f1436a = bVar;
        this.f1437b = viewGroup;
        this.f1438c = view;
        this.f1439d = bVar2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1437b.post(new a());
        if (g0.K(2)) {
            StringBuilder c10 = androidx.activity.result.a.c("Animation from operation ");
            c10.append(this.f1436a);
            c10.append(" has ended.");
            Log.v("FragmentManager", c10.toString());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (g0.K(2)) {
            StringBuilder c10 = androidx.activity.result.a.c("Animation from operation ");
            c10.append(this.f1436a);
            c10.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", c10.toString());
        }
    }
}
