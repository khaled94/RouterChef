package d4;

import a4.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t0 extends g0 {

    /* renamed from: g */
    public final /* synthetic */ b f3918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(b bVar, int i10) {
        super(bVar, i10, null);
        this.f3918g = bVar;
    }

    @Override // d4.g0
    public final void d(b bVar) {
        Objects.requireNonNull(this.f3918g);
        this.f3918g.f3814j.a(bVar);
        Objects.requireNonNull(this.f3918g);
        System.currentTimeMillis();
    }

    @Override // d4.g0
    public final boolean e() {
        this.f3918g.f3814j.a(b.f114w);
        return true;
    }
}
