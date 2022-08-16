package d4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List<String> f3889a = new ArrayList();

        /* renamed from: b */
        public final Object f3890b;

        public a(Object obj) {
            Objects.requireNonNull(obj, "null reference");
            this.f3890b = obj;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final a a(String str, Object obj) {
            ?? r02 = this.f3889a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            r02.add(sb.toString());
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3890b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3889a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f3889a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
