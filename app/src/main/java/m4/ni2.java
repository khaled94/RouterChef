package m4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ni2 {

    /* renamed from: a */
    public int f11792a = 0;

    /* renamed from: b */
    public int f11793b = -1;

    /* renamed from: c */
    public int f11794c = 0;

    /* renamed from: d */
    public int[] f11795d;

    /* renamed from: e */
    public int f11796e;

    public ni2() {
        int[] iArr = new int[16];
        this.f11795d = iArr;
        this.f11796e = iArr.length - 1;
    }

    public final int a() {
        int i10 = this.f11794c;
        if (i10 != 0) {
            int[] iArr = this.f11795d;
            int i11 = this.f11792a;
            int i12 = iArr[i11];
            this.f11792a = (i11 + 1) & this.f11796e;
            this.f11794c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }

    public final void b(int i10) {
        int i11 = this.f11794c;
        int[] iArr = this.f11795d;
        int length = iArr.length;
        if (i11 == length) {
            int i12 = length + length;
            if (i12 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i12];
            int i13 = this.f11792a;
            int i14 = length - i13;
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.f11795d, 0, iArr2, i14, i13);
            this.f11792a = 0;
            this.f11793b = this.f11794c - 1;
            this.f11795d = iArr2;
            this.f11796e = iArr2.length - 1;
            iArr = iArr2;
        }
        int i15 = (this.f11793b + 1) & this.f11796e;
        this.f11793b = i15;
        iArr[i15] = i10;
        this.f11794c++;
    }
}
