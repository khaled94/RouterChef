package m4;

import android.os.ParcelFileDescriptor;
import n3.c0;
import n3.d0;

/* loaded from: classes.dex */
public final class f41 extends k50 {

    /* renamed from: s */
    public final /* synthetic */ g41 f8353s;

    public f41(g41 g41Var) {
        this.f8353s = g41Var;
    }

    @Override // m4.l50
    public final void W0(d0 d0Var) {
        this.f8353s.f8745a.c(new c0(d0Var.f16452s, d0Var.f16453t));
    }

    @Override // m4.l50
    public final void t0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8353s.f8745a.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
