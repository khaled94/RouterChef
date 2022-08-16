package m4;

import android.os.ConditionVariable;
import android.os.RemoteException;
import android.util.Log;
import h2.d0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
public final class r7 {

    /* renamed from: c */
    public static final ConditionVariable f13180c = new ConditionVariable();

    /* renamed from: d */
    public static volatile nt1 f13181d = null;

    /* renamed from: e */
    public static volatile Random f13182e = null;

    /* renamed from: a */
    public final n8 f13183a;

    /* renamed from: b */
    public volatile Boolean f13184b;

    public r7(n8 n8Var) {
        this.f13183a = n8Var;
        n8Var.f11551b.execute(new d0(this, 2));
    }

    public static Random b() {
        if (f13182e == null) {
            synchronized (r7.class) {
                if (f13182e == null) {
                    f13182e = new Random();
                }
            }
        }
        return f13182e;
    }

    public final void a(int i10, int i11, long j3, String str, Exception exc) {
        try {
            f13180c.block();
            if (!this.f13184b.booleanValue() || f13181d == null) {
                return;
            }
            n5 v10 = r5.v();
            String packageName = this.f13183a.f11550a.getPackageName();
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
            if (str != null) {
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                r5.A((r5) v10.f9883t, str);
            }
            if (exc != null) {
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
            nt1 nt1Var = f13181d;
            byte[] b10 = v10.k().b();
            Objects.requireNonNull(nt1Var);
            if (i11 == -1) {
                i11 = 0;
            }
            try {
                if (!nt1Var.f11917b) {
                    return;
                }
                nt1Var.f11916a.k0(b10);
                nt1Var.f11916a.M(i11);
                nt1Var.f11916a.A(i10);
                nt1Var.f11916a.i0();
                nt1Var.f11916a.d();
            } catch (RemoteException e10) {
                Log.d("GASS", "Clearcut log failed", e10);
            }
        } catch (Exception unused) {
        }
    }
}
