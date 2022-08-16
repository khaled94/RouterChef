package n3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.a;
import b0.i;
import c0.a;
import com.raouf.routerchef.R;
import h3.l;
import h4.f;
import j4.c;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import m4.b01;
import m4.cm1;
import m4.em1;
import m4.es;
import m4.g90;
import m4.io;
import m4.jo;
import m4.k90;
import m4.md0;
import m4.ne0;
import m4.wd2;
import m4.xs;
import m4.yr;
import m4.z50;
import n9.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: i */
    public static final h1 f16555i = new h1(Looper.getMainLooper());
    @GuardedBy("AdUtil.class")

    /* renamed from: j */
    public static boolean f16556j = false;
    @GuardedBy("userAgentLock")

    /* renamed from: e */
    public String f16561e;

    /* renamed from: a */
    public final AtomicReference<Pattern> f16557a = new AtomicReference<>(null);

    /* renamed from: b */
    public final AtomicReference<Pattern> f16558b = new AtomicReference<>(null);

    /* renamed from: c */
    public boolean f16559c = true;

    /* renamed from: d */
    public final Object f16560d = new Object();

    /* renamed from: f */
    public boolean f16562f = false;

    /* renamed from: g */
    public boolean f16563g = false;

    /* renamed from: h */
    public final ExecutorService f16564h = Executors.newSingleThreadExecutor();

    public static boolean C(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean J(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.s1.J(android.view.View):boolean");
    }

    @TargetApi(18)
    public static final void K(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String L(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return y(x(context));
    }

    public static final String M() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String N() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return a.b(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final DisplayMetrics O(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final long a(View view) {
        float f10;
        int i10;
        float f11 = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            f10 = 0.0f;
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f11 = Math.min(f11, view2.getAlpha());
            i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i10 > 0);
        if (f11 >= 0.0f) {
            f10 = f11;
        }
        return Math.round(f10 * 100.0f);
    }

    public static final int b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (f.c()) {
            if (((Boolean) jo.f10145d.f10148c.a(es.D5)).booleanValue()) {
                return 0;
            }
        }
        return telephonyManager.getNetworkType();
    }

    public static final String c() {
        Resources a10 = s.B.f5793g.a();
        return a10 != null ? a10.getString(R.string.f21097s7) : "Test Ad";
    }

    public static final r0 d(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                g1.g("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new p0(iBinder);
        } catch (Exception e10) {
            s.B.f5793g.g(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean e(Context context, String str) {
        Context a10 = z50.a(context);
        return c.a(a10).a(str, a10.getPackageName()) == 0;
    }

    public static final boolean f(String str) {
        if (!k90.d()) {
            return false;
        }
        yr<Boolean> yrVar = es.f8068c3;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) joVar.f10148c.a(es.f8083e3);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) jo.f10145d.f10148c.a(es.f8076d3);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            g1.h("Error loading class.", th);
            s.B.f5793g.g(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean h(Context context) {
        boolean z10;
        if (f.a()) {
            if (((Boolean) jo.f10145d.f10148c.a(es.B5)).booleanValue()) {
                synchronized (s1.class) {
                    z10 = f16556j;
                }
                return z10;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean i(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean j(Context context) {
        Bundle x10 = x(context);
        return TextUtils.isEmpty(y(x10)) && !TextUtils.isEmpty(x10.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean k(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void l(View view, int i10) {
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        cm1 t10;
        em1 T;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof b01) {
                view2 = ((b01) view2).getChildAt(0);
            }
            if ((view2 instanceof l) || (view2 instanceof e)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i12 = rect.width();
                i13 = rect.height();
            } else {
                i13 = 0;
                i12 = 0;
            }
            s1 s1Var = s.B.f5789c;
            long a10 = a(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof ne0) || (T = ((ne0) view2).T()) == null) {
                str2 = str3;
            } else {
                str2 = T.f8004b;
                int hashCode = view2.hashCode();
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                sb.append(str2);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if ((view2 instanceof md0) && (t10 = ((md0) view2).t()) != null) {
                str = cm1.a(t10.f7034b);
                i11 = t10.f7042f;
                str3 = t10.F;
            }
            g1.i(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i12), Integer.valueOf(i13), Long.valueOf(a10), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            g1.h("Failure getting view location.", e10);
        }
    }

    public static final void m(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new w0(context, str, (String) it.next()).b();
        }
    }

    public static final void n(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            g1.j("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map<String, String> p(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse q(HttpURLConnection httpURLConnection) {
        s1 s1Var = s.B.f5789c;
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? str : contentType.split(";")[0].trim();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    if (split[i10].trim().startsWith("charset")) {
                        String[] split2 = split[i10].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i10++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        x1 x1Var = s.B.f5791e;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        InputStream inputStream = httpURLConnection.getInputStream();
        Objects.requireNonNull(x1Var);
        return new WebResourceResponse(trim, str2, responseCode, responseMessage, hashMap, inputStream);
    }

    public static final int[] r(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] s(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(16908290)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        io ioVar = io.f9708f;
        return new int[]{ioVar.f9709a.a(activity, iArr[0]), ioVar.f9709a.a(activity, iArr[1])};
    }

    public static final boolean t(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = s.B.f5789c.f16559c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || J(view);
        long a10 = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            yr<Boolean> yrVar = es.P0;
            jo joVar = jo.f10145d;
            if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) joVar.f10148c.a(es.f8195s6)).booleanValue()) {
                    return true;
                }
                if (a10 >= ((Integer) joVar.f10148c.a(es.f8211u6)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @TargetApi(18)
    public static final void u(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            K(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            g1.e(sb.toString());
        } catch (ActivityNotFoundException e10) {
            g1.h("No browser is found.", e10);
        }
    }

    public static final int[] v(Activity activity) {
        int[] r10 = r(activity);
        io ioVar = io.f9708f;
        return new int[]{ioVar.f9709a.a(activity, r10[0]), ioVar.f9709a.a(activity, r10[1])};
    }

    public static int w(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i10);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        g1.j(sb.toString());
        return 60000;
    }

    public static Bundle x(Context context) {
        try {
            return c.a(context).b(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            g1.b("Error getting metadata", e10);
            return null;
        }
    }

    public static String y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public final void A(JSONArray jSONArray, Object obj) {
        Object obj2;
        if (obj instanceof Bundle) {
            obj2 = E((Bundle) obj);
        } else if (obj instanceof Map) {
            obj2 = F((Map) obj);
        } else if (!(obj instanceof Collection)) {
            if (!(obj instanceof Object[])) {
                jSONArray.put(obj);
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj3 : (Object[]) obj) {
                A(jSONArray2, obj3);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            obj2 = z((Collection) obj);
        }
        jSONArray.put(obj2);
    }

    public final void B(JSONObject jSONObject, String str, Object obj) {
        Object obj2;
        Collection<?> collection;
        if (obj instanceof Bundle) {
            obj2 = E((Bundle) obj);
        } else if (obj instanceof Map) {
            obj2 = F((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                collection = (Collection) obj;
            } else if (!(obj instanceof Object[])) {
                jSONObject.put(str, obj);
                return;
            } else {
                collection = Arrays.asList((Object[]) obj);
            }
            obj2 = z(collection);
        }
        jSONObject.put(str, obj2);
    }

    public final String D(Context context, String str) {
        synchronized (this.f16560d) {
            String str2 = this.f16561e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return M();
            }
            try {
                this.f16561e = s.B.f5791e.e(context);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.f16561e)) {
                g90 g90Var = io.f9708f.f9709a;
                if (!g90.g()) {
                    this.f16561e = null;
                    f16555i.post(new n1(this, context, 0));
                    while (this.f16561e == null) {
                        try {
                            this.f16560d.wait();
                        } catch (InterruptedException unused2) {
                            String M = M();
                            this.f16561e = M;
                            String valueOf = String.valueOf(M);
                            g1.j(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                        }
                    }
                } else {
                    this.f16561e = new WebView(context).getSettings().getUserAgentString();
                }
            }
            String valueOf2 = String.valueOf(this.f16561e);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 10 + str.length());
            sb.append(valueOf2);
            sb.append(" (Mobile; ");
            sb.append(str);
            this.f16561e = sb.toString();
            try {
                if (c.a(context).e()) {
                    this.f16561e = String.valueOf(this.f16561e).concat(";aia");
                }
            } catch (Exception e10) {
                s.B.f5793g.g(e10, "AdUtil.getUserAgent");
            }
            String concat = String.valueOf(this.f16561e).concat(")");
            this.f16561e = concat;
            return concat;
        }
    }

    public final JSONObject E(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            B(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject F(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                B(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final void G(Context context, String str, HttpURLConnection httpURLConnection, int i10) {
        int w10 = w(i10);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(w10);
        sb.append(" milliseconds.");
        g1.i(sb.toString());
        httpURLConnection.setConnectTimeout(w10);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(w10);
        httpURLConnection.setRequestProperty("User-Agent", D(context, str));
        httpURLConnection.setUseCaches(false);
    }

    @TargetApi(26)
    public final void H(Context context) {
        if (!f.a()) {
            return;
        }
        if (!((Boolean) jo.f10145d.f10148c.a(es.B5)).booleanValue()) {
            return;
        }
        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new p1());
    }

    @TargetApi(18)
    public final int I(Context context, Uri uri) {
        int i10;
        String c10;
        if (context == null) {
            g1.a("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            g1.a("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        } else {
            i10 = 0;
        }
        yr<Boolean> yrVar = es.I2;
        jo joVar = jo.f10145d;
        yr<Boolean> yrVar2 = es.J2;
        if (true == ((Boolean) joVar.f10148c.a(yrVar)).equals(joVar.f10148c.a(yrVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            xs xsVar = new xs();
            xsVar.f15460d = new m1(xsVar, context, uri);
            Activity activity = (Activity) context;
            if (xsVar.f15458b == null && (c10 = d.c(activity)) != null) {
                wd2 wd2Var = new wd2(xsVar);
                xsVar.f15459c = wd2Var;
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(c10)) {
                    intent2.setPackage(c10);
                }
                activity.bindService(intent2, wd2Var, 33);
            }
        }
        if (!((Boolean) joVar.f10148c.a(yrVar2)).booleanValue()) {
            return 5;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        i.b(bundle, "android.support.customtabs.extra.SESSION", null);
        intent3.putExtras(bundle);
        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent3.setPackage(d.c(context));
        intent3.setData(uri);
        Object obj = c0.a.f2602a;
        a.C0037a.b(context, intent3, null);
        return 5;
    }

    public final JSONArray z(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            A(jSONArray, it.next());
        }
        return jSONArray;
    }
}
