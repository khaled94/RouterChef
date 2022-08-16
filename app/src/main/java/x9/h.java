package x9;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import s9.b;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: t */
    public final /* synthetic */ int f20164t;

    /* renamed from: u */
    public final /* synthetic */ List f20165u;

    /* renamed from: v */
    public final /* synthetic */ f f20166v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, Object[] objArr, int i10, List list) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f20166v = fVar;
        this.f20164t = i10;
        this.f20165u = list;
    }

    @Override // s9.b
    public final void a() {
        Objects.requireNonNull(this.f20166v.B);
        try {
            this.f20166v.M.L(this.f20164t, 6);
            synchronized (this.f20166v) {
                this.f20166v.O.remove(Integer.valueOf(this.f20164t));
            }
        } catch (IOException unused) {
        }
    }
}
