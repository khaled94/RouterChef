package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a */
    public final String f2895a;

    /* renamed from: b */
    public final String f2896b;

    /* renamed from: c */
    public final JSONObject f2897c;

    public Purchase(String str, String str2) {
        this.f2895a = str;
        this.f2896b = str2;
        this.f2897c = new JSONObject(str);
    }

    public final String a() {
        JSONObject jSONObject = this.f2897c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f2895a, purchase.f2895a) && TextUtils.equals(this.f2896b, purchase.f2896b);
    }

    public final int hashCode() {
        return this.f2895a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f2895a));
    }
}
