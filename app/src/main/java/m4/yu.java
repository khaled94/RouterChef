package m4;

import android.os.Parcel;
import android.view.View;
import k4.a;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public abstract class yu extends ba {
    public yu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
            pv0 pv0Var = (pv0) this;
            synchronized (pv0Var) {
                Object e02 = b.e0(c02);
                if (!(e02 instanceof av0)) {
                    g1.j("Not an instance of InternalNativeAd. This is most likely a transient error");
                } else {
                    av0 av0Var = pv0Var.f12629w;
                    if (av0Var != null) {
                        av0Var.f(pv0Var);
                    }
                    av0 av0Var2 = (av0) e02;
                    if (av0Var2.f6264m.c()) {
                        pv0Var.f12629w = av0Var2;
                        av0Var2.e(pv0Var);
                        pv0Var.f12629w.c(pv0Var.d());
                    } else {
                        g1.g("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                }
            }
        } else if (i10 == 2) {
            pv0 pv0Var2 = (pv0) this;
            synchronized (pv0Var2) {
                av0 av0Var3 = pv0Var2.f12629w;
                if (av0Var3 != null) {
                    av0Var3.f(pv0Var2);
                    pv0Var2.f12629w = null;
                }
            }
        } else if (i10 != 3) {
            return false;
        } else {
            a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
            pv0 pv0Var3 = (pv0) this;
            synchronized (pv0Var3) {
                if (pv0Var3.f12629w != null) {
                    Object e03 = b.e0(c03);
                    if (!(e03 instanceof View)) {
                        g1.j("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                    }
                    av0 av0Var4 = pv0Var3.f12629w;
                    View view = (View) e03;
                    synchronized (av0Var4) {
                        av0Var4.f6262k.o(view);
                    }
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
