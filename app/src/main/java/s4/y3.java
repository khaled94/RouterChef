package s4;

import android.os.Build;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y3 extends b7<y3, x3> implements e8 {
    public static final /* synthetic */ int zza = 0;
    private static final y3 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private h7<k3> zzH;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private c4 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private u3 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private h7<o3> zzi;
    private h7<i4> zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private f7 zzU = d7.f17798v;
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";

    static {
        y3 y3Var = new y3();
        zze = y3Var;
        b7.l(y3.class, y3Var);
    }

    public y3() {
        m8<Object> m8Var = m8.f17993v;
        this.zzi = m8Var;
        this.zzj = m8Var;
        this.zzH = m8Var;
    }

    public static /* synthetic */ void A0(y3 y3Var, long j3) {
        y3Var.zzf |= 2;
        y3Var.zzk = j3;
    }

    public static /* synthetic */ void B0(y3 y3Var, long j3) {
        y3Var.zzf |= 4;
        y3Var.zzl = j3;
    }

    public static /* synthetic */ void C0(y3 y3Var, long j3) {
        y3Var.zzf |= 8;
        y3Var.zzm = j3;
    }

    public static /* synthetic */ void D0(y3 y3Var, long j3) {
        y3Var.zzf |= 16;
        y3Var.zzn = j3;
    }

    public static /* synthetic */ void E0(y3 y3Var) {
        y3Var.zzf &= -17;
        y3Var.zzn = 0L;
    }

    public static /* synthetic */ void F0(y3 y3Var, long j3) {
        y3Var.zzf |= 32;
        y3Var.zzo = j3;
    }

    public static /* synthetic */ void G0(y3 y3Var) {
        y3Var.zzf &= -33;
        y3Var.zzo = 0L;
    }

    public static /* synthetic */ void H0(y3 y3Var) {
        y3Var.zzf |= 64;
        y3Var.zzp = "android";
    }

    public static /* synthetic */ void I(y3 y3Var, long j3) {
        y3Var.zzf |= 1073741824;
        y3Var.zzO = j3;
    }

    public static /* synthetic */ void I0(y3 y3Var) {
        String str = Build.VERSION.RELEASE;
        Objects.requireNonNull(str);
        y3Var.zzf |= 128;
        y3Var.zzq = str;
    }

    public static /* synthetic */ void J(y3 y3Var) {
        y3Var.zzf &= Integer.MAX_VALUE;
        y3Var.zzP = zze.zzP;
    }

    public static /* synthetic */ void J0(y3 y3Var) {
        String str = Build.MODEL;
        Objects.requireNonNull(str);
        y3Var.zzf |= 256;
        y3Var.zzr = str;
    }

    public static /* synthetic */ void K(y3 y3Var, int i10) {
        y3Var.zzg |= 2;
        y3Var.zzR = i10;
    }

    public static /* synthetic */ void K0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzf |= 512;
        y3Var.zzs = str;
    }

    public static /* synthetic */ void L(y3 y3Var, int i10, o3 o3Var) {
        y3Var.S0();
        y3Var.zzi.set(i10, o3Var);
    }

    public static /* synthetic */ void L0(y3 y3Var, int i10) {
        y3Var.zzf |= 1024;
        y3Var.zzt = i10;
    }

    public static /* synthetic */ void M(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzg |= 4;
        y3Var.zzS = str;
    }

    public static /* synthetic */ void M0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzf |= 2048;
        y3Var.zzu = str;
    }

    public static void N(y3 y3Var, Iterable iterable) {
        f7 f7Var = y3Var.zzU;
        if (!((y5) f7Var).f18203s) {
            d7 d7Var = (d7) f7Var;
            int i10 = d7Var.f17800u;
            y3Var.zzU = d7Var.j(i10 == 0 ? 10 : i10 + i10);
        }
        x5.g(iterable, y3Var.zzU);
    }

    public static /* synthetic */ void N0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzf |= 4096;
        y3Var.zzv = str;
    }

    public static /* synthetic */ void O(y3 y3Var, o3 o3Var) {
        y3Var.S0();
        y3Var.zzi.add(o3Var);
    }

    public static /* synthetic */ void O0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzf |= 8192;
        y3Var.zzw = str;
    }

    public static /* synthetic */ void P(y3 y3Var, long j3) {
        y3Var.zzg |= 16;
        y3Var.zzV = j3;
    }

    public static /* synthetic */ void P0(y3 y3Var, long j3) {
        y3Var.zzf |= 16384;
        y3Var.zzx = j3;
    }

    public static /* synthetic */ void Q(y3 y3Var, long j3) {
        y3Var.zzg |= 32;
        y3Var.zzW = j3;
    }

    public static /* synthetic */ void Q0(y3 y3Var) {
        y3Var.zzf |= 32768;
        y3Var.zzy = 43042L;
    }

    public static /* synthetic */ void S(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzf |= 65536;
        y3Var.zzz = str;
    }

    public static /* synthetic */ void T(y3 y3Var) {
        y3Var.zzf &= -65537;
        y3Var.zzz = zze.zzz;
    }

    public static /* synthetic */ void U(y3 y3Var, boolean z10) {
        y3Var.zzf |= 131072;
        y3Var.zzA = z10;
    }

    public static /* synthetic */ void V(y3 y3Var) {
        y3Var.zzf &= -131073;
        y3Var.zzA = false;
    }

    public static /* synthetic */ void W(y3 y3Var, String str) {
        y3Var.zzf |= 262144;
        y3Var.zzB = str;
    }

    public static /* synthetic */ void X(y3 y3Var) {
        y3Var.zzf &= -262145;
        y3Var.zzB = zze.zzB;
    }

    public static /* synthetic */ void Y(y3 y3Var, long j3) {
        y3Var.zzf |= 524288;
        y3Var.zzC = j3;
    }

    public static /* synthetic */ void Z(y3 y3Var, int i10) {
        y3Var.zzf |= 1048576;
        y3Var.zzD = i10;
    }

    public static /* synthetic */ void a0(y3 y3Var, String str) {
        y3Var.zzf |= 2097152;
        y3Var.zzE = str;
    }

    public static /* synthetic */ void b0(y3 y3Var) {
        y3Var.zzf &= -2097153;
        y3Var.zzE = zze.zzE;
    }

    public static /* synthetic */ void c0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzf |= 4194304;
        y3Var.zzF = str;
    }

    public static /* synthetic */ void d0(y3 y3Var) {
        y3Var.zzf |= 8388608;
        y3Var.zzG = false;
    }

    public static /* synthetic */ void e0(y3 y3Var, Iterable iterable) {
        h7<k3> h7Var = y3Var.zzH;
        if (!h7Var.c()) {
            y3Var.zzH = b7.j(h7Var);
        }
        x5.g(iterable, y3Var.zzH);
    }

    public static void f0(y3 y3Var) {
        y3Var.zzH = m8.f17993v;
    }

    public static /* synthetic */ void g0(y3 y3Var, String str) {
        y3Var.zzf |= 16777216;
        y3Var.zzI = str;
    }

    public static /* synthetic */ void h0(y3 y3Var, int i10) {
        y3Var.zzf |= 33554432;
        y3Var.zzJ = i10;
    }

    public static /* synthetic */ void i0(y3 y3Var) {
        y3Var.zzf |= 1;
        y3Var.zzh = 1;
    }

    public static /* synthetic */ void j0(y3 y3Var) {
        y3Var.zzf &= -268435457;
        y3Var.zzM = zze.zzM;
    }

    public static /* synthetic */ void k0(y3 y3Var, long j3) {
        y3Var.zzf |= 536870912;
        y3Var.zzN = j3;
    }

    public static /* synthetic */ void s0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzg |= 64;
        y3Var.zzX = str;
    }

    public static /* synthetic */ void t0(y3 y3Var, String str) {
        Objects.requireNonNull(str);
        y3Var.zzg |= 128;
        y3Var.zzY = str;
    }

    public static /* synthetic */ void u0(y3 y3Var, Iterable iterable) {
        y3Var.S0();
        x5.g(iterable, y3Var.zzi);
    }

    public static void v0(y3 y3Var) {
        y3Var.zzi = m8.f17993v;
    }

    public static /* synthetic */ void w0(y3 y3Var, int i10) {
        y3Var.S0();
        y3Var.zzi.remove(i10);
    }

    public static /* synthetic */ void x0(y3 y3Var, int i10, i4 i4Var) {
        y3Var.T0();
        y3Var.zzj.set(i10, i4Var);
    }

    public static /* synthetic */ void y0(y3 y3Var, i4 i4Var) {
        y3Var.T0();
        y3Var.zzj.add(i4Var);
    }

    public static /* synthetic */ void z0(y3 y3Var, int i10) {
        y3Var.T0();
        y3Var.zzj.remove(i10);
    }

    public static x3 z1() {
        return zze.n();
    }

    public final String A() {
        return this.zzE;
    }

    public final String B() {
        return this.zzq;
    }

    public final i4 B1(int i10) {
        return this.zzj.get(i10);
    }

    public final String C() {
        return this.zzp;
    }

    public final String C1() {
        return this.zzS;
    }

    public final String D() {
        return this.zzz;
    }

    public final String D1() {
        return this.zzv;
    }

    public final String E() {
        return this.zzs;
    }

    public final String E1() {
        return this.zzB;
    }

    public final List<k3> F() {
        return this.zzH;
    }

    public final List<o3> G() {
        return this.zzi;
    }

    public final List<i4> H() {
        return this.zzj;
    }

    public final int R() {
        return this.zzJ;
    }

    public final int R0() {
        return this.zzD;
    }

    public final void S0() {
        h7<o3> h7Var = this.zzi;
        if (!h7Var.c()) {
            this.zzi = b7.j(h7Var);
        }
    }

    public final void T0() {
        h7<i4> h7Var = this.zzj;
        if (!h7Var.c()) {
            this.zzj = b7.j(h7Var);
        }
    }

    public final boolean U0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean V0() {
        return (this.zzg & 16) != 0;
    }

    public final boolean W0() {
        return (this.zzf & 8) != 0;
    }

    public final boolean X0() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean Z0() {
        return (this.zzf & 32) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean b1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean c1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean d1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean e1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean f1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 32768) != 0;
    }

    public final int i1() {
        return this.zzi.size();
    }

    public final int j1() {
        return this.zzh;
    }

    public final int k1() {
        return this.zzR;
    }

    public final boolean l0() {
        return this.zzA;
    }

    public final int l1() {
        return this.zzt;
    }

    public final boolean m0() {
        return this.zzG;
    }

    public final int m1() {
        return this.zzj.size();
    }

    public final boolean n0() {
        return (this.zzf & 1073741824) != 0;
    }

    public final long n1() {
        return this.zzO;
    }

    public final boolean o0() {
        return (this.zzf & 33554432) != 0;
    }

    public final long o1() {
        return this.zzN;
    }

    public final boolean p0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long p1() {
        return this.zzC;
    }

    public final boolean q0() {
        return (this.zzf & 536870912) != 0;
    }

    public final long q1() {
        return this.zzV;
    }

    @Override // s4.b7
    public final Object r(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new n8(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", o3.class, "zzj", i4.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", k3.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", g3.f17875a, "zzaa", "zzab", "zzac", "zzad"});
            }
            if (i11 == 3) {
                return new y3();
            }
            if (i11 == 4) {
                return new x3(null);
            }
            if (i11 == 5) {
                return zze;
            }
            return null;
        }
        return (byte) 1;
    }

    public final boolean r0() {
        return (this.zzg & 128) != 0;
    }

    public final long r1() {
        return this.zzm;
    }

    public final String s() {
        return this.zzu;
    }

    public final long s1() {
        return this.zzx;
    }

    public final String t() {
        return this.zzw;
    }

    public final long t1() {
        return this.zzo;
    }

    public final String u() {
        return this.zzY;
    }

    public final long u1() {
        return this.zzn;
    }

    public final String v() {
        return this.zzr;
    }

    public final long v1() {
        return this.zzl;
    }

    public final String w() {
        return this.zzP;
    }

    public final long w1() {
        return this.zzk;
    }

    public final String x() {
        return this.zzI;
    }

    public final long x1() {
        return this.zzy;
    }

    public final String y() {
        return this.zzX;
    }

    public final o3 y1(int i10) {
        return this.zzi.get(i10);
    }

    public final String z() {
        return this.zzF;
    }
}
