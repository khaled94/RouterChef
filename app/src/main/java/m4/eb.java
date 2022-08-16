package m4;

import android.annotation.TargetApi;
import java.security.KeyPairGenerator;
import java.security.Provider;

@TargetApi(21)
/* loaded from: classes.dex */
public final class eb implements y90, o72 {

    /* renamed from: s */
    public static final ag0 f7753s = new ag0(1);

    /* renamed from: t */
    public static final bk0 f7754t = new bk0(1);

    /* renamed from: u */
    public static final s01 f7755u = new s01();

    /* renamed from: v */
    public static final go1 f7756v = new go1();

    public static int a(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            return i10 != 1000 ? 0 : 1001;
        }
        return 1;
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // m4.y90
    /* renamed from: zza */
    public void mo20zza() {
    }
}
