package m4;

/* loaded from: classes.dex */
public final class sg0 {

    /* renamed from: a */
    public final int f13628a;

    /* renamed from: b */
    public final int f13629b;

    /* renamed from: c */
    public final int f13630c;

    /* renamed from: d */
    public final float f13631d;

    public sg0(int i10, int i11, int i12, float f10) {
        this.f13628a = i10;
        this.f13629b = i11;
        this.f13630c = i12;
        this.f13631d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sg0) {
            sg0 sg0Var = (sg0) obj;
            if (this.f13628a == sg0Var.f13628a && this.f13629b == sg0Var.f13629b && this.f13630c == sg0Var.f13630c && this.f13631d == sg0Var.f13631d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f13631d) + ((((((this.f13628a + 217) * 31) + this.f13629b) * 31) + this.f13630c) * 31);
    }
}
