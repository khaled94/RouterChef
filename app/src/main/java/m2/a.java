package m2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import m4.ar0;
import m4.bp2;
import m4.dd;
import m4.dx1;
import m4.dz1;
import m4.es;
import m4.jo;
import m4.ls1;
import m4.mp0;
import m4.my1;
import m4.u90;
import m4.uz1;
import m4.vz1;
import m4.w51;
import m4.yr;
import m4.zo2;
import s4.ac;
import y4.d1;
import y4.e1;
import y4.f1;
import z7.m;

/* loaded from: classes.dex */
public class a implements ar0, d1, m {

    /* renamed from: s */
    public static final /* synthetic */ a f5945s = new a();

    /* renamed from: t */
    public static final w51 f5946t = new w51(1);

    /* renamed from: u */
    public static final /* synthetic */ a f5947u = new a();

    public static void a(Parcel parcel, int i10, boolean z10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void b(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeBundle(bundle);
        u(parcel, q10);
    }

    public static void d(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeByteArray(bArr);
        u(parcel, q10);
    }

    public static void e(Parcel parcel, int i10, float f10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeFloat(f10);
    }

    public static void f(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        u(parcel, q10);
    }

    public static void g(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    public static void i(Parcel parcel, int i10, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeIntArray(iArr);
        u(parcel, q10);
    }

    public static void j(Parcel parcel, int i10, long j3) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j3);
    }

    public static void k(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        u(parcel, q10);
    }

    public static void l(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeString(str);
        u(parcel, q10);
    }

    public static void m(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeStringArray(strArr);
        u(parcel, q10);
    }

    public static void n(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeStringList(list);
        u(parcel, q10);
    }

    public static void o(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, parcelable, i11);
            }
        }
        u(parcel, q10);
    }

    public static void p(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, parcelable, 0);
            }
        }
        u(parcel, q10);
    }

    public static int q(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int r(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    public static int s(dd ddVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return ddVar.q() + 1;
            case 7:
                return ddVar.t() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static uz1 t() {
        yr<Boolean> yrVar = es.C3;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return u90.f14296c;
        }
        return ((Boolean) joVar.f10148c.a(es.B3)).booleanValue() ? u90.f14294a : u90.f14298e;
    }

    public static void u(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean v(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof dx1) {
            collection = ((dx1) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            for (Object obj : collection) {
                z10 |= set.remove(obj);
            }
            return z10;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Executor w(Executor executor, my1 my1Var) {
        Objects.requireNonNull(executor);
        return executor == dz1.f7671s ? executor : new vz1(executor, my1Var);
    }

    public static boolean x(dd ddVar, bp2 bp2Var, int i10, zo2 zo2Var) {
        boolean z10;
        int s10;
        long w10 = ddVar.w();
        long j3 = w10 >>> 16;
        if (j3 != i10) {
            return false;
        }
        boolean z11 = (j3 & 1) == 1;
        int i11 = (int) ((w10 >> 12) & 15);
        int i12 = (int) ((w10 >> 8) & 15);
        int i13 = (int) (15 & (w10 >> 4));
        int i14 = (int) ((w10 >> 1) & 7);
        long j10 = w10 & 1;
        if (i13 <= 7) {
            if (i13 != bp2Var.f6593g - 1) {
                return false;
            }
        } else if (i13 > 10 || bp2Var.f6593g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == bp2Var.f6595i) || j10 == 1) {
            return false;
        }
        try {
            long y = ddVar.y();
            if (!z11) {
                y *= bp2Var.f6588b;
            }
            zo2Var.f16302a = y;
            z10 = true;
        } catch (NumberFormatException unused) {
            z10 = false;
        }
        if (!z10 || (s10 = s(ddVar, i11)) == -1 || s10 > bp2Var.f6588b) {
            return false;
        }
        int i15 = bp2Var.f6591e;
        if (i12 != 0) {
            if (i12 <= 11) {
                if (i12 != bp2Var.f6592f) {
                    return false;
                }
            } else if (i12 == 12) {
                if (ddVar.q() * 1000 != i15) {
                    return false;
                }
            } else if (i12 > 14) {
                return false;
            } else {
                int t10 = ddVar.t();
                if (i12 == 14) {
                    t10 *= 10;
                }
                if (t10 != i15) {
                    return false;
                }
            }
        }
        int q10 = ddVar.q();
        int i16 = ddVar.f7309b;
        byte[] bArr = (byte[]) ddVar.f7311d;
        int i17 = i16 - 1;
        int i18 = ls1.f10971a;
        int i19 = 0;
        for (int i20 = ddVar.f7309b; i20 < i17; i20++) {
            i19 = ls1.f10981k[i19 ^ (bArr[i20] & 255)];
        }
        return q10 == i19;
    }

    public static void y(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    @Override // z7.m
    public Object c() {
        return new LinkedHashSet();
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((mp0) obj).j();
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Boolean.valueOf(ac.f17729t.zza().b());
    }
}
