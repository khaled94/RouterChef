package m4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qf extends uf {

    /* renamed from: d */
    public final AtomicReference<pf> f12830d = new AtomicReference<>(new pf());

    public static boolean a(int i10, boolean z10) {
        int i11 = i10 & 3;
        return i11 == 3 || (z10 && i11 == 2);
    }
}
