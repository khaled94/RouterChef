package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.HashMap;
import java.util.Objects;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public abstract class kp extends ba implements lp {
    public kp() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        am1 am1Var;
        IInterface iInterface;
        qv0 qv0Var = null;
        dy dyVar = null;
        switch (i10) {
            case 1:
                am1Var = ((ClientApi) this).V0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (on) ca.a(parcel, on.CREATOR), parcel.readString(), e10.N3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 2:
                am1Var = ((ClientApi) this).Q1(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (on) ca.a(parcel, on.CREATOR), parcel.readString(), e10.N3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 3:
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                String readString = parcel.readString();
                f10 N3 = e10.N3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                Context context = (Context) b.e0(c02);
                iInterface = new fc1(if0.e(context, N3, readInt), context, readString);
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 4:
            case 7:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel2.writeNoException();
                ca.d(parcel2, qv0Var);
                return true;
            case 5:
                qv0Var = new qv0((FrameLayout) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())), (FrameLayout) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())));
                parcel2.writeNoException();
                ca.d(parcel2, qv0Var);
                return true;
            case 6:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                f10 N32 = e10.N3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Context context2 = (Context) b.e0(c03);
                y20 z10 = if0.e(context2, N32, readInt2).z();
                z10.c(context2);
                am1Var = z10.d().f6533f.a();
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 8:
                am1Var = ((ClientApi) this).N(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 9:
                am1Var = if0.d((Context) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())), parcel.readInt()).f();
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 10:
                am1Var = ((ClientApi) this).T1(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (on) ca.a(parcel, on.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 11:
                iInterface = new pv0((View) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())), (HashMap) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())), (HashMap) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())));
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 12:
                a c04 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                f10 N33 = e10.N3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Context context3 = (Context) b.e0(c04);
                y20 z11 = if0.e(context3, N33, readInt3).z();
                z11.c(context3);
                z11.f15575u = readString2;
                am1Var = z11.d().f6535h.a();
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 13:
                a c05 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                on onVar = (on) ca.a(parcel, on.CREATOR);
                String readString3 = parcel.readString();
                f10 N34 = e10.N3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                Context context4 = (Context) b.e0(c05);
                fu1 w10 = if0.e(context4, N34, readInt4).w();
                Objects.requireNonNull(w10);
                Objects.requireNonNull(readString3);
                w10.f8648b = readString3;
                Objects.requireNonNull(context4);
                w10.f8650d = context4;
                d.a.g((String) w10.f8648b, String.class);
                kg0 kg0Var = new kg0((gh0) w10.f8649c, (Context) w10.f8650d, (String) w10.f8648b);
                if (readInt4 >= ((Integer) jo.f10145d.f10148c.a(es.f8137l3)).intValue()) {
                    am1Var = kg0Var.f10420i.a();
                } else {
                    am1Var = kg0Var.f10417f.a();
                }
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 14:
                am1Var = if0.e((Context) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())), e10.N3(parcel.readStrongBinder()), parcel.readInt()).t();
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 15:
                am1Var = if0.e((Context) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())), e10.N3(parcel.readStrongBinder()), parcel.readInt()).q();
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            case 16:
                a c06 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                f10 N35 = e10.N3(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    dyVar = queryLocalInterface instanceof dy ? (dy) queryLocalInterface : new cy(readStrongBinder);
                }
                Context context5 = (Context) b.e0(c06);
                ug0 o10 = if0.e(context5, N35, readInt5).o();
                Objects.requireNonNull(o10);
                Objects.requireNonNull(context5);
                o10.f14407b = context5;
                Objects.requireNonNull(dyVar);
                o10.f14408c = dyVar;
                d.a.g(o10.f14407b, Context.class);
                d.a.g(o10.f14408c, dy.class);
                am1Var = new vg0(o10.f14406a, o10.f14407b, o10.f14408c).f14683h.a();
                parcel2.writeNoException();
                ca.d(parcel2, am1Var);
                return true;
            default:
                return false;
        }
    }
}
