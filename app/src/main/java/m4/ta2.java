package m4;

import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import s.b;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class ta2<T> implements eb2<T> {

    /* renamed from: o */
    public static final int[] f13978o = new int[0];
    public static final Unsafe p = zb2.m();

    /* renamed from: a */
    public final int[] f13979a;

    /* renamed from: b */
    public final Object[] f13980b;

    /* renamed from: c */
    public final int f13981c;

    /* renamed from: d */
    public final int f13982d;

    /* renamed from: e */
    public final qa2 f13983e;

    /* renamed from: f */
    public final boolean f13984f;

    /* renamed from: g */
    public final boolean f13985g;

    /* renamed from: h */
    public final boolean f13986h;

    /* renamed from: i */
    public final int[] f13987i;

    /* renamed from: j */
    public final int f13988j;

    /* renamed from: k */
    public final int f13989k;

    /* renamed from: l */
    public final fa2 f13990l;

    /* renamed from: m */
    public final pb2<?, ?> f13991m;

    /* renamed from: n */
    public final a92<?> f13992n;

    public ta2(int[] iArr, Object[] objArr, int i10, int i11, qa2 qa2Var, boolean z10, int[] iArr2, int i12, int i13, fa2 fa2Var, pb2 pb2Var, a92 a92Var, ma2 ma2Var) {
        this.f13979a = iArr;
        this.f13980b = objArr;
        this.f13981c = i10;
        this.f13982d = i11;
        this.f13985g = qa2Var instanceof m92;
        this.f13986h = z10;
        this.f13984f = a92Var != null && a92Var.h(qa2Var);
        this.f13987i = iArr2;
        this.f13988j = i12;
        this.f13989k = i13;
        this.f13990l = fa2Var;
        this.f13991m = pb2Var;
        this.f13992n = a92Var;
        this.f13983e = qa2Var;
    }

    public static <T> boolean B(T t10, long j3) {
        return ((Boolean) zb2.l(t10, j3)).booleanValue();
    }

    public static final void D(int i10, Object obj, w82 w82Var) {
        if (obj instanceof String) {
            w82Var.f14883a.t(i10, (String) obj);
            return;
        }
        w82Var.f(i10, (n82) obj);
    }

    public static qb2 F(Object obj) {
        m92 m92Var = (m92) obj;
        qb2 qb2Var = m92Var.zzc;
        if (qb2Var == qb2.f12763f) {
            qb2 b10 = qb2.b();
            m92Var.zzc = b10;
            return b10;
        }
        return qb2Var;
    }

    public static ta2 G(oa2 oa2Var, va2 va2Var, fa2 fa2Var, pb2 pb2Var, a92 a92Var, ma2 ma2Var) {
        if (oa2Var instanceof ab2) {
            return H((ab2) oa2Var, va2Var, fa2Var, pb2Var, a92Var, ma2Var);
        }
        nb2 nb2Var = (nb2) oa2Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> m4.ta2<T> H(m4.ab2 r33, m4.va2 r34, m4.fa2 r35, m4.pb2<?, ?> r36, m4.a92<?> r37, m4.ma2 r38) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.H(m4.ab2, m4.va2, m4.fa2, m4.pb2, m4.a92, m4.ma2):m4.ta2");
    }

    public static <T> double I(T t10, long j3) {
        return ((Double) zb2.l(t10, j3)).doubleValue();
    }

    public static <T> float J(T t10, long j3) {
        return ((Float) zb2.l(t10, j3)).floatValue();
    }

    public static <T> int M(T t10, long j3) {
        return ((Integer) zb2.l(t10, j3)).intValue();
    }

    public static <T> long m(T t10, long j3) {
        return ((Long) zb2.l(t10, j3)).longValue();
    }

    public static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            b1.b(sb, "Field ", str, " for ", name);
            throw new RuntimeException(b.b(sb, " not found. Known fields are ", arrays));
        }
    }

    public static boolean y(int i10) {
        return (i10 & 536870912) != 0;
    }

    public final boolean A(T t10, int i10, int i11) {
        return zb2.i(t10, (long) (S(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void C(T t10, w82 w82Var) {
        int i10;
        boolean z10;
        if (this.f13984f) {
            this.f13992n.a(t10);
            throw null;
        }
        int length = this.f13979a.length;
        Unsafe unsafe = p;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int l10 = l(i13);
            int[] iArr = this.f13979a;
            int i15 = iArr[i13];
            int i16 = (l10 >>> 20) & 255;
            if (i16 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                if (i18 != i12) {
                    i14 = unsafe.getInt(t10, i18);
                    i12 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j3 = l10 & i11;
            switch (i16) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.g(i15, zb2.g(t10, j3));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.k(i15, zb2.h(t10, j3));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.n(i15, unsafe.getLong(t10, j3));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.d(i15, unsafe.getLong(t10, j3));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.m(i15, unsafe.getInt(t10, j3));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.j(i15, unsafe.getLong(t10, j3));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.i(i15, unsafe.getInt(t10, j3));
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.e(i15, zb2.y(t10, j3));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        D(i15, unsafe.getObject(t10, j3), w82Var);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.o(i15, unsafe.getObject(t10, j3), o(i13));
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.f(i15, (n82) unsafe.getObject(t10, j3));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.c(i15, unsafe.getInt(t10, j3));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.h(i15, unsafe.getInt(t10, j3));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.p(i15, unsafe.getInt(t10, j3));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.q(i15, unsafe.getLong(t10, j3));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.a(i15, unsafe.getInt(t10, j3));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.b(i15, unsafe.getLong(t10, j3));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        w82Var.l(i15, unsafe.getObject(t10, j3), o(i13));
                        break;
                    }
                case 18:
                    fb2.f(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 19:
                    fb2.j(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 20:
                    fb2.m(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 21:
                    fb2.u(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 22:
                    fb2.l(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 23:
                    fb2.i(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 24:
                    fb2.h(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 25:
                    fb2.d(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 26:
                    fb2.s(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var);
                    break;
                case 27:
                    fb2.n(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, o(i13));
                    break;
                case 28:
                    fb2.e(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var);
                    break;
                case 29:
                    z10 = false;
                    fb2.t(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 30:
                    z10 = false;
                    fb2.g(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 31:
                    z10 = false;
                    fb2.o(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 32:
                    z10 = false;
                    fb2.p(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 33:
                    z10 = false;
                    fb2.q(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 34:
                    z10 = false;
                    fb2.r(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, false);
                    break;
                case 35:
                    fb2.f(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 36:
                    fb2.j(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 37:
                    fb2.m(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 38:
                    fb2.u(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 39:
                    fb2.l(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 40:
                    fb2.i(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 41:
                    fb2.h(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 42:
                    fb2.d(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 43:
                    fb2.t(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 44:
                    fb2.g(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 45:
                    fb2.o(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 46:
                    fb2.p(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 47:
                    fb2.q(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 48:
                    fb2.r(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, true);
                    break;
                case 49:
                    fb2.k(this.f13979a[i13], (List) unsafe.getObject(t10, j3), w82Var, o(i13));
                    break;
                case 50:
                    if (unsafe.getObject(t10, j3) != null) {
                        ka2 ka2Var = (ka2) q(i13);
                        throw null;
                    }
                    break;
                case 51:
                    if (A(t10, i15, i13)) {
                        w82Var.g(i15, I(t10, j3));
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                    if (A(t10, i15, i13)) {
                        w82Var.k(i15, J(t10, j3));
                    }
                    break;
                case 53:
                    if (A(t10, i15, i13)) {
                        w82Var.n(i15, m(t10, j3));
                    }
                    break;
                case 54:
                    if (A(t10, i15, i13)) {
                        w82Var.d(i15, m(t10, j3));
                    }
                    break;
                case 55:
                    if (A(t10, i15, i13)) {
                        w82Var.m(i15, M(t10, j3));
                    }
                    break;
                case 56:
                    if (A(t10, i15, i13)) {
                        w82Var.j(i15, m(t10, j3));
                    }
                    break;
                case 57:
                    if (A(t10, i15, i13)) {
                        w82Var.i(i15, M(t10, j3));
                    }
                    break;
                case 58:
                    if (A(t10, i15, i13)) {
                        w82Var.e(i15, B(t10, j3));
                    }
                    break;
                case 59:
                    if (A(t10, i15, i13)) {
                        D(i15, unsafe.getObject(t10, j3), w82Var);
                    }
                    break;
                case 60:
                    if (A(t10, i15, i13)) {
                        w82Var.o(i15, unsafe.getObject(t10, j3), o(i13));
                    }
                    break;
                case 61:
                    if (A(t10, i15, i13)) {
                        w82Var.f(i15, (n82) unsafe.getObject(t10, j3));
                    }
                    break;
                case 62:
                    if (A(t10, i15, i13)) {
                        w82Var.c(i15, M(t10, j3));
                    }
                    break;
                case 63:
                    if (A(t10, i15, i13)) {
                        w82Var.h(i15, M(t10, j3));
                    }
                    break;
                case 64:
                    if (A(t10, i15, i13)) {
                        w82Var.p(i15, M(t10, j3));
                    }
                    break;
                case 65:
                    if (A(t10, i15, i13)) {
                        w82Var.q(i15, m(t10, j3));
                    }
                    break;
                case 66:
                    if (A(t10, i15, i13)) {
                        w82Var.a(i15, M(t10, j3));
                    }
                    break;
                case 67:
                    if (A(t10, i15, i13)) {
                        w82Var.b(i15, m(t10, j3));
                    }
                    break;
                case 68:
                    if (A(t10, i15, i13)) {
                        w82Var.l(i15, unsafe.getObject(t10, j3), o(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        pb2<?, ?> pb2Var = this.f13991m;
        pb2Var.r(pb2Var.d(t10), w82Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0436, code lost:
        if (r6 == 1048575) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0438, code lost:
        r27.putInt(r11, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x043e, code lost:
        r3 = r14.f13988j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0442, code lost:
        if (r3 >= r14.f13989k) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0444, code lost:
        r14.p(r11, r14.f13987i[r3], null);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0450, code lost:
        if (r1 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0452, code lost:
        if (r0 != r33) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0459, code lost:
        throw m4.x92.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x045a, code lost:
        if (r0 > r33) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x045c, code lost:
        if (r4 != r1) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x045e, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0463, code lost:
        throw m4.x92.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0403  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E(T r30, byte[] r31, int r32, int r33, int r34, m4.e82 r35) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.E(java.lang.Object, byte[], int, int, int, m4.e82):int");
    }

    public final int K(T t10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj2;
        int i27;
        Unsafe unsafe = p;
        int i28 = 1048575;
        int i29 = 1048575;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i30 < this.f13979a.length) {
            int l10 = l(i30);
            int[] iArr = this.f13979a;
            int i33 = iArr[i30];
            int i34 = (l10 >>> 20) & 255;
            if (i34 <= 17) {
                int i35 = iArr[i30 + 2];
                int i36 = i35 & i28;
                i10 = 1 << (i35 >>> 20);
                if (i36 != i29) {
                    i32 = unsafe.getInt(t10, i36);
                    i29 = i36;
                }
            } else {
                i10 = 0;
            }
            long j3 = l10 & i28;
            switch (i34) {
                case 0:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i12 = v82.i(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 1:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i13 = v82.i(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 2:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    long j10 = unsafe.getLong(t10, j3);
                    i14 = v82.i(i33 << 3);
                    i15 = v82.j(j10);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 3:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    long j102 = unsafe.getLong(t10, j3);
                    i14 = v82.i(i33 << 3);
                    i15 = v82.j(j102);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 4:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    int i37 = unsafe.getInt(t10, j3);
                    i16 = v82.i(i33 << 3);
                    i17 = v82.B(i37);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 5:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i12 = v82.i(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 6:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i13 = v82.i(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 7:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i18 = v82.i(i33 << 3);
                        i11 = i18 + 1;
                        i31 += i11;
                        break;
                    }
                case 8:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        obj = unsafe.getObject(t10, j3);
                        if (!(obj instanceof n82)) {
                            i16 = v82.i(i33 << 3);
                            i17 = v82.D((String) obj);
                            i11 = i17 + i16;
                            i31 += i11;
                            break;
                        }
                        int i38 = v82.i(i33 << 3);
                        int k10 = ((n82) obj).k();
                        i31 += v82.i(k10) + k10 + i38;
                        break;
                    }
                case 9:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i11 = fb2.G(i33, unsafe.getObject(t10, j3), o(i30));
                        i31 += i11;
                        break;
                    }
                case 10:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        obj = unsafe.getObject(t10, j3);
                        int i382 = v82.i(i33 << 3);
                        int k102 = ((n82) obj).k();
                        i31 += v82.i(k102) + k102 + i382;
                        break;
                    }
                case 11:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i19 = unsafe.getInt(t10, j3);
                        i16 = v82.i(i33 << 3);
                        i17 = v82.i(i19);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 12:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    int i372 = unsafe.getInt(t10, j3);
                    i16 = v82.i(i33 << 3);
                    i17 = v82.B(i372);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 13:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i13 = v82.i(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 14:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i12 = v82.i(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 15:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        int i39 = unsafe.getInt(t10, j3);
                        i16 = v82.i(i33 << 3);
                        i19 = (i39 >> 31) ^ (i39 + i39);
                        i17 = v82.i(i19);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i32) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(t10, j3);
                        i20 = v82.i(i33 << 3);
                        i21 = v82.j((j11 >> 63) ^ (j11 + j11));
                        i11 = i21 + i20;
                        i31 += i11;
                        break;
                    }
                case 17:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i11 = v82.A(i33, (qa2) unsafe.getObject(t10, j3), o(i30));
                        i31 += i11;
                        break;
                    }
                case 18:
                case 23:
                case 32:
                    i11 = fb2.A(i33, (List) unsafe.getObject(t10, j3));
                    i31 += i11;
                    break;
                case 19:
                case 24:
                case 31:
                    i11 = fb2.y(i33, (List) unsafe.getObject(t10, j3));
                    i31 += i11;
                    break;
                case 20:
                    i11 = fb2.E(i33, (List) unsafe.getObject(t10, j3));
                    i31 += i11;
                    break;
                case 21:
                    List list = (List) unsafe.getObject(t10, j3);
                    Class<?> cls = fb2.f8390a;
                    i26 = list.size();
                    if (i26 != 0) {
                        i24 = fb2.M(list);
                        i25 = v82.E(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 22:
                    List list2 = (List) unsafe.getObject(t10, j3);
                    Class<?> cls2 = fb2.f8390a;
                    i26 = list2.size();
                    if (i26 != 0) {
                        i24 = fb2.D(list2);
                        i25 = v82.E(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 25:
                    Class<?> cls3 = fb2.f8390a;
                    int size = ((List) unsafe.getObject(t10, j3)).size();
                    if (size != 0) {
                        i22 = (v82.i(i33 << 3) + 1) * size;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 26:
                    i11 = fb2.K(i33, (List) unsafe.getObject(t10, j3));
                    i31 += i11;
                    break;
                case 27:
                    i11 = fb2.H(i33, (List) unsafe.getObject(t10, j3), o(i30));
                    i31 += i11;
                    break;
                case 28:
                    i11 = fb2.w(i33, (List) unsafe.getObject(t10, j3));
                    i31 += i11;
                    break;
                case 29:
                    List list3 = (List) unsafe.getObject(t10, j3);
                    Class<?> cls4 = fb2.f8390a;
                    i26 = list3.size();
                    if (i26 != 0) {
                        i24 = fb2.L(list3);
                        i25 = v82.E(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 30:
                    List list4 = (List) unsafe.getObject(t10, j3);
                    Class<?> cls5 = fb2.f8390a;
                    i26 = list4.size();
                    if (i26 != 0) {
                        i24 = fb2.x(list4);
                        i25 = v82.E(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 33:
                    List list5 = (List) unsafe.getObject(t10, j3);
                    Class<?> cls6 = fb2.f8390a;
                    i26 = list5.size();
                    if (i26 != 0) {
                        i24 = fb2.I(list5);
                        i25 = v82.E(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 34:
                    List list6 = (List) unsafe.getObject(t10, j3);
                    Class<?> cls7 = fb2.f8390a;
                    i26 = list6.size();
                    if (i26 != 0) {
                        i24 = fb2.J(list6);
                        i25 = v82.E(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 35:
                    i24 = fb2.B((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 36:
                    i24 = fb2.z((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 37:
                    i24 = fb2.F((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 38:
                    i24 = fb2.M((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 39:
                    i24 = fb2.D((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 40:
                    i24 = fb2.B((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 41:
                    i24 = fb2.z((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 42:
                    Class<?> cls8 = fb2.f8390a;
                    i24 = ((List) unsafe.getObject(t10, j3)).size();
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 43:
                    i24 = fb2.L((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 44:
                    i24 = fb2.x((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 45:
                    i24 = fb2.z((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 46:
                    i24 = fb2.B((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 47:
                    i24 = fb2.I((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 48:
                    i24 = fb2.J((List) unsafe.getObject(t10, j3));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = v82.i(i24) + v82.E(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 49:
                    i11 = fb2.C(i33, (List) unsafe.getObject(t10, j3), o(i30));
                    i31 += i11;
                    break;
                case 50:
                    ma2.a(unsafe.getObject(t10, j3), q(i30));
                    break;
                case 51:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    i12 = v82.i(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    i13 = v82.i(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 53:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    long m10 = m(t10, j3);
                    i14 = v82.i(i33 << 3);
                    i15 = v82.j(m10);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 54:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    long m102 = m(t10, j3);
                    i14 = v82.i(i33 << 3);
                    i15 = v82.j(m102);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 55:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    int M = M(t10, j3);
                    i16 = v82.i(i33 << 3);
                    i17 = v82.B(M);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 56:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    i12 = v82.i(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 57:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    i13 = v82.i(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 58:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        i18 = v82.i(i33 << 3);
                        i11 = i18 + 1;
                        i31 += i11;
                        break;
                    }
                case 59:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        obj2 = unsafe.getObject(t10, j3);
                        if (!(obj2 instanceof n82)) {
                            i16 = v82.i(i33 << 3);
                            i17 = v82.D((String) obj2);
                            i11 = i17 + i16;
                            i31 += i11;
                            break;
                        }
                        int i40 = v82.i(i33 << 3);
                        int k11 = ((n82) obj2).k();
                        i22 = v82.i(k11) + k11 + i40;
                        i31 += i22;
                        break;
                    }
                case 60:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        i11 = fb2.G(i33, unsafe.getObject(t10, j3), o(i30));
                        i31 += i11;
                        break;
                    }
                case 61:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        obj2 = unsafe.getObject(t10, j3);
                        int i402 = v82.i(i33 << 3);
                        int k112 = ((n82) obj2).k();
                        i22 = v82.i(k112) + k112 + i402;
                        i31 += i22;
                        break;
                    }
                case 62:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        i27 = M(t10, j3);
                        i16 = v82.i(i33 << 3);
                        i17 = v82.i(i27);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 63:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    int M2 = M(t10, j3);
                    i16 = v82.i(i33 << 3);
                    i17 = v82.B(M2);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 64:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    i13 = v82.i(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 65:
                    if (!A(t10, i33, i30)) {
                        break;
                    }
                    i12 = v82.i(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 66:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        int M3 = M(t10, j3);
                        i16 = v82.i(i33 << 3);
                        i27 = (M3 >> 31) ^ (M3 + M3);
                        i17 = v82.i(i27);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 67:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        long m11 = m(t10, j3);
                        i20 = v82.i(i33 << 3);
                        i21 = v82.j((m11 >> 63) ^ (m11 + m11));
                        i11 = i21 + i20;
                        i31 += i11;
                        break;
                    }
                case 68:
                    if (!A(t10, i33, i30)) {
                        break;
                    } else {
                        i11 = v82.A(i33, (qa2) unsafe.getObject(t10, j3), o(i30));
                        i31 += i11;
                        break;
                    }
            }
            i30 += 3;
            i28 = 1048575;
        }
        pb2<?, ?> pb2Var = this.f13991m;
        int a10 = pb2Var.a(pb2Var.d(t10)) + i31;
        if (!this.f13984f) {
            return a10;
        }
        this.f13992n.a(t10);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0367, code lost:
        if ((r4 instanceof m4.n82) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x037d, code lost:
        r5 = m4.v82.i(r7 << 3);
        r4 = m4.v82.D((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        if ((r4 instanceof m4.n82) != false) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(T r11) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.L(java.lang.Object):int");
    }

    public final int N(Object obj, int i10, long j3) {
        Unsafe unsafe = p;
        Object q10 = q(i10);
        Object object = unsafe.getObject(obj, j3);
        if (!((la2) object).f10695s) {
            la2 a10 = la2.f10694t.a();
            ma2.c(a10, object);
            unsafe.putObject(obj, j3, a10);
        }
        ka2 ka2Var = (ka2) q10;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r15 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r15 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r3 = m4.v92.c(r15, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, m4.e82 r29) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.O(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, m4.e82):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int P(T r32, byte[] r33, int r34, int r35, m4.e82 r36) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.P(java.lang.Object, byte[], int, int, m4.e82):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0256, code lost:
        if (r30.f7742b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0259, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x025a, code lost:
        r12.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025d, code lost:
        if (r4 >= r20) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x025f, code lost:
        r6 = j0.d.t(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0265, code lost:
        if (r21 == r30.f7741a) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0268, code lost:
        r4 = j0.d.w(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0270, code lost:
        if (r30.f7742b == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0272, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0274, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
        if (r4 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
        r12.add(m4.n82.D(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
        if (r1 >= r20) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
        r4 = j0.d.t(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012f, code lost:
        if (r21 == r30.f7741a) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0132, code lost:
        r1 = j0.d.t(r18, r4, r30);
        r4 = r30.f7741a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (r4 < 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
        if (r4 > (r18.length - r1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013e, code lost:
        if (r4 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
        r12.add(m4.n82.f11571t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014a, code lost:
        throw m4.x92.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
        throw m4.x92.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0150, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01de -> B:109:0x01e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01f3 -> B:104:0x01cd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0270 -> B:144:0x0259). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0272 -> B:145:0x025a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x013e -> B:59:0x011f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0140 -> B:60:0x0127). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ad -> B:89:0x0199). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01b1 -> B:88:0x0195). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Q(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, m4.e82 r30) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.Q(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, m4.e82):int");
    }

    public final int R(int i10) {
        if (i10 < this.f13981c || i10 > this.f13982d) {
            return -1;
        }
        return k(i10, 0);
    }

    public final int S(int i10) {
        return this.f13979a[i10 + 2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // m4.eb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r9) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ta2.a(java.lang.Object):int");
    }

    @Override // m4.eb2
    public final T b() {
        return (T) ((m92) this.f13983e).u(4, null);
    }

    @Override // m4.eb2
    public final void c(T t10) {
        int i10;
        int i11 = this.f13988j;
        while (true) {
            i10 = this.f13989k;
            if (i11 >= i10) {
                break;
            }
            long l10 = l(this.f13987i[i11]) & 1048575;
            Object l11 = zb2.l(t10, l10);
            if (l11 != null) {
                ((la2) l11).f10695s = false;
                zb2.u(t10, l10, l11);
            }
            i11++;
        }
        int length = this.f13987i.length;
        while (i10 < length) {
            this.f13990l.b(t10, this.f13987i[i10]);
            i10++;
        }
        this.f13991m.m(t10);
        if (this.f13984f) {
            this.f13992n.e(t10);
        }
    }

    @Override // m4.eb2
    public final void d(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f13979a.length; i10 += 3) {
            int l10 = l(i10);
            long j3 = 1048575 & l10;
            int i11 = this.f13979a[i10];
            switch ((l10 >>> 20) & 255) {
                case 0:
                    if (z(t11, i10)) {
                        zb2.q(t10, j3, zb2.g(t11, j3));
                        v(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z(t11, i10)) {
                        zb2.r(t10, j3, zb2.h(t11, j3));
                        v(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.t(t10, j3, zb2.j(t11, j3));
                    v(t10, i10);
                    break;
                case 3:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.t(t10, j3, zb2.j(t11, j3));
                    v(t10, i10);
                    break;
                case 4:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.s(t10, j3, zb2.i(t11, j3));
                    v(t10, i10);
                    break;
                case 5:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.t(t10, j3, zb2.j(t11, j3));
                    v(t10, i10);
                    break;
                case 6:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.s(t10, j3, zb2.i(t11, j3));
                    v(t10, i10);
                    break;
                case 7:
                    if (z(t11, i10)) {
                        zb2.p(t10, j3, zb2.y(t11, j3));
                        v(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.u(t10, j3, zb2.l(t11, j3));
                    v(t10, i10);
                    break;
                case 9:
                case 17:
                    s(t10, t11, i10);
                    break;
                case 10:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.u(t10, j3, zb2.l(t11, j3));
                    v(t10, i10);
                    break;
                case 11:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.s(t10, j3, zb2.i(t11, j3));
                    v(t10, i10);
                    break;
                case 12:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.s(t10, j3, zb2.i(t11, j3));
                    v(t10, i10);
                    break;
                case 13:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.s(t10, j3, zb2.i(t11, j3));
                    v(t10, i10);
                    break;
                case 14:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.t(t10, j3, zb2.j(t11, j3));
                    v(t10, i10);
                    break;
                case 15:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.s(t10, j3, zb2.i(t11, j3));
                    v(t10, i10);
                    break;
                case 16:
                    if (!z(t11, i10)) {
                        break;
                    }
                    zb2.t(t10, j3, zb2.j(t11, j3));
                    v(t10, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f13990l.c(t10, t11, j3);
                    break;
                case 50:
                    Class<?> cls = fb2.f8390a;
                    zb2.u(t10, j3, ma2.c(zb2.l(t10, j3), zb2.l(t11, j3)));
                    break;
                case 51:
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!A(t11, i11, i10)) {
                        break;
                    }
                    zb2.u(t10, j3, zb2.l(t11, j3));
                    w(t10, i11, i10);
                    break;
                case 60:
                case 68:
                    t(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!A(t11, i11, i10)) {
                        break;
                    }
                    zb2.u(t10, j3, zb2.l(t11, j3));
                    w(t10, i11, i10);
                    break;
            }
        }
        pb2<?, ?> pb2Var = this.f13991m;
        Class<?> cls2 = fb2.f8390a;
        pb2Var.o(t10, pb2Var.e(pb2Var.d(t10), pb2Var.d(t11)));
        if (!this.f13984f) {
            return;
        }
        this.f13992n.a(t11);
        throw null;
    }

    @Override // m4.eb2
    public final void e(T t10, byte[] bArr, int i10, int i11, e82 e82Var) {
        if (this.f13986h) {
            P(t10, bArr, i10, i11, e82Var);
        } else {
            E(t10, bArr, i10, i11, 0, e82Var);
        }
    }

    @Override // m4.eb2
    public final void f(T t10, w82 w82Var) {
        double d5;
        float f10;
        long j3;
        long j10;
        int i10;
        long j11;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        long j12;
        int i15;
        long j13;
        if (!this.f13986h) {
            C(t10, w82Var);
        } else if (this.f13984f) {
            this.f13992n.a(t10);
            throw null;
        } else {
            int length = this.f13979a.length;
            for (int i16 = 0; i16 < length; i16 += 3) {
                int l10 = l(i16);
                int[] iArr = this.f13979a;
                int i17 = iArr[i16];
                switch ((l10 >>> 20) & 255) {
                    case 0:
                        if (z(t10, i16)) {
                            d5 = zb2.g(t10, l10 & 1048575);
                            w82Var.g(i17, d5);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (z(t10, i16)) {
                            f10 = zb2.h(t10, l10 & 1048575);
                            w82Var.k(i17, f10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (z(t10, i16)) {
                            j3 = zb2.j(t10, l10 & 1048575);
                            w82Var.n(i17, j3);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (z(t10, i16)) {
                            j10 = zb2.j(t10, l10 & 1048575);
                            w82Var.d(i17, j10);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (z(t10, i16)) {
                            i10 = zb2.i(t10, l10 & 1048575);
                            w82Var.m(i17, i10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (z(t10, i16)) {
                            j11 = zb2.j(t10, l10 & 1048575);
                            w82Var.j(i17, j11);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (z(t10, i16)) {
                            i11 = zb2.i(t10, l10 & 1048575);
                            w82Var.i(i17, i11);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (z(t10, i16)) {
                            z10 = zb2.y(t10, l10 & 1048575);
                            w82Var.e(i17, z10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!z(t10, i16)) {
                            break;
                        }
                        D(i17, zb2.l(t10, l10 & 1048575), w82Var);
                        break;
                    case 9:
                        if (!z(t10, i16)) {
                            break;
                        }
                        w82Var.o(i17, zb2.l(t10, l10 & 1048575), o(i16));
                        break;
                    case 10:
                        if (!z(t10, i16)) {
                            break;
                        }
                        w82Var.f(i17, (n82) zb2.l(t10, l10 & 1048575));
                        break;
                    case 11:
                        if (z(t10, i16)) {
                            i12 = zb2.i(t10, l10 & 1048575);
                            w82Var.c(i17, i12);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (z(t10, i16)) {
                            i13 = zb2.i(t10, l10 & 1048575);
                            w82Var.h(i17, i13);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (z(t10, i16)) {
                            i14 = zb2.i(t10, l10 & 1048575);
                            w82Var.p(i17, i14);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (z(t10, i16)) {
                            j12 = zb2.j(t10, l10 & 1048575);
                            w82Var.q(i17, j12);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (z(t10, i16)) {
                            i15 = zb2.i(t10, l10 & 1048575);
                            w82Var.a(i17, i15);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (z(t10, i16)) {
                            j13 = zb2.j(t10, l10 & 1048575);
                            w82Var.b(i17, j13);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!z(t10, i16)) {
                            break;
                        }
                        w82Var.l(i17, zb2.l(t10, l10 & 1048575), o(i16));
                        break;
                    case 18:
                        fb2.f(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 19:
                        fb2.j(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 20:
                        fb2.m(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 21:
                        fb2.u(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 22:
                        fb2.l(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 23:
                        fb2.i(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 24:
                        fb2.h(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 25:
                        fb2.d(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 26:
                        fb2.s(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var);
                        break;
                    case 27:
                        fb2.n(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, o(i16));
                        break;
                    case 28:
                        fb2.e(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var);
                        break;
                    case 29:
                        fb2.t(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 30:
                        fb2.g(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 31:
                        fb2.o(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 32:
                        fb2.p(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 33:
                        fb2.q(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 34:
                        fb2.r(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, false);
                        break;
                    case 35:
                        fb2.f(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 36:
                        fb2.j(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 37:
                        fb2.m(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 38:
                        fb2.u(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 39:
                        fb2.l(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 40:
                        fb2.i(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 41:
                        fb2.h(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 42:
                        fb2.d(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 43:
                        fb2.t(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 44:
                        fb2.g(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 45:
                        fb2.o(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 46:
                        fb2.p(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 47:
                        fb2.q(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 48:
                        fb2.r(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, true);
                        break;
                    case 49:
                        fb2.k(iArr[i16], (List) zb2.l(t10, l10 & 1048575), w82Var, o(i16));
                        break;
                    case 50:
                        if (zb2.l(t10, l10 & 1048575) != null) {
                            ka2 ka2Var = (ka2) q(i16);
                            throw null;
                        }
                        break;
                    case 51:
                        if (A(t10, i17, i16)) {
                            d5 = I(t10, l10 & 1048575);
                            w82Var.g(i17, d5);
                            break;
                        } else {
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 52 */:
                        if (A(t10, i17, i16)) {
                            f10 = J(t10, l10 & 1048575);
                            w82Var.k(i17, f10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (A(t10, i17, i16)) {
                            j3 = m(t10, l10 & 1048575);
                            w82Var.n(i17, j3);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (A(t10, i17, i16)) {
                            j10 = m(t10, l10 & 1048575);
                            w82Var.d(i17, j10);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (A(t10, i17, i16)) {
                            i10 = M(t10, l10 & 1048575);
                            w82Var.m(i17, i10);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (A(t10, i17, i16)) {
                            j11 = m(t10, l10 & 1048575);
                            w82Var.j(i17, j11);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (A(t10, i17, i16)) {
                            i11 = M(t10, l10 & 1048575);
                            w82Var.i(i17, i11);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (A(t10, i17, i16)) {
                            z10 = B(t10, l10 & 1048575);
                            w82Var.e(i17, z10);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!A(t10, i17, i16)) {
                            break;
                        }
                        D(i17, zb2.l(t10, l10 & 1048575), w82Var);
                        break;
                    case 60:
                        if (!A(t10, i17, i16)) {
                            break;
                        }
                        w82Var.o(i17, zb2.l(t10, l10 & 1048575), o(i16));
                        break;
                    case 61:
                        if (!A(t10, i17, i16)) {
                            break;
                        }
                        w82Var.f(i17, (n82) zb2.l(t10, l10 & 1048575));
                        break;
                    case 62:
                        if (A(t10, i17, i16)) {
                            i12 = M(t10, l10 & 1048575);
                            w82Var.c(i17, i12);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (A(t10, i17, i16)) {
                            i13 = M(t10, l10 & 1048575);
                            w82Var.h(i17, i13);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (A(t10, i17, i16)) {
                            i14 = M(t10, l10 & 1048575);
                            w82Var.p(i17, i14);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (A(t10, i17, i16)) {
                            j12 = m(t10, l10 & 1048575);
                            w82Var.q(i17, j12);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (A(t10, i17, i16)) {
                            i15 = M(t10, l10 & 1048575);
                            w82Var.a(i17, i15);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (A(t10, i17, i16)) {
                            j13 = m(t10, l10 & 1048575);
                            w82Var.b(i17, j13);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!A(t10, i17, i16)) {
                            break;
                        }
                        w82Var.l(i17, zb2.l(t10, l10 & 1048575), o(i16));
                        break;
                }
            }
            pb2<?, ?> pb2Var = this.f13991m;
            pb2Var.r(pb2Var.d(t10), w82Var);
        }
    }

    @Override // m4.eb2
    public final void g(T t10, s82 s82Var, z82 z82Var) {
        long j3;
        Object valueOf;
        int y;
        long j10;
        long F;
        long j11;
        int A;
        long j12;
        Object l10;
        Object L;
        long j13;
        Object L2;
        fa2 fa2Var;
        fa2 fa2Var2;
        fa2 fa2Var3;
        fa2 fa2Var4;
        fa2 fa2Var5;
        fa2 fa2Var6;
        fa2 fa2Var7;
        fa2 fa2Var8;
        fa2 fa2Var9;
        List<Integer> a10;
        fa2 fa2Var10;
        fa2 fa2Var11;
        fa2 fa2Var12;
        fa2 fa2Var13;
        Objects.requireNonNull(z82Var);
        pb2<?, ?> pb2Var = this.f13991m;
        a92<?> a92Var = this.f13992n;
        Object obj = null;
        e92<?> e92Var = null;
        while (true) {
            try {
                int x10 = s82Var.x();
                int R = R(x10);
                if (R >= 0) {
                    int l11 = l(R);
                    switch ((l11 >>> 20) & 255) {
                        case 0:
                            zb2.q(t10, l11 & 1048575, s82Var.v());
                            v(t10, R);
                            break;
                        case 1:
                            zb2.r(t10, l11 & 1048575, s82Var.w());
                            v(t10, R);
                            break;
                        case 2:
                            j10 = l11 & 1048575;
                            F = s82Var.F();
                            zb2.t(t10, j10, F);
                            v(t10, R);
                            break;
                        case 3:
                            j10 = l11 & 1048575;
                            F = s82Var.I();
                            zb2.t(t10, j10, F);
                            v(t10, R);
                            break;
                        case 4:
                            j11 = l11 & 1048575;
                            A = s82Var.A();
                            zb2.s(t10, j11, A);
                            v(t10, R);
                            break;
                        case 5:
                            j10 = l11 & 1048575;
                            F = s82Var.E();
                            zb2.t(t10, j10, F);
                            v(t10, R);
                            break;
                        case 6:
                            j11 = l11 & 1048575;
                            A = s82Var.z();
                            zb2.s(t10, j11, A);
                            v(t10, R);
                            break;
                        case 7:
                            zb2.p(t10, l11 & 1048575, s82Var.n());
                            v(t10, R);
                            break;
                        case 8:
                            u(t10, l11, s82Var);
                            v(t10, R);
                            break;
                        case 9:
                            if (z(t10, R)) {
                                j12 = l11 & 1048575;
                                l10 = zb2.l(t10, j12);
                                L = s82Var.L(o(R), z82Var);
                                zb2.u(t10, j12, v92.c(l10, L));
                                break;
                            } else {
                                j13 = l11 & 1048575;
                                L2 = s82Var.L(o(R), z82Var);
                                zb2.u(t10, j13, L2);
                                v(t10, R);
                                break;
                            }
                        case 10:
                            j13 = l11 & 1048575;
                            L2 = s82Var.J();
                            zb2.u(t10, j13, L2);
                            v(t10, R);
                            break;
                        case 11:
                            j11 = l11 & 1048575;
                            A = s82Var.D();
                            zb2.s(t10, j11, A);
                            v(t10, R);
                            break;
                        case 12:
                            y = s82Var.y();
                            p92 n10 = n(R);
                            if (n10 != null && !n10.a(y)) {
                                obj = fb2.b(x10, y, obj, pb2Var);
                                break;
                            }
                            zb2.s(t10, l11 & 1048575, y);
                            v(t10, R);
                            break;
                        case 13:
                            j11 = l11 & 1048575;
                            A = s82Var.B();
                            zb2.s(t10, j11, A);
                            v(t10, R);
                            break;
                        case 14:
                            j10 = l11 & 1048575;
                            F = s82Var.G();
                            zb2.t(t10, j10, F);
                            v(t10, R);
                            break;
                        case 15:
                            j11 = l11 & 1048575;
                            A = s82Var.C();
                            zb2.s(t10, j11, A);
                            v(t10, R);
                            break;
                        case 16:
                            j10 = l11 & 1048575;
                            F = s82Var.H();
                            zb2.t(t10, j10, F);
                            v(t10, R);
                            break;
                        case 17:
                            if (z(t10, R)) {
                                j12 = l11 & 1048575;
                                l10 = zb2.l(t10, j12);
                                L = s82Var.K(o(R), z82Var);
                                zb2.u(t10, j12, v92.c(l10, L));
                                break;
                            } else {
                                j13 = l11 & 1048575;
                                L2 = s82Var.K(o(R), z82Var);
                                zb2.u(t10, j13, L2);
                                v(t10, R);
                                break;
                            }
                        case 18:
                            fa2Var = this.f13990l;
                            s82Var.O(fa2Var.a(t10, l11 & 1048575));
                            break;
                        case 19:
                            fa2Var2 = this.f13990l;
                            s82Var.b(fa2Var2.a(t10, l11 & 1048575));
                            break;
                        case 20:
                            fa2Var3 = this.f13990l;
                            s82Var.e(fa2Var3.a(t10, l11 & 1048575));
                            break;
                        case 21:
                            fa2Var4 = this.f13990l;
                            s82Var.m(fa2Var4.a(t10, l11 & 1048575));
                            break;
                        case 22:
                            fa2Var5 = this.f13990l;
                            s82Var.d(fa2Var5.a(t10, l11 & 1048575));
                            break;
                        case 23:
                            fa2Var6 = this.f13990l;
                            s82Var.a(fa2Var6.a(t10, l11 & 1048575));
                            break;
                        case 24:
                            fa2Var7 = this.f13990l;
                            s82Var.Q(fa2Var7.a(t10, l11 & 1048575));
                            break;
                        case 25:
                            fa2Var8 = this.f13990l;
                            s82Var.M(fa2Var8.a(t10, l11 & 1048575));
                            break;
                        case 26:
                            if (y(l11)) {
                                s82Var.k(this.f13990l.a(t10, l11 & 1048575), true);
                                break;
                            } else {
                                s82Var.k(this.f13990l.a(t10, l11 & 1048575), false);
                                break;
                            }
                        case 27:
                            s82Var.f(this.f13990l.a(t10, l11 & 1048575), o(R), z82Var);
                            break;
                        case 28:
                            s82Var.N(this.f13990l.a(t10, l11 & 1048575));
                            break;
                        case 29:
                            fa2Var9 = this.f13990l;
                            s82Var.l(fa2Var9.a(t10, l11 & 1048575));
                            break;
                        case 30:
                            a10 = this.f13990l.a(t10, l11 & 1048575);
                            s82Var.P(a10);
                            obj = fb2.a(x10, a10, n(R), obj, pb2Var);
                            break;
                        case 31:
                            fa2Var10 = this.f13990l;
                            s82Var.g(fa2Var10.a(t10, l11 & 1048575));
                            break;
                        case 32:
                            fa2Var11 = this.f13990l;
                            s82Var.h(fa2Var11.a(t10, l11 & 1048575));
                            break;
                        case 33:
                            fa2Var12 = this.f13990l;
                            s82Var.i(fa2Var12.a(t10, l11 & 1048575));
                            break;
                        case 34:
                            fa2Var13 = this.f13990l;
                            s82Var.j(fa2Var13.a(t10, l11 & 1048575));
                            break;
                        case 35:
                            fa2Var = this.f13990l;
                            s82Var.O(fa2Var.a(t10, l11 & 1048575));
                            break;
                        case 36:
                            fa2Var2 = this.f13990l;
                            s82Var.b(fa2Var2.a(t10, l11 & 1048575));
                            break;
                        case 37:
                            fa2Var3 = this.f13990l;
                            s82Var.e(fa2Var3.a(t10, l11 & 1048575));
                            break;
                        case 38:
                            fa2Var4 = this.f13990l;
                            s82Var.m(fa2Var4.a(t10, l11 & 1048575));
                            break;
                        case 39:
                            fa2Var5 = this.f13990l;
                            s82Var.d(fa2Var5.a(t10, l11 & 1048575));
                            break;
                        case 40:
                            fa2Var6 = this.f13990l;
                            s82Var.a(fa2Var6.a(t10, l11 & 1048575));
                            break;
                        case 41:
                            fa2Var7 = this.f13990l;
                            s82Var.Q(fa2Var7.a(t10, l11 & 1048575));
                            break;
                        case 42:
                            fa2Var8 = this.f13990l;
                            s82Var.M(fa2Var8.a(t10, l11 & 1048575));
                            break;
                        case 43:
                            fa2Var9 = this.f13990l;
                            s82Var.l(fa2Var9.a(t10, l11 & 1048575));
                            break;
                        case 44:
                            a10 = this.f13990l.a(t10, l11 & 1048575);
                            s82Var.P(a10);
                            obj = fb2.a(x10, a10, n(R), obj, pb2Var);
                            break;
                        case 45:
                            fa2Var10 = this.f13990l;
                            s82Var.g(fa2Var10.a(t10, l11 & 1048575));
                            break;
                        case 46:
                            fa2Var11 = this.f13990l;
                            s82Var.h(fa2Var11.a(t10, l11 & 1048575));
                            break;
                        case 47:
                            fa2Var12 = this.f13990l;
                            s82Var.i(fa2Var12.a(t10, l11 & 1048575));
                            break;
                        case 48:
                            fa2Var13 = this.f13990l;
                            s82Var.j(fa2Var13.a(t10, l11 & 1048575));
                            break;
                        case 49:
                            s82Var.c(this.f13990l.a(t10, l11 & 1048575), o(R), z82Var);
                            break;
                        case 50:
                            Object q10 = q(R);
                            long l12 = l(R) & 1048575;
                            Object l13 = zb2.l(t10, l12);
                            if (l13 == null) {
                                l13 = la2.f10694t.a();
                                zb2.u(t10, l12, l13);
                            } else if (ma2.b(l13)) {
                                Object a11 = la2.f10694t.a();
                                ma2.c(a11, l13);
                                zb2.u(t10, l12, a11);
                                l13 = a11;
                            }
                            la2 la2Var = (la2) l13;
                            ka2 ka2Var = (ka2) q10;
                            throw null;
                            break;
                        case 51:
                            j3 = l11 & 1048575;
                            valueOf = Double.valueOf(s82Var.v());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 52 */:
                            j3 = l11 & 1048575;
                            valueOf = Float.valueOf(s82Var.w());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 53:
                            j3 = l11 & 1048575;
                            valueOf = Long.valueOf(s82Var.F());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 54:
                            j3 = l11 & 1048575;
                            valueOf = Long.valueOf(s82Var.I());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 55:
                            j3 = l11 & 1048575;
                            valueOf = Integer.valueOf(s82Var.A());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 56:
                            j3 = l11 & 1048575;
                            valueOf = Long.valueOf(s82Var.E());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 57:
                            j3 = l11 & 1048575;
                            valueOf = Integer.valueOf(s82Var.z());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 58:
                            j3 = l11 & 1048575;
                            valueOf = Boolean.valueOf(s82Var.n());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 59:
                            u(t10, l11, s82Var);
                            w(t10, x10, R);
                            break;
                        case 60:
                            int i10 = l11 & 1048575;
                            if (A(t10, x10, R)) {
                                j3 = i10;
                                valueOf = v92.c(zb2.l(t10, j3), s82Var.L(o(R), z82Var));
                                zb2.u(t10, j3, valueOf);
                                w(t10, x10, R);
                                break;
                            } else {
                                zb2.u(t10, i10, s82Var.L(o(R), z82Var));
                                v(t10, R);
                                w(t10, x10, R);
                            }
                        case 61:
                            j3 = l11 & 1048575;
                            valueOf = s82Var.J();
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 62:
                            j3 = l11 & 1048575;
                            valueOf = Integer.valueOf(s82Var.D());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 63:
                            y = s82Var.y();
                            p92 n11 = n(R);
                            if (n11 != null && !n11.a(y)) {
                                obj = fb2.b(x10, y, obj, pb2Var);
                                break;
                            } else {
                                zb2.u(t10, l11 & 1048575, Integer.valueOf(y));
                                w(t10, x10, R);
                                break;
                            }
                            break;
                        case 64:
                            j3 = l11 & 1048575;
                            valueOf = Integer.valueOf(s82Var.B());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 65:
                            j3 = l11 & 1048575;
                            valueOf = Long.valueOf(s82Var.G());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 66:
                            j3 = l11 & 1048575;
                            valueOf = Integer.valueOf(s82Var.C());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 67:
                            j3 = l11 & 1048575;
                            valueOf = Long.valueOf(s82Var.H());
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        case 68:
                            j3 = l11 & 1048575;
                            valueOf = s82Var.K(o(R), z82Var);
                            zb2.u(t10, j3, valueOf);
                            w(t10, x10, R);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = pb2Var.f();
                                } catch (w92 unused) {
                                    pb2Var.q();
                                    obj = obj;
                                    if (obj == null) {
                                        obj = pb2Var.c(t10);
                                    }
                                    if (!pb2Var.p(obj, s82Var)) {
                                        for (int i11 = this.f13988j; i11 < this.f13989k; i11++) {
                                            p(t10, this.f13987i[i11], obj);
                                        }
                                        if (obj == null) {
                                            return;
                                        }
                                        pb2Var.n(t10, obj);
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!pb2Var.p(obj, s82Var)) {
                                for (int i12 = this.f13988j; i12 < this.f13989k; i12++) {
                                    p(t10, this.f13987i[i12], obj);
                                }
                                if (obj == null) {
                                    return;
                                }
                                pb2Var.n(t10, obj);
                                return;
                            }
                            break;
                    }
                } else if (x10 == Integer.MAX_VALUE) {
                    for (int i13 = this.f13988j; i13 < this.f13989k; i13++) {
                        p(t10, this.f13987i[i13], obj);
                    }
                    if (obj == null) {
                        return;
                    }
                    pb2Var.n(t10, obj);
                    return;
                } else if ((!this.f13984f ? null : a92Var.c(z82Var, this.f13983e, x10)) != null) {
                    if (e92Var == null) {
                        e92Var = a92Var.b(t10);
                    }
                    obj = a92Var.d();
                } else {
                    pb2Var.q();
                    obj = obj;
                    if (obj == null) {
                        obj = pb2Var.c(t10);
                    }
                    if (!pb2Var.p(obj, s82Var)) {
                        for (int i14 = this.f13988j; i14 < this.f13989k; i14++) {
                            p(t10, this.f13987i[i14], obj);
                        }
                        if (obj == null) {
                            return;
                        }
                        pb2Var.n(t10, obj);
                        return;
                    }
                }
            } catch (Throwable th) {
                for (int i15 = this.f13988j; i15 < this.f13989k; i15++) {
                    p(t10, this.f13987i[i15], obj);
                }
                if (obj != null) {
                    pb2Var.n(t10, obj);
                }
                throw th;
            }
        }
    }

    @Override // m4.eb2
    public final int h(T t10) {
        return this.f13986h ? L(t10) : K(t10);
    }

    @Override // m4.eb2
    public final boolean i(T t10, T t11) {
        int length = this.f13979a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int l10 = l(i10);
            long j3 = l10 & 1048575;
            switch ((l10 >>> 20) & 255) {
                case 0:
                    if (x(t10, t11, i10) && Double.doubleToLongBits(zb2.g(t10, j3)) == Double.doubleToLongBits(zb2.g(t11, j3))) {
                        break;
                    }
                    return false;
                case 1:
                    if (x(t10, t11, i10) && Float.floatToIntBits(zb2.h(t10, j3)) == Float.floatToIntBits(zb2.h(t11, j3))) {
                        break;
                    }
                    return false;
                case 2:
                    if (x(t10, t11, i10) && zb2.j(t10, j3) == zb2.j(t11, j3)) {
                        break;
                    }
                    return false;
                case 3:
                    if (x(t10, t11, i10) && zb2.j(t10, j3) == zb2.j(t11, j3)) {
                        break;
                    }
                    return false;
                case 4:
                    if (x(t10, t11, i10) && zb2.i(t10, j3) == zb2.i(t11, j3)) {
                        break;
                    }
                    return false;
                case 5:
                    if (x(t10, t11, i10) && zb2.j(t10, j3) == zb2.j(t11, j3)) {
                        break;
                    }
                    return false;
                case 6:
                    if (x(t10, t11, i10) && zb2.i(t10, j3) == zb2.i(t11, j3)) {
                        break;
                    }
                    return false;
                case 7:
                    if (x(t10, t11, i10) && zb2.y(t10, j3) == zb2.y(t11, j3)) {
                        break;
                    }
                    return false;
                case 8:
                    if (x(t10, t11, i10) && fb2.c(zb2.l(t10, j3), zb2.l(t11, j3))) {
                        break;
                    }
                    return false;
                case 9:
                    if (x(t10, t11, i10) && fb2.c(zb2.l(t10, j3), zb2.l(t11, j3))) {
                        break;
                    }
                    return false;
                case 10:
                    if (x(t10, t11, i10) && fb2.c(zb2.l(t10, j3), zb2.l(t11, j3))) {
                        break;
                    }
                    return false;
                case 11:
                    if (x(t10, t11, i10) && zb2.i(t10, j3) == zb2.i(t11, j3)) {
                        break;
                    }
                    return false;
                case 12:
                    if (x(t10, t11, i10) && zb2.i(t10, j3) == zb2.i(t11, j3)) {
                        break;
                    }
                    return false;
                case 13:
                    if (x(t10, t11, i10) && zb2.i(t10, j3) == zb2.i(t11, j3)) {
                        break;
                    }
                    return false;
                case 14:
                    if (x(t10, t11, i10) && zb2.j(t10, j3) == zb2.j(t11, j3)) {
                        break;
                    }
                    return false;
                case 15:
                    if (x(t10, t11, i10) && zb2.i(t10, j3) == zb2.i(t11, j3)) {
                        break;
                    }
                    return false;
                case 16:
                    if (x(t10, t11, i10) && zb2.j(t10, j3) == zb2.j(t11, j3)) {
                        break;
                    }
                    return false;
                case 17:
                    if (x(t10, t11, i10) && fb2.c(zb2.l(t10, j3), zb2.l(t11, j3))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!fb2.c(zb2.l(t10, j3), zb2.l(t11, j3))) {
                        return false;
                    }
                    break;
                case 51:
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long S = S(i10) & 1048575;
                    if (zb2.i(t10, S) == zb2.i(t11, S) && fb2.c(zb2.l(t10, j3), zb2.l(t11, j3))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.f13991m.d(t10).equals(this.f13991m.d(t11))) {
            return false;
        }
        if (!this.f13984f) {
            return true;
        }
        this.f13992n.a(t10);
        this.f13992n.a(t11);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.eb2
    public final boolean j(T t10) {
        boolean z10;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            boolean z11 = true;
            if (i10 >= this.f13988j) {
                if (!this.f13984f) {
                    return true;
                }
                this.f13992n.a(t10);
                throw null;
            }
            int i13 = this.f13987i[i10];
            int i14 = this.f13979a[i13];
            int l10 = l(i13);
            int i15 = this.f13979a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i11 = p.getInt(t10, i16);
                }
                i12 = i16;
            }
            if ((268435456 & l10) != 0) {
                if (i12 == 1048575) {
                    z10 = z(t10, i13);
                } else {
                    z10 = (i11 & i17) != 0;
                }
                if (!z10) {
                    return false;
                }
            }
            int i18 = (l10 >>> 20) & 255;
            if (i18 != 9 && i18 != 17) {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (A(t10, i14, i13) && !o(i13).j(zb2.l(t10, l10 & 1048575))) {
                            return false;
                        }
                    } else if (i18 != 49) {
                        if (i18 == 50 && !((la2) zb2.l(t10, l10 & 1048575)).isEmpty()) {
                            ka2 ka2Var = (ka2) q(i13);
                            throw null;
                        }
                    }
                }
                List list = (List) zb2.l(t10, l10 & 1048575);
                if (!list.isEmpty()) {
                    eb2 o10 = o(i13);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!o10.j(list.get(i19))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else {
                if (i12 == 1048575) {
                    z11 = z(t10, i13);
                } else if ((i11 & i17) == 0) {
                    z11 = false;
                }
                if (z11 && !o(i13).j(zb2.l(t10, l10 & 1048575))) {
                    return false;
                }
            }
            i10++;
        }
    }

    public final int k(int i10, int i11) {
        int length = (this.f13979a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f13979a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int l(int i10) {
        return this.f13979a[i10 + 1];
    }

    public final p92 n(int i10) {
        int i11 = i10 / 3;
        return (p92) this.f13980b[i11 + i11 + 1];
    }

    public final eb2 o(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f13980b;
        eb2 eb2Var = (eb2) objArr[i12];
        if (eb2Var != null) {
            return eb2Var;
        }
        eb2<T> a10 = ya2.f15637c.a((Class) objArr[i12 + 1]);
        this.f13980b[i12] = a10;
        return a10;
    }

    public final Object p(Object obj, int i10, Object obj2) {
        int i11 = this.f13979a[i10];
        Object l10 = zb2.l(obj, l(i10) & 1048575);
        if (l10 == null || n(i10) == null) {
            return obj2;
        }
        la2 la2Var = (la2) l10;
        ka2 ka2Var = (ka2) q(i10);
        throw null;
    }

    public final Object q(int i10) {
        int i11 = i10 / 3;
        return this.f13980b[i11 + i11];
    }

    public final void s(T t10, T t11, int i10) {
        long l10 = l(i10) & 1048575;
        if (!z(t11, i10)) {
            return;
        }
        Object l11 = zb2.l(t10, l10);
        Object l12 = zb2.l(t11, l10);
        if (l11 != null && l12 != null) {
            l12 = v92.c(l11, l12);
        } else if (l12 == null) {
            return;
        }
        zb2.u(t10, l10, l12);
        v(t10, i10);
    }

    public final void t(T t10, T t11, int i10) {
        int l10 = l(i10);
        int i11 = this.f13979a[i10];
        long j3 = l10 & 1048575;
        if (!A(t11, i11, i10)) {
            return;
        }
        Object l11 = A(t10, i11, i10) ? zb2.l(t10, j3) : null;
        Object l12 = zb2.l(t11, j3);
        if (l11 != null && l12 != null) {
            l12 = v92.c(l11, l12);
        } else if (l12 == null) {
            return;
        }
        zb2.u(t10, j3, l12);
        w(t10, i11, i10);
    }

    public final void u(Object obj, int i10, s82 s82Var) {
        if ((536870912 & i10) != 0) {
            s82Var.s(2);
            zb2.u(obj, i10 & 1048575, s82Var.f13548a.z());
            return;
        }
        int i11 = i10 & 1048575;
        if (!this.f13985g) {
            zb2.u(obj, i11, s82Var.J());
            return;
        }
        s82Var.s(2);
        zb2.u(obj, i11, s82Var.f13548a.y());
    }

    public final void v(T t10, int i10) {
        int S = S(i10);
        long j3 = 1048575 & S;
        if (j3 == 1048575) {
            return;
        }
        zb2.s(t10, j3, (1 << (S >>> 20)) | zb2.i(t10, j3));
    }

    public final void w(T t10, int i10, int i11) {
        zb2.s(t10, S(i11) & 1048575, i10);
    }

    public final boolean x(T t10, T t11, int i10) {
        return z(t10, i10) == z(t11, i10);
    }

    public final boolean z(T t10, int i10) {
        int S = S(i10);
        long j3 = S & 1048575;
        if (j3 != 1048575) {
            return (zb2.i(t10, j3) & (1 << (S >>> 20))) != 0;
        }
        int l10 = l(i10);
        long j10 = l10 & 1048575;
        switch ((l10 >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(zb2.g(t10, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zb2.h(t10, j10)) != 0;
            case 2:
                return zb2.j(t10, j10) != 0;
            case 3:
                return zb2.j(t10, j10) != 0;
            case 4:
                return zb2.i(t10, j10) != 0;
            case 5:
                return zb2.j(t10, j10) != 0;
            case 6:
                return zb2.i(t10, j10) != 0;
            case 7:
                return zb2.y(t10, j10);
            case 8:
                Object l11 = zb2.l(t10, j10);
                if (l11 instanceof String) {
                    return !((String) l11).isEmpty();
                } else if (!(l11 instanceof n82)) {
                    throw new IllegalArgumentException();
                } else {
                    return !n82.f11571t.equals(l11);
                }
            case 9:
                return zb2.l(t10, j10) != null;
            case 10:
                return !n82.f11571t.equals(zb2.l(t10, j10));
            case 11:
                return zb2.i(t10, j10) != 0;
            case 12:
                return zb2.i(t10, j10) != 0;
            case 13:
                return zb2.i(t10, j10) != 0;
            case 14:
                return zb2.j(t10, j10) != 0;
            case 15:
                return zb2.i(t10, j10) != 0;
            case 16:
                return zb2.j(t10, j10) != 0;
            case 17:
                return zb2.l(t10, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }
}
