package m4;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: c */
    public static final boolean f11990c = p4.f12403a;

    /* renamed from: a */
    public final List<n4> f11991a = new ArrayList();

    /* renamed from: b */
    public boolean f11992b = false;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<m4.n4>, java.util.ArrayList] */
    public final synchronized void a(String str, long j3) {
        if (this.f11992b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f11991a.add(new n4(str, j3, SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<m4.n4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<m4.n4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List<m4.n4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.List, java.util.List<m4.n4>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<m4.n4>, java.util.ArrayList] */
    public final synchronized void b(String str) {
        long j3;
        ?? r12;
        this.f11992b = true;
        if (this.f11991a.size() == 0) {
            j3 = 0;
        } else {
            j3 = ((n4) this.f11991a.get(r12.size() - 1)).f11420c - ((n4) this.f11991a.get(0)).f11420c;
        }
        if (j3 <= 0) {
            return;
        }
        long j10 = ((n4) this.f11991a.get(0)).f11420c;
        p4.a("(%-4d ms) %s", Long.valueOf(j3), str);
        Iterator it = this.f11991a.iterator();
        while (it.hasNext()) {
            n4 n4Var = (n4) it.next();
            long j11 = n4Var.f11420c;
            p4.a("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(n4Var.f11419b), n4Var.f11418a);
            j10 = j11;
        }
    }

    public final void finalize() {
        if (!this.f11992b) {
            b("Request on the loose");
            p4.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
