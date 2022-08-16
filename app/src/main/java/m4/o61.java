package m4;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import n3.i1;

/* loaded from: classes.dex */
public final class o61 {

    /* renamed from: h */
    public static final SparseArray<vl> f12004h;

    /* renamed from: a */
    public final Context f12005a;

    /* renamed from: b */
    public final co0 f12006b;

    /* renamed from: c */
    public final TelephonyManager f12007c;

    /* renamed from: d */
    public final i61 f12008d;

    /* renamed from: e */
    public final f61 f12009e;

    /* renamed from: f */
    public final i1 f12010f;

    /* renamed from: g */
    public int f12011g;

    static {
        SparseArray<vl> sparseArray = new SparseArray<>();
        f12004h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), vl.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        vl vlVar = vl.CONNECTING;
        sparseArray.put(ordinal, vlVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), vlVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), vlVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), vl.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        vl vlVar2 = vl.DISCONNECTED;
        sparseArray.put(ordinal2, vlVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), vlVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), vlVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), vlVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), vlVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), vl.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), vlVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), vlVar);
    }

    public o61(Context context, co0 co0Var, i61 i61Var, f61 f61Var, i1 i1Var) {
        this.f12005a = context;
        this.f12006b = co0Var;
        this.f12008d = i61Var;
        this.f12009e = f61Var;
        this.f12007c = (TelephonyManager) context.getSystemService("phone");
        this.f12010f = i1Var;
    }
}
