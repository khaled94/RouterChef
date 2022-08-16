package m4;

/* loaded from: classes.dex */
public final class vm extends m92<vm, um> implements ra2 {
    private static final vm zzb;
    private int zze;
    private int zzf = 1000;
    private om zzg;

    static {
        vm vmVar = new vm();
        zzb = vmVar;
        m92.n(vm.class, vmVar);
    }

    @Override // m4.m92
    public final Object u(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                return new ab2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", bl.f6562a, "zzg"});
            }
            if (i11 == 3) {
                return new vm();
            }
            if (i11 == 4) {
                return new um();
            }
            if (i11 == 5) {
                return zzb;
            }
            return null;
        }
        return (byte) 1;
    }
}
