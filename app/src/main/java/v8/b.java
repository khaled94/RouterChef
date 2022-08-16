package v8;

import e9.f;

/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: w */
    public static final b f19824w = new b();

    /* renamed from: s */
    public final int f19825s = 1;

    /* renamed from: t */
    public final int f19826t = 6;

    /* renamed from: u */
    public final int f19827u = 21;

    /* renamed from: v */
    public final int f19828v = 67093;

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        f.e(bVar2, "other");
        return this.f19828v - bVar2.f19828v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f19828v == bVar.f19828v;
    }

    public final int hashCode() {
        return this.f19828v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19825s);
        sb.append('.');
        sb.append(this.f19826t);
        sb.append('.');
        sb.append(this.f19827u);
        return sb.toString();
    }
}
