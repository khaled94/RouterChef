package m4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sm2 implements kq0 {

    /* renamed from: a */
    public final Context f13751a;

    /* renamed from: b */
    public final List<i01> f13752b = new ArrayList();

    /* renamed from: c */
    public final kq0 f13753c;

    /* renamed from: d */
    public vm2 f13754d;

    /* renamed from: e */
    public dm2 f13755e;

    /* renamed from: f */
    public nm2 f13756f;

    /* renamed from: g */
    public kq0 f13757g;

    /* renamed from: h */
    public ln2 f13758h;

    /* renamed from: i */
    public om2 f13759i;

    /* renamed from: j */
    public en2 f13760j;

    /* renamed from: k */
    public kq0 f13761k;

    public sm2(Context context, kq0 kq0Var) {
        this.f13751a = context.getApplicationContext();
        this.f13753c = kq0Var;
    }

    public static final void q(kq0 kq0Var, i01 i01Var) {
        if (kq0Var != null) {
            kq0Var.f(i01Var);
        }
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        kq0 kq0Var = this.f13761k;
        Objects.requireNonNull(kq0Var);
        return kq0Var.d(bArr, i10, i11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<m4.i01>, java.util.ArrayList] */
    @Override // m4.kq0
    public final void f(i01 i01Var) {
        Objects.requireNonNull(i01Var);
        this.f13753c.f(i01Var);
        this.f13752b.add(i01Var);
        q(this.f13754d, i01Var);
        q(this.f13755e, i01Var);
        q(this.f13756f, i01Var);
        q(this.f13757g, i01Var);
        q(this.f13758h, i01Var);
        q(this.f13759i, i01Var);
        q(this.f13760j, i01Var);
    }

    @Override // m4.kq0
    public final Uri h() {
        kq0 kq0Var = this.f13761k;
        if (kq0Var == null) {
            return null;
        }
        return kq0Var.h();
    }

    @Override // m4.kq0
    public final void i() {
        kq0 kq0Var = this.f13761k;
        if (kq0Var != null) {
            try {
                kq0Var.i();
            } finally {
                this.f13761k = null;
            }
        }
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        kq0 kq0Var;
        dm2 dm2Var;
        boolean z10 = true;
        r01.h(this.f13761k == null);
        String scheme = gs0Var.f9017a.getScheme();
        Uri uri = gs0Var.f9017a;
        int i10 = ls1.f10971a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z10 = false;
        }
        if (z10) {
            String path = gs0Var.f9017a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f13755e == null) {
                    dm2Var = new dm2(this.f13751a);
                    this.f13755e = dm2Var;
                    p(dm2Var);
                }
                kq0Var = this.f13755e;
                this.f13761k = kq0Var;
                return kq0Var.k(gs0Var);
            }
            if (this.f13754d == null) {
                vm2 vm2Var = new vm2();
                this.f13754d = vm2Var;
                p(vm2Var);
            }
            kq0Var = this.f13754d;
            this.f13761k = kq0Var;
            return kq0Var.k(gs0Var);
        } else if ("asset".equals(scheme)) {
            if (this.f13755e == null) {
                dm2Var = new dm2(this.f13751a);
                this.f13755e = dm2Var;
                p(dm2Var);
            }
            kq0Var = this.f13755e;
            this.f13761k = kq0Var;
            return kq0Var.k(gs0Var);
        } else {
            if ("content".equals(scheme)) {
                if (this.f13756f == null) {
                    nm2 nm2Var = new nm2(this.f13751a);
                    this.f13756f = nm2Var;
                    p(nm2Var);
                }
                kq0Var = this.f13756f;
            } else if ("rtmp".equals(scheme)) {
                if (this.f13757g == null) {
                    try {
                        kq0 kq0Var2 = (kq0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f13757g = kq0Var2;
                        p(kq0Var2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f13757g == null) {
                        this.f13757g = this.f13753c;
                    }
                }
                kq0Var = this.f13757g;
            } else if ("udp".equals(scheme)) {
                if (this.f13758h == null) {
                    ln2 ln2Var = new ln2();
                    this.f13758h = ln2Var;
                    p(ln2Var);
                }
                kq0Var = this.f13758h;
            } else if ("data".equals(scheme)) {
                if (this.f13759i == null) {
                    om2 om2Var = new om2();
                    this.f13759i = om2Var;
                    p(om2Var);
                }
                kq0Var = this.f13759i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f13760j == null) {
                    en2 en2Var = new en2(this.f13751a);
                    this.f13760j = en2Var;
                    p(en2Var);
                }
                kq0Var = this.f13760j;
            } else {
                kq0Var = this.f13753c;
            }
            this.f13761k = kq0Var;
            return kq0Var.k(gs0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<m4.i01>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<m4.i01>, java.util.ArrayList] */
    public final void p(kq0 kq0Var) {
        for (int i10 = 0; i10 < this.f13752b.size(); i10++) {
            kq0Var.f((i01) this.f13752b.get(i10));
        }
    }

    @Override // m4.kq0, m4.vy0
    public final Map<String, List<String>> zza() {
        kq0 kq0Var = this.f13761k;
        return kq0Var == null ? Collections.emptyMap() : kq0Var.zza();
    }
}
