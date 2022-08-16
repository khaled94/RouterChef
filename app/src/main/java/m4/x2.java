package m4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import h2.u;
import java.util.Collections;
import java.util.List;
import u1.a;

/* loaded from: classes.dex */
public final class x2 implements to2 {

    /* renamed from: a */
    public final List<eq1> f15178a;

    /* renamed from: e */
    public final SparseArray<b3> f15182e;

    /* renamed from: f */
    public final SparseBooleanArray f15183f;

    /* renamed from: i */
    public u2 f15186i;

    /* renamed from: k */
    public int f15188k;

    /* renamed from: l */
    public boolean f15189l;

    /* renamed from: m */
    public boolean f15190m;

    /* renamed from: n */
    public boolean f15191n;

    /* renamed from: d */
    public final a f15181d = new a(0);

    /* renamed from: b */
    public final dd f15179b = new dd(new byte[9400], 0);

    /* renamed from: g */
    public final SparseBooleanArray f15184g = new SparseBooleanArray();

    /* renamed from: c */
    public final SparseIntArray f15180c = new SparseIntArray();

    /* renamed from: h */
    public final v2 f15185h = new v2();

    /* renamed from: j */
    public vo2 f15187j = vo2.f14739e;

    /* renamed from: o */
    public int f15192o = -1;

    public x2() {
        eq1 eq1Var = new eq1();
        this.f15178a = Collections.singletonList(eq1Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f15183f = sparseBooleanArray;
        SparseArray<b3> sparseArray = new SparseArray<>();
        this.f15182e = sparseArray;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15182e.put(sparseArray2.keyAt(i10), (b3) sparseArray2.valueAt(i10));
        }
        this.f15182e.put(0, new r2(new u(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(m4.uo2 r7) {
        /*
            r6 = this;
            m4.dd r0 = r6.f15179b
            java.lang.Object r0 = r0.f7311d
            byte[] r0 = (byte[]) r0
            m4.qo2 r7 = (m4.qo2) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.o(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.q(r2)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.x2.c(m4.uo2):boolean");
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f15187j = vo2Var;
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        u2 u2Var;
        int size = this.f15178a.size();
        for (int i10 = 0; i10 < size; i10++) {
            eq1 eq1Var = this.f15178a.get(i10);
            if (eq1Var.d() != -9223372036854775807L) {
                long c10 = eq1Var.c();
                if (c10 != -9223372036854775807L) {
                    if (c10 != 0) {
                        if (c10 == j10) {
                        }
                    }
                }
            }
            eq1Var.e(j10);
        }
        if (j10 != 0 && (u2Var = this.f15186i) != null) {
            u2Var.c(j10);
        }
        this.f15179b.e(0);
        this.f15180c.clear();
        for (int i11 = 0; i11 < this.f15182e.size(); i11++) {
            this.f15182e.valueAt(i11).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0277, code lost:
        if (r1 == false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r19, m4.gp2 r20) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.x2.h(m4.uo2, m4.gp2):int");
    }
}
