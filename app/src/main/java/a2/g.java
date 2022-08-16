package a2;

import android.content.Context;
import f2.a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e */
    public static g f31e;

    /* renamed from: a */
    public a f32a;

    /* renamed from: b */
    public b f33b;

    /* renamed from: c */
    public e f34c;

    /* renamed from: d */
    public f f35d;

    public g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f32a = new a(applicationContext, aVar);
        this.f33b = new b(applicationContext, aVar);
        this.f34c = new e(applicationContext, aVar);
        this.f35d = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f31e == null) {
                f31e = new g(context, aVar);
            }
            gVar = f31e;
        }
        return gVar;
    }
}
