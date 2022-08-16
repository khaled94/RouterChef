package c4;

import a4.d;
import d4.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public final b<?> f2755a;

    /* renamed from: b */
    public final d f2756b;

    public /* synthetic */ x(b bVar, d dVar) {
        this.f2755a = bVar;
        this.f2756b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            x xVar = (x) obj;
            if (l.a(this.f2755a, xVar.f2755a) && l.a(this.f2756b, xVar.f2756b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2755a, this.f2756b});
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a("key", this.f2755a);
        aVar.a("feature", this.f2756b);
        return aVar.toString();
    }
}
