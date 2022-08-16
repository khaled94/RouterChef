package a0;

import androidx.cardview.widget.CardView;
import com.raouf.routerchef.R;
import q.b;
import s4.aa;
import u.c;
import u.d;
import u.e;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class a implements d1 {

    /* renamed from: s */
    public static final int[] f2s = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};

    /* renamed from: t */
    public static final int[] f3t = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};

    /* renamed from: u */
    public static final int[] f4u = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};

    /* renamed from: v */
    public static final int[] f5v = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};

    /* renamed from: w */
    public static final int[] f6w = {16843173, 16844052};

    /* renamed from: x */
    public static boolean[] f7x = new boolean[3];
    public static final int[] y = {16842755, 16842960, 16842961};

    /* renamed from: z */
    public static final int[] f8z = {16842755, 16842961};
    public static final /* synthetic */ a A = new a();

    public static void a(e eVar, s.e eVar2, d dVar) {
        dVar.f18960o = -1;
        dVar.p = -1;
        if (eVar.U[0] != 2 && dVar.U[0] == 4) {
            int i10 = dVar.J.f18922g;
            int r10 = eVar.r() - dVar.L.f18922g;
            c cVar = dVar.J;
            cVar.f18924i = eVar2.l(cVar);
            c cVar2 = dVar.L;
            cVar2.f18924i = eVar2.l(cVar2);
            eVar2.e(dVar.J.f18924i, i10);
            eVar2.e(dVar.L.f18924i, r10);
            dVar.f18960o = 2;
            dVar.f18933a0 = i10;
            int i11 = r10 - i10;
            dVar.W = i11;
            int i12 = dVar.f18939d0;
            if (i11 < i12) {
                dVar.W = i12;
            }
        }
        if (eVar.U[1] == 2 || dVar.U[1] != 4) {
            return;
        }
        int i13 = dVar.K.f18922g;
        int k10 = eVar.k() - dVar.M.f18922g;
        c cVar3 = dVar.K;
        cVar3.f18924i = eVar2.l(cVar3);
        c cVar4 = dVar.M;
        cVar4.f18924i = eVar2.l(cVar4);
        eVar2.e(dVar.K.f18924i, i13);
        eVar2.e(dVar.M.f18924i, k10);
        if (dVar.f18937c0 > 0 || dVar.f18949i0 == 8) {
            c cVar5 = dVar.N;
            cVar5.f18924i = eVar2.l(cVar5);
            eVar2.e(dVar.N.f18924i, dVar.f18937c0 + i13);
        }
        dVar.p = 2;
        dVar.f18935b0 = i13;
        int i14 = k10 - i13;
        dVar.X = i14;
        int i15 = dVar.f18941e0;
        if (i14 >= i15) {
            return;
        }
        dVar.X = i15;
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public b c(q.a aVar) {
        return (b) ((CardView.a) aVar).f1061a;
    }

    public float d(q.a aVar) {
        return c(aVar).f17018e;
    }

    public float e(q.a aVar) {
        return c(aVar).f17014a;
    }

    public void f(q.a aVar, float f10) {
        b c10 = c(aVar);
        CardView.a aVar2 = (CardView.a) aVar;
        boolean useCompatPadding = aVar2.f1062b.getUseCompatPadding();
        boolean a10 = aVar2.a();
        if (f10 != c10.f17018e || c10.f17019f != useCompatPadding || c10.f17020g != a10) {
            c10.f17018e = f10;
            c10.f17019f = useCompatPadding;
            c10.f17020g = a10;
            c10.c(null);
            c10.invalidateSelf();
        }
        if (!aVar2.f1062b.getUseCompatPadding()) {
            aVar2.b(0, 0, 0, 0);
            return;
        }
        float d5 = d(aVar);
        float e10 = e(aVar);
        int ceil = (int) Math.ceil(q.c.a(d5, e10, aVar2.a()));
        int ceil2 = (int) Math.ceil(q.c.b(d5, e10, aVar2.a()));
        aVar2.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().zza());
    }
}
