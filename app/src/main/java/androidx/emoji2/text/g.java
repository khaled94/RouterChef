package androidx.emoji2.text;

import java.nio.ByteBuffer;
import u0.a;
import u0.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d */
    public static final ThreadLocal<a> f1314d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f1315a;

    /* renamed from: b */
    public final n f1316b;

    /* renamed from: c */
    public volatile int f1317c = 0;

    public g(n nVar, int i10) {
        this.f1316b = nVar;
        this.f1315a = i10;
    }

    public final int a(int i10) {
        a e10 = e();
        int a10 = e10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = e10.f18990b;
            int i11 = a10 + e10.f18989a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        a e10 = e();
        int a10 = e10.a(16);
        if (a10 != 0) {
            int i10 = a10 + e10.f18989a;
            return e10.f18990b.getInt(e10.f18990b.getInt(i10) + i10);
        }
        return 0;
    }

    public final short c() {
        a e10 = e();
        int a10 = e10.a(14);
        if (a10 != 0) {
            return e10.f18990b.getShort(a10 + e10.f18989a);
        }
        return (short) 0;
    }

    public final int d() {
        a e10 = e();
        int a10 = e10.a(4);
        if (a10 != 0) {
            return e10.f18990b.getInt(a10 + e10.f18989a);
        }
        return 0;
    }

    public final a e() {
        ThreadLocal<a> threadLocal = f1314d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1316b.f1346a;
        int i10 = this.f1315a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f18989a;
            int i12 = (i10 * 4) + bVar.f18990b.getInt(i11) + i11 + 4;
            aVar.b(bVar.f18990b.getInt(i12) + i12, bVar.f18990b);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(d()));
        sb.append(", codepoints:");
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb.append(Integer.toHexString(a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
