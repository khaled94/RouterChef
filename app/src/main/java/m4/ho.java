package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e1.j;
import java.util.Objects;
import n3.g1;

/* loaded from: classes.dex */
public abstract class ho<T> {

    /* renamed from: a */
    public static final lp f9391a;

    static {
        lp lpVar = null;
        try {
            Object newInstance = go.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                g1.j("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    lpVar = queryLocalInterface instanceof lp ? (lp) queryLocalInterface : new jp(iBinder);
                }
            }
        } catch (Exception unused) {
            g1.j("Failed to instantiate ClientApi class.");
        }
        f9391a = lpVar;
    }

    public abstract T a();

    public abstract T b(lp lpVar);

    public abstract T c();

    public final T d(Context context, boolean z10) {
        boolean z11;
        T e10;
        if (!z10) {
            g90 g90Var = io.f9708f.f9709a;
            if (!g90.f(context, 12451000)) {
                g1.e("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = z10 | (!(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false)));
        es.c(context);
        if (it.f9742a.e().booleanValue()) {
            z11 = false;
        } else if (it.f9743b.e().booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z13;
            z11 = false;
        }
        T t10 = null;
        if (z12) {
            e10 = e();
            if (e10 == null && !z11) {
                try {
                    t10 = c();
                } catch (RemoteException e11) {
                    g1.k("Cannot invoke remote loader.", e11);
                }
                e10 = t10;
            }
        } else {
            try {
                t10 = c();
            } catch (RemoteException e12) {
                g1.k("Cannot invoke remote loader.", e12);
            }
            if (t10 == null) {
                int intValue = ut.f14485a.e().intValue();
                io ioVar = io.f9708f;
                if (ioVar.f9713e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    g90 g90Var2 = ioVar.f9709a;
                    String str = ioVar.f9712d.f12051s;
                    Objects.requireNonNull(g90Var2);
                    g90.i(context, str, bundle, new j(g90Var2));
                }
            }
            if (t10 == null) {
                e10 = e();
            }
            e10 = t10;
        }
        return e10 == null ? a() : e10;
    }

    public final T e() {
        lp lpVar = f9391a;
        if (lpVar == null) {
            g1.j("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(lpVar);
        } catch (RemoteException e10) {
            g1.k("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }
}
