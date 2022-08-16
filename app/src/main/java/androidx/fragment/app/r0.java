package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f1571a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f1572b;

    /* renamed from: c */
    public final /* synthetic */ Object f1573c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f1574d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f1575e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f1576f;

    /* renamed from: g */
    public final /* synthetic */ q0 f1577g;

    public r0(q0 q0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1577g = q0Var;
        this.f1571a = obj;
        this.f1572b = arrayList;
        this.f1575e = obj2;
        this.f1576f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.f1571a;
        if (obj != null) {
            this.f1577g.t(obj, this.f1572b, null);
        }
        Object obj2 = this.f1573c;
        if (obj2 != null) {
            this.f1577g.t(obj2, this.f1574d, null);
        }
        Object obj3 = this.f1575e;
        if (obj3 != null) {
            this.f1577g.t(obj3, this.f1576f, null);
        }
    }
}
