package x5;

import android.graphics.Typeface;
import u5.d;
import u5.e;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    public final Typeface f20027a;

    /* renamed from: b */
    public final AbstractC0150a f20028b;

    /* renamed from: c */
    public boolean f20029c;

    /* renamed from: x5.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0150a {
    }

    public a(AbstractC0150a abstractC0150a, Typeface typeface) {
        this.f20027a = typeface;
        this.f20028b = abstractC0150a;
    }

    @Override // x5.f
    public final void c(int i10) {
        e(this.f20027a);
    }

    @Override // x5.f
    public final void d(Typeface typeface, boolean z10) {
        e(typeface);
    }

    public final void e(Typeface typeface) {
        if (!this.f20029c) {
            e eVar = ((d) this.f20028b).f19083a;
            if (!eVar.n(typeface)) {
                return;
            }
            eVar.k(false);
        }
    }
}
