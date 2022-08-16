package j7;

import h7.b;
import h7.d;
import h7.e;
import j7.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements d {

    /* renamed from: a */
    public static final /* synthetic */ a f5476a = new a();

    @Override // h7.a
    public final void a(Object obj, e eVar) {
        e.a aVar = e.f5480e;
        StringBuilder c10 = androidx.activity.result.a.c("Couldn't find encoder for type ");
        c10.append(obj.getClass().getCanonicalName());
        throw new b(c10.toString());
    }
}
