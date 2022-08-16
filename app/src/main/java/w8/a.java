package w8;

import e1.h;
import e9.f;

/* loaded from: classes.dex */
public class a extends h {
    public static Object[] j(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        f.e(objArr, "<this>");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
        return objArr2;
    }
}
