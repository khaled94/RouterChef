package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ec implements Parcelable {
    public static final Parcelable.Creator<ec> CREATOR = new dc();

    /* renamed from: s */
    public int f7770s;

    /* renamed from: t */
    public final UUID f7771t;

    /* renamed from: u */
    public final String f7772u;

    /* renamed from: v */
    public final byte[] f7773v;

    /* renamed from: w */
    public final boolean f7774w;

    public ec(Parcel parcel) {
        this.f7771t = new UUID(parcel.readLong(), parcel.readLong());
        this.f7772u = parcel.readString();
        this.f7773v = parcel.createByteArray();
        this.f7774w = parcel.readByte() != 0;
    }

    public ec(UUID uuid, String str, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f7771t = uuid;
        this.f7772u = str;
        Objects.requireNonNull(bArr);
        this.f7773v = bArr;
        this.f7774w = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ec ecVar = (ec) obj;
        return this.f7772u.equals(ecVar.f7772u) && wg.h(this.f7771t, ecVar.f7771t) && Arrays.equals(this.f7773v, ecVar.f7773v);
    }

    public final int hashCode() {
        int i10 = this.f7770s;
        if (i10 == 0) {
            int a10 = a.a(this.f7772u, this.f7771t.hashCode() * 31, 31) + Arrays.hashCode(this.f7773v);
            this.f7770s = a10;
            return a10;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7771t.getMostSignificantBits());
        parcel.writeLong(this.f7771t.getLeastSignificantBits());
        parcel.writeString(this.f7772u);
        parcel.writeByteArray(this.f7773v);
        parcel.writeByte(this.f7774w ? (byte) 1 : (byte) 0);
    }
}
