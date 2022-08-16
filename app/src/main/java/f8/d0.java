package f8;

import com.raouf.routerchef.Blacklist;
import com.raouf.routerchef.RouterDevices;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import u9.e;
import u9.f;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4579s;

    /* renamed from: t */
    public final /* synthetic */ Object f4580t;

    public /* synthetic */ d0(Object obj, int i10) {
        this.f4579s = i10;
        this.f4580t = obj;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Deque<u9.e>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Deque<u9.e>, java.util.ArrayDeque] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        switch (this.f4579s) {
            case 0:
                ((Blacklist) this.f4580t).f3523a0.b();
                return;
            case 1:
                RouterDevices routerDevices = (RouterDevices) this.f4580t;
                routerDevices.Z.clear();
                routerDevices.f3618h0.post(new b0(routerDevices, routerDevices.Z, 1));
                routerDevices.f3611a0.setVisibility(8);
                routerDevices.f3615e0.setVisibility(0);
                return;
            default:
                f fVar = (f) this.f4580t;
                ThreadPoolExecutor threadPoolExecutor = f.f19652g;
                Objects.requireNonNull(fVar);
                while (true) {
                    long nanoTime = System.nanoTime();
                    synchronized (fVar) {
                        Iterator it = fVar.f19656d.iterator();
                        e eVar = null;
                        long j10 = Long.MIN_VALUE;
                        int i10 = 0;
                        int i11 = 0;
                        while (it.hasNext()) {
                            e eVar2 = (e) it.next();
                            if (fVar.b(eVar2, nanoTime) > 0) {
                                i11++;
                            } else {
                                i10++;
                                long j11 = nanoTime - eVar2.f19651q;
                                if (j11 > j10) {
                                    eVar = eVar2;
                                    j10 = j11;
                                }
                            }
                        }
                        j3 = fVar.f19654b;
                        if (j10 < j3 && i10 <= fVar.f19653a) {
                            if (i10 > 0) {
                                j3 -= j10;
                            } else if (i11 <= 0) {
                                fVar.f19658f = false;
                                j3 = -1;
                            }
                        }
                        fVar.f19656d.remove(eVar);
                        s9.e.d(eVar.f19640e);
                        j3 = 0;
                    }
                    if (j3 == -1) {
                        return;
                    }
                    if (j3 > 0) {
                        long j12 = j3 / 1000000;
                        long j13 = j3 - (1000000 * j12);
                        synchronized (fVar) {
                            try {
                                fVar.wait(j12, (int) j13);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
                break;
        }
    }
}
