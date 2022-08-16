package x8;

import d9.p;
import e9.g;
import java.io.Serializable;
import java.util.Objects;
import x8.f;

/* loaded from: classes.dex */
public final class c implements f, Serializable {

    /* renamed from: s */
    public final f f20098s;

    /* renamed from: t */
    public final f.b f20099t;

    /* loaded from: classes.dex */
    public static final class a extends g implements p<String, f.b, String> {

        /* renamed from: t */
        public static final a f20100t = new a();

        public a() {
            super(2);
        }

        @Override // d9.p
        public final String b(String str, f.b bVar) {
            String str2 = str;
            f.b bVar2 = bVar;
            e9.f.e(str2, "acc");
            e9.f.e(bVar2, "element");
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public c(f fVar, f.b bVar) {
        e9.f.e(fVar, "left");
        e9.f.e(bVar, "element");
        this.f20098s = fVar;
        this.f20099t = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            Objects.requireNonNull(cVar);
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                f fVar = cVar2.f20098s;
                cVar2 = fVar instanceof c ? (c) fVar : null;
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f20098s;
                cVar3 = fVar2 instanceof c ? (c) fVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar4 = this;
            while (true) {
                f.b bVar = cVar4.f20099t;
                if (e9.f.a(cVar.get(bVar.getKey()), bVar)) {
                    f fVar3 = cVar4.f20098s;
                    if (!(fVar3 instanceof c)) {
                        f.b bVar2 = (f.b) fVar3;
                        z10 = e9.f.a(cVar.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // x8.f
    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.b((Object) this.f20098s.fold(r10, pVar), this.f20099t);
    }

    @Override // x8.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        e9.f.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f20099t.get(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f20098s;
            if (!(fVar instanceof c)) {
                return (E) fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final int hashCode() {
        return this.f20099t.hashCode() + this.f20098s.hashCode();
    }

    @Override // x8.f
    public final f minusKey(f.c<?> cVar) {
        e9.f.e(cVar, "key");
        if (this.f20099t.get(cVar) != null) {
            return this.f20098s;
        }
        f minusKey = this.f20098s.minusKey(cVar);
        return minusKey == this.f20098s ? this : minusKey == g.f20104s ? this.f20099t : new c(minusKey, this.f20099t);
    }

    public final String toString() {
        return '[' + ((String) fold("", a.f20100t)) + ']';
    }
}
