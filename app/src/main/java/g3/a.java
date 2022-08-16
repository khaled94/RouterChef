package g3;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import f3.e;
import f3.g;
import f3.m;
import f3.n;
import m4.dp;
import m4.or;
import m4.vq;
import n3.g1;

/* loaded from: classes.dex */
public final class a extends g {
    @RecentlyNullable
    public e[] getAdSizes() {
        return this.f4510s.f14762g;
    }

    @RecentlyNullable
    public c getAppEventListener() {
        return this.f4510s.f14763h;
    }

    @RecentlyNonNull
    public m getVideoController() {
        return this.f4510s.f14758c;
    }

    @RecentlyNullable
    public n getVideoOptions() {
        return this.f4510s.f14765j;
    }

    public void setAdSizes(@RecentlyNonNull e... eVarArr) {
        if (eVarArr == null || eVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f4510s.e(eVarArr);
    }

    public void setAppEventListener(c cVar) {
        this.f4510s.f(cVar);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        vq vqVar = this.f4510s;
        vqVar.f14769n = z10;
        try {
            dp dpVar = vqVar.f14764i;
            if (dpVar == null) {
                return;
            }
            dpVar.z3(z10);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public void setVideoOptions(@RecentlyNonNull n nVar) {
        vq vqVar = this.f4510s;
        vqVar.f14765j = nVar;
        try {
            dp dpVar = vqVar.f14764i;
            if (dpVar == null) {
                return;
            }
            dpVar.L2(nVar == null ? null : new or(nVar));
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
