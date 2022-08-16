package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class bs implements nu1, w70, yl0, tc1 {

    /* renamed from: s */
    public final /* synthetic */ Object f6607s;

    public /* synthetic */ bs(Object obj) {
        this.f6607s = obj;
    }

    @Override // m4.tc1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        hz0 hz0Var = (hz0) obj;
        synchronized (((yl1) this.f6607s)) {
            Object obj2 = this.f6607s;
            ((yl1) obj2).f15836x = hz0Var;
            ((yl1) obj2).f15836x.b();
        }
    }

    @Override // m4.w70
    public final void b(ef0 ef0Var) {
        ef0Var.b2((Bundle) this.f6607s);
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public final Object mo19zza() {
        return ((ds) this.f6607s).f7620e.getString("flag_configuration", "{}");
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public final lq mo19zza() {
        return ((vd0) this.f6607s).p();
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public final void mo19zza() {
        synchronized (((yl1) this.f6607s)) {
            ((yl1) this.f6607s).f15836x = null;
        }
    }
}
