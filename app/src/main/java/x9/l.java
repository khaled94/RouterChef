package x9;

import androidx.activity.result.a;
import java.io.IOException;
import s9.b;
import x9.f;

/* loaded from: classes.dex */
public final class l extends b {

    /* renamed from: t */
    public final /* synthetic */ q f20176t;

    /* renamed from: u */
    public final /* synthetic */ f.C0153f f20177u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f.C0153f c0153f, Object[] objArr, q qVar) {
        super("OkHttp %s stream %d", objArr);
        this.f20177u = c0153f;
        this.f20176t = qVar;
    }

    @Override // s9.b
    public final void a() {
        try {
            f.this.f20140t.b(this.f20176t);
        } catch (IOException e10) {
            z9.f fVar = z9.f.f21089a;
            StringBuilder c10 = a.c("Http2Connection.Listener failure for ");
            c10.append(f.this.f20142v);
            fVar.n(4, c10.toString(), e10);
            try {
                this.f20176t.c(2, e10);
            } catch (IOException unused) {
            }
        }
    }
}
