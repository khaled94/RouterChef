package m4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.k;
import androidx.fragment.app.b1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ua implements Parcelable {
    public static final Parcelable.Creator<ua> CREATOR = new ta();
    public final fc A;
    public final int B;
    public final int C;
    public final float D;
    public final int E;
    public final float F;
    public final int G;
    public final byte[] H;
    public final zg I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final long O;
    public final int P;
    public final String Q;
    public final int R;
    public int S;

    /* renamed from: s */
    public final String f14307s;

    /* renamed from: t */
    public final int f14308t;

    /* renamed from: u */
    public final String f14309u;

    /* renamed from: v */
    public final ee f14310v;

    /* renamed from: w */
    public final String f14311w;

    /* renamed from: x */
    public final String f14312x;
    public final int y;

    /* renamed from: z */
    public final List<byte[]> f14313z;

    public ua(Parcel parcel) {
        this.f14307s = parcel.readString();
        this.f14311w = parcel.readString();
        this.f14312x = parcel.readString();
        this.f14309u = parcel.readString();
        this.f14308t = parcel.readInt();
        this.y = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readFloat();
        this.E = parcel.readInt();
        this.F = parcel.readFloat();
        this.H = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.G = parcel.readInt();
        this.I = (zg) parcel.readParcelable(zg.class.getClassLoader());
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.O = parcel.readLong();
        int readInt = parcel.readInt();
        this.f14313z = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f14313z.add(parcel.createByteArray());
        }
        this.A = (fc) parcel.readParcelable(fc.class.getClassLoader());
        this.f14310v = (ee) parcel.readParcelable(ee.class.getClassLoader());
    }

    public ua(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, zg zgVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j3, List<byte[]> list, fc fcVar, ee eeVar) {
        this.f14307s = str;
        this.f14311w = str2;
        this.f14312x = str3;
        this.f14309u = str4;
        this.f14308t = i10;
        this.y = i11;
        this.B = i12;
        this.C = i13;
        this.D = f10;
        this.E = i14;
        this.F = f11;
        this.H = bArr;
        this.G = i15;
        this.I = zgVar;
        this.J = i16;
        this.K = i17;
        this.L = i18;
        this.M = i19;
        this.N = i20;
        this.P = i21;
        this.Q = str5;
        this.R = i22;
        this.O = j3;
        this.f14313z = list == null ? Collections.emptyList() : list;
        this.A = fcVar;
        this.f14310v = eeVar;
    }

    public static ua c(String str, String str2, int i10, int i11, fc fcVar, String str3) {
        return f(str, str2, -1, i10, i11, -1, null, fcVar, 0, str3);
    }

    public static ua f(String str, String str2, int i10, int i11, int i12, int i13, List list, fc fcVar, int i14, String str3) {
        return new ua(str, null, str2, null, -1, i10, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i11, i12, i13, -1, -1, i14, str3, -1, Long.MAX_VALUE, list, fcVar, null);
    }

    public static ua j(String str, String str2, int i10, String str3, fc fcVar, long j3, List list) {
        return new ua(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, -1, j3, list, fcVar, null);
    }

    public static ua m(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, zg zgVar, fc fcVar) {
        return new ua(str, null, str2, null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, zgVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, fcVar, null);
    }

    @TargetApi(16)
    public static void n(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public final int a() {
        int i10;
        int i11 = this.B;
        if (i11 == -1 || (i10 = this.C) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f14312x);
        String str = this.Q;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        n(mediaFormat, "max-input-size", this.y);
        n(mediaFormat, "width", this.B);
        n(mediaFormat, "height", this.C);
        float f10 = this.D;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        n(mediaFormat, "rotation-degrees", this.E);
        n(mediaFormat, "channel-count", this.J);
        n(mediaFormat, "sample-rate", this.K);
        n(mediaFormat, "encoder-delay", this.M);
        n(mediaFormat, "encoder-padding", this.N);
        for (int i10 = 0; i10 < this.f14313z.size(); i10++) {
            mediaFormat.setByteBuffer(k.a(15, "csd-", i10), ByteBuffer.wrap(this.f14313z.get(i10)));
        }
        zg zgVar = this.I;
        if (zgVar != null) {
            n(mediaFormat, "color-transfer", zgVar.f16196u);
            n(mediaFormat, "color-standard", zgVar.f16194s);
            n(mediaFormat, "color-range", zgVar.f16195t);
            byte[] bArr = zgVar.f16197v;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ua.class == obj.getClass()) {
            ua uaVar = (ua) obj;
            if (this.f14308t == uaVar.f14308t && this.y == uaVar.y && this.B == uaVar.B && this.C == uaVar.C && this.D == uaVar.D && this.E == uaVar.E && this.F == uaVar.F && this.G == uaVar.G && this.J == uaVar.J && this.K == uaVar.K && this.L == uaVar.L && this.M == uaVar.M && this.N == uaVar.N && this.O == uaVar.O && this.P == uaVar.P && wg.h(this.f14307s, uaVar.f14307s) && wg.h(this.Q, uaVar.Q) && this.R == uaVar.R && wg.h(this.f14311w, uaVar.f14311w) && wg.h(this.f14312x, uaVar.f14312x) && wg.h(this.f14309u, uaVar.f14309u) && wg.h(this.A, uaVar.A) && wg.h(this.f14310v, uaVar.f14310v) && wg.h(this.I, uaVar.I) && Arrays.equals(this.H, uaVar.H) && this.f14313z.size() == uaVar.f14313z.size()) {
                for (int i10 = 0; i10 < this.f14313z.size(); i10++) {
                    if (!Arrays.equals(this.f14313z.get(i10), uaVar.f14313z.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.S;
        if (i10 == 0) {
            String str = this.f14307s;
            int i11 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f14311w;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f14312x;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f14309u;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f14308t) * 31) + this.B) * 31) + this.C) * 31) + this.J) * 31) + this.K) * 31;
            String str5 = this.Q;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.R) * 31;
            fc fcVar = this.A;
            int hashCode6 = (hashCode5 + (fcVar == null ? 0 : fcVar.hashCode())) * 31;
            ee eeVar = this.f14310v;
            if (eeVar != null) {
                i11 = eeVar.hashCode();
            }
            int i12 = hashCode6 + i11;
            this.S = i12;
            return i12;
        }
        return i10;
    }

    public final String toString() {
        String str = this.f14307s;
        String str2 = this.f14311w;
        String str3 = this.f14312x;
        int i10 = this.f14308t;
        String str4 = this.Q;
        int i11 = this.B;
        int i12 = this.C;
        float f10 = this.D;
        int i13 = this.J;
        int i14 = this.K;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        b1.b(sb, "Format(", str, ", ", str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(f10);
        sb.append("], [");
        sb.append(i13);
        sb.append(", ");
        sb.append(i14);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14307s);
        parcel.writeString(this.f14311w);
        parcel.writeString(this.f14312x);
        parcel.writeString(this.f14309u);
        parcel.writeInt(this.f14308t);
        parcel.writeInt(this.y);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeFloat(this.D);
        parcel.writeInt(this.E);
        parcel.writeFloat(this.F);
        parcel.writeInt(this.H != null ? 1 : 0);
        byte[] bArr = this.H;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.G);
        parcel.writeParcelable(this.I, i10);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeLong(this.O);
        int size = this.f14313z.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f14313z.get(i11));
        }
        parcel.writeParcelable(this.A, 0);
        parcel.writeParcelable(this.f14310v, 0);
    }
}
