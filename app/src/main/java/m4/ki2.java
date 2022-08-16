package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ki2 extends il0 {

    /* renamed from: h */
    public long f10439h;

    /* renamed from: i */
    public int f10440i;

    /* renamed from: j */
    public int f10441j = 32;

    public ki2() {
        super(2);
    }

    @Override // m4.il0
    public final void a() {
        super.a();
        this.f10440i = 0;
    }

    public final boolean g(il0 il0Var) {
        ByteBuffer byteBuffer;
        r01.f(!il0Var.b(1073741824));
        r01.f(!il0Var.b(268435456));
        r01.f(!il0Var.b(4));
        if (h()) {
            if (this.f10440i >= this.f10441j || il0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = il0Var.f9686c;
            if (byteBuffer2 != null && (byteBuffer = this.f9686c) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f10440i;
        this.f10440i = i10 + 1;
        if (i10 == 0) {
            this.f9688e = il0Var.f9688e;
            if (il0Var.b(1)) {
                this.f9684a = 1;
            }
        }
        if (il0Var.b(Integer.MIN_VALUE)) {
            this.f9684a = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = il0Var.f9686c;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.f9686c.put(byteBuffer3);
        }
        this.f10439h = il0Var.f9688e;
        return true;
    }

    public final boolean h() {
        return this.f10440i > 0;
    }
}
