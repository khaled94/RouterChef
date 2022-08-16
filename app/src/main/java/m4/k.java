package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements ym0 {
    public static final Parcelable.Creator<k> CREATOR = new j();

    /* renamed from: s */
    public final float f10220s;

    /* renamed from: t */
    public final int f10221t;

    public k(float f10, int i10) {
        this.f10220s = f10;
        this.f10221t = i10;
    }

    public /* synthetic */ k(Parcel parcel) {
        this.f10220s = parcel.readFloat();
        this.f10221t = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f10220s == kVar.f10220s && this.f10221t == kVar.f10221t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f10220s).hashCode() + 527) * 31) + this.f10221t;
    }

    @Override // m4.ym0
    public final /* synthetic */ void p(sk skVar) {
    }

    public final String toString() {
        float f10 = this.f10220s;
        int i10 = this.f10221t;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f10);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i10);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f10220s);
        parcel.writeInt(this.f10221t);
    }
}
