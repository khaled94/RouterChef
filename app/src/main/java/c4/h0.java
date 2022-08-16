package c4;

import a4.b;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import y4.f4;
import y4.m6;

/* loaded from: classes.dex */
public final class h0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f2699s;

    /* renamed from: t */
    public final /* synthetic */ Object f2700t;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f2699s = i10;
        this.f2700t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2699s) {
            case 0:
                ((z) ((j0) this.f2700t).y).b(new b(4, null, null));
                return;
            default:
                m6 m6Var = ((f4) this.f2700t).F;
                m6Var.f20586a.B().g();
                if (!m6Var.b()) {
                    return;
                }
                if (m6Var.c()) {
                    m6Var.f20586a.s().L.b(null);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "(not set)");
                    bundle.putString("medium", "(not set)");
                    bundle.putString("_cis", "intent");
                    bundle.putLong("_cc", 1L);
                    m6Var.f20586a.u().n("auto", "_cmpx", bundle);
                } else {
                    String a10 = m6Var.f20586a.s().L.a();
                    if (TextUtils.isEmpty(a10)) {
                        m6Var.f20586a.C().y.a("Cache still valid but referrer not found");
                    } else {
                        long a11 = ((m6Var.f20586a.s().M.a() / 3600000) - 1) * 3600000;
                        Uri parse = Uri.parse(a10);
                        Bundle bundle2 = new Bundle();
                        Pair pair = new Pair(parse.getPath(), bundle2);
                        for (String str : parse.getQueryParameterNames()) {
                            bundle2.putString(str, parse.getQueryParameter(str));
                        }
                        ((Bundle) pair.second).putLong("_cc", a11);
                        Object obj = pair.first;
                        m6Var.f20586a.u().n(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                    }
                    m6Var.f20586a.s().L.b(null);
                }
                m6Var.f20586a.s().M.b(0L);
                return;
        }
    }
}
