package m4;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import n3.j0;
import n9.d;

/* loaded from: classes.dex */
public final class rb {
    public int A;
    public long B;
    public int C;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public float I;
    public gb[] J;
    public ByteBuffer[] K;
    public ByteBuffer L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public long U;

    /* renamed from: a */
    public final sb f13215a;

    /* renamed from: b */
    public final xb f13216b;

    /* renamed from: c */
    public final gb[] f13217c;

    /* renamed from: d */
    public final tb f13218d;

    /* renamed from: e */
    public final ConditionVariable f13219e = new ConditionVariable(true);

    /* renamed from: f */
    public final long[] f13220f;

    /* renamed from: g */
    public final lb f13221g;

    /* renamed from: h */
    public final LinkedList<pb> f13222h;

    /* renamed from: i */
    public AudioTrack f13223i;

    /* renamed from: j */
    public int f13224j;

    /* renamed from: k */
    public int f13225k;

    /* renamed from: l */
    public int f13226l;

    /* renamed from: m */
    public int f13227m;

    /* renamed from: n */
    public int f13228n;

    /* renamed from: o */
    public long f13229o;
    public xa p;

    /* renamed from: q */
    public xa f13230q;

    /* renamed from: r */
    public long f13231r;

    /* renamed from: s */
    public long f13232s;

    /* renamed from: t */
    public int f13233t;

    /* renamed from: u */
    public int f13234u;

    /* renamed from: v */
    public long f13235v;

    /* renamed from: w */
    public long f13236w;

    /* renamed from: x */
    public boolean f13237x;
    public long y;

    /* renamed from: z */
    public Method f13238z;

