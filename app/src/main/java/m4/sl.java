package m4;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sl extends m92<sl, rl> implements ra2 {
    private static final r92<Integer, mk> zzb = new ql();
    private static final sl zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private q92 zzk = n92.f11578v;
    private nl zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        sl slVar = new sl();
        zze = slVar;
        m92.n(sl.class, slVar);
    }

    public static rl C() {
        return zze.q();
    }

    public static sl E(byte[] bArr) {
        m92 k10 = m92.k(zze, bArr, bArr.length, z82.a());
        m92.j(k10);
        return (sl) k10;
    }

    public static /* synthetic */ void H(sl slVar, long j3) {
        slVar.zzf |= 1;
        slVar.zzg = j3;
    }

    public static /* synthetic */ void I(sl slVar, long j3) {
        slVar.zzf |= 4;
        slVar.zzi = j3;
    }

    public static /* synthetic */ void J(sl slVar, long j3) {
        slVar.zzf |= 8;
        slVar.zzj = j3;
    }

    public static void K(sl slVar, Iterable iterable) {
        q92 q92Var = slVar.zzk;
        if (!((c82) q92Var).f6742s) {
            n92 n92Var = (n92) q92Var;
            int i10 = n92Var.f11580u;
            slVar.zzk = n92Var.j(i10 == 0 ? 10 : i10 + i10);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((n92) slVar.zzk).h(((mk) it.next()).f11232s);
        }
    }

    public static /* synthetic */ void L(sl slVar, nl nlVar) {
        Objects.requireNonNull(nlVar);
        slVar.zzl = nlVar;
        slVar.zzf |= 16;
    }

    public static /* synthetic */ void M(sl slVar, int i10) {
        slVar.zzf |= 256;
        slVar.zzp = i10;
    }

    public static void N(sl slVar, vl vlVar) {
        slVar.zzr = vlVar.f14723s;
        slVar.zzf |= 1024;
    }

    public static /* synthetic */ void T(sl slVar, int i10) {
        slVar.zzh = i10 - 1;
        slVar.zzf |= 2;
    }

    public static /* synthetic */ void U(sl slVar, int i10) {
        slVar.zzm = i10 - 1;
        slVar.zzf |= 32;
    }

    public static /* synthetic */ void V(sl slVar, int i10) {
        slVar.zzn = i10 - 1;
        slVar.zzf |= 64;
    }

    public static /* synthetic */ void v(sl slVar, int i10) {
        slVar.zzo = i10 - 1;
        slVar.zzf |= 128;
    }

    public static /* synthetic */ void w(sl slVar, int i10) {
        slVar.zzq = i10 - 1;
        slVar.zzf |= 512;
    }

    public final long A() {
        return this.zzg;
    }

    public final nl B() {
        nl nlVar = this.zzl;
        return nlVar == null ? nl.x() : nlVar;
    }

    public final vl F() {
        vl b10 = vl.b(this.zzr);
        return b10 == null ? vl.UNSPECIFIED : b10;
    }

    public final List<mk> G() {
        return new s92(this.zzk);
    }

    public final int O() {
        int a10 = eb.a(this.zzn);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int P() {
        int a10 = eb.a(this.zzo);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int Q() {
        int a10 = eb.a(this.zzq);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int R() {
        int a10 = eb.a(this.zzh);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int S() {
        int a10 = eb.a(this.zzm);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                bl blVar = bl.f6562a;
                return new ab2(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", blVar, "zzi", "zzj", "zzk", lk.f10880a, "zzl", "zzm", blVar, "zzn", blVar, "zzo", blVar, "zzp", "zzq", blVar, "zzr", ul.f14443a});
            } else if (i11 == 3) {
                return new sl();
            } else {
                if (i11 == 4) {
                    return new rl(null);
                }
                if (i11 == 5) {
                    return zze;
                }
                return null;
            }
        }
        return (byte) 1;
    }

    public final int x() {
        return this.zzp;
    }

    public final long y() {
        return this.zzj;
    }

    public final long z() {
        return this.zzi;
    }
}
