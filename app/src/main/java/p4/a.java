package p4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: s */
    public final IBinder f16947s;

    /* renamed from: t */
    public final String f16948t;

    public a(IBinder iBinder, String str) {
        this.f16947s = iBinder;
        this.f16948t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16947s;
    }
}
