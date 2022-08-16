package m4;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import e4.a;
import h4.e;
import java.io.IOException;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class m50 extends a {
    public static final Parcelable.Creator<m50> CREATOR = new n50();

    /* renamed from: s */
    public ParcelFileDescriptor f11083s;

    /* renamed from: t */
    public Parcelable f11084t = null;

    /* renamed from: u */
    public boolean f11085u = true;

    public m50(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11083s = parcelFileDescriptor;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        IOException e10;
        ParcelFileDescriptor[] createPipe;
        if (this.f11083s == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f11084t.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e11) {
                    e10 = e11;
                    autoCloseOutputStream = null;
                }
                try {
                    u90.f14294a.execute(new oe(autoCloseOutputStream, marshall, 3, null));
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e12) {
                    e10 = e12;
                    g1.h("Error transporting the ad response", e10);
                    s.B.f5793g.g(e10, "LargeParcelTeleporter.pipeData.2");
                    e.a(autoCloseOutputStream);
                    this.f11083s = parcelFileDescriptor;
                    int q10 = m2.a.q(parcel, 20293);
                    m2.a.k(parcel, 2, this.f11083s, i10);
                    m2.a.u(parcel, q10);
                }
                this.f11083s = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int q102 = m2.a.q(parcel, 20293);
        m2.a.k(parcel, 2, this.f11083s, i10);
        m2.a.u(parcel, q102);
    }
}
