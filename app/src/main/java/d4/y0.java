package d4;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: e */
    public static final Uri f3931e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f3932a;

    /* renamed from: b */
    public final String f3933b;

    /* renamed from: c */
    public final int f3934c;

    /* renamed from: d */
    public final boolean f3935d;

    public y0(String str, String str2, int i10, boolean z10) {
        m.e(str);
        this.f3932a = str;
        m.e(str2);
        this.f3933b = str2;
        this.f3934c = i10;
        this.f3935d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return l.a(this.f3932a, y0Var.f3932a) && l.a(this.f3933b, y0Var.f3933b) && l.a(null, null) && this.f3934c == y0Var.f3934c && this.f3935d == y0Var.f3935d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3932a, this.f3933b, null, Integer.valueOf(this.f3934c), Boolean.valueOf(this.f3935d)});
    }

    public final String toString() {
        String str = this.f3932a;
        if (str != null) {
            return str;
        }
        m.h(null);
        throw null;
    }
}
