package s0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: s */
    public final Parcelable f17592s;

    /* renamed from: t */
    public static final C0111a f17591t = new C0111a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: s0.a$a */
    /* loaded from: classes.dex */
    public class C0111a extends a {
    }

    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f17591t;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f17591t;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a() {
        this.f17592s = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f17592s = readParcelable == null ? f17591t : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f17592s = parcelable == f17591t ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17592s, i10);
    }
}
