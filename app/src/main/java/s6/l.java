package s6;

import android.app.ActivityManager;
import android.util.Log;
import c5.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m4.ho0;
import u6.b0;
import u6.k;
import u6.l;
import u6.m;
import z6.b;
import z6.c;

/* loaded from: classes.dex */
public final class l implements Callable<i<Void>> {

    /* renamed from: a */
    public final /* synthetic */ long f18278a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f18279b;

    /* renamed from: c */
    public final /* synthetic */ Thread f18280c;

    /* renamed from: d */
    public final /* synthetic */ c f18281d;

    /* renamed from: e */
    public final /* synthetic */ o f18282e;

    public l(o oVar, long j3, Throwable th, Thread thread, c cVar) {
        this.f18282e = oVar;
        this.f18278a = j3;
        this.f18279b = th;
        this.f18280c = thread;
        this.f18281d = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final i<Void> call() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Boolean bool;
        long j3 = this.f18278a / 1000;
        String f10 = this.f18282e.f();
        if (f10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return c5.l.e(null);
        }
        this.f18282e.f18290c.b();
        j0 j0Var = this.f18282e.f18300m;
        Throwable th = this.f18279b;
        Thread thread = this.f18280c;
        Objects.requireNonNull(j0Var);
        String str = "Persisting fatal event for session " + f10;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        w wVar = j0Var.f18268a;
        int i10 = wVar.f18332a.getResources().getConfiguration().orientation;
        ho0 ho0Var = new ho0(th, wVar.f18335d);
        k.a aVar = new k.a();
        aVar.f19364b = "crash";
        aVar.b(j3);
        String str2 = wVar.f18334c.f18224d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) wVar.f18332a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str2)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            bool = Boolean.valueOf(runningAppProcessInfo.importance != 100);
        } else {
            bool = null;
        }
        l.b bVar = new l.b();
        bVar.f19376d = bool;
        bVar.b(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVar.f(thread, (StackTraceElement[]) ho0Var.f9394c, 4));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (!key.equals(thread)) {
                arrayList.add(wVar.f(key, wVar.f18335d.b(entry.getValue()), 0));
            }
        }
        bVar.f19373a = new m(new b0(arrayList), wVar.c(ho0Var, 0), null, wVar.e(), wVar.a(), null);
        aVar.f19365c = bVar.a();
        aVar.f19366d = wVar.b(i10);
        j0Var.f18269b.f(j0Var.a(aVar.a(), j0Var.f18271d, j0Var.f18272e), f10, true);
        this.f18282e.d(this.f18278a);
        this.f18282e.c(false, this.f18281d);
        o.a(this.f18282e);
        if (!this.f18282e.f18289b.a()) {
            return c5.l.e(null);
        }
        Executor executor = this.f18282e.f18291d.f18252a;
        return ((b) this.f18281d).f21000i.get().f2776a.p(executor, new k(this, executor));
    }
}
