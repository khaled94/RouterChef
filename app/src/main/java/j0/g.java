package j0;

import android.util.Base64;
import androidx.activity.result.a;
import java.util.List;
import java.util.Objects;
import s.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final String f5393a;

    /* renamed from: b */
    public final String f5394b;

    /* renamed from: c */
    public final String f5395c;

    /* renamed from: d */
    public final List<List<byte[]>> f5396d;

    /* renamed from: e */
    public final String f5397e;

    public g(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f5393a = str;
        Objects.requireNonNull(str2);
        this.f5394b = str2;
        this.f5395c = str3;
        Objects.requireNonNull(list);
        this.f5396d = list;
        this.f5397e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder c10 = a.c("FontRequest {mProviderAuthority: ");
        c10.append(this.f5393a);
        c10.append(", mProviderPackage: ");
        c10.append(this.f5394b);
        c10.append(", mQuery: ");
        c10.append(this.f5395c);
        c10.append(", mCertificates:");
        sb.append(c10.toString());
        for (int i10 = 0; i10 < this.f5396d.size(); i10++) {
            sb.append(" [");
            List<byte[]> list = this.f5396d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return b.b(sb, "}", "mCertificatesArray: 0");
    }
}
