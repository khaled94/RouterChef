package y4;

import android.os.SystemClock;
import android.util.Pair;
import i3.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f5 extends v5 {
    public final c2 A;
    public final c2 B;
    public final c2 C;

    /* renamed from: v */
    public String f20452v;

    /* renamed from: w */
    public boolean f20453w;

    /* renamed from: x */
    public long f20454x;
    public final c2 y;

    /* renamed from: z */
    public final c2 f20455z;

    public f5(a6 a6Var) {
        super(a6Var);
        g2 s10 = ((w2) this.f20505s).s();
        Objects.requireNonNull(s10);
        this.y = new c2(s10, "last_delete_stale", 0L);
        g2 s11 = ((w2) this.f20505s).s();
        Objects.requireNonNull(s11);
        this.f20455z = new c2(s11, "backoff", 0L);
        g2 s12 = ((w2) this.f20505s).s();
        Objects.requireNonNull(s12);
        this.A = new c2(s12, "last_upload", 0L);
        g2 s13 = ((w2) this.f20505s).s();
        Objects.requireNonNull(s13);
        this.B = new c2(s13, "last_upload_attempt", 0L);
        g2 s14 = ((w2) this.f20505s).s();
        Objects.requireNonNull(s14);
        this.C = new c2(s14, "midnight_offset", 0L);
    }

    @Override // y4.v5
    public final void j() {
    }

    @Deprecated
    public final Pair<String, Boolean> k(String str) {
        g();
        Objects.requireNonNull(((w2) this.f20505s).F);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.f20452v;
        if (str2 == null || elapsedRealtime >= this.f20454x) {
            this.f20454x = ((w2) this.f20505s).y.p(str, f1.f20399b) + elapsedRealtime;
            try {
                a.C0075a b10 = a.b(((w2) this.f20505s).f20786s);
                this.f20452v = "";
                String str3 = b10.f5258a;
                if (str3 != null) {
                    this.f20452v = str3;
                }
                this.f20453w = b10.f5259b;
            } catch (Exception e10) {
                ((w2) this.f20505s).C().E.b("Unable to get advertising id", e10);
                this.f20452v = "";
            }
            return new Pair<>(this.f20452v, Boolean.valueOf(this.f20453w));
        }
        return new Pair<>(str2, Boolean.valueOf(this.f20453w));
    }

    public final Pair<String, Boolean> l(String str, f fVar) {
        return fVar.f() ? k(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    public final String m(String str) {
        g();
        String str2 = (String) k(str).first;
        MessageDigest q10 = h6.q();
        if (q10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, q10.digest(str2.getBytes())));
    }
}
