package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class f8 extends y6<Integer, Object> {

    /* renamed from: a */
    public Long f8366a;

    /* renamed from: b */
    public Boolean f8367b;

    /* renamed from: c */
    public Boolean f8368c;

    public f8(String str) {
        HashMap a10 = y6.a(str);
        if (a10 != null) {
            this.f8366a = (Long) a10.get(0);
            this.f8367b = (Boolean) a10.get(1);
            this.f8368c = (Boolean) a10.get(2);
        }
    }

    @Override // m4.y6
    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f8366a);
        hashMap.put(1, this.f8367b);
        hashMap.put(2, this.f8368c);
        return hashMap;
    }
}
