package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.o0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final CharSequence A;
    public final int B;
    public final CharSequence C;
    public final ArrayList<String> D;
    public final ArrayList<String> E;
    public final boolean F;

    /* renamed from: s */
    public final int[] f1368s;

    /* renamed from: t */
    public final ArrayList<String> f1369t;

    /* renamed from: u */
    public final int[] f1370u;

    /* renamed from: v */
    public final int[] f1371v;

    /* renamed from: w */
    public final int f1372w;

    /* renamed from: x */
    public final String f1373x;
    public final int y;

    /* renamed from: z */
    public final int f1374z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        this.f1368s = parcel.createIntArray();
        this.f1369t = parcel.createStringArrayList();
        this.f1370u = parcel.createIntArray();
        this.f1371v = parcel.createIntArray();
        this.f1372w = parcel.readInt();
        this.f1373x = parcel.readString();
        this.y = parcel.readInt();
        this.f1374z = parcel.readInt();
        this.A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.B = parcel.readInt();
        this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.D = parcel.createStringArrayList();
        this.E = parcel.createStringArrayList();
        this.F = parcel.readInt() != 0;
    }

    public c(b bVar) {
        int size = bVar.f1538a.size();
        this.f1368s = new int[size * 6];
        if (bVar.f1544g) {
            this.f1369t = new ArrayList<>(size);
            this.f1370u = new int[size];
            this.f1371v = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                o0.a aVar = bVar.f1538a.get(i10);
                int i12 = i11 + 1;
                this.f1368s[i11] = aVar.f1553a;
                ArrayList<String> arrayList = this.f1369t;
                o oVar = aVar.f1554b;
                arrayList.add(oVar != null ? oVar.f1520w : null);
                int[] iArr = this.f1368s;
                int i13 = i12 + 1;
                iArr[i12] = aVar.f1555c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = aVar.f1556d;
                int i15 = i14 + 1;
                iArr[i14] = aVar.f1557e;
                int i16 = i15 + 1;
                iArr[i15] = aVar.f1558f;
                iArr[i16] = aVar.f1559g;
                this.f1370u[i10] = aVar.f1560h.ordinal();
                this.f1371v[i10] = aVar.f1561i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f1372w = bVar.f1543f;
            this.f1373x = bVar.f1546i;
            this.y = bVar.f1366s;
            this.f1374z = bVar.f1547j;
            this.A = bVar.f1548k;
            this.B = bVar.f1549l;
            this.C = bVar.f1550m;
            this.D = bVar.f1551n;
            this.E = bVar.f1552o;
            this.F = bVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1368s);
        parcel.writeStringList(this.f1369t);
        parcel.writeIntArray(this.f1370u);
        parcel.writeIntArray(this.f1371v);
        parcel.writeInt(this.f1372w);
        parcel.writeString(this.f1373x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.f1374z);
        TextUtils.writeToParcel(this.A, parcel, 0);
        parcel.writeInt(this.B);
        TextUtils.writeToParcel(this.C, parcel, 0);
        parcel.writeStringList(this.D);
        parcel.writeStringList(this.E);
        parcel.writeInt(this.F ? 1 : 0);
    }
}
