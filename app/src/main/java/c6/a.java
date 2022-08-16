package c6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import r.g;

/* loaded from: classes.dex */
public final class a extends s0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0039a();

    /* renamed from: u */
    public final g<String, Bundle> f2813u;

    /* renamed from: c6.a$a */
    /* loaded from: classes.dex */
    public class C0039a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2813u = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f2813u.put(strArr[i10], bundleArr[i10]);
        }
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("ExtendableSavedState{");
        c10.append(Integer.toHexString(System.identityHashCode(this)));
        c10.append(" states=");
        c10.append(this.f2813u);
        c10.append("}");
        return c10.toString();
    }

    @Override // s0.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17592s, i10);
        int i11 = this.f2813u.f17201u;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = this.f2813u.h(i12);
            bundleArr[i12] = this.f2813u.k(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
