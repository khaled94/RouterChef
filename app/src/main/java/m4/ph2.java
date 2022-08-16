package m4;

/* loaded from: classes.dex */
public final class ph2 extends ah2 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[LOOP:4: B:29:0x00ae->B:30:0x00b0, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0036, B:30:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // m4.jg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            m4.hg2 r3 = r9.f6160b
            int r3 = r3.f9332c
            r4 = 4
            r5 = 3
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == r5) goto L2d
            if (r3 == r4) goto L2a
            if (r3 == r8) goto L2e
            if (r3 == r7) goto L27
            if (r3 != r6) goto L21
            goto L2a
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L27:
            int r2 = r2 / 3
            goto L2d
        L2a:
            int r2 = r2 / 2
            goto L2e
        L2d:
            int r2 = r2 + r2
        L2e:
            java.nio.ByteBuffer r2 = r9.j(r2)
            m4.hg2 r3 = r9.f6160b
            int r3 = r3.f9332c
            if (r3 == r5) goto Lae
            if (r3 == r4) goto L89
            if (r3 == r8) goto L74
            if (r3 == r7) goto L5d
            if (r3 != r6) goto L57
        L40:
            if (r0 >= r1) goto Lc3
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L40
        L57:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L5d:
            if (r0 >= r1) goto Lc3
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L5d
        L74:
            if (r0 >= r1) goto Lc3
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L74
        L89:
            if (r0 >= r1) goto Lc3
            float r3 = r10.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = m4.ls1.k(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L89
        Lae:
            if (r0 >= r1) goto Lc3
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto Lae
        Lc3:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ph2.h(java.nio.ByteBuffer):void");
    }

    @Override // m4.ah2
    public final hg2 i(hg2 hg2Var) {
        int i10 = hg2Var.f9332c;
        if (i10 != 3) {
            if (i10 == 2) {
                return hg2.f9329e;
            }
            if (i10 != 268435456 && i10 != 536870912 && i10 != 805306368 && i10 != 4) {
                throw new ig2(hg2Var);
            }
        }
        return new hg2(hg2Var.f9330a, hg2Var.f9331b, 2);
    }
}
