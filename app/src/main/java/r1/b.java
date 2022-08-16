package r1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import r.a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d */
    public final SparseIntArray f17219d;

    /* renamed from: e */
    public final Parcel f17220e;

    /* renamed from: f */
    public final int f17221f;

    /* renamed from: g */
    public final int f17222g;

    /* renamed from: h */
    public final String f17223h;

    /* renamed from: i */
    public int f17224i;

    /* renamed from: j */
    public int f17225j;

    /* renamed from: k */
    public int f17226k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public b(Parcel parcel, int i10, int i11, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f17219d = new SparseIntArray();
        this.f17224i = -1;
        this.f17226k = -1;
        this.f17220e = parcel;
        this.f17221f = i10;
        this.f17222g = i11;
        this.f17225j = i10;
        this.f17223h = str;
    }

    @Override // r1.a
    public final void a() {
        int i10 = this.f17224i;
        if (i10 >= 0) {
            int i11 = this.f17219d.get(i10);
            int dataPosition = this.f17220e.dataPosition();
            this.f17220e.setDataPosition(i11);
            this.f17220e.writeInt(dataPosition - i11);
            this.f17220e.setDataPosition(dataPosition);
        }
    }

    @Override // r1.a
    public final a b() {
        Parcel parcel = this.f17220e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f17225j;
        if (i10 == this.f17221f) {
            i10 = this.f17222g;
        }
        return new b(parcel, dataPosition, i10, s.b.b(new StringBuilder(), this.f17223h, "  "), this.f17216a, this.f17217b, this.f17218c);
    }

    @Override // r1.a
    public final boolean f() {
        return this.f17220e.readInt() != 0;
    }

    @Override // r1.a
    public final byte[] g() {
        int readInt = this.f17220e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f17220e.readByteArray(bArr);
        return bArr;
    }

    @Override // r1.a
    public final CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f17220e);
    }

    @Override // r1.a
    public final boolean i(int i10) {
        while (this.f17225j < this.f17222g) {
            int i11 = this.f17226k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f17220e.setDataPosition(this.f17225j);
            int readInt = this.f17220e.readInt();
            this.f17226k = this.f17220e.readInt();
            this.f17225j += readInt;
        }
        return this.f17226k == i10;
    }

    @Override // r1.a
    public final int j() {
        return this.f17220e.readInt();
    }

    @Override // r1.a
    public final <T extends Parcelable> T l() {
        return (T) this.f17220e.readParcelable(b.class.getClassLoader());
    }

    @Override // r1.a
    public final String n() {
        return this.f17220e.readString();
    }

    @Override // r1.a
    public final void p(int i10) {
        a();
        this.f17224i = i10;
        this.f17219d.put(i10, this.f17220e.dataPosition());
        t(0);
        t(i10);
    }

    @Override // r1.a
    public final void q(boolean z10) {
        this.f17220e.writeInt(z10 ? 1 : 0);
    }

    @Override // r1.a
    public final void r(byte[] bArr) {
        if (bArr == null) {
            this.f17220e.writeInt(-1);
            return;
        }
        this.f17220e.writeInt(bArr.length);
        this.f17220e.writeByteArray(bArr);
    }

    @Override // r1.a
    public final void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f17220e, 0);
    }

    @Override // r1.a
    public final void t(int i10) {
        this.f17220e.writeInt(i10);
    }

    @Override // r1.a
    public final void v(Parcelable parcelable) {
        this.f17220e.writeParcelable(parcelable, 0);
    }

    @Override // r1.a
    public final void x(String str) {
        this.f17220e.writeString(str);
    }
}
