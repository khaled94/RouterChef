package f8;

import android.os.AsyncTask;
import android.widget.EditText;
import com.raouf.routerchef.NewWifiSettings;
import com.raouf.routerchef.resModels.BasicWifiInfo;
import j8.b;
import java.net.InetAddress;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4670s;

    /* renamed from: t */
    public final /* synthetic */ Object f4671t;

    /* renamed from: u */
    public final /* synthetic */ Object f4672u;

    public /* synthetic */ p1(Object obj, Object obj2, int i10) {
        this.f4670s = i10;
        this.f4671t = obj;
        this.f4672u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EditText editText;
        switch (this.f4670s) {
            case 0:
                NewWifiSettings newWifiSettings = (NewWifiSettings) this.f4671t;
                BasicWifiInfo basicWifiInfo = (BasicWifiInfo) this.f4672u;
                newWifiSettings.X.setText(basicWifiInfo.ssidName);
                String str2 = basicWifiInfo.enabled_5G;
                if (str2 != null) {
                    newWifiSettings.f3583g0.setChecked(Boolean.parseBoolean(str2));
                }
                if (basicWifiInfo.hidden != null) {
                    newWifiSettings.f3578b0.setChecked(!basicWifiInfo.a());
                    newWifiSettings.f3577a0.setChecked(basicWifiInfo.a());
                }
                String str3 = basicWifiInfo.maxClients;
                if (str3 != null) {
                    newWifiSettings.Z.setText(str3);
                }
                String str4 = basicWifiInfo.password;
                if (str4 == null || str4.isEmpty()) {
                    editText = newWifiSettings.Y;
                    str = "●●●●●●●●";
                } else {
                    editText = newWifiSettings.Y;
                    str = basicWifiInfo.password;
                }
                editText.setText(str);
                if (basicWifiInfo.safe == null) {
                    return;
                }
                newWifiSettings.f3579c0.setChecked(basicWifiInfo.b());
                newWifiSettings.f3580d0.setChecked(true ^ basicWifiInfo.b());
                return;
            default:
                b bVar = (b) this.f4671t;
                String str5 = (String) this.f4672u;
                Objects.requireNonNull(bVar);
                try {
                    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                    for (int i10 = 0; i10 < 255; i10++) {
                        newCachedThreadPool.execute(new m2(bVar, InetAddress.getByName(str5 + i10), 1));
                    }
                    newCachedThreadPool.shutdown();
                    newCachedThreadPool.awaitTermination(10000L, TimeUnit.MILLISECONDS);
                    bVar.f5495b.C();
                    AsyncTask.execute(new s0(bVar, 2));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    bVar.f5495b.A(e10.getMessage());
                    return;
                }
        }
    }
}
