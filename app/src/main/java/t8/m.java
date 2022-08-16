package t8;

import android.util.LruCache;
import t8.n;

/* loaded from: classes.dex */
public final class m extends LruCache<String, n.a> {
    public m(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, n.a aVar) {
        return aVar.f18784b;
    }
}
