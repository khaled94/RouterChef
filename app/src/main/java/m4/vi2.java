package m4;

import android.text.TextUtils;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class vi2 {

    /* renamed from: a */
    public final String f14698a;

    /* renamed from: b */
    public final boolean f14699b;

    /* renamed from: c */
    public final boolean f14700c;

    public vi2(String str, boolean z10, boolean z11) {
        this.f14698a = str;
        this.f14699b = z10;
        this.f14700c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == vi2.class) {
            vi2 vi2Var = (vi2) obj;
            if (TextUtils.equals(this.f14698a, vi2Var.f14698a) && this.f14699b == vi2Var.f14699b && this.f14700c == vi2Var.f14700c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1237;
        int a10 = (a.a(this.f14698a, 31, 31) + (true != this.f14699b ? 1237 : 1231)) * 31;
        if (true == this.f14700c) {
            i10 = 1231;
        }
        return a10 + i10;
    }
}
