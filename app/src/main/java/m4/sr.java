package m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sr extends yr<Boolean> {
    public sr(int i10, String str, Boolean bool) {
        super(i10, str, bool);
    }

    @Override // m4.yr
    public final Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f15892b, ((Boolean) this.f15893c).booleanValue()));
    }

    @Override // m4.yr
    public final Boolean b(Bundle bundle) {
        String str = this.f15892b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.f15892b;
            return Boolean.valueOf(bundle.getBoolean(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Boolean) this.f15893c;
    }

    @Override // m4.yr
    public final Boolean c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f15892b, ((Boolean) this.f15893c).booleanValue()));
    }

    @Override // m4.yr
    public final void d(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(this.f15892b, bool.booleanValue());
    }
}
