package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xb implements gb {

    /* renamed from: d */
    public wb f15268d;

    /* renamed from: g */
    public ByteBuffer f15271g;

    /* renamed from: h */
    public ShortBuffer f15272h;

    /* renamed from: i */
    public ByteBuffer f15273i;

    /* renamed from: j */
    public long f15274j;

    /* renamed from: k */
    public long f15275k;

    /* renamed from: l */
    public boolean f15276l;

    /* renamed from: e */
    public float f15269e = 1.0f;

    /* renamed from: f */
    public float f15270f = 1.0f;

    /* renamed from: b */
    public int f15266b = -1;

    /* renamed from: c */
    public int f15267c = -1;

    public xb() {
        ByteBuffer byteBuffer = gb.f8797a;
        this.f15271g = byteBuffer;
        this.f15272h = byteBuffer.asShortBuffer();
        this.f15273i = byteBuffer;
    }

    @Override // m4.gb
    public final void a() {
    }

    @Override // m4.gb
    public final void b() {
        int i10;
        wb wbVar = this.f15268d;
        int i11 = wbVar.f14918q;
        float f10 = wbVar.f14917o;
        float f11 = wbVar.p;
        int i12 = wbVar.f14919r + ((int) ((((i11 / (f10 / f11)) + wbVar.f14920s) / f11) + 0.5f));
        int i13 = wbVar.f14907e;
        wbVar.d(i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = wbVar.f14907e;
            i10 = i15 + i15;
            int i16 = wbVar.f14904b;
            if (i14 >= i10 * i16) {
                break;
            }
            wbVar.f14910h[(i16 * i11) + i14] = 0;
            i14++;
        }
        wbVar.f14918q += i10;
        wbVar.g();
        if (wbVar.f14919r > i12) {
            wbVar.f14919r = i12;
        }
        wbVar.f14918q = 0;
        wbVar.f14921t = 0;
        wbVar.f14920s = 0;
        this.f15276l = true;
    }

    @Override // m4.gb
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.f15273i;
        this.f15273i = gb.f8797a;
        return byteBuffer;
    }

    @Override // m4.gb
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15274j += remaining;
            wb wbVar = this.f15268d;
            Objects.requireNonNull(wbVar);
            int remaining2 = asShortBuffer.remaining();
            int i10 = wbVar.f14904b;
            int i11 = remaining2 / i10;
            int i12 = i10 * i11;
            wbVar.d(i11);
            asShortBuffer.get(wbVar.f14910h, wbVar.f14918q * wbVar.f14904b, (i12 + i12) / 2);
            wbVar.f14918q += i11;
            wbVar.g();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i13 = this.f15268d.f14919r * this.f15266b;
        int i14 = i13 + i13;
        if (i14 > 0) {
            if (this.f15271g.capacity() < i14) {
                ByteBuffer order = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
                this.f15271g = order;
                this.f15272h = order.asShortBuffer();
            } else {
                this.f15271g.clear();
                this.f15272h.clear();
            }
            wb wbVar2 = this.f15268d;
            ShortBuffer shortBuffer = this.f15272h;
            Objects.requireNonNull(wbVar2);
            int min = Math.min(shortBuffer.remaining() / wbVar2.f14904b, wbVar2.f14919r);
            shortBuffer.put(wbVar2.f14912j, 0, wbVar2.f14904b * min);
            int i15 = wbVar2.f14919r - min;
            wbVar2.f14919r = i15;
            short[] sArr = wbVar2.f14912j;
            int i16 = wbVar2.f14904b;
            System.arraycopy(sArr, min * i16, sArr, 0, i15 * i16);
            this.f15275k += i14;
            this.f15271g.limit(i14);
            this.f15273i = this.f15271g;
        }
    }

    @Override // m4.gb
    public final void e() {
        this.f15268d = null;
        ByteBuffer byteBuffer = gb.f8797a;
        this.f15271g = byteBuffer;
        this.f15272h = byteBuffer.asShortBuffer();
        this.f15273i = byteBuffer;
        this.f15266b = -1;
        this.f15267c = -1;
        this.f15274j = 0L;
        this.f15275k = 0L;
        this.f15276l = false;
    }

    @Override // m4.gb
    public final boolean f(int i10, int i11, int i12) {
        if (i12 == 2) {
            if (this.f15267c == i10 && this.f15266b == i11) {
                return false;
            }
            this.f15267c = i10;
            this.f15266b = i11;
            return true;
        }
        throw new fb(i10, i11, i12);
    }

    @Override // m4.gb
    public final void g() {
        wb wbVar = new wb(this.f15267c, this.f15266b);
        this.f15268d = wbVar;
        wbVar.f14917o = this.f15269e;
        wbVar.p = this.f15270f;
        this.f15273i = gb.f8797a;
        this.f15274j = 0L;
        this.f15275k = 0L;
        this.f15276l = false;
    }

    @Override // m4.gb
    public final boolean h() {
        return Math.abs(this.f15269e + (-1.0f)) >= 0.01f || Math.abs(this.f15270f + (-1.0f)) >= 0.01f;
    }

    @Override // m4.gb
    public final boolean i() {
        wb wbVar;
        return this.f15276l && ((wbVar = this.f15268d) == null || wbVar.f14919r == 0);
    }

    @Override // m4.gb
    public final int zza() {
        return this.f15266b;
    }
}
