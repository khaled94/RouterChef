package h2;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import t4.b;
import t4.i;
import t4.l;
import t4.r;
import t4.t;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b */
    public final String f4963b;

    /* renamed from: d */
    public volatile a0 f4965d;

    /* renamed from: e */
    public Context f4966e;

    /* renamed from: f */
    public volatile l f4967f;

    /* renamed from: g */
    public volatile s f4968g;

    /* renamed from: h */
    public boolean f4969h;

    /* renamed from: j */
    public boolean f4971j;

    /* renamed from: k */
    public boolean f4972k;

    /* renamed from: l */
    public boolean f4973l;

    /* renamed from: m */
    public boolean f4974m;

    /* renamed from: n */
    public boolean f4975n;

    /* renamed from: o */
    public boolean f4976o;
    public boolean p;

    /* renamed from: q */
    public boolean f4977q;

    /* renamed from: s */
    public ExecutorService f4979s;

    /* renamed from: a */
    public volatile int f4962a = 0;

    /* renamed from: c */
    public final Handler f4964c = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public int f4970i = 0;

    /* renamed from: r */
    public boolean f4978r = false;

    public c(boolean z10, Context context, h hVar) {
        String g10 = g();
        this.f4963b = g10;
        Context applicationContext = context.getApplicationContext();
        this.f4966e = applicationContext;
        this.f4965d = new a0(applicationContext, hVar);
        this.f4977q = z10;
    }

    @SuppressLint({"PrivateApi"})
    public static String g() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "5.0.0";
        }
    }

    @Override // h2.b
    public final void a(g gVar) {
        f fVar;
        if (!b()) {
            fVar = t.f5036k;
        } else if (TextUtils.isEmpty("subs")) {
            i.f("BillingClient", "Please provide a valid product type.");
            fVar = t.f5031f;
        } else if (h(new o(this, gVar), 30000L, new l(gVar, 0), d()) != null) {
            return;
        } else {
            fVar = f();
        }
        r rVar = t.f18662t;
        gVar.b(fVar, b.f18636w);
    }

    public final boolean b() {
        return (this.f4962a != 2 || this.f4967f == null || this.f4968g == null) ? false : true;
    }

    public final void c(d dVar) {
        ServiceInfo serviceInfo;
        String str;
        if (b()) {
            i.e("BillingClient", "Service connection is valid. No need to re-initialize.");
            dVar.a(t.f5035j);
        } else if (this.f4962a == 1) {
            i.f("BillingClient", "Client is already in the process of connecting to billing service.");
            dVar.a(t.f5029d);
        } else if (this.f4962a == 3) {
            i.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            dVar.a(t.f5036k);
        } else {
            this.f4962a = 1;
            a0 a0Var = this.f4965d;
            Objects.requireNonNull(a0Var);
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
            z zVar = (z) a0Var.f4957t;
            Context context = (Context) a0Var.f4956s;
            if (!zVar.f5050c) {
                context.registerReceiver((z) zVar.f5051d.f4957t, intentFilter);
                zVar.f5050c = true;
            }
            i.e("BillingClient", "Starting in-app billing setup.");
            this.f4968g = new s(this, dVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f4966e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f4963b);
                    if (this.f4966e.bindService(intent2, this.f4968g, 1)) {
                        i.e("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                i.f("BillingClient", str);
            }
            this.f4962a = 0;
            i.e("BillingClient", "Billing service unavailable on device.");
            dVar.a(t.f5028c);
        }
    }

    public final Handler d() {
        return Looper.myLooper() == null ? this.f4964c : new Handler(Looper.myLooper());
    }

    public final f e(f fVar) {
        if (Thread.interrupted()) {
            return fVar;
        }
        this.f4964c.post(new n(this, fVar, 0));
        return fVar;
    }

    public final f f() {
        return (this.f4962a == 0 || this.f4962a == 3) ? t.f5036k : t.f5034i;
    }

    public final Future h(Callable callable, long j3, Runnable runnable, Handler handler) {
        long j10 = (long) (j3 * 0.95d);
        if (this.f4979s == null) {
            this.f4979s = Executors.newFixedThreadPool(i.f18651a, new p());
        }
        try {
            Future submit = this.f4979s.submit(callable);
            handler.postDelayed(new m(submit, runnable), j10);
            return submit;
        } catch (Exception e10) {
            i.g("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }
}
