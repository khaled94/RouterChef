package m4;

import android.os.Parcel;
import android.os.Parcelable;
import d4.l;
import e4.a;
import java.util.Arrays;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class k60 extends a {
    public static final Parcelable.Creator<k60> CREATOR = new l60();

    /* renamed from: s */
    public final String f10283s;

    /* renamed from: t */
    public final int f10284t;

    public k60(String str, int i10) {
        this.f10283s = str;
        this.f10284t = i10;
    }

    public static k60 s(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new k60(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k60)) {
            k60 k60Var = (k60) obj;
            if (l.a(this.f10283s, k60Var.f10283s) && l.a(Integer.valueOf(this.f10284t), Integer.valueOf(k60Var.f10284t))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10283s, Integer.valueOf(this.f10284t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f10283s);
        m2.a.g(parcel, 3, this.f10284t);
        m2.a.u(parcel, q10);
    }
}
