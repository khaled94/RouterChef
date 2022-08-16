package m4;

import java.util.LinkedList;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class hn1 {

    /* renamed from: b */
    public final int f9385b;

    /* renamed from: c */
    public final int f9386c;

    /* renamed from: a */
    public final LinkedList<pn1<?, ?>> f9384a = new LinkedList<>();

    /* renamed from: d */
    public final zn1 f9387d = new zn1();

    public hn1(int i10, int i11) {
        this.f9385b = i10;
        this.f9386c = i11;
    }

    public final int a() {
        b();
        return this.f9384a.size();
    }

    public final void b() {
        while (!this.f9384a.isEmpty()) {
            Objects.requireNonNull(s.B.f5796j);
            if (System.currentTimeMillis() - this.f9384a.getFirst().f12579d < this.f9386c) {
                return;
            }
            zn1 zn1Var = this.f9387d;
            zn1Var.f16294f++;
            zn1Var.f16290b.f15853t++;
            this.f9384a.remove();
        }
    }
}
