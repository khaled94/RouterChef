package b3;

import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import b3.b0;
import e3.a;
import java.util.ArrayList;
import q2.b;
import t2.j;
import t2.r;
import v6.d;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements b0.a, d.a {

    /* renamed from: s */
    public static final /* synthetic */ q f2536s = new q();

    @Override // b3.b0.a
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = b0.f2495x;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            r.a a10 = r.a();
            a10.a(cursor.getString(1));
            j.a aVar = (j.a) a10;
            aVar.f18532c = a.b(cursor.getInt(2));
            String string = cursor.getString(3);
            aVar.f18531b = string == null ? null : Base64.decode(string, 0);
            arrayList.add(aVar.b());
        }
        return arrayList;
    }

    @Override // v6.d.a
    public final Object b(JsonReader jsonReader) {
        return d.b(jsonReader);
    }
}
