package b3;

import android.database.Cursor;
import b3.b0;
import q2.b;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements b0.a {

    /* renamed from: s */
    public static final /* synthetic */ m f2530s = new m();

    @Override // b3.b0.a
    public final Object a(Object obj) {
        b bVar = b0.f2495x;
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }
}
