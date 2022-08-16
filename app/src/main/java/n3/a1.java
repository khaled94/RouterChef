package n3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a1 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f16444a;

    /* renamed from: b */
    public final /* synthetic */ Context f16445b;

    public a1(Context context, Context context2) {
        this.f16444a = context;
        this.f16445b = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z10 = false;
        if (this.f16444a != null) {
            g1.a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f16444a.getSharedPreferences("admob_user_agent", 0);
        } else {
            g1.a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f16445b.getSharedPreferences("admob_user_agent", 0);
            z10 = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            g1.a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f16445b);
            if (z10) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                g1.a("Persisting user agent.");
            }
        }
        return string;
    }
}
