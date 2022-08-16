package u6;

import android.os.Build;
import androidx.activity.result.a;
import java.util.Objects;
import s.b;
import u6.c0;

/* loaded from: classes.dex */
public final class y extends c0.b {

    /* renamed from: a */
    public final int f19454a;

    /* renamed from: b */
    public final String f19455b;

    /* renamed from: c */
    public final int f19456c;

    /* renamed from: d */
    public final long f19457d;

    /* renamed from: e */
    public final long f19458e;

    /* renamed from: f */
    public final boolean f19459f;

    /* renamed from: g */
    public final int f19460g;

    /* renamed from: h */
    public final String f19461h;

    /* renamed from: i */
    public final String f19462i;

    public y(int i10, int i11, long j3, long j10, boolean z10, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f19454a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f19455b = str;
        this.f19456c = i11;
        this.f19457d = j3;
        this.f19458e = j10;
        this.f19459f = z10;
        this.f19460g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f19461h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f19462i = str3;
    }

    @Override // u6.c0.b
    public final int a() {
        return this.f19454a;
    }

    @Override // u6.c0.b
    public final int b() {
        return this.f19456c;
    }

    @Override // u6.c0.b
    public final long c() {
        return this.f19458e;
    }

    @Override // u6.c0.b
    public final boolean d() {
        return this.f19459f;
    }

    @Override // u6.c0.b
    public final String e() {
        return this.f19461h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.b)) {
            return false;
        }
        c0.b bVar = (c0.b) obj;
        return this.f19454a == bVar.a() && this.f19455b.equals(bVar.f()) && this.f19456c == bVar.b() && this.f19457d == bVar.i() && this.f19458e == bVar.c() && this.f19459f == bVar.d() && this.f19460g == bVar.h() && this.f19461h.equals(bVar.e()) && this.f19462i.equals(bVar.g());
    }

    @Override // u6.c0.b
    public final String f() {
        return this.f19455b;
    }

    @Override // u6.c0.b
    public final String g() {
        return this.f19462i;
    }

    @Override // u6.c0.b
    public final int h() {
        return this.f19460g;
    }

    public final int hashCode() {
        long j3 = this.f19457d;
        long j10 = this.f19458e;
        return ((((((((((((((((this.f19454a ^ 1000003) * 1000003) ^ this.f19455b.hashCode()) * 1000003) ^ this.f19456c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f19459f ? 1231 : 1237)) * 1000003) ^ this.f19460g) * 1000003) ^ this.f19461h.hashCode()) * 1000003) ^ this.f19462i.hashCode();
    }

    @Override // u6.c0.b
    public final long i() {
        return this.f19457d;
    }

    public final String toString() {
        StringBuilder c10 = a.c("DeviceData{arch=");
        c10.append(this.f19454a);
        c10.append(", model=");
        c10.append(this.f19455b);
        c10.append(", availableProcessors=");
        c10.append(this.f19456c);
        c10.append(", totalRam=");
        c10.append(this.f19457d);
        c10.append(", diskSpace=");
        c10.append(this.f19458e);
        c10.append(", isEmulator=");
        c10.append(this.f19459f);
        c10.append(", state=");
        c10.append(this.f19460g);
        c10.append(", manufacturer=");
        c10.append(this.f19461h);
        c10.append(", modelClass=");
        return b.b(c10, this.f19462i, "}");
    }
}
