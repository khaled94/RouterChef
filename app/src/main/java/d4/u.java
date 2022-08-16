package d4;

import a4.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.raouf.routerchef.R;
import h4.d;
import i0.f;
import i0.i;
import j4.c;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import r.g;

/* loaded from: classes.dex */
public final class u {
    @GuardedBy("sCache")

    /* renamed from: a */
    public static final g<String, String> f3919a = new g<>();
    @GuardedBy("sCache")

    /* renamed from: b */
    public static Locale f3920b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 == 2) {
                return d.c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a10);
            } else if (i10 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, a10);
            } else {
                if (i10 == 5) {
                    return d(context, "common_google_play_services_invalid_account_text", a10);
                }
                if (i10 == 7) {
                    return d(context, "common_google_play_services_network_error_text", a10);
                }
                if (i10 == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, a10);
                }
                if (i10 == 20) {
                    return d(context, "common_google_play_services_restricted_profile_text", a10);
                }
                switch (i10) {
                    case 16:
                        return d(context, "common_google_play_services_api_unavailable_text", a10);
                    case 17:
                        return d(context, "common_google_play_services_sign_in_failed_text", a10);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, a10);
                    default:
                        return resources.getString(R.string.common_google_play_services_unknown_issue, a10);
                }
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, a10);
    }

    public static String c(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i10);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        g<String, String> gVar = f3919a;
        synchronized (gVar) {
            Configuration configuration = context.getResources().getConfiguration();
            Locale locale = (Build.VERSION.SDK_INT >= 24 ? new f(new i(i0.d.a(configuration))) : f.a(configuration.locale)).f5167a.get();
            if (!locale.equals(f3920b)) {
                gVar.clear();
                f3920b = locale;
            }
            String orDefault = gVar.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i10 = h.f138e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            f3919a.put(str, string);
            return string;
        }
    }
}
