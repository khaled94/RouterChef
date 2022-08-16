package m4;

import java.util.Objects;
import java.util.concurrent.Callable;
import l3.s;

/* loaded from: classes.dex */
public final class hf1 implements eh1<if1> {

    /* renamed from: a */
    public final uz1 f9224a;

    /* renamed from: b */
    public final x21 f9225b;

    public hf1(uz1 uz1Var, x21 x21Var) {
        this.f9224a = uz1Var;
        this.f9225b = x21Var;
    }

    @Override // m4.eh1
    public final tz1<if1> a() {
        return this.f9224a.Z(new Callable() { // from class: m4.ff1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                boolean z10;
                hf1 hf1Var = hf1.this;
                x21 x21Var = hf1Var.f9225b;
                synchronized (x21Var) {
                    if (((Boolean) jo.f10145d.f10148c.a(es.S5)).booleanValue() && x21Var.d()) {
                        long j3 = x21Var.f15202j;
                        Objects.requireNonNull(s.B.f5796j);
                        if (j3 < System.currentTimeMillis() / 1000) {
                            x21Var.f15200h = "{}";
                            x21Var.f15202j = Long.MAX_VALUE;
                        } else if (!x21Var.f15200h.equals("{}")) {
                            str = x21Var.f15200h;
                        }
                    }
                    str = "";
                }
                x21 x21Var2 = hf1Var.f9225b;
                synchronized (x21Var2) {
                    z10 = x21Var2.f15204l;
                }
                return new if1(str, z10, s.B.f5799m.g());
            }
        });
    }
}
