package m4;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import n3.g1;

/* loaded from: classes.dex */
public class k11 {

    /* renamed from: a */
    public final Map<String, String> f10236a = new HashMap();

    /* renamed from: b */
    public final Executor f10237b;

    /* renamed from: c */
    public final n90 f10238c;

    /* renamed from: d */
    public final boolean f10239d;

    /* renamed from: e */
    public final mp1 f10240e;

    public k11(Executor executor, n90 n90Var, mp1 mp1Var) {
        boolean z10;
        ht.f9445b.e();
        this.f10237b = executor;
        this.f10238c = n90Var;
        yr<Boolean> yrVar = es.f8120j1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            z10 = ((Boolean) joVar.f10148c.a(es.f8151n1)).booleanValue();
        } else {
            z10 = ((double) io.f9708f.f9713e.nextFloat()) <= ht.f9444a.e().doubleValue();
        }
        this.f10239d = z10;
        this.f10240e = mp1Var;
    }

    public final void a(Map<String, String> map) {
        String a10 = this.f10240e.a(map);
        if (this.f10239d) {
            this.f10237b.execute(new kj0(this, a10, 1));
        }
        g1.a(a10);
    }
}
