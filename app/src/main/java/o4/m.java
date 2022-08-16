package o4;

import a4.f;
import android.content.Context;
import c5.i;
import m4.rb1;
import v3.a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final l f16774a;

    /* renamed from: b */
    public final h f16775b;

    public m(Context context) {
        h hVar;
        this.f16774a = new l(context, f.f133b);
        synchronized (h.class) {
            if (h.f16764d == null) {
                h.f16764d = new h(context.getApplicationContext());
            }
            hVar = h.f16764d;
        }
        this.f16775b = hVar;
    }

    public final i<a> a() {
        return this.f16774a.c().g(new rb1(this, 7));
    }
}
