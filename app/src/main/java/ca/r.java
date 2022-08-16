package ca;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r extends AbstractList<i> implements RandomAccess {

    /* renamed from: u */
    public static final /* synthetic */ int f2868u = 0;

    /* renamed from: s */
    public final i[] f2869s;

    /* renamed from: t */
    public final int[] f2870t;

    public r(i[] iVarArr, int[] iArr) {
        this.f2869s = iVarArr;
        this.f2870t = iArr;
    }

    public static void d(long j3, f fVar, int i10, List<i> list, int i11, int i12, List<Integer> list2) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar2;
        if (i11 < i12) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (list.get(i18).n() < i10) {
                    throw new AssertionError();
                }
            }
            i iVar = list.get(i11);
            i iVar2 = list.get(i12 - 1);
            if (i10 == iVar.n()) {
                int intValue = list2.get(i11).intValue();
                int i19 = i11 + 1;
                i13 = i19;
                i14 = intValue;
                iVar = list.get(i19);
            } else {
                i14 = -1;
                i13 = i11;
            }
            long j10 = 4;
            if (iVar.i(i10) != iVar2.i(i10)) {
                int i20 = 1;
                for (int i21 = i13 + 1; i21 < i12; i21++) {
                    if (list.get(i21 - 1).i(i10) != list.get(i21).i(i10)) {
                        i20++;
                    }
                }
                long j11 = j3 + ((int) (fVar.f2843t / 4)) + 2 + (i20 * 2);
                fVar.E0(i20);
                fVar.E0(i14);
                for (int i22 = i13; i22 < i12; i22++) {
                    byte i23 = list.get(i22).i(i10);
                    if (i22 == i13 || i23 != list.get(i22 - 1).i(i10)) {
                        fVar.E0(i23 & 255);
                    }
                }
                f fVar3 = new f();
                int i24 = i13;
                while (i24 < i12) {
                    byte i25 = list.get(i24).i(i10);
                    int i26 = i24 + 1;
                    int i27 = i26;
                    while (true) {
                        if (i27 >= i12) {
                            i16 = i12;
                            break;
                        } else if (i25 != list.get(i27).i(i10)) {
                            i16 = i27;
                            break;
                        } else {
                            i27++;
                        }
                    }
                    if (i26 == i16 && i10 + 1 == list.get(i24).n()) {
                        fVar.E0(list2.get(i24).intValue());
                        i17 = i16;
                        fVar2 = fVar3;
                    } else {
                        fVar.E0((int) ((((int) (fVar3.f2843t / j10)) + j11) * (-1)));
                        i17 = i16;
                        fVar2 = fVar3;
                        d(j11, fVar3, i10 + 1, list, i24, i16, list2);
                    }
                    fVar3 = fVar2;
                    i24 = i17;
                    j10 = 4;
                }
                f fVar4 = fVar3;
                fVar.q(fVar4, fVar4.f2843t);
                return;
            }
            int i28 = 0;
            int min = Math.min(iVar.n(), iVar2.n());
            for (int i29 = i10; i29 < min && iVar.i(i29) == iVar2.i(i29); i29++) {
                i28++;
            }
            long j12 = 1 + j3 + ((int) (fVar.f2843t / 4)) + 2 + i28;
            fVar.E0(-i28);
            fVar.E0(i14);
            int i30 = i10;
            while (true) {
                i15 = i10 + i28;
                if (i30 >= i15) {
                    break;
                }
                fVar.E0(iVar.i(i30) & 255);
                i30++;
            }
            if (i13 + 1 == i12) {
                if (i15 != list.get(i13).n()) {
                    throw new AssertionError();
                }
                fVar.E0(list2.get(i13).intValue());
                return;
            }
            f fVar5 = new f();
            fVar.E0((int) ((((int) (fVar5.f2843t / 4)) + j12) * (-1)));
            d(j12, fVar5, i15, list, i13, i12, list2);
            fVar.q(fVar5, fVar5.f2843t);
            return;
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f2869s[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2869s.length;
    }
}
