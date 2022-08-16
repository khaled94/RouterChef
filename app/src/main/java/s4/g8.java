package s4;

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
public final class g8<T> implements o8<T> {

    /* renamed from: n */
    public static final int[] f17879n = new int[0];

    /* renamed from: o */
    public static final Unsafe f17880o = i9.k();

    /* renamed from: a */
    public final int[] f17881a;

    /* renamed from: b */
    public final Object[] f17882b;

    /* renamed from: c */
    public final int f17883c;

    /* renamed from: d */
    public final int f17884d;

    /* renamed from: e */
    public final d8 f17885e;

    /* renamed from: f */
    public final boolean f17886f;

    /* renamed from: g */
    public final boolean f17887g;

    /* renamed from: h */
    public final int[] f17888h;

    /* renamed from: i */
    public final int f17889i;

    /* renamed from: j */
    public final int f17890j;

    /* renamed from: k */
    public final r7 f17891k;

    /* renamed from: l */
    public final z8<?, ?> f17892l;

    /* renamed from: m */
    public final p6<?> f17893m;

    public g8(int[] iArr, Object[] objArr, int i10, int i11, d8 d8Var, boolean z10, int[] iArr2, int i12, int i13, r7 r7Var, z8 z8Var, p6 p6Var, z7 z7Var) {
        this.f17881a = iArr;
        this.f17882b = objArr;
        this.f17883c = i10;
        this.f17884d = i11;
        this.f17887g = z10;
        this.f17886f = p6Var != null && p6Var.c(d8Var);
        this.f17888h = iArr2;
        this.f17889i = i12;
        this.f17890j = i13;
        this.f17891k = r7Var;
        this.f17892l = z8Var;
        this.f17893m = p6Var;
        this.f17885e = d8Var;
    }

    public static a9 A(Object obj) {
        b7 b7Var = (b7) obj;
        a9 a9Var = b7Var.zzc;
        if (a9Var == a9.f17720f) {
            a9 b10 = a9.b();
            b7Var.zzc = b10;
            return b10;
        }
        return a9Var;
    }

    public static g8 B(b8 b8Var, i8 i8Var, r7 r7Var, z8 z8Var, p6 p6Var, z7 z7Var) {
        if (b8Var instanceof n8) {
            return C((n8) b8Var, i8Var, r7Var, z8Var, p6Var, z7Var);
        }
        y8 y8Var = (y8) b8Var;
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
    public static <T> s4.g8<T> C(s4.n8 r33, s4.i8 r34, s4.r7 r35, s4.z8<?, ?> r36, s4.p6<?> r37, s4.z7 r38) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g8.C(s4.n8, s4.i8, s4.r7, s4.z8, s4.p6, s4.z7):s4.g8");
    }

    public static <T> double D(T t10, long j3) {
        return ((Double) i9.j(t10, j3)).doubleValue();
    }

    public static <T> float E(T t10, long j3) {
        return ((Float) i9.j(t10, j3)).floatValue();
    }

    public static <T> int H(T t10, long j3) {
        return ((Integer) i9.j(t10, j3)).intValue();
    }

    public static <T> long k(T t10, long j3) {
        return ((Long) i9.j(t10, j3)).longValue();
    }

