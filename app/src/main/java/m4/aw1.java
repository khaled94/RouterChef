package m4;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class aw1<E> extends x50 {

    /* renamed from: a */
    public Object[] f6280a;

    /* renamed from: b */
    public int f6281b = 0;

    /* renamed from: c */
    public boolean f6282c;

    public aw1(int i10) {
        this.f6280a = new Object[i10];
    }

    public final aw1<E> n(E e10) {
        Objects.requireNonNull(e10);
        o(this.f6281b + 1);
        Object[] objArr = this.f6280a;
        int i10 = this.f6281b;
        this.f6281b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }

    public final void o(int i10) {
        Object[] objArr = this.f6280a;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.f6280a = Arrays.copyOf(objArr, i11);
        } else if (!this.f6282c) {
            return;
        } else {
            this.f6280a = (Object[]) objArr.clone();
        }
        this.f6282c = false;
    }
}
