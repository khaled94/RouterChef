package u7;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import b3.n;
import c5.j;
import java.util.Objects;
import u7.t0;

/* loaded from: classes.dex */
public final class q0 extends Binder {

    /* renamed from: t */
    public static final /* synthetic */ int f19572t = 0;

    /* renamed from: s */
    public final a f19573s;

    /* loaded from: classes.dex */
    public interface a {
    }

    public q0(a aVar) {
        this.f19573s = aVar;
    }

    public final void a(t0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            a aVar2 = this.f19573s;
            Intent intent = aVar.f19589a;
            k kVar = k.this;
            Objects.requireNonNull(kVar);
            j jVar = new j();
            kVar.f19520s.execute(new i(kVar, intent, jVar));
            jVar.f2776a.b(j.f19515s, new n(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
