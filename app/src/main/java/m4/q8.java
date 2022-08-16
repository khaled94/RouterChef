package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class q8 extends y6<Integer, Long> {

    /* renamed from: a */
    public Long f12733a;

    /* renamed from: b */
    public Long f12734b;

    /* renamed from: c */
    public Long f12735c;

    /* renamed from: d */
    public Long f12736d;

    public q8(String str) {
        HashMap a10 = y6.a(str);
        if (a10 != null) {
            this.f12733a = (Long) a10.get(0);
            this.f12734b = (Long) a10.get(1);
            this.f12735c = (Long) a10.get(2);
            this.f12736d = (Long) a10.get(3);
        }
    }

    @Override // m4.y6
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f12733a);
        hashMap.put(1, this.f12734b);
        hashMap.put(2, this.f12735c);
        hashMap.put(3, this.f12736d);
        return hashMap;
    }
}
