package n3;

import android.net.Uri;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import l3.s;
import m4.es;
import m4.jo;

/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f16523a;

    /* renamed from: b */
    public final /* synthetic */ Object f16524b;

    public /* synthetic */ l1(Object obj, int i10) {
        this.f16523a = i10;
        this.f16524b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16523a) {
            case 0:
                h1 h1Var = s1.f16555i;
                s1 s1Var = s.B.f5789c;
                return s1.p((Uri) this.f16524b);
            default:
                CookieManager cookieManager = (CookieManager) this.f16524b;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) jo.f10145d.f10148c.a(es.f8221w0));
        }
    }
}
