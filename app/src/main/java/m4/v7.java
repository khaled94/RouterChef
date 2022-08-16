package m4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v7 extends u7 {
    public static final /* synthetic */ int T = 0;

    public v7(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    @Override // m4.u7
    public final List n(n8 n8Var, Context context, v5 v5Var) {
        if (n8Var.f11551b == null || !this.M) {
            return super.n(n8Var, context, v5Var);
        }
        int a10 = n8Var.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.n(n8Var, context, v5Var));
        arrayList.add(new c9(n8Var, v5Var, a10));
        return arrayList;
    }
}
