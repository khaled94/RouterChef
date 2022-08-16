package m4;

/* loaded from: classes.dex */
public final class mk2 implements zk2 {

    /* renamed from: a */
    public final int f11235a;

    /* renamed from: b */
    public final /* synthetic */ pk2 f11236b;

    public mk2(pk2 pk2Var, int i10) {
        this.f11236b = pk2Var;
        this.f11235a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r11 == (-1)) goto L23;
     */
    @Override // m4.zk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r11) {
        /*
            r10 = this;
            m4.pk2 r0 = r10.f11236b
            int r1 = r10.f11235a
            boolean r2 = r0.D()
            r3 = 0
            if (r2 == 0) goto Ld
            goto L6f
        Ld:
            r0.z(r1)
            m4.yk2[] r2 = r0.H
            r2 = r2[r1]
            boolean r4 = r0.Z
            monitor-enter(r2)
            int r5 = r2.f15822q     // Catch: java.lang.Throwable -> L72
            int r5 = r2.g(r5)     // Catch: java.lang.Throwable -> L72
            boolean r6 = r2.j()     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L4e
            long[] r6 = r2.f15818l     // Catch: java.lang.Throwable -> L72
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L72
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 >= 0) goto L2c
            goto L4e
        L2c:
            long r6 = r2.f15825t     // Catch: java.lang.Throwable -> L72
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 <= 0) goto L3c
            if (r4 != 0) goto L35
            goto L3c
        L35:
            int r11 = r2.f15820n     // Catch: java.lang.Throwable -> L72
            int r12 = r2.f15822q     // Catch: java.lang.Throwable -> L72
            int r11 = r11 - r12
            monitor-exit(r2)
            goto L50
        L3c:
            int r4 = r2.f15820n     // Catch: java.lang.Throwable -> L72
            int r6 = r2.f15822q     // Catch: java.lang.Throwable -> L72
            int r6 = r4 - r6
            r9 = 1
            r4 = r2
            r7 = r11
            int r11 = r4.o(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L72
            r12 = -1
            monitor-exit(r2)
            if (r11 != r12) goto L50
            goto L4f
        L4e:
            monitor-exit(r2)
        L4f:
            r11 = r3
        L50:
            monitor-enter(r2)
            if (r11 < 0) goto L5e
            int r12 = r2.f15822q     // Catch: java.lang.Throwable -> L5c
            int r12 = r12 + r11
            int r4 = r2.f15820n     // Catch: java.lang.Throwable -> L5c
            if (r12 > r4) goto L5e
            r12 = 1
            goto L5f
        L5c:
            r11 = move-exception
            goto L70
        L5e:
            r12 = r3
        L5f:
            m4.r01.f(r12)     // Catch: java.lang.Throwable -> L5c
            int r12 = r2.f15822q     // Catch: java.lang.Throwable -> L5c
            int r12 = r12 + r11
            r2.f15822q = r12     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r2)
            if (r11 != 0) goto L6e
            r0.A(r1)
            goto L6f
        L6e:
            r3 = r11
        L6f:
            return r3
        L70:
            monitor-exit(r2)
            throw r11
        L72:
            r11 = move-exception
            monitor-exit(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.mk2.a(long):int");
    }

    @Override // m4.zk2
    public final boolean b() {
        pk2 pk2Var = this.f11236b;
        return !pk2Var.D() && pk2Var.H[this.f11235a].m(pk2Var.Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
        if (r7 != 0) goto L56;
     */
    @Override // m4.zk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(g1.l r17, m4.il0 r18, int r19) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.mk2.c(g1.l, m4.il0, int):int");
    }

    @Override // m4.zk2
    public final void g() {
        pk2 pk2Var = this.f11236b;
        jd0 jd0Var = pk2Var.H[this.f11235a].A;
        if (jd0Var == null) {
            pk2Var.h();
            return;
        }
        throw ((uh2) jd0Var.f9928s);
    }
}
