package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import c2.p;
import d2.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t1.h;
import u1.b;
import u1.k;
import y1.c;
import y1.d;

/* loaded from: classes.dex */
public final class a implements c, b {
    public static final String C = h.e("SystemFgDispatcher");
    public final d A;
    public AbstractC0030a B;

    /* renamed from: s */
    public Context f2377s;

    /* renamed from: t */
    public k f2378t;

    /* renamed from: u */
    public final f2.a f2379u;

    /* renamed from: v */
    public final Object f2380v = new Object();

    /* renamed from: w */
    public String f2381w = null;

    /* renamed from: x */
    public final Map<String, t1.d> f2382x = new LinkedHashMap();

    /* renamed from: z */
    public final Set<p> f2383z = new HashSet();
    public final Map<String, p> y = new HashMap();

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0030a {
    }

    public a(Context context) {
        this.f2377s = context;
        k c10 = k.c(context);
        this.f2378t = c10;
        f2.a aVar = c10.f19026d;
        this.f2379u = aVar;
        this.A = new d(this.f2377s, aVar, this);
        this.f2378t.f19028f.b(this);
    }

    public static Intent b(Context context, String str, t1.d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f18465a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f18466b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f18467c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context, String str, t1.d dVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f18465a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f18466b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f18467c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, c2.p>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, t1.d>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.HashSet, java.util.Set<c2.p>] */
    @Override // u1.b
    public final void a(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f2380v) {
            p pVar = (p) this.y.remove(str);
            if (pVar != null ? this.f2383z.remove(pVar) : false) {
                this.A.b(this.f2383z);
            }
        }
        t1.d remove = this.f2382x.remove(str);
        if (str.equals(this.f2381w) && this.f2382x.size() > 0) {
            Iterator it = this.f2382x.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f2381w = (String) entry.getKey();
            if (this.B != null) {
                t1.d dVar = (t1.d) entry.getValue();
                ((SystemForegroundService) this.B).e(dVar.f18465a, dVar.f18466b, dVar.f18467c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.B;
                systemForegroundService.f2369t.post(new b2.d(systemForegroundService, dVar.f18465a));
            }
        }
        AbstractC0030a abstractC0030a = this.B;
        if (remove == null || abstractC0030a == null) {
            return;
        }
        h.c().a(C, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove.f18465a), str, Integer.valueOf(remove.f18466b)), new Throwable[0]);
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) abstractC0030a;
        systemForegroundService2.f2369t.post(new b2.d(systemForegroundService2, remove.f18465a));
    }

    @Override // y1.c
    public final void c(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                h.c().a(C, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                k kVar = this.f2378t;
                ((f2.b) kVar.f19026d).a(new l(kVar, str, true));
            }
        }
    }

    @Override // y1.c
    public final void d(List<String> list) {
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, t1.d>] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, t1.d>] */
    public final void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        h.c().a(C, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.B == null) {
            return;
        }
        this.f2382x.put(stringExtra, new t1.d(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f2381w)) {
            this.f2381w = stringExtra;
            ((SystemForegroundService) this.B).e(intExtra, intExtra2, notification);
            return;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.B;
        systemForegroundService.f2369t.post(new b2.c(systemForegroundService, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry entry : this.f2382x.entrySet()) {
            i10 |= ((t1.d) entry.getValue()).f18466b;
        }
        t1.d dVar = (t1.d) this.f2382x.get(this.f2381w);
        if (dVar == null) {
            return;
        }
        ((SystemForegroundService) this.B).e(dVar.f18465a, i10, dVar.f18467c);
    }

    public final void g() {
        this.B = null;
        synchronized (this.f2380v) {
            this.A.c();
        }
        this.f2378t.f19028f.e(this);
    }
}
