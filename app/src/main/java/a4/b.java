package a4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import d4.l;
import e4.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: s */
    public final int f115s;

    /* renamed from: t */
    public final int f116t;

    /* renamed from: u */
    public final PendingIntent f117u;

    /* renamed from: v */
    public final String f118v;

    /* renamed from: w */
    public static final b f114w = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new m();

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f115s = i10;
        this.f116t = i11;
        this.f117u = pendingIntent;
        this.f118v = str;
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this.f115s = 1;
        this.f116t = i10;
        this.f117u = pendingIntent;
        this.f118v = str;
    }

    public static String u(int i10) {
        if (i10 != 99) {
            if (i10 == 1500) {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            switch (i10) {
                case -1:
                    return "UNKNOWN";
                case 0:
                    return "SUCCESS";
                case 1:
                    return "SERVICE_MISSING";
                case 2:
                    return "SERVICE_VERSION_UPDATE_REQUIRED";
                case 3:
                    return "SERVICE_DISABLED";
                case 4:
                    return "SIGN_IN_REQUIRED";
                case 5:
                    return "INVALID_ACCOUNT";
                case 6:
                    return "RESOLUTION_REQUIRED";
                case 7:
                    return "NETWORK_ERROR";
                case 8:
                    return "INTERNAL_ERROR";
                case 9:
                    return "SERVICE_INVALID";
                case 10:
                    return "DEVELOPER_ERROR";
                case 11:
                    return "LICENSE_CHECK_FAILED";
                default:
                    switch (i10) {
                        case 13:
                            return "CANCELED";
                        case 14:
                            return "TIMEOUT";
                        case 15:
                            return "INTERRUPTED";
                        case 16:
                            return "API_UNAVAILABLE";
                        case 17:
                            return "SIGN_IN_FAILED";
                        case 18:
                            return "SERVICE_UPDATING";
                        case 19:
                            return "SERVICE_MISSING_PERMISSION";
                        case 20:
                            return "RESTRICTED_PROFILE";
                        case 21:
                            return "API_VERSION_UPDATE_REQUIRED";
                        case 22:
                            return "RESOLUTION_ACTIVITY_NOT_FOUND";
                        case 23:
                            return "API_DISABLED";
                        case 24:
                            return "API_DISABLED_FOR_CONNECTION";
                        default:
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i10);
                            sb.append(")");
                            return sb.toString();
                    }
            }
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f116t == bVar.f116t && l.a(this.f117u, bVar.f117u) && l.a(this.f118v, bVar.f118v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f116t), this.f117u, this.f118v});
    }

    public final boolean s() {
        return (this.f116t == 0 || this.f117u == null) ? false : true;
    }

    public final boolean t() {
        return this.f116t == 0;
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a("statusCode", u(this.f116t));
        aVar.a("resolution", this.f117u);
        aVar.a("message", this.f118v);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f115s);
        m2.a.g(parcel, 2, this.f116t);
        m2.a.k(parcel, 3, this.f117u, i10);
        m2.a.l(parcel, 4, this.f118v);
        m2.a.u(parcel, q10);
    }
}
