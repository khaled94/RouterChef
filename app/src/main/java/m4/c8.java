package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class c8 extends y6<Integer, Long> {

    /* renamed from: a */
    public long f6736a;

    /* renamed from: b */
    public long f6737b;

    public c8(String str) {
        this.f6736a = -1L;
        this.f6737b = -1L;
        HashMap a10 = y6.a(str);
        if (a10 != null) {
            this.f6736a = ((Long) a10.get(0)).longValue();
            this.f6737b = ((Long) a10.get(1)).longValue();
        }
    }

    @Override // m4.y6
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f6736a));
        hashMap.put(1, Long.valueOf(this.f6737b));
        return hashMap;
    }
}
