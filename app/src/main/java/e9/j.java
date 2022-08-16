package e9;

import h9.a;
import h9.d;
import s.b;

/* loaded from: classes.dex */
public abstract class j extends a implements d {
    public j() {
    }

    public j(Object obj) {
        super(obj, true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return c().equals(jVar.c()) && this.f4451v.equals(jVar.f4451v) && this.f4452w.equals(jVar.f4452w) && f.a(this.f4449t, jVar.f4449t);
        } else if (!(obj instanceof d)) {
            return false;
        } else {
            a aVar = this.f4448s;
            if (aVar == null) {
                aVar = b();
                this.f4448s = aVar;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        return this.f4452w.hashCode() + androidx.fragment.app.a.a(this.f4451v, c().hashCode() * 31, 31);
    }

    public final String toString() {
        a aVar = this.f4448s;
        if (aVar == null) {
            aVar = b();
            this.f4448s = aVar;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        return b.b(androidx.activity.result.a.c("property "), this.f4451v, " (Kotlin reflection is not available)");
    }
}
