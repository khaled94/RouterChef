package m4;

import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bh2 extends ah2 {

    /* renamed from: i */
    public int[] f6537i;

    /* renamed from: j */
    public int[] f6538j;

    @Override // m4.jg2
    public final void h(ByteBuffer byteBuffer) {
        int[] iArr = this.f6538j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j3 = j(((limit - position) / this.f6160b.f9333d) * this.f6161c.f9333d);
        while (position < limit) {
            for (int i10 : iArr) {
                j3.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.f6160b.f9333d;
        }
        byteBuffer.position(limit);
        j3.flip();
    }

    @Override // m4.ah2
    public final hg2 i(hg2 hg2Var) {
        int[] iArr = this.f6537i;
        if (iArr == null) {
            return hg2.f9329e;
        }
        if (hg2Var.f9332c != 2) {
            throw new ig2(hg2Var);
        }
        boolean z10 = hg2Var.f9331b != iArr.length;
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            if (i10 >= length) {
                return z10 ? new hg2(hg2Var.f9330a, length, 2) : hg2.f9329e;
            }
            int i11 = iArr[i10];
            if (i11 >= hg2Var.f9331b) {
                throw new ig2(hg2Var);
            }
            z10 |= i11 != i10;
            i10++;
        }
    }

    @Override // m4.ah2
    public final void k() {
        this.f6538j = this.f6537i;
    }

    @Override // m4.ah2
    public final void m() {
        this.f6538j = null;
        this.f6537i = null;
    }
}
