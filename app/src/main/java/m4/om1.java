package m4;

import android.os.IBinder;
import android.os.IInterface;
import h3.a;
import h3.d;
import h3.f;
import java.util.ArrayList;
import n3.s1;

/* loaded from: classes.dex */
public final class om1 {

    /* renamed from: a */
    public final or f12200a;

    /* renamed from: b */
    public final az f12201b;

    /* renamed from: c */
    public final lc1 f12202c;

    /* renamed from: d */
    public final jn f12203d;

    /* renamed from: e */
    public final on f12204e;

    /* renamed from: f */
    public final String f12205f;

    /* renamed from: g */
    public final ArrayList<String> f12206g;

    /* renamed from: h */
    public final ArrayList<String> f12207h;

    /* renamed from: i */
    public final lu f12208i;

    /* renamed from: j */
    public final un f12209j;

    /* renamed from: k */
    public final int f12210k;

    /* renamed from: l */
    public final a f12211l;

    /* renamed from: m */
    public final f f12212m;

    /* renamed from: n */
    public final ip f12213n;

    /* renamed from: o */
    public final qe1 f12214o;
    public final boolean p;

    /* renamed from: q */
    public final mp f12215q;

    public om1(nm1 nm1Var) {
        this.f12204e = nm1Var.f11840b;
        this.f12205f = nm1Var.f11841c;
        this.f12215q = nm1Var.f11855r;
        jn jnVar = nm1Var.f11839a;
        this.f12203d = new jn(jnVar.f10128s, jnVar.f10129t, jnVar.f10130u, jnVar.f10131v, jnVar.f10132w, jnVar.f10133x, jnVar.y, jnVar.f10134z || nm1Var.f11843e, jnVar.A, jnVar.B, jnVar.C, jnVar.D, jnVar.E, jnVar.F, jnVar.G, jnVar.H, jnVar.I, jnVar.J, jnVar.K, jnVar.L, jnVar.M, jnVar.N, s1.w(jnVar.O), nm1Var.f11839a.P);
        or orVar = nm1Var.f11842d;
        lu luVar = null;
        if (orVar == null) {
            lu luVar2 = nm1Var.f11846h;
            orVar = luVar2 != null ? luVar2.f10998x : null;
        }
        this.f12200a = orVar;
        ArrayList<String> arrayList = nm1Var.f11844f;
        this.f12206g = arrayList;
        this.f12207h = nm1Var.f11845g;
        if (arrayList != null && (luVar = nm1Var.f11846h) == null) {
            luVar = new lu(new d(new d.a()));
        }
        this.f12208i = luVar;
        this.f12209j = nm1Var.f11847i;
        this.f12210k = nm1Var.f11851m;
        this.f12211l = nm1Var.f11848j;
        this.f12212m = nm1Var.f11849k;
        this.f12213n = nm1Var.f11850l;
        this.f12201b = nm1Var.f11852n;
        this.f12214o = new qe1(nm1Var.f11853o);
        this.p = nm1Var.p;
        this.f12202c = nm1Var.f11854q;
    }

    public final zv a() {
        f fVar = this.f12212m;
        if (fVar == null && this.f12211l == null) {
            return null;
        }
        if (fVar != null) {
            IBinder iBinder = fVar.f5070u;
            if (iBinder == null) {
                return null;
            }
            int i10 = yv.f15910s;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
            return queryLocalInterface instanceof zv ? (zv) queryLocalInterface : new xv(iBinder);
        }
        IBinder iBinder2 = this.f12211l.f5053t;
        if (iBinder2 == null) {
            return null;
        }
        int i11 = yv.f15910s;
        IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface2 instanceof zv ? (zv) queryLocalInterface2 : new xv(iBinder2);
    }
}
