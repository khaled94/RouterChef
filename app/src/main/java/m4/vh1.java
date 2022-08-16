package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vh1 implements eh1<wh1> {

    /* renamed from: a */
    public final Executor f14693a;

    /* renamed from: b */
    public final String f14694b;

    public vh1(Executor executor, String str) {
        this.f14693a = executor;
        this.f14694b = str;
    }

    @Override // m4.eh1
    public final tz1<wh1> a() {
        return mz1.j(mz1.o(mz1.m(this.f14694b), th1.f14056a, this.f14693a), Throwable.class, new xy1() { // from class: m4.uh1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                Throwable th = (Throwable) obj;
                return mz1.m(new wh1(vh1.this.f14694b));
            }
        }, this.f14693a);
    }
}
