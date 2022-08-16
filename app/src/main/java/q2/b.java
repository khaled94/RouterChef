package q2;

import androidx.activity.result.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final String f17139a;

    public b(String str) {
        this.f17139a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f17139a.equals(((b) obj).f17139a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17139a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s.b.b(a.c("Encoding{name=\""), this.f17139a, "\"}");
    }
}
