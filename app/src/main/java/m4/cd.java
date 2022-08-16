package m4;

/* loaded from: classes.dex */
public final class cd {

    /* renamed from: a */
    public int f6784a;

    /* renamed from: b */
    public int f6785b;

    /* renamed from: c */
    public Object f6786c;

    /* renamed from: d */
    public Object f6787d;

    public cd(int i10, int i11) {
        if (i11 != 1) {
            this.f6786c = new pd[i10];
            this.f6785b = 0;
            return;
        }
        this.f6786c = new long[10];
        this.f6787d = new Object[10];
    }

    public final Object a() {
        r01.h(this.f6785b > 0);
        Object[] objArr = (Object[]) this.f6787d;
        int i10 = this.f6784a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f6784a = (i10 + 1) % objArr.length;
        this.f6785b--;
        return obj;
    }
}
