package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new a();
    public final boolean A;
    public final Bundle B;
    public final boolean C;
    public final int D;
    public Bundle E;

    /* renamed from: s */
    public final String f1466s;

    /* renamed from: t */
    public final String f1467t;

    /* renamed from: u */
    public final boolean f1468u;

    /* renamed from: v */
    public final int f1469v;

    /* renamed from: w */
    public final int f1470w;

    /* renamed from: x */
    public final String f1471x;
    public final boolean y;

    /* renamed from: z */
    public final boolean f1472z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<l0> {
        @Override // android.os.Parcelable.Creator
        public final l0 createFromParcel(Parcel parcel) {
            return new l0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l0[] newArray(int i10) {
            return new l0[i10];
        }
    }

    public l0(Parcel parcel) {
        this.f1466s = parcel.readString();
        this.f1467t = parcel.readString();
        boolean z10 = true;
        this.f1468u = parcel.readInt() != 0;
        this.f1469v = parcel.readInt();
        this.f1470w = parcel.readInt();
        this.f1471x = parcel.readString();
        this.y = parcel.readInt() != 0;
        this.f1472z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readBundle();
        this.C = parcel.readInt() == 0 ? false : z10;
        this.E = parcel.readBundle();
        this.D = parcel.readInt();
    }

    public l0(o oVar) {
        this.f1466s = oVar.getClass().getName();
        this.f1467t = oVar.f1520w;
        this.f1468u = oVar.E;
        this.f1469v = oVar.N;
        this.f1470w = oVar.O;
        this.f1471x = oVar.P;
        this.y = oVar.S;
        this.f1472z = oVar.D;
        this.A = oVar.R;
        this.B = oVar.f1521x;
        this.C = oVar.Q;
        this.D = oVar.f1509e0.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1466s);
        sb.append(" (");
        sb.append(this.f1467t);
        sb.append(")}:");
        if (this.f1468u) {
            sb.append(" fromLayout");
        }
        if (this.f1470w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1470w));
        }
        String str = this.f1471x;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1471x);
        }
        if (this.y) {
            sb.append(" retainInstance");
        }
        if (this.f1472z) {
            sb.append(" removing");
        }
        if (this.A) {
            sb.append(" detached");
        }
        if (this.C) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1466s);
        parcel.writeString(this.f1467t);
        parcel.writeInt(this.f1468u ? 1 : 0);
        parcel.writeInt(this.f1469v);
        parcel.writeInt(this.f1470w);
        parcel.writeString(this.f1471x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.f1472z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeBundle(this.E);
        parcel.writeInt(this.D);
    }
}
