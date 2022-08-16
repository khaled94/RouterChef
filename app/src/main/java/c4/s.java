package c4;

import android.os.Binder;
import java.util.Iterator;
import java.util.Objects;
import m4.ai;
import m4.c01;
import m4.km0;
import m4.qy;
import m4.zh;
import n3.g1;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f2730s;

    /* renamed from: t */
    public final /* synthetic */ Object f2731t;

    public /* synthetic */ s(Object obj, int i10) {
        this.f2730s = i10;
        this.f2731t = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<m4.ai>, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2730s) {
            case 0:
                ((w) this.f2731t).f();
                return;
            case 1:
                synchronized (((zh) this.f2731t).f16230u) {
                    Object obj = this.f2731t;
                    if (!((zh) obj).f16231v || !((zh) obj).f16232w) {
                        g1.e("App is still foreground");
                    } else {
                        ((zh) obj).f16231v = false;
                        g1.e("App went background");
                        Iterator it = ((zh) this.f2731t).f16233x.iterator();
                        while (it.hasNext()) {
                            try {
                                ((ai) it.next()).J(false);
                            } catch (Exception e10) {
                                g1.h("", e10);
                            }
                        }
                    }
                }
                return;
            case 2:
                qy qyVar = (qy) this.f2731t;
                if (qyVar.f13017a == null) {
                    return;
                }
                qyVar.f13017a.p();
                Binder.flushPendingCommands();
                return;
            case 3:
                ((km0) this.f2731t).f10487d = false;
                return;
            default:
                Objects.requireNonNull((c01) this.f2731t);
                return;
        }
    }
}
