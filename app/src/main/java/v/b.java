package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import u.d;
import u.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final ArrayList<d> f19687a = new ArrayList<>();

    /* renamed from: b */
    public a f19688b = new a();

    /* renamed from: c */
    public e f19689c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f19690a;

        /* renamed from: b */
        public int f19691b;

        /* renamed from: c */
        public int f19692c;

        /* renamed from: d */
        public int f19693d;

        /* renamed from: e */
        public int f19694e;

        /* renamed from: f */
        public int f19695f;

        /* renamed from: g */
        public int f19696g;

        /* renamed from: h */
        public boolean f19697h;

        /* renamed from: i */
        public boolean f19698i;

        /* renamed from: j */
        public int f19699j;
    }

    /* renamed from: v.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0141b {
    }

    public b(e eVar) {
        this.f19689c = eVar;
    }

    public final boolean a(AbstractC0141b abstractC0141b, d dVar, int i10) {
        a aVar = this.f19688b;
        int[] iArr = dVar.U;
        aVar.f19690a = iArr[0];
        aVar.f19691b = iArr[1];
        aVar.f19692c = dVar.r();
        this.f19688b.f19693d = dVar.k();
        a aVar2 = this.f19688b;
        aVar2.f19698i = false;
        aVar2.f19699j = i10;
        boolean z10 = aVar2.f19690a == 3;
        boolean z11 = aVar2.f19691b == 3;
        boolean z12 = z10 && dVar.Y > 0.0f;
        boolean z13 = z11 && dVar.Y > 0.0f;
        if (z12 && dVar.f18967t[0] == 4) {
            aVar2.f19690a = 1;
        }
        if (z13 && dVar.f18967t[1] == 4) {
            aVar2.f19691b = 1;
        }
        ((ConstraintLayout.b) abstractC0141b).b(dVar, aVar2);
        dVar.Q(this.f19688b.f19694e);
        dVar.L(this.f19688b.f19695f);
        a aVar3 = this.f19688b;
        dVar.E = aVar3.f19697h;
        dVar.I(aVar3.f19696g);
        a aVar4 = this.f19688b;
        aVar4.f19699j = 0;
        return aVar4.f19698i;
    }

    public final void b(e eVar, int i10, int i11, int i12) {
        int i13 = eVar.f18939d0;
        int i14 = eVar.f18941e0;
        eVar.O(0);
        eVar.N(0);
        eVar.Q(i11);
        eVar.L(i12);
        eVar.O(i13);
        eVar.N(i14);
        e eVar2 = this.f19689c;
        eVar2.f18975u0 = i10;
        eVar2.T();
    }

    public final void c(e eVar) {
        this.f19687a.clear();
        int size = eVar.f18988r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = eVar.f18988r0.get(i10);
            int[] iArr = dVar.U;
            if (iArr[0] == 3 || iArr[1] == 3) {
                this.f19687a.add(dVar);
            }
        }
        eVar.b0();
    }
}
