package f4;

import android.os.Parcel;
import c4.k;
import c5.j;
import d4.q;
import m4.be2;
import m4.cl;
import m4.dl;
import m4.rx;
import m4.v91;
import m4.vj;
import p4.c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k, vj, v91 {

    /* renamed from: s */
    public final /* synthetic */ Object f4524s;

    public /* synthetic */ b(Object obj) {
        this.f4524s = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // c4.k
    public final void a(Object obj, Object obj2) {
        q qVar = (q) this.f4524s;
        j jVar = (j) obj2;
        a aVar = (a) ((e) obj).v();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f16948t);
        int i10 = c.f16949a;
        if (qVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            qVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f16947s.transact(1, obtain, null, 1);
            obtain.recycle();
            jVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        String str = (String) this.f4524s;
        if (clVar.f9884u) {
            clVar.m();
            clVar.f9884u = false;
        }
        dl.A((dl) clVar.f9883t, str);
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((rx) obj).u0(((be2) this.f4524s).f6501v);
    }
}
