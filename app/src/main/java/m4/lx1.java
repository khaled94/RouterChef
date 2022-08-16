package m4;

import androidx.fragment.app.b1;
import i0.b;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class lx1<K, V> extends kw1<K, V> {
    public static final kw1<Object, Object> y = new lx1(null, new Object[0], 0);
    @CheckForNull

    /* renamed from: v */
    public final transient Object f11040v;

    /* renamed from: w */
    public final transient Object[] f11041w;

    /* renamed from: x */
    public final transient int f11042x;

    public lx1(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.f11040v = obj;
        this.f11041w = objArr;
        this.f11042x = i10;
    }

    public static IllegalArgumentException g(Object obj, Object obj2, Object[] objArr, int i10) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i10]);
        String valueOf4 = String.valueOf(objArr[i10 ^ 1]);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + valueOf3.length() + valueOf4.length());
        b1.b(sb, "Multiple entries with same key: ", valueOf, "=", valueOf2);
        return new IllegalArgumentException(b.a(sb, " and ", valueOf3, "=", valueOf4));
    }

    @Override // m4.kw1
    public final bw1<V> a() {
        return new kx1(this.f11041w, 1, this.f11042x);
    }

    @Override // m4.kw1
    public final pw1<Map.Entry<K, V>> d() {
        return new ix1(this, this.f11041w, this.f11042x);
    }

    @Override // m4.kw1
    public final pw1<K> e() {
        return new jx1(this, new kx1(this.f11041w, 0, this.f11042x));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[RETURN] */
    @Override // m4.kw1, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f11040v
            java.lang.Object[] r1 = r9.f11041w
            int r2 = r9.f11042x
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = m4.zv1.a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = m4.zv1.a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = m4.zv1.a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.lx1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11042x;
    }
}
