package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class c1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ d1 f16451a;

    public c1(d1 d1Var) {
        this.f16451a = d1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.WeakHashMap, java.util.Map<android.content.BroadcastReceiver, android.content.IntentFilter>] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d1 d1Var = this.f16451a;
        synchronized (d1Var) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : d1Var.f16455b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
            }
        }
    }
}
