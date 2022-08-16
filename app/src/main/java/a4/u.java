package a4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u extends t {

    /* renamed from: u */
    public final byte[] f152u;

    public u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f152u = bArr;
    }

    @Override // a4.t
    public final byte[] e0() {
        return this.f152u;
    }
}
