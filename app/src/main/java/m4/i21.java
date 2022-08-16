package m4;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final class i21 extends ba implements uy {

    /* renamed from: s */
    public final /* synthetic */ Object f9516s;

    /* renamed from: t */
    public final /* synthetic */ String f9517t;

    /* renamed from: u */
    public final /* synthetic */ long f9518u;

    /* renamed from: v */
    public final /* synthetic */ w90 f9519v;

    /* renamed from: w */
    public final /* synthetic */ j21 f9520w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i21(j21 j21Var, Object obj, String str, long j3, w90 w90Var) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f9520w = j21Var;
        this.f9516s = obj;
        this.f9517t = str;
        this.f9518u = j3;
        this.f9519v = w90Var;
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            synchronized (this.f9516s) {
                j21 j21Var = this.f9520w;
                String str = this.f9517t;
                Objects.requireNonNull(s.B.f5796j);
                j21Var.d(str, true, "", (int) (SystemClock.elapsedRealtime() - this.f9518u));
                this.f9520w.f9819l.c(this.f9517t);
                sr0 sr0Var = this.f9520w.f9822o;
                String str2 = this.f9517t;
                Objects.requireNonNull(sr0Var);
                sr0Var.M0(new u70(str2));
                this.f9519v.a(Boolean.TRUE);
            }
        } else if (i10 != 3) {
            return false;
        } else {
            P(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // m4.uy
    public final void P(String str) {
        synchronized (this.f9516s) {
            j21 j21Var = this.f9520w;
            String str2 = this.f9517t;
            Objects.requireNonNull(s.B.f5796j);
            j21Var.d(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.f9518u));
            this.f9520w.f9819l.a(this.f9517t, "error");
            this.f9520w.f9822o.e(this.f9517t, "error");
            this.f9519v.a(Boolean.FALSE);
        }
    }
}
