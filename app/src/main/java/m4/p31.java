package m4;

import android.content.Context;
import d.a;

/* loaded from: classes.dex */
public final class p31 implements nd2<String> {

    /* renamed from: a */
    public final vd2<Context> f12402a;

    public p31(vd2<Context> vd2Var) {
        this.f12402a = vd2Var;
    }

    /* renamed from: b */
    public final String a() {
        String packageName = ((en1) this.f12402a).b().getPackageName();
        a.d(packageName);
        return packageName;
    }
}
