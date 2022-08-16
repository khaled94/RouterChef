package m4;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import f3.b;
import f3.e;
import f3.j;
import f3.m;
import f3.n;
import g3.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.g1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class vq {

    /* renamed from: b */
    public final nn f14757b;

    /* renamed from: e */
    public ym f14760e;

    /* renamed from: f */
    public b f14761f;

    /* renamed from: g */
    public e[] f14762g;

    /* renamed from: h */
    public c f14763h;

    /* renamed from: j */
    public n f14765j;

    /* renamed from: k */
    public String f14766k;
    @NotOnlyInitialized

    /* renamed from: l */
    public final ViewGroup f14767l;

    /* renamed from: n */
    public boolean f14769n;

    /* renamed from: o */
    public j f14770o;

    /* renamed from: a */
    public final c10 f14756a = new c10();

    /* renamed from: c */
    public final m f14758c = new m();

    /* renamed from: d */
    public final uq f14759d = new uq(this);

    /* renamed from: i */
    public dp f14764i = null;

    /* renamed from: m */
    public int f14768m = 0;

    public vq(ViewGroup viewGroup, AttributeSet attributeSet) {
        on onVar;
        nn nnVar = nn.f11862a;
        this.f14767l = viewGroup;
        this.f14757b = nnVar;
        boolean z10 = false;
        new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                wn wnVar = new wn(context, attributeSet);
                Object obj = wnVar.f15064s;
                if (((e[]) obj).length == 1) {
                    this.f14762g = (e[]) obj;
                    this.f14766k = (String) wnVar.f15065t;
                    if (!viewGroup.isInEditMode()) {
                        return;
                    }
                    g90 g90Var = io.f9708f.f9709a;
                    e eVar = this.f14762g[0];
                    int i10 = this.f14768m;
                    if (eVar.equals(e.p)) {
                        onVar = on.t();
                    } else {
                        on onVar2 = new on(context, eVar);
                        onVar2.B = i10 == 1 ? true : z10;
                        onVar = onVar2;
                    }
                    Objects.requireNonNull(g90Var);
                    g90.l(viewGroup, onVar, "Ads by Google", -16777216, -1);
                    return;
                }
                throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
            } catch (IllegalArgumentException e10) {
                g90 g90Var2 = io.f9708f.f9709a;
                on onVar3 = new on(context, e.f4492h);
                String message = e10.getMessage();
                String message2 = e10.getMessage();
                Objects.requireNonNull(g90Var2);
                if (message2 != null) {
                    g1.j(message2);
                }
                g90.l(viewGroup, onVar3, message, -65536, -16777216);
            }
        }
    }

    public static on a(Context context, e[] eVarArr, int i10) {
        boolean z10 = false;
        for (e eVar : eVarArr) {
            if (eVar.equals(e.p)) {
                return on.t();
            }
        }
        on onVar = new on(context, eVarArr);
        if (i10 == 1) {
            z10 = true;
        }
        onVar.B = z10;
        return onVar;
    }

    public final e b() {
        on e10;
        try {
            dp dpVar = this.f14764i;
            if (dpVar != null && (e10 = dpVar.e()) != null) {
                return new e(e10.f12224w, e10.f12221t, e10.f12220s);
            }
        } catch (RemoteException e11) {
            g1.l("#007 Could not call remote method.", e11);
        }
        e[] eVarArr = this.f14762g;
        if (eVarArr != null) {
            return eVarArr[0];
        }
        return null;
    }

    public final String c() {
        dp dpVar;
        if (this.f14766k == null && (dpVar = this.f14764i) != null) {
            try {
                this.f14766k = dpVar.x();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        return this.f14766k;
    }

    public final void d(ym ymVar) {
        try {
            this.f14760e = ymVar;
            dp dpVar = this.f14764i;
            if (dpVar == null) {
                return;
            }
            dpVar.K0(ymVar != null ? new zm(ymVar) : null);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void e(e... eVarArr) {
        this.f14762g = eVarArr;
        try {
            dp dpVar = this.f14764i;
            if (dpVar != null) {
                dpVar.D3(a(this.f14767l.getContext(), this.f14762g, this.f14768m));
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
        this.f14767l.requestLayout();
    }

    public final void f(c cVar) {
        try {
            this.f14763h = cVar;
            dp dpVar = this.f14764i;
            if (dpVar == null) {
                return;
            }
            dpVar.n2(cVar != null ? new wh(cVar) : null);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
