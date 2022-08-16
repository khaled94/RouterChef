package b7;

import m3.p;
import m4.rk1;

/* loaded from: classes.dex */
public final class b implements d, rk1 {

    /* renamed from: s */
    public final int f2594s;

    @Override // b7.d
    public StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f2594s;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }

    @Override // m4.rk1
    public void h(Object obj) {
        ((p) obj).w(this.f2594s);
    }
}
