package d4;

import a4.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import d4.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0 extends g0 {

    /* renamed from: g */
    public final IBinder f3916g;

    /* renamed from: h */
    public final /* synthetic */ b f3917h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f3917h = bVar;
        this.f3916g = iBinder;
    }

    @Override // d4.g0
    public final void d(b bVar) {
        b.AbstractC0056b abstractC0056b = this.f3917h.p;
        if (abstractC0056b != null) {
            abstractC0056b.c0(bVar);
        }
        Objects.requireNonNull(this.f3917h);
        System.currentTimeMillis();
    }

    @Override // d4.g0
    public final boolean e() {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f3916g;
            m.h(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f3917h.w().equals(interfaceDescriptor)) {
            String w10 = this.f3917h.w();
            str = i0.b.a(new StringBuilder(String.valueOf(w10).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", w10, " vs. ", interfaceDescriptor);
            Log.w("GmsClient", str);
            return false;
        }
        IInterface o10 = this.f3917h.o(this.f3916g);
        if (o10 == null) {
            return false;
        }
        if (!b.B(this.f3917h, 2, 4, o10) && !b.B(this.f3917h, 3, 4, o10)) {
            return false;
        }
        b bVar = this.f3917h;
        bVar.f3823t = null;
        b.a aVar = bVar.f3819o;
        if (aVar != null) {
            aVar.e0();
        }
        return true;
    }
}
