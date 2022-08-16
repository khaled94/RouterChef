package s;

/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: a */
    public final Object[] f17575a = new Object[256];

    /* renamed from: b */
    public int f17576b;

    public final T a() {
        int i10 = this.f17576b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f17575a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f17576b = i10 - 1;
            return t10;
        }
        return null;
    }

    public final boolean b(T t10) {
        int i10 = this.f17576b;
        Object[] objArr = this.f17575a;
        if (i10 < objArr.length) {
            objArr[i10] = t10;
            this.f17576b = i10 + 1;
            return true;
        }
        return false;
    }
}
