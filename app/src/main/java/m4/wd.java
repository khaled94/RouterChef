package m4;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class wd {

    /* renamed from: a */
    public final String f14940a;

    /* renamed from: b */
    public final boolean f14941b;

    public wd(String str, boolean z10) {
        this.f14940a = str;
        this.f14941b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == wd.class) {
            wd wdVar = (wd) obj;
            if (TextUtils.equals(this.f14940a, wdVar.f14940a) && this.f14941b == wdVar.f14941b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14940a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f14941b ? 1237 : 1231);
    }
}
