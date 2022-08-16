package m4;

import android.os.Bundle;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.i1;

/* loaded from: classes.dex */
public final class a90 {

    /* renamed from: g */
    public final String f6080g;

    /* renamed from: h */
    public final i1 f6081h;

    /* renamed from: a */
    public long f6074a = -1;

    /* renamed from: b */
    public long f6075b = -1;
    @GuardedBy("lock")

    /* renamed from: c */
    public int f6076c = -1;

    /* renamed from: d */
    public int f6077d = -1;

    /* renamed from: e */
    public long f6078e = 0;

    /* renamed from: f */
    public final Object f6079f = new Object();
    @GuardedBy("lock")

    /* renamed from: i */
    public int f6082i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    public int f6083j = 0;

    public a90(String str, i1 i1Var) {
        this.f6080g = str;
        this.f6081h = i1Var;
    }

    public final void a(jn jnVar, long j3) {
        synchronized (this.f6079f) {
            long c10 = this.f6081h.c();
            Objects.requireNonNull(s.B.f5796j);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f6075b == -1) {
                if (currentTimeMillis - c10 > ((Long) jo.f10145d.f10148c.a(es.A0)).longValue()) {
                    this.f6077d = -1;
                } else {
                    this.f6077d = this.f6081h.a();
                }
                this.f6075b = j3;
            }
            this.f6074a = j3;
            Bundle bundle = jnVar.f10130u;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f6076c++;
            int i10 = this.f6077d + 1;
            this.f6077d = i10;
            if (i10 == 0) {
                this.f6078e = 0L;
                this.f6081h.d(currentTimeMillis);
            } else {
                this.f6078e = currentTimeMillis - this.f6081h.g();
            }
        }
    }

    public final void b() {
        if (st.f13817a.e().booleanValue()) {
            synchronized (this.f6079f) {
                this.f6076c--;
                this.f6077d--;
            }
        }
    }
}
