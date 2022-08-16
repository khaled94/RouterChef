package x9;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import s9.b;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: t */
    public final /* synthetic */ int f20167t;

    /* renamed from: u */
    public final /* synthetic */ List f20168u;

    /* renamed from: v */
    public final /* synthetic */ f f20169v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, Object[] objArr, int i10, List list, boolean z10) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f20169v = fVar;
        this.f20167t = i10;
        this.f20168u = list;
    }

    @Override // s9.b
    public final void a() {
        Objects.requireNonNull(this.f20169v.B);
        try {
            this.f20169v.M.L(this.f20167t, 6);
            synchronized (this.f20169v) {
                this.f20169v.O.remove(Integer.valueOf(this.f20167t));
            }
        } catch (IOException unused) {
        }
    }
}
