package m3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import e4.b;
import l3.j;
import m4.o90;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        f fVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        o90 o90Var = null;
        String str4 = null;
        j jVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    fVar = (f) b.d(parcel, readInt, f.CREATOR);
                    break;
                case 3:
                    iBinder = b.m(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = b.m(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = b.m(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = b.m(parcel, readInt);
                    break;
                case 7:
                    str = b.e(parcel, readInt);
                    break;
                case '\b':
                    z10 = b.k(parcel, readInt);
                    break;
                case '\t':
                    str2 = b.e(parcel, readInt);
                    break;
                case '\n':
                    iBinder5 = b.m(parcel, readInt);
                    break;
                case 11:
                    i10 = b.n(parcel, readInt);
                    break;
                case '\f':
                    i11 = b.n(parcel, readInt);
                    break;
                case '\r':
                    str3 = b.e(parcel, readInt);
                    break;
                case 14:
                    o90Var = (o90) b.d(parcel, readInt, o90.CREATOR);
                    break;
                case 15:
                default:
                    b.q(parcel, readInt);
                    break;
                case 16:
                    str4 = b.e(parcel, readInt);
                    break;
                case 17:
                    jVar = (j) b.d(parcel, readInt, j.CREATOR);
                    break;
                case 18:
                    iBinder6 = b.m(parcel, readInt);
                    break;
                case 19:
                    str5 = b.e(parcel, readInt);
                    break;
                case 20:
                    iBinder7 = b.m(parcel, readInt);
                    break;
                case 21:
                    iBinder8 = b.m(parcel, readInt);
                    break;
                case 22:
                    iBinder9 = b.m(parcel, readInt);
                    break;
                case 23:
                    iBinder10 = b.m(parcel, readInt);
                    break;
                case 24:
                    str6 = b.e(parcel, readInt);
                    break;
                case 25:
                    str7 = b.e(parcel, readInt);
                    break;
                case 26:
                    iBinder11 = b.m(parcel, readInt);
                    break;
                case 27:
                    iBinder12 = b.m(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new AdOverlayInfoParcel(fVar, iBinder, iBinder2, iBinder3, iBinder4, str, z10, str2, iBinder5, i10, i11, str3, o90Var, str4, jVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
