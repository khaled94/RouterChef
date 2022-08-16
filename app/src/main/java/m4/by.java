package m4;

import android.text.TextUtils;
import java.util.Map;
import n3.g1;

/* loaded from: classes.dex */
public final class by implements lx<Object> {

    /* renamed from: s */
    public final ay f6644s;

    public by(ay ayVar) {
        this.f6644s = ayVar;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f6644s.c();
                return;
            } else if (!"video_complete".equals(str)) {
                return;
            } else {
                this.f6644s.a();
                return;
            }
        }
        k60 k60Var = null;
        try {
            int parseInt = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                k60Var = new k60(str2, parseInt);
            }
        } catch (NumberFormatException e10) {
            g1.k("Unable to parse reward amount.", e10);
        }
        this.f6644s.n0(k60Var);
    }
}
