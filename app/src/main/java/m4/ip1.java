package m4;

import h4.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ip1 {

    /* renamed from: a */
    public final a f9718a;

    /* renamed from: b */
    public final Map<String, List<String>> f9719b = new HashMap();

    /* renamed from: c */
    public final Map<String, Long> f9720c = new HashMap();

    public ip1(a aVar) {
        this.f9718a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    public final void a(String str, String str2) {
        if (!this.f9719b.containsKey(str)) {
            this.f9719b.put(str, new ArrayList());
        }
        ((List) this.f9719b.get(str)).add(str2);
    }
}
