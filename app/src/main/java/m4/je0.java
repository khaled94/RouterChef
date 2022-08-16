package m4;

import android.text.TextUtils;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class je0 implements lx<vd0> {

    /* renamed from: s */
    public final /* synthetic */ ke0 f9934s;

    public je0(ke0 ke0Var) {
        this.f9934s = ke0Var;
    }

    @Override // m4.lx
    public final /* bridge */ /* synthetic */ void a(vd0 vd0Var, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.f9934s) {
                    ke0 ke0Var = this.f9934s;
                    if (ke0Var.f10373a0 != parseInt) {
                        ke0Var.f10373a0 = parseInt;
                        ke0Var.requestLayout();
                    }
                }
            } catch (Exception e10) {
                g1.k("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
