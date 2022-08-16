package s4;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: s */
    public final n f17854s;

    /* renamed from: t */
    public final String f17855t;

    public f() {
        throw null;
    }

    public f(String str) {
        this.f17854s = n.f18009j;
        this.f17855t = str;
    }

    public f(String str, n nVar) {
        this.f17854s = nVar;
        this.f17855t = str;
    }

    @Override // s4.n
    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17855t.equals(fVar.f17855t) && this.f17854s.equals(fVar.f17854s);
    }

    @Override // s4.n
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // s4.n
    public final n g() {
        return new f(this.f17855t, this.f17854s.g());
    }

    @Override // s4.n
    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.f17854s.hashCode() + (this.f17855t.hashCode() * 31);
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return null;
    }
}
