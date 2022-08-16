package i9;

import e9.f;
import java.util.Iterator;
import l4.b;

/* loaded from: classes.dex */
public class e extends b {
    public static final b v(Iterator it) {
        f.e(it, "<this>");
        d dVar = new d(it);
        return dVar instanceof a ? dVar : new a(dVar);
    }
}
