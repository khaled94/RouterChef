package j0;

import android.graphics.Typeface;
import d0.g;
import e0.f;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ c4.a f5378s;

    /* renamed from: t */
    public final /* synthetic */ Typeface f5379t;

    public a(c4.a aVar, Typeface typeface) {
        this.f5378s = aVar;
        this.f5379t = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c4.a aVar = this.f5378s;
        Typeface typeface = this.f5379t;
        g.e eVar = ((f.a) aVar).f4320u;
        if (eVar != null) {
            eVar.e(typeface);
        }
    }
}
