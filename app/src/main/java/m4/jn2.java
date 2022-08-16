package m4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jn2 implements kq0 {

    /* renamed from: a */
    public final kq0 f10141a;

    /* renamed from: b */
    public long f10142b;

    /* renamed from: c */
    public Uri f10143c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f10144d = Collections.emptyMap();

    public jn2(kq0 kq0Var) {
        Objects.requireNonNull(kq0Var);
        this.f10141a = kq0Var;
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        int d5 = this.f10141a.d(bArr, i10, i11);
        if (d5 != -1) {
            this.f10142b += d5;
        }
        return d5;
    }

    @Override // m4.kq0
    public final void f(i01 i01Var) {
        Objects.requireNonNull(i01Var);
        this.f10141a.f(i01Var);
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f10141a.h();
    }

    @Override // m4.kq0
    public final void i() {
        this.f10141a.i();
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        this.f10143c = gs0Var.f9017a;
        this.f10144d = Collections.emptyMap();
        long k10 = this.f10141a.k(gs0Var);
        Uri h10 = h();
        Objects.requireNonNull(h10);
        this.f10143c = h10;
        this.f10144d = zza();
        return k10;
    }

    @Override // m4.kq0, m4.vy0
    public final Map<String, List<String>> zza() {
        return this.f10141a.zza();
    }
}
