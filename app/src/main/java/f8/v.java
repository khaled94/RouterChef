package f8;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.d;
import com.raouf.routerchef.BandwidthUsage;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: s */
    public final /* synthetic */ int f4697s;

    /* renamed from: t */
    public final /* synthetic */ Object f4698t;

    public /* synthetic */ v(Object obj, int i10) {
        this.f4697s = i10;
        this.f4698t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4697s) {
            case 0:
                BandwidthUsage bandwidthUsage = (BandwidthUsage) this.f4698t;
                int i10 = BandwidthUsage.f3514h0;
                Objects.requireNonNull(bandwidthUsage);
                bandwidthUsage.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                bandwidthUsage.f3518d0.dismiss();
                return;
            default:
                ((d) this.f4698t).dismiss();
                return;
        }
    }
}