    public static Field o(Class<?> cls, String str) {
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

    public static <T> boolean w(T t10, long j3) {
        return ((Boolean) i9.j(t10, j3)).booleanValue();
    }

    public static final void y(int i10, Object obj, l6 l6Var) {
        if (obj instanceof String) {
            l6Var.f17966a.s(i10, (String) obj);
            return;
        }
        l6Var.f(i10, (g6) obj);
    }

    public final int F(T t10) {
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
        Unsafe unsafe = f17880o;
        int i28 = 1048575;
        int i29 = 1048575;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i30 < this.f17881a.length) {
            int j3 = j(i30);
            int[] iArr = this.f17881a;
            int i33 = iArr[i30];
            int i34 = (j3 >>> 20) & 255;
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
            long j10 = j3 & i28;
            switch (i34) {
                case 0:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i12 = k6.g(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 1:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i13 = k6.g(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 2:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    long j11 = unsafe.getLong(t10, j10);
                    i14 = k6.g(i33 << 3);
                    i15 = k6.i(j11);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 3:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    long j112 = unsafe.getLong(t10, j10);
                    i14 = k6.g(i33 << 3);
                    i15 = k6.i(j112);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 4:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    int i37 = unsafe.getInt(t10, j10);
                    i16 = k6.g(i33 << 3);
                    i17 = k6.A(i37);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 5:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i12 = k6.g(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 6:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i13 = k6.g(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 7:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i18 = k6.g(i33 << 3);
                        i11 = i18 + 1;
                        i31 += i11;
                        break;
                    }
                case 8:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        obj = unsafe.getObject(t10, j10);
                        if (!(obj instanceof g6)) {
                            i16 = k6.g(i33 << 3);
                            i17 = k6.C((String) obj);
                            i11 = i17 + i16;
                            i31 += i11;
                            break;
                        }
                        int g10 = k6.g(i33 << 3);
                        int g11 = ((g6) obj).g();
                        i31 += k6.g(g11) + g11 + g10;
                        break;
                    }
                case 9:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i11 = p8.E(i33, unsafe.getObject(t10, j10), m(i30));
                        i31 += i11;
                        break;
                    }
                case 10:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        obj = unsafe.getObject(t10, j10);
                        int g102 = k6.g(i33 << 3);
                        int g112 = ((g6) obj).g();
                        i31 += k6.g(g112) + g112 + g102;
                        break;
                    }
                case 11:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i19 = unsafe.getInt(t10, j10);
                        i16 = k6.g(i33 << 3);
                        i17 = k6.g(i19);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 12:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    int i372 = unsafe.getInt(t10, j10);
                    i16 = k6.g(i33 << 3);
                    i17 = k6.A(i372);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 13:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i13 = k6.g(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 14:
                    if ((i32 & i10) == 0) {
                        break;
                    }
                    i12 = k6.g(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 15:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        int i38 = unsafe.getInt(t10, j10);
                        i16 = k6.g(i33 << 3);
                        i19 = (i38 >> 31) ^ (i38 + i38);
                        i17 = k6.g(i19);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i32) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(t10, j10);
                        i20 = k6.g(i33 << 3);
                        i21 = k6.i((j12 >> 63) ^ (j12 + j12));
                        i11 = i21 + i20;
                        i31 += i11;
                        break;
                    }
                case 17:
                    if ((i32 & i10) == 0) {
                        break;
                    } else {
                        i11 = k6.z(i33, (d8) unsafe.getObject(t10, j10), m(i30));
                        i31 += i11;
                        break;
                    }
                case 18:
                case 23:
                case 32:
                    i11 = p8.y(i33, (List) unsafe.getObject(t10, j10));
                    i31 += i11;
                    break;
                case 19:
                case 24:
                case 31:
                    i11 = p8.w(i33, (List) unsafe.getObject(t10, j10));
                    i31 += i11;
                    break;
                case 20:
                    i11 = p8.C(i33, (List) unsafe.getObject(t10, j10));
                    i31 += i11;
                    break;
                case 21:
                    List list = (List) unsafe.getObject(t10, j10);
                    Class<?> cls = p8.f18060a;
                    i26 = list.size();
                    if (i26 != 0) {
                        i24 = p8.K(list);
                        i25 = k6.D(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 22:
                    List list2 = (List) unsafe.getObject(t10, j10);
                    Class<?> cls2 = p8.f18060a;
                    i26 = list2.size();
                    if (i26 != 0) {
                        i24 = p8.B(list2);
                        i25 = k6.D(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 25:
                    Class<?> cls3 = p8.f18060a;
                    int size = ((List) unsafe.getObject(t10, j10)).size();
                    if (size != 0) {
                        i22 = (k6.g(i33 << 3) + 1) * size;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 26:
                    i11 = p8.I(i33, (List) unsafe.getObject(t10, j10));
                    i31 += i11;
                    break;
                case 27:
                    i11 = p8.F(i33, (List) unsafe.getObject(t10, j10), m(i30));
                    i31 += i11;
                    break;
                case 28:
                    i11 = p8.u(i33, (List) unsafe.getObject(t10, j10));
                    i31 += i11;
                    break;
                case 29:
                    List list3 = (List) unsafe.getObject(t10, j10);
                    Class<?> cls4 = p8.f18060a;
                    i26 = list3.size();
                    if (i26 != 0) {
                        i24 = p8.J(list3);
                        i25 = k6.D(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 30:
                    List list4 = (List) unsafe.getObject(t10, j10);
                    Class<?> cls5 = p8.f18060a;
                    i26 = list4.size();
                    if (i26 != 0) {
                        i24 = p8.v(list4);
                        i25 = k6.D(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 33:
                    List list5 = (List) unsafe.getObject(t10, j10);
                    Class<?> cls6 = p8.f18060a;
                    i26 = list5.size();
                    if (i26 != 0) {
                        i24 = p8.G(list5);
                        i25 = k6.D(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 34:
                    List list6 = (List) unsafe.getObject(t10, j10);
                    Class<?> cls7 = p8.f18060a;
                    i26 = list6.size();
                    if (i26 != 0) {
                        i24 = p8.H(list6);
                        i25 = k6.D(i33);
                        i23 = i25 * i26;
                        i22 = i23 + i24;
                        i31 += i22;
                        break;
                    }
                    i22 = 0;
                    i31 += i22;
                case 35:
                    i24 = p8.z((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 36:
                    i24 = p8.x((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 37:
                    i24 = p8.D((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 38:
                    i24 = p8.K((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 39:
                    i24 = p8.B((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 40:
                    i24 = p8.z((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 41:
                    i24 = p8.x((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 42:
                    Class<?> cls8 = p8.f18060a;
                    i24 = ((List) unsafe.getObject(t10, j10)).size();
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 43:
                    i24 = p8.J((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 44:
                    i24 = p8.v((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 45:
                    i24 = p8.x((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 46:
                    i24 = p8.z((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 47:
                    i24 = p8.G((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 48:
                    i24 = p8.H((List) unsafe.getObject(t10, j10));
                    if (i24 <= 0) {
                        break;
                    }
                    i23 = k6.g(i24) + k6.D(i33);
                    i22 = i23 + i24;
                    i31 += i22;
                    break;
                case 49:
                    i11 = p8.A(i33, (List) unsafe.getObject(t10, j10), m(i30));
                    i31 += i11;
                    break;
                case 50:
                    z7.a(unsafe.getObject(t10, j10), n(i30));
                    break;
                case 51:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    i12 = k6.g(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    i13 = k6.g(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 53:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    long k10 = k(t10, j10);
                    i14 = k6.g(i33 << 3);
                    i15 = k6.i(k10);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 54:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    long k102 = k(t10, j10);
                    i14 = k6.g(i33 << 3);
                    i15 = k6.i(k102);
                    i11 = i15 + i14;
                    i31 += i11;
                    break;
                case 55:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    int H = H(t10, j10);
                    i16 = k6.g(i33 << 3);
                    i17 = k6.A(H);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 56:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    i12 = k6.g(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 57:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    i13 = k6.g(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 58:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        i18 = k6.g(i33 << 3);
                        i11 = i18 + 1;
                        i31 += i11;
                        break;
                    }
                case 59:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        obj2 = unsafe.getObject(t10, j10);
                        if (!(obj2 instanceof g6)) {
                            i16 = k6.g(i33 << 3);
                            i17 = k6.C((String) obj2);
                            i11 = i17 + i16;
                            i31 += i11;
                            break;
                        }
                        int g12 = k6.g(i33 << 3);
                        int g13 = ((g6) obj2).g();
                        i22 = k6.g(g13) + g13 + g12;
                        i31 += i22;
                        break;
                    }
                case 60:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        i11 = p8.E(i33, unsafe.getObject(t10, j10), m(i30));
                        i31 += i11;
                        break;
                    }
                case 61:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        obj2 = unsafe.getObject(t10, j10);
                        int g122 = k6.g(i33 << 3);
                        int g132 = ((g6) obj2).g();
                        i22 = k6.g(g132) + g132 + g122;
                        i31 += i22;
                        break;
                    }
                case 62:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        i27 = H(t10, j10);
                        i16 = k6.g(i33 << 3);
                        i17 = k6.g(i27);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 63:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    int H2 = H(t10, j10);
                    i16 = k6.g(i33 << 3);
                    i17 = k6.A(H2);
                    i11 = i17 + i16;
                    i31 += i11;
                    break;
                case 64:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    i13 = k6.g(i33 << 3);
                    i11 = i13 + 4;
                    i31 += i11;
                    break;
                case 65:
                    if (!v(t10, i33, i30)) {
                        break;
                    }
                    i12 = k6.g(i33 << 3);
                    i11 = i12 + 8;
                    i31 += i11;
                    break;
                case 66:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        int H3 = H(t10, j10);
                        i16 = k6.g(i33 << 3);
                        i27 = (H3 >> 31) ^ (H3 + H3);
                        i17 = k6.g(i27);
                        i11 = i17 + i16;
                        i31 += i11;
                        break;
                    }
                case 67:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        long k11 = k(t10, j10);
                        i20 = k6.g(i33 << 3);
                        i21 = k6.i((k11 >> 63) ^ (k11 + k11));
                        i11 = i21 + i20;
                        i31 += i11;
                        break;
                    }
                case 68:
                    if (!v(t10, i33, i30)) {
                        break;
                    } else {
                        i11 = k6.z(i33, (d8) unsafe.getObject(t10, j10), m(i30));
                        i31 += i11;
                        break;
                    }
            }
            i30 += 3;
            i28 = 1048575;
        }
        z8<?, ?> z8Var = this.f17892l;
        int a10 = z8Var.a(z8Var.c(t10)) + i31;
        if (!this.f17886f) {
            return a10;
        }
        this.f17893m.a(t10);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0367, code lost:
        if ((r4 instanceof s4.g6) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x037d, code lost:
        r5 = s4.k6.g(r7 << 3);
        r4 = s4.k6.C((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        if ((r4 instanceof s4.g6) != false) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int G(T r11) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g8.G(java.lang.Object):int");
    }

    public final int I(Object obj, int i10, long j3) {
        Unsafe unsafe = f17880o;
        Object n10 = n(i10);
        Object object = unsafe.getObject(obj, j3);
        if (!((y7) object).f18208s) {
            y7 y7Var = y7.f18207t;
            y7 y7Var2 = y7Var.isEmpty() ? new y7() : new y7(y7Var);
            z7.b(y7Var2, object);
            unsafe.putObject(obj, j3, y7Var2);
        }
        w7 w7Var = (w7) n10;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r15 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r15 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r3 = s4.i7.c(r15, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, s4.a6 r29) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g8.J(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, s4.a6):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    public final int K(T t10, byte[] bArr, int i10, int i11, a6 a6Var) {
        byte b10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe;
        int i18;
        T t11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int v10;
        int i35;
        int i36;
        int i37;
        int i38;
        Object c10;
        int d5;
        int i39;
        int v11;
        int i40;
        g8<T> g8Var = this;
        T t12 = t10;
        byte[] bArr2 = bArr;
        int i41 = i11;
        a6 a6Var2 = a6Var;
        Unsafe unsafe2 = f17880o;
        int i42 = -1;
        int i43 = 0;
        int i44 = 1048575;
        int i45 = i10;
        int i46 = 1048575;
        int i47 = 0;
        int i48 = 0;
        int i49 = -1;
        while (i45 < i41) {
            int i50 = i45 + 1;
            byte b11 = bArr2[i45];
            if (b11 < 0) {
                i12 = a6.d.t(b11, bArr2, i50, a6Var2);
                b10 = a6Var2.f17714a;
            } else {
                b10 = b11;
                i12 = i50;
            }
            int i51 = b10 >>> 3;
            int i52 = b10 & 7;
            if (i51 > i49) {
                int i53 = i47 / 3;
                if (i51 >= g8Var.f17883c && i51 <= g8Var.f17884d) {
                    i40 = g8Var.N(i51, i53);
                    i13 = i40;
                }
                i13 = i42;
            } else {
                if (i51 >= g8Var.f17883c && i51 <= g8Var.f17884d) {
                    i40 = g8Var.N(i51, i43);
                    i13 = i40;
                }
                i13 = i42;
            }
            if (i13 == i42) {
                i14 = i51;
                i15 = i12;
                i16 = i46;
                i17 = i43;
                unsafe = unsafe2;
                i18 = i42;
                t11 = t12;
            } else {
                int[] iArr = g8Var.f17881a;
                int i54 = iArr[i13 + 1];
                int i55 = (i54 >>> 20) & 255;
                long j3 = i54 & i44;
                if (i55 <= 17) {
                    int i56 = iArr[i13 + 2];
                    boolean z10 = true;
                    int i57 = 1 << (i56 >>> 20);
                    int i58 = 1048575;
                    int i59 = i56 & 1048575;
                    int i60 = i12;
                    if (i59 != i46) {
                        if (i46 != 1048575) {
                            unsafe2.putInt(t12, i46, i48);
                            i58 = 1048575;
                        }
                        if (i59 != i58) {
                            i48 = unsafe2.getInt(t12, i59);
                        }
                        i26 = i48;
                        i27 = i59;
                    } else {
                        i26 = i48;
                        i27 = i46;
                    }
                    switch (i55) {
                        case 0:
                            i28 = i11;
                            i29 = i13;
                            i30 = i58;
                            i31 = i60;
                            i14 = i51;
                            if (i52 != 1) {
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                i9.n(t12, j3, Double.longBitsToDouble(a6.d.w(bArr2, i31)));
                                i45 = i31 + 8;
                                i32 = i26 | i57;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 1:
                            i28 = i11;
                            i29 = i13;
                            i30 = i58;
                            i33 = i60;
                            i14 = i51;
                            if (i52 != 5) {
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                i9.o(t12, j3, Float.intBitsToFloat(a6.d.f(bArr2, i33)));
                                i34 = i33 + 4;
                                v10 = i34;
                                i35 = i26 | i57;
                                i32 = i35;
                                i45 = v10;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 2:
                        case 3:
                            i28 = i11;
                            i29 = i13;
                            i30 = i58;
                            i33 = i60;
                            i14 = i51;
                            if (i52 != 0) {
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                v10 = a6.d.v(bArr2, i33, a6Var2);
                                unsafe2.putLong(t10, j3, a6Var2.f17715b);
                                i35 = i26 | i57;
                                i29 = i29;
                                i32 = i35;
                                i45 = v10;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 4:
                        case 11:
                            i28 = i11;
                            i29 = i13;
                            i30 = i58;
                            i33 = i60;
                            i14 = i51;
                            if (i52 != 0) {
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                i34 = a6.d.s(bArr2, i33, a6Var2);
                                unsafe2.putInt(t12, j3, a6Var2.f17714a);
                                v10 = i34;
                                i35 = i26 | i57;
                                i32 = i35;
                                i45 = v10;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 5:
                        case 14:
                            i28 = i11;
                            i36 = i13;
                            i30 = i58;
                            i37 = i60;
                            i14 = i51;
                            if (i52 != 1) {
                                i33 = i37;
                                i29 = i36;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                unsafe2.putLong(t10, j3, a6.d.w(bArr2, i37));
                                i34 = i37 + 8;
                                i29 = i36;
                                v10 = i34;
                                i35 = i26 | i57;
                                i32 = i35;
                                i45 = v10;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 6:
                        case 13:
                            i28 = i11;
                            i36 = i13;
                            i30 = i58;
                            i37 = i60;
                            i14 = i51;
                            if (i52 != 5) {
                                i33 = i37;
                                i29 = i36;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                unsafe2.putInt(t12, j3, a6.d.f(bArr2, i37));
                                i45 = i37 + 4;
                                i32 = i26 | i57;
                                i47 = i36;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 7:
                            i28 = i11;
                            i36 = i13;
                            i30 = i58;
                            i37 = i60;
                            i14 = i51;
                            if (i52 != 0) {
                                i33 = i37;
                                i29 = i36;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                i45 = a6.d.v(bArr2, i37, a6Var2);
                                if (a6Var2.f17715b == 0) {
                                    z10 = false;
                                }
                                i9.m(t12, j3, z10);
                                i32 = i26 | i57;
                                i47 = i36;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 8:
                            i28 = i11;
                            i25 = i13;
                            i30 = i58;
                            i38 = i60;
                            i14 = i51;
                            if (i52 != 2) {
                                int i61 = i25;
                                i33 = i38;
                                i29 = i61;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                i34 = (i54 & 536870912) == 0 ? a6.d.p(bArr2, i38, a6Var2) : a6.d.q(bArr2, i38, a6Var2);
                                c10 = a6Var2.f17716c;
                                unsafe2.putObject(t12, j3, c10);
                                i29 = i25;
                                v10 = i34;
                                i35 = i26 | i57;
                                i32 = i35;
                                i45 = v10;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 9:
                            i25 = i13;
                            i30 = i58;
                            i38 = i60;
                            i14 = i51;
                            if (i52 != 2) {
                                int i612 = i25;
                                i33 = i38;
                                i29 = i612;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                i28 = i11;
                                i34 = a6.d.m(g8Var.m(i25), bArr2, i38, i28, a6Var2);
                                Object object = unsafe2.getObject(t12, j3);
                                if (object != null) {
                                    c10 = i7.c(object, a6Var2.f17716c);
                                    unsafe2.putObject(t12, j3, c10);
                                    i29 = i25;
                                    v10 = i34;
                                    i35 = i26 | i57;
                                    i32 = i35;
                                    i45 = v10;
                                    i47 = i29;
                                    i46 = i27;
                                    i41 = i28;
                                    i44 = i30;
                                    i43 = 0;
                                    i42 = -1;
                                    i48 = i32;
                                    i49 = i14;
                                }
                                c10 = a6Var2.f17716c;
                                unsafe2.putObject(t12, j3, c10);
                                i29 = i25;
                                v10 = i34;
                                i35 = i26 | i57;
                                i32 = i35;
                                i45 = v10;
                                i47 = i29;
                                i46 = i27;
                                i41 = i28;
                                i44 = i30;
                                i43 = 0;
                                i42 = -1;
                                i48 = i32;
                                i49 = i14;
                            }
                        case 10:
                            i25 = i13;
                            i19 = i58;
                            i38 = i60;
                            i14 = i51;
                            if (i52 != 2) {
                                int i6122 = i25;
                                i33 = i38;
                                i29 = i6122;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                d5 = a6.d.d(bArr2, i38, a6Var2);
                                unsafe2.putObject(t12, j3, a6Var2.f17716c);
                                v11 = d5;
                                i46 = i27;
                                i48 = i26 | i57;
                                i45 = v11;
                                break;
                            }
                        case 12:
                            i25 = i13;
                            i19 = i58;
                            i38 = i60;
                            i14 = i51;
                            if (i52 != 0) {
                                int i61222 = i25;
                                i33 = i38;
                                i29 = i61222;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                d5 = a6.d.s(bArr2, i38, a6Var2);
                                i39 = a6Var2.f17714a;
                                unsafe2.putInt(t12, j3, i39);
                                v11 = d5;
                                i46 = i27;
                                i48 = i26 | i57;
                                i45 = v11;
                                break;
                            }
                        case 15:
                            i25 = i13;
                            i19 = i58;
                            i38 = i60;
                            i14 = i51;
                            if (i52 != 0) {
                                int i612222 = i25;
                                i33 = i38;
                                i29 = i612222;
                                i31 = i33;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                d5 = a6.d.s(bArr2, i38, a6Var2);
                                i39 = ca.d.b(a6Var2.f17714a);
                                unsafe2.putInt(t12, j3, i39);
                                v11 = d5;
                                i46 = i27;
                                i48 = i26 | i57;
                                i45 = v11;
                                break;
                            }
                        case 16:
                            if (i52 != 0) {
                                i14 = i51;
                                i31 = i60;
                                i29 = i13;
                                i15 = i31;
                                i43 = i29;
                                i16 = i27;
                                unsafe = unsafe2;
                                t11 = t12;
                                i48 = i26;
                                i17 = 0;
                                i18 = -1;
                                break;
                            } else {
                                v11 = a6.d.v(bArr2, i60, a6Var2);
                                i14 = i51;
                                i25 = i13;
                                i19 = i58;
                                unsafe2.putLong(t10, j3, ca.d.c(a6Var2.f17715b));
                                i46 = i27;
                                i48 = i26 | i57;
                                i45 = v11;
                                break;
                            }
                        default:
                            i29 = i13;
                            i31 = i60;
                            i14 = i51;
                            i15 = i31;
                            i43 = i29;
                            i16 = i27;
                            unsafe = unsafe2;
                            t11 = t12;
                            i48 = i26;
                            i17 = 0;
                            i18 = -1;
                            break;
                    }
                    i47 = i25;
                    i49 = i14;
                    i44 = i19;
                    i43 = 0;
                    i42 = -1;
                    i41 = i11;
                } else {
                    i14 = i51;
                    int i62 = i12;
                    i19 = 1048575;
                    int i63 = i13;
                    if (i55 != 27) {
                        if (i55 <= 49) {
                            i16 = i46;
                            i20 = i48;
                            i17 = 0;
                            unsafe = unsafe2;
                            i18 = -1;
                            i23 = i63;
                            i45 = L(t10, bArr, i62, i11, b10, i14, i52, i63, i54, i55, j3, a6Var);
                            t11 = t10;
                            if (i45 != i62) {
                                i21 = i23;
                            } else {
                                i24 = i45;
                                i21 = i23;
                                i15 = i24;
                                i43 = i21;
                                i48 = i20;
                            }
                        } else {
                            i22 = i62;
                            i16 = i46;
                            i20 = i48;
                            unsafe = unsafe2;
                            i23 = i63;
                            i17 = 0;
                            i18 = -1;
                            if (i55 != 50) {
                                i21 = i23;
                                t11 = t10;
                                i45 = J(t10, bArr, i22, i11, b10, i14, i52, i54, i55, j3, i23, a6Var);
                                if (i45 == i22) {
                                    i24 = i45;
                                    i15 = i24;
                                    i43 = i21;
                                    i48 = i20;
                                }
                            } else if (i52 == 2) {
                                g8Var.I(t10, i23, j3);
                                throw null;
                            }
                        }
                        i47 = i21;
                        i46 = i16;
                        i48 = i20;
                        bArr2 = bArr;
                        i41 = i11;
                        a6Var2 = a6Var;
                        t12 = t11;
                        i43 = i17;
                        i49 = i14;
                        i42 = i18;
                        unsafe2 = unsafe;
                        i44 = 1048575;
                        g8Var = this;
                    } else if (i52 == 2) {
                        h7 h7Var = (h7) unsafe2.getObject(t12, j3);
                        if (!h7Var.c()) {
                            int size = h7Var.size();
                            h7Var = h7Var.j(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t12, j3, h7Var);
                        }
                        i25 = i63;
                        i45 = a6.d.n(g8Var.m(i63), b10, bArr, i62, i11, h7Var, a6Var);
                        i48 = i48;
                        i46 = i46;
                        i47 = i25;
                        i49 = i14;
                        i44 = i19;
                        i43 = 0;
                        i42 = -1;
                        i41 = i11;
                    } else {
                        i22 = i62;
                        i23 = i63;
                        i16 = i46;
                        i20 = i48;
                        unsafe = unsafe2;
                        i17 = 0;
                        i18 = -1;
                    }
                    t11 = t10;
                    i24 = i22;
                    i21 = i23;
                    i15 = i24;
                    i43 = i21;
                    i48 = i20;
                }
            }
            i45 = a6.d.r(b10, bArr, i15, i11, A(t10), a6Var);
            i47 = i43;
            i46 = i16;
            bArr2 = bArr;
            i41 = i11;
            a6Var2 = a6Var;
            t12 = t11;
            i43 = i17;
            i49 = i14;
            i42 = i18;
            unsafe2 = unsafe;
            i44 = 1048575;
            g8Var = this;
        }
        int i64 = i48;
        Unsafe unsafe3 = unsafe2;
        T t13 = t12;
        if (i46 != i44) {
            unsafe3.putInt(t13, i46, i64);
        }
        if (i45 == i11) {
            return i45;
        }
        throw k7.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02be, code lost:
        if (r31.f17715b != 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c1, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c2, code lost:
        r13.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02c5, code lost:
        if (r1 >= r21) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02c7, code lost:
        r4 = a6.d.s(r19, r1, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02cd, code lost:
        if (r22 == r31.f17714a) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02d0, code lost:
        r1 = a6.d.v(r19, r4, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02d8, code lost:
        if (r31.f17715b == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02da, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02dc, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
        if (r4 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
        r13.add(s4.g6.p(r19, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
        if (r1 >= r21) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0193, code lost:
        r4 = a6.d.s(r19, r1, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
        if (r22 == r31.f17714a) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019c, code lost:
        r1 = a6.d.s(r19, r4, r31);
        r4 = r31.f17714a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a2, code lost:
        if (r4 < 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
        if (r4 > (r19.length - r1)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
        if (r4 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01aa, code lost:
        r13.add(s4.g6.f17877t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b4, code lost:
        throw s4.k7.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
        throw s4.k7.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0217 -> B:114:0x0203). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x021b -> B:113:0x01ff). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0248 -> B:134:0x024b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x025d -> B:129:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x02d8 -> B:167:0x02c1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x02da -> B:168:0x02c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01a8 -> B:84:0x0189). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01aa -> B:85:0x0191). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(T r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, s4.a6 r31) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g8.L(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, s4.a6):int");
    }

    public final int M(int i10) {
        return this.f17881a[i10 + 2];
    }

    public final int N(int i10, int i11) {
        int length = (this.f17881a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f17881a[i13];
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
    @Override // s4.o8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r9) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g8.a(java.lang.Object):int");
    }

    @Override // s4.o8
    public final T b() {
        return (T) ((b7) this.f17885e).r(4);
    }

    @Override // s4.o8
    public final void c(T t10) {
        int i10;
        int i11 = this.f17889i;
        while (true) {
            i10 = this.f17890j;
            if (i11 >= i10) {
                break;
            }
            long j3 = j(this.f17888h[i11]) & 1048575;
            Object j10 = i9.j(t10, j3);
            if (j10 != null) {
                ((y7) j10).f18208s = false;
                i9.r(t10, j3, j10);
            }
            i11++;
        }
        int length = this.f17888h.length;
        while (i10 < length) {
            this.f17891k.a(t10, this.f17888h[i10]);
            i10++;
        }
        this.f17892l.g(t10);
        if (this.f17886f) {
            this.f17893m.b(t10);
        }
    }

    @Override // s4.o8
    public final void d(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f17881a.length; i10 += 3) {
            int j3 = j(i10);
            long j10 = 1048575 & j3;
            int i11 = this.f17881a[i10];
            switch ((j3 >>> 20) & 255) {
                case 0:
                    if (u(t11, i10)) {
                        i9.n(t10, j10, i9.e(t11, j10));
                        r(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (u(t11, i10)) {
                        i9.o(t10, j10, i9.f(t11, j10));
                        r(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.q(t10, j10, i9.h(t11, j10));
                    r(t10, i10);
                    break;
                case 3:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.q(t10, j10, i9.h(t11, j10));
                    r(t10, i10);
                    break;
                case 4:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.p(t10, j10, i9.g(t11, j10));
                    r(t10, i10);
                    break;
                case 5:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.q(t10, j10, i9.h(t11, j10));
                    r(t10, i10);
                    break;
                case 6:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.p(t10, j10, i9.g(t11, j10));
                    r(t10, i10);
                    break;
                case 7:
                    if (u(t11, i10)) {
                        i9.m(t10, j10, i9.v(t11, j10));
                        r(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.r(t10, j10, i9.j(t11, j10));
                    r(t10, i10);
                    break;
                case 9:
                case 17:
                    p(t10, t11, i10);
                    break;
                case 10:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.r(t10, j10, i9.j(t11, j10));
                    r(t10, i10);
                    break;
                case 11:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.p(t10, j10, i9.g(t11, j10));
                    r(t10, i10);
                    break;
                case 12:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.p(t10, j10, i9.g(t11, j10));
                    r(t10, i10);
                    break;
                case 13:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.p(t10, j10, i9.g(t11, j10));
                    r(t10, i10);
                    break;
                case 14:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.q(t10, j10, i9.h(t11, j10));
                    r(t10, i10);
                    break;
                case 15:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.p(t10, j10, i9.g(t11, j10));
                    r(t10, i10);
                    break;
                case 16:
                    if (!u(t11, i10)) {
                        break;
                    }
                    i9.q(t10, j10, i9.h(t11, j10));
                    r(t10, i10);
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
                    this.f17891k.b(t10, t11, j10);
                    break;
                case 50:
                    Class<?> cls = p8.f18060a;
                    i9.r(t10, j10, z7.b(i9.j(t10, j10), i9.j(t11, j10)));
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
                    if (!v(t11, i11, i10)) {
                        break;
                    }
                    i9.r(t10, j10, i9.j(t11, j10));
                    s(t10, i11, i10);
                    break;
                case 60:
                case 68:
                    q(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!v(t11, i11, i10)) {
                        break;
                    }
                    i9.r(t10, j10, i9.j(t11, j10));
                    s(t10, i11, i10);
                    break;
            }
        }
        z8<?, ?> z8Var = this.f17892l;
        Class<?> cls2 = p8.f18060a;
        z8Var.h(t10, z8Var.d(z8Var.c(t10), z8Var.c(t11)));
        if (!this.f17886f) {
            return;
        }
        this.f17893m.a(t11);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.o8
    public final boolean e(T t10) {
        boolean z10;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            boolean z11 = true;
            if (i10 >= this.f17889i) {
                if (!this.f17886f) {
                    return true;
                }
                this.f17893m.a(t10);
                throw null;
            }
            int i13 = this.f17888h[i10];
            int i14 = this.f17881a[i13];
            int j3 = j(i13);
            int i15 = this.f17881a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i11 = f17880o.getInt(t10, i16);
                }
                i12 = i16;
            }
            if ((268435456 & j3) != 0) {
                if (i12 == 1048575) {
                    z10 = u(t10, i13);
                } else {
                    z10 = (i11 & i17) != 0;
                }
                if (!z10) {
                    return false;
                }
            }
            int i18 = (j3 >>> 20) & 255;
            if (i18 != 9 && i18 != 17) {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (v(t10, i14, i13) && !m(i13).e(i9.j(t10, j3 & 1048575))) {
                            return false;
                        }
                    } else if (i18 != 49) {
                        if (i18 == 50 && !((y7) i9.j(t10, j3 & 1048575)).isEmpty()) {
                            w7 w7Var = (w7) n(i13);
                            throw null;
                        }
                    }
                }
                List list = (List) i9.j(t10, j3 & 1048575);
                if (!list.isEmpty()) {
                    o8 m10 = m(i13);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!m10.e(list.get(i19))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else {
                if (i12 == 1048575) {
                    z11 = u(t10, i13);
                } else if ((i11 & i17) == 0) {
                    z11 = false;
                }
                if (z11 && !m(i13).e(i9.j(t10, j3 & 1048575))) {
                    return false;
                }
            }
            i10++;
        }
    }

    @Override // s4.o8
    public final void f(T t10, byte[] bArr, int i10, int i11, a6 a6Var) {
        if (this.f17887g) {
            K(t10, bArr, i10, i11, a6Var);
        } else {
            z(t10, bArr, i10, i11, 0, a6Var);
        }
    }

    @Override // s4.o8
    public final boolean g(T t10, T t11) {
        int length = this.f17881a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int j3 = j(i10);
            long j10 = j3 & 1048575;
            switch ((j3 >>> 20) & 255) {
                case 0:
                    if (t(t10, t11, i10) && Double.doubleToLongBits(i9.e(t10, j10)) == Double.doubleToLongBits(i9.e(t11, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (t(t10, t11, i10) && Float.floatToIntBits(i9.f(t10, j10)) == Float.floatToIntBits(i9.f(t11, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (t(t10, t11, i10) && i9.h(t10, j10) == i9.h(t11, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (t(t10, t11, i10) && i9.h(t10, j10) == i9.h(t11, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (t(t10, t11, i10) && i9.g(t10, j10) == i9.g(t11, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (t(t10, t11, i10) && i9.h(t10, j10) == i9.h(t11, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (t(t10, t11, i10) && i9.g(t10, j10) == i9.g(t11, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (t(t10, t11, i10) && i9.v(t10, j10) == i9.v(t11, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (t(t10, t11, i10) && p8.a(i9.j(t10, j10), i9.j(t11, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (t(t10, t11, i10) && p8.a(i9.j(t10, j10), i9.j(t11, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (t(t10, t11, i10) && p8.a(i9.j(t10, j10), i9.j(t11, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (t(t10, t11, i10) && i9.g(t10, j10) == i9.g(t11, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (t(t10, t11, i10) && i9.g(t10, j10) == i9.g(t11, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (t(t10, t11, i10) && i9.g(t10, j10) == i9.g(t11, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (t(t10, t11, i10) && i9.h(t10, j10) == i9.h(t11, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (t(t10, t11, i10) && i9.g(t10, j10) == i9.g(t11, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (t(t10, t11, i10) && i9.h(t10, j10) == i9.h(t11, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (t(t10, t11, i10) && p8.a(i9.j(t10, j10), i9.j(t11, j10))) {
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
                    if (!p8.a(i9.j(t10, j10), i9.j(t11, j10))) {
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
                    long M = M(i10) & 1048575;
                    if (i9.g(t10, M) == i9.g(t11, M) && p8.a(i9.j(t10, j10), i9.j(t11, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.f17892l.c(t10).equals(this.f17892l.c(t11))) {
            return false;
        }
        if (!this.f17886f) {
            return true;
        }
        this.f17893m.a(t10);
        this.f17893m.a(t11);
        throw null;
    }

    @Override // s4.o8
    public final int h(T t10) {
        return this.f17887g ? G(t10) : F(t10);
    }

    @Override // s4.o8
    public final void i(T t10, l6 l6Var) {
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
        if (!this.f17887g) {
            x(t10, l6Var);
        } else if (this.f17886f) {
            this.f17893m.a(t10);
            throw null;
        } else {
            int length = this.f17881a.length;
            for (int i16 = 0; i16 < length; i16 += 3) {
                int j14 = j(i16);
                int[] iArr = this.f17881a;
                int i17 = iArr[i16];
                switch ((j14 >>> 20) & 255) {
                    case 0:
                        if (u(t10, i16)) {
                            d5 = i9.e(t10, j14 & 1048575);
                            l6Var.g(i17, d5);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (u(t10, i16)) {
                            f10 = i9.f(t10, j14 & 1048575);
                            l6Var.k(i17, f10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (u(t10, i16)) {
                            j3 = i9.h(t10, j14 & 1048575);
                            l6Var.n(i17, j3);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (u(t10, i16)) {
                            j10 = i9.h(t10, j14 & 1048575);
                            l6Var.d(i17, j10);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (u(t10, i16)) {
                            i10 = i9.g(t10, j14 & 1048575);
                            l6Var.m(i17, i10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (u(t10, i16)) {
                            j11 = i9.h(t10, j14 & 1048575);
                            l6Var.j(i17, j11);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (u(t10, i16)) {
                            i11 = i9.g(t10, j14 & 1048575);
                            l6Var.i(i17, i11);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (u(t10, i16)) {
                            z10 = i9.v(t10, j14 & 1048575);
                            l6Var.e(i17, z10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!u(t10, i16)) {
                            break;
                        }
                        y(i17, i9.j(t10, j14 & 1048575), l6Var);
                        break;
                    case 9:
                        if (!u(t10, i16)) {
                            break;
                        }
                        l6Var.o(i17, i9.j(t10, j14 & 1048575), m(i16));
                        break;
                    case 10:
                        if (!u(t10, i16)) {
                            break;
                        }
                        l6Var.f(i17, (g6) i9.j(t10, j14 & 1048575));
                        break;
                    case 11:
                        if (u(t10, i16)) {
                            i12 = i9.g(t10, j14 & 1048575);
                            l6Var.c(i17, i12);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (u(t10, i16)) {
                            i13 = i9.g(t10, j14 & 1048575);
                            l6Var.h(i17, i13);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (u(t10, i16)) {
                            i14 = i9.g(t10, j14 & 1048575);
                            l6Var.p(i17, i14);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (u(t10, i16)) {
                            j12 = i9.h(t10, j14 & 1048575);
                            l6Var.q(i17, j12);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (u(t10, i16)) {
                            i15 = i9.g(t10, j14 & 1048575);
                            l6Var.a(i17, i15);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (u(t10, i16)) {
                            j13 = i9.h(t10, j14 & 1048575);
                            l6Var.b(i17, j13);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!u(t10, i16)) {
                            break;
                        }
                        l6Var.l(i17, i9.j(t10, j14 & 1048575), m(i16));
                        break;
                    case 18:
                        p8.d(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 19:
                        p8.h(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 20:
                        p8.k(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 21:
                        p8.s(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 22:
                        p8.j(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 23:
                        p8.g(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 24:
                        p8.f(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 25:
                        p8.b(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 26:
                        p8.q(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var);
                        break;
                    case 27:
                        p8.l(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, m(i16));
                        break;
                    case 28:
                        p8.c(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var);
                        break;
                    case 29:
                        p8.r(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 30:
                        p8.e(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 31:
                        p8.m(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 32:
                        p8.n(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 33:
                        p8.o(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 34:
                        p8.p(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, false);
                        break;
                    case 35:
                        p8.d(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 36:
                        p8.h(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 37:
                        p8.k(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 38:
                        p8.s(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 39:
                        p8.j(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 40:
                        p8.g(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 41:
                        p8.f(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 42:
                        p8.b(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 43:
                        p8.r(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 44:
                        p8.e(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 45:
                        p8.m(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 46:
                        p8.n(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 47:
                        p8.o(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 48:
                        p8.p(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, true);
                        break;
                    case 49:
                        p8.i(iArr[i16], (List) i9.j(t10, j14 & 1048575), l6Var, m(i16));
                        break;
                    case 50:
                        if (i9.j(t10, j14 & 1048575) != null) {
                            w7 w7Var = (w7) n(i16);
                            throw null;
                        }
                        break;
                    case 51:
                        if (v(t10, i17, i16)) {
                            d5 = D(t10, j14 & 1048575);
                            l6Var.g(i17, d5);
                            break;
                        } else {
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 52 */:
                        if (v(t10, i17, i16)) {
                            f10 = E(t10, j14 & 1048575);
                            l6Var.k(i17, f10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (v(t10, i17, i16)) {
                            j3 = k(t10, j14 & 1048575);
                            l6Var.n(i17, j3);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (v(t10, i17, i16)) {
                            j10 = k(t10, j14 & 1048575);
                            l6Var.d(i17, j10);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (v(t10, i17, i16)) {
                            i10 = H(t10, j14 & 1048575);
                            l6Var.m(i17, i10);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (v(t10, i17, i16)) {
                            j11 = k(t10, j14 & 1048575);
                            l6Var.j(i17, j11);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (v(t10, i17, i16)) {
                            i11 = H(t10, j14 & 1048575);
                            l6Var.i(i17, i11);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (v(t10, i17, i16)) {
                            z10 = w(t10, j14 & 1048575);
                            l6Var.e(i17, z10);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!v(t10, i17, i16)) {
                            break;
                        }
                        y(i17, i9.j(t10, j14 & 1048575), l6Var);
                        break;
                    case 60:
                        if (!v(t10, i17, i16)) {
                            break;
                        }
                        l6Var.o(i17, i9.j(t10, j14 & 1048575), m(i16));
                        break;
                    case 61:
                        if (!v(t10, i17, i16)) {
                            break;
                        }
                        l6Var.f(i17, (g6) i9.j(t10, j14 & 1048575));
                        break;
                    case 62:
                        if (v(t10, i17, i16)) {
                            i12 = H(t10, j14 & 1048575);
                            l6Var.c(i17, i12);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (v(t10, i17, i16)) {
                            i13 = H(t10, j14 & 1048575);
                            l6Var.h(i17, i13);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (v(t10, i17, i16)) {
                            i14 = H(t10, j14 & 1048575);
                            l6Var.p(i17, i14);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (v(t10, i17, i16)) {
                            j12 = k(t10, j14 & 1048575);
                            l6Var.q(i17, j12);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (v(t10, i17, i16)) {
                            i15 = H(t10, j14 & 1048575);
                            l6Var.a(i17, i15);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (v(t10, i17, i16)) {
                            j13 = k(t10, j14 & 1048575);
                            l6Var.b(i17, j13);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!v(t10, i17, i16)) {
                            break;
                        }
                        l6Var.l(i17, i9.j(t10, j14 & 1048575), m(i16));
                        break;
                }
            }
            z8<?, ?> z8Var = this.f17892l;
            z8Var.i(z8Var.c(t10), l6Var);
        }
    }

    public final int j(int i10) {
        return this.f17881a[i10 + 1];
    }

    public final e7 l(int i10) {
        int i11 = i10 / 3;
        return (e7) this.f17882b[i11 + i11 + 1];
    }

    public final o8 m(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f17882b;
        o8 o8Var = (o8) objArr[i12];
        if (o8Var != null) {
            return o8Var;
        }
        o8<T> a10 = l8.f17974c.a((Class) objArr[i12 + 1]);
        this.f17882b[i12] = a10;
        return a10;
    }

    public final Object n(int i10) {
        int i11 = i10 / 3;
        return this.f17882b[i11 + i11];
    }

    public final void p(T t10, T t11, int i10) {
        long j3 = j(i10) & 1048575;
        if (!u(t11, i10)) {
            return;
        }
        Object j10 = i9.j(t10, j3);
        Object j11 = i9.j(t11, j3);
        if (j10 != null && j11 != null) {
            j11 = i7.c(j10, j11);
        } else if (j11 == null) {
            return;
        }
        i9.r(t10, j3, j11);
        r(t10, i10);
    }

    public final void q(T t10, T t11, int i10) {
        int j3 = j(i10);
        int i11 = this.f17881a[i10];
        long j10 = j3 & 1048575;
        if (!v(t11, i11, i10)) {
            return;
        }
        Object j11 = v(t10, i11, i10) ? i9.j(t10, j10) : null;
        Object j12 = i9.j(t11, j10);
        if (j11 != null && j12 != null) {
            j12 = i7.c(j11, j12);
        } else if (j12 == null) {
            return;
        }
        i9.r(t10, j10, j12);
        s(t10, i11, i10);
    }

    public final void r(T t10, int i10) {
        int M = M(i10);
        long j3 = 1048575 & M;
        if (j3 == 1048575) {
            return;
        }
        i9.p(t10, j3, (1 << (M >>> 20)) | i9.g(t10, j3));
    }

    public final void s(T t10, int i10, int i11) {
        i9.p(t10, M(i11) & 1048575, i10);
    }

    public final boolean t(T t10, T t11, int i10) {
        return u(t10, i10) == u(t11, i10);
    }

    public final boolean u(T t10, int i10) {
        int M = M(i10);
        long j3 = M & 1048575;
        if (j3 != 1048575) {
            return (i9.g(t10, j3) & (1 << (M >>> 20))) != 0;
        }
        int j10 = j(i10);
        long j11 = j10 & 1048575;
        switch ((j10 >>> 20) & 255) {
            case 0:
                return i9.e(t10, j11) != 0.0d;
            case 1:
                return i9.f(t10, j11) != 0.0f;
            case 2:
                return i9.h(t10, j11) != 0;
            case 3:
                return i9.h(t10, j11) != 0;
            case 4:
                return i9.g(t10, j11) != 0;
            case 5:
                return i9.h(t10, j11) != 0;
            case 6:
                return i9.g(t10, j11) != 0;
            case 7:
                return i9.v(t10, j11);
            case 8:
                Object j12 = i9.j(t10, j11);
                if (j12 instanceof String) {
                    return !((String) j12).isEmpty();
                } else if (!(j12 instanceof g6)) {
                    throw new IllegalArgumentException();
                } else {
                    return !g6.f17877t.equals(j12);
                }
            case 9:
                return i9.j(t10, j11) != null;
            case 10:
                return !g6.f17877t.equals(i9.j(t10, j11));
            case 11:
                return i9.g(t10, j11) != 0;
            case 12:
                return i9.g(t10, j11) != 0;
            case 13:
                return i9.g(t10, j11) != 0;
            case 14:
                return i9.h(t10, j11) != 0;
            case 15:
                return i9.g(t10, j11) != 0;
            case 16:
                return i9.h(t10, j11) != 0;
            case 17:
                return i9.j(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(T t10, int i10, int i11) {
        return i9.g(t10, (long) (M(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void x(T t10, l6 l6Var) {
        int i10;
        boolean z10;
        if (this.f17886f) {
            this.f17893m.a(t10);
            throw null;
        }
        int length = this.f17881a.length;
        Unsafe unsafe = f17880o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int j3 = j(i13);
            int[] iArr = this.f17881a;
            int i15 = iArr[i13];
            int i16 = (j3 >>> 20) & 255;
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
            long j10 = j3 & i11;
            switch (i16) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.g(i15, i9.e(t10, j10));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.k(i15, i9.f(t10, j10));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.n(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.d(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.m(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.j(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.i(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.e(i15, i9.v(t10, j10));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        y(i15, unsafe.getObject(t10, j10), l6Var);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.o(i15, unsafe.getObject(t10, j10), m(i13));
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.f(i15, (g6) unsafe.getObject(t10, j10));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.c(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.h(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.p(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.q(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.a(i15, unsafe.getInt(t10, j10));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.b(i15, unsafe.getLong(t10, j10));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        l6Var.l(i15, unsafe.getObject(t10, j10), m(i13));
                        break;
                    }
                case 18:
                    p8.d(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 19:
                    p8.h(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 20:
                    p8.k(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 21:
                    p8.s(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 22:
                    p8.j(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 23:
                    p8.g(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 24:
                    p8.f(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 25:
                    p8.b(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 26:
                    p8.q(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var);
                    break;
                case 27:
                    p8.l(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, m(i13));
                    break;
                case 28:
                    p8.c(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var);
                    break;
                case 29:
                    z10 = false;
                    p8.r(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 30:
                    z10 = false;
                    p8.e(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 31:
                    z10 = false;
                    p8.m(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 32:
                    z10 = false;
                    p8.n(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 33:
                    z10 = false;
                    p8.o(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 34:
                    z10 = false;
                    p8.p(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, false);
                    break;
                case 35:
                    p8.d(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 36:
                    p8.h(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 37:
                    p8.k(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 38:
                    p8.s(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 39:
                    p8.j(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 40:
                    p8.g(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 41:
                    p8.f(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 42:
                    p8.b(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 43:
                    p8.r(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 44:
                    p8.e(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 45:
                    p8.m(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 46:
                    p8.n(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 47:
                    p8.o(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 48:
                    p8.p(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, true);
                    break;
                case 49:
                    p8.i(this.f17881a[i13], (List) unsafe.getObject(t10, j10), l6Var, m(i13));
                    break;
                case 50:
                    if (unsafe.getObject(t10, j10) != null) {
                        w7 w7Var = (w7) n(i13);
                        throw null;
                    }
                    break;
                case 51:
                    if (v(t10, i15, i13)) {
                        l6Var.g(i15, D(t10, j10));
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                    if (v(t10, i15, i13)) {
                        l6Var.k(i15, E(t10, j10));
                    }
                    break;
                case 53:
                    if (v(t10, i15, i13)) {
                        l6Var.n(i15, k(t10, j10));
                    }
                    break;
                case 54:
                    if (v(t10, i15, i13)) {
                        l6Var.d(i15, k(t10, j10));
                    }
                    break;
                case 55:
                    if (v(t10, i15, i13)) {
                        l6Var.m(i15, H(t10, j10));
                    }
                    break;
                case 56:
                    if (v(t10, i15, i13)) {
                        l6Var.j(i15, k(t10, j10));
                    }
                    break;
                case 57:
                    if (v(t10, i15, i13)) {
                        l6Var.i(i15, H(t10, j10));
                    }
                    break;
                case 58:
                    if (v(t10, i15, i13)) {
                        l6Var.e(i15, w(t10, j10));
                    }
                    break;
                case 59:
                    if (v(t10, i15, i13)) {
                        y(i15, unsafe.getObject(t10, j10), l6Var);
                    }
                    break;
                case 60:
                    if (v(t10, i15, i13)) {
                        l6Var.o(i15, unsafe.getObject(t10, j10), m(i13));
                    }
                    break;
                case 61:
                    if (v(t10, i15, i13)) {
                        l6Var.f(i15, (g6) unsafe.getObject(t10, j10));
                    }
                    break;
                case 62:
                    if (v(t10, i15, i13)) {
                        l6Var.c(i15, H(t10, j10));
                    }
                    break;
                case 63:
                    if (v(t10, i15, i13)) {
                        l6Var.h(i15, H(t10, j10));
                    }
                    break;
                case 64:
                    if (v(t10, i15, i13)) {
                        l6Var.p(i15, H(t10, j10));
                    }
                    break;
                case 65:
                    if (v(t10, i15, i13)) {
                        l6Var.q(i15, k(t10, j10));
                    }
                    break;
                case 66:
                    if (v(t10, i15, i13)) {
                        l6Var.a(i15, H(t10, j10));
                    }
                    break;
                case 67:
                    if (v(t10, i15, i13)) {
                        l6Var.b(i15, k(t10, j10));
                    }
                    break;
                case 68:
                    if (v(t10, i15, i13)) {
                        l6Var.l(i15, unsafe.getObject(t10, j10), m(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        z8<?, ?> z8Var = this.f17892l;
        z8Var.i(z8Var.c(t10), l6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0495, code lost:
        if (r5 == 1048575) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0497, code lost:
        r29.putInt(r11, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x049d, code lost:
        r3 = r14.f17889i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04a1, code lost:
        if (r3 >= r14.f17890j) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04a3, code lost:
        r4 = r14.f17888h[r3];
        r5 = r14.f17881a[r4];
        r5 = s4.i9.j(r11, r14.j(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04b5, code lost:
        if (r5 != null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04bc, code lost:
        if (r14.l(r4) != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04be, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04c1, code lost:
        r5 = (s4.y7) r5;
        r0 = (s4.w7) r14.n(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04c9, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04cc, code lost:
        if (r1 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04ce, code lost:
        if (r0 != r36) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04d5, code lost:
        throw s4.k7.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04d6, code lost:
        if (r0 > r36) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04d8, code lost:
        if (r9 != r1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04da, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04df, code lost:
        throw s4.k7.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int z(T r33, byte[] r34, int r35, int r36, int r37, s4.a6 r38) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.g8.z(java.lang.Object, byte[], int, int, int, s4.a6):int");
    }
}
