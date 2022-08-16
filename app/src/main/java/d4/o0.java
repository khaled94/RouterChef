package d4;

import android.os.Looper;
import android.os.Message;
import r4.e;

/* loaded from: classes.dex */
public final class o0 extends e {

    /* renamed from: a */
    public final /* synthetic */ b f3902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b bVar, Looper looper) {
        super(looper);
        this.f3902a = bVar;
    }

    public static final void a(Message message) {
        p0 p0Var = (p0) message.obj;
        p0Var.b();
        p0Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r0 == 5) goto L18;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.o0.handleMessage(android.os.Message):void");
    }
}
