package u1;

import android.content.Context;
import android.text.TextUtils;
import k1.c;
import l1.b;

/* loaded from: classes.dex */
public final class h implements c.AbstractC0083c {

    /* renamed from: a */
    public final /* synthetic */ Context f19017a;

    public h(Context context) {
        this.f19017a = context;
    }

    @Override // k1.c.AbstractC0083c
    public final c a(c.b bVar) {
        Context context = this.f19017a;
        String str = bVar.f5570b;
        c.a aVar = bVar.f5571c;
        if (aVar != null) {
            if (context == null) {
                throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
            }
            if (!TextUtils.isEmpty(str)) {
                return new b(context, str, aVar, true, false);
            }
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
