package m4;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class wa0 {

    /* renamed from: s */
    public static final AtomicInteger f14893s = new AtomicInteger(0);

    /* renamed from: t */
    public static final AtomicInteger f14894t = new AtomicInteger(0);

    public static int J() {
        return f14893s.get();
    }

    public static int L() {
        return f14894t.get();
    }

    public abstract void A(int i10);

    public abstract void B(boolean z10);

    public abstract void C(boolean z10);

    public abstract void D(int i10);

    public abstract void E(Surface surface, boolean z10);

    public abstract void F(float f10);

    public abstract void G();

    public abstract boolean H();

    public abstract int I();

    public abstract int K();

    public abstract long M();

    public abstract long N();

    public abstract long O();

    public abstract long P();

    public abstract long Q();

    public abstract long R();

    public abstract long S();

    public abstract void r(Uri[] uriArr, String str);

    public abstract void s(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void t();

    public abstract void u(long j3);

    public abstract void v(int i10);

    public abstract void x(int i10);

    public abstract void y(va0 va0Var);

    public abstract void z(int i10);
}
