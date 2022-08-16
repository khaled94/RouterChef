package s6;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import h2.a;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p7.f;

/* loaded from: classes.dex */
public final class d0 implements e0 {

    /* renamed from: g */
    public static final Pattern f18239g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f18240h = Pattern.quote("/");

    /* renamed from: a */
    public final a f18241a;

    /* renamed from: b */
    public final Context f18242b;

    /* renamed from: c */
    public final String f18243c;

    /* renamed from: d */
    public final f f18244d;

    /* renamed from: e */
    public final z f18245e;

    /* renamed from: f */
    public String f18246f;

    public d0(Context context, String str, f fVar, z zVar) {
        if (str != null) {
            this.f18242b = context;
            this.f18243c = str;
            this.f18244d = fVar;
            this.f18245e = zVar;
            this.f18241a = new a();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        StringBuilder c10 = androidx.activity.result.a.c("SYN_");
        c10.append(UUID.randomUUID().toString());
        return c10.toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f18239g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String a10;
        String str;
        String str2 = this.f18246f;
        if (str2 != null) {
            return str2;
        }
        boolean z10 = false;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        SharedPreferences h10 = e.h(this.f18242b);
        String string = h10.getString("firebase.installation.id", null);
        String str3 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str3, null);
        }
        if (this.f18245e.a()) {
            try {
                str = (String) l0.a(this.f18244d.getId());
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e10);
                str = null;
            }
            String str4 = "Fetched Firebase Installation ID: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str4, null);
            }
            if (str == null) {
                str = string == null ? b() : string;
            }
            a10 = str.equals(string) ? h10.getString("crashlytics.installation.id", null) : a(str, h10);
        } else {
            if (string != null && string.startsWith("SYN_")) {
                a10 = h10.getString("crashlytics.installation.id", null);
            } else {
                a10 = a(b(), h10);
            }
        }
        this.f18246f = a10;
        if (this.f18246f == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f18246f = a(b(), h10);
        }
        String str5 = "Crashlytics installation ID: " + this.f18246f;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            z10 = true;
        }
        if (z10) {
            Log.v("FirebaseCrashlytics", str5, null);
        }
        return this.f18246f;
    }

    public final String d() {
        String str;
        a aVar = this.f18241a;
        Context context = this.f18242b;
        synchronized (aVar) {
            if (aVar.f4955s == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                aVar.f4955s = installerPackageName;
            }
            str = "".equals(aVar.f4955s) ? null : aVar.f4955s;
        }
        return str;
    }

    public final String e(String str) {
        return str.replaceAll(f18240h, "");
    }
}
