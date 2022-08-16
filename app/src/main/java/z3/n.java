package z3;

import android.content.Context;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.raouf.routerchef.macNamingDb.MacNameDb;
import g1.x;
import g1.z;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public Object f20957a;

    /* renamed from: b */
    public Object f20958b;

    public n(Context context) {
        this.f20957a = context;
        if (MacNameDb.f3654l == null) {
            z.a a10 = x.a(context.getApplicationContext(), MacNameDb.class, "mac_name.db");
            a10.f4880h = true;
            a10.c();
            MacNameDb.f3654l = (MacNameDb) a10.b();
        }
        this.f20958b = MacNameDb.f3654l.q();
    }

    public /* synthetic */ n(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f20957a = new Messenger(iBinder);
            this.f20958b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f20958b = new h(iBinder);
            this.f20957a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final String a(String str) {
        String upperCase = str.toUpperCase();
        return str.contains("-") ? upperCase.replace('-', ':') : upperCase;
    }
}
