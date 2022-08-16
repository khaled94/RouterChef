package m4;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import k4.b;

/* loaded from: classes.dex */
public final class f81 implements l71<ik0, u20, o81> {

    /* renamed from: a */
    public final Context f8369a;

    /* renamed from: b */
    public final dl0 f8370b;

    /* renamed from: c */
    public View f8371c;

    /* renamed from: d */
    public n10 f8372d;

    public f81(Context context, dl0 dl0Var) {
        this.f8369a = context;
        this.f8370b = dl0Var;
    }

    @Override // m4.l71
    public final ik0 a(km1 km1Var, final cm1 cm1Var, h71<u20, o81> h71Var) {
        final View view;
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8070c5)).booleanValue() || !cm1Var.f7041e0) {
            view = this.f8371c;
        } else {
            try {
                view = (View) b.e0(this.f8372d.b());
                boolean d5 = this.f8372d.d();
                if (view == null) {
                    throw new pm1(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (d5) {
                    try {
                        view = (View) ((my1) mz1.p(mz1.m(null), new xy1() { // from class: m4.d81
                            @Override // m4.xy1
                            public final tz1 h(Object obj) {
                                f81 f81Var = f81.this;
                                return mz1.m(ql0.a(f81Var.f8369a, view, cm1Var));
                            }
                        }, u90.f14298e)).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new pm1(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new pm1(e11);
            }
        }
        jk0 a10 = this.f8370b.a(new lm0(km1Var, cm1Var, h71Var.f9128a), new qk0(view, null, new e7(h71Var, 6), cm1Var.f7063v.get(0)));
        ((lg0) a10).f10775a1.a().O0(view);
        h71Var.f9130c.O3(a10.l());
        return a10.n();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        try {
            h71Var.f9129b.U(cm1Var.W);
            if (((Boolean) jo.f10145d.f10148c.a(es.f8070c5)).booleanValue() && cm1Var.f7041e0) {
                h71Var.f9129b.x0(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f8369a), new e81(this, h71Var), h71Var.f9130c, ((om1) km1Var.f10488a.f8363t).f12204e);
            } else {
                h71Var.f9129b.l1(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f8369a), new e81(this, h71Var), h71Var.f9130c, ((om1) km1Var.f10488a.f8363t).f12204e);
            }
        } catch (RemoteException e10) {
            throw new pm1(e10);
        }
    }
}
