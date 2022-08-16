package p1;

import android.view.View;
import android.view.ViewGroup;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public final class a0 extends l {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f16864a;

    /* renamed from: b */
    public final /* synthetic */ View f16865b;

    /* renamed from: c */
    public final /* synthetic */ View f16866c;

    /* renamed from: d */
    public final /* synthetic */ b0 f16867d;

    public a0(b0 b0Var, ViewGroup viewGroup, View view, View view2) {
        this.f16867d = b0Var;
        this.f16864a = viewGroup;
        this.f16865b = view;
        this.f16866c = view2;
    }

    @Override // p1.i.d
    public final void a(i iVar) {
        this.f16866c.setTag(R.id.save_overlay_view, null);
        this.f16864a.getOverlay().remove(this.f16865b);
        iVar.w(this);
    }

    @Override // p1.l, p1.i.d
    public final void b() {
        this.f16864a.getOverlay().remove(this.f16865b);
    }

    @Override // p1.l, p1.i.d
    public final void c() {
        if (this.f16865b.getParent() == null) {
            this.f16864a.getOverlay().add(this.f16865b);
        } else {
            this.f16867d.cancel();
        }
    }
}
