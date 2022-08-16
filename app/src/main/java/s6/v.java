package s6;

import android.util.Log;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class v implements Callable<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ u f18329a;

    public v(u uVar) {
        this.f18329a = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        o oVar = this.f18329a.f18320f;
        boolean z10 = false;
        boolean z11 = true;
        if (!oVar.f18290c.d().exists()) {
            String f10 = oVar.f();
            if (f10 != null && oVar.f18297j.e(f10)) {
                z10 = true;
            }
            z11 = z10;
        } else {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            oVar.f18290c.d().delete();
        }
        return Boolean.valueOf(z11);
    }
}
