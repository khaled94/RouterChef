package k4;

import android.os.IBinder;
import android.os.IInterface;
import r4.b;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: k4.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0085a extends b implements a {
        public AbstractBinderC0085a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a c0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder);
        }
    }
}
