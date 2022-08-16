package m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ur extends yr<Long> {
    public ur(String str, Long l10) {
        super(1, str, l10);
    }

    @Override // m4.yr
    public final Long a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f15892b, ((Long) this.f15893c).longValue()));
    }

    @Override // m4.yr
    public final Long b(Bundle bundle) {
        String str = this.f15892b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.f15892b;
            return Long.valueOf(bundle.getLong(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Long) this.f15893c;
    }

    @Override // m4.yr
    public final Long c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f15892b, ((Long) this.f15893c).longValue()));
    }

    @Override // m4.yr
    public final void d(SharedPreferences.Editor editor, Long l10) {
        editor.putLong(this.f15892b, l10.longValue());
    }
}
