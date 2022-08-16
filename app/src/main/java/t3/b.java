package t3;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends LinkedHashMap<String, Pair<Long, String>> {

    /* renamed from: s */
    public final /* synthetic */ k f18578s;

    public b(k kVar) {
        this.f18578s = kVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        return size() > this.f18578s.f18597a;
    }
}
