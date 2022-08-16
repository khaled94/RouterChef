package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class q22 extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f12683a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f12683a) {
            case 0:
                try {
                    return n72.f11544e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                try {
                    return n72.f11544e.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
