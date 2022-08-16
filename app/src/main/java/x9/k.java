package x9;

import java.util.Objects;
import s9.b;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: t */
    public final /* synthetic */ int f20174t;

    /* renamed from: u */
    public final /* synthetic */ f f20175u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, Object[] objArr, int i10, int i11) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f20175u = fVar;
        this.f20174t = i10;
    }

    @Override // s9.b
    public final void a() {
        Objects.requireNonNull(this.f20175u.B);
        synchronized (this.f20175u) {
            this.f20175u.O.remove(Integer.valueOf(this.f20174t));
        }
    }
}
