package m4;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a */
    public final String f6027a;

    /* renamed from: b */
    public final int f6028b;

    /* renamed from: c */
    public final int f6029c;

    /* renamed from: d */
    public int f6030d;

    /* renamed from: e */
    public String f6031e;

    public a3(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i10);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f6027a = str;
        this.f6028b = i11;
        this.f6029c = i12;
        this.f6030d = Integer.MIN_VALUE;
        this.f6031e = "";
    }

    public final int a() {
        int i10 = this.f6030d;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final String b() {
        if (this.f6030d != Integer.MIN_VALUE) {
            return this.f6031e;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final void c() {
        int i10 = this.f6030d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f6028b : i10 + this.f6029c;
        this.f6030d = i11;
        String str = this.f6027a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i11);
        this.f6031e = sb.toString();
    }
}
