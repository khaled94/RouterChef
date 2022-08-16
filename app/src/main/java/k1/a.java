package k1;

import android.database.sqlite.SQLiteDatabase;
import java.security.GeneralSecurityException;
import m4.b62;
import m4.c62;
import m4.fa0;
import m4.fd0;
import m4.gg2;
import m4.jd0;
import m4.ko1;
import m4.kq0;
import m4.ld0;
import m4.n82;
import m4.p41;
import m4.qa2;
import m4.s02;
import m4.v61;
import m4.v91;
import m4.x92;
import m4.yp0;

/* loaded from: classes.dex */
public class a implements e, yp0, ko1, v91 {

    /* renamed from: s */
    public final Object f5566s;

    /* renamed from: t */
    public final Object f5567t;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f5566s = obj;
        this.f5567t = obj2;
    }

    public /* synthetic */ a(s02 s02Var, Class cls) {
        if (s02Var.e().contains(cls) || Void.class.equals(cls)) {
            this.f5566s = s02Var;
            this.f5567t = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", s02Var.toString(), cls.getName()));
    }

    public /* synthetic */ a(v61 v61Var, String str) {
        this.f5567t = v61Var;
        this.f5566s = str;
    }

    public final c62 a(n82 n82Var) {
        try {
            qa2 b10 = new p41(((s02) this.f5566s).a()).b(n82Var);
            b62 v10 = c62.v();
            String d5 = ((s02) this.f5566s).d();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            ((c62) v10.f9883t).zze = d5;
            n82 d10 = b10.d();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            ((c62) v10.f9883t).zzf = d10;
            int h10 = ((s02) this.f5566s).h();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            ((c62) v10.f9883t).zzg = h10 - 2;
            return v10.k();
        } catch (x92 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // k1.e
    public final void b(d dVar) {
        double floatValue;
        long longValue;
        int intValue;
        Object[] objArr = (Object[]) this.f5567t;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            if (obj == null) {
                dVar.v(i10);
            } else if (obj instanceof byte[]) {
                dVar.a0(i10, (byte[]) obj);
            } else {
                if (obj instanceof Float) {
                    floatValue = ((Float) obj).floatValue();
                } else if (obj instanceof Double) {
                    floatValue = ((Double) obj).doubleValue();
                } else {
                    if (obj instanceof Long) {
                        longValue = ((Long) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            intValue = ((Integer) obj).intValue();
                        } else if (obj instanceof Short) {
                            intValue = ((Short) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            intValue = ((Byte) obj).byteValue();
                        } else if (obj instanceof String) {
                            dVar.o(i10, (String) obj);
                        } else if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        } else {
                            longValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        longValue = intValue;
                    }
                    dVar.P(i10, longValue);
                }
                dVar.x(i10, floatValue);
            }
        }
    }

    @Override // k1.e
    public final String c() {
        return (String) this.f5566s;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [m4.qa2, java.lang.Object] */
    public final qa2 d(n82 n82Var) {
        try {
            fa0 a10 = ((s02) this.f5566s).a();
            qa2 a11 = a10.a(n82Var);
            a10.e(a11);
            return a10.c(a11);
        } catch (x92 e10) {
            String name = ((Class) ((s02) this.f5566s).a().f8379s).getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    public final Object e(qa2 qa2Var) {
        if (!Void.class.equals((Class) this.f5567t)) {
            ((s02) this.f5566s).f(qa2Var);
            return ((s02) this.f5566s).c(qa2Var, (Class) this.f5567t);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // m4.ko1
    /* renamed from: h */
    public final Object mo30h(Object obj) {
        v61.G((SQLiteDatabase) obj, (String) this.f5566s);
        return null;
    }

    @Override // m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }

    @Override // m4.yp0
    /* renamed from: zza */
    public final kq0 mo28zza() {
        ld0 ld0Var = (ld0) this.f5566s;
        return new fd0(ld0Var.f10725u, ((yp0) this.f5567t).mo28zza(), ld0Var.H, ld0Var.I, ld0Var, new jd0(ld0Var));
    }
}
