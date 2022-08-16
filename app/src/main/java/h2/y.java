package h2;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    public final String f5046a;

    /* renamed from: b */
    public final String f5047b;

    public /* synthetic */ y(JSONObject jSONObject) {
        this.f5046a = jSONObject.optString("productId");
        this.f5047b = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f5046a.equals(yVar.f5046a) && this.f5047b.equals(yVar.f5047b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5046a, this.f5047b});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.f5046a, this.f5047b);
    }
}
