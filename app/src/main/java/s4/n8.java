package s4;

/* loaded from: classes.dex */
public final class n8 implements b8 {

    /* renamed from: a */
    public final d8 f18029a;

    /* renamed from: b */
    public final String f18030b;

    /* renamed from: c */
    public final Object[] f18031c;

    /* renamed from: d */
    public final int f18032d;

    public n8(d8 d8Var, String str, Object[] objArr) {
        this.f18029a = d8Var;
        this.f18030b = str;
        this.f18031c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f18032d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f18032d = i10 | (charAt2 << i12);
                return;
            }
            i10 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i11 = i13;
        }
    }

    @Override // s4.b8
    public final boolean a() {
        return (this.f18032d & 2) == 2;
    }

    @Override // s4.b8
    public final int c() {
        return (this.f18032d & 1) == 1 ? 1 : 2;
    }

    @Override // s4.b8
    public final d8 zza() {
        return this.f18029a;
    }
}
