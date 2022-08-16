package m7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final SharedPreferences f16389a;

    public k(Context context, String str) {
        this.f16389a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j3 = this.f16389a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f16389a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f16389a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f16389a.edit().putStringSet(str2, hashSet).putLong("fire-count", j3 - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.f16389a.edit();
        for (Map.Entry<String, ?> entry : this.f16389a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    public final synchronized List<l> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f16389a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(new a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f16389a.edit().putLong("fire-global", currentTimeMillis).commit();
        }
        return arrayList;
        return arrayList;
    }

    public final synchronized String d(long j3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j3).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f16389a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        String e10 = e(str);
        if (e10 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f16389a.getStringSet(e10, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f16389a.edit().remove(e10) : this.f16389a.edit().putStringSet(e10, hashSet)).commit();
    }

    public final synchronized boolean g(long j3) {
        if (this.f16389a.contains("fire-global")) {
            long j10 = this.f16389a.getLong("fire-global", -1L);
            synchronized (this) {
                if (d(j10).equals(d(j3))) {
                    return false;
                }
                this.f16389a.edit().putLong("fire-global", j3).commit();
                return true;
            }
        }
        this.f16389a.edit().putLong("fire-global", j3).commit();
        return true;
    }

    public final synchronized void h(long j3, String str) {
        String d5 = d(j3);
        if (this.f16389a.getString("last-used-date", "").equals(d5)) {
            return;
        }
        long j10 = this.f16389a.getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = this.f16389a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f16389a.getStringSet(str, new HashSet()));
        hashSet.add(d5);
        this.f16389a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", d5).commit();
    }
}
