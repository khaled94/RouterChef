package m0;

import android.view.View;
import c1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import s4.a4;
import s4.aa;
import s4.h;
import s4.j;
import s4.n;
import s4.r;
import y4.d1;
import y4.e1;
import y4.f1;
import z7.m;

/* loaded from: classes.dex */
public class h0 implements g0, d1, m {

    /* renamed from: s */
    public static final /* synthetic */ h0 f5876s = new h0();

    public static n e(j jVar, n nVar, a4 a4Var, List list) {
        r rVar = (r) nVar;
        if (jVar.d(rVar.f18078s)) {
            n O = jVar.O(rVar.f18078s);
            if (!(O instanceof h)) {
                throw new IllegalArgumentException(String.format("%s is not a function", rVar.f18078s));
            }
            return ((h) O).a(a4Var, list);
        } else if (!"hasOwnProperty".equals(rVar.f18078s)) {
            throw new IllegalArgumentException(String.format("Object has no function %s", rVar.f18078s));
        } else {
            f.m("hasOwnProperty", 1, list);
            return jVar.d(a4Var.b((n) ((ArrayList) list).get(0)).h()) ? n.f18014o : n.p;
        }
    }

    @Override // m0.g0
    public void b(View view) {
    }

    @Override // z7.m
    public Object c() {
        return new TreeSet();
    }

    @Override // m0.g0
    public void d() {
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Integer.valueOf((int) aa.f17726t.zza().f());
    }
}
