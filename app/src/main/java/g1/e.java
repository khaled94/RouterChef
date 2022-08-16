package g1;

import java.nio.charset.Charset;
import k1.f;
import u6.a0;
import y6.b;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements q2.e {

    /* renamed from: t */
    public static final /* synthetic */ e f4796t = new e(0);

    /* renamed from: u */
    public static final /* synthetic */ e f4797u = new e(1);

    /* renamed from: s */
    public final /* synthetic */ int f4798s;

    public /* synthetic */ e(int i10) {
        this.f4798s = i10;
    }

    @Override // q2.e
    public final Object a(Object obj) {
        switch (this.f4798s) {
            case 0:
                return Integer.valueOf(((f) obj).s());
            default:
                return b.f20877b.h((a0) obj).getBytes(Charset.forName("UTF-8"));
        }
    }
}
