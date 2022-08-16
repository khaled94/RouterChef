package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class e extends er2 {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: t */
    public final String f7673t;

    /* renamed from: u */
    public final String f7674u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = m4.ls1.f10971a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f7673t = r0
            java.lang.String r3 = r3.readString()
            r2.f7674u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.e.<init>(android.os.Parcel):void");
    }

    public e(String str, String str2, String str3) {
        super(str);
        this.f7673t = str2;
        this.f7674u = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f8048s.equals(eVar.f8048s) && ls1.f(this.f7673t, eVar.f7673t) && ls1.f(this.f7674u, eVar.f7674u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a10 = a.a(this.f8048s, 527, 31);
        String str = this.f7673t;
        int i10 = 0;
        int hashCode = (a10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7674u;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f7674u;
        return a.b(new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length()), str, ": url=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8048s);
        parcel.writeString(this.f7673t);
        parcel.writeString(this.f7674u);
    }
}
