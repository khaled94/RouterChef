package y4;

import android.text.TextUtils;
import android.util.Log;
import d4.m;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class s1 extends j3 {

    /* renamed from: w */
    public String f20709w;

    /* renamed from: u */
    public char f20707u = 0;

    /* renamed from: v */
    public long f20708v = -1;

    /* renamed from: x */
    public final q1 f20710x = new q1(this, 6, false, false);
    public final q1 y = new q1(this, 6, true, false);

    /* renamed from: z */
    public final q1 f20711z = new q1(this, 6, false, true);
    public final q1 A = new q1(this, 5, false, false);
    public final q1 B = new q1(this, 5, true, false);
    public final q1 C = new q1(this, 5, false, true);
    public final q1 D = new q1(this, 4, false, false);
    public final q1 E = new q1(this, 3, false, false);
    public final q1 F = new q1(this, 2, false, false);

    public s1(w2 w2Var) {
        super(w2Var);
    }

    public static Object s(String str) {
        if (str == null) {
            return null;
        }
        return new r1(str);
    }

    public static String t(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String u10 = u(z10, obj);
        String u11 = u(z10, obj2);
        String u12 = u(z10, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(u10)) {
            sb.append(str2);
            sb.append(u10);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(u11)) {
            sb.append(str2);
            sb.append(u11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(u12)) {
            sb.append(str3);
            sb.append(u12);
        }
        return sb.toString();
    }

    public static String u(boolean z10, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                if (obj instanceof r1) {
                    return ((r1) obj).f20687a;
                }
                return z10 ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
            String x10 = x(w2.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && x(className).equals(x10)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb2.toString();
        }
    }

    public static String x(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    @Override // y4.j3
    public final boolean i() {
        return false;
    }

    public final q1 n() {
        return this.E;
    }

    public final q1 o() {
        return this.f20710x;
    }

    public final q1 p() {
        return this.F;
    }

    public final q1 q() {
        return this.A;
    }

    public final q1 r() {
        return this.C;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String v() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f20709w == null) {
                k3 k3Var = this.f20505s;
                if (((w2) k3Var).f20789v != null) {
                    str2 = ((w2) k3Var).f20789v;
                } else {
                    Objects.requireNonNull((w2) ((w2) k3Var).y.f20505s);
                    str2 = "FA";
                }
                this.f20709w = str2;
            }
            m.h(this.f20709w);
            str = this.f20709w;
        }
        return str;
    }

    public final void w(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String v10;
        String str2;
        if (!z10 && Log.isLoggable(v(), i10)) {
            Log.println(i10, v(), t(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Objects.requireNonNull(str, "null reference");
        u2 u2Var = ((w2) this.f20505s).B;
        if (u2Var == null) {
            v10 = v();
            str2 = "Scheduler not set. Not logging error/warn";
        } else if (u2Var.m()) {
            if (i10 >= 9) {
                i10 = 8;
            }
            u2Var.q(new p1(this, i10, str, obj, obj2, obj3));
            return;
        } else {
            v10 = v();
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        Log.println(6, v10, str2);
    }
}
