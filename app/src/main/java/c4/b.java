package c4;

import b4.a;
import b4.a.c;
import d4.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b<O extends a.c> {

    /* renamed from: a */
    public final int f2669a;

    /* renamed from: b */
    public final a<O> f2670b;

    /* renamed from: c */
    public final O f2671c;

    /* renamed from: d */
    public final String f2672d;

    public b(a<O> aVar, O o10, String str) {
        this.f2670b = aVar;
        this.f2671c = o10;
        this.f2672d = str;
        this.f2669a = Arrays.hashCode(new Object[]{aVar, o10, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f2670b, bVar.f2670b) && l.a(this.f2671c, bVar.f2671c) && l.a(this.f2672d, bVar.f2672d);
    }

    public final int hashCode() {
        return this.f2669a;
    }
}
