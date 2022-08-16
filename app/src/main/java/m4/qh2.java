package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qh2 extends ah2 {

    /* renamed from: i */
    public int f12870i;

    /* renamed from: j */
    public boolean f12871j;

    /* renamed from: k */
    public byte[] f12872k;

    /* renamed from: l */
    public byte[] f12873l;

    /* renamed from: m */
    public int f12874m;

    /* renamed from: n */
    public int f12875n;

    /* renamed from: o */
    public int f12876o;
    public boolean p;

    /* renamed from: q */
    public long f12877q;

    public qh2() {
        byte[] bArr = ls1.f10976f;
        this.f12872k = bArr;
        this.f12873l = bArr;
    }

    @Override // m4.ah2, m4.jg2
    public final boolean e() {
        return this.f12871j;
    }

    @Override // m4.jg2
    public final void h(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.f6165g.hasRemaining()) {
            int i10 = this.f12874m;
            int i11 = 1;
            if (i10 == 0) {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f12872k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i12 = this.f12870i;
                        position = ((limit2 / i12) * i12) + i12;
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.p = true;
                    }
                    byteBuffer.limit(limit);
                }
                this.f12874m = i11;
                byteBuffer.limit(limit);
            } else if (i10 != 1) {
                limit = byteBuffer.limit();
                int n10 = n(byteBuffer);
                byteBuffer.limit(n10);
                this.f12877q += byteBuffer.remaining() / this.f12870i;
                p(byteBuffer, this.f12873l, this.f12876o);
                if (n10 < limit) {
                    o(this.f12873l, this.f12876o);
                    this.f12874m = 0;
                    byteBuffer.limit(limit);
                }
            } else {
                limit = byteBuffer.limit();
                int n11 = n(byteBuffer);
                int position2 = n11 - byteBuffer.position();
                byte[] bArr = this.f12872k;
                int length = bArr.length;
                int i13 = this.f12875n;
                int i14 = length - i13;
                if (n11 >= limit || position2 >= i14) {
                    int min = Math.min(position2, i14);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f12872k, this.f12875n, min);
                    int i15 = this.f12875n + min;
                    this.f12875n = i15;
                    byte[] bArr2 = this.f12872k;
                    if (i15 == bArr2.length) {
                        if (this.p) {
                            o(bArr2, this.f12876o);
                            long j3 = this.f12877q;
                            int i16 = this.f12875n;
                            int i17 = this.f12876o;
                            this.f12877q = j3 + ((i16 - (i17 + i17)) / this.f12870i);
                            i15 = i16;
                        } else {
                            this.f12877q += (i15 - this.f12876o) / this.f12870i;
                        }
                        p(byteBuffer, this.f12872k, i15);
                        this.f12875n = 0;
                        i11 = 2;
                        this.f12874m = i11;
                    }
                    byteBuffer.limit(limit);
                } else {
                    o(bArr, i13);
                    this.f12875n = 0;
                    this.f12874m = 0;
                }
            }
        }
    }

    @Override // m4.ah2
    public final hg2 i(hg2 hg2Var) {
        if (hg2Var.f9332c == 2) {
            return this.f12871j ? hg2Var : hg2.f9329e;
        }
        throw new ig2(hg2Var);
    }

    @Override // m4.ah2
    public final void k() {
        if (this.f12871j) {
            hg2 hg2Var = this.f6160b;
            int i10 = hg2Var.f9333d;
            this.f12870i = i10;
            int i11 = hg2Var.f9330a;
            int i12 = ((int) ((150000 * i11) / 1000000)) * i10;
            if (this.f12872k.length != i12) {
                this.f12872k = new byte[i12];
            }
            int i13 = ((int) ((20000 * i11) / 1000000)) * i10;
            this.f12876o = i13;
            if (this.f12873l.length != i13) {
                this.f12873l = new byte[i13];
            }
        }
        this.f12874m = 0;
        this.f12877q = 0L;
        this.f12875n = 0;
        this.p = false;
    }

    @Override // m4.ah2
    public final void l() {
        int i10 = this.f12875n;
        if (i10 > 0) {
            o(this.f12872k, i10);
        }
        if (!this.p) {
            this.f12877q += this.f12876o / this.f12870i;
        }
    }

    @Override // m4.ah2
    public final void m() {
        this.f12871j = false;
        this.f12876o = 0;
        byte[] bArr = ls1.f10976f;
        this.f12872k = bArr;
        this.f12873l = bArr;
    }

    public final int n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i10 = this.f12870i;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void o(byte[] bArr, int i10) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.p = true;
        }
    }

    public final void p(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f12876o);
        int i11 = this.f12876o - min;
        System.arraycopy(bArr, i10 - i11, this.f12873l, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f12873l, i11, min);
    }
}
