package h2;

import android.content.Context;
import s4.a4;
import s4.n;
import s4.z;

/* loaded from: classes.dex */
public final class a0 implements z {

    /* renamed from: s */
    public Object f4956s;

    /* renamed from: t */
    public Object f4957t;

    public /* synthetic */ a0() {
    }

    public /* synthetic */ a0(Context context, h hVar) {
        this.f4956s = context;
        this.f4957t = new z(this, hVar);
    }

    public /* synthetic */ a0(a4 a4Var, String str) {
        this.f4956s = a4Var;
        this.f4957t = str;
    }

    @Override // s4.z
    public final a4 b(n nVar) {
        a4 a10 = ((a4) this.f4956s).a();
        a10.e((String) this.f4957t, nVar);
        return a10;
    }
}
