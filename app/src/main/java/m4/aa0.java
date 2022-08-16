package m4;

import android.os.RemoteException;
import f3.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import n3.g1;
import p3.d;

@Deprecated
/* loaded from: classes.dex */
public class aa0 implements nu1, d, nq0 {

    /* renamed from: s */
    public final Object f6087s;

    /* renamed from: t */
    public final Object f6088t;

    public /* synthetic */ aa0() {
        w90 w90Var = new w90();
        this.f6087s = w90Var;
        this.f6088t = new AtomicInteger(0);
        mz1.t(w90Var, new o7(this, 1), u90.f14299f);
    }

    public /* synthetic */ aa0(a20 a20Var, l10 l10Var) {
        this.f6088t = a20Var;
        this.f6087s = l10Var;
    }

    public /* synthetic */ aa0(mu1 mu1Var) {
        au1 au1Var = au1.f6259a;
        this.f6088t = mu1Var;
        this.f6087s = au1Var;
    }

    public static aa0 a(x50 x50Var) {
        return new aa0(new lq0(x50Var));
    }

    public final Iterable b(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new ku1(this, charSequence);
    }

    @Deprecated
    public final int c() {
        return ((AtomicInteger) this.f6088t).get();
    }

    @Deprecated
    public final void d() {
        ((w90) this.f6087s).c(new Exception());
    }

    @Override // p3.d
    public final void e(a aVar) {
        try {
            String canonicalName = ((a20) this.f6088t).f6021s.getClass().getCanonicalName();
            int i10 = aVar.f4481a;
            String str = aVar.f4482b;
            String str2 = aVar.f4483c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(str).length() + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(i10);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            g1.e(sb.toString());
            ((l10) this.f6087s).w3(aVar.a());
            ((l10) this.f6087s).g1(aVar.f4481a, aVar.f4482b);
            ((l10) this.f6087s).A(aVar.f4481a);
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Deprecated
    public final void f(z90 z90Var, y90 y90Var) {
        mz1.t((w90) this.f6087s, new l70(z90Var, y90Var), u90.f14299f);
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        ((lc1) obj).c((String) this.f6087s, (String) this.f6088t);
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public final Object mo19zza() {
        return ((yr) this.f6088t).c(((ds) this.f6087s).f7620e);
    }
}
