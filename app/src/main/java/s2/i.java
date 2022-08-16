package s2;

import androidx.activity.result.a;
import s2.o;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a */
    public final o.b f17670a;

    /* renamed from: b */
    public final o.a f17671b;

    public i(o.b bVar, o.a aVar) {
        this.f17670a = bVar;
        this.f17671b = aVar;
    }

    @Override // s2.o
    public final o.a a() {
        return this.f17671b;
    }

    @Override // s2.o
    public final o.b b() {
        return this.f17670a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f17670a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f17671b;
            o.a a10 = oVar.a();
            if (aVar == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        o.b bVar = this.f17670a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        o.a aVar = this.f17671b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = a.c("NetworkConnectionInfo{networkType=");
        c10.append(this.f17670a);
        c10.append(", mobileSubtype=");
        c10.append(this.f17671b);
        c10.append("}");
        return c10.toString();
    }
}
