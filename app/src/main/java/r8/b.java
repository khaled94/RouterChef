package r8;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.widget.g1;
import androidx.fragment.app.a;
import androidx.preference.e;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.App;
import e0.d;
import g1.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import s8.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static Toast f17282a;

    public static void a(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/112848397136188")));
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/M.AbdulRaoufff")));
        }
    }

    public static void b(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://group/664129364832645")));
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/groups/routerchef/")));
        }
    }

    public static Locale c(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        Configuration configuration = context.getResources().getConfiguration();
        return i10 >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }

    public static String d(ArrayList<String> arrayList) {
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(arrayList.get(0));
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                sb.append(",");
                sb.append(arrayList.get(i10));
            }
            return sb.toString();
        }
        return "";
    }

    public static String e(String str) {
        String str2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("/system/bin/ping -c 1 " + str).getInputStream()));
            str2 = bufferedReader.readLine();
            while (str2 != null) {
                if (str2.length() > 0 && str2.contains("avg")) {
                    break;
                }
                str2 = bufferedReader.readLine();
            }
        } catch (IOException e10) {
            Log.v("Error ::: ", "getLatency: EXCEPTION");
            e10.printStackTrace();
        }
        if (str2 != null) {
            String trim = str2.substring(str2.indexOf("=")).trim();
            String trim2 = trim.substring(trim.indexOf(47) + 1).trim();
            return String.valueOf((int) Double.parseDouble(trim2.substring(0, trim2.indexOf(47))));
        }
        return "--";
    }

    public static String f(int i10, int i11, int i12) {
        return i10 + "/" + (i11 + 1) + "/" + i12;
    }

    public static c g(Context context, NetworkStatsManager networkStatsManager, int i10, long j3) {
        NetworkStats.Bucket bucket;
        try {
            if (i10 != 1) {
                return new c(TrafficStats.getMobileRxBytes(), TrafficStats.getMobileTxBytes());
            }
            if (j3 == 0) {
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                int i12 = calendar.get(2);
                int i13 = calendar.get(5);
                calendar.clear();
                calendar.set(i11, i12, i13);
                bucket = networkStatsManager.querySummaryForDevice(i10, "", calendar.getTimeInMillis(), System.currentTimeMillis());
            } else {
                bucket = networkStatsManager.querySummaryForDevice(i10, "", j3, System.currentTimeMillis());
            }
            return new c(bucket, false);
        } catch (Exception e10) {
            q(context, e10.getMessage());
            return new c((NetworkStats.Bucket) null, true);
        }
    }

    public static String h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static <T extends View> ArrayList<T> i(ViewGroup viewGroup, Class<T> cls) {
        ArrayList<T> arrayList = new ArrayList<>();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(i((ViewGroup) childAt, cls));
            }
            if (cls.isInstance(childAt)) {
                arrayList.add(cls.cast(childAt));
            }
        }
        return arrayList;
    }

    public static void j(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (activity.getCurrentFocus() != null) {
            InputMethodManager inputMethodManager2 = (InputMethodManager) activity.getSystemService("input_method");
            if (!inputMethodManager2.isAcceptingText()) {
                return;
            }
            inputMethodManager2.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static Boolean k(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting());
    }

    public static boolean l(Activity activity, AdView adView, Handler handler) {
        if (((App) activity.getApplication()).f3512u) {
            handler.post(new q(adView, 5));
            return true;
        }
        handler.post(new g1(adView, 4));
        return false;
    }

    public static Locale m(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(e.b(context), 0);
        return new Locale(Locale.getDefault().getLanguage().contains("ar") ? sharedPreferences.getString("language", "ar") : sharedPreferences.getString("language", "en"));
    }

    public static String n(long j3) {
        return new SimpleDateFormat("dd/MM/yyyy | hh:mm:ss aa").format(new Date(j3));
    }

    public static boolean o(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void p(String str, Context context) {
        Locale locale = new Locale(str);
        if (!locale.equals(c(context))) {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            Locale.setDefault(locale);
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    public static void q(Context context, String str) {
        Toast toast = f17282a;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 1);
        f17282a = makeText;
        makeText.show();
    }

    public static void r(View view, float f10, int i10) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, f10), PropertyValuesHolder.ofFloat(View.SCALE_Y, f10));
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setDuration(i10);
        ofPropertyValuesHolder.start();
    }

    public static void s(Context context) {
        String string = context.getSharedPreferences("SUB_DETAILS", 0).getString("SUB_DETAILS", "0");
        String str = string.equals("0") ? null : string.split(",")[0];
        StringBuilder c10 = a.c(str != null ? d.a("👑 ", str, " 👑 \n") : "", "Send This message, so we can help you (ارسل هذه الرسالة حتي نستطيع مساعدتك)\n\nRouter Model : ");
        c10.append(((o8.a) ((App) ((e.e) context).getApplication()).f3511t.f16191s).f16791d);
        c10.append("\nISP : ");
        c10.append(context.getSharedPreferences(e.b(context), 0).getString("isp", "we"));
        c10.append("\nAndroid Version : ");
        c10.append(Build.VERSION.RELEASE);
        c10.append("\nApp Version : ");
        c10.append(h(context));
        String sb = c10.toString();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=201128120070&text=" + URLEncoder.encode(sb, "UTF-8")));
            if (intent.resolveActivity(packageManager) == null) {
                return;
            }
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void t(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.google.android.youtube");
            intent.setData(Uri.parse("http://www.youtube.com/channel/UCqKr3T8ogEYLjMxc16sNbqA"));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("http://www.youtube.com/channel/UCqKr3T8ogEYLjMxc16sNbqA"));
            context.startActivity(intent2);
        }
    }
}
