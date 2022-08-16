package m4;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class in2 {

    /* renamed from: d */
    public int f9705d;

    /* renamed from: e */
    public int f9706e;

    /* renamed from: f */
    public int f9707f;

    /* renamed from: b */
    public final hn2[] f9703b = new hn2[5];

    /* renamed from: a */
    public final ArrayList<hn2> f9702a = new ArrayList<>();

    /* renamed from: c */
    public int f9704c = -1;

    public final float a() {
        ArrayList<hn2> arrayList;
        if (this.f9704c != 0) {
            Collections.sort(this.f9702a, gn2.f8982s);
            this.f9704c = 0;
        }
        float f10 = this.f9706e * 0.5f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f9702a.size(); i11++) {
            hn2 hn2Var = this.f9702a.get(i11);
            i10 += hn2Var.f9389b;
            if (i10 >= f10) {
                return hn2Var.f9390c;
            }
        }
        if (this.f9702a.isEmpty()) {
            return Float.NaN;
        }
        return this.f9702a.get(arrayList.size() - 1).f9390c;
    }

    public final void b(int i10, float f10) {
        hn2 hn2Var;
        int i11;
        hn2 hn2Var2;
        int i12;
        if (this.f9704c != 1) {
            Collections.sort(this.f9702a, fn2.f8610s);
            this.f9704c = 1;
        }
        int i13 = this.f9707f;
        if (i13 > 0) {
            hn2[] hn2VarArr = this.f9703b;
            int i14 = i13 - 1;
            this.f9707f = i14;
            hn2Var = hn2VarArr[i14];
        } else {
            hn2Var = new hn2(null);
        }
        int i15 = this.f9705d;
        this.f9705d = i15 + 1;
        hn2Var.f9388a = i15;
        hn2Var.f9389b = i10;
        hn2Var.f9390c = f10;
        this.f9702a.add(hn2Var);
        int i16 = this.f9706e + i10;
        while (true) {
            this.f9706e = i16;
            while (true) {
                int i17 = this.f9706e;
                if (i17 <= 2000) {
                    return;
                }
                i11 = i17 - 2000;
                hn2Var2 = this.f9702a.get(0);
                i12 = hn2Var2.f9389b;
                if (i12 <= i11) {
                    this.f9706e -= i12;
                    this.f9702a.remove(0);
                    int i18 = this.f9707f;
                    if (i18 < 5) {
                        hn2[] hn2VarArr2 = this.f9703b;
                        this.f9707f = i18 + 1;
                        hn2VarArr2[i18] = hn2Var2;
                    }
                }
            }
            hn2Var2.f9389b = i12 - i11;
            i16 = this.f9706e - i11;
        }
    }
}
