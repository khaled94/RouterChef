package d4;

import android.os.Parcel;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import k4.a;
import n6.c;
import n6.e;
import p7.f;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements e {

    /* renamed from: s */
    public static final /* synthetic */ f1 f3872s = new f1();

    public static a b(Parcel parcel) {
        a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
        parcel.recycle();
        return c02;
    }

    @Override // n6.e
    public Object a(c cVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }
}
