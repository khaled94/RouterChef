package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import d4.m;
import j4.c;
import n3.z0;

/* loaded from: classes.dex */
public final class rr {

    /* renamed from: a */
    public final Context f13421a;

    public rr(Context context) {
        m.i(context, "Context can not be null");
        this.f13421a = context;
    }

    public final boolean a(Intent intent) {
        m.i(intent, "Intent can not be null");
        return !this.f13421a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @TargetApi(14)
    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) z0.a(this.f13421a, new qr())).booleanValue() && c.a(this.f13421a).f5450a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
