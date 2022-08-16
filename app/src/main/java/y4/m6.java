package y4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m6 {

    /* renamed from: a */
    public final w2 f20586a;

    public m6(w2 w2Var) {
        this.f20586a = w2Var;
    }

    public final void a(String str, Bundle bundle) {
        String str2;
        this.f20586a.B().g();
        if (!this.f20586a.f()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f20586a.s().L.b(str2);
            c2 c2Var = this.f20586a.s().M;
            Objects.requireNonNull(this.f20586a.F);
            c2Var.b(System.currentTimeMillis());
        }
    }

    public final boolean b() {
        return this.f20586a.s().M.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        Objects.requireNonNull(this.f20586a.F);
        return System.currentTimeMillis() - this.f20586a.s().M.a() > this.f20586a.y.p(null, f1.R);
    }
}
