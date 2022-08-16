package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import i0.b;

/* loaded from: classes.dex */
public final class mq2 implements ym0 {
    public static final Parcelable.Creator<mq2> CREATOR = new lq2();

    /* renamed from: s */
    public final String f11281s;

    /* renamed from: t */
    public final String f11282t;

    public mq2(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f11281s = readString;
        this.f11282t = parcel.readString();
    }

    public mq2(String str, String str2) {
        this.f11281s = str;
        this.f11282t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mq2.class == obj.getClass()) {
            mq2 mq2Var = (mq2) obj;
            if (this.f11281s.equals(mq2Var.f11281s) && this.f11282t.equals(mq2Var.f11282t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11282t.hashCode() + a.a(this.f11281s, 527, 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.ym0
    public final void p(sk skVar) {
        char c10;
        String str = this.f11281s;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            skVar.f13703a = this.f11282t;
        } else if (c10 == 1) {
            skVar.f13704b = this.f11282t;
        } else if (c10 == 2) {
            skVar.f13705c = this.f11282t;
        } else if (c10 == 3) {
            skVar.f13706d = this.f11282t;
        } else if (c10 != 4) {
        } else {
            skVar.f13707e = this.f11282t;
        }
    }

    public final String toString() {
        String str = this.f11281s;
        String str2 = this.f11282t;
        return b.a(new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11281s);
        parcel.writeString(this.f11282t);
    }
}
