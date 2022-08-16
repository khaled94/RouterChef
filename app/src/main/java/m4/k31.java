package m4;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.TimeUnit;
import l3.s;
import n3.l1;

/* loaded from: classes.dex */
public final class k31 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10266a;

    /* renamed from: b */
    public final vd2 f10267b;

    /* renamed from: c */
    public final vd2 f10268c;

    public /* synthetic */ k31(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f10266a = i10;
        this.f10267b = vd2Var;
        this.f10268c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f10266a) {
            case 0:
                zo1 zo1Var = (zo1) this.f10267b.a();
                CookieManager f10 = s.B.f5791e.f((Context) this.f10268c.a());
                to1 a10 = qo1.a(new l1(f10, 1), zo1Var.f14465a, wo1.WEBVIEW_COOKIE, zo1Var);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return a10.h(1L).c(Exception.class, new xy1() { // from class: m4.so1
                    @Override // m4.xy1
                    public final tz1 h(Object obj) {
                        Exception exc = (Exception) ((Throwable) obj);
                        return mz1.m("");
                    }
                }).a();
            default:
                return new cn1(((en1) this.f10267b).b(), ((fn1) this.f10268c).a());
        }
    }
}
