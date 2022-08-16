package m4;

/* loaded from: classes.dex */
public final class qj2 extends z40 {

    /* renamed from: b */
    public final gi f12897b;

    public qj2(gi giVar) {
        this.f12897b = giVar;
    }

    @Override // m4.z40
    public final int a(Object obj) {
        return obj == pj2.f12536e ? 0 : -1;
    }

    @Override // m4.z40
    public final int b() {
        return 1;
    }

    @Override // m4.z40
    public final int c() {
        return 1;
    }

    @Override // m4.z40
    public final d30 d(int i10, d30 d30Var, boolean z10) {
        Object obj = null;
        Integer num = z10 ? 0 : null;
        if (z10) {
            obj = pj2.f12536e;
        }
        hl0 hl0Var = hl0.f9372b;
        d30Var.f7202a = num;
        d30Var.f7203b = obj;
        d30Var.f7204c = 0;
        d30Var.f7205d = -9223372036854775807L;
        d30Var.f7207f = hl0Var;
        d30Var.f7206e = true;
        return d30Var;
    }

    @Override // m4.z40
    public final j40 e(int i10, j40 j40Var, long j3) {
        Object obj = j40.f9833n;
        j40Var.a(this.f12897b, false, true, null, -9223372036854775807L);
        j40Var.f9844j = true;
        return j40Var;
    }

    @Override // m4.z40
    public final Object f(int i10) {
        return pj2.f12536e;
    }
}
