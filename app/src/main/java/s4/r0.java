package s4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public abstract class r0 extends g0 implements s0 {
    public r0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static s0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof s0 ? (s0) queryLocalInterface : new q0(iBinder);
    }

    @Override // s4.g0
    public final boolean w(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        v0 v0Var = null;
        v0 v0Var2 = null;
        v0 v0Var3 = null;
        y0 y0Var = null;
        y0 y0Var2 = null;
        y0 y0Var3 = null;
        v0 v0Var4 = null;
        v0 v0Var5 = null;
        v0 v0Var6 = null;
        v0 v0Var7 = null;
        v0 v0Var8 = null;
        v0 v0Var9 = null;
        a1 a1Var = null;
        v0 v0Var10 = null;
        v0 v0Var11 = null;
        v0 v0Var12 = null;
        v0 v0Var13 = null;
        v0 v0Var14 = null;
        switch (i10) {
            case 1:
                initialize(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (b1) h0.a(parcel, b1.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) h0.a(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) h0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var = queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, v0Var, parcel.readLong());
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                ClassLoader classLoader = h0.f17902a;
                setUserProperty(readString3, readString4, c02, parcel.readInt() != 0, parcel.readLong());
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ClassLoader classLoader2 = h0.f17902a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var14 = queryLocalInterface2 instanceof v0 ? (v0) queryLocalInterface2 : new t0(readStrongBinder2);
                }
                getUserProperties(readString5, readString6, z10, v0Var14);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var13 = queryLocalInterface3 instanceof v0 ? (v0) queryLocalInterface3 : new t0(readStrongBinder3);
                }
                getMaxUserProperties(readString7, v0Var13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) h0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) h0.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var12 = queryLocalInterface4 instanceof v0 ? (v0) queryLocalInterface4 : new t0(readStrongBinder4);
                }
                getConditionalUserProperties(readString8, readString9, v0Var12);
                break;
            case 11:
                ClassLoader classLoader3 = h0.f17902a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                setMeasurementEnabled(z10, parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var11 = queryLocalInterface5 instanceof v0 ? (v0) queryLocalInterface5 : new t0(readStrongBinder5);
                }
                getCurrentScreenName(v0Var11);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var10 = queryLocalInterface6 instanceof v0 ? (v0) queryLocalInterface6 : new t0(readStrongBinder6);
                }
                getCurrentScreenClass(v0Var10);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    a1Var = queryLocalInterface7 instanceof a1 ? (a1) queryLocalInterface7 : new z0(readStrongBinder7);
                }
                setInstanceIdProvider(a1Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var9 = queryLocalInterface8 instanceof v0 ? (v0) queryLocalInterface8 : new t0(readStrongBinder8);
                }
                getCachedAppInstanceId(v0Var9);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var8 = queryLocalInterface9 instanceof v0 ? (v0) queryLocalInterface9 : new t0(readStrongBinder9);
                }
                getAppInstanceId(v0Var8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var7 = queryLocalInterface10 instanceof v0 ? (v0) queryLocalInterface10 : new t0(readStrongBinder10);
                }
                getGmpAppId(v0Var7);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var6 = queryLocalInterface11 instanceof v0 ? (v0) queryLocalInterface11 : new t0(readStrongBinder11);
                }
                generateEventId(v0Var6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (Bundle) h0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var5 = queryLocalInterface12 instanceof v0 ? (v0) queryLocalInterface12 : new t0(readStrongBinder12);
                }
                onActivitySaveInstanceState(c03, v0Var5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var4 = queryLocalInterface13 instanceof v0 ? (v0) queryLocalInterface13 : new t0(readStrongBinder13);
                }
                performAction(bundle2, v0Var4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    y0Var3 = queryLocalInterface14 instanceof y0 ? (y0) queryLocalInterface14 : new w0(readStrongBinder14);
                }
                setEventInterceptor(y0Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    y0Var2 = queryLocalInterface15 instanceof y0 ? (y0) queryLocalInterface15 : new w0(readStrongBinder15);
                }
                registerOnMeasurementEventListener(y0Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    y0Var = queryLocalInterface16 instanceof y0 ? (y0) queryLocalInterface16 : new w0(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(y0Var);
                break;
            case 37:
                initForTests(parcel.readHashMap(h0.f17902a));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var3 = queryLocalInterface17 instanceof v0 ? (v0) queryLocalInterface17 : new t0(readStrongBinder17);
                }
                getTestFlag(v0Var3, parcel.readInt());
                break;
            case 39:
                ClassLoader classLoader4 = h0.f17902a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                setDataCollectionEnabled(z10);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    v0Var2 = queryLocalInterface18 instanceof v0 ? (v0) queryLocalInterface18 : new t0(readStrongBinder18);
                }
                isDataCollectionEnabled(v0Var2);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) h0.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) h0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) h0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
