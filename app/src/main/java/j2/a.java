package j2;

import android.os.Parcel;
import android.os.Parcelable;
import e9.f;
import i2.c;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final C0078a CREATOR = new C0078a();

    /* renamed from: s */
    public c f5439s;

    /* renamed from: t */
    public float f5440t;

    /* renamed from: u */
    public float f5441u;

    /* renamed from: v */
    public float f5442v;

    /* renamed from: w */
    public float f5443w;

    /* renamed from: x */
    public int f5444x;
    public b y;

    /* renamed from: j2.a$a */
    /* loaded from: classes.dex */
    public static final class C0078a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            f.e(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(float f10, float f11, int i10, float f12) {
        b bVar = b.BUTT;
        this.f5440t = f12;
        this.f5442v = f10;
        this.f5443w = f11;
        this.f5444x = i10;
        this.y = bVar;
    }

    public final a a(c cVar) {
        f.e(cVar, "gauge");
        if (this.f5439s == null) {
            this.f5439s = cVar;
            return this;
        }
        throw new IllegalArgumentException("This instance of Section is already attached to a Gauge.".toString());
    }

    public final void b(int i10) {
        this.f5444x = i10;
        c cVar = this.f5439s;
        if (cVar == null) {
            return;
        }
        cVar.l();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        f.e(parcel, "parcel");
        parcel.writeFloat(this.f5442v);
        parcel.writeFloat(this.f5443w);
        parcel.writeInt(this.f5444x);
        parcel.writeFloat(this.f5440t);
        parcel.writeSerializable(Integer.valueOf(this.y.ordinal()));
        parcel.writeFloat(this.f5441u);
    }

    public a(Parcel parcel) {
        f.e(parcel, "parcel");
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt = parcel.readInt();
        float readFloat3 = parcel.readFloat();
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type com.github.anastr.speedviewlib.components.Style");
        this.f5440t = readFloat3;
        this.f5442v = readFloat;
        this.f5443w = readFloat2;
        this.f5444x = readInt;
        this.y = (b) readSerializable;
        this.f5441u = parcel.readFloat();
        c cVar = this.f5439s;
        if (cVar == null) {
            return;
        }
        cVar.l();
    }
}
