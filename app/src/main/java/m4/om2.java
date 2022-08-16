package m4;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class om2 extends xo0 {

    /* renamed from: e */
    public gs0 f12216e;

    /* renamed from: f */
    public byte[] f12217f;

    /* renamed from: g */
    public int f12218g;

    /* renamed from: h */
    public int f12219h;

    public om2() {
        super(false);
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f12219h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f12217f;
        int i13 = ls1.f10971a;
        System.arraycopy(bArr2, this.f12218g, bArr, i10, min);
        this.f12218g += min;
        this.f12219h -= min;
        p(min);
        return min;
    }

    @Override // m4.kq0
    public final Uri h() {
        gs0 gs0Var = this.f12216e;
        if (gs0Var != null) {
            return gs0Var.f9017a;
        }
        return null;
    }

    @Override // m4.kq0
    public final void i() {
        if (this.f12217f != null) {
            this.f12217f = null;
            q();
        }
        this.f12216e = null;
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        r(gs0Var);
        this.f12216e = gs0Var;
        Uri uri = gs0Var.f9017a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        r01.g(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = ls1.f10971a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f12217f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    String valueOf2 = String.valueOf(str);
                    throw new mq(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e10, true, 0);
                }
            } else {
                this.f12217f = ls1.j(URLDecoder.decode(str, bu1.f6616a.name()));
            }
            long j3 = gs0Var.f9020d;
            int length = this.f12217f.length;
            if (j3 > length) {
                this.f12217f = null;
                throw new mq0(2008);
            }
            int i11 = (int) j3;
            this.f12218g = i11;
            int i12 = length - i11;
            this.f12219h = i12;
            long j10 = gs0Var.f9021e;
            if (j10 != -1) {
                this.f12219h = (int) Math.min(i12, j10);
            }
            s(gs0Var);
            long j11 = gs0Var.f9021e;
            return j11 != -1 ? j11 : this.f12219h;
        }
        throw new mq("Unexpected URI format: ".concat(String.valueOf(uri)), null, true, 0);
    }
}
