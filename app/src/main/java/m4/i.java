package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements ym0 {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: s */
    public final long f9487s;

    /* renamed from: t */
    public final long f9488t;

    /* renamed from: u */
    public final long f9489u;

    /* renamed from: v */
    public final long f9490v;

    /* renamed from: w */
    public final long f9491w;

    public i(long j3, long j10, long j11, long j12, long j13) {
        this.f9487s = j3;
        this.f9488t = j10;
        this.f9489u = j11;
        this.f9490v = j12;
        this.f9491w = j13;
    }

    public /* synthetic */ i(Parcel parcel) {
        this.f9487s = parcel.readLong();
        this.f9488t = parcel.readLong();
        this.f9489u = parcel.readLong();
        this.f9490v = parcel.readLong();
        this.f9491w = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f9487s == iVar.f9487s && this.f9488t == iVar.f9488t && this.f9489u == iVar.f9489u && this.f9490v == iVar.f9490v && this.f9491w == iVar.f9491w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9487s;
        long j10 = this.f9488t;
        long j11 = this.f9489u;
        long j12 = this.f9490v;
        long j13 = this.f9491w;
        return ((((((((((int) (j3 ^ (j3 >>> 32))) + 527) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) ((j13 >>> 32) ^ j13));
    }

    @Override // m4.ym0
    public final /* synthetic */ void p(sk skVar) {
    }

    public final String toString() {
        long j3 = this.f9487s;
        long j10 = this.f9488t;
        long j11 = this.f9489u;
        long j12 = this.f9490v;
        long j13 = this.f9491w;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j3);
        sb.append(", photoSize=");
        sb.append(j10);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j11);
        sb.append(", videoStartPosition=");
        sb.append(j12);
        sb.append(", videoSize=");
        sb.append(j13);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9487s);
        parcel.writeLong(this.f9488t);
        parcel.writeLong(this.f9489u);
        parcel.writeLong(this.f9490v);
        parcel.writeLong(this.f9491w);
    }
}
