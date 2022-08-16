package x4;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;
import s4.a2;
import s4.k2;
import s4.w1;
import s4.x1;
import y4.l3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final k2 f20026a;

    /* renamed from: x4.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0149a extends l3 {
    }

    public a(k2 k2Var) {
        this.f20026a = k2Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        k2 k2Var = this.f20026a;
        Objects.requireNonNull(k2Var);
        k2Var.b(new x1(k2Var, str, str2, bundle));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<android.util.Pair<y4.l3, s4.a2>>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<android.util.Pair<y4.l3, s4.a2>>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<android.util.Pair<y4.l3, s4.a2>>, java.util.ArrayList] */
    public final void b(AbstractC0149a abstractC0149a) {
        k2 k2Var = this.f20026a;
        Objects.requireNonNull(k2Var);
        synchronized (k2Var.f17952c) {
            for (int i10 = 0; i10 < k2Var.f17952c.size(); i10++) {
                if (abstractC0149a.equals(((Pair) k2Var.f17952c.get(i10)).first)) {
                    Log.w("FA", "OnEventListener already registered.");
                    return;
                }
            }
            a2 a2Var = new a2(abstractC0149a);
            k2Var.f17952c.add(new Pair(abstractC0149a, a2Var));
            if (k2Var.f17956g != null) {
                try {
                    k2Var.f17956g.registerOnMeasurementEventListener(a2Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            k2Var.b(new w1(k2Var, a2Var));
        }
    }
}
