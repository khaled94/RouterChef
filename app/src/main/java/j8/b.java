package j8;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.text.format.Formatter;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.DevicesInfo;
import e0.d;
import g1.v;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m4.oq1;
import n3.j0;
import z3.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public Context f5494a;

    /* renamed from: b */
    public d f5495b;

    /* renamed from: e */
    public j0 f5498e;

    /* renamed from: f */
    public n f5499f;

    /* renamed from: d */
    public int f5497d = 0;

    /* renamed from: c */
    public ArrayList<c> f5496c = new ArrayList<>();

    public b(Context context, d dVar) {
        this.f5494a = context;
        this.f5495b = dVar;
        this.f5498e = new j0(context);
        this.f5499f = new n(this.f5494a);
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public static String c(Context context) {
        return Formatter.formatIpAddress(((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    public static String d() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2.substring(0, 1).toUpperCase() + str2.substring(1);
        }
        return d.a(str.substring(0, 1).toUpperCase() + str.substring(1), " ", str2);
    }

    public static String e(Context context) {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return context.getString(R.string.notAvailable);
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i10])));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return context.getString(R.string.notAvailable);
    }

    public final void a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            String upperCase = str2.toUpperCase();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f5496c.size()) {
                    z10 = true;
                    break;
                } else if (this.f5496c.get(i10).f5501b.equals(upperCase)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                return;
            }
            this.f5496c.add(new c(str, str2.toUpperCase()));
        }
    }

    public final void b(List<DevicesInfo.Device> list, int i10) {
        c cVar;
        String c10 = c(this.f5494a);
        for (int i11 = 0; i11 < list.size(); i11++) {
            DevicesInfo.Device device = list.get(i11);
            String str = device.ip;
            if (str != null) {
                String d5 = str.equals(c10) ? d() : device.hostname;
                String str2 = device.ip;
                cVar = new c(d5, str2, device.mac, str2.equals(c10), true);
            } else {
                cVar = new c(device.hostname, null, device.mac, false, true);
            }
            cVar.f5506g = i10;
            this.f5496c.add(cVar);
        }
    }

    public final void f() {
        AsyncTask.execute(new v(this, 3));
    }

    public final void g(final boolean z10) {
        AsyncTask.execute(new Runnable() { // from class: j8.a
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                boolean z11 = z10;
                for (int i10 = 0; i10 < bVar.f5496c.size(); i10++) {
                    if (!bVar.f5496c.get(i10).f5507h || z11) {
                        try {
                            oq1 a10 = ((q9.a) bVar.f5498e.f16490t).a(bVar.f5496c.get(i10).f5501b.substring(0, 8).toUpperCase());
                            String str = a10 != null ? (String) a10.f12269a : null;
                            if (str != null) {
                                if (str.length() > 20) {
                                    str = str.substring(0, 20);
                                }
                                bVar.f5496c.get(i10).f5502c = str;
                                bVar.f5496c.get(i10).a();
                            } else {
                                bVar.f5496c.get(i10).f5502c = bVar.f5494a.getString(R.string.unknown);
                            }
                            bVar.f5495b.d(bVar.f5496c.get(i10), i10);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            bVar.f5496c.get(i10).f5502c = bVar.f5494a.getString(R.string.unknown);
                            bVar.f5495b.d(bVar.f5496c.get(i10), i10);
                        }
                    }
                }
                bVar.f5495b.u();
                bVar.f();
            }
        });
    }

    public final void h(c cVar) {
        for (int i10 = 0; i10 < this.f5496c.size(); i10++) {
            if (this.f5496c.get(i10).f5500a != null && this.f5496c.get(i10).f5500a.equals(cVar.f5500a)) {
                this.f5496c.set(i10, cVar);
            }
        }
    }
}
