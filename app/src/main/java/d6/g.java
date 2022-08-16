package d6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ b f3948a;

    public g(b bVar) {
        this.f3948a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b bVar = this.f3948a;
        bVar.f3953c.setChecked(bVar.f3384m);
        this.f3948a.f3389s.start();
    }
}
