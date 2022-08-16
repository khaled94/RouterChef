package p1;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class c0 implements d0 {

    /* renamed from: a */
    public final WindowId f16893a;

    public c0(View view) {
        this.f16893a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && ((c0) obj).f16893a.equals(this.f16893a);
    }

    public final int hashCode() {
        return this.f16893a.hashCode();
    }
}
