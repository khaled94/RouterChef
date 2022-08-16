package m4;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.List;
import n3.g1;

/* loaded from: classes.dex */
public final class kj extends a {
    public static final Parcelable.Creator<kj> CREATOR = new lj();
    public String A;
    public int B;

    /* renamed from: s */
    public final String f10442s;

    /* renamed from: t */
    public final long f10443t;

    /* renamed from: u */
    public final String f10444u;

    /* renamed from: v */
    public final String f10445v;

    /* renamed from: w */
    public final String f10446w;

    /* renamed from: x */
    public final Bundle f10447x;
    public final boolean y;

    /* renamed from: z */
    public long f10448z;

    public kj(String str, long j3, String str2, String str3, String str4, Bundle bundle, boolean z10, long j10, String str5, int i10) {
        this.f10442s = str;
        this.f10443t = j3;
        this.f10444u = str2 == null ? "" : str2;
        this.f10445v = str3 == null ? "" : str3;
        this.f10446w = str4 == null ? "" : str4;
        this.f10447x = bundle == null ? new Bundle() : bundle;
        this.y = z10;
        this.f10448z = j10;
        this.A = str5;
        this.B = i10;
    }

    public static kj s(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                g1.j(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new kj(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e10) {
            g1.k("Unable to parse Uri into cache offering.", e10);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f10442s);
        m2.a.j(parcel, 3, this.f10443t);
        m2.a.l(parcel, 4, this.f10444u);
        m2.a.l(parcel, 5, this.f10445v);
        m2.a.l(parcel, 6, this.f10446w);
        m2.a.b(parcel, 7, this.f10447x);
        m2.a.a(parcel, 8, this.y);
        m2.a.j(parcel, 9, this.f10448z);
        m2.a.l(parcel, 10, this.A);
        m2.a.g(parcel, 11, this.B);
        m2.a.u(parcel, q10);
    }
}
