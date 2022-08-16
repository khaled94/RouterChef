package m4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import k4.b;
import n3.s0;

/* loaded from: classes.dex */
public final class m91 implements l71<av0, ym1, o81> {

    /* renamed from: a */
    public final Context f11121a;

    /* renamed from: b */
    public final cu0 f11122b;

    /* renamed from: c */
    public final Executor f11123c;

    public m91(Context context, cu0 cu0Var, Executor executor) {
        this.f11121a = context;
        this.f11122b = cu0Var;
        this.f11123c = executor;
    }

    public static final boolean c(km1 km1Var, int i10) {
        return ((om1) km1Var.f10488a.f8363t).f12206g.contains(Integer.toString(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03dc  */
    @Override // m4.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.av0 a(m4.km1 r43, m4.cm1 r44, m4.h71<m4.ym1, m4.o81> r45) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.m91.a(m4.km1, m4.cm1, m4.h71):java.lang.Object");
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<ym1, o81> h71Var) {
        ym1 ym1Var = h71Var.f9129b;
        Context context = this.f11121a;
        jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
        String jSONObject = cm1Var.f7064w.toString();
        String j3 = s0.j(cm1Var.f7061t);
        o81 o81Var = h71Var.f9130c;
        om1 om1Var = (om1) km1Var.f10488a.f8363t;
        lu luVar = om1Var.f12208i;
        ArrayList<String> arrayList = om1Var.f12206g;
        Objects.requireNonNull(ym1Var);
        try {
            ym1Var.f15839a.H3(new b(context), jnVar, jSONObject, j3, o81Var, luVar, arrayList);
        } catch (Throwable th) {
            throw new pm1(th);
        }
    }
}
