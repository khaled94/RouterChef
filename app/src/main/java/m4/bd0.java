package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.b1;
import java.io.IOException;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.s1;

@TargetApi(16)
/* loaded from: classes.dex */
public final class bd0 extends uc0 implements va0 {
    public long A;
    public long B;

    /* renamed from: v */
    public wa0 f6452v;

    /* renamed from: w */
    public String f6453w;

    /* renamed from: x */
    public boolean f6454x;
    public boolean y;

    /* renamed from: z */
    public lc0 f6455z;

    public bd0(fb0 fb0Var, eb0 eb0Var) {
        super(fb0Var);
        Context context = fb0Var.getContext();
        wa0 ld0Var = eb0Var.f7768l ? new ld0(context, eb0Var, this.f14360u.get()) : new dc0(context, eb0Var, this.f14360u.get());
        this.f6452v = ld0Var;
        ld0Var.y(this);
    }

    public static final String t(String str) {
        String valueOf = String.valueOf(g90.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public static String u(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        b1.b(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // m4.uc0, b4.f
    public final void a() {
        wa0 wa0Var = this.f6452v;
        if (wa0Var != null) {
            wa0Var.y(null);
            this.f6452v.t();
        }
    }

    @Override // m4.va0
    public final void b(int i10) {
    }

    @Override // m4.va0
    public final void c(Exception exc) {
        g1.k("Precache exception", exc);
        s.B.f5793g.f(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // m4.va0
    public final void d(final boolean z10, final long j3) {
        final fb0 fb0Var = this.f14360u.get();
        if (fb0Var != null) {
            u90.f14298e.execute(new Runnable() { // from class: m4.ad0
                @Override // java.lang.Runnable
                public final void run() {
                    fb0.this.d0(z10, j3);
                }
            });
        }
    }

    @Override // m4.va0
    public final void e(int i10, int i11) {
    }

    @Override // m4.va0
    public final void f(String str, Exception exc) {
        g1.k("Precache error", exc);
        s.B.f5793g.f(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // m4.uc0
    public final void h() {
        synchronized (this) {
            this.f6454x = true;
            notify();
            a();
        }
        String str = this.f6453w;
        if (str != null) {
            i(this.f6453w, t(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // m4.uc0
    public final void l(int i10) {
        this.f6452v.v(i10);
    }

    @Override // m4.uc0
    public final void m(int i10) {
        this.f6452v.x(i10);
    }

    @Override // m4.uc0
    public final void n(int i10) {
        this.f6452v.z(i10);
    }

    @Override // m4.uc0
    public final void o(int i10) {
        this.f6452v.A(i10);
    }

    @Override // m4.uc0
    public final boolean p(String str) {
        return r(str, new String[]{str});
    }

    @Override // m4.va0
    public final void q() {
        g1.j("Precache onRenderedFirstFrame");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // m4.uc0
    public final boolean r(String str, String[] strArr) {
        bd0 bd0Var;
        String str2;
        String str3;
        String str4;
        Exception e10;
        String str5;
        String str6;
        bd0 bd0Var2;
        String str7;
        Throwable th;
        String str8;
        String str9;
        bd0 bd0Var3;
        long j3;
        long j10;
        long j11;
        String str10;
        String str11;
        long j12;
        long j13;
        long j14;
        bd0 bd0Var4 = this;
        String str12 = str;
        bd0Var4.f6453w = str12;
        String t10 = t(str);
        String str13 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            bd0Var4.f6452v.r(uriArr, bd0Var4.f14359t);
            fb0 fb0Var = bd0Var4.f14360u.get();
            if (fb0Var != null) {
                fb0Var.y(t10, bd0Var4);
            }
            try {
                Objects.requireNonNull(s.B.f5796j);
                long currentTimeMillis = System.currentTimeMillis();
                yr<Long> yrVar = es.f8172q;
                jo joVar = jo.f10145d;
                long longValue = ((Long) joVar.f10148c.a(yrVar)).longValue();
                long longValue2 = ((Long) joVar.f10148c.a(es.p)).longValue() * 1000;
                long intValue = ((Integer) joVar.f10148c.a(es.f8157o)).intValue();
                boolean booleanValue = ((Boolean) joVar.f10148c.a(es.f8120j1)).booleanValue();
                String str14 = str12;
                bd0 bd0Var5 = bd0Var4;
                long j15 = -1;
                while (true) {
                    try {
                        synchronized (this) {
                            try {
                                if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                                    long j16 = longValue2;
                                    StringBuilder sb = new StringBuilder(47);
                                    sb.append("Timeout reached. Limit: ");
                                    sb.append(j16);
                                    sb.append(" ms");
                                    throw new IOException(sb.toString());
                                } else if (bd0Var5.f6454x) {
                                    throw new IOException("Abort requested before buffering finished. ");
                                } else {
                                    if (bd0Var5.y) {
                                        break;
                                    } else if (!bd0Var5.f6452v.H()) {
                                        throw new IOException("ExoPlayer was released during preloading.");
                                    } else {
                                        long j17 = longValue;
                                        long Q = bd0Var5.f6452v.Q();
                                        if (Q > 0) {
                                            long M = bd0Var5.f6452v.M();
                                            if (M != j15) {
                                                try {
                                                    j10 = intValue;
                                                    long j18 = Q;
                                                    j3 = longValue2;
                                                    j12 = j17;
                                                    str11 = t10;
                                                    try {
                                                        k(str, t10, M, j18, M > 0, booleanValue ? bd0Var5.f6452v.R() : -1L, booleanValue ? bd0Var5.f6452v.O() : -1L, booleanValue ? bd0Var5.f6452v.S() : -1L, wa0.J(), wa0.L());
                                                        j13 = M;
                                                        j14 = Q;
                                                        str9 = j18;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        bd0Var5 = this;
                                                        bd0Var = bd0Var5;
                                                        str14 = str;
                                                        str7 = str14;
                                                        str2 = str11;
                                                        while (true) {
                                                            try {
                                                                try {
                                                                    break;
                                                                } catch (Exception e11) {
                                                                    e10 = e11;
                                                                    str4 = str13;
                                                                    str3 = str7;
                                                                    String message = e10.getMessage();
                                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message).length());
                                                                    sb2.append("Failed to preload url ");
                                                                    sb2.append(str14);
                                                                    sb2.append(" Exception: ");
                                                                    sb2.append(message);
                                                                    g1.j(sb2.toString());
                                                                    s.B.f5793g.f(e10, "VideoStreamExoPlayerCache.preload");
                                                                    bd0Var.a();
                                                                    bd0Var5.i(str14, str2, str4, u(str4, e10));
                                                                    return false;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    str11 = t10;
                                                }
                                            } else {
                                                j10 = intValue;
                                                j3 = longValue2;
                                                str11 = t10;
                                                j12 = j17;
                                                j14 = Q;
                                                j13 = j15;
                                                str9 = intValue;
                                            }
                                            bd0Var3 = (M > j14 ? 1 : (M == j14 ? 0 : -1));
                                            if (bd0Var3 >= 0) {
                                                bd0Var3 = this;
                                                str9 = str;
                                                str8 = str11;
                                                bd0Var3.j(str9, str8, j14);
                                                break;
                                            }
                                            try {
                                                bd0Var3 = this;
                                                str9 = str;
                                                str8 = str11;
                                                if (bd0Var3.f6452v.N() >= j10 && M > 0) {
                                                    break;
                                                }
                                                bd0Var5 = bd0Var3;
                                                str14 = str9;
                                                j11 = j12;
                                                str10 = j13;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                bd0Var5 = bd0Var3;
                                                bd0Var = bd0Var5;
                                                str14 = str9;
                                                str7 = str9;
                                                str2 = str8;
                                                while (true) {
                                                    break;
                                                    break;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            j10 = intValue;
                                            j3 = longValue2;
                                            str9 = str12;
                                            str8 = t10;
                                            bd0Var3 = bd0Var4;
                                            j11 = j17;
                                            str10 = j15;
                                        }
                                        try {
                                            try {
                                                try {
                                                    bd0Var5.wait(j11);
                                                } catch (InterruptedException unused) {
                                                    throw new IOException("Wait interrupted.");
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                str13 = str10;
                                                bd0Var = bd0Var3;
                                                str7 = str9;
                                                str2 = str8;
                                                while (true) {
                                                    break;
                                                    break;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bd0Var = bd0Var3;
                                            str7 = str9;
                                            str2 = str8;
                                            while (true) {
                                                break;
                                                break;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                str9 = str12;
                                str8 = t10;
                                bd0Var3 = bd0Var4;
                            }
                        }
                        bd0Var4 = bd0Var3;
                        str12 = str9;
                        t10 = str8;
                        longValue = j11;
                        intValue = j10;
                        longValue2 = j3;
                        j15 = str10;
                    } catch (Exception e12) {
                        e10 = e12;
                        str6 = str12;
                        str5 = t10;
                        bd0Var2 = bd0Var4;
                        str12 = str14;
                        bd0Var4 = bd0Var5;
                        str2 = str5;
                        str14 = str12;
                        bd0Var5 = bd0Var4;
                        str4 = str13;
                        bd0Var = bd0Var2;
                        str3 = str6;
                        String message2 = e10.getMessage();
                        StringBuilder sb22 = new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message2).length());
                        sb22.append("Failed to preload url ");
                        sb22.append(str14);
                        sb22.append(" Exception: ");
                        sb22.append(message2);
                        g1.j(sb22.toString());
                        s.B.f5793g.f(e10, "VideoStreamExoPlayerCache.preload");
                        bd0Var.a();
                        bd0Var5.i(str14, str2, str4, u(str4, e10));
                        return false;
                    }
                }
                return true;
            } catch (Exception e13) {
                e10 = e13;
                str6 = str12;
                str5 = t10;
                bd0Var2 = bd0Var4;
                bd0Var4 = bd0Var2;
                str12 = str6;
            }
        } catch (Exception e14) {
            e10 = e14;
            str6 = str12;
            str5 = t10;
            bd0Var2 = bd0Var4;
        }
    }

    @Override // m4.uc0
    public final boolean s(String str, String[] strArr, lc0 lc0Var) {
        this.f6453w = str;
        this.f6455z = lc0Var;
        String t10 = t(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f6452v.r(uriArr, this.f14359t);
            fb0 fb0Var = this.f14360u.get();
            if (fb0Var != null) {
                fb0Var.y(t10, this);
            }
            Objects.requireNonNull(s.B.f5796j);
            this.A = System.currentTimeMillis();
            this.B = -1L;
            s1.f16555i.postDelayed(new ne(this, 1), 0L);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            g1.j(sb.toString());
            s.B.f5793g.f(e10, "VideoStreamExoPlayerCache.preload");
            a();
            i(str, t10, "error", u("error", e10));
            return false;
        }
    }
}
