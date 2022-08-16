package o3;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.v;
import d4.m;
import f3.d;
import f3.h;
import m4.dp;
import m4.fn;
import m4.iz;
import m4.tq;
import n3.g1;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull d dVar, @RecentlyNonNull b bVar) {
        m.i(context, "Context cannot be null.");
        m.i(str, "AdUnitId cannot be null.");
        m.i(dVar, "AdRequest cannot be null.");
        m.i(bVar, "LoadCallback cannot be null.");
        iz izVar = new iz(context, str);
        tq tqVar = dVar.f4490a;
        try {
            dp dpVar = izVar.f9777c;
            if (dpVar == null) {
                return;
            }
            izVar.f9778d.f6680s = tqVar.f14148g;
            dpVar.r3(izVar.f9776b.a(izVar.f9775a, tqVar), new fn(bVar, izVar));
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
            bVar.a(new h(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public abstract void b(v vVar);

    public abstract void c(boolean z10);

    public abstract void d(@RecentlyNonNull Activity activity);
}
