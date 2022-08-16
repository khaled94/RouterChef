package m4;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public final class km2 extends xo0 {

    /* renamed from: e */
    public final byte[] f10490e;

    /* renamed from: f */
    public Uri f10491f;

    /* renamed from: g */
    public int f10492g;

    /* renamed from: h */
    public int f10493h;

    /* renamed from: i */
    public boolean f10494i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(byte[] bArr) {
        super(false);
        boolean z10 = false;
        Objects.requireNonNull(bArr);
        r01.f(bArr.length > 0 ? true : z10);
        this.f10490e = bArr;
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f10493h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.f10490e, this.f10492g, bArr, i10, min);
        this.f10492g += min;
        this.f10493h -= min;
        p(min);
        return min;
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f10491f;
    }

    @Override // m4.kq0
    public final void i() {
        if (this.f10494i) {
            this.f10494i = false;
            q();
        }
        this.f10491f = null;
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        this.f10491f = gs0Var.f9017a;
        r(gs0Var);
        long j3 = gs0Var.f9020d;
        int length = this.f10490e.length;
        if (j3 <= length) {
            int i10 = (int) j3;
            this.f10492g = i10;
            int i11 = length - i10;
            this.f10493h = i11;
            long j10 = gs0Var.f9021e;
            if (j10 != -1) {
                this.f10493h = (int) Math.min(i11, j10);
            }
            this.f10494i = true;
            s(gs0Var);
            long j11 = gs0Var.f9021e;
            return j11 != -1 ? j11 : this.f10493h;
        }
        throw new mq0(2008);
    }
}
