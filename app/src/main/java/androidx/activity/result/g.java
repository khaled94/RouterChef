package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: s */
    public final IntentSender f442s;

    /* renamed from: t */
    public final Intent f443t;

    /* renamed from: u */
    public final int f444u;

    /* renamed from: v */
    public final int f445v;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f442s = intentSender;
        this.f443t = intent;
        this.f444u = i10;
        this.f445v = i11;
    }

    public g(Parcel parcel) {
        this.f442s = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f443t = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f444u = parcel.readInt();
        this.f445v = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f442s, i10);
        parcel.writeParcelable(this.f443t, i10);
        parcel.writeInt(this.f444u);
        parcel.writeInt(this.f445v);
    }
}
