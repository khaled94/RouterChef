package x9;

import java.io.IOException;
import s9.b;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: t */
    public final /* synthetic */ int f20136t;

    /* renamed from: u */
    public final /* synthetic */ int f20137u;

    /* renamed from: v */
    public final /* synthetic */ f f20138v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Object[] objArr, int i10, int i11) {
        super("OkHttp %s stream %d", objArr);
        this.f20138v = fVar;
        this.f20136t = i10;
        this.f20137u = i11;
    }

    @Override // s9.b
    public final void a() {
        try {
            f fVar = this.f20138v;
            fVar.M.L(this.f20136t, this.f20137u);
        } catch (IOException e10) {
            this.f20138v.c(2, 2, e10);
        }
    }
}
