package s6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final char[] f18247a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f18248b = -1;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        X86_32,
        /* JADX INFO: Fake field, exist only in values array */
        X86_64,
        /* JADX INFO: Fake field, exist only in values array */
        ARM_UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        PPC,
        /* JADX INFO: Fake field, exist only in values array */
        PPC64,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV6,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7,
        UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7S,
        /* JADX INFO: Fake field, exist only in values array */
        ARM64;
        

        /* renamed from: t */
        public static final Map<String, a> f18250t;

        static {
            a aVar;
            a aVar2;
            a aVar3;
            a aVar4;
            HashMap hashMap = new HashMap(4);
            f18250t = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static long b(String str, String str2, int i10) {
        return Long.parseLong(str.split(str2)[0].trim()) * i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        r3 = r4[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.io.File r7) {
        /*
            java.lang.String r0 = "MemTotal"
            java.lang.String r1 = "Failed to close system file reader."
            boolean r2 = r7.exists()
            r3 = 0
            if (r2 == 0) goto L5f
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r5 = 1024(0x400, float:1.435E-42)
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
        L17:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            if (r4 == 0) goto L55
            java.lang.String r5 = "\\s*:\\s*"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            r6 = 2
            java.lang.String[] r4 = r5.split(r4, r6)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            int r5 = r4.length     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            r6 = 1
            if (r5 <= r6) goto L17
            r5 = 0
            r5 = r4[r5]     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            if (r5 == 0) goto L17
            r7 = r4[r6]     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L59
            r3 = r7
            goto L55
        L39:
            r0 = move-exception
            goto L3f
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r0 = move-exception
            r2 = r3
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.e(r4, r7, r0)     // Catch: java.lang.Throwable -> L59
        L55:
            a(r2, r1)
            goto L5f
        L59:
            r7 = move-exception
            r3 = r2
        L5b:
            a(r3, r1)
            throw r7
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.e.c(java.io.File):java.lang.String");
    }

    public static boolean d(Context context, String str) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return true;
        }
        int g10 = g(context, str, "bool");
        if (g10 > 0) {
            return resources.getBoolean(g10);
        }
        int g11 = g(context, str, "string");
        if (g11 <= 0) {
            return true;
        }
        return Boolean.parseBoolean(context.getString(g11));
    }

    public static int e(Context context) {
        boolean k10 = k(context);
        if (l(context)) {
            k10 = (k10 ? 1 : 0) | true;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return (k10 ? 1 : 0) | 4;
        }
        int i10 = k10 ? 1 : 0;
        int i11 = k10 ? 1 : 0;
        return i10;
    }

    public static String f(Context context) {
        int g10 = g(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (g10 == 0) {
            g10 = g(context, "com.crashlytics.android.build_id", "string");
        }
        if (g10 != 0) {
            return context.getResources().getString(g10);
        }
        return null;
    }

    public static int g(Context context, String str, String str2) {
        String resourcePackageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                resourcePackageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(resourcePackageName)) {
                    resourcePackageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
            }
            return resources.getIdentifier(str, str2, resourcePackageName);
        }
        resourcePackageName = context.getPackageName();
        return resources.getIdentifier(str, str2, resourcePackageName);
    }

    public static SharedPreferences h(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long i() {
        long j3;
        synchronized (e.class) {
            if (f18248b == -1) {
                long j10 = 0;
                String c10 = c(new File("/proc/meminfo"));
                if (!TextUtils.isEmpty(c10)) {
                    String upperCase = c10.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j10 = b(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j10 = b(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j10 = b(upperCase, "GB", 1073741824);
                        } else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, null);
                        }
                    } catch (NumberFormatException e10) {
                        Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                }
                f18248b = j10;
            }
            j3 = f18248b;
        }
        return j3;
    }

    public static String j(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f18247a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static boolean k(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu") && string != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(Context context) {
        boolean k10 = k(context);
        String str = Build.TAGS;
        if ((k10 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !k10 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String m(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return j(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    public static String n(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }
}
