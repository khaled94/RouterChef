package e4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.k;
import java.util.ArrayList;
import l0.d;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + p);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + p);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + p);
        return createIntArray;
    }

    public static <T extends Parcelable> T d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + p);
        return createFromParcel;
    }

    public static String e(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + p);
        return readString;
    }

    public static String[] f(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + p);
        return createStringArray;
    }

    public static ArrayList<String> g(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + p);
        return createStringArrayList;
    }

    public static <T> T[] h(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + p);
        return tArr;
    }

    public static <T> ArrayList<T> i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + p);
        return createTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a(k.a(37, "Overread allowed size end=", i10), parcel);
    }

    public static boolean k(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static float l(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static IBinder m(Parcel parcel, int i10) {
        int p = p(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + p);
        return readStrongBinder;
    }

    public static int n(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long o(Parcel parcel, int i10) {
        t(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int p(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void q(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + p(parcel, i10));
    }

    public static int r(Parcel parcel) {
        int readInt = parcel.readInt();
        int p = p(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i10 = p + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a(d.a(54, "Size read is invalid start=", dataPosition, " end=", i10), parcel);
    }

    public static void s(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(i10);
        throw new a(androidx.fragment.app.a.b(sb, " (0x", hexString, ")"), parcel);
    }

    public static void t(Parcel parcel, int i10, int i11) {
        int p = p(parcel, i10);
        if (p == i11) {
            return;
        }
        String hexString = Integer.toHexString(p);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(p);
        throw new a(androidx.fragment.app.a.b(sb, " (0x", hexString, ")"), parcel);
    }
}
