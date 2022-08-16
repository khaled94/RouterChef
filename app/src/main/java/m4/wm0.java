package m4;

import a6.f;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l3.s;
import n3.h1;
import n3.s1;
import p1.r;
import t3.k;

/* loaded from: classes.dex */
public final class wm0<T> {

    /* renamed from: a */
    public final c41 f15051a;

    /* renamed from: b */
    public final om1 f15052b;

    /* renamed from: c */
    public final zo1 f15053c;

    /* renamed from: d */
    public final v0 f15054d;

    /* renamed from: e */
    public final ga1<T> f15055e;

    /* renamed from: f */
    public final yq0 f15056f;

    /* renamed from: g */
    public km1 f15057g;

    /* renamed from: h */
    public final a51 f15058h;

    /* renamed from: i */
    public final co0 f15059i;

    /* renamed from: j */
    public final Executor f15060j;

    /* renamed from: k */
    public final q41 f15061k;

    /* renamed from: l */
    public final j71 f15062l;

    public wm0(c41 c41Var, om1 om1Var, zo1 zo1Var, v0 v0Var, ga1<T> ga1Var, yq0 yq0Var, km1 km1Var, a51 a51Var, co0 co0Var, Executor executor, q41 q41Var, j71 j71Var) {
        this.f15051a = c41Var;
        this.f15052b = om1Var;
        this.f15053c = zo1Var;
        this.f15054d = v0Var;
        this.f15055e = ga1Var;
        this.f15056f = yq0Var;
        this.f15057g = km1Var;
        this.f15058h = a51Var;
        this.f15059i = co0Var;
        this.f15060j = executor;
        this.f15061k = q41Var;
        this.f15062l = j71Var;
    }

    public final cn a(Throwable th) {
        return f.l(th, this.f15062l);
    }

    public final tz1<T> b(tz1<km1> tz1Var) {
        to1 f10 = this.f15053c.b(wo1.RENDERER, tz1Var).e(new r(this, 2)).f(this.f15055e);
        yr<Boolean> yrVar = es.f8200t3;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            yr<Integer> yrVar2 = es.f8208u3;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f10 = f10.h(((Integer) joVar.f10148c.a(yrVar2)).intValue());
        }
        return f10.a();
    }

    public final tz1<km1> c() {
        tz1<km1> tz1Var;
        String str;
        jn jnVar = this.f15052b.f12203d;
        if (jnVar.P == null && jnVar.K == null) {
            return d(this.f15059i.b());
        }
        zo1 zo1Var = this.f15053c;
        wo1 wo1Var = wo1.SERVER_TRANSACTION;
        c41 c41Var = this.f15051a;
        String str2 = c41Var.f6723d.f12203d.P;
        if (!TextUtils.isEmpty(str2)) {
            yr<Boolean> yrVar = es.K4;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                String c10 = c41.c(str2);
                if (TextUtils.isEmpty(c10)) {
                    if (((Boolean) joVar.f10148c.a(es.N4)).booleanValue()) {
                        c41Var.f6727h.h();
                    }
                    tz1Var = new nz1<>(new ea1(15, "Invalid ad string."));
                } else {
                    k r10 = c41Var.f6720a.r();
                    synchronized (r10) {
                        Pair<Long, String> pair = r10.f18599c.get(c10);
                        if (pair != null) {
                            str = (String) pair.second;
                            r10.f18599c.remove(c10);
                        } else {
                            str = null;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        tz1Var = c41Var.a(str2, c41Var.b(str));
                    }
                }
                return qo1.b(tz1Var, wo1Var, zo1Var).a();
            }
        }
        an anVar = c41Var.f6723d.f12203d.K;
        if (anVar != null) {
            if (((Boolean) jo.f10145d.f10148c.a(es.I4)).booleanValue()) {
                String c11 = c41.c(anVar.f6208s);
                String c12 = c41.c(anVar.f6209t);
                if (!TextUtils.isEmpty(c12) && c11.equals(c12)) {
                    k r11 = c41Var.f6720a.r();
                    synchronized (r11) {
                        r11.f18599c.remove(c11);
                    }
                }
            }
            tz1Var = c41Var.a(anVar.f6208s, c41Var.b(anVar.f6209t));
            return qo1.b(tz1Var, wo1Var, zo1Var).a();
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            c41Var.f6727h.h();
        }
        tz1Var = new nz1<>(new ea1(14, "Mismatch request IDs."));
        return qo1.b(tz1Var, wo1Var, zo1Var).a();
    }

    public final tz1<km1> d(tz1<o50> tz1Var) {
        to1 to1Var;
        wo1 wo1Var = wo1.SERVER_TRANSACTION;
        km1 km1Var = this.f15057g;
        if (km1Var != null) {
            to1Var = qo1.b(mz1.m(km1Var), wo1Var, this.f15053c);
        } else {
            gj gjVar = s.B.f5795i;
            Objects.requireNonNull(gjVar);
            yr<Boolean> yrVar = es.f8207u2;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                synchronized (gjVar.f8943b) {
                    gjVar.e();
                    h1 h1Var = s1.f16555i;
                    h1Var.removeCallbacks(gjVar.f8942a);
                    h1Var.postDelayed(gjVar.f8942a, ((Long) joVar.f10148c.a(es.f8215v2)).longValue());
                }
            }
            to1<I> b10 = this.f15053c.b(wo1Var, tz1Var);
            final q41 q41Var = this.f15061k;
            to1Var = b10.f(new xy1() { // from class: m4.um0
                @Override // m4.xy1
                public final tz1 h(Object obj) {
                    return q41.this.a((o50) obj);
                }
            });
        }
        return to1Var.a();
    }
}
