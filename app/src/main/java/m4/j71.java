package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j71 {

    /* renamed from: c */
    public em1 f9865c = null;

    /* renamed from: d */
    public cm1 f9866d = null;

    /* renamed from: b */
    public final Map<String, sn> f9864b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public final List<sn> f9863a = Collections.synchronizedList(new ArrayList());

    public final void a(cm1 cm1Var, long j3, cn cnVar) {
        String str = cm1Var.f7065x;
        if (!this.f9864b.containsKey(str)) {
            return;
        }
        if (this.f9866d == null) {
            this.f9866d = cm1Var;
        }
        sn snVar = this.f9864b.get(str);
        snVar.f13763t = j3;
        snVar.f13764u = cnVar;
    }
}
