package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sq2 extends er2 {
    public static final Parcelable.Creator<sq2> CREATOR = new rq2();

    /* renamed from: t */
    public final byte[] f13814t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sq2(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = m4.ls1.f10971a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f13814t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sq2.<init>(android.os.Parcel):void");
    }

    public sq2(String str, byte[] bArr) {
        super(str);
        this.f13814t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sq2.class == obj.getClass()) {
            sq2 sq2Var = (sq2) obj;
            if (this.f8048s.equals(sq2Var.f8048s) && Arrays.equals(this.f13814t, sq2Var.f13814t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13814t) + a.a(this.f8048s, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8048s);
        parcel.writeByteArray(this.f13814t);
    }
}
