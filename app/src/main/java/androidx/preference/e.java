package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final Context f1842a;

    /* renamed from: b */
    public long f1843b = 0;

    /* renamed from: c */
    public SharedPreferences f1844c = null;

    /* renamed from: d */
    public SharedPreferences.Editor f1845d;

    /* renamed from: e */
    public boolean f1846e;

    /* renamed from: f */
    public String f1847f;

    /* renamed from: g */
    public PreferenceScreen f1848g;

    /* renamed from: h */
    public c f1849h;

    /* renamed from: i */
    public a f1850i;

    /* renamed from: j */
    public b f1851j;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public e(Context context) {
        this.f1842a = context;
        this.f1847f = b(context);
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(b(context), 0);
    }

    public static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor c() {
        if (this.f1846e) {
            if (this.f1845d == null) {
                this.f1845d = d().edit();
            }
            return this.f1845d;
        }
        return d().edit();
    }

    public final SharedPreferences d() {
        if (this.f1844c == null) {
            this.f1844c = this.f1842a.getSharedPreferences(this.f1847f, 0);
        }
        return this.f1844c;
    }
}
