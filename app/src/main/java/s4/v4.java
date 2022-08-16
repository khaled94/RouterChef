package s4;

import android.content.Context;
import androidx.fragment.app.b1;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class v4 extends m5 {

    /* renamed from: a */
    public final Context f18147a;

    /* renamed from: b */
    public final s5<q5<d5>> f18148b;

    public v4(Context context, @Nullable s5<q5<d5>> s5Var) {
        this.f18147a = context;
        this.f18148b = s5Var;
    }

    @Override // s4.m5
    public final Context a() {
        return this.f18147a;
    }

    @Override // s4.m5
    @Nullable
    public final s5<q5<d5>> b() {
        return this.f18148b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m5) {
            m5 m5Var = (m5) obj;
            if (this.f18147a.equals(m5Var.a())) {
                s5<q5<d5>> s5Var = this.f18148b;
                s5<q5<d5>> b10 = m5Var.b();
                if (s5Var != null ? s5Var.equals(b10) : b10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f18147a.hashCode() ^ 1000003) * 1000003;
        s5<q5<d5>> s5Var = this.f18148b;
        return hashCode ^ (s5Var == null ? 0 : s5Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18147a);
        String valueOf2 = String.valueOf(this.f18148b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        b1.b(sb, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
