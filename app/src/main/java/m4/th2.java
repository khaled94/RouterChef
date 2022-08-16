package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class th2 extends ah2 {

    /* renamed from: i */
    public int f14057i;

    /* renamed from: j */
    public int f14058j;

    /* renamed from: k */
    public boolean f14059k;

    /* renamed from: l */
    public int f14060l;

    /* renamed from: m */
    public byte[] f14061m = ls1.f10976f;

    /* renamed from: n */
    public int f14062n;

    /* renamed from: o */
    public long f14063o;

    @Override // m4.ah2, m4.jg2
    public final ByteBuffer a() {
        int i10;
        if (super.f() && (i10 = this.f14062n) > 0) {
            j(i10).put(this.f14061m, 0, this.f14062n).flip();
            this.f14062n = 0;
        }
        return super.a();
    }

    @Override // m4.ah2, m4.jg2
    public final boolean f() {
        return super.f() && this.f14062n == 0;
    }

    @Override // m4.jg2
    public final void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f14060l);
        this.f14063o += min / this.f6160b.f9333d;
        this.f14060l -= min;
        byteBuffer.position(position + min);
        if (this.f14060l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f14062n + i11) - this.f14061m.length;
        ByteBuffer j3 = j(length);
        int r10 = ls1.r(length, 0, this.f14062n);
        j3.put(this.f14061m, 0, r10);
        int r11 = ls1.r(length - r10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + r11);
        j3.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - r11;
        int i13 = this.f14062n - r10;
        this.f14062n = i13;
        byte[] bArr = this.f14061m;
        System.arraycopy(bArr, r10, bArr, 0, i13);
        byteBuffer.get(this.f14061m, this.f14062n, i12);
        this.f14062n += i12;
        j3.flip();
    }

    @Override // m4.ah2
    public final hg2 i(hg2 hg2Var) {
        if (hg2Var.f9332c == 2) {
            this.f14059k = true;
            return (this.f14057i == 0 && this.f14058j == 0) ? hg2.f9329e : hg2Var;
        }
        throw new ig2(hg2Var);
    }

    @Override // m4.ah2
    public final void k() {
        if (this.f14059k) {
            this.f14059k = false;
            int i10 = this.f14058j;
            int i11 = this.f6160b.f9333d;
            this.f14061m = new byte[i10 * i11];
            this.f14060l = this.f14057i * i11;
        }
        this.f14062n = 0;
    }

    @Override // m4.ah2
    public final void l() {
        int i10;
        if (this.f14059k) {
            if (this.f14062n > 0) {
                this.f14063o += i10 / this.f6160b.f9333d;
            }
            this.f14062n = 0;
        }
    }

    @Override // m4.ah2
    public final void m() {
        this.f14061m = ls1.f10976f;
    }
}
