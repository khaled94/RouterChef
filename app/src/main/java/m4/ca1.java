package m4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class ca1 {

    /* renamed from: a */
    public final Object f6758a;

    /* renamed from: b */
    public final Object f6759b;

    /* renamed from: c */
    public final Object f6760c;

    /* renamed from: d */
    public final Object f6761d;

    public /* synthetic */ ca1(s3 s3Var, BlockingQueue blockingQueue, w3 w3Var) {
        this.f6758a = new HashMap();
        this.f6761d = w3Var;
        this.f6759b = s3Var;
        this.f6760c = blockingQueue;
    }

    public /* synthetic */ ca1(wm1 wm1Var, g01 g01Var, f11 f11Var, ep1 ep1Var) {
        this.f6758a = wm1Var;
        this.f6759b = g01Var;
        this.f6760c = f11Var;
        this.f6761d = ep1Var;
    }

    public final synchronized void a(e4 e4Var) {
        String d5 = e4Var.d();
        List list = (List) ((Map) this.f6758a).remove(d5);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (p4.f12403a) {
            p4.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), d5);
        }
        e4 e4Var2 = (e4) list.remove(0);
        ((Map) this.f6758a).put(d5, list);
        synchronized (e4Var2.f7722w) {
            e4Var2.C = this;
        }
        try {
            ((BlockingQueue) this.f6760c).put(e4Var2);
        } catch (InterruptedException e10) {
            p4.b("Couldn't add request to queue. %s", e10.toString());
            Thread.currentThread().interrupt();
            s3 s3Var = (s3) this.f6759b;
            s3Var.f13504v = true;
            s3Var.interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final void b(em1 em1Var, cm1 cm1Var, int i10, @Nullable i71 i71Var, long j3) {
        if (((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue()) {
            dp1 b10 = dp1.b("adapter_status");
            b10.e(em1Var);
            b10.f7586a.put("aai", cm1Var.f7065x);
            b10.a("adapter_l", String.valueOf(j3));
            b10.a("sc", Integer.toString(i10));
            if (i71Var != null) {
                b10.a("arec", Integer.toString(i71Var.f9551t.f7067s));
                String a10 = ((wm1) this.f6758a).a(i71Var.getMessage());
                if (a10 != null) {
                    b10.a("areec", a10);
                }
            }
            f01 a11 = ((g01) this.f6759b).a(cm1Var.f7062u);
            if (a11 != null) {
                b10.a("ancn", a11.f8308a);
                e30 e30Var = a11.f8309b;
                if (e30Var != null) {
                    b10.a("adapter_v", e30Var.toString());
                }
                e30 e30Var2 = a11.f8310c;
                if (e30Var2 != null) {
                    b10.a("adapter_sv", e30Var2.toString());
                }
            }
            ((ep1) this.f6761d).a(b10);
            return;
        }
        e11 a12 = ((f11) this.f6760c).a();
        a12.b(em1Var);
        a12.f7689a.put("aai", cm1Var.f7065x);
        a12.a("action", "adapter_status");
        a12.a("adapter_l", String.valueOf(j3));
        a12.a("sc", Integer.toString(i10));
        if (i71Var != null) {
            a12.a("arec", Integer.toString(i71Var.f9551t.f7067s));
            String a13 = ((wm1) this.f6758a).a(i71Var.getMessage());
            if (a13 != null) {
                a12.a("areec", a13);
            }
        }
        f01 a14 = ((g01) this.f6759b).a(cm1Var.f7062u);
        if (a14 != null) {
            a12.a("ancn", a14.f8308a);
            e30 e30Var3 = a14.f8309b;
            if (e30Var3 != null) {
                a12.a("adapter_v", e30Var3.toString());
            }
            e30 e30Var4 = a14.f8310c;
            if (e30Var4 != null) {
                a12.a("adapter_sv", e30Var4.toString());
            }
        }
        a12.c();
    }

    public final synchronized boolean c(e4 e4Var) {
        String d5 = e4Var.d();
        if (!((Map) this.f6758a).containsKey(d5)) {
            ((Map) this.f6758a).put(d5, null);
            synchronized (e4Var.f7722w) {
                e4Var.C = this;
            }
            if (p4.f12403a) {
                p4.a("new request, sending to network %s", d5);
            }
            return false;
        }
        List list = (List) ((Map) this.f6758a).get(d5);
        if (list == null) {
            list = new ArrayList();
        }
        e4Var.f("waiting-for-response");
        list.add(e4Var);
        ((Map) this.f6758a).put(d5, list);
        if (p4.f12403a) {
            p4.a("Request for cacheKey=%s is in flight, putting on hold.", d5);
        }
        return true;
    }
}
