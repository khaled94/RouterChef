package m4;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public int f13473a;

    /* renamed from: b */
    public final Object f13474b;

    public /* synthetic */ s(o50 o50Var, int i10) {
        this.f13474b = o50Var;
        this.f13473a = i10;
    }

    public final long a(uo2 uo2Var) {
        qo2 qo2Var = (qo2) uo2Var;
        int i10 = 0;
        qo2Var.o((byte[]) ((dd) this.f13474b).f7311d, 0, 1, false);
        int i11 = ((byte[]) ((dd) this.f13474b).f7311d)[0] & 255;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            qo2Var.o((byte[]) ((dd) this.f13474b).f7311d, 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (((byte[]) ((dd) this.f13474b).f7311d)[i10] & 255) + (i14 << 8);
            }
            this.f13473a = i13 + 1 + this.f13473a;
            return i14;
        }
        return Long.MIN_VALUE;
    }

    public final String b() {
        return ((o50) this.f13474b).f11998v;
    }
}
