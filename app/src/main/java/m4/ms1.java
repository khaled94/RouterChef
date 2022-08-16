package m4;

import android.content.Context;
import android.util.Base64;
import c5.b0;
import c5.i;
import c5.l;
import i3.a;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ms1 {

    /* renamed from: a */
    public final Context f11287a;

    /* renamed from: b */
    public final Executor f11288b;

    /* renamed from: c */
    public final zr1 f11289c;

    /* renamed from: d */
    public final js1 f11290d;

    /* renamed from: e */
    public final ks1 f11291e;

    /* renamed from: f */
    public i<k6> f11292f;

    /* renamed from: g */
    public i<k6> f11293g;

    public ms1(Context context, Executor executor, zr1 zr1Var, as1 as1Var, js1 js1Var, ks1 ks1Var) {
        this.f11287a = context;
        this.f11288b = executor;
        this.f11289c = zr1Var;
        this.f11290d = js1Var;
        this.f11291e = ks1Var;
    }

    public static ms1 a(Context context, Executor executor, zr1 zr1Var, as1 as1Var) {
        i iVar;
        ms1 ms1Var = new ms1(context, executor, zr1Var, as1Var, new js1(), new ks1());
        if (((cs1) as1Var).f7135b) {
            iVar = l.c(executor, new Callable() { // from class: m4.hs1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = ms1.this.f11287a;
                    v5 V = k6.V();
                    a.C0075a b10 = a.b(context2);
                    String str = b10.f5258a;
                    if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                        UUID fromString = UUID.fromString(str);
                        byte[] bArr = new byte[16];
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        wrap.putLong(fromString.getMostSignificantBits());
                        wrap.putLong(fromString.getLeastSignificantBits());
                        str = Base64.encodeToString(bArr, 11);
                    }
                    if (str != null) {
                        V.p(str);
                        boolean z10 = b10.f5259b;
                        if (V.f9884u) {
                            V.m();
                            V.f9884u = false;
                        }
                        k6.X((k6) V.f9883t, z10);
                        if (V.f9884u) {
                            V.m();
                            V.f9884u = false;
                        }
                        k6.i0((k6) V.f9883t);
                    }
                    return V.k();
                }
            });
            iVar.c(executor, new rb1(ms1Var, 5));
        } else {
            iVar = l.e(js1.f10182a);
        }
        ms1Var.f11292f = (b0) iVar;
        i c10 = l.c(executor, new Callable() { // from class: m4.is1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = ms1.this.f11287a;
                return wo2.b(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            }
        });
        c10.c(executor, new rb1(ms1Var, 5));
        ms1Var.f11293g = (b0) c10;
        return ms1Var;
    }
}
