package o4;

import a4.d;
import a4.f;
import android.content.Context;
import android.os.Parcel;
import b4.a;
import b4.c;
import c4.k;
import c4.l;
import c5.i;
import c5.j;
import com.google.android.gms.common.api.Status;
import v3.b;

/* loaded from: classes.dex */
public final class l extends c<a.c.C0034c> {

    /* renamed from: k */
    public static final a.AbstractC0032a<c, a.c.C0034c> f16770k;

    /* renamed from: l */
    public static final a<a.c.C0034c> f16771l;

    /* renamed from: i */
    public final Context f16772i;

    /* renamed from: j */
    public final f f16773j;

    static {
        a.f fVar = new a.f();
        j jVar = new j();
        f16770k = jVar;
        f16771l = new a<>("AppSet.API", jVar, fVar);
    }

    public l(Context context, f fVar) {
        super(context, f16771l, a.c.f2559a, c.a.f2569b);
        this.f16772i = context;
        this.f16773j = fVar;
    }

    public final i<v3.a> c() {
        if (this.f16773j.c(this.f16772i, 212800000) == 0) {
            l.a aVar = new l.a();
            aVar.f2714c = new d[]{v3.f.f19789a};
            aVar.f2712a = new k() { // from class: o4.i
                @Override // c4.k
                public final void a(Object obj, Object obj2) {
                    e eVar = (e) ((c) obj).v();
                    b bVar = new b(null, null);
                    k kVar = new k((j) obj2);
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(eVar.f16760t);
                    int i10 = b.f16758a;
                    obtain.writeInt(1);
                    bVar.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(kVar);
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        eVar.f16759s.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                    } finally {
                        obtain.recycle();
                        obtain2.recycle();
                    }
                }
            };
            aVar.f2713b = false;
            aVar.f2715d = 27601;
            return b(0, aVar.a());
        }
        return c5.l.d(new b4.b(new Status(17, null)));
    }
}
