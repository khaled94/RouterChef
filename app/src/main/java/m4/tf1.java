package m4;

import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n3.i1;

/* loaded from: classes.dex */
public final class tf1 implements eh1<Object> {

    /* renamed from: a */
    public final uz1 f14042a;

    /* renamed from: b */
    public final om1 f14043b;

    /* renamed from: c */
    public final PackageInfo f14044c;

    /* renamed from: d */
    public final i1 f14045d;

    public tf1(uz1 uz1Var, om1 om1Var, PackageInfo packageInfo, i1 i1Var) {
        this.f14042a = uz1Var;
        this.f14043b = om1Var;
        this.f14044c = packageInfo;
        this.f14045d = i1Var;
    }

    @Override // m4.eh1
    public final tz1<Object> a() {
        return this.f14042a.Z(new Callable() { // from class: m4.sf1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final tf1 tf1Var = tf1.this;
                final ArrayList arrayList = tf1Var.f14043b.f12206g;
                return arrayList == null ? qf1.f12834a : arrayList.isEmpty() ? rf1.f13265a : new dh1() { // from class: m4.pf1
                    @Override // m4.dh1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void h(java.lang.Object r11) {
                        /*
                            Method dump skipped, instructions count: 302
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: m4.pf1.h(java.lang.Object):void");
                    }
                };
            }
        });
    }
}
