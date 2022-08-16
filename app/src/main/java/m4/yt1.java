package m4;

import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class yt1 extends xt1 {

    /* renamed from: a */
    public final char f15906a;

    public yt1(char c10) {
        this.f15906a = c10;
    }

    @Override // m4.x50
    public final boolean d(char c10) {
        return c10 == this.f15906a;
    }

    public final String toString() {
        int i10 = this.f15906a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return a.b(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
