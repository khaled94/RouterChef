package m4;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cf implements ye {

    /* renamed from: s */
    public final ye[] f6808s;

    /* renamed from: t */
    public final ArrayList<ye> f6809t;

    /* renamed from: v */
    public xe f6811v;

    /* renamed from: w */
    public db f6812w;
    public bf y;

    /* renamed from: u */
    public final cb f6810u = new cb();

    /* renamed from: x */
    public int f6813x = -1;

    public cf(ye... yeVarArr) {
        this.f6808s = yeVarArr;
        this.f6809t = new ArrayList<>(Arrays.asList(yeVarArr));
    }

    @Override // m4.ye
    public final void a(we weVar) {
        ze zeVar = (ze) weVar;
        int i10 = 0;
        while (true) {
            ye[] yeVarArr = this.f6808s;
            if (i10 < yeVarArr.length) {
                yeVarArr[i10].a(zeVar.f16156s[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // m4.ye
    public final void b(na naVar, xe xeVar) {
        this.f6811v = xeVar;
        int i10 = 0;
        while (true) {
            ye[] yeVarArr = this.f6808s;
            if (i10 < yeVarArr.length) {
                yeVarArr[i10].b(naVar, new af(this, i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // m4.ye
    public final we d(int i10, eg egVar) {
        int length = this.f6808s.length;
        we[] weVarArr = new we[length];
        for (int i11 = 0; i11 < length; i11++) {
            weVarArr[i11] = this.f6808s[i11].d(i10, egVar);
        }
        return new ze(weVarArr);
    }

    @Override // m4.ye
    public final void g() {
        for (ye yeVar : this.f6808s) {
            yeVar.g();
        }
    }

    @Override // m4.ye
    public final void zza() {
        bf bfVar = this.y;
        if (bfVar == null) {
            for (ye yeVar : this.f6808s) {
                yeVar.zza();
            }
            return;
        }
        throw bfVar;
    }
}
