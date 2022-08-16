package t1;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final Set<a> f18462a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f18463a;

        /* renamed from: b */
        public final boolean f18464b;

        public a(Uri uri, boolean z10) {
            this.f18463a = uri;
            this.f18464b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18464b == aVar.f18464b && this.f18463a.equals(aVar.f18463a);
        }

        public final int hashCode() {
            return (this.f18463a.hashCode() * 31) + (this.f18464b ? 1 : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<t1.c$a>] */
    public final int a() {
        return this.f18462a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f18462a.equals(((c) obj).f18462a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18462a.hashCode();
    }
}
