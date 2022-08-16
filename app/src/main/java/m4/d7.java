package m4;

/* loaded from: classes.dex */
public final class d7 implements c7, Cif, ar0 {

    /* renamed from: s */
    public final Object f7231s;

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r91v1 ?? I:??[int, boolean])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // m4.c7
    public final void b(byte[] r155, byte[] r156) {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.d7.b(byte[], byte[]):void");
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        ((wo0) obj).d((cn) this.f7231s);
    }

    @Override // m4.Cif
    public final boolean q(long j3) {
        Cif[] cifArr;
        boolean z10;
        boolean z11 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (Cif cif : (Cif[]) this.f7231s) {
                if (cif.zza() == zza) {
                    z10 |= cif.q(j3);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // m4.Cif
    public final long zza() {
        long j3 = Long.MAX_VALUE;
        for (Cif cif : (Cif[]) this.f7231s) {
            long zza = cif.zza();
            if (zza != Long.MIN_VALUE) {
                j3 = Math.min(j3, zza);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }
}
