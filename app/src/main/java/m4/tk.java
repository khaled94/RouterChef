package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tk extends m92<tk, rk> implements ra2 {
    private static final tk zzb;
    private int zze;
    private String zzf = "";
    private u92<ok> zzg = za2.f16072v;
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        tk tkVar = new tk();
        zzb = tkVar;
        m92.n(tk.class, tkVar);
    }

    public static tk w() {
        return zzb;
    }

    public static /* synthetic */ void x(tk tkVar, String str) {
        Objects.requireNonNull(str);
        tkVar.zze |= 1;
        tkVar.zzf = str;
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                bl blVar = bl.f6562a;
                return new ab2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", ok.class, "zzh", blVar, "zzi", blVar, "zzj", blVar});
            } else if (i11 == 3) {
                return new tk();
            } else {
                if (i11 == 4) {
                    return new rk(null);
                }
                if (i11 == 5) {
                    return zzb;
                }
                return null;
            }
        }
        return (byte) 1;
    }
}
