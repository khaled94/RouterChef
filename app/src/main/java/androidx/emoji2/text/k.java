package androidx.emoji2.text;

import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.j;
import com.raouf.routerchef.Login;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f1343s;

    /* renamed from: t */
    public final /* synthetic */ Object f1344t;

    public /* synthetic */ k(Object obj, int i10) {
        this.f1343s = i10;
        this.f1344t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1343s) {
            case 0:
                ((j.b) this.f1344t).c();
                return;
            case 1:
                String str = Login.f3556m0;
                ((Login) this.f1344t).R();
                return;
            default:
                ((TextView) ((View) this.f1344t)).setTextColor(-7829368);
                return;
        }
    }
}
