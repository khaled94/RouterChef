package u6;

import androidx.activity.result.a;
import java.util.Objects;
import s.b;
import u6.c0;

/* loaded from: classes.dex */
public final class x extends c0.a {

    /* renamed from: a */
    public final String f19448a;

    /* renamed from: b */
    public final String f19449b;

    /* renamed from: c */
    public final String f19450c;

    /* renamed from: d */
    public final String f19451d;

    /* renamed from: e */
    public final int f19452e;

    /* renamed from: f */
    public final String f19453f;

    public x(String str, String str2, String str3, String str4, int i10, String str5) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f19448a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f19449b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f19450c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f19451d = str4;
        this.f19452e = i10;
        this.f19453f = str5;
    }

    @Override // u6.c0.a
    public final String a() {
        return this.f19448a;
    }

    @Override // u6.c0.a
    public final int b() {
        return this.f19452e;
    }

    @Override // u6.c0.a
    public final String c() {
        return this.f19451d;
    }

    @Override // u6.c0.a
    public final String d() {
        return this.f19453f;
    }

    @Override // u6.c0.a
    public final String e() {
        return this.f19449b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        if (this.f19448a.equals(aVar.a()) && this.f19449b.equals(aVar.e()) && this.f19450c.equals(aVar.f()) && this.f19451d.equals(aVar.c()) && this.f19452e == aVar.b()) {
            String str = this.f19453f;
            String d5 = aVar.d();
            if (str == null) {
                if (d5 == null) {
                    return true;
                }
            } else if (str.equals(d5)) {
                return true;
            }
        }
        return false;
    }

    @Override // u6.c0.a
    public final String f() {
        return this.f19450c;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f19448a.hashCode() ^ 1000003) * 1000003) ^ this.f19449b.hashCode()) * 1000003) ^ this.f19450c.hashCode()) * 1000003) ^ this.f19451d.hashCode()) * 1000003) ^ this.f19452e) * 1000003;
        String str = this.f19453f;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder c10 = a.c("AppData{appIdentifier=");
        c10.append(this.f19448a);
        c10.append(", versionCode=");
        c10.append(this.f19449b);
        c10.append(", versionName=");
        c10.append(this.f19450c);
        c10.append(", installUuid=");
        c10.append(this.f19451d);
        c10.append(", deliveryMechanism=");
        c10.append(this.f19452e);
        c10.append(", unityVersion=");
        return b.b(c10, this.f19453f, "}");
    }
}
