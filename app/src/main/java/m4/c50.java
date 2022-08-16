package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c50 implements Parcelable.Creator<b50> {
    @Override // android.os.Parcelable.Creator
    public final b50 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        long j3 = 0;
        long j10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        Bundle bundle = null;
        jn jnVar = null;
        on onVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        o90 o90Var = null;
        Bundle bundle2 = null;
        int i11 = 0;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        lu luVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        String str9 = null;
        String str10 = null;
        boolean z13 = false;
        int i16 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        qq qqVar = null;
        boolean z14 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z15 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        az azVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    bundle = b.a(parcel, readInt);
                    break;
                case 3:
                    jnVar = (jn) b.d(parcel, readInt, jn.CREATOR);
                    break;
                case 4:
                    onVar = (on) b.d(parcel, readInt, on.CREATOR);
                    break;
                case 5:
                    str = b.e(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b.d(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b.d(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case '\b':
                    str2 = b.e(parcel, readInt);
                    break;
                case '\t':
                    str3 = b.e(parcel, readInt);
                    break;
                case '\n':
                    str4 = b.e(parcel, readInt);
                    break;
                case 11:
                    o90Var = (o90) b.d(parcel, readInt, o90.CREATOR);
                    break;
                case '\f':
                    bundle2 = b.a(parcel, readInt);
                    break;
                case '\r':
                    i11 = b.n(parcel, readInt);
                    break;
                case 14:
                    arrayList = b.g(parcel, readInt);
                    break;
                case 15:
                    bundle3 = b.a(parcel, readInt);
                    break;
                case 16:
                    z10 = b.k(parcel, readInt);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    b.q(parcel, readInt);
                    break;
                case 18:
                    i12 = b.n(parcel, readInt);
                    break;
                case 19:
                    i13 = b.n(parcel, readInt);
                    break;
                case 20:
                    f10 = b.l(parcel, readInt);
                    break;
                case 21:
                    str5 = b.e(parcel, readInt);
                    break;
                case 25:
                    j3 = b.o(parcel, readInt);
                    break;
                case 26:
                    str6 = b.e(parcel, readInt);
                    break;
                case 27:
                    arrayList2 = b.g(parcel, readInt);
                    break;
                case 28:
                    str7 = b.e(parcel, readInt);
                    break;
                case 29:
                    luVar = (lu) b.d(parcel, readInt, lu.CREATOR);
                    break;
                case 30:
                    arrayList3 = b.g(parcel, readInt);
                    break;
                case 31:
                    j10 = b.o(parcel, readInt);
                    break;
                case '!':
                    str8 = b.e(parcel, readInt);
                    break;
                case '\"':
                    f11 = b.l(parcel, readInt);
                    break;
                case '#':
                    i14 = b.n(parcel, readInt);
                    break;
                case '$':
                    i15 = b.n(parcel, readInt);
                    break;
                case '%':
                    z12 = b.k(parcel, readInt);
                    break;
                case '\'':
                    str9 = b.e(parcel, readInt);
                    break;
                case '(':
                    z11 = b.k(parcel, readInt);
                    break;
                case ')':
                    str10 = b.e(parcel, readInt);
                    break;
                case '*':
                    z13 = b.k(parcel, readInt);
                    break;
                case '+':
                    i16 = b.n(parcel, readInt);
                    break;
                case ',':
                    bundle4 = b.a(parcel, readInt);
                    break;
                case '-':
                    str11 = b.e(parcel, readInt);
                    break;
                case '.':
                    qqVar = (qq) b.d(parcel, readInt, qq.CREATOR);
                    break;
                case '/':
                    z14 = b.k(parcel, readInt);
                    break;
                case '0':
                    bundle5 = b.a(parcel, readInt);
                    break;
                case '1':
                    str12 = b.e(parcel, readInt);
                    break;
                case '2':
                    str13 = b.e(parcel, readInt);
                    break;
                case '3':
                    str14 = b.e(parcel, readInt);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 52 */:
                    z15 = b.k(parcel, readInt);
                    break;
                case '5':
                    int p = b.p(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (p == 0) {
                        arrayList4 = null;
                        break;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i18 = 0; i18 < readInt2; i18++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + p);
                        arrayList4 = arrayList7;
                        break;
                    }
                case '6':
                    str15 = b.e(parcel, readInt);
                    break;
                case '7':
                    arrayList5 = b.g(parcel, readInt);
                    break;
                case '8':
                    i17 = b.n(parcel, readInt);
                    break;
                case '9':
                    z16 = b.k(parcel, readInt);
                    break;
                case ':':
                    z17 = b.k(parcel, readInt);
                    break;
                case ';':
                    z18 = b.k(parcel, readInt);
                    break;
                case '<':
                    arrayList6 = b.g(parcel, readInt);
                    break;
                case '=':
                    str16 = b.e(parcel, readInt);
                    break;
                case '?':
                    azVar = (az) b.d(parcel, readInt, az.CREATOR);
                    break;
                case '@':
                    str17 = b.e(parcel, readInt);
                    break;
                case 'A':
                    bundle6 = b.a(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new b50(i10, bundle, jnVar, onVar, str, applicationInfo, packageInfo, str2, str3, str4, o90Var, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j3, str6, arrayList2, str7, luVar, arrayList3, j10, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, qqVar, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, azVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b50[] newArray(int i10) {
        return new b50[i10];
    }
}
