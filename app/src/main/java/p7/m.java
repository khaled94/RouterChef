package p7;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m4.hu1;
import r7.e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b */
    public static final long f16994b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f16995c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static m f16996d;

    /* renamed from: a */
    public final hu1 f16997a;

    public m(hu1 hu1Var) {
        this.f16997a = hu1Var;
    }

    public static m c() {
        if (hu1.f9452s == null) {
            hu1.f9452s = new hu1();
        }
        hu1 hu1Var = hu1.f9452s;
        if (f16996d == null) {
            f16996d = new m(hu1Var);
        }
        return f16996d;
    }

    public final long a() {
        Objects.requireNonNull(this.f16997a);
        return System.currentTimeMillis();
    }

    public final long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public final boolean d(e eVar) {
        if (TextUtils.isEmpty(eVar.a())) {
            return true;
        }
        return eVar.b() + eVar.g() < b() + f16994b;
    }
}
