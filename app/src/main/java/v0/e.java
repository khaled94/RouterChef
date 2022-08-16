package v0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f19757a;

    /* renamed from: b */
    public final a f19758b;

    /* loaded from: classes.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f19757a = keyListener;
        this.f19758b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f19757a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f19757a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        Objects.requireNonNull(this.f19758b);
        Object obj = d.f1289i;
        if (i10 != 67) {
            z10 = i10 != 112 ? false : h.a(editable, keyEvent, true);
        } else {
            z10 = h.a(editable, keyEvent, false);
        }
        if (z10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11 || this.f19757a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f19757a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f19757a.onKeyUp(view, editable, i10, keyEvent);
    }
}
