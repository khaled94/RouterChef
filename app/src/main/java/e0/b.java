package e0;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e */
    public static final b f4310e = new b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f4311a;

    /* renamed from: b */
    public final int f4312b;

    /* renamed from: c */
    public final int f4313c;

    /* renamed from: d */
    public final int f4314d;

    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f4311a = i10;
        this.f4312b = i11;
        this.f4313c = i12;
        this.f4314d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f4311a, bVar2.f4311a), Math.max(bVar.f4312b, bVar2.f4312b), Math.max(bVar.f4313c, bVar2.f4313c), Math.max(bVar.f4314d, bVar2.f4314d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f4310e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return a.a(this.f4311a, this.f4312b, this.f4313c, this.f4314d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4314d == bVar.f4314d && this.f4311a == bVar.f4311a && this.f4313c == bVar.f4313c && this.f4312b == bVar.f4312b;
    }

    public final int hashCode() {
        return (((((this.f4311a * 31) + this.f4312b) * 31) + this.f4313c) * 31) + this.f4314d;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Insets{left=");
        c10.append(this.f4311a);
        c10.append(", top=");
        c10.append(this.f4312b);
        c10.append(", right=");
        c10.append(this.f4313c);
        c10.append(", bottom=");
        c10.append(this.f4314d);
        c10.append('}');
        return c10.toString();
    }
}
