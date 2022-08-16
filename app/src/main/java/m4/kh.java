package m4;

import android.webkit.WebView;
import c5.g;
import c5.i;
import c5.k;
import c5.w;
import c5.z;
import java.util.concurrent.CancellationException;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class kh implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10426s;

    /* renamed from: t */
    public final /* synthetic */ Object f10427t;

    /* renamed from: u */
    public final /* synthetic */ Object f10428u;

    public kh(WebView webView, String str) {
        this.f10426s = 2;
        this.f10427t = webView;
        this.f10428u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar;
        Exception e10;
        switch (this.f10426s) {
            case 0:
                synchronized (((ac) this.f10427t)) {
                }
                return;
            case 1:
                try {
                    ((ar0) this.f10427t).mo30h(this.f10428u);
                    return;
                } catch (Throwable th) {
                    s.B.f5793g.f(th, "EventEmitter.notify");
                    g1.b("Event emitter exception.", th);
                    return;
                }
            case 2:
                ((WebView) this.f10427t).loadUrl((String) this.f10428u);
                return;
            default:
                try {
                    i a10 = ((w) this.f10428u).f2808t.a(((i) this.f10427t).j());
                    if (a10 == null) {
                        ((w) this.f10428u).e(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    z zVar = k.f2778b;
                    a10.d(zVar, (w) this.f10428u);
                    a10.c(zVar, (w) this.f10428u);
                    a10.a(zVar, (w) this.f10428u);
                    return;
                } catch (g e11) {
                    e10 = e11;
                    if (e10.getCause() instanceof Exception) {
                        wVar = (w) this.f10428u;
                        e10 = (Exception) e10.getCause();
                        wVar.e(e10);
                        return;
                    }
                    wVar = (w) this.f10428u;
                    wVar.e(e10);
                    return;
                } catch (CancellationException unused) {
                    ((w) this.f10428u).f2809u.s();
                    return;
                } catch (Exception e12) {
                    e10 = e12;
                    wVar = (w) this.f10428u;
                    wVar.e(e10);
                    return;
                }
        }
    }

    public /* synthetic */ kh(Object obj, Object obj2, int i10) {
        this.f10426s = i10;
        this.f10428u = obj;
        this.f10427t = obj2;
    }

    public /* synthetic */ kh(ar0 ar0Var, Object obj) {
        this.f10426s = 1;
        this.f10427t = ar0Var;
        this.f10428u = obj;
    }
}
