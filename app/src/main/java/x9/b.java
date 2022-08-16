package x9;

import ca.i;
import s9.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d */
    public static final i f20105d = i.h(":");

    /* renamed from: e */
    public static final i f20106e = i.h(":status");

    /* renamed from: f */
    public static final i f20107f = i.h(":method");

    /* renamed from: g */
    public static final i f20108g = i.h(":path");

    /* renamed from: h */
    public static final i f20109h = i.h(":scheme");

    /* renamed from: i */
    public static final i f20110i = i.h(":authority");

    /* renamed from: a */
    public final i f20111a;

    /* renamed from: b */
    public final i f20112b;

    /* renamed from: c */
    public final int f20113c;

    public b(i iVar, i iVar2) {
        this.f20111a = iVar;
        this.f20112b = iVar2;
        this.f20113c = iVar2.n() + iVar.n() + 32;
    }

    public b(i iVar, String str) {
        this(iVar, i.h(str));
    }

    public b(String str, String str2) {
        this(i.h(str), i.h(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f20111a.equals(bVar.f20111a) && this.f20112b.equals(bVar.f20112b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20112b.hashCode() + ((this.f20111a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return e.j("%s: %s", this.f20111a.q(), this.f20112b.q());
    }
}
