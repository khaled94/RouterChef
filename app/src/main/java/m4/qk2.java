package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class qk2 implements Parcelable {
    public static final Parcelable.Creator<qk2> CREATOR = new vj2();

    /* renamed from: s */
    public int f12905s;

    /* renamed from: t */
    public final UUID f12906t;

    /* renamed from: u */
    public final String f12907u;

    /* renamed from: v */
    public final String f12908v;

    /* renamed from: w */
    public final byte[] f12909w;

    public qk2(Parcel parcel) {
        this.f12906t = new UUID(parcel.readLong(), parcel.readLong());
        this.f12907u = parcel.readString();
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f12908v = readString;
        this.f12909w = parcel.createByteArray();
    }

    public qk2(UUID uuid, String str, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f12906t = uuid;
        this.f12907u = null;
        this.f12908v = str;
        this.f12909w = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qk2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        qk2 qk2Var = (qk2) obj;
        return ls1.f(this.f12907u, qk2Var.f12907u) && ls1.f(this.f12908v, qk2Var.f12908v) && ls1.f(this.f12906t, qk2Var.f12906t) && Arrays.equals(this.f12909w, qk2Var.f12909w);
    }

    public final int hashCode() {
        int i10 = this.f12905s;
        if (i10 == 0) {
            int hashCode = this.f12906t.hashCode() * 31;
            String str = this.f12907u;
            int a10 = a.a(this.f12908v, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + Arrays.hashCode(this.f12909w);
            this.f12905s = a10;
            return a10;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12906t.getMostSignificantBits());
        parcel.writeLong(this.f12906t.getLeastSignificantBits());
        parcel.writeString(this.f12907u);
        parcel.writeString(this.f12908v);
        parcel.writeByteArray(this.f12909w);
    }
}
