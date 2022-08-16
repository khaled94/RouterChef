package m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vr extends yr<Float> {
    public vr(String str, Float f10) {
        super(1, str, f10);
    }

    @Override // m4.yr
    public final Float a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f15892b, ((Float) this.f15893c).floatValue()));
    }

    @Override // m4.yr
    public final Float b(Bundle bundle) {
        String str = this.f15892b;
        if (bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            String str2 = this.f15892b;
            return Float.valueOf(bundle.getFloat(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
        }
        return (Float) this.f15893c;
    }

    @Override // m4.yr
    public final Float c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f15892b, ((Float) this.f15893c).floatValue()));
    }

    @Override // m4.yr
    public final void d(SharedPreferences.Editor editor, Float f10) {
        editor.putFloat(this.f15892b, f10.floatValue());
    }
}
