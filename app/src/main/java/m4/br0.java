package m4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class br0<ListenerT> {
    @GuardedBy("this")

    /* renamed from: s */
    public final Map<ListenerT, Executor> f6603s = new HashMap();

    public br0(Set<es0<ListenerT>> set) {
        synchronized (this) {
            for (es0<ListenerT> es0Var : set) {
                synchronized (this) {
                    I0(es0Var.f8249a, es0Var.f8250b);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<ListenerT, java.util.concurrent.Executor>] */
    public final synchronized void I0(ListenerT listenert, Executor executor) {
        this.f6603s.put(listenert, executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<ListenerT, java.util.concurrent.Executor>] */
    public final synchronized void M0(ar0<ListenerT> ar0Var) {
        for (Map.Entry entry : this.f6603s.entrySet()) {
            ((Executor) entry.getValue()).execute(new kh(ar0Var, entry.getKey()));
        }
    }
}
