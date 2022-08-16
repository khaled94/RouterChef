package m4;

import l3.s;
import n3.s1;
import n3.z;

/* loaded from: classes.dex */
public final class lc0 extends z {

    /* renamed from: b */
    public final fb0 f10710b;

    /* renamed from: c */
    public final uc0 f10711c;

    /* renamed from: d */
    public final String f10712d;

    /* renamed from: e */
    public final String[] f10713e;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<m4.lc0>, java.util.ArrayList] */
    public lc0(fb0 fb0Var, uc0 uc0Var, String str, String[] strArr) {
        this.f10710b = fb0Var;
        this.f10711c = uc0Var;
        this.f10712d = str;
        this.f10713e = strArr;
        s.B.f5810z.f11146s.add(this);
    }

    @Override // n3.z
    public final void a() {
        try {
            this.f10711c.r(this.f10712d, this.f10713e);
        } finally {
            s1.f16555i.post(new ka0(this, 1));
        }
    }

    @Override // n3.z
    public final tz1<?> b() {
        return (!((Boolean) jo.f10145d.f10148c.a(es.f8143m1)).booleanValue() || !(this.f10711c instanceof bd0)) ? super.b() : u90.f14298e.Z(new kc0(this, 0));
    }
}
