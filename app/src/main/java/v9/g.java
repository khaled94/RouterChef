package v9;

import ca.h;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import r9.i0;
import r9.x;

/* loaded from: classes.dex */
public final class g extends i0 {
    @Nullable

    /* renamed from: t */
    public final String f19852t;

    /* renamed from: u */
    public final long f19853u;

    /* renamed from: v */
    public final h f19854v;

    public g(@Nullable String str, long j3, h hVar) {
        this.f19852t = str;
        this.f19853u = j3;
        this.f19854v = hVar;
    }

    @Override // r9.i0
    public final long b() {
        return this.f19853u;
    }

    @Override // r9.i0
    public final x c() {
        String str = this.f19852t;
        if (str != null) {
            Pattern pattern = x.f17492d;
            try {
                return x.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // r9.i0
    public final h j() {
        return this.f19854v;
    }
}
