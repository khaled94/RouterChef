package h2;

import a6.f;
import android.view.View;
import android.widget.FrameLayout;
import m4.es;
import m4.nt1;
import m4.qv0;
import m4.r7;
import m4.xc1;
import n3.v;
import q8.c;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4983s;

    /* renamed from: t */
    public final /* synthetic */ Object f4984t;

    public /* synthetic */ d0(Object obj, int i10) {
        this.f4983s = i10;
        this.f4984t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11 = false;
        switch (this.f4983s) {
            case 0:
                ((c) this.f4984t).a(t.f5037l);
                return;
            case 1:
                v vVar = (v) this.f4984t;
                vVar.f16583g = 4;
                vVar.b();
                return;
            case 2:
                if (((r7) this.f4984t).f13184b != null) {
                    return;
                }
                synchronized (r7.f13180c) {
                    if (((r7) this.f4984t).f13184b == null) {
                        try {
                            z10 = es.B1.e().booleanValue();
                        } catch (IllegalStateException unused) {
                            z10 = false;
                        }
                        if (z10) {
                            try {
                                r7.f13181d = nt1.a(((r7) this.f4984t).f13183a.f11550a, "ADSHIELD");
                            } catch (Throwable unused2) {
                            }
                        }
                        z11 = z10;
                        ((r7) this.f4984t).f13184b = Boolean.valueOf(z11);
                        r7.f13180c.open();
                    }
                }
                return;
            case 3:
                qv0 qv0Var = (qv0) this.f4984t;
                if (qv0Var.f13002x == null) {
                    View view = new View(qv0Var.f12999u.getContext());
                    qv0Var.f13002x = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (qv0Var.f12999u == qv0Var.f13002x.getParent()) {
                    return;
                }
                qv0Var.f12999u.addView(qv0Var.f13002x);
                return;
            default:
                ((xc1) this.f4984t).f15299d.f13592c.d(f.n(6, null, null));
                return;
        }
    }
}
