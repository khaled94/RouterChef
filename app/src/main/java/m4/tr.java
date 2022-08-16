package m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tr extends yr<Integer> {
    public tr(String str, Integer num) {
        super(1, str, num);
    }

    @Override // m4.yr
    public final Integer a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f15892b, ((Integer) this.f15893c).intValue()));
    }

    @Override // m4.yr
    public final Integer b(Bundle bundle) {
        String str = this.f15892b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.f15892b;
            return Integer.valueOf(bundle.getInt(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Integer) this.f15893c;
    }

    @Override // m4.yr
    public final Integer c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f15892b, ((Integer) this.f15893c).intValue()));
    }

    @Override // m4.yr
    public final void d(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(this.f15892b, num.intValue());
    }
}
