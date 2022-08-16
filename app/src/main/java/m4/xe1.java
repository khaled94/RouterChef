package m4;

import java.util.concurrent.Callable;
import l3.s;
import n3.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class xe1 implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ xe1 f15314a = new xe1();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        s sVar = s.B;
        a0 a0Var = sVar.f5799m;
        synchronized (a0Var.f16437a) {
            str = a0Var.f16439c;
        }
        return new ze1(str, sVar.f5799m.h());
    }
}
