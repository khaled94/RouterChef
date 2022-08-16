package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vb implements gb {

    /* renamed from: b */
    public int f14635b = -1;

    /* renamed from: c */
    public int f14636c = -1;

    /* renamed from: d */
    public int f14637d = 0;

    /* renamed from: e */
    public ByteBuffer f14638e;

    /* renamed from: f */
    public ByteBuffer f14639f;

    /* renamed from: g */
    public boolean f14640g;

    public vb() {
        ByteBuffer byteBuffer = gb.f8797a;
        this.f14638e = byteBuffer;
        this.f14639f = byteBuffer;
    }

    @Override // m4.gb
    public final void a() {
    }

    @Override // m4.gb
    public final void b() {
        this.f14640g = true;
    }

    @Override // m4.gb
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.f14639f;
        this.f14639f = gb.f8797a;
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // m4.gb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f14637d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L22
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 + r2
        L22:
            java.nio.ByteBuffer r3 = r7.f14638e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L39
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f14638e = r2
            goto L3e
        L39:
            java.nio.ByteBuffer r2 = r7.f14638e
            r2.clear()
        L3e:
            int r2 = r7.f14637d
            if (r2 == r5) goto L80
            if (r2 == r6) goto L67
            if (r2 != r4) goto L61
        L46:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f14638e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f14638e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L46
        L61:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L67:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f14638e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f14638e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L67
        L80:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f14638e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f14638e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L80
        L9b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f14638e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f14638e
            r7.f14639f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.vb.d(java.nio.ByteBuffer):void");
    }

    @Override // m4.gb
    public final void e() {
        g();
        this.f14638e = gb.f8797a;
        this.f14635b = -1;
        this.f14636c = -1;
        this.f14637d = 0;
    }

    @Override // m4.gb
    public final boolean f(int i10, int i11, int i12) {
        if (i12 == 3 || i12 == 2 || i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            if (this.f14635b == i10 && this.f14636c == i11 && this.f14637d == i12) {
                return false;
            }
            this.f14635b = i10;
            this.f14636c = i11;
            this.f14637d = i12;
            if (i12 != 2) {
                return true;
            }
            this.f14638e = gb.f8797a;
            return true;
        }
        throw new fb(i10, i11, i12);
    }

    @Override // m4.gb
    public final void g() {
        this.f14639f = gb.f8797a;
        this.f14640g = false;
    }

    @Override // m4.gb
    public final boolean h() {
        int i10 = this.f14637d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // m4.gb
    public final boolean i() {
        return this.f14640g && this.f14639f == gb.f8797a;
    }

    @Override // m4.gb
    public final int zza() {
        return this.f14636c;
    }
}
