package w7;

import java.util.Objects;
import javax.annotation.Nonnull;
import s.b;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a */
    public final String f19931a;

    /* renamed from: b */
    public final String f19932b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f19931a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f19932b = str2;
    }

    @Override // w7.d
    @Nonnull
    public final String a() {
        return this.f19931a;
    }

    @Override // w7.d
    @Nonnull
    public final String b() {
        return this.f19932b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19931a.equals(dVar.a()) && this.f19932b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f19931a.hashCode() ^ 1000003) * 1000003) ^ this.f19932b.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("LibraryVersion{libraryName=");
        c10.append(this.f19931a);
        c10.append(", version=");
        return b.b(c10, this.f19932b, "}");
    }
}
