package k7;

import androidx.activity.result.a;
import h7.b;
import h7.d;
import h7.e;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements d {

    /* renamed from: a */
    public static final /* synthetic */ g f5623a = new g();

    @Override // h7.a
    public final void a(Object obj, e eVar) {
        StringBuilder c10 = a.c("Couldn't find encoder for type ");
        c10.append(obj.getClass().getCanonicalName());
        throw new b(c10.toString());
    }
}
