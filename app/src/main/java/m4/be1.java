package m4;

import android.os.Bundle;
import java.util.Objects;
import l3.s;
import n3.k1;

/* loaded from: classes.dex */
public final class be1 implements eh1 {

    /* renamed from: g */
    public static final Object f6475g = new Object();

    /* renamed from: a */
    public final String f6476a;

    /* renamed from: b */
    public final String f6477b;

    /* renamed from: c */
    public final bn0 f6478c;

    /* renamed from: d */
    public final cn1 f6479d;

    /* renamed from: e */
    public final om1 f6480e;

    /* renamed from: f */
    public final k1 f6481f = (k1) s.B.f5793g.c();

    public be1(String str, String str2, bn0 bn0Var, cn1 cn1Var, om1 om1Var) {
        this.f6476a = str;
        this.f6477b = str2;
        this.f6478c = bn0Var;
        this.f6479d = cn1Var;
        this.f6480e = om1Var;
    }

    @Override // m4.eh1
    public final tz1 a() {
        final Bundle bundle = new Bundle();
        if (((Boolean) jo.f10145d.f10148c.a(es.f8231x3)).booleanValue()) {
            this.f6478c.b(this.f6480e.f12203d);
            bundle.putAll(this.f6479d.a());
        }
        return mz1.m(new dh1() { // from class: m4.ae1
            @Override // m4.dh1
            public final void h(Object obj) {
                be1 be1Var = be1.this;
                Bundle bundle2 = bundle;
                Bundle bundle3 = (Bundle) obj;
                Objects.requireNonNull(be1Var);
                yr<Boolean> yrVar = es.f8231x3;
                jo joVar = jo.f10145d;
                if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                    bundle3.putBundle("quality_signals", bundle2);
                } else {
                    if (((Boolean) joVar.f10148c.a(es.f8224w3)).booleanValue()) {
                        synchronized (be1.f6475g) {
                            be1Var.f6478c.b(be1Var.f6480e.f12203d);
                            bundle3.putBundle("quality_signals", be1Var.f6479d.a());
                        }
                    } else {
                        be1Var.f6478c.b(be1Var.f6480e.f12203d);
                        bundle3.putBundle("quality_signals", be1Var.f6479d.a());
                    }
                }
                bundle3.putString("seq_num", be1Var.f6476a);
                bundle3.putString("session_id", be1Var.f6481f.J() ? "" : be1Var.f6477b);
            }
        });
    }
}
