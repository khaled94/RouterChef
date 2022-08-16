package t8;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import s.h;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final Context f18764a;

    /* renamed from: b */
    public final ExecutorService f18765b;

    /* renamed from: c */
    public final j f18766c;

    /* renamed from: h */
    public final a f18771h;

    /* renamed from: i */
    public final Handler f18772i;

    /* renamed from: j */
    public final d f18773j;

    /* renamed from: k */
    public final a0 f18774k;

    /* renamed from: m */
    public final boolean f18776m;

    /* renamed from: n */
    public boolean f18777n;

    /* renamed from: d */
    public final Map<String, t8.c> f18767d = new LinkedHashMap();

    /* renamed from: e */
    public final Map<Object, t8.a> f18768e = new WeakHashMap();

    /* renamed from: f */
    public final Map<Object, t8.a> f18769f = new WeakHashMap();

    /* renamed from: g */
    public final Set<Object> f18770g = new LinkedHashSet();

    /* renamed from: l */
    public final List<t8.c> f18775l = new ArrayList(4);

    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a */
        public final i f18778a;

        /* renamed from: t8.i$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0122a implements Runnable {

            /* renamed from: s */
            public final /* synthetic */ Message f18779s;

            public RunnableC0122a(Message message) {
                this.f18779s = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder c10 = androidx.activity.result.a.c("Unknown handler message received: ");
                c10.append(this.f18779s.what);
                throw new AssertionError(c10.toString());
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f18778a = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
            if (r5 != 12) goto L76;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List<t8.a>, java.util.List, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List<t8.a>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v32, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r1v34, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r1v40, types: [android.os.Handler] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r3v58, types: [java.util.List<t8.c>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v82, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r3v87, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, t8.c>] */
        /* JADX WARN: Type inference failed for: r5v15, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, t8.c>] */
        /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r17) {
            /*
                Method dump skipped, instructions count: 1030
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t8.i.a.handleMessage(android.os.Message):void");
        }
    }

    /* loaded from: classes.dex */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: a */
        public final i f18780a;

        public c(i iVar) {
            this.f18780a = iVar;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (!intent.hasExtra("state")) {
                    return;
                }
                i iVar = this.f18780a;
                boolean booleanExtra = intent.getBooleanExtra("state", false);
                a aVar = iVar.f18771h;
                aVar.sendMessage(aVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
            } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            } else {
                StringBuilder sb = e0.f18755a;
                i iVar2 = this.f18780a;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                a aVar2 = iVar2.f18771h;
                aVar2.sendMessage(aVar2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r6, java.util.concurrent.ExecutorService r7, android.os.Handler r8, t8.j r9, t8.d r10, t8.a0 r11) {
        /*
            r5 = this;
            r5.<init>()
            t8.i$b r0 = new t8.i$b
            r0.<init>()
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            java.lang.StringBuilder r2 = t8.e0.f18755a
            t8.d0 r2 = new t8.d0
            r2.<init>(r1)
            android.os.Message r1 = r2.obtainMessage()
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.sendMessageDelayed(r1, r3)
            r5.f18764a = r6
            r5.f18765b = r7
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.f18767d = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f18768e = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f18769f = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r5.f18770g = r7
            t8.i$a r7 = new t8.i$a
            android.os.Looper r0 = r0.getLooper()
            r7.<init>(r0, r5)
            r5.f18771h = r7
            r5.f18766c = r9
            r5.f18772i = r8
            r5.f18773j = r10
            r5.f18774k = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 4
            r7.<init>(r8)
            r5.f18775l = r7
            android.content.ContentResolver r7 = r6.getContentResolver()
            r8 = 1
            r9 = 0
            java.lang.String r10 = "airplane_mode_on"
            int r7 = android.provider.Settings.Global.getInt(r7, r10, r9)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L6a
            r7 = r8
            goto L6b
        L6a:
            r7 = r9
        L6b:
            r5.f18777n = r7
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = r6.checkCallingOrSelfPermission(r7)
            if (r6 != 0) goto L76
            goto L77
        L76:
            r8 = r9
        L77:
            r5.f18776m = r8
            t8.i$c r6 = new t8.i$c
            r6.<init>(r5)
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r8 = "android.intent.action.AIRPLANE_MODE"
            r7.addAction(r8)
            t8.i r8 = r6.f18780a
            boolean r8 = r8.f18776m
            if (r8 == 0) goto L93
            java.lang.String r8 = "android.net.conn.CONNECTIVITY_CHANGE"
            r7.addAction(r8)
        L93:
            t8.i r8 = r6.f18780a
            android.content.Context r8 = r8.f18764a
            r8.registerReceiver(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.i.<init>(android.content.Context, java.util.concurrent.ExecutorService, android.os.Handler, t8.j, t8.d, t8.a0):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<t8.c>, java.util.ArrayList] */
    public final void a(t8.c cVar) {
        Future<?> future = cVar.F;
        if (future != null && future.isCancelled()) {
            return;
        }
        Bitmap bitmap = cVar.E;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f18775l.add(cVar);
        if (this.f18771h.hasMessages(7)) {
            return;
        }
        this.f18771h.sendEmptyMessageDelayed(7, 200L);
    }

    public final void b(t8.c cVar) {
        a aVar = this.f18771h;
        aVar.sendMessage(aVar.obtainMessage(4, cVar));
    }

    public final void c(t8.c cVar) {
        a aVar = this.f18771h;
        aVar.sendMessage(aVar.obtainMessage(6, cVar));
    }

    public final void d(t8.c cVar, boolean z10) {
        if (cVar.f18744t.f18811m) {
            String d5 = e0.d(cVar);
            StringBuilder c10 = androidx.activity.result.a.c("for error");
            c10.append(z10 ? " (will replay)" : "");
            e0.g("Dispatcher", "batched", d5, c10.toString());
        }
        this.f18767d.remove(cVar.f18748x);
        a(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, t8.c>] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List<t8.a>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Map<java.lang.Object, t8.a>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<t8.a>, java.util.ArrayList] */
    public final void e(t8.a aVar, boolean z10) {
        t8.c cVar;
        String str;
        String str2;
        if (this.f18770g.contains(aVar.f18707j)) {
            this.f18769f.put(aVar.d(), aVar);
            if (!aVar.f18698a.f18811m) {
                return;
            }
            String b10 = aVar.f18699b.b();
            StringBuilder c10 = androidx.activity.result.a.c("because tag '");
            c10.append(aVar.f18707j);
            c10.append("' is paused");
            e0.g("Dispatcher", "paused", b10, c10.toString());
            return;
        }
        t8.c cVar2 = (t8.c) this.f18767d.get(aVar.f18706i);
        if (cVar2 != null) {
            boolean z11 = cVar2.f18744t.f18811m;
            w wVar = aVar.f18699b;
            if (cVar2.C != null) {
                if (cVar2.D == null) {
                    cVar2.D = new ArrayList(3);
                }
                cVar2.D.add(aVar);
                if (z11) {
                    e0.g("Hunter", "joined", wVar.b(), e0.e(cVar2, "to "));
                }
                int i10 = aVar.f18699b.f18847r;
                if (h.b(i10) <= h.b(cVar2.K)) {
                    return;
                }
                cVar2.K = i10;
                return;
            }
            cVar2.C = aVar;
            if (!z11) {
                return;
            }
            ?? r11 = cVar2.D;
            if (r11 == 0 || r11.isEmpty()) {
                str2 = wVar.b();
                str = "to empty hunter";
            } else {
                str2 = wVar.b();
                str = e0.e(cVar2, "to ");
            }
            e0.g("Hunter", "joined", str2, str);
        } else if (this.f18765b.isShutdown()) {
            if (!aVar.f18698a.f18811m) {
                return;
            }
            e0.g("Dispatcher", "ignored", aVar.f18699b.b(), "because shut down");
        } else {
            t tVar = aVar.f18698a;
            d dVar = this.f18773j;
            a0 a0Var = this.f18774k;
            Object obj = t8.c.L;
            w wVar2 = aVar.f18699b;
            List<y> list = tVar.f18801c;
            int i11 = 0;
            int size = list.size();
            while (true) {
                if (i11 >= size) {
                    cVar = new t8.c(tVar, this, dVar, a0Var, aVar, t8.c.O);
                    break;
                }
                y yVar = list.get(i11);
                if (yVar.c(wVar2)) {
                    cVar = new t8.c(tVar, this, dVar, a0Var, aVar, yVar);
                    break;
                }
                i11++;
            }
            cVar.F = this.f18765b.submit(cVar);
            this.f18767d.put(aVar.f18706i, cVar);
            if (z10) {
                this.f18768e.remove(aVar.d());
            }
            if (!aVar.f18698a.f18811m) {
                return;
            }
            e0.f("Dispatcher", "enqueued", aVar.f18699b.b());
        }
    }
}
