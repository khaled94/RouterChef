package m4;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import c5.a;
import c5.i;
import c5.j;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zr1 {

    /* renamed from: e */
    public static volatile int f16316e = 1;

    /* renamed from: a */
    public final Context f16317a;

    /* renamed from: b */
    public final Executor f16318b;

    /* renamed from: c */
    public final i<nt1> f16319c;

    /* renamed from: d */
    public final boolean f16320d;

    public zr1(Context context, Executor executor, i<nt1> iVar, boolean z10) {
        this.f16317a = context;
        this.f16318b = executor;
        this.f16319c = iVar;
        this.f16320d = z10;
    }

    public static zr1 a(Context context, Executor executor, boolean z10) {
        j jVar = new j();
        executor.execute(z10 ? new pj(context, jVar, 1) : new ma0(jVar, 2));
        return new zr1(context, executor, jVar.f2776a, z10);
    }

    public final i<Boolean> b(int i10, String str) {
        return f(i10, 0L, null, null, str);
    }

    public final i<Boolean> c(int i10, long j3, Exception exc) {
        return f(i10, j3, exc, null, null);
    }

    public final i<Boolean> d(int i10, long j3) {
        return f(i10, j3, null, null, null);
    }

    public final i e(int i10, long j3, String str) {
        return f(i10, j3, null, str, null);
    }

    public final i f(final int i10, long j3, Exception exc, String str, String str2) {
        if (!this.f16320d) {
            return this.f16319c.f(this.f16318b, ql.f12914w);
        }
        final n5 v10 = r5.v();
        String packageName = this.f16317a.getPackageName();
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        r5.C((r5) v10.f9883t, packageName);
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        r5.x((r5) v10.f9883t, j3);
        int i11 = f16316e;
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        r5.D((r5) v10.f9883t, i11);
        if (exc != null) {
            Object obj = ou1.f12294a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            r5.y((r5) v10.f9883t, stringWriter2);
            String name = exc.getClass().getName();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            r5.z((r5) v10.f9883t, name);
        }
        if (str2 != null) {
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            r5.A((r5) v10.f9883t, str2);
        }
        if (str != null) {
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            r5.B((r5) v10.f9883t, str);
        }
        return this.f16319c.f(this.f16318b, new a() { // from class: m4.yr1
            @Override // c5.a
            public final Object d(i iVar) {
                n5 n5Var = n5.this;
                int i12 = i10;
                if (iVar.n()) {
                    nt1 nt1Var = (nt1) iVar.j();
                    byte[] b10 = n5Var.k().b();
                    Objects.requireNonNull(nt1Var);
                    try {
                        if (nt1Var.f11917b) {
                            nt1Var.f11916a.k0(b10);
                            nt1Var.f11916a.M(0);
                            nt1Var.f11916a.A(i12);
                            nt1Var.f11916a.i0();
                            nt1Var.f11916a.d();
                        }
                    } catch (RemoteException e10) {
                        Log.d("GASS", "Clearcut log failed", e10);
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }
}
