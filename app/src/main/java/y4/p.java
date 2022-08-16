package y4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import e4.a;
import java.util.Objects;
import s.b;

/* loaded from: classes.dex */
public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: s */
    public final String f20634s;

    /* renamed from: t */
    public final n f20635t;

    /* renamed from: u */
    public final String f20636u;

    /* renamed from: v */
    public final long f20637v;

    public p(String str, n nVar, String str2, long j3) {
        this.f20634s = str;
        this.f20635t = nVar;
        this.f20636u = str2;
        this.f20637v = j3;
    }

    public p(p pVar, long j3) {
        Objects.requireNonNull(pVar, "null reference");
        this.f20634s = pVar.f20634s;
        this.f20635t = pVar.f20635t;
        this.f20636u = pVar.f20636u;
        this.f20637v = j3;
    }

    public final String toString() {
        String str = this.f20636u;
        String str2 = this.f20634s;
        String valueOf = String.valueOf(this.f20635t);
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        b1.b(sb, "origin=", str, ",name=", str2);
        return b.b(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        q.a(this, parcel, i10);
    }
}
