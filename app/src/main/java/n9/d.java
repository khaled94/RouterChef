package n9;

import c4.a;
import d.b;
import d9.l;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k9.b1;
import k9.e0;
import k9.n;
import k9.o0;
import k9.q;
import k9.z0;
import s4.eb;
import x8.f;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class d implements d1 {

    /* renamed from: u */
    public static String f16687u;

    /* renamed from: s */
    public static final r f16685s = new r("UNDEFINED");

    /* renamed from: t */
    public static final r f16686t = new r("REUSABLE_CLAIMED");

    /* renamed from: v */
    public static final /* synthetic */ d f16688v = new d();

    /* renamed from: w */
    public static final String[] f16689w = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};

    /* renamed from: x */
    public static final String[] f16690x = {"ad_impression"};
    public static final String[] y = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};

    /* renamed from: z */
    public static final String[] f16691z = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static final void a(x8.d dVar, Object obj, l lVar) {
        if (!(dVar instanceof c)) {
            dVar.d(obj);
            return;
        }
        c cVar = (c) dVar;
        Object d5 = a.d(obj, lVar);
        q qVar = cVar.f16682v;
        cVar.getContext();
        boolean z10 = true;
        if (qVar.n0()) {
            cVar.f16684x = d5;
            cVar.f5637u = 1;
            cVar.f16682v.m0(cVar.getContext(), cVar);
            return;
        }
        z0 z0Var = z0.f5699a;
        e0 a10 = z0.a();
        if (a10.s0()) {
            cVar.f16684x = d5;
            cVar.f5637u = 1;
            a10.q0(cVar);
            return;
        }
        a10.r0(true);
        try {
            o0 o0Var = (o0) cVar.getContext().get(o0.b.f5677s);
            if (o0Var == null || o0Var.b()) {
                z10 = false;
            } else {
                CancellationException L = o0Var.L();
                if (d5 instanceof n) {
                    ((n) d5).f5674b.c(L);
                }
                cVar.d(b.a(L));
            }
            if (!z10) {
                x8.d<T> dVar2 = cVar.f16683w;
                Object obj2 = cVar.y;
                f context = dVar2.getContext();
                Object b10 = t.b(context, obj2);
                b1 a11 = b10 != t.f16720a ? c1.f.a(dVar2, context) : null;
                cVar.f16683w.d(obj);
                if (a11 != null) {
                    throw null;
                }
                t.a(context, b10);
            }
            do {
            } while (a10.t0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
        if (r6.contains(r10) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r10) {
        /*
            java.lang.String r0 = n9.d.f16687u
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L31
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L31
        L5c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L66
            n9.d.f16687u = r4
            goto Le9
        L66:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
        L73:
            n9.d.f16687u = r10
            goto Le9
        L77:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc5
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.RuntimeException -> Lb5
            r0 = 64
            java.util.List r10 = r10.queryIntentActivities(r1, r0)     // Catch: java.lang.RuntimeException -> Lb5
            if (r10 == 0) goto Lbc
            int r0 = r10.size()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 != 0) goto L90
            goto Lbc
        L90:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.RuntimeException -> Lb5
        L94:
            boolean r0 = r10.hasNext()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r10.next()     // Catch: java.lang.RuntimeException -> Lb5
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.RuntimeException -> Lb5
            android.content.IntentFilter r1 = r0.filter     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            int r2 = r1.countDataAuthorities()     // Catch: java.lang.RuntimeException -> Lb5
            if (r2 == 0) goto L94
            int r1 = r1.countDataPaths()     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto L94
            goto Lc5
        Lb5:
            java.lang.String r10 = "CustomTabsHelper"
            java.lang.String r0 = "Runtime exception while getting specialized handlers"
            android.util.Log.e(r10, r0)
        Lbc:
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto Lc5
            n9.d.f16687u = r3
            goto Le9
        Lc5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lce
        Lcd:
            goto L73
        Lce:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ld7
            goto Lcd
        Ld7:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le0
            goto Lcd
        Le0:
            java.lang.String r10 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le9
            goto Lcd
        Le9:
            java.lang.String r10 = n9.d.f16687u
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.d.c(android.content.Context):java.lang.String");
    }

    public static String d(String str) {
        return c1.f.f(str, y, f16689w);
    }

    public static void e(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static String f(String str) {
        return c1.f.f(str, f16689w, y);
    }

    public static void g(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void h(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void i(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void j(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(eb.f17851t.f17852s.zza().zza());
    }
}
