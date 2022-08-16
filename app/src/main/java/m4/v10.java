package m4;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import p3.e;

/* loaded from: classes.dex */
public final class v10 implements e {

    /* renamed from: a */
    public final Date f14554a;

    /* renamed from: b */
    public final int f14555b;

    /* renamed from: c */
    public final Set<String> f14556c;

    /* renamed from: d */
    public final boolean f14557d;

    /* renamed from: e */
    public final Location f14558e;

    /* renamed from: f */
    public final int f14559f;

    /* renamed from: g */
    public final boolean f14560g;

    public v10(Date date, int i10, Set set, Location location, boolean z10, int i11, boolean z11) {
        this.f14554a = date;
        this.f14555b = i10;
        this.f14556c = set;
        this.f14558e = location;
        this.f14557d = z10;
        this.f14559f = i11;
        this.f14560g = z11;
    }

    @Override // p3.e
    @Deprecated
    public final boolean a() {
        return this.f14560g;
    }

    @Override // p3.e
    @Deprecated
    public final Date b() {
        return this.f14554a;
    }

    @Override // p3.e
    public final boolean c() {
        return this.f14557d;
    }

    @Override // p3.e
    public final Set<String> d() {
        return this.f14556c;
    }

    @Override // p3.e
    public final int e() {
        return this.f14559f;
    }

    @Override // p3.e
    public final Location f() {
        return this.f14558e;
    }

    @Override // p3.e
    @Deprecated
    public final int g() {
        return this.f14555b;
    }
}
