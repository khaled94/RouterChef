package y4;

import android.os.Bundle;
import android.os.Parcel;
import d4.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import m4.hb;
import m4.oe;
import m4.pe2;
import m4.t61;
import m4.v3;
import m4.vu0;
import s4.g0;
import s4.h0;

/* loaded from: classes.dex */
public abstract class i1 extends g0 implements j1 {
    public i1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // s4.g0
    public final boolean w(int i10, Parcel parcel, Parcel parcel2) {
        Object obj;
        ArrayList arrayList = null;
        boolean z10 = false;
        switch (i10) {
            case 1:
                p pVar = (p) h0.a(parcel, p.CREATOR);
                k6 k6Var = (k6) h0.a(parcel, k6.CREATOR);
                h3 h3Var = (h3) this;
                Objects.requireNonNull(pVar, "null reference");
                h3Var.Z1(k6Var);
                h3Var.E1(new d3(h3Var, pVar, k6Var));
                parcel2.writeNoException();
                break;
            case 2:
                d6 d6Var = (d6) h0.a(parcel, d6.CREATOR);
                k6 k6Var2 = (k6) h0.a(parcel, k6.CREATOR);
                h3 h3Var2 = (h3) this;
                Objects.requireNonNull(d6Var, "null reference");
                h3Var2.Z1(k6Var2);
                h3Var2.E1(new t61(h3Var2, d6Var, k6Var2));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                k6 k6Var3 = (k6) h0.a(parcel, k6.CREATOR);
                h3 h3Var3 = (h3) this;
                h3Var3.Z1(k6Var3);
                h3Var3.E1(new vu0(h3Var3, k6Var3, 2, null));
                parcel2.writeNoException();
                break;
            case 5:
                p pVar2 = (p) h0.a(parcel, p.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                h3 h3Var4 = (h3) this;
                Objects.requireNonNull(pVar2, "null reference");
                m.e(readString);
                h3Var4.c0(readString, true);
                h3Var4.E1(new pe2(h3Var4, pVar2, readString));
                parcel2.writeNoException();
                break;
            case 6:
                k6 k6Var4 = (k6) h0.a(parcel, k6.CREATOR);
                h3 h3Var5 = (h3) this;
                h3Var5.Z1(k6Var4);
                h3Var5.E1(new oe(h3Var5, k6Var4, 5));
                parcel2.writeNoException();
                break;
            case 7:
                k6 k6Var5 = (k6) h0.a(parcel, k6.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                h3 h3Var6 = (h3) this;
                h3Var6.Z1(k6Var5);
                String str = k6Var5.f20535s;
                m.h(str);
                try {
                    List<f6> list = (List) ((FutureTask) h3Var6.f20483s.B().o(new f3(h3Var6, str))).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (f6 f6Var : list) {
                        if (z10 || !h6.V(f6Var.f20458c)) {
                            arrayList2.add(new d6(f6Var));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e10) {
                    h3Var6.f20483s.C().f20710x.c("Failed to get user properties. appId", s1.s(k6Var5.f20535s), e10);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                byte[] S1 = ((h3) this).S1((p) h0.a(parcel, p.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(S1);
                break;
            case 10:
                ((h3) this).z0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String p22 = ((h3) this).p2((k6) h0.a(parcel, k6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(p22);
                break;
            case 12:
                ((h3) this).x1((b) h0.a(parcel, b.CREATOR), (k6) h0.a(parcel, k6.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                b bVar = (b) h0.a(parcel, b.CREATOR);
                h3 h3Var7 = (h3) this;
                Objects.requireNonNull(bVar, "null reference");
                m.h(bVar.f20301u);
                m.e(bVar.f20299s);
                h3Var7.c0(bVar.f20299s, true);
                h3Var7.E1(new hb(h3Var7, new b(bVar), 3));
                parcel2.writeNoException();
                break;
            case 14:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ClassLoader classLoader = h0.f17902a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                obj = ((h3) this).a2(readString2, readString3, z10, (k6) h0.a(parcel, k6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                break;
            case 15:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ClassLoader classLoader2 = h0.f17902a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                obj = ((h3) this).d1(readString4, readString5, readString6, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                break;
            case 16:
                obj = ((h3) this).K3(parcel.readString(), parcel.readString(), (k6) h0.a(parcel, k6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                break;
            case 17:
                obj = ((h3) this).V1(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                break;
            case 18:
                ((h3) this).x2((k6) h0.a(parcel, k6.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                k6 k6Var6 = (k6) h0.a(parcel, k6.CREATOR);
                h3 h3Var8 = (h3) this;
                h3Var8.Z1(k6Var6);
                String str2 = k6Var6.f20535s;
                m.h(str2);
                h3Var8.E1(new v3(h3Var8, str2, (Bundle) h0.a(parcel, Bundle.CREATOR), 2));
                parcel2.writeNoException();
                break;
            case 20:
                ((h3) this).I1((k6) h0.a(parcel, k6.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
