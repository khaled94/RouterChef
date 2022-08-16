package m4;

/* loaded from: classes.dex */
public final class cf0 {

    /* renamed from: a */
    public final int f6814a;

    /* renamed from: b */
    public final int f6815b;

    /* renamed from: c */
    public final int f6816c;

    public cf0(int i10, int i11, int i12) {
        this.f6814a = i10;
        this.f6816c = i11;
        this.f6815b = i12;
    }

    public static cf0 a() {
        return new cf0(0, 0, 0);
    }

    public static cf0 b(int i10, int i11) {
        return new cf0(1, i10, i11);
    }

    public static cf0 c(on onVar) {
        return onVar.f12223v ? new cf0(3, 0, 0) : onVar.A ? new cf0(2, 0, 0) : onVar.f12226z ? a() : b(onVar.f12225x, onVar.f12222u);
    }

    public final boolean d() {
        return this.f6814a == 3;
    }
}
