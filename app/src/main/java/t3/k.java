package t3;

import android.util.Pair;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import l3.s;
import m4.es;
import m4.jo;
import m4.yr;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final int f18597a;

    /* renamed from: b */
    public final long f18598b;

    /* renamed from: c */
    public final Map<String, Pair<Long, String>> f18599c = Collections.synchronizedMap(new b(this));

    public k() {
        yr<Integer> yrVar = es.L4;
        jo joVar = jo.f10145d;
        this.f18597a = ((Integer) joVar.f10148c.a(yrVar)).intValue();
        this.f18598b = ((Long) joVar.f10148c.a(es.M4)).longValue();
    }

    public final void a() {
        Objects.requireNonNull(s.B.f5796j);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.f18599c.entrySet().iterator();
            while (it.hasNext() && currentTimeMillis - ((Long) it.next().getValue().first).longValue() > this.f18598b) {
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            s.B.f5793g.g(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
