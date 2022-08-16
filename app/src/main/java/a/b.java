package a;

import a.a;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: s */
        public static final /* synthetic */ int f0s = 0;

        /* renamed from: a.b$a$a */
        /* loaded from: classes.dex */
        public static class C0001a implements b {

            /* renamed from: s */
            public IBinder f1s;

            public C0001a(IBinder iBinder) {
                this.f1s = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1s;
            }

            @Override // a.b
            public final boolean n3() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    boolean z10 = false;
                    this.f1s.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public final boolean t2(a.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder((a.AbstractBinderC0000a) aVar);
                    boolean z10 = false;
                    this.f1s.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    boolean n3();

    boolean t2(a.a aVar);
}
