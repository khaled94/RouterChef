package m4;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public class me {

    /* renamed from: a */
    public final Uri f11167a;

    /* renamed from: b */
    public final List f11168b;

    /* renamed from: c */
    public final gw1<ug> f11169c;

    public /* synthetic */ me(Uri uri, List list, gw1 gw1Var) {
        this.f11167a = uri;
        this.f11168b = list;
        this.f11169c = gw1Var;
        dw1 o10 = gw1.o();
        if (gw1Var.size() <= 0) {
            o10.p();
        } else {
            ug ugVar = (ug) gw1Var.get(0);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me)) {
            return false;
        }
        me meVar = (me) obj;
        return this.f11167a.equals(meVar.f11167a) && ls1.f(null, null) && ls1.f(null, null) && ls1.f(null, null) && this.f11168b.equals(meVar.f11168b) && ls1.f(null, null) && this.f11169c.equals(meVar.f11169c) && ls1.f(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f11168b.hashCode();
        return (this.f11169c.hashCode() + ((hashCode + (this.f11167a.hashCode() * 923521)) * 961)) * 31;
    }
}
