package g1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k1.d;
import k1.e;

/* loaded from: classes.dex */
public final class b0 implements e, d {
    public static final TreeMap<Integer, b0> A = new TreeMap<>();

    /* renamed from: s */
    public volatile String f4776s;

    /* renamed from: t */
    public final long[] f4777t;

    /* renamed from: u */
    public final double[] f4778u;

    /* renamed from: v */
    public final String[] f4779v;

    /* renamed from: w */
    public final byte[][] f4780w;

    /* renamed from: x */
    public final int[] f4781x;
    public final int y;

    /* renamed from: z */
    public int f4782z;

    public b0(int i10) {
        this.y = i10;
        int i11 = i10 + 1;
        this.f4781x = new int[i11];
        this.f4777t = new long[i11];
        this.f4778u = new double[i11];
        this.f4779v = new String[i11];
        this.f4780w = new byte[i11];
    }

    public static b0 j(String str, int i10) {
        TreeMap<Integer, b0> treeMap = A;
        synchronized (treeMap) {
            Map.Entry<Integer, b0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                b0 value = ceilingEntry.getValue();
                value.f4776s = str;
                value.f4782z = i10;
                return value;
            }
            b0 b0Var = new b0(i10);
            b0Var.f4776s = str;
            b0Var.f4782z = i10;
            return b0Var;
        }
    }

    public final void G() {
        TreeMap<Integer, b0> treeMap = A;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.y), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // k1.d
    public final void P(int i10, long j3) {
        this.f4781x[i10] = 2;
        this.f4777t[i10] = j3;
    }

    @Override // k1.d
    public final void a0(int i10, byte[] bArr) {
        this.f4781x[i10] = 5;
        this.f4780w[i10] = bArr;
    }

    @Override // k1.e
    public final void b(d dVar) {
        for (int i10 = 1; i10 <= this.f4782z; i10++) {
            int i11 = this.f4781x[i10];
            if (i11 == 1) {
                dVar.v(i10);
            } else if (i11 == 2) {
                dVar.P(i10, this.f4777t[i10]);
            } else if (i11 == 3) {
                dVar.x(i10, this.f4778u[i10]);
            } else if (i11 == 4) {
                dVar.o(i10, this.f4779v[i10]);
            } else if (i11 == 5) {
                dVar.a0(i10, this.f4780w[i10]);
            }
        }
    }

    @Override // k1.e
    public final String c() {
        return this.f4776s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // k1.d
    public final void o(int i10, String str) {
        this.f4781x[i10] = 4;
        this.f4779v[i10] = str;
    }

    @Override // k1.d
    public final void v(int i10) {
        this.f4781x[i10] = 1;
    }

    @Override // k1.d
    public final void x(int i10, double d5) {
        this.f4781x[i10] = 3;
        this.f4778u[i10] = d5;
    }
}
