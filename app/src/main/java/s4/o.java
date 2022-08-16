package s4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: s */
    public final String f18035s;

    /* renamed from: t */
    public final ArrayList<n> f18036t;

    public o(String str, List<n> list) {
        this.f18035s = str;
        ArrayList<n> arrayList = new ArrayList<>();
        this.f18036t = arrayList;
        arrayList.addAll(list);
    }

    @Override // s4.n
    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = this.f18035s;
        if (str == null ? oVar.f18035s != null : !str.equals(oVar.f18035s)) {
            return false;
        }
        return this.f18036t.equals(oVar.f18036t);
    }

    @Override // s4.n
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // s4.n
    public final n g() {
        return this;
    }

    @Override // s4.n
    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f18035s;
        return this.f18036t.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return null;
    }
}
