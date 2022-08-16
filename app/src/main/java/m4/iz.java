package m4;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.fragment.app.v;
import g3.b;
import java.util.Objects;
import n3.g1;

/* loaded from: classes.dex */
public final class iz<AdT> extends b {

    /* renamed from: a */
    public final Context f9775a;

    /* renamed from: b */
    public final nn f9776b = nn.f11862a;

    /* renamed from: c */
    public final dp f9777c;

    /* renamed from: d */
    public final c10 f9778d;

    public iz(Context context, String str) {
        c10 c10Var = new c10();
        this.f9778d = c10Var;
        this.f9775a = context;
        go goVar = io.f9708f.f9710b;
        on onVar = new on();
        Objects.requireNonNull(goVar);
        this.f9777c = new Cdo(goVar, context, onVar, str, c10Var).d(context, false);
    }

    @Override // o3.a
    public final void b(v vVar) {
        try {
            dp dpVar = this.f9777c;
            if (dpVar == null) {
                return;
            }
            dpVar.c1(new ko(vVar));
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // o3.a
    public final void c(boolean z10) {
        try {
            dp dpVar = this.f9777c;
            if (dpVar == null) {
                return;
            }
            dpVar.e2(z10);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // o3.a
    public final void d(Activity activity) {
        if (activity == null) {
            g1.j("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            dp dpVar = this.f9777c;
            if (dpVar == null) {
                return;
            }
            dpVar.k1(new k4.b(activity));
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
