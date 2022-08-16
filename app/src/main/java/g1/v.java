package g1;

import androidx.appcompat.app.d;
import com.raouf.routerchef.PersonalizedSpeedLimit;
import com.raouf.routerchef.R;
import com.raouf.routerchef.WifiSettings;
import e9.f;
import f8.q1;
import j8.b;
import java.util.Objects;
import l8.a;
import z3.n;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4858s;

    /* renamed from: t */
    public final /* synthetic */ Object f4859t;

    public /* synthetic */ v(Object obj, int i10) {
        this.f4858s = i10;
        this.f4859t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4858s) {
            case 0:
                w wVar = (w) this.f4859t;
                f.e(wVar, "this$0");
                wVar.f4860s.a();
                return;
            case 1:
                PersonalizedSpeedLimit personalizedSpeedLimit = (PersonalizedSpeedLimit) this.f4859t;
                int i10 = PersonalizedSpeedLimit.f3595h0;
                Objects.requireNonNull(personalizedSpeedLimit);
                d.a aVar = new d.a(personalizedSpeedLimit);
                aVar.f502a.f476d = personalizedSpeedLimit.getString(R.string.failedLimitHeader);
                aVar.f502a.f478f = personalizedSpeedLimit.getString(R.string.exceededError);
                aVar.c(personalizedSpeedLimit.getString(R.string.okTamam), q1.f4676s);
                aVar.d();
                return;
            case 2:
                ((WifiSettings) this.f4859t).f3652j0.b();
                return;
            default:
                b bVar = (b) this.f4859t;
                for (int i11 = 0; i11 < bVar.f5496c.size(); i11++) {
                    try {
                        String str = bVar.f5496c.get(i11).f5501b;
                        n nVar = bVar.f5499f;
                        a b10 = ((l8.b) nVar.f20958b).b(nVar.a(str));
                        if (b10 != null) {
                            bVar.f5496c.get(i11).f5509j = b10;
                            bVar.f5496c.get(i11).f5504e = b10.f5821b;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                bVar.f5495b.k(bVar.f5496c);
                return;
        }
    }
}
