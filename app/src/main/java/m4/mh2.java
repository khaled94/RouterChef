package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class mh2 extends ah2 {

    /* renamed from: i */
    public static final int f11211i = Float.floatToIntBits(Float.NaN);

    public static void n(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f11211i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // m4.jg2
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f6160b.f9332c;
        if (i11 == 536870912) {
            byteBuffer2 = j((i10 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 != 805306368) {
            throw new IllegalStateException();
        } else {
            byteBuffer2 = j(i10);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override // m4.ah2
    public final hg2 i(hg2 hg2Var) {
        int i10 = hg2Var.f9332c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new hg2(hg2Var.f9330a, hg2Var.f9331b, 4) : hg2.f9329e;
        }
        throw new ig2(hg2Var);
    }
}
