package w7;

import android.content.Context;
import n6.b;
import n6.c;
import n6.e;
import n6.n;
import n6.z;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public interface a<T> {
        String b(T t10);
    }

    public static b<?> a(String str, String str2) {
        w7.a aVar = new w7.a(str, str2);
        b.C0097b a10 = b.a(d.class);
        a10.f16625d = 1;
        a10.f16626e = new n6.a(aVar);
        return a10.b();
    }

    public static b<?> b(final String str, final a<Context> aVar) {
        b.C0097b a10 = b.a(d.class);
        a10.f16625d = 1;
        a10.a(new n(Context.class, 1, 0));
        a10.f16626e = new e() { // from class: w7.e
            @Override // n6.e
            public final Object a(c cVar) {
                return new a(str, aVar.b((Context) ((z) cVar).a(Context.class)));
            }
        };
        return a10.b();
    }
}
