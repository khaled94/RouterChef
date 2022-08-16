package m4;

import android.content.Context;
import h4.a;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class an0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6210a;

    /* renamed from: b */
    public final vd2 f6211b;

    /* renamed from: c */
    public final vd2 f6212c;

    /* renamed from: d */
    public final Object f6213d;

    public an0(qk0 qk0Var, vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f6210a = 2;
        this.f6213d = qk0Var;
        this.f6211b = vd2Var;
        this.f6212c = go1Var;
    }

    @Override // m4.vd2
    public final Object a() {
        String bigInteger;
        switch (this.f6210a) {
            case 0:
                a aVar = (a) this.f6211b.a();
                d90 a10 = ((fn1) this.f6212c).a();
                String str = ((mo0) ((vd2) this.f6213d)).b().f12205f;
                b90 b90Var = a10.f7266c;
                synchronized (b90Var) {
                    bigInteger = b90Var.f6423a.toString();
                    b90Var.f6423a = b90Var.f6423a.add(BigInteger.ONE);
                    b90Var.f6424b = bigInteger;
                }
                return new u80(aVar, a10, bigInteger, str);
            case 1:
                return new p91((Context) this.f6211b.a(), (cu0) this.f6212c.a(), ((vf0) ((vd2) this.f6213d)).b());
            default:
                t90 t90Var = u90.f14294a;
                d.a.d(t90Var);
                return new es0((wl0) this.f6211b.a(), t90Var);
        }
    }

    public /* synthetic */ an0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f6210a = i10;
        this.f6211b = vd2Var;
        this.f6212c = vd2Var2;
        this.f6213d = vd2Var3;
    }
}
