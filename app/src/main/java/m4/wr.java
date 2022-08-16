package m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wr extends yr<String> {
    public wr(String str, String str2) {
        super(1, str, str2);
    }

    @Override // m4.yr
    public final String a(JSONObject jSONObject) {
        return jSONObject.optString(this.f15892b, (String) this.f15893c);
    }

    @Override // m4.yr
    public final String b(Bundle bundle) {
        String str = this.f15892b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.f15892b;
            return bundle.getString(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag."));
        }
        return (String) this.f15893c;
    }

    @Override // m4.yr
    public final String c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f15892b, (String) this.f15893c);
    }

    @Override // m4.yr
    public final void d(SharedPreferences.Editor editor, String str) {
        editor.putString(this.f15892b, str);
    }
}
