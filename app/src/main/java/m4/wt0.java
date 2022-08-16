package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class wt0 implements cm0<hm0> {

    /* renamed from: a */
    public final Map<String, e71<hm0>> f15099a;

    /* renamed from: b */
    public final Map<String, e71<av0>> f15100b;

    /* renamed from: c */
    public final Map<String, e91<av0>> f15101c;

    /* renamed from: d */
    public final vd2<cm0<ik0>> f15102d;

    /* renamed from: e */
    public final lv0 f15103e;

    public wt0(Map<String, e71<hm0>> map, Map<String, e71<av0>> map2, Map<String, e91<av0>> map3, vd2<cm0<ik0>> vd2Var, lv0 lv0Var) {
        this.f15099a = map;
        this.f15100b = map2;
        this.f15101c = map3;
        this.f15102d = vd2Var;
        this.f15103e = lv0Var;
    }

    @Override // m4.cm0
    public final e71<hm0> a(int i10, String str) {
        e71<ik0> a10;
        e71<hm0> e71Var = this.f15099a.get(str);
        if (e71Var != null) {
            return e71Var;
        }
        if (i10 == 1) {
            if (this.f15103e.f11033d != null && (a10 = this.f15102d.a().a(i10, str)) != null) {
                return new f71(a10, fm0.f8594a);
            }
            return null;
        } else if (i10 != 4) {
            return null;
        } else {
            e91<av0> e91Var = this.f15101c.get(str);
            if (e91Var != null) {
                return new f71(e91Var, gm0.f8965a);
            }
            e71<av0> e71Var2 = this.f15100b.get(str);
            if (e71Var2 != null) {
                return new f71(e71Var2, fm0.f8594a);
            }
            return null;
        }
    }
}
