package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import t1.h;
import u1.b;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: v */
    public static final String f2336v = h.e("CommandHandler");

    /* renamed from: s */
    public final Context f2337s;

    /* renamed from: t */
    public final Map<String, b> f2338t = new HashMap();

    /* renamed from: u */
    public final Object f2339u = new Object();

    public a(Context context) {
        this.f2337s = context;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, u1.b>] */
    @Override // u1.b
    public final void a(String str, boolean z10) {
        synchronized (this.f2339u) {
            b bVar = (b) this.f2338t.remove(str);
            if (bVar != null) {
                bVar.a(str, z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.HashMap, java.util.Map<java.lang.String, u1.b>] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.HashMap, java.util.Map<java.lang.String, u1.b>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Intent r11, int r12, androidx.work.impl.background.systemalarm.d r13) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.a.e(android.content.Intent, int, androidx.work.impl.background.systemalarm.d):void");
    }
}
