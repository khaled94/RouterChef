package b3;

import android.content.Context;
import java.util.Objects;
import u8.a;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a */
    public final a<Context> f2513a;

    public g(a<Context> aVar) {
        this.f2513a = aVar;
    }

    @Override // u8.a
    public final Object get() {
        String packageName = this.f2513a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
