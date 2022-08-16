package m4;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y92 extends InputStream {
    public long A;

    /* renamed from: s */
    public Iterator<ByteBuffer> f15624s;

    /* renamed from: t */
    public ByteBuffer f15625t;

    /* renamed from: u */
    public int f15626u = 0;

    /* renamed from: v */
    public int f15627v;

    /* renamed from: w */
    public int f15628w;

    /* renamed from: x */
    public boolean f15629x;
    public byte[] y;

    /* renamed from: z */
    public int f15630z;

    public y92(Iterable<ByteBuffer> iterable) {
        this.f15624s = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f15626u++;
        }
        this.f15627v = -1;
        if (!c()) {
            this.f15625t = v92.f14626c;
            this.f15627v = 0;
            this.f15628w = 0;
            this.A = 0L;
        }
    }

    public final void b(int i10) {
        int i11 = this.f15628w + i10;
        this.f15628w = i11;
        if (i11 == this.f15625t.limit()) {
            c();
        }
    }

    public final boolean c() {
        this.f15627v++;
        if (!this.f15624s.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f15624s.next();
        this.f15625t = next;
        this.f15628w = next.position();
        if (this.f15625t.hasArray()) {
            this.f15629x = true;
            this.y = this.f15625t.array();
            this.f15630z = this.f15625t.arrayOffset();
        } else {
            this.f15629x = false;
            this.A = zb2.f16089c.y(this.f15625t, zb2.f16093g);
            this.y = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte f10;
        if (this.f15627v == this.f15626u) {
            return -1;
        }
        if (this.f15629x) {
            f10 = this.y[this.f15628w + this.f15630z];
        } else {
            f10 = zb2.f(this.f15628w + this.A);
        }
        b(1);
        return f10 & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f15627v == this.f15626u) {
            return -1;
        }
        int limit = this.f15625t.limit();
        int i12 = this.f15628w;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f15629x) {
            System.arraycopy(this.y, i12 + this.f15630z, bArr, i10, i11);
        } else {
            int position = this.f15625t.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f15625t.position(this.f15628w);
            this.f15625t.get(bArr, i10, i11);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f15625t.position(position);
        }
        b(i11);
        return i11;
    }
}
