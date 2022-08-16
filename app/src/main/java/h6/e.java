package h6;

import android.content.Context;
import w7.f;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f.a {

    /* renamed from: s */
    public static final /* synthetic */ e f5125s = new e();

    public static /* synthetic */ int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 != 4) {
            throw null;
        }
        return 4;
    }

    @Override // w7.f.a
    public String b(Object obj) {
        return ((Context) obj).getApplicationInfo();
    }
}
