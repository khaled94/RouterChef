package b3;

import android.database.Cursor;
import b3.b0;
import com.raouf.routerchef.NetworkDevices;
import h8.f;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements b0.a, f {

    /* renamed from: s */
    public static final /* synthetic */ o f2532s = new o();

    /* renamed from: t */
    public static final /* synthetic */ o f2533t = new o();

    @Override // b3.b0.a
    public final Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }

    @Override // h8.f
    public final void q() {
        int i10 = NetworkDevices.V;
    }
}
