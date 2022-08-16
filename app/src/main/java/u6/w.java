package u6;

import androidx.activity.result.a;
import u6.c0;

/* loaded from: classes.dex */
public final class w extends c0 {

    /* renamed from: a */
    public final c0.a f19445a;

    /* renamed from: b */
    public final c0.c f19446b;

    /* renamed from: c */
    public final c0.b f19447c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        this.f19445a = aVar;
        this.f19446b = cVar;
        this.f19447c = bVar;
    }

    @Override // u6.c0
    public final c0.a a() {
        return this.f19445a;
    }

    @Override // u6.c0
    public final c0.b b() {
        return this.f19447c;
    }

    @Override // u6.c0
    public final c0.c c() {
        return this.f19446b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f19445a.equals(c0Var.a()) && this.f19446b.equals(c0Var.c()) && this.f19447c.equals(c0Var.b());
    }

    public final int hashCode() {
        return ((((this.f19445a.hashCode() ^ 1000003) * 1000003) ^ this.f19446b.hashCode()) * 1000003) ^ this.f19447c.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = a.c("StaticSessionData{appData=");
        c10.append(this.f19445a);
        c10.append(", osData=");
        c10.append(this.f19446b);
        c10.append(", deviceData=");
        c10.append(this.f19447c);
        c10.append("}");
        return c10.toString();
    }
}
