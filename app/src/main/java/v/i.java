package v;

import java.util.ArrayList;
import u.c;
import u.d;
import u.f;
import u.h;

/* loaded from: classes.dex */
public final class i {
    public static o a(d dVar, int i10, ArrayList<o> arrayList, o oVar) {
        c cVar;
        int i11;
        int i12 = i10 == 0 ? dVar.f18962p0 : dVar.f18964q0;
        int i13 = 0;
        if (i12 != -1 && (oVar == null || i12 != oVar.f19731b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.f19731b == i12) {
                    if (oVar != null) {
                        oVar.d(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i12 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= hVar.f18987s0) {
                        i11 = -1;
                        break;
                    }
                    d dVar2 = hVar.f18986r0[i15];
                    if ((i10 == 0 && (i11 = dVar2.f18962p0) != -1) || (i10 == 1 && (i11 = dVar2.f18964q0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i11 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.f19731b == i11) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(dVar)) {
            if (dVar instanceof f) {
                f fVar = (f) dVar;
                c cVar2 = fVar.f18983u0;
                if (fVar.f18984v0 == 0) {
                    i13 = 1;
                }
                cVar2.b(i13, arrayList, oVar);
            }
            if (i10 == 0) {
                dVar.f18962p0 = oVar.f19731b;
                dVar.J.b(i10, arrayList, oVar);
                cVar = dVar.L;
            } else {
                dVar.f18964q0 = oVar.f19731b;
                dVar.K.b(i10, arrayList, oVar);
                dVar.N.b(i10, arrayList, oVar);
                cVar = dVar.M;
            }
            cVar.b(i10, arrayList, oVar);
            dVar.Q.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f19731b) {
                return oVar;
            }
        }
        return null;
    }

    public static boolean c(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }
}
