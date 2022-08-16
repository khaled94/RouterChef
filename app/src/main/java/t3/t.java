package t3;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import java.util.Objects;
import l3.s;
import m4.bi;
import m4.bw1;
import m4.di2;
import m4.ei;
import m4.eo2;
import m4.es;
import m4.fi;
import m4.fo2;
import m4.ji2;
import m4.jo;
import m4.ls1;
import m4.mz1;
import m4.sy1;
import m4.ty0;
import m4.tz1;
import m4.xh;
import m4.yh;
import m4.zh;
import m4.zm1;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f18611s;

    /* renamed from: t */
    public final /* synthetic */ Object f18612t;

    /* renamed from: u */
    public final /* synthetic */ Object f18613u;

    public /* synthetic */ t(Object obj, Object obj2, int i10) {
        this.f18611s = i10;
        this.f18612t = obj;
        this.f18613u = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<m4.xh>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Deque<m4.tz1<T>>, java.util.concurrent.LinkedBlockingDeque] */
    @Override // java.lang.Runnable
    public final void run() {
        Application application;
        IllegalStateException e10;
        boolean z10 = false;
        switch (this.f18611s) {
            case 0:
                z zVar = (z) this.f18612t;
                Objects.requireNonNull(zVar);
                ty0 ty0Var = ((ty0[]) this.f18613u)[0];
                if (ty0Var == null) {
                    return;
                }
                zm1<ty0> zm1Var = zVar.f18629w;
                tz1 m10 = mz1.m(ty0Var);
                synchronized (zm1Var) {
                    zm1Var.f16280a.addFirst(m10);
                }
                return;
            case 1:
                fi fiVar = (fi) this.f18613u;
                View view = (View) this.f18612t;
                Objects.requireNonNull(fiVar);
                try {
                    xh xhVar = new xh(fiVar.f8563x, fiVar.y, fiVar.f8564z, fiVar.A, fiVar.B, fiVar.C, fiVar.D, fiVar.G);
                    bi biVar = s.B.f5792f;
                    synchronized (biVar.f6539a) {
                        zh zhVar = biVar.f6540b;
                        application = zhVar != null ? zhVar.f16229t : null;
                    }
                    if (application != null && !TextUtils.isEmpty(fiVar.E)) {
                        String str = (String) view.getTag(application.getResources().getIdentifier((String) jo.f10145d.f10148c.a(es.N), "id", application.getPackageName()));
                        if (str != null && str.equals(fiVar.E)) {
                            return;
                        }
                    }
                    ei a10 = fiVar.a(view, xhVar);
                    xhVar.b();
                    if (a10.f7969a == 0 && a10.f7970b == 0) {
                        return;
                    }
                    int i10 = a10.f7970b;
                    if (i10 == 0 && xhVar.f15354k == 0) {
                        return;
                    }
                    if (i10 == 0) {
                        yh yhVar = fiVar.f8561v;
                        synchronized (yhVar.f15781a) {
                            if (yhVar.f15783c.contains(xhVar)) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            return;
                        }
                    }
                    fiVar.f8561v.a(xhVar);
                    return;
                } catch (Exception e11) {
                    g1.h("Exception in fetchContentOnUIThread", e11);
                    s.B.f5793g.g(e11, "ContentFetchTask.fetchContent");
                    return;
                }
            case 2:
                ((sy1) this.f18612t).t((bw1) this.f18613u);
                return;
            case 3:
                ji2 ji2Var = (ji2) this.f18612t;
                Runnable runnable = (Runnable) this.f18613u;
                synchronized (ji2Var.f10084a) {
                    if (!ji2Var.f10095l) {
                        long j3 = ji2Var.f10094k - 1;
                        ji2Var.f10094k = j3;
                        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i11 <= 0) {
                            if (i11 < 0) {
                                e10 = new IllegalStateException();
                            } else {
                                ji2Var.a();
                                try {
                                    ((di2) runnable).f7518s.start();
                                } catch (IllegalStateException e12) {
                                    e10 = e12;
                                } catch (Exception e13) {
                                    ji2Var.b(new IllegalStateException(e13));
                                }
                            }
                            ji2Var.b(e10);
                        }
                    }
                }
                return;
            default:
                fo2 fo2Var = ((eo2) this.f18612t).f8030b;
                int i12 = ls1.f10971a;
                fo2Var.k((Exception) this.f18613u);
                return;
        }
    }

    public t(fi fiVar, View view) {
        this.f18611s = 1;
        this.f18613u = fiVar;
        this.f18612t = view;
    }
}
