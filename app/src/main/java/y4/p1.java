package y4;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import h4.g;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f20639s;

    /* renamed from: t */
    public final /* synthetic */ String f20640t;

    /* renamed from: u */
    public final /* synthetic */ Object f20641u;

    /* renamed from: v */
    public final /* synthetic */ Object f20642v;

    /* renamed from: w */
    public final /* synthetic */ Object f20643w;

    /* renamed from: x */
    public final /* synthetic */ s1 f20644x;

    public p1(s1 s1Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f20644x = s1Var;
        this.f20639s = i10;
        this.f20640t = str;
        this.f20641u = obj;
        this.f20642v = obj2;
        this.f20643w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        s1 s1Var;
        g2 s10 = ((w2) this.f20644x.f20505s).s();
        if (s10.m()) {
            s1 s1Var2 = this.f20644x;
            if (s1Var2.f20707u == 0) {
                e eVar = ((w2) s1Var2.f20505s).y;
                if (eVar.f20370v == null) {
                    synchronized (eVar) {
                        if (eVar.f20370v == null) {
                            ApplicationInfo applicationInfo = ((w2) eVar.f20505s).f20786s.getApplicationInfo();
                            String a10 = g.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                eVar.f20370v = Boolean.valueOf(str != null && str.equals(a10));
                            }
                            if (eVar.f20370v == null) {
                                eVar.f20370v = Boolean.TRUE;
                                ((w2) eVar.f20505s).C().f20710x.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (eVar.f20370v.booleanValue()) {
                    s1Var = this.f20644x;
                    Objects.requireNonNull((w2) s1Var.f20505s);
                    c10 = 'C';
                } else {
                    s1Var = this.f20644x;
                    Objects.requireNonNull((w2) s1Var.f20505s);
                    c10 = 'c';
                }
                s1Var.f20707u = c10;
            }
            s1 s1Var3 = this.f20644x;
            if (s1Var3.f20708v < 0) {
                ((w2) s1Var3.f20505s).y.o();
                s1Var3.f20708v = 43042L;
            }
            char charAt = "01VDIWEA?".charAt(this.f20639s);
            s1 s1Var4 = this.f20644x;
            char c11 = s1Var4.f20707u;
            long j3 = s1Var4.f20708v;
            String t10 = s1.t(true, this.f20640t, this.f20641u, this.f20642v, this.f20643w);
            StringBuilder sb = new StringBuilder(String.valueOf(t10).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c11);
            sb.append(j3);
            sb.append(":");
            sb.append(t10);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f20640t.substring(0, 1024);
            }
            d2 d2Var = s10.f20468v;
            if (d2Var == null) {
                return;
            }
            d2Var.f20354e.g();
            if (d2Var.f20354e.n().getLong(d2Var.f20350a, 0L) == 0) {
                d2Var.a();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            long j10 = d2Var.f20354e.n().getLong(d2Var.f20351b, 0L);
            if (j10 <= 0) {
                SharedPreferences.Editor edit = d2Var.f20354e.n().edit();
                edit.putString(d2Var.f20352c, sb2);
                edit.putLong(d2Var.f20351b, 1L);
                edit.apply();
                return;
            }
            long nextLong = ((w2) d2Var.f20354e.f20505s).z().r().nextLong();
            long j11 = j10 + 1;
            SharedPreferences.Editor edit2 = d2Var.f20354e.n().edit();
            if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j11) {
                edit2.putString(d2Var.f20352c, sb2);
            }
            edit2.putLong(d2Var.f20351b, j11);
            edit2.apply();
            return;
        }
        Log.println(6, this.f20644x.v(), "Persisted config not initialized. Not logging error/warn");
    }
}
