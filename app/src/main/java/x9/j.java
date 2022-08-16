package x9;

import ca.f;
import java.io.IOException;
import java.util.Objects;
import s9.b;
import x9.t;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: t */
    public final /* synthetic */ int f20170t;

    /* renamed from: u */
    public final /* synthetic */ f f20171u;

    /* renamed from: v */
    public final /* synthetic */ int f20172v;

    /* renamed from: w */
    public final /* synthetic */ f f20173w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, Object[] objArr, int i10, f fVar2, int i11, boolean z10) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f20173w = fVar;
        this.f20170t = i10;
        this.f20171u = fVar2;
        this.f20172v = i11;
    }

    @Override // s9.b
    public final void a() {
        try {
            t.a aVar = this.f20173w.B;
            f fVar = this.f20171u;
            int i10 = this.f20172v;
            Objects.requireNonNull(aVar);
            fVar.p(i10);
            this.f20173w.M.L(this.f20170t, 6);
            synchronized (this.f20173w) {
                this.f20173w.O.remove(Integer.valueOf(this.f20170t));
            }
        } catch (IOException unused) {
        }
    }
}
