package m4;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class aw0 implements lx {

    /* renamed from: s */
    public final /* synthetic */ int f6278s;

    /* renamed from: t */
    public final /* synthetic */ Object f6279t;

    public /* synthetic */ aw0(Object obj, int i10) {
        this.f6278s = i10;
        this.f6279t = obj;
    }

    @Override // m4.lx
    public final void a(Object obj, Map map) {
        switch (this.f6278s) {
            case 0:
                vd0 vd0Var = (vd0) obj;
                ((ce0) vd0Var.q0()).y = new z10((dw0) this.f6279t, map, null);
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    vd0Var.loadData(str, "text/html", "UTF-8");
                    return;
                } else {
                    vd0Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                    return;
                }
            default:
                vd0 vd0Var2 = (vd0) obj;
                ((ay0) this.f6279t).f6294b.f10877w = false;
                return;
        }
    }
}
