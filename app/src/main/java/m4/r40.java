package m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import e4.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import k4.a;
import k4.b;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class r40 extends a {
    public static final Parcelable.Creator<r40> CREATOR = new s40();

    /* renamed from: s */
    public final View f13136s;

    /* renamed from: t */
    public final Map<String, WeakReference<View>> f13137t;

    public r40(IBinder iBinder, IBinder iBinder2) {
        this.f13136s = (View) b.e0(a.AbstractBinderC0085a.c0(iBinder));
        this.f13137t = (Map) b.e0(a.AbstractBinderC0085a.c0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.f(parcel, 1, new b(this.f13136s));
        m2.a.f(parcel, 2, new b(this.f13137t));
        m2.a.u(parcel, q10);
    }
}
