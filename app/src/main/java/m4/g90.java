package m4;

import a4.f;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import f3.c;
import g3.b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import o3.a;

/* loaded from: classes.dex */
public final class g90 {

    /* renamed from: b */
    public static final vt1 f8771b = new vt1(Looper.getMainLooper());

    /* renamed from: c */
    public static final String f8772c = AdView.class.getName();

    /* renamed from: d */
    public static final String f8773d = a.class.getName();

    /* renamed from: e */
    public static final String f8774e = g3.a.class.getName();

    /* renamed from: f */
    public static final String f8775f = b.class.getName();

    /* renamed from: g */
    public static final String f8776g = u3.a.class.getName();

    /* renamed from: h */
    public static final String f8777h = c.class.getName();

    /* renamed from: a */
    public float f8778a = -1.0f;

    public static String b(String str) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ut.f14488d.e());
    }

    public static final int d(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final boolean e() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean f(Context context, int i10) {
        return f.f133b.c(context, i10) == 0;
    }

    public static final boolean g() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int h(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void i(Context context, String str, Bundle bundle, f90 f90Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a10 = f.f133b.a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(a10);
            sb.append(".214106000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        f90Var.b(appendQueryParameter.toString());
    }

    public static final int j(Context context, int i10) {
        return d(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String k(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || e()) {
            string = "emulator";
        }
        return b(string);
    }

    public static final void l(ViewGroup viewGroup, on onVar, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int j3 = j(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(onVar.f12225x - j3, onVar.f12222u - j3, 17));
        viewGroup.addView(frameLayout, onVar.f12225x, onVar.f12222u);
    }

    public final int a(Context context, int i10) {
        if (this.f8778a < 0.0f) {
            synchronized (this) {
                if (this.f8778a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f8778a = displayMetrics.density;
                }
            }
        }
        return Math.round(i10 / this.f8778a);
    }
}
