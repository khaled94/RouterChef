package m4;

import android.os.Parcel;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class w20 extends ba implements x20 {
    public w20() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String readString = parcel.readString();
            bc1 bc1Var = (bc1) this;
            synchronized (bc1Var) {
                if (!bc1Var.f6450v) {
                    if (readString == null) {
                        bc1Var.O("Adapter returned null signals");
                    } else {
                        try {
                            bc1Var.f6449u.put("signals", readString);
                        } catch (JSONException unused) {
                        }
                        bc1Var.f6448t.a(bc1Var.f6449u);
                        bc1Var.f6450v = true;
                    }
                }
            }
        } else if (i10 == 2) {
            ((bc1) this).O(parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            cn cnVar = (cn) ca.a(parcel, cn.CREATOR);
            bc1 bc1Var2 = (bc1) this;
            synchronized (bc1Var2) {
                if (!bc1Var2.f6450v) {
                    try {
                        bc1Var2.f6449u.put("signal_error", cnVar.f7068t);
                    } catch (JSONException unused2) {
                    }
                    bc1Var2.f6448t.a(bc1Var2.f6449u);
                    bc1Var2.f6450v = true;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
