package m4;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class o8 extends y6<Integer, Long> {

    /* renamed from: a */
    public Long f12027a;

    /* renamed from: b */
    public Long f12028b;

    /* renamed from: c */
    public Long f12029c;

    /* renamed from: d */
    public Long f12030d;

    /* renamed from: e */
    public Long f12031e;

    /* renamed from: f */
    public Long f12032f;

    /* renamed from: g */
    public Long f12033g;

    /* renamed from: h */
    public Long f12034h;

    /* renamed from: i */
    public Long f12035i;

    /* renamed from: j */
    public Long f12036j;

    /* renamed from: k */
    public Long f12037k;

    public o8(String str) {
        HashMap a10 = y6.a(str);
        if (a10 != null) {
            this.f12027a = (Long) a10.get(0);
            this.f12028b = (Long) a10.get(1);
            this.f12029c = (Long) a10.get(2);
            this.f12030d = (Long) a10.get(3);
            this.f12031e = (Long) a10.get(4);
            this.f12032f = (Long) a10.get(5);
            this.f12033g = (Long) a10.get(6);
            this.f12034h = (Long) a10.get(7);
            this.f12035i = (Long) a10.get(8);
            this.f12036j = (Long) a10.get(9);
            this.f12037k = (Long) a10.get(10);
        }
    }

    @Override // m4.y6
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f12027a);
        hashMap.put(1, this.f12028b);
        hashMap.put(2, this.f12029c);
        hashMap.put(3, this.f12030d);
        hashMap.put(4, this.f12031e);
        hashMap.put(5, this.f12032f);
        hashMap.put(6, this.f12033g);
        hashMap.put(7, this.f12034h);
        hashMap.put(8, this.f12035i);
        hashMap.put(9, this.f12036j);
        hashMap.put(10, this.f12037k);
        return hashMap;
    }
}
