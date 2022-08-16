package j4;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public static c f5451b = new c();

    /* renamed from: a */
    public b f5452a = null;

    public static b a(Context context) {
        b bVar;
        c cVar = f5451b;
        synchronized (cVar) {
            if (cVar.f5452a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f5452a = new b(context);
            }
            bVar = cVar.f5452a;
        }
        return bVar;
    }
}
