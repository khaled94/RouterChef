package m4;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import o.c;

/* loaded from: classes.dex */
public final class wd2 extends c {

    /* renamed from: a */
    public final WeakReference<xs> f14945a;

    public wd2(xs xsVar) {
        this.f14945a = new WeakReference<>(xsVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        xs xsVar = this.f14945a.get();
        if (xsVar != null) {
            xsVar.f15458b = null;
            xsVar.f15457a = null;
        }
    }
}
