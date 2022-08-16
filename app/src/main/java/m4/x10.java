package m4;

import android.os.RemoteException;
import c1.e;
import da.f;
import e8.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import n3.g1;
import p3.d;
import r9.i0;
import r9.x;
import x7.h;
import x7.m;
import x7.w;

/* loaded from: classes.dex */
public final class x10 implements d, kz1, v91, f {

    /* renamed from: s */
    public final Object f15176s;

    /* renamed from: t */
    public final Object f15177t;

    public /* synthetic */ x10(Object obj, Object obj2) {
        this.f15177t = obj;
        this.f15176s = obj2;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void r42 = (Void) obj;
        synchronized (((xn1) this.f15177t)) {
            try {
                Object obj2 = this.f15177t;
                ((xn1) obj2).f15423d = null;
                ((xn1) obj2).f15422c.addFirst((wn1) this.f15176s);
                Object obj3 = this.f15177t;
                if (((xn1) obj3).f15424e == 1) {
                    ((xn1) obj3).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // da.f
    public final Object b(Object obj) {
        i0 i0Var = (i0) obj;
        h hVar = (h) this.f15176s;
        i0.a aVar = i0Var.f17400s;
        if (aVar == null) {
            ca.h j3 = i0Var.j();
            x c10 = i0Var.c();
            Charset charset = StandardCharsets.UTF_8;
            if (c10 != null) {
                try {
                    String str = c10.f17496c;
                    if (str != null) {
                        charset = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            aVar = new i0.a(j3, charset);
            i0Var.f17400s = aVar;
        }
        Objects.requireNonNull(hVar);
        a aVar2 = new a(aVar);
        aVar2.f4435t = false;
        try {
            Object a10 = ((w) this.f15177t).a(aVar2);
            if (aVar2.x0() == 10) {
                return a10;
            }
            throw new m("JSON document was not fully consumed.");
        } finally {
            i0Var.close();
        }
    }

    @Override // p3.d
    public final void e(f3.a aVar) {
        try {
            String canonicalName = ((a20) this.f15177t).f6021s.getClass().getCanonicalName();
            int i10 = aVar.f4481a;
            String str = aVar.f4482b;
            String str2 = aVar.f4483c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(str).length() + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(i10);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            g1.e(sb.toString());
            ((l10) this.f15176s).w3(aVar.a());
            ((l10) this.f15176s).g1(aVar.f4481a, aVar.f4482b);
            ((l10) this.f15176s).A(aVar.f4481a);
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        synchronized (((xn1) this.f15177t)) {
            ((xn1) this.f15177t).f15423d = null;
        }
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }

    public /* synthetic */ x10(Object obj, Object obj2, e eVar) {
        this.f15176s = obj;
        this.f15177t = obj2;
    }
}
