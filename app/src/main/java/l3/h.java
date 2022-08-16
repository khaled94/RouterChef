package l3;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import m4.ts1;
import y4.f4;
import y4.g6;
import y4.w2;

/* loaded from: classes.dex */
public final class h implements ts1, g6 {

    /* renamed from: s */
    public Object f5754s;

    public /* synthetic */ h() {
    }

    public /* synthetic */ h(Object obj) {
        this.f5754s = obj;
    }

    @Override // y4.g6
    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            ((f4) this.f5754s).l("auto", "_err", bundle);
            return;
        }
        Objects.requireNonNull((f4) this.f5754s);
        w2.i();
        throw null;
    }

    @Override // m4.ts1
    public final void b(int i10, long j3) {
        ((i) this.f5754s).f5761z.d(i10, System.currentTimeMillis() - j3);
    }

    @Override // m4.ts1
    public final void c(int i10, long j3, String str) {
        ((i) this.f5754s).f5761z.f(i10, System.currentTimeMillis() - j3, null, null, str);
    }
}
