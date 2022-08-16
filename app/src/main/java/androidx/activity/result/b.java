package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: s */
    public final int f426s;

    /* renamed from: t */
    public final Intent f427t;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, Intent intent) {
        this.f426s = i10;
        this.f427t = intent;
    }

    public b(Parcel parcel) {
        this.f426s = parcel.readInt();
        this.f427t = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder c10 = androidx.activity.result.a.c("ActivityResult{resultCode=");
        int i10 = this.f426s;
        if (i10 != -1) {
            str = i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        c10.append(str);
        c10.append(", data=");
        c10.append(this.f427t);
        c10.append('}');
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f426s);
        parcel.writeInt(this.f427t == null ? 0 : 1);
        Intent intent = this.f427t;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
