package t2;

import java.util.Set;
import q2.b;
import q2.e;
import q2.f;
import q2.g;

/* loaded from: classes.dex */
public final class s implements g {

    /* renamed from: a */
    public final Set<b> f18546a;

    /* renamed from: b */
    public final r f18547b;

    /* renamed from: c */
    public final v f18548c;

    public s(Set<b> set, r rVar, v vVar) {
        this.f18546a = set;
        this.f18547b = rVar;
        this.f18548c = vVar;
    }

    @Override // q2.g
    public final f a(String str, b bVar, e eVar) {
        if (this.f18546a.contains(bVar)) {
            return new u(this.f18547b, str, bVar, eVar, this.f18548c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f18546a));
    }
}
