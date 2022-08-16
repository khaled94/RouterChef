package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import r1.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1267a = aVar.k(iconCompat.f1267a, 1);
        byte[] bArr = iconCompat.f1269c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f1269c = bArr;
        iconCompat.f1270d = aVar.m(iconCompat.f1270d, 3);
        iconCompat.f1271e = aVar.k(iconCompat.f1271e, 4);
        iconCompat.f1272f = aVar.k(iconCompat.f1272f, 5);
        iconCompat.f1273g = (ColorStateList) aVar.m(iconCompat.f1273g, 6);
        String str = iconCompat.f1275i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.f1275i = str;
        String str2 = iconCompat.f1276j;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.f1276j = str2;
        iconCompat.f1274h = PorterDuff.Mode.valueOf(iconCompat.f1275i);
        switch (iconCompat.f1267a) {
            case -1:
                parcelable = iconCompat.f1270d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1268b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f1270d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f1269c;
                    iconCompat.f1268b = bArr2;
                    iconCompat.f1267a = 3;
                    iconCompat.f1271e = 0;
                    iconCompat.f1272f = bArr2.length;
                    break;
                }
                iconCompat.f1268b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1269c, Charset.forName("UTF-16"));
                iconCompat.f1268b = str3;
                if (iconCompat.f1267a == 2 && iconCompat.f1276j == null) {
                    iconCompat.f1276j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f1268b = iconCompat.f1269c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f1275i = iconCompat.f1274h.name();
        switch (iconCompat.f1267a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1270d = (Parcelable) iconCompat.f1268b;
                break;
            case 2:
                iconCompat.f1269c = ((String) iconCompat.f1268b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1269c = (byte[]) iconCompat.f1268b;
                break;
            case 4:
            case 6:
                iconCompat.f1269c = iconCompat.f1268b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1267a;
        if (-1 != i10) {
            aVar.u(i10, 1);
        }
        byte[] bArr = iconCompat.f1269c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f1270d;
        if (parcelable != null) {
            aVar.w(parcelable, 3);
        }
        int i11 = iconCompat.f1271e;
        if (i11 != 0) {
            aVar.u(i11, 4);
        }
        int i12 = iconCompat.f1272f;
        if (i12 != 0) {
            aVar.u(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1273g;
        if (colorStateList != null) {
            aVar.w(colorStateList, 6);
        }
        String str = iconCompat.f1275i;
        if (str != null) {
            aVar.p(7);
            aVar.x(str);
        }
        String str2 = iconCompat.f1276j;
        if (str2 != null) {
            aVar.p(8);
            aVar.x(str2);
        }
    }
}
