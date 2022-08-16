package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public final class SkuDetails {

    /* renamed from: a */
    public final String f2898a;

    /* renamed from: b */
    public final JSONObject f2899b;

    public SkuDetails(String str) {
        this.f2898a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f2899b = jSONObject;
        if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
            if (TextUtils.isEmpty(jSONObject.optString("type"))) {
                throw new IllegalArgumentException("SkuType cannot be empty.");
            }
            return;
        }
        throw new IllegalArgumentException("SKU cannot be empty.");
    }

    public final String a() {
        return this.f2899b.optString("productId");
    }

    public final String b() {
        return this.f2899b.optString("type");
    }

    public final String c() {
        return this.f2899b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f2898a, ((SkuDetails) obj).f2898a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2898a.hashCode();
    }

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f2898a));
    }
}
