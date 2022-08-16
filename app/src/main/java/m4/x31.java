package m4;

import android.os.Binder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class x31 implements s41 {

    /* renamed from: f */
    public static final Pattern f15215f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    public final g31 f15216a;

    /* renamed from: b */
    public final uz1 f15217b;

    /* renamed from: c */
    public final om1 f15218c;

    /* renamed from: d */
    public final ScheduledExecutorService f15219d;

    /* renamed from: e */
    public final i61 f15220e;

    public x31(om1 om1Var, g31 g31Var, uz1 uz1Var, ScheduledExecutorService scheduledExecutorService, i61 i61Var) {
        this.f15218c = om1Var;
        this.f15216a = g31Var;
        this.f15217b = uz1Var;
        this.f15219d = scheduledExecutorService;
        this.f15220e = i61Var;
    }

    @Override // m4.s41
    public final tz1<km1> a(final o50 o50Var) {
        tz1 tz1Var;
        final g31 g31Var = this.f15216a;
        Objects.requireNonNull(g31Var);
        String str = o50Var.f11998v;
        s1 s1Var = s.B.f5789c;
        if (s1.f(str)) {
            tz1Var = new nz1(new t41(1));
        } else {
            tz1Var = mz1.j(g31Var.f8726a.Z(new Callable() { // from class: m4.f31
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    w90<InputStream> w90Var;
                    g31 g31Var2 = g31.this;
                    o50 o50Var2 = o50Var;
                    e41 e41Var = g31Var2.f8728c;
                    synchronized (e41Var.f8746b) {
                        if (!e41Var.f8747c) {
                            e41Var.f8747c = true;
                            e41Var.f8749e = o50Var2;
                            e41Var.f8750f.n();
                            e41Var.f8745a.b(new r8(e41Var, 2), u90.f14299f);
                        }
                        w90Var = e41Var.f8745a;
                    }
                    return w90Var.get(((Integer) jo.f10145d.f10148c.a(es.f8208u3)).intValue(), TimeUnit.SECONDS);
                }
            }), ExecutionException.class, e31.f7716a, g31Var.f8727b);
        }
        final int callingUid = Binder.getCallingUid();
        tz1<km1> p = mz1.p(mz1.j(tz1Var, t41.class, new xy1() { // from class: m4.d31
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                g31 g31Var2 = g31.this;
                t41 t41Var = (t41) obj;
                return g31Var2.f8729d.a().O3(o50Var, callingUid);
            }
        }, g31Var.f8727b), new xy1() { // from class: m4.v31
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                return mz1.m(new km1(new f7(x31.this.f15218c, 4), jm1.a(new InputStreamReader((InputStream) obj))));
            }
        }, this.f15217b);
        yr<Boolean> yrVar = es.f8200t3;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            p = mz1.j(mz1.q(p, ((Integer) joVar.f10148c.a(es.f8208u3)).intValue(), TimeUnit.SECONDS, this.f15219d), TimeoutException.class, w31.f14855a, u90.f14299f);
        }
        mz1.t(p, new oz0(this), u90.f14299f);
        return p;
    }
}
