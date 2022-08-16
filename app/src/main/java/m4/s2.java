package m4;

import java.util.List;

/* loaded from: classes.dex */
public final class s2 implements v91 {

    /* renamed from: s */
    public final Object f13492s;

    /* renamed from: t */
    public final Object f13493t;

    public /* synthetic */ s2() {
        ar1 ar1Var = new ar1();
        this.f13492s = ar1Var;
        this.f13493t = new i7(ar1Var, 4);
    }

    public /* synthetic */ s2(List list) {
        this.f13492s = list;
        this.f13493t = new mp2[list.size()];
    }

    public /* synthetic */ s2(fg2 fg2Var, String str) {
        this.f13492s = fg2Var;
        this.f13493t = str;
    }

    public final void a(long j3, dd ddVar) {
        l90.b(j3, ddVar, (mp2[]) this.f13493t);
    }

    public final void b(vo2 vo2Var, a3 a3Var) {
        for (int i10 = 0; i10 < ((mp2[]) this.f13493t).length; i10++) {
            a3Var.c();
            mp2 p = vo2Var.p(a3Var.a(), 3);
            t tVar = (t) ((List) this.f13492s).get(i10);
            String str = tVar.f13871k;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            r01.g(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = tVar.f13861a;
            if (str2 == null) {
                str2 = a3Var.b();
            }
            kq2 kq2Var = new kq2();
            kq2Var.f10533a = str2;
            kq2Var.f10542j = str;
            kq2Var.f10536d = tVar.f13864d;
            kq2Var.f10535c = tVar.f13863c;
            kq2Var.B = tVar.C;
            kq2Var.f10544l = tVar.f13873m;
            p.f(new t(kq2Var));
            ((mp2[]) this.f13493t)[i10] = p;
        }
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }
}
