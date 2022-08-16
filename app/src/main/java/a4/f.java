package a4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.a;
import d4.c1;
import h4.d;
import j4.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    public static final int f132a = 12451000;

    /* renamed from: b */
    public static final f f133b = new f();

    static {
        AtomicBoolean atomicBoolean = i.f139a;
    }

    public final int a(Context context) {
        AtomicBoolean atomicBoolean = i.f139a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = c1.f3850a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && d.c(context)) {
            int i12 = c1.f3850a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder c10 = a.c("gcore_");
            c10.append(f132a);
            c10.append("-");
            if (!TextUtils.isEmpty(str)) {
                c10.append(str);
            }
            c10.append("-");
            if (context != null) {
                c10.append(context.getPackageName());
            }
            c10.append("-");
            if (context != null) {
                try {
                    c10.append(c.a(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb = c10.toString();
            int i13 = c1.f3850a;
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:2|(2:106|3)|5|(4:9|2c|23|(2:25|(2:27|28))(2:29|30))|34|(4:36|(3:38|(1:43)(1:42)|44)|45|(12:47|(1:50)(1:51)|52|(2:108|54)(1:56)|104|57|58|(1:60)(2:(2:62|(1:64))|(7:71|(1:73)(1:74)|(1:76)|(1:78)(4:79|(2:102|81)|84|(1:86)(1:87))|90|(1:(1:93)(1:94))|(1:96)(1:97))(1:69))|70|90|(0)|(0)(0)))|48|(0)(0)|52|(0)(0)|104|57|58|(0)(0)|70|90|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.c(android.content.Context, int):int");
    }
}
