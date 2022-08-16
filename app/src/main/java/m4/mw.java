package m4;

import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class mw implements lx<Object> {

    /* renamed from: s */
    public final nw f11326s;

    public mw(nw nwVar) {
        this.f11326s = nwVar;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            g1.j("App event with no name parameter.");
        } else {
            this.f11326s.d0(str, map.get("info"));
        }
    }
}
