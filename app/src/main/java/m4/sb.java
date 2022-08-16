package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sb implements gb {

    /* renamed from: b */
    public int f13570b = -1;

    /* renamed from: c */
    public int f13571c = -1;

    /* renamed from: d */
    public int[] f13572d;

    /* renamed from: e */
    public boolean f13573e;

    /* renamed from: f */
    public int[] f13574f;

    /* renamed from: g */
    public ByteBuffer f13575g;

    /* renamed from: h */
    public ByteBuffer f13576h;

    /* renamed from: i */
    public boolean f13577i;

    public sb() {
        ByteBuffer byteBuffer = gb.f8797a;
        this.f13575g = byteBuffer;
        this.f13576h = byteBuffer;
    }

    @Override // m4.gb
    public final void a() {
    }

    @Override // m4.gb
    public final void b() {
        this.f13577i = true;
    }

    @Override // m4.gb
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.f13576h;
        this.f13576h = gb.f8797a;
        return byteBuffer;
    }

    @Override // m4.gb
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = this.f13570b;
        int length = ((limit - position) / (i10 + i10)) * this.f13574f.length;
        int i11 = length + length;
        if (this.f13575g.capacity() < i11) {
            this.f13575g = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f13575g.clear();
        }
        while (position < limit) {
            for (int i12 : this.f13574f) {
                this.f13575g.putShort(byteBuffer.getShort(i12 + i12 + position));
            }
            int i13 = this.f13570b;
            position += i13 + i13;
        }
        byteBuffer.position(limit);
        this.f13575g.flip();
        this.f13576h = this.f13575g;
    }

    @Override // m4.gb
    public final void e() {
        g();
        this.f13575g = gb.f8797a;
        this.f13570b = -1;
        this.f13571c = -1;
        this.f13574f = null;
        this.f13573e = false;
    }

    @Override // m4.gb
    public final boolean f(int i10, int i11, int i12) {
        boolean z10 = !Arrays.equals(this.f13572d, this.f13574f);
        int[] iArr = this.f13572d;
        this.f13574f = iArr;
        if (iArr == null) {
            this.f13573e = false;
            return z10;
        } else if (i12 != 2) {
            throw new fb(i10, i11, i12);
        } else {
            if (!z10 && this.f13571c == i10 && this.f13570b == i11) {
                return false;
            }
            this.f13571c = i10;
            this.f13570b = i11;
            this.f13573e = i11 != iArr.length;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f13574f;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 >= i11) {
                    throw new fb(i10, i11, 2);
                }
                this.f13573e = (i14 != i13) | this.f13573e;
                i13++;
            }
        }
    }

    @Override // m4.gb
    public final void g() {
        this.f13576h = gb.f8797a;
        this.f13577i = false;
    }

    @Override // m4.gb
    public final boolean h() {
        return this.f13573e;
    }

    @Override // m4.gb
    public final boolean i() {
        return this.f13577i && this.f13576h == gb.f8797a;
    }

    @Override // m4.gb
    public final int zza() {
        int[] iArr = this.f13574f;
        return iArr == null ? this.f13570b : iArr.length;
    }
}
