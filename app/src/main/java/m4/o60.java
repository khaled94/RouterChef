package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d4.m;
import k4.a;

/* loaded from: classes.dex */
public abstract class o60 extends ba {
    public o60() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        oo0 oo0Var;
        dq dqVar;
        Bundle bundle;
        hz0 hz0Var;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        i11 = 0;
        v60 v60Var = null;
        v60 v60Var2 = null;
        r2 = null;
        r2 = null;
        IInterface iInterface = null;
        w60 w60Var = null;
        r2 = null;
        String str = null;
        s60 s60Var = null;
        switch (i10) {
            case 1:
                jn jnVar = (jn) ca.a(parcel, jn.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    v60Var = queryLocalInterface instanceof v60 ? (v60) queryLocalInterface : new t60(readStrongBinder);
                }
                ((yl1) this).N3(jnVar, v60Var);
                parcel2.writeNoException();
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    s60Var = queryLocalInterface2 instanceof s60 ? (s60) queryLocalInterface2 : new q60(readStrongBinder2);
                }
                m.d("#008 Must be called on the main UI thread.");
                ((yl1) this).f15832t.f13734v.set(s60Var);
                parcel2.writeNoException();
                break;
            case 3:
                m.d("#008 Must be called on the main UI thread.");
                hz0 hz0Var2 = ((yl1) this).f15836x;
                if (hz0Var2 != null && !hz0Var2.f9485r) {
                    i11 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                parcel2.writeInt(i11);
                break;
            case 4:
                yl1 yl1Var = (yl1) this;
                synchronized (yl1Var) {
                    hz0 hz0Var3 = yl1Var.f15836x;
                    if (hz0Var3 != null && (oo0Var = hz0Var3.f6195f) != null) {
                        str = oo0Var.f12238s;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 5:
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                yl1 yl1Var2 = (yl1) this;
                synchronized (yl1Var2) {
                    yl1Var2.Q3(c02, yl1Var2.y);
                }
                parcel2.writeNoException();
                break;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    w60Var = queryLocalInterface3 instanceof w60 ? (w60) queryLocalInterface3 : new w60(readStrongBinder3);
                }
                m.d("#008 Must be called on the main UI thread.");
                ((yl1) this).f15832t.f13736x.set(w60Var);
                parcel2.writeNoException();
                break;
            case 7:
                x60 x60Var = (x60) ca.a(parcel, x60.CREATOR);
                yl1 yl1Var3 = (yl1) this;
                synchronized (yl1Var3) {
                    m.d("#008 Must be called on the main UI thread.");
                    mm1 mm1Var = yl1Var3.f15834v;
                    mm1Var.f11248a = x60Var.f15225s;
                    mm1Var.f11249b = x60Var.f15226t;
                }
                parcel2.writeNoException();
                break;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    dqVar = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    dqVar = queryLocalInterface4 instanceof dq ? (dq) queryLocalInterface4 : new cq(readStrongBinder4);
                }
                yl1 yl1Var4 = (yl1) this;
                if (dqVar == null) {
                    yl1Var4.f15832t.s(null);
                } else {
                    yl1Var4.f15832t.s(new xl1(yl1Var4, dqVar));
                }
                parcel2.writeNoException();
                break;
            case 9:
                m.d("#008 Must be called on the main UI thread.");
                hz0 hz0Var4 = ((yl1) this).f15836x;
                if (hz0Var4 != null) {
                    rp0 rp0Var = hz0Var4.f9482n;
                    synchronized (rp0Var) {
                        bundle = new Bundle(rp0Var.f13414t);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                ca.c(parcel2, bundle);
                break;
            case 10:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                ClassLoader classLoader2 = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                ((yl1) this).Q3(c03, z11);
                parcel2.writeNoException();
                break;
            case 11:
                m.d("#008 Must be called on the main UI thread.");
                hz0 hz0Var5 = ((yl1) this).f15836x;
                if (hz0Var5 != null) {
                    iInterface = hz0Var5.p;
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 12:
                yl1 yl1Var5 = (yl1) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.D4)).booleanValue() && (hz0Var = yl1Var5.f15836x) != null) {
                    iInterface = hz0Var.f6195f;
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 13:
                gq N3 = fq.N3(parcel.readStrongBinder());
                m.d("setOnPaidEventListener must be called on the main UI thread.");
                ((yl1) this).f15832t.f13737z.set(N3);
                parcel2.writeNoException();
                break;
            case 14:
                jn jnVar2 = (jn) ca.a(parcel, jn.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    v60Var2 = queryLocalInterface5 instanceof v60 ? (v60) queryLocalInterface5 : new t60(readStrongBinder5);
                }
                ((yl1) this).O3(jnVar2, v60Var2);
                parcel2.writeNoException();
                break;
            case 15:
                ClassLoader classLoader3 = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                ((yl1) this).P3(z10);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
