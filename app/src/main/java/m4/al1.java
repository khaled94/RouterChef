package m4;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class al1 {

    /* renamed from: e */
    public static al1 f6185e;

    /* renamed from: a */
    public final Handler f6186a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<qm2>> f6187b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f6188c = new Object();

    /* renamed from: d */
    public int f6189d = 0;

    public al1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new gj1(this), intentFilter);
    }

    public static /* synthetic */ void a(al1 al1Var, int i10) {
        synchronized (al1Var.f6188c) {
            if (al1Var.f6189d == i10) {
                return;
            }
            al1Var.f6189d = i10;
            Iterator<WeakReference<qm2>> it = al1Var.f6187b.iterator();
            while (it.hasNext()) {
                WeakReference<qm2> next = it.next();
                qm2 qm2Var = next.get();
                if (qm2Var != null) {
                    rm2.a(qm2Var.f12930a, i10);
                } else {
                    al1Var.f6187b.remove(next);
                }
            }
        }
    }
}
