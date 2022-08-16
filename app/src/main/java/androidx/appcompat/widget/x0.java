package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public int f1036a = 0;

    /* renamed from: b */
    public int f1037b = 0;

    /* renamed from: c */
    public int f1038c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1039d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1040e = 0;

    /* renamed from: f */
    public int f1041f = 0;

    /* renamed from: g */
    public boolean f1042g = false;

    /* renamed from: h */
    public boolean f1043h = false;

    public final void a(int i10, int i11) {
        this.f1038c = i10;
        this.f1039d = i11;
        this.f1043h = true;
        if (this.f1042g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1036a = i11;
            }
            if (i10 == Integer.MIN_VALUE) {
                return;
            }
            this.f1037b = i10;
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1036a = i10;
        }
        if (i11 == Integer.MIN_VALUE) {
            return;
        }
        this.f1037b = i11;
    }
}
