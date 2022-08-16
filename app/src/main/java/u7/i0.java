package u7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final SharedPreferences f19510a;

    /* renamed from: e */
    public final Executor f19514e;

    /* renamed from: d */
    public final ArrayDeque<String> f19513d = new ArrayDeque<>();

    /* renamed from: b */
    public final String f19511b = "topic_operation_queue";

    /* renamed from: c */
    public final String f19512c = ",";

    public i0(SharedPreferences sharedPreferences, Executor executor) {
        this.f19510a = sharedPreferences;
        this.f19514e = executor;
    }

    public static i0 a(SharedPreferences sharedPreferences, Executor executor) {
        i0 i0Var = new i0(sharedPreferences, executor);
        synchronized (i0Var.f19513d) {
            i0Var.f19513d.clear();
            String string = i0Var.f19510a.getString(i0Var.f19511b, "");
            if (!TextUtils.isEmpty(string) && string.contains(i0Var.f19512c)) {
                String[] split = string.split(i0Var.f19512c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        i0Var.f19513d.add(str);
                    }
                }
            }
        }
        return i0Var;
    }
}
