package u2;

import android.content.Context;
import d3.a;
import java.util.Objects;
import s.b;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: a */
    public final Context f19057a;

    /* renamed from: b */
    public final a f19058b;

    /* renamed from: c */
    public final a f19059c;

    /* renamed from: d */
    public final String f19060d;

    public c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f19057a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f19058b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f19059c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f19060d = str;
    }

    @Override // u2.i
    public final Context a() {
        return this.f19057a;
    }

    @Override // u2.i
    public final String b() {
        return this.f19060d;
    }

    @Override // u2.i
    public final a c() {
        return this.f19059c;
    }

    @Override // u2.i
    public final a d() {
        return this.f19058b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f19057a.equals(iVar.a()) && this.f19058b.equals(iVar.d()) && this.f19059c.equals(iVar.c()) && this.f19060d.equals(iVar.b());
    }

    public final int hashCode() {
        return ((((((this.f19057a.hashCode() ^ 1000003) * 1000003) ^ this.f19058b.hashCode()) * 1000003) ^ this.f19059c.hashCode()) * 1000003) ^ this.f19060d.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("CreationContext{applicationContext=");
        c10.append(this.f19057a);
        c10.append(", wallClock=");
        c10.append(this.f19058b);
        c10.append(", monotonicClock=");
        c10.append(this.f19059c);
        c10.append(", backendName=");
        return b.b(c10, this.f19060d, "}");
    }
}
