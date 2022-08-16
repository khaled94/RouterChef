package m4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class oh1 implements eh1<mh1> {

    /* renamed from: a */
    public final uz1 f12164a;

    /* renamed from: b */
    public final Context f12165b;

    public oh1(uz1 uz1Var, Context context) {
        this.f12164a = uz1Var;
        this.f12165b = context;
    }

    @Override // m4.eh1
    public final tz1<mh1> a() {
        return this.f12164a.Z(new Callable() { // from class: m4.nh1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10;
                boolean z10;
                int i11;
                oh1 oh1Var = oh1.this;
                TelephonyManager telephonyManager = (TelephonyManager) oh1Var.f12165b.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                s1 s1Var = s.B.f5789c;
                int i12 = -1;
                if (s1.e(oh1Var.f12165b, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) oh1Var.f12165b.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                        i11 = type;
                        i12 = ordinal;
                    } else {
                        i11 = -1;
                    }
                    z10 = connectivityManager.isActiveNetworkMetered();
                    i10 = i12;
                } else {
                    i10 = -1;
                    z10 = false;
                    i11 = -2;
                }
                return new mh1(networkOperator, i11, s1.b(oh1Var.f12165b), phoneType, z10, i10);
            }
        });
    }
}
