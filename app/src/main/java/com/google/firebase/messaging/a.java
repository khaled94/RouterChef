package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import c0.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l0.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final SharedPreferences f3484a;

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    public static class C0052a {

        /* renamed from: d */
        public static final long f3485d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f3486a;

        /* renamed from: b */
        public final String f3487b;

        /* renamed from: c */
        public final long f3488c;

        public C0052a(String str, String str2, long j3) {
            this.f3486a = str;
            this.f3487b = str2;
            this.f3488c = j3;
        }

        public static String a(String str, String str2, long j3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j3);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static C0052a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0052a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0052a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
    }

    public a(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3484a = sharedPreferences;
        Object obj = c0.a.f2602a;
        File file = new File(a.b.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile()) {
                return;
            }
            synchronized (this) {
                isEmpty = sharedPreferences.getAll().isEmpty();
            }
            if (isEmpty) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            synchronized (this) {
                sharedPreferences.edit().clear().commit();
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return;
            }
            StringBuilder c10 = androidx.activity.result.a.c("Error creating file in no backup dir: ");
            c10.append(e10.getMessage());
            Log.d("FirebaseMessaging", c10.toString());
        }
    }

    public final String a(String str, String str2) {
        return d.b(str, "|T|", str2, "|", "*");
    }
}
