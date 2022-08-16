package n0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: s */
    public final int f16396s;

    /* renamed from: t */
    public final f f16397t;

    /* renamed from: u */
    public final int f16398u;

    public a(int i10, f fVar, int i11) {
        this.f16396s = i10;
        this.f16397t = fVar;
        this.f16398u = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f16396s);
        f fVar = this.f16397t;
        fVar.f16401a.performAction(this.f16398u, bundle);
    }
}
