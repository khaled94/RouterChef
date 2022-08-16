package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
public final class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: s */
    public e f574s;

    /* renamed from: t */
    public d f575t;

    /* renamed from: u */
    public c f576u;

    public f(e eVar) {
        this.f574s = eVar;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public final void a(e eVar, boolean z10) {
        d dVar;
        if ((z10 || eVar == this.f574s) && (dVar = this.f575t) != null) {
            dVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public final boolean b(e eVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f574s.s(((c.a) this.f576u.b()).getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f576u;
        e eVar = this.f574s;
        i.a aVar = cVar.f541w;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f575t.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f575t.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f574s.d(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f574s.performShortcut(i10, keyEvent, 0);
    }
}
