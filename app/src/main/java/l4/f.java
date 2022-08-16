package l4;

import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import r4.a;
import r4.c;

/* loaded from: classes.dex */
public final class f extends a {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final k4.a E1(k4.a aVar, String str, int i10, k4.a aVar2) {
        Parcel c02 = c0();
        c.b(c02, aVar);
        c02.writeString(str);
        c02.writeInt(i10);
        c.b(c02, aVar2);
        return f1.b(w(3, c02));
    }

    public final k4.a e0(k4.a aVar, String str, int i10, k4.a aVar2) {
        Parcel c02 = c0();
        c.b(c02, aVar);
        c02.writeString(str);
        c02.writeInt(i10);
        c.b(c02, aVar2);
        return f1.b(w(2, c02));
    }
}
