package m4;

import android.content.Context;
import h3.a;
import h3.f;
import java.util.ArrayList;
import java.util.Objects;
import r.g;

/* loaded from: classes.dex */
public final class fc1 extends yo {

    /* renamed from: s */
    public final Context f8398s;

    /* renamed from: t */
    public final if0 f8399t;

    /* renamed from: u */
    public final nm1 f8400u;

    /* renamed from: v */
    public final kv0 f8401v = new kv0();

    /* renamed from: w */
    public po f8402w;

    public fc1(if0 if0Var, Context context, String str) {
        nm1 nm1Var = new nm1();
        this.f8400u = nm1Var;
        this.f8399t = if0Var;
        nm1Var.f11841c = str;
        this.f8398s = context;
    }

    @Override // m4.zo
    public final void D2(a aVar) {
        nm1 nm1Var = this.f8400u;
        nm1Var.f11848j = aVar;
        if (aVar != null) {
            nm1Var.f11843e = aVar.f5052s;
        }
    }

    @Override // m4.zo
    public final void K2(iv ivVar) {
        this.f8401v.f10582b = ivVar;
    }

    @Override // m4.zo
    public final void R0(hz hzVar) {
        this.f8401v.f10585e = hzVar;
    }

    @Override // m4.zo
    public final void Z0(f fVar) {
        nm1 nm1Var = this.f8400u;
        nm1Var.f11849k = fVar;
        if (fVar != null) {
            nm1Var.f11843e = fVar.f5068s;
            nm1Var.f11850l = fVar.f5069t;
        }
    }

    @Override // m4.zo
    public final wo b() {
        kv0 kv0Var = this.f8401v;
        Objects.requireNonNull(kv0Var);
        lv0 lv0Var = new lv0(kv0Var);
        nm1 nm1Var = this.f8400u;
        ArrayList<String> arrayList = new ArrayList<>();
        if (lv0Var.f11032c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (lv0Var.f11030a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (lv0Var.f11031b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (lv0Var.f11035f.f17201u > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (lv0Var.f11034e != null) {
            arrayList.add(Integer.toString(7));
        }
        nm1Var.f11844f = arrayList;
        nm1 nm1Var2 = this.f8400u;
        ArrayList<String> arrayList2 = new ArrayList<>(lv0Var.f11035f.f17201u);
        int i10 = 0;
        while (true) {
            g<String, qv> gVar = lv0Var.f11035f;
            if (i10 >= gVar.f17201u) {
                break;
            }
            arrayList2.add(gVar.h(i10));
            i10++;
        }
        nm1Var2.f11845g = arrayList2;
        nm1 nm1Var3 = this.f8400u;
        if (nm1Var3.f11840b == null) {
            nm1Var3.f11840b = on.s();
        }
        return new gc1(this.f8398s, this.f8399t, this.f8400u, lv0Var, this.f8402w);
    }

    @Override // m4.zo
    public final void b3(az azVar) {
        nm1 nm1Var = this.f8400u;
        nm1Var.f11852n = azVar;
        nm1Var.f11842d = new or(false, true, false);
    }

    @Override // m4.zo
    public final void i2(tv tvVar, on onVar) {
        this.f8401v.f10584d = tvVar;
        this.f8400u.f11840b = onVar;
    }

    @Override // m4.zo
    public final void m1(mp mpVar) {
        this.f8400u.f11855r = mpVar;
    }

    @Override // m4.zo
    public final void n1(String str, qv qvVar, nv nvVar) {
        kv0 kv0Var = this.f8401v;
        kv0Var.f10586f.put(str, qvVar);
        if (nvVar != null) {
            kv0Var.f10587g.put(str, nvVar);
        }
    }

    @Override // m4.zo
    public final void o1(kv kvVar) {
        this.f8401v.f10581a = kvVar;
    }

    @Override // m4.zo
    public final void p1(po poVar) {
        this.f8402w = poVar;
    }

    @Override // m4.zo
    public final void s1(wv wvVar) {
        this.f8401v.f10583c = wvVar;
    }

    @Override // m4.zo
    public final void u3(lu luVar) {
        this.f8400u.f11846h = luVar;
    }
}
