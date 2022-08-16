package s2;

import androidx.activity.result.a;
import s2.k;

/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a */
    public final k.a f17646a;

    /* renamed from: b */
    public final a f17647b;

    public e(k.a aVar, a aVar2) {
        this.f17646a = aVar;
        this.f17647b = aVar2;
    }

    @Override // s2.k
    public final a a() {
        return this.f17647b;
    }

    @Override // s2.k
    public final k.a b() {
        return this.f17646a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f17646a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f17647b;
            a a10 = kVar.a();
            if (aVar2 == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar2.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        k.a aVar = this.f17646a;
        int i10 = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f17647b;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = a.c("ClientInfo{clientType=");
        c10.append(this.f17646a);
        c10.append(", androidClientInfo=");
        c10.append(this.f17647b);
        c10.append("}");
        return c10.toString();
    }
}
