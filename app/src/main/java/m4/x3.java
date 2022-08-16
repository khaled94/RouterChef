package m4;

import android.text.TextUtils;
import androidx.fragment.app.b1;

/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a */
    public final String f15209a;

    /* renamed from: b */
    public final String f15210b;

    public x3(String str, String str2) {
        this.f15209a = str;
        this.f15210b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x3.class == obj.getClass()) {
            x3 x3Var = (x3) obj;
            if (TextUtils.equals(this.f15209a, x3Var.f15209a) && TextUtils.equals(this.f15210b, x3Var.f15210b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15210b.hashCode() + (this.f15209a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f15209a;
        String str2 = this.f15210b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        b1.b(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
