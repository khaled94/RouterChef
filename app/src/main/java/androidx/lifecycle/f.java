package androidx.lifecycle;

import j1.b;
import j1.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements b.a {
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // j1.b.a
    public final void a(d dVar) {
        Object obj;
        boolean z10;
        if (dVar instanceof j0) {
            i0 w10 = ((j0) dVar).w();
            b c10 = dVar.c();
            Objects.requireNonNull(w10);
            Iterator it = new HashSet(w10.f1700a.keySet()).iterator();
            while (it.hasNext()) {
                e0 e0Var = w10.f1700a.get((String) it.next());
                g a10 = dVar.a();
                Map<String, Object> map = e0Var.f1674a;
                if (map == null) {
                    obj = null;
                } else {
                    synchronized (map) {
                        obj = e0Var.f1674a.get("androidx.lifecycle.savedstate.vm.tag");
                    }
                }
                SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                if (savedStateHandleController != null && !(z10 = savedStateHandleController.f1652a)) {
                    if (z10) {
                        throw new IllegalStateException("Already attached to lifecycleOwner");
                    }
                    savedStateHandleController.f1652a = true;
                    a10.a(savedStateHandleController);
                    throw null;
                }
            }
            if (new HashSet(w10.f1700a.keySet()).isEmpty()) {
                return;
            }
            c10.c();
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}
