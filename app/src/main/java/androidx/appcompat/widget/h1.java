package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import k.a;

/* loaded from: classes.dex */
public final class h1 implements View.OnClickListener {

    /* renamed from: s */
    public final a f868s;

    /* renamed from: t */
    public final /* synthetic */ i1 f869t;

    public h1(i1 i1Var) {
        this.f869t = i1Var;
        this.f868s = new a(i1Var.f888a.getContext(), i1Var.f896i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i1 i1Var = this.f869t;
        Window.Callback callback = i1Var.f899l;
        if (callback == null || !i1Var.f900m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f868s);
    }
}
