package y4;

import android.os.Bundle;
import androidx.activity.result.a;
import d0.b;
import d4.m;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import n9.d;
import n9.g;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: b */
    public static final AtomicReference<String[]> f20589b = new AtomicReference<>();

    /* renamed from: c */
    public static final AtomicReference<String[]> f20590c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f20591d = new AtomicReference<>();

    /* renamed from: a */
    public final m3 f20592a;

    public n1(m3 m3Var) {
        this.f20592a = m3Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Objects.requireNonNull(atomicReference, "null reference");
        m.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (h6.Z(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder c10 = a.c("[");
        for (Object obj : objArr) {
            String b10 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b10 != null) {
                if (c10.length() != 1) {
                    c10.append(", ");
                }
                c10.append(b10);
            }
        }
        c10.append("]");
        return c10.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f20592a.a()) {
            return bundle.toString();
        }
        StringBuilder c10 = a.c("Bundle[{");
        for (String str : bundle.keySet()) {
            if (c10.length() != 8) {
                c10.append(", ");
            }
            c10.append(e(str));
            c10.append("=");
            Object obj = bundle.get(str);
            c10.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        c10.append("}]");
        return c10.toString();
    }

    public final String c(p pVar) {
        if (!this.f20592a.a()) {
            return pVar.toString();
        }
        StringBuilder c10 = a.c("origin=");
        c10.append(pVar.f20636u);
        c10.append(",name=");
        c10.append(d(pVar.f20634s));
        c10.append(",params=");
        n nVar = pVar.f20635t;
        c10.append(nVar == null ? null : !this.f20592a.a() ? nVar.toString() : b(nVar.s()));
        return c10.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20592a.a() ? str : g(str, d.y, d.f16689w, f20589b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20592a.a() ? str : g(str, b.I, b.H, f20590c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f20592a.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return e0.d.a("experiment_id(", str, ")");
        }
        return g(str, g.f16700v, g.f16699u, f20591d);
    }
}
