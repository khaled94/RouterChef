package f8;

import android.content.DialogInterface;
import androidx.appcompat.app.d;
import androidx.lifecycle.g;
import androidx.preference.e;
import com.raouf.routerchef.DnsPornBlocker;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.R;
import com.raouf.routerchef.resModels.LoginInfo;
import java.util.ArrayList;
import o8.a;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4589s;

    /* renamed from: t */
    public final /* synthetic */ Object f4590t;

    /* renamed from: u */
    public final /* synthetic */ Object f4591u;

    public /* synthetic */ e1(Object obj, Object obj2, int i10) {
        this.f4589s = i10;
        this.f4590t = obj;
        this.f4591u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4589s) {
            case 0:
                final Login login = (Login) this.f4590t;
                final LoginInfo loginInfo = (LoginInfo) this.f4591u;
                String str = Login.f3556m0;
                if (!login.f387v.f1702b.b(g.c.STARTED)) {
                    return;
                }
                d.a aVar = new d.a(login);
                aVar.f502a.f476d = login.getString(R.string.confirm);
                aVar.f502a.f478f = login.getString(R.string.modelFound, loginInfo.routerModel);
                aVar.c(login.getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: f8.y0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        Login login2 = Login.this;
                        LoginInfo loginInfo2 = loginInfo;
                        String str2 = Login.f3556m0;
                        login2.getSharedPreferences(e.b(login2), 0).edit().putString("router_model", loginInfo2.routerModel).apply();
                        login2.T.b(loginInfo2.routerModel);
                        login2.S = (a) login2.T.f16191s;
                        login2.O.post(new b0.a(login2, 2));
                    }
                });
                aVar.b(login.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: f8.v0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        Login login2 = Login.this;
                        String str2 = Login.f3556m0;
                        login2.P();
                        dialogInterface.dismiss();
                    }
                });
                aVar.d();
                return;
            default:
                g8.a aVar2 = (g8.a) this.f4590t;
                ArrayList<String> arrayList = aVar2.f4896v.get((String) this.f4591u);
                DnsPornBlocker.a aVar3 = (DnsPornBlocker.a) aVar2;
                DnsPornBlocker.this.f3538h0 = arrayList.get(0);
                DnsPornBlocker.this.Z.setText(arrayList.get(0));
                DnsPornBlocker.this.f3531a0.setText(arrayList.get(1));
                return;
        }
    }
}
