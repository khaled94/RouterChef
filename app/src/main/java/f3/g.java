package f3;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import g3.c;
import java.util.Objects;
import k4.a;
import k4.b;
import m4.ao;
import m4.co;
import m4.dp;
import m4.en;
import m4.io;
import m4.ir;
import m4.on;
import m4.or;
import m4.tq;
import m4.uq;
import m4.vq;
import m4.wh;
import m4.ym;
import m4.zm;
import n3.g1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public abstract class g extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: s */
    public final vq f4510s;

    public g(@RecentlyNonNull Context context) {
        super(context);
        this.f4510s = new vq(this, null);
    }

    public final void a(@RecentlyNonNull d dVar) {
        dp dpVar;
        vq vqVar = this.f4510s;
        tq tqVar = dVar.f4490a;
        Objects.requireNonNull(vqVar);
        try {
            if (vqVar.f14764i == null) {
                if (vqVar.f14762g == null || vqVar.f14766k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = vqVar.f14767l.getContext();
                on a10 = vq.a(context, vqVar.f14762g, vqVar.f14768m);
                if ("search_v2".equals(a10.f12220s)) {
                    dpVar = new co(io.f9708f.f9710b, context, a10, vqVar.f14766k).d(context, false);
                } else {
                    dpVar = new ao(io.f9708f.f9710b, context, a10, vqVar.f14766k, vqVar.f14756a).d(context, false);
                }
                dp dpVar2 = dpVar;
                vqVar.f14764i = dpVar2;
                dpVar2.Y0(new en(vqVar.f14759d));
                ym ymVar = vqVar.f14760e;
                if (ymVar != null) {
                    vqVar.f14764i.K0(new zm(ymVar));
                }
                c cVar = vqVar.f14763h;
                if (cVar != null) {
                    vqVar.f14764i.n2(new wh(cVar));
                }
                n nVar = vqVar.f14765j;
                if (nVar != null) {
                    vqVar.f14764i.L2(new or(nVar));
                }
                vqVar.f14764i.G2(new ir(vqVar.f14770o));
                vqVar.f14764i.z3(vqVar.f14769n);
                dp dpVar3 = vqVar.f14764i;
                if (dpVar3 != null) {
                    try {
                        a j3 = dpVar3.j();
                        if (j3 != null) {
                            vqVar.f14767l.addView((View) b.e0(j3));
                        }
                    } catch (RemoteException e10) {
                        g1.l("#007 Could not call remote method.", e10);
                    }
                }
            }
            dp dpVar4 = vqVar.f14764i;
            Objects.requireNonNull(dpVar4);
            if (!dpVar4.F1(vqVar.f14757b.a(vqVar.f14767l.getContext(), tqVar))) {
                return;
            }
            vqVar.f14756a.f6680s = tqVar.f14148g;
        } catch (RemoteException e11) {
            g1.l("#007 Could not call remote method.", e11);
        }
    }

    @RecentlyNonNull
    public b getAdListener() {
        return this.f4510s.f14761f;
    }

    @RecentlyNullable
    public e getAdSize() {
        return this.f4510s.b();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f4510s.c();
    }

    @RecentlyNullable
    public j getOnPaidEventListener() {
        return this.f4510s.f14770o;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RecentlyNullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f3.l getResponseInfo() {
        /*
            r3 = this;
            m4.vq r0 = r3.f4510s
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            m4.dp r0 = r0.f14764i     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto L15
            m4.iq r0 = r0.n()     // Catch: android.os.RemoteException -> Lf
            goto L16
        Lf:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            n3.g1.l(r2, r0)
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L1d
            f3.l r1 = new f3.l
            r1.<init>(r0)
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.g.getResponseInfo():f3.l");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        e eVar;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                eVar = getAdSize();
            } catch (NullPointerException e10) {
                g1.h("Unable to retrieve ad size.", e10);
                eVar = null;
            }
            if (eVar != null) {
                Context context = getContext();
                int b10 = eVar.b(context);
                i12 = eVar.a(context);
                i13 = b10;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(@RecentlyNonNull b bVar) {
        vq vqVar = this.f4510s;
        vqVar.f14761f = bVar;
        uq uqVar = vqVar.f14759d;
        synchronized (uqVar.f14472a) {
            uqVar.f14473b = bVar;
        }
        if (bVar == null) {
            this.f4510s.d(null);
            return;
        }
        if (bVar instanceof ym) {
            this.f4510s.d((ym) bVar);
        }
        if (!(bVar instanceof c)) {
            return;
        }
        this.f4510s.f((c) bVar);
    }

    public void setAdSize(@RecentlyNonNull e eVar) {
        vq vqVar = this.f4510s;
        e[] eVarArr = {eVar};
        if (vqVar.f14762g == null) {
            vqVar.e(eVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        vq vqVar = this.f4510s;
        if (vqVar.f14766k == null) {
            vqVar.f14766k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public void setOnPaidEventListener(j jVar) {
        vq vqVar = this.f4510s;
        Objects.requireNonNull(vqVar);
        try {
            vqVar.f14770o = jVar;
            dp dpVar = vqVar.f14764i;
            if (dpVar == null) {
                return;
            }
            dpVar.G2(new ir(jVar));
        } catch (RemoteException e10) {
            g1.l("#008 Must be called on the main UI thread.", e10);
        }
    }

    public g(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4510s = new vq(this, attributeSet);
    }
}
