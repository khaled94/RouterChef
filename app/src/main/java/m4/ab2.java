package m4;

/* loaded from: classes.dex */
public final class ab2 implements oa2 {

    /* renamed from: a */
    public final qa2 f6100a;

    /* renamed from: b */
    public final String f6101b;

    /* renamed from: c */
    public final Object[] f6102c;

    /* renamed from: d */
    public final int f6103d;

    public ab2(qa2 qa2Var, String str, Object[] objArr) {
        this.f6100a = qa2Var;
        this.f6101b = str;
        this.f6102c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6103d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f6103d = i10 | (charAt2 << i12);
                return;
            }
            i10 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i11 = i13;
        }
    }

    @Override // m4.oa2
    public final boolean a() {
        return (this.f6103d & 2) == 2;
    }

    @Override // m4.oa2
    public final int c() {
        return (this.f6103d & 1) == 1 ? 1 : 2;
    }

    @Override // m4.oa2
    public final qa2 zza() {
        return this.f6100a;
    }
}
