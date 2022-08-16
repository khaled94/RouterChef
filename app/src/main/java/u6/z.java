package u6;

import android.os.Build;
import androidx.activity.result.a;
import java.util.Objects;
import u6.c0;

/* loaded from: classes.dex */
public final class z extends c0.c {

    /* renamed from: a */
    public final String f19463a;

    /* renamed from: b */
    public final String f19464b;

    /* renamed from: c */
    public final boolean f19465c;

    public z(boolean z10) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        Objects.requireNonNull(str, "Null osRelease");
        this.f19463a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f19464b = str2;
        this.f19465c = z10;
    }

    @Override // u6.c0.c
    public final boolean a() {
        return this.f19465c;
    }

    @Override // u6.c0.c
    public final String b() {
        return this.f19464b;
    }

    @Override // u6.c0.c
    public final String c() {
        return this.f19463a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.c)) {
            return false;
        }
        c0.c cVar = (c0.c) obj;
        return this.f19463a.equals(cVar.c()) && this.f19464b.equals(cVar.b()) && this.f19465c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.f19463a.hashCode() ^ 1000003) * 1000003) ^ this.f19464b.hashCode()) * 1000003) ^ (this.f19465c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder c10 = a.c("OsData{osRelease=");
        c10.append(this.f19463a);
        c10.append(", osCodeName=");
        c10.append(this.f19464b);
        c10.append(", isRooted=");
        c10.append(this.f19465c);
        c10.append("}");
        return c10.toString();
    }
}
