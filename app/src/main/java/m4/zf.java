package m4;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import n9.d;

/* loaded from: classes.dex */
public final class zf implements bg {

    /* renamed from: a */
    public final byte[] f16183a;

    /* renamed from: b */
    public Uri f16184b;

    /* renamed from: c */
    public int f16185c;

    /* renamed from: d */
    public int f16186d;

    public zf(byte[] bArr) {
        Objects.requireNonNull(bArr);
        d.g(bArr.length > 0);
        this.f16183a = bArr;
    }

    @Override // m4.bg
    public final Uri c() {
        return this.f16184b;
    }

    @Override // m4.bg
    public final int e(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f16186d;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.f16183a, this.f16185c, bArr, i10, min);
        this.f16185c += min;
        this.f16186d -= min;
        return min;
    }

    @Override // m4.bg
    public final long f(dg dgVar) {
        this.f16184b = dgVar.f7364a;
        long j3 = dgVar.f7366c;
        int i10 = (int) j3;
        this.f16185c = i10;
        long j10 = dgVar.f7367d;
        int length = (int) (j10 == -1 ? this.f16183a.length - j3 : j10);
        this.f16186d = length;
        if (length <= 0 || i10 + length > this.f16183a.length) {
            int length2 = this.f16183a.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Unsatisfiable range: [");
            sb.append(i10);
            sb.append(", ");
            sb.append(j10);
            sb.append("], length: ");
            sb.append(length2);
            throw new IOException(sb.toString());
        }
        return length;
    }

    @Override // m4.bg
    public final void g() {
        this.f16184b = null;
    }
}
