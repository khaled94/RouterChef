package u7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c */
    public static WeakReference<l0> f19532c;

    /* renamed from: a */
    public i0 f19533a;

    /* renamed from: b */
    public final Executor f19534b;

    public l0(SharedPreferences sharedPreferences, Executor executor) {
        this.f19534b = executor;
    }

    public final synchronized k0 a() {
        String peek;
        k0 k0Var;
        i0 i0Var = this.f19533a;
        synchronized (i0Var.f19513d) {
            peek = i0Var.f19513d.peek();
        }
        Pattern pattern = k0.f19526d;
        k0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                k0Var = new k0(split[0], split[1]);
            }
        }
        return k0Var;
    }
}
