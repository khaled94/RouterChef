package m4;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class r72 extends ThreadLocal<Mac> {

    /* renamed from: a */
    public final /* synthetic */ s72 f13189a;

    public r72(s72 s72Var) {
        this.f13189a = s72Var;
    }

    @Override // java.lang.ThreadLocal
    public final Mac initialValue() {
        try {
            Mac a10 = n72.f11545f.a(this.f13189a.f13540t);
            a10.init(this.f13189a.f13541u);
            return a10;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
