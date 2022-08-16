package da;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class v extends w<Object> {

    /* renamed from: a */
    public final /* synthetic */ w f4083a;

    public v(w wVar) {
        this.f4083a = wVar;
    }

    @Override // da.w
    public final void a(y yVar, @Nullable Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f4083a.a(yVar, Array.get(obj, i10));
        }
    }
}
