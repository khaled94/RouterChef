package m4;

import java.util.List;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class tm1 {

    /* renamed from: a */
    public final cm1 f14110a;

    /* renamed from: b */
    public final em1 f14111b;

    /* renamed from: c */
    public final v61 f14112c;

    /* renamed from: d */
    public final zp1 f14113d;

    public tm1(v61 v61Var, zp1 zp1Var, cm1 cm1Var, em1 em1Var) {
        this.f14110a = cm1Var;
        this.f14111b = em1Var;
        this.f14112c = v61Var;
        this.f14113d = zp1Var;
    }

    public final void a(List<String> list) {
        for (String str : list) {
            b(str, 2);
        }
    }

    public final void b(String str, int i10) {
        if (!this.f14110a.f7045g0) {
            this.f14113d.a(str);
            return;
        }
        Objects.requireNonNull(s.B.f5796j);
        this.f14112c.c(new w61(System.currentTimeMillis(), this.f14111b.f8004b, str, i10));
    }

    public final void c(List<String> list, int i10) {
        for (String str : list) {
            b(str, i10);
        }
    }
}
