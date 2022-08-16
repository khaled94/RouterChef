package j0;

import j0.l;
import java.util.ArrayList;
import l0.a;
import r.g;

/* loaded from: classes.dex */
public final class k implements a<l.a> {

    /* renamed from: a */
    public final /* synthetic */ String f5407a;

    public k(String str) {
        this.f5407a = str;
    }

    @Override // l0.a
    public final void a(l.a aVar) {
        l.a aVar2 = aVar;
        synchronized (l.f5410c) {
            g<String, ArrayList<a<l.a>>> gVar = l.f5411d;
            ArrayList<a<l.a>> orDefault = gVar.getOrDefault(this.f5407a, null);
            if (orDefault == null) {
                return;
            }
            gVar.remove(this.f5407a);
            for (int i10 = 0; i10 < orDefault.size(); i10++) {
                orDefault.get(i10).a(aVar2);
            }
        }
    }
}
