package m4;

/* loaded from: classes.dex */
public final class pt {

    /* renamed from: d */
    public static final pt f12618d = new pt(1.0f, 1.0f);

    /* renamed from: a */
    public final float f12619a;

    /* renamed from: b */
    public final float f12620b;

    /* renamed from: c */
    public final int f12621c;

    public pt(float f10, float f11) {
        boolean z10 = true;
        r01.f(f10 > 0.0f);
        r01.f(f11 <= 0.0f ? false : z10);
        this.f12619a = f10;
        this.f12620b = f11;
        this.f12621c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pt.class == obj.getClass()) {
            pt ptVar = (pt) obj;
            if (this.f12619a == ptVar.f12619a && this.f12620b == ptVar.f12620b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f12620b) + ((Float.floatToRawIntBits(this.f12619a) + 527) * 31);
    }

    public final String toString() {
        return ls1.c("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f12619a), Float.valueOf(this.f12620b));
    }
}
