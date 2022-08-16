package g8;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.raouf.routerchef.R;
import s1.a;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: a */
    public Context f4949a;

    /* renamed from: b */
    public int[] f4950b = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};

    /* renamed from: c */
    public int[] f4951c = {R.string.step1, R.string.step2, R.string.step3, R.string.step4};

    /* renamed from: d */
    public int[] f4952d = {R.string.step1_desc, R.string.step2_desc, R.string.step3_desc, R.string.step4_desc};

    public l(Context context) {
        this.f4949a = context;
    }

    @Override // s1.a
    public final void a(ViewGroup viewGroup, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }
}
