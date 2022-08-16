package m4;

import android.os.Handler;
import android.os.RemoteException;
import java.util.Objects;
import n3.g1;

/* loaded from: classes.dex */
public final class lh {

    /* renamed from: a */
    public final /* synthetic */ int f10837a = 0;

    /* renamed from: b */
    public final Object f10838b;

    /* renamed from: c */
    public final Object f10839c;

    public lh(Handler handler, mh mhVar) {
        Objects.requireNonNull(handler);
        this.f10838b = handler;
        this.f10839c = mhVar;
    }

    public final String toString() {
        switch (this.f10837a) {
            case 1:
                return (String) this.f10838b;
            default:
                return super.toString();
        }
    }

    public lh(yp ypVar) {
        String str;
        this.f10839c = ypVar;
        try {
            str = ypVar.b();
        } catch (RemoteException e10) {
            g1.h("", e10);
            str = null;
        }
        this.f10838b = str;
    }
}
