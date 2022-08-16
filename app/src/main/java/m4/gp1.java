package m4;

import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class gp1 implements ep1 {

    /* renamed from: a */
    public final ep1 f8995a;

    /* renamed from: c */
    public final int f8997c;

    /* renamed from: b */
    public final Queue<dp1> f8996b = new LinkedBlockingQueue();

    /* renamed from: d */
    public final AtomicBoolean f8998d = new AtomicBoolean(false);

    public gp1(ep1 ep1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f8995a = ep1Var;
        yr<Integer> yrVar = es.L5;
        jo joVar = jo.f10145d;
        this.f8997c = ((Integer) joVar.f10148c.a(yrVar)).intValue();
        long intValue = ((Integer) joVar.f10148c.a(es.K5)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new cj(this, 9), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Queue<m4.dp1>, java.util.concurrent.LinkedBlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Queue<m4.dp1>, java.util.concurrent.LinkedBlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Queue<m4.dp1>, java.util.concurrent.LinkedBlockingQueue] */
    @Override // m4.ep1
    public final void a(dp1 dp1Var) {
        if (this.f8996b.size() < this.f8997c) {
            this.f8996b.offer(dp1Var);
        } else if (this.f8998d.getAndSet(true)) {
        } else {
            ?? r02 = this.f8996b;
            dp1 b10 = dp1.b("dropped_event");
            HashMap hashMap = (HashMap) dp1Var.g();
            if (hashMap.containsKey("action")) {
                b10.a("dropped_action", (String) hashMap.get("action"));
            }
            r02.offer(b10);
        }
    }

    @Override // m4.ep1
    public final String b(dp1 dp1Var) {
        return this.f8995a.b(dp1Var);
    }
}
