package t8;

import android.content.Context;
import ca.o;
import java.io.InputStream;
import t8.t;
import t8.y;

/* loaded from: classes.dex */
public class g extends y {

    /* renamed from: a */
    public final Context f18760a;

    public g(Context context) {
        this.f18760a = context;
    }

    @Override // t8.y
    public boolean c(w wVar) {
        return "content".equals(wVar.f18833c.getScheme());
    }

    @Override // t8.y
    public y.a f(w wVar, int i10) {
        return new y.a(o.f(h(wVar)), t.d.DISK);
    }

    public final InputStream h(w wVar) {
        return this.f18760a.getContentResolver().openInputStream(wVar.f18833c);
    }
}
