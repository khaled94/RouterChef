package p1;

import android.view.View;
import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b */
    public View f16933b;

    /* renamed from: a */
    public final Map<String, Object> f16932a = new HashMap();

    /* renamed from: c */
    public final ArrayList<i> f16934c = new ArrayList<>();

    @Deprecated
    public p() {
    }

    public p(View view) {
        this.f16933b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f16933b == pVar.f16933b && this.f16932a.equals(pVar.f16932a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16932a.hashCode() + (this.f16933b.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final String toString() {
        StringBuilder c10 = a.c("TransitionValues@");
        c10.append(Integer.toHexString(hashCode()));
        c10.append(":\n");
        StringBuilder c11 = androidx.fragment.app.a.c(c10.toString(), "    view = ");
        c11.append(this.f16933b);
        c11.append("\n");
        String c12 = d7.a.c(c11.toString(), "    values:");
        for (String str : this.f16932a.keySet()) {
            c12 = c12 + "    " + str + ": " + this.f16932a.get(str) + "\n";
        }
        return c12;
    }
}
