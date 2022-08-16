package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.g0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* renamed from: s */
    public ArrayList<String> f1445s;

    /* renamed from: t */
    public ArrayList<String> f1446t;

    /* renamed from: u */
    public c[] f1447u;

    /* renamed from: v */
    public int f1448v;

    /* renamed from: w */
    public String f1449w;

    /* renamed from: x */
    public ArrayList<String> f1450x;
    public ArrayList<d> y;

    /* renamed from: z */
    public ArrayList<g0.k> f1451z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            return new i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i10) {
            return new i0[i10];
        }
    }

    public i0() {
        this.f1449w = null;
        this.f1450x = new ArrayList<>();
        this.y = new ArrayList<>();
    }

    public i0(Parcel parcel) {
        this.f1449w = null;
        this.f1450x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.f1445s = parcel.createStringArrayList();
        this.f1446t = parcel.createStringArrayList();
        this.f1447u = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f1448v = parcel.readInt();
        this.f1449w = parcel.readString();
        this.f1450x = parcel.createStringArrayList();
        this.y = parcel.createTypedArrayList(d.CREATOR);
        this.f1451z = parcel.createTypedArrayList(g0.k.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1445s);
        parcel.writeStringList(this.f1446t);
        parcel.writeTypedArray(this.f1447u, i10);
        parcel.writeInt(this.f1448v);
        parcel.writeString(this.f1449w);
        parcel.writeStringList(this.f1450x);
        parcel.writeTypedList(this.y);
        parcel.writeTypedList(this.f1451z);
    }
}
