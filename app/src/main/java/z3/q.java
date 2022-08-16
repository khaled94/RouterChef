package z3;

import android.os.Bundle;
import android.util.Log;
import c5.j;
import i0.b;

/* loaded from: classes.dex */
public abstract class q<T> {

    /* renamed from: a */
    public final int f20959a;

    /* renamed from: b */
    public final j<T> f20960b = new j<>();

    /* renamed from: c */
    public final int f20961c;

    /* renamed from: d */
    public final Bundle f20962d;

    public q(int i10, int i11, Bundle bundle) {
        this.f20959a = i10;
        this.f20961c = i11;
        this.f20962d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(rVar);
            Log.d("MessengerIpcClient", b.a(new StringBuilder(valueOf.length() + 14 + valueOf2.length()), "Failing ", valueOf, " with ", valueOf2));
        }
        this.f20960b.a(rVar);
    }

    public final void d(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            Log.d("MessengerIpcClient", b.a(new StringBuilder(valueOf.length() + 16 + valueOf2.length()), "Finishing ", valueOf, " with ", valueOf2));
        }
        this.f20960b.b(t10);
    }

    public final String toString() {
        StringBuilder a10 = p.a(55, "Request { what=", this.f20961c, " id=", this.f20959a);
        a10.append(" oneWay=");
        a10.append(b());
        a10.append("}");
        return a10.toString();
    }
}
