package m4;

/* loaded from: classes.dex */
public final class xa {

    /* renamed from: c */
    public static final xa f15258c = new xa(1.0f);

    /* renamed from: a */
    public final float f15259a;

    /* renamed from: b */
    public final int f15260b;

    public xa(float f10) {
        this.f15259a = f10;
        this.f15260b = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xa.class == obj.getClass() && this.f15259a == ((xa) obj).f15259a;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(1.0f) + ((Float.floatToRawIntBits(this.f15259a) + 527) * 31);
    }
}
