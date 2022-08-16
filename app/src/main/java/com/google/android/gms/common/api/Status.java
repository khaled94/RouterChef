package com.google.android.gms.common.api;

import a4.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.k;
import b4.h;
import b4.l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.l;
import e4.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements h, ReflectedParcelable {

    /* renamed from: s */
    public final int f2929s;

    /* renamed from: t */
    public final int f2930t;

    /* renamed from: u */
    public final String f2931u;

    /* renamed from: v */
    public final PendingIntent f2932v;

    /* renamed from: w */
    public final b f2933w;

    /* renamed from: x */
    public static final Status f2927x = new Status(0, null);
    public static final Status y = new Status(15, null);

    /* renamed from: z */
    public static final Status f2928z = new Status(16, null);
    public static final Parcelable.Creator<Status> CREATOR = new l();

    static {
        new Status(14, null);
        new Status(8, null);
        new Status(17, null);
        new Status(18, null);
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f2929s = i10;
        this.f2930t = i11;
        this.f2931u = str;
        this.f2932v = pendingIntent;
        this.f2933w = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2929s == status.f2929s && this.f2930t == status.f2930t && d4.l.a(this.f2931u, status.f2931u) && d4.l.a(this.f2932v, status.f2932v) && d4.l.a(this.f2933w, status.f2933w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2929s), Integer.valueOf(this.f2930t), this.f2931u, this.f2932v, this.f2933w});
    }

    @Override // b4.h
    public final Status m() {
        return this;
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        String str = this.f2931u;
        if (str == null) {
            int i10 = this.f2930t;
            switch (i10) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = k.a(32, "unknown status code: ", i10);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a("statusCode", str);
        aVar.a("resolution", this.f2932v);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f2930t);
        m2.a.l(parcel, 2, this.f2931u);
        m2.a.k(parcel, 3, this.f2932v, i10);
        m2.a.k(parcel, 4, this.f2933w, i10);
        m2.a.g(parcel, 1000, this.f2929s);
        m2.a.u(parcel, q10);
    }
}
