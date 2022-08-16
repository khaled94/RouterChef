package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import d.a;
import java.util.List;
import java.util.Objects;
import n3.i1;

/* loaded from: classes.dex */
public final class do0 implements nd2<co0> {

    /* renamed from: a */
    public final vd2<zo1> f7566a;

    /* renamed from: b */
    public final vd2<o90> f7567b;

    /* renamed from: c */
    public final vd2<ApplicationInfo> f7568c;

    /* renamed from: d */
    public final vd2<String> f7569d;

    /* renamed from: e */
    public final vd2<List<String>> f7570e;

    /* renamed from: f */
    public final vd2<PackageInfo> f7571f;

    /* renamed from: g */
    public final vd2<tz1<String>> f7572g;

    /* renamed from: h */
    public final vd2<i1> f7573h;

    /* renamed from: i */
    public final vd2<String> f7574i;

    /* renamed from: j */
    public final vd2<hh1<Bundle>> f7575j;

    public do0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, vd2 vd2Var6, vd2 vd2Var7, vd2 vd2Var8, vd2 vd2Var9) {
        m31 m31Var = r01.f13087c;
        this.f7566a = vd2Var;
        this.f7567b = vd2Var2;
        this.f7568c = vd2Var3;
        this.f7569d = vd2Var4;
        this.f7570e = m31Var;
        this.f7571f = vd2Var5;
        this.f7572g = vd2Var6;
        this.f7573h = vd2Var7;
        this.f7574i = vd2Var8;
        this.f7575j = vd2Var9;
    }

    /* renamed from: b */
    public final co0 a() {
        zo1 a10 = this.f7566a.a();
        o90 b10 = ((vf0) this.f7567b).b();
        ApplicationInfo a11 = ((l31) this.f7568c).a();
        String a12 = ((p31) this.f7569d).a();
        List<String> a13 = es.a();
        PackageInfo a14 = this.f7571f.a();
        jd2 b11 = md2.b(this.f7572g);
        ((dn1) this.f7573h).a();
        String a15 = this.f7574i.a();
        ih1 ih1Var = (ih1) this.f7575j;
        Objects.requireNonNull(ih1Var);
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        return new co0(a10, b10, a11, a12, a13, a14, b11, a15, new hh1(t90Var, ((td2) ih1Var.f9654b).a()));
    }
}
