package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class z6 extends y6<Integer, Object> {

    /* renamed from: a */
    public String f16009a;

    /* renamed from: b */
    public long f16010b;

    /* renamed from: c */
    public String f16011c;

    /* renamed from: d */
    public String f16012d;

    /* renamed from: e */
    public String f16013e;

    public z6() {
        this.f16009a = "E";
        this.f16010b = -1L;
        this.f16011c = "E";
        this.f16012d = "E";
        this.f16013e = "E";
    }

    public z6(String str) {
        String str2 = "E";
        this.f16009a = str2;
        long j3 = -1;
        this.f16010b = -1L;
        this.f16011c = str2;
        this.f16012d = str2;
        this.f16013e = str2;
        HashMap a10 = y6.a(str);
        if (a10 != null) {
            this.f16009a = a10.get(0) == null ? str2 : (String) a10.get(0);
            this.f16010b = a10.get(1) != null ? ((Long) a10.get(1)).longValue() : j3;
            this.f16011c = a10.get(2) == null ? str2 : (String) a10.get(2);
            this.f16012d = a10.get(3) == null ? str2 : (String) a10.get(3);
            this.f16013e = a10.get(4) != null ? (String) a10.get(4) : str2;
        }
    }

    @Override // m4.y6
    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f16009a);
        hashMap.put(4, this.f16013e);
        hashMap.put(3, this.f16012d);
        hashMap.put(2, this.f16011c);
        hashMap.put(1, Long.valueOf(this.f16010b));
        return hashMap;
    }
}
