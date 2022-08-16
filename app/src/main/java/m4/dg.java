package m4;

import android.net.Uri;
import androidx.fragment.app.b1;
import java.util.Arrays;
import n9.d;

/* loaded from: classes.dex */
public final class dg {

    /* renamed from: a */
    public final Uri f7364a;

    /* renamed from: b */
    public final long f7365b;

    /* renamed from: c */
    public final long f7366c;

    /* renamed from: d */
    public final long f7367d;

    public dg(Uri uri, long j3, long j10, long j11) {
        boolean z10 = false;
        d.g(j3 >= 0);
        d.g(j10 >= 0);
        d.g((j11 > 0 || j11 == -1) ? true : z10);
        this.f7364a = uri;
        this.f7365b = j3;
        this.f7366c = j10;
        this.f7367d = j11;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7364a);
        String arrays = Arrays.toString((byte[]) null);
        long j3 = this.f7365b;
        long j10 = this.f7366c;
        long j11 = this.f7367d;
        StringBuilder sb = new StringBuilder(androidx.appcompat.widget.d.a(valueOf.length(), 93, String.valueOf(arrays).length(), 4));
        b1.b(sb, "DataSpec[", valueOf, ", ", arrays);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(j11);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
