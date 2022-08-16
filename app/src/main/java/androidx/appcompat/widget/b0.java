package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.c0;
import k.f;

/* loaded from: classes.dex */
public final class b0 extends p0 {
    public final /* synthetic */ c0.d B;
    public final /* synthetic */ c0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, View view, c0.d dVar) {
        super(view);
        this.C = c0Var;
        this.B = dVar;
    }

    @Override // androidx.appcompat.widget.p0
    public final f b() {
        return this.B;
    }

    @Override // androidx.appcompat.widget.p0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        if (!this.C.getInternalPopup().b()) {
            this.C.b();
            return true;
        }
        return true;
    }
}
