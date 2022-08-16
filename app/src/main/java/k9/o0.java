package k9;

import d9.l;
import java.util.concurrent.CancellationException;
import v8.h;
import x8.f;

/* loaded from: classes.dex */
public interface o0 extends f.b {

    /* renamed from: a */
    public static final /* synthetic */ int f5676a = 0;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ c0 a(o0 o0Var, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            boolean z12 = false;
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z12 = true;
            }
            return o0Var.e0(z10, z12, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements f.c<o0> {

        /* renamed from: s */
        public static final /* synthetic */ b f5677s = new b();
    }

    CancellationException L();

    void Y(CancellationException cancellationException);

    boolean b();

    c0 e0(boolean z10, boolean z11, l<? super Throwable, h> lVar);
}