    public rb(gb[] gbVarArr, tb tbVar) {
        this.f13218d = tbVar;
        if (wg.f14958a >= 18) {
            try {
                this.f13238z = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f13221g = wg.f14958a >= 19 ? new mb() : new lb();
        sb sbVar = new sb();
        this.f13215a = sbVar;
        xb xbVar = new xb();
        this.f13216b = xbVar;
        this.f13217c = r2;
        System.arraycopy(gbVarArr, 0, r2, 2, 0);
        gb[] gbVarArr2 = {new vb(), sbVar, xbVar};
        this.f13220f = new long[10];
        this.I = 1.0f;
        this.E = 0;
        this.S = 0;
        this.f13230q = xa.f15258c;
        this.P = -1;
        this.J = new gb[0];
        this.K = new ByteBuffer[0];
        this.f13222h = new LinkedList<>();
    }

    public final xa a(xa xaVar) {
        xb xbVar = this.f13216b;
        float f10 = xaVar.f15259a;
        Objects.requireNonNull(xbVar);
        int i10 = wg.f14958a;
        float max = Math.max(0.1f, Math.min(f10, 8.0f));
        xbVar.f15269e = max;
        xb xbVar2 = this.f13216b;
        Objects.requireNonNull(xbVar2);
        xbVar2.f15270f = Math.max(0.1f, Math.min(1.0f, 8.0f));
        xa xaVar2 = new xa(max);
        xa xaVar3 = this.p;
        if (xaVar3 == null) {
            if (!this.f13222h.isEmpty()) {
                xaVar3 = this.f13222h.getLast().f12458a;
            } else {
                xaVar3 = this.f13230q;
            }
        }
        if (!xaVar2.equals(xaVar3)) {
            if (n()) {
                this.p = xaVar2;
            } else {
                this.f13230q = xaVar2;
            }
        }
        return this.f13230q;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.rb.b(int, int, int, int[]):void");
    }

    public final void c() {
        this.R = true;
        if (n()) {
            this.G = System.nanoTime() / 1000;
            this.f13223i.play();
        }
    }

    public final void d() {
        if (n()) {
            this.B = 0L;
            this.D = 0L;
            xa xaVar = this.p;
            if (xaVar != null) {
                this.f13230q = xaVar;
                this.p = null;
            } else if (!this.f13222h.isEmpty()) {
                this.f13230q = this.f13222h.getLast().f12458a;
            }
            this.f13222h.clear();
            this.f13231r = 0L;
            this.f13232s = 0L;
            this.L = null;
            this.M = null;
            int i10 = 0;
            while (true) {
                gb[] gbVarArr = this.J;
                if (i10 >= gbVarArr.length) {
                    break;
                }
                gb gbVar = gbVarArr[i10];
                gbVar.g();
                this.K[i10] = gbVar.c();
                i10++;
            }
            this.Q = false;
            this.P = -1;
            this.E = 0;
            this.H = 0L;
            this.f13235v = 0L;
            this.f13234u = 0;
            this.f13233t = 0;
            this.f13236w = 0L;
            this.f13237x = false;
            this.y = 0L;
            if (this.f13223i.getPlayState() == 3) {
                this.f13223i.pause();
            }
            AudioTrack audioTrack = this.f13223i;
            this.f13223i = null;
            this.f13221g.d(null, false);
            this.f13219e.close();
            new kb(this, audioTrack).start();
        }
    }

    public final boolean e(ByteBuffer byteBuffer, long j3) {
        int i10;
        ByteBuffer byteBuffer2 = this.L;
        d.g(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!n()) {
            this.f13219e.block();
            int i11 = this.S;
            int i12 = this.f13224j;
            int i13 = this.f13225k;
            int i14 = this.f13227m;
            int i15 = this.f13228n;
            AudioTrack audioTrack = i11 == 0 ? new AudioTrack(3, i12, i13, i14, i15, 1) : new AudioTrack(3, i12, i13, i14, i15, 1, i11);
            this.f13223i = audioTrack;
            int state = audioTrack.getState();
            if (state != 1) {
                try {
                    this.f13223i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f13223i = null;
                    throw th;
                }
                this.f13223i = null;
                throw new ob(state, this.f13224j, this.f13225k, this.f13228n);
            }
            int audioSessionId = this.f13223i.getAudioSessionId();
            if (this.S != audioSessionId) {
                this.S = audioSessionId;
                j0 j0Var = this.f13218d.f13993a.Q;
                ((Handler) j0Var.f16489s).post(new ib(j0Var));
            }
            this.f13221g.d(this.f13223i, o());
            l();
            this.T = false;
            if (this.R) {
                c();
            }
        }
        if (o()) {
            if (this.f13223i.getPlayState() == 2) {
                this.T = false;
                return false;
            } else if (this.f13223i.getPlayState() == 1 && this.f13221g.a() != 0) {
                return false;
            }
        }
        boolean z10 = this.T;
        boolean f10 = f();
        this.T = f10;
        if (z10 && !f10 && this.f13223i.getPlayState() != 1) {
            SystemClock.elapsedRealtime();
            tb tbVar = this.f13218d;
            ia.b(this.f13229o);
            j0 j0Var2 = tbVar.f13993a.Q;
            ((Handler) j0Var2.f16489s).post(new r8(j0Var2));
        }
        if (this.L == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.p != null) {
                if (!m()) {
                    return false;
                }
                this.f13222h.add(new pb(this.p, Math.max(0L, j3), h(i())));
                this.p = null;
                k();
            }
            if (this.E == 0) {
                this.F = Math.max(0L, j3);
                this.E = 1;
            } else {
                long h10 = h(this.B / this.A) + this.F;
                if (this.E != 1 || Math.abs(h10 - j3) <= 200000) {
                    i10 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Discontinuity detected [expected ");
                    sb.append(h10);
                    sb.append(", got ");
                    sb.append(j3);
                    sb.append("]");
                    Log.e("AudioTrack", sb.toString());
                    i10 = 2;
                    this.E = 2;
                }
                if (this.E == i10) {
                    this.F = (j3 - h10) + this.F;
                    this.E = 1;
                    this.f13218d.f13993a.W = true;
                }
            }
            this.B += byteBuffer.remaining();
            this.L = byteBuffer;
        }
        j(j3);
        if (!this.L.hasRemaining()) {
            this.L = null;
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (n()) {
            if (i() > this.f13221g.a()) {
                return true;
            }
            if (o() && this.f13223i.getPlayState() == 2 && this.f13223i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final long g(long j3) {
        return (j3 * this.f13224j) / 1000000;
    }

    public final long h(long j3) {
        return (j3 * 1000000) / this.f13224j;
    }

    public final long i() {
        return this.D / this.C;
    }

    public final void j(long j3) {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.K[i10 - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = gb.f8797a;
                }
            }
            if (i10 == length) {
                p(byteBuffer);
            } else {
                gb gbVar = this.J[i10];
                gbVar.d(byteBuffer);
                ByteBuffer c10 = gbVar.c();
                this.K[i10] = c10;
                if (c10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        gb[] gbVarArr = this.f13217c;
        for (int i10 = 0; i10 < 3; i10++) {
            gb gbVar = gbVarArr[i10];
            if (gbVar.h()) {
                arrayList.add(gbVar);
            } else {
                gbVar.g();
            }
        }
        int size = arrayList.size();
        this.J = (gb[]) arrayList.toArray(new gb[size]);
        this.K = new ByteBuffer[size];
        for (int i11 = 0; i11 < size; i11++) {
            gb gbVar2 = this.J[i11];
            gbVar2.g();
            this.K[i11] = gbVar2.c();
        }
    }

    public final void l() {
        if (!n()) {
            return;
        }
        if (wg.f14958a >= 21) {
            this.f13223i.setVolume(this.I);
            return;
        }
        AudioTrack audioTrack = this.f13223i;
        float f10 = this.I;
        audioTrack.setStereoVolume(f10, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002a -> B:15:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            r10 = this;
            int r0 = r10.P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r10.P = r2
            r0 = r10
            goto L2f
        Lb:
            r0 = r10
            r4 = r2
        Ld:
            int r5 = r0.P
            m4.gb[] r6 = r0.J
            int r7 = r6.length
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= r7) goto L31
            r5 = r6[r5]
            if (r4 == 0) goto L20
            r5.b()
        L20:
            r0.j(r8)
            boolean r4 = r5.i()
            if (r4 != 0) goto L2a
            return r2
        L2a:
            int r4 = r0.P
            int r4 = r4 + r1
            r0.P = r4
        L2f:
            r4 = r1
            goto Ld
        L31:
            java.nio.ByteBuffer r4 = r0.M
            if (r4 == 0) goto L3d
            r0.p(r4)
            java.nio.ByteBuffer r4 = r0.M
            if (r4 == 0) goto L3d
            return r2
        L3d:
            r0.P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.rb.m():boolean");
    }

    public final boolean n() {
        return this.f13223i != null;
    }

    public final boolean o() {
        int i10;
        return wg.f14958a < 23 && ((i10 = this.f13227m) == 5 || i10 == 6);
    }

    public final boolean p(ByteBuffer byteBuffer) {
        int i10;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.M;
        if (byteBuffer2 != null) {
            d.g(byteBuffer2 == byteBuffer);
        } else {
            this.M = byteBuffer;
            if (wg.f14958a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.N;
                if (bArr == null || bArr.length < remaining) {
                    this.N = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.N, 0, remaining);
                byteBuffer.position(position);
                this.O = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (wg.f14958a < 21) {
            int a10 = this.f13228n - ((int) (this.D - (this.f13221g.a() * this.C)));
            if (a10 > 0) {
                i10 = this.f13223i.write(this.N, this.O, Math.min(remaining2, a10));
                if (i10 > 0) {
                    this.O += i10;
                    byteBuffer.position(byteBuffer.position() + i10);
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = this.f13223i.write(byteBuffer, remaining2, 1);
        }
        this.U = SystemClock.elapsedRealtime();
        if (i10 < 0) {
            throw new qb(i10);
        }
        this.D += i10;
        if (i10 != remaining2) {
            return false;
        }
        this.M = null;
        return true;
    }
}
