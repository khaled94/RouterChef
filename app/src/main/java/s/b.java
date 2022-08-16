package s;

import java.util.Set;
import n6.c;
import n6.e;
import n6.z;
import w7.d;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* renamed from: s */
    public static final /* synthetic */ b f17549s = new b();

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // n6.e
    public Object a(c cVar) {
        Set b10 = ((z) cVar).b(d.class);
        w7.c cVar2 = w7.c.f19935b;
        if (cVar2 == null) {
            synchronized (w7.c.class) {
                cVar2 = w7.c.f19935b;
                if (cVar2 == null) {
                    cVar2 = new w7.c(0);
                    w7.c.f19935b = cVar2;
                }
            }
        }
        return new w7.b(b10, cVar2);
    }
}
