package r2;

import android.util.JsonReader;
import b3.b0;
import c3.a;
import r9.c;
import v6.d;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements b0.a, d.a, c {

    /* renamed from: s */
    public static final /* synthetic */ b f17232s = new b();

    /* renamed from: t */
    public static final /* synthetic */ b f17233t = new b();

    /* renamed from: u */
    public static final /* synthetic */ b f17234u = new b();

    @Override // b3.b0.a
    public final Object a(Object obj) {
        q2.b bVar = b0.f2495x;
        throw new a("Timed out while trying to acquire the lock.", (Throwable) obj);
    }

    @Override // v6.d.a
    public final Object b(JsonReader jsonReader) {
        return d.d(jsonReader);
    }
}
