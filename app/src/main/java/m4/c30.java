package m4;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c30 {

    /* renamed from: a */
    public final int f6715a;

    /* renamed from: b */
    public final Uri[] f6716b;

    /* renamed from: c */
    public final int[] f6717c;

    /* renamed from: d */
    public final long[] f6718d;

    public c30(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
        r01.f(iArr.length == uriArr.length);
        this.f6715a = i10;
        this.f6717c = iArr;
        this.f6716b = uriArr;
        this.f6718d = jArr;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f6717c;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c30.class == obj.getClass()) {
            c30 c30Var = (c30) obj;
            if (this.f6715a == c30Var.f6715a && Arrays.equals(this.f6716b, c30Var.f6716b) && Arrays.equals(this.f6717c, c30Var.f6717c) && Arrays.equals(this.f6718d, c30Var.f6718d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f6717c);
        return (Arrays.hashCode(this.f6718d) + ((hashCode + (((this.f6715a * 961) + Arrays.hashCode(this.f6716b)) * 31)) * 31)) * 961;
    }
}
