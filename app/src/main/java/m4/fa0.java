package m4;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class fa0 {

    /* renamed from: s */
    public final Object f8379s;

    public abstract qa2 a(n82 n82Var);

    public final ViewTreeObserver b() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) ((WeakReference) this.f8379s).get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public abstract Object c(qa2 qa2Var);

    public Map d() {
        return Collections.emptyMap();
    }

    public abstract void e(qa2 qa2Var);
}
