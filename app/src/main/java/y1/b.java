package y1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public boolean f20260a;

    /* renamed from: b */
    public boolean f20261b;

    /* renamed from: c */
    public boolean f20262c;

    /* renamed from: d */
    public boolean f20263d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20260a = z10;
        this.f20261b = z11;
        this.f20262c = z12;
        this.f20263d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20260a == bVar.f20260a && this.f20261b == bVar.f20261b && this.f20262c == bVar.f20262c && this.f20263d == bVar.f20263d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final int hashCode() {
        ?? r02 = this.f20260a;
        int i10 = r02;
        if (this.f20261b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f20262c) {
            i11 = i10 + 256;
        }
        return this.f20263d ? i11 + 4096 : i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f20260a), Boolean.valueOf(this.f20261b), Boolean.valueOf(this.f20262c), Boolean.valueOf(this.f20263d));
    }
}
