package s4;

import android.content.Context;
import android.util.Log;
import d.c;
import javax.annotation.Nullable;
import m4.ps;
import r2.d;

/* loaded from: classes.dex */
public final class c5 implements a5 {

    /* renamed from: c */
    public static c5 f17752c;
    @Nullable

    /* renamed from: a */
    public final Context f17753a;
    @Nullable

    /* renamed from: b */
    public final b5 f17754b;

    public c5() {
        this.f17753a = null;
        this.f17754b = null;
    }

    public c5(Context context) {
        this.f17753a = context;
        b5 b5Var = new b5();
        this.f17754b = b5Var;
        context.getContentResolver().registerContentObserver(t4.f18103a, true, b5Var);
    }

    public static c5 a(Context context) {
        c5 c5Var;
        synchronized (c5.class) {
            if (f17752c == null) {
                f17752c = c.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new c5(context) : new c5();
            }
            c5Var = f17752c;
        }
        return c5Var;
    }

    /* renamed from: b */
    public final String z(String str) {
        if (this.f17753a == null) {
            return null;
        }
        try {
            return (String) d.d(new ps(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }
}
