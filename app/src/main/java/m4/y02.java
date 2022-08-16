package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y02 implements Comparable<y02> {

    /* renamed from: s */
    public final byte[] f15557s;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(y02 y02Var) {
        y02 y02Var2 = y02Var;
        int length = this.f15557s.length;
        int length2 = y02Var2.f15557s.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f15557s;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = y02Var2.f15557s[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y02)) {
            return false;
        }
        return Arrays.equals(this.f15557s, ((y02) obj).f15557s);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15557s);
    }

    public final String toString() {
        byte[] bArr = this.f15557s;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb.append("0123456789abcdef".charAt(i10 >> 4));
            sb.append("0123456789abcdef".charAt(i10 & 15));
        }
        return sb.toString();
    }
}
