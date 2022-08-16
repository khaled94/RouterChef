package s4;

import c1.f;
import java.util.List;
import java.util.Map;
import m4.wn;
import y4.p2;

/* loaded from: classes.dex */
public final class u8 extends h {

    /* renamed from: u */
    public final /* synthetic */ wn f18138u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(wn wnVar) {
        super("getValue");
        this.f18138u = wnVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, r.g] */
    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        f.m("getValue", 2, list);
        n b10 = a4Var.b(list.get(0));
        n b11 = a4Var.b(list.get(1));
        String h10 = b10.h();
        wn wnVar = this.f18138u;
        String str = null;
        Map map = (Map) ((p2) wnVar.f15064s).f20645v.getOrDefault((String) wnVar.f15065t, null);
        if (map != null && map.containsKey(h10)) {
            str = (String) map.get(h10);
        }
        return str != null ? new r(str) : b11;
    }
}
