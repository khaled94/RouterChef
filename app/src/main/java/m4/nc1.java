package m4;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;

/* loaded from: classes.dex */
public final class nc1 implements ym, js0 {
    @GuardedBy("this")

    /* renamed from: s */
    public mo f11630s;

    @Override // m4.js0
    public final synchronized void B0() {
        mo moVar = this.f11630s;
        if (moVar != null) {
            try {
                moVar.a();
            } catch (RemoteException e10) {
                g1.k("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    @Override // m4.ym
    public final synchronized void N() {
        mo moVar = this.f11630s;
        if (moVar != null) {
            try {
                moVar.a();
            } catch (RemoteException e10) {
                g1.k("Remote Exception at onAdClicked.", e10);
            }
        }
    }
}
