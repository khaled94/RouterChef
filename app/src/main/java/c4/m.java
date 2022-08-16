package c4;

import b4.b;
import c5.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f2717a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<j<?>, Boolean> f2718b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f2717a) {
            hashMap = new HashMap(this.f2717a);
        }
        synchronized (this.f2718b) {
            hashMap2 = new HashMap(this.f2718b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j) entry2.getKey()).c(new b(status));
            }
        }
    }
}
