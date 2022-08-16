package f8;

import android.view.View;
import com.raouf.routerchef.Blacklist;
import i8.f;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ int f4704s;

    /* renamed from: t */
    public final /* synthetic */ Object f4705t;

    public /* synthetic */ x(Object obj, int i10) {
        this.f4704s = i10;
        this.f4705t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4704s) {
            case 0:
                ((Blacklist) this.f4705t).f3529g0.dismiss();
                return;
            default:
                ((f) this.f4705t).f5280a.dismiss();
                return;
        }
    }
}
