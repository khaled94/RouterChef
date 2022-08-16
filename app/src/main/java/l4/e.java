package l4;

import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import r4.a;
import r4.c;

/* loaded from: classes.dex */
public final class e extends a {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final k4.a E1(k4.a aVar, String str, int i10, k4.a aVar2) {
        Parcel c02 = c0();
        c.b(c02, aVar);
        c02.writeString(str);
        c02.writeInt(i10);
        c.b(c02, aVar2);
        return f1.b(w(8, c02));
    }

    public final k4.a Z1(k4.a aVar, String str, int i10) {
        Parcel c02 = c0();
        c.b(c02, aVar);
        c02.writeString(str);
        c02.writeInt(i10);
        return f1.b(w(4, c02));
    }

    public final k4.a e0(k4.a aVar, String str, int i10) {
        Parcel c02 = c0();
        c.b(c02, aVar);
        c02.writeString(str);
        c02.writeInt(i10);
        return f1.b(w(2, c02));
    }

    public final k4.a v2(k4.a aVar, String str, boolean z10, long j3) {
        Parcel c02 = c0();
        c.b(c02, aVar);
        c02.writeString(str);
        c02.writeInt(z10 ? 1 : 0);
        c02.writeLong(j3);
        return f1.b(w(7, c02));
    }
}
