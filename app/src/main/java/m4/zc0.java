package m4;

import android.net.Uri;
import androidx.fragment.app.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class zc0 extends uc0 implements ng<bg> {
    public ByteBuffer A;
    public boolean B;
    public final String D;
    public final int E;
    public boolean F;

    /* renamed from: v */
    public String f16144v;

    /* renamed from: w */
    public final eb0 f16145w;

    /* renamed from: x */
    public boolean f16146x;
    public final yc0 y = new yc0();

    /* renamed from: z */
    public final gc0 f16147z = new gc0();
    public final Object C = new Object();

    public zc0(fb0 fb0Var, eb0 eb0Var) {
        super(fb0Var);
        this.f16145w = eb0Var;
        this.D = fb0Var.r();
        this.E = fb0Var.f();
    }

    public static final String t(String str) {
        String valueOf = String.valueOf(g90.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // m4.ng
    public final /* bridge */ /* synthetic */ void f0(int i10) {
    }

    @Override // m4.ng
    public final void g0(bg bgVar, dg dgVar) {
        this.y.f15652a.add((gg) bgVar);
    }

    @Override // m4.uc0
    public final void h() {
        this.f16146x = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // m4.uc0
    public final boolean p(String str) {
        String str2;
        Exception e10;
        Object obj;
        bg bgVar;
        this.f16144v = str;
        String t10 = t(str);
        int i10 = 0;
        try {
            String str3 = this.f14359t;
            eb0 eb0Var = this.f16145w;
            bg ggVar = new gg(str3, this, eb0Var.f7760d, eb0Var.f7761e);
            if (this.f16145w.f7765i) {
                ggVar = new xb0(this.f14358s, ggVar, this.D, this.E, null, null);
            }
            ggVar.f(new dg(Uri.parse(str), 0L, 0L, -1L));
            fb0 fb0Var = this.f14360u.get();
            if (fb0Var != null) {
                fb0Var.y(t10, this);
            }
            Objects.requireNonNull(s.B.f5796j);
            long currentTimeMillis = System.currentTimeMillis();
            yr<Long> yrVar = es.f8172q;
            jo joVar = jo.f10145d;
            long longValue = ((Long) joVar.f10148c.a(yrVar)).longValue();
            long longValue2 = ((Long) joVar.f10148c.a(es.p)).longValue();
            this.A = ByteBuffer.allocate(this.f16145w.f7759c);
            int i11 = 8192;
            byte[] bArr = new byte[8192];
            obj = "error";
            long j3 = currentTimeMillis;
            while (true) {
                try {
                    int e11 = ggVar.e(bArr, i10, Math.min(this.A.remaining(), i11));
                    if (e11 == -1) {
                        this.F = true;
                        j(str, t10, (int) this.f16147z.a(this.A));
                        return true;
                    }
                    str2 = this.C;
                    synchronized (str2) {
                        if (!this.f16146x) {
                            bgVar = ggVar;
                            this.A.put(bArr, 0, e11);
                        } else {
                            bgVar = ggVar;
                        }
                    }
                    if (this.A.remaining() <= 0) {
                        u();
                        return true;
                    }
                    try {
                        if (this.f16146x) {
                            int limit = this.A.limit();
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Precache abort at ");
                            sb.append(limit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (currentTimeMillis2 - j3 >= longValue) {
                            u();
                            j3 = currentTimeMillis2;
                        }
                        if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                            StringBuilder sb2 = new StringBuilder(49);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(longValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        i11 = 8192;
                        i10 = 0;
                        ggVar = bgVar;
                    } catch (Exception e12) {
                        e10 = e12;
                        String canonicalName = e10.getClass().getCanonicalName();
                        String message = e10.getMessage();
                        String b10 = a.b(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                        StringBuilder sb3 = new StringBuilder(b10.length() + String.valueOf(str).length() + 34);
                        sb3.append("Failed to preload url ");
                        sb3.append(str);
                        sb3.append(" Exception: ");
                        sb3.append(b10);
                        g1.j(sb3.toString());
                        i(str, t10, str2, b10);
                        return false;
                    }
                } catch (Exception e13) {
                    e10 = e13;
                    str2 = obj;
                    String canonicalName2 = e10.getClass().getCanonicalName();
                    String message2 = e10.getMessage();
                    String b102 = a.b(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                    StringBuilder sb32 = new StringBuilder(b102.length() + String.valueOf(str).length() + 34);
                    sb32.append("Failed to preload url ");
                    sb32.append(str);
                    sb32.append(" Exception: ");
                    sb32.append(b102);
                    g1.j(sb32.toString());
                    i(str, t10, str2, b102);
                    return false;
                }
            }
        } catch (Exception e14) {
            e10 = e14;
            obj = "error";
        }
    }

    public final void u() {
        yc0 yc0Var = this.y;
        Iterator<gg> it = yc0Var.f15652a.iterator();
        while (it.hasNext()) {
            HttpURLConnection httpURLConnection = it.next().f8858g;
            Map<String, List<String>> headerFields = httpURLConnection == null ? null : httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            yc0Var.f15653b = Math.max(yc0Var.f15653b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        int i10 = (int) yc0Var.f15653b;
        int a10 = (int) this.f16147z.a(this.A);
        int position = this.A.position();
        int round = Math.round((position / i10) * a10);
        boolean z10 = round > 0;
        int J = wa0.J();
        int L = wa0.L();
        String str = this.f16144v;
        g90.f8771b.post(new qc0(this, str, t(str), position, i10, round, a10, z10, J, L));
    }
}
