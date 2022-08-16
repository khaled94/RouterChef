package g1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface j extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements j {

        /* renamed from: s */
        public static final /* synthetic */ int f4816s = 0;

        /* renamed from: g1.j$a$a */
        /* loaded from: classes.dex */
        public static class C0071a implements j {

            /* renamed from: s */
            public IBinder f4817s;

            public C0071a(IBinder iBinder) {
                this.f4817s = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4817s;
            }

            @Override // g1.j
            public final void v1(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.f4817s.transact(1, obtain, null, 1)) {
                        int i10 = a.f4816s;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static j w(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new C0071a(iBinder) : (j) queryLocalInterface;
        }
    }

    void v1(String[] strArr);
}
