package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class i8 extends y6<Integer, Long> {

    /* renamed from: a */
    public Long f9555a;

    /* renamed from: b */
    public Long f9556b;

    public i8(String str) {
        HashMap a10 = y6.a(str);
        if (a10 != null) {
            this.f9555a = (Long) a10.get(0);
            this.f9556b = (Long) a10.get(1);
        }
    }

    @Override // m4.y6
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f9555a);
        hashMap.put(1, this.f9556b);
        return hashMap;
    }
}
