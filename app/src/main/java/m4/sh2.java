package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sh2 implements jg2 {

    /* renamed from: e */
    public hg2 f13652e;

    /* renamed from: f */
    public hg2 f13653f;

    /* renamed from: g */
    public hg2 f13654g;

    /* renamed from: h */
    public hg2 f13655h;

    /* renamed from: i */
    public boolean f13656i;

    /* renamed from: j */
    public rh2 f13657j;

    /* renamed from: k */
    public ByteBuffer f13658k;

    /* renamed from: l */
    public ShortBuffer f13659l;

    /* renamed from: m */
    public ByteBuffer f13660m;

    /* renamed from: n */
    public long f13661n;

    /* renamed from: o */
    public long f13662o;
    public boolean p;

    /* renamed from: c */
    public float f13650c = 1.0f;

    /* renamed from: d */
    public float f13651d = 1.0f;

    /* renamed from: b */
    public int f13649b = -1;

    public sh2() {
        hg2 hg2Var = hg2.f9329e;
        this.f13652e = hg2Var;
        this.f13653f = hg2Var;
        this.f13654g = hg2Var;
        this.f13655h = hg2Var;
        ByteBuffer byteBuffer = jg2.f10060a;
        this.f13658k = byteBuffer;
        this.f13659l = byteBuffer.asShortBuffer();
        this.f13660m = byteBuffer;
    }

    @Override // m4.jg2
    public final ByteBuffer a() {
        int i10;
        int i11;
        rh2 rh2Var = this.f13657j;
        if (rh2Var != null && (i11 = (i10 = rh2Var.f13346m * rh2Var.f13335b) + i10) > 0) {
            if (this.f13658k.capacity() < i11) {
                ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                this.f13658k = order;
                this.f13659l = order.asShortBuffer();
            } else {
                this.f13658k.clear();
                this.f13659l.clear();
            }
            ShortBuffer shortBuffer = this.f13659l;
            int min = Math.min(shortBuffer.remaining() / rh2Var.f13335b, rh2Var.f13346m);
            shortBuffer.put(rh2Var.f13345l, 0, rh2Var.f13335b * min);
            int i12 = rh2Var.f13346m - min;
            rh2Var.f13346m = i12;
            short[] sArr = rh2Var.f13345l;
            int i13 = rh2Var.f13335b;
            System.arraycopy(sArr, min * i13, sArr, 0, i12 * i13);
            this.f13662o += i11;
            this.f13658k.limit(i11);
            this.f13660m = this.f13658k;
        }
        ByteBuffer byteBuffer = this.f13660m;
        this.f13660m = jg2.f10060a;
        return byteBuffer;
    }

    @Override // m4.jg2
    public final hg2 b(hg2 hg2Var) {
        if (hg2Var.f9332c == 2) {
            int i10 = this.f13649b;
            if (i10 == -1) {
                i10 = hg2Var.f9330a;
            }
            this.f13652e = hg2Var;
            hg2 hg2Var2 = new hg2(i10, hg2Var.f9331b, 2);
            this.f13653f = hg2Var2;
            this.f13656i = true;
            return hg2Var2;
        }
        throw new ig2(hg2Var);
    }

    @Override // m4.jg2
    public final void c() {
        if (e()) {
            hg2 hg2Var = this.f13652e;
            this.f13654g = hg2Var;
            hg2 hg2Var2 = this.f13653f;
            this.f13655h = hg2Var2;
            if (this.f13656i) {
                this.f13657j = new rh2(hg2Var.f9330a, hg2Var.f9331b, this.f13650c, this.f13651d, hg2Var2.f9330a);
            } else {
                rh2 rh2Var = this.f13657j;
                if (rh2Var != null) {
                    rh2Var.f13344k = 0;
                    rh2Var.f13346m = 0;
                    rh2Var.f13348o = 0;
                    rh2Var.p = 0;
                    rh2Var.f13349q = 0;
                    rh2Var.f13350r = 0;
                    rh2Var.f13351s = 0;
                    rh2Var.f13352t = 0;
                    rh2Var.f13353u = 0;
                    rh2Var.f13354v = 0;
                }
            }
        }
        this.f13660m = jg2.f10060a;
        this.f13661n = 0L;
        this.f13662o = 0L;
        this.p = false;
    }

    @Override // m4.jg2
    public final void d() {
        this.f13650c = 1.0f;
        this.f13651d = 1.0f;
        hg2 hg2Var = hg2.f9329e;
        this.f13652e = hg2Var;
        this.f13653f = hg2Var;
        this.f13654g = hg2Var;
        this.f13655h = hg2Var;
        ByteBuffer byteBuffer = jg2.f10060a;
        this.f13658k = byteBuffer;
        this.f13659l = byteBuffer.asShortBuffer();
        this.f13660m = byteBuffer;
        this.f13649b = -1;
        this.f13656i = false;
        this.f13657j = null;
        this.f13661n = 0L;
        this.f13662o = 0L;
        this.p = false;
    }

    @Override // m4.jg2
    public final boolean e() {
        if (this.f13653f.f9330a != -1) {
            if (Math.abs(this.f13650c - 1.0f) >= 1.0E-4f || Math.abs(this.f13651d - 1.0f) >= 1.0E-4f) {
                return true;
            }
            return this.f13653f.f9330a != this.f13652e.f9330a;
        }
        return false;
    }

    @Override // m4.jg2
    public final boolean f() {
        if (this.p) {
            rh2 rh2Var = this.f13657j;
            if (rh2Var == null) {
                return true;
            }
            int i10 = rh2Var.f13346m * rh2Var.f13335b;
            if (i10 + i10 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.jg2
    public final void g() {
        int i10;
        rh2 rh2Var = this.f13657j;
        if (rh2Var != null) {
            int i11 = rh2Var.f13344k;
            float f10 = rh2Var.f13336c;
            float f11 = rh2Var.f13337d;
            int i12 = rh2Var.f13346m + ((int) ((((i11 / (f10 / f11)) + rh2Var.f13348o) / (rh2Var.f13338e * f11)) + 0.5f));
            short[] sArr = rh2Var.f13343j;
            int i13 = rh2Var.f13341h;
            rh2Var.f13343j = rh2Var.f(sArr, i11, i13 + i13 + i11);
            int i14 = 0;
            while (true) {
                int i15 = rh2Var.f13341h;
                i10 = i15 + i15;
                int i16 = rh2Var.f13335b;
                if (i14 >= i10 * i16) {
                    break;
                }
                rh2Var.f13343j[(i16 * i11) + i14] = 0;
                i14++;
            }
            rh2Var.f13344k += i10;
            rh2Var.e();
            if (rh2Var.f13346m > i12) {
                rh2Var.f13346m = i12;
            }
            rh2Var.f13344k = 0;
            rh2Var.f13350r = 0;
            rh2Var.f13348o = 0;
        }
        this.p = true;
    }

    @Override // m4.jg2
    public final void h(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        rh2 rh2Var = this.f13657j;
        Objects.requireNonNull(rh2Var);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f13661n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = rh2Var.f13335b;
        int i11 = remaining2 / i10;
        int i12 = i10 * i11;
        short[] f10 = rh2Var.f(rh2Var.f13343j, rh2Var.f13344k, i11);
        rh2Var.f13343j = f10;
        asShortBuffer.get(f10, rh2Var.f13344k * rh2Var.f13335b, (i12 + i12) / 2);
        rh2Var.f13344k += i11;
        rh2Var.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }
}
