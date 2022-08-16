package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.i;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: s */
    public Context f514s;

    /* renamed from: t */
    public Context f515t;

    /* renamed from: u */
    public e f516u;

    /* renamed from: v */
    public LayoutInflater f517v;

    /* renamed from: w */
    public i.a f518w;

    /* renamed from: x */
    public int f519x = R.layout.abc_action_menu_layout;
    public int y = R.layout.abc_action_menu_item_layout;

    /* renamed from: z */
    public j f520z;

    public a(Context context) {
        this.f514s = context;
        this.f517v = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean c(g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void j(i.a aVar) {
        this.f518w = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean k(g gVar) {
        return false;
    }
}
