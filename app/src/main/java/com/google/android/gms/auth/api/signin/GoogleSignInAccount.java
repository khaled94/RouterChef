package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.m;
import e4.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new w3.a();
    public String A;
    public List<Scope> B;
    public String C;
    public String D;
    public Set<Scope> E = new HashSet();

    /* renamed from: s */
    public final int f2917s;

    /* renamed from: t */
    public String f2918t;

    /* renamed from: u */
    public String f2919u;

    /* renamed from: v */
    public String f2920v;

    /* renamed from: w */
    public String f2921w;

    /* renamed from: x */
    public Uri f2922x;
    public String y;

    /* renamed from: z */
    public long f2923z;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, List<Scope> list, String str7, String str8) {
        this.f2917s = i10;
        this.f2918t = str;
        this.f2919u = str2;
        this.f2920v = str3;
        this.f2921w = str4;
        this.f2922x = uri;
        this.y = str5;
        this.f2923z = j3;
        this.A = str6;
        this.B = list;
        this.C = str7;
        this.D = str8;
    }

    public static GoogleSignInAccount t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        m.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.A.equals(this.A) && googleSignInAccount.s().equals(s());
    }

    public final int hashCode() {
        return s().hashCode() + androidx.fragment.app.a.a(this.A, 527, 31);
    }

    public final Set<Scope> s() {
        HashSet hashSet = new HashSet(this.B);
        hashSet.addAll(this.E);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f2917s);
        m2.a.l(parcel, 2, this.f2918t);
        m2.a.l(parcel, 3, this.f2919u);
        m2.a.l(parcel, 4, this.f2920v);
        m2.a.l(parcel, 5, this.f2921w);
        m2.a.k(parcel, 6, this.f2922x, i10);
        m2.a.l(parcel, 7, this.y);
        m2.a.j(parcel, 8, this.f2923z);
        m2.a.l(parcel, 9, this.A);
        m2.a.p(parcel, 10, this.B);
        m2.a.l(parcel, 11, this.C);
        m2.a.l(parcel, 12, this.D);
        m2.a.u(parcel, q10);
    }
}
