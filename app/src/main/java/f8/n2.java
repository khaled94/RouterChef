package f8;

import com.android.billingclient.api.SkuDetails;
import com.raouf.routerchef.StorePurchase;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements Comparator {

    /* renamed from: s */
    public static final /* synthetic */ n2 f4661s = new n2();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = StorePurchase.R;
        return Long.compare(((SkuDetails) obj).f2899b.optLong("price_amount_micros"), ((SkuDetails) obj2).f2899b.optLong("price_amount_micros"));
    }
}
