package n3;

import a4.i;
import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;

@TargetApi(17)
/* loaded from: classes.dex */
public class u1 extends e {
    public u1() {
        super(null);
    }

    public final String e(Context context) {
        if (b1.f16447b == null) {
            b1.f16447b = new b1();
        }
        b1 b1Var = b1.f16447b;
        if (TextUtils.isEmpty(b1Var.f16448a)) {
            b1Var.f16448a = (String) z0.a(context, new a1(i.a(context), context));
        }
        return b1Var.f16448a;
    }
}
