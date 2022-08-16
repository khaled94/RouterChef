package h5;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ ActionMenuView f5092s;

    /* renamed from: t */
    public final /* synthetic */ int f5093t;

    /* renamed from: u */
    public final /* synthetic */ boolean f5094u;

    /* renamed from: v */
    public final /* synthetic */ BottomAppBar f5095v;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f5095v = bottomAppBar;
        this.f5092s = actionMenuView;
        this.f5093t = i10;
        this.f5094u = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionMenuView actionMenuView = this.f5092s;
        actionMenuView.setTranslationX(this.f5095v.A(actionMenuView, this.f5093t, this.f5094u));
    }
}
