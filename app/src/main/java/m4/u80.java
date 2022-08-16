package m4;

import android.os.Bundle;
import android.os.Parcelable;
import h4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class u80 {

    /* renamed from: a */
    public final a f14269a;

    /* renamed from: b */
    public final d90 f14270b;

    /* renamed from: e */
    public final String f14273e;

    /* renamed from: f */
    public final String f14274f;

    /* renamed from: d */
    public final Object f14272d = new Object();
    @GuardedBy("lock")

    /* renamed from: g */
    public long f14275g = -1;
    @GuardedBy("lock")

    /* renamed from: h */
    public long f14276h = -1;
    @GuardedBy("lock")

    /* renamed from: i */
    public long f14277i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    public long f14278j = -1;
    @GuardedBy("lock")

    /* renamed from: k */
    public long f14279k = -1;
    @GuardedBy("lock")

    /* renamed from: c */
    public final LinkedList<t80> f14271c = new LinkedList<>();

    public u80(a aVar, d90 d90Var, String str, String str2) {
        this.f14269a = aVar;
        this.f14270b = d90Var;
        this.f14273e = str;
        this.f14274f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f14272d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f14273e);
                bundle.putString("slotid", this.f14274f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f14278j);
                bundle.putLong("tresponse", this.f14279k);
                bundle.putLong("timp", this.f14275g);
                bundle.putLong("tload", this.f14276h);
                bundle.putLong("pcc", this.f14277i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator<t80> it = this.f14271c.iterator();
                while (it.hasNext()) {
                    t80 next = it.next();
                    Objects.requireNonNull(next);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", next.f13956a);
                    bundle2.putLong("tclose", next.f13957b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
