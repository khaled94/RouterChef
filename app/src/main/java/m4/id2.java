package m4;

/* loaded from: classes.dex */
public final class id2 {

    /* renamed from: j */
    public static final id2 f9598j = new id2(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final id2 f9599k = new id2(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final id2 f9600l = new id2(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final id2 f9601m = new id2(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f9602a;

    /* renamed from: b */
    public final double f9603b;

    /* renamed from: c */
    public final double f9604c;

    /* renamed from: d */
    public final double f9605d;

    /* renamed from: e */
    public final double f9606e;

    /* renamed from: f */
    public final double f9607f;

    /* renamed from: g */
    public final double f9608g;

    /* renamed from: h */
    public final double f9609h;

    /* renamed from: i */
    public final double f9610i;

    public id2(double d5, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f9602a = d13;
        this.f9603b = d14;
        this.f9604c = d15;
        this.f9605d = d5;
        this.f9606e = d10;
        this.f9607f = d11;
        this.f9608g = d12;
        this.f9609h = d16;
        this.f9610i = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || id2.class != obj.getClass()) {
            return false;
        }
        id2 id2Var = (id2) obj;
        return Double.compare(id2Var.f9605d, this.f9605d) == 0 && Double.compare(id2Var.f9606e, this.f9606e) == 0 && Double.compare(id2Var.f9607f, this.f9607f) == 0 && Double.compare(id2Var.f9608g, this.f9608g) == 0 && Double.compare(id2Var.f9609h, this.f9609h) == 0 && Double.compare(id2Var.f9610i, this.f9610i) == 0 && Double.compare(id2Var.f9602a, this.f9602a) == 0 && Double.compare(id2Var.f9603b, this.f9603b) == 0 && Double.compare(id2Var.f9604c, this.f9604c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9602a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9603b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f9604c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f9605d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f9606e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f9607f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f9608g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f9609h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f9610i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f9598j)) {
            return "Rotate 0°";
        }
        if (equals(f9599k)) {
            return "Rotate 90°";
        }
        if (equals(f9600l)) {
            return "Rotate 180°";
        }
        if (equals(f9601m)) {
            return "Rotate 270°";
        }
        double d5 = this.f9602a;
        double d10 = this.f9603b;
        double d11 = this.f9604c;
        double d12 = this.f9605d;
        double d13 = this.f9606e;
        double d14 = this.f9607f;
        double d15 = this.f9608g;
        double d16 = this.f9609h;
        double d17 = this.f9610i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d5);
        sb.append(", v=");
        sb.append(d10);
        sb.append(", w=");
        sb.append(d11);
        sb.append(", a=");
        sb.append(d12);
        sb.append(", b=");
        sb.append(d13);
        sb.append(", c=");
        sb.append(d14);
        sb.append(", d=");
        sb.append(d15);
        sb.append(", tx=");
        sb.append(d16);
        sb.append(", ty=");
        sb.append(d17);
        sb.append("}");
        return sb.toString();
    }
}
