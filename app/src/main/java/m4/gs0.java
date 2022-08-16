package m4;

import android.net.Uri;
import androidx.fragment.app.b1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class gs0 {

    /* renamed from: a */
    public final Uri f9017a;

    /* renamed from: b */
    public final Map<String, String> f9018b;
    @Deprecated

    /* renamed from: c */
    public final long f9019c;

    /* renamed from: d */
    public final long f9020d;

    /* renamed from: e */
    public final long f9021e;

    /* renamed from: f */
    public final int f9022f;

    @Deprecated
    public gs0(Uri uri, long j3, long j10, long j11, int i10) {
        this(uri, j3 - j10, Collections.emptyMap(), j10, j11, i10);
    }

    public gs0(Uri uri, long j3, Map map, long j10, long j11, int i10) {
        long j12 = j3 + j10;
        boolean z10 = false;
        r01.f(j12 >= 0);
        r01.f(j10 >= 0);
        r01.f((j11 > 0 || j11 == -1) ? true : z10);
        this.f9017a = uri;
        this.f9018b = Collections.unmodifiableMap(new HashMap(map));
        this.f9020d = j10;
        this.f9019c = j12;
        this.f9021e = j11;
        this.f9022f = i10;
    }

    public final boolean a(int i10) {
        return (this.f9022f & i10) == i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9017a);
        long j3 = this.f9020d;
        long j10 = this.f9021e;
        int i10 = this.f9022f;
        StringBuilder sb = new StringBuilder(valueOf.length() + 73 + 4);
        b1.b(sb, "DataSpec[", "GET", " ", valueOf);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j10);
        sb.append(", null, ");
        sb.append(i10);
        sb.append("]");
        return sb.toString();
    }
}
